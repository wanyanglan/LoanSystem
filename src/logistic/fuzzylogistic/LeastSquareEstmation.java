package logistic.fuzzylogistic;
import org.ujmp.core.DenseMatrix;
import org.ujmp.core.Matrix;

import logistic.dataprocess.ReadDataSet;

import java.io.IOException;

public class LeastSquareEstmation {

    /**
     * 训练数据集
     */
    private Matrix leftX;
    private Matrix middleX;
    private Matrix rightX;

    /**
     * 标签集合
     */
    private Matrix leftY;
    private Matrix middleY;
    private Matrix rightY;


    /**
     * 待估计的参数
     */
    private Matrix theta;

    private ReadDataSet readDataSet = new ReadDataSet();

    public Matrix getLeftX() {
        return leftX;
    }

    public void setLeftX(Matrix leftX) {
        this.leftX = leftX;
    }

    public Matrix getMiddleX() {
        return middleX;
    }

    public void setMiddleX(Matrix middleX) {
        this.middleX = middleX;
    }

    public Matrix getRightX() {
        return rightX;
    }

    public void setRightX(Matrix rightX) {
        this.rightX = rightX;
    }

    public Matrix getLeftY() {
        return leftY;
    }

    public void setLeftY(Matrix leftY) {
        this.leftY = leftY;
    }

    public Matrix getMiddleY() {
        return middleY;
    }

    public void setMiddleY(Matrix middleY) {
        this.middleY = middleY;
    }

    public Matrix getRightY() {
        return rightY;
    }

    public void setRightY(Matrix rightY) {
        this.rightY = rightY;
    }

    public Matrix getTheta() {
        return theta;
    }

    public void setTheta(Matrix theta) {
        this.theta = theta;
    }

    public ReadDataSet getReadDataSet() {
        return readDataSet;
    }

    public void setReadDataSet(ReadDataSet readDataSet) {
        this.readDataSet = readDataSet;
    }

    //训练数据集
    public LeastSquareEstmation(String dataPath,int labelPos) throws IOException {
        //加载数据集
        readDataSet.loadDataFromTxt(dataPath,"\\s+",labelPos);

        //将数据集转换成矩阵(几行几列的矩阵)
        this.leftX = DenseMatrix.Factory.zeros(readDataSet.getLeftSize(),readDataSet.getDatasLeft().get(0).size()+1);
        this.leftY = DenseMatrix.Factory.zeros(readDataSet.getLeftSize(),1);

        this.middleX = DenseMatrix.Factory.zeros(readDataSet.getMiddleSize(),readDataSet.getDatasMiddle().get(0).size()+1);
        this.middleY = DenseMatrix.Factory.zeros(readDataSet.getMiddleSize(),1);

        this.rightX = DenseMatrix.Factory.zeros(readDataSet.getRightSize(),readDataSet.getDatasRight().get(0).size()+1);
        this.rightY = DenseMatrix.Factory.zeros(readDataSet.getRightSize(),1);

        theta = DenseMatrix.Factory.zeros(readDataSet.getDatasLeft().get(0).size()+1,1);

        //给下限的X矩阵、下限的Y矩阵赋值
        for (int i = 0; i < readDataSet.getLeftSize(); i++) {
            //第一个参数是值，第二个参数是行，第三个参数是列
            this.leftX.setAsDouble(1,i,0);
            for (int j = 0; j < readDataSet.getDatasLeft().get(i).size(); j++) {
                this.leftX.setAsDouble(readDataSet.getDatasLeft().get(i).get(j),i,j+1);
            }
            this.leftY.setAsDouble(readDataSet.getLabelsLeft().get(i),i,0);
        }

        //给中间的X矩阵、中间的Y矩阵赋值
        for (int i = 0; i < readDataSet.getMiddleSize(); i++) {
            //第一个参数是值，第二个参数是行，第三个参数是列
            this.middleX.setAsDouble(1,i,0);
            for (int j = 0; j < readDataSet.getDatasMiddle().get(i).size(); j++) {
                this.middleX.setAsDouble(readDataSet.getDatasMiddle().get(i).get(j),i,j+1);
            }
            this.middleY.setAsDouble(readDataSet.getLabelsMiddle().get(i),i,0);
        }

        //给上限的X矩阵、中间的Y矩阵赋值
        for (int i = 0; i < readDataSet.getRightSize(); i++) {
            //第一个参数是值，第二个参数是行，第三个参数是列
            this.rightX.setAsDouble(1,i,0);
            for (int j = 0; j < readDataSet.getDatasRight().get(i).size(); j++) {
                this.rightX.setAsDouble(readDataSet.getDatasRight().get(i).get(j),i,j+1);
            }
            this.rightY.setAsDouble(readDataSet.getLabelsRight().get(i),i,0);
        }

        //处理模糊后的Y值，即对数转化（ln(y/(1-y))）
        processOriginalLeftLabel();
        processOriginalMiddleLabel();
        processOriginalRightLabel();


    }


    /**
     * 计算估计的参数(Xt*X*(Xt*Y))
     * @return
     */
    public Matrix calculateTheta(){

        Matrix X = leftX.transpose().mtimes(leftX).plus(middleX.transpose().mtimes(middleX)).plus(rightX.transpose().mtimes(rightX));

        Matrix Y = leftX.transpose().mtimes(leftY).plus(middleX.transpose().mtimes(middleY)).plus(rightX.transpose().mtimes(rightY));

        Matrix Y1 = leftX.transpose().mtimes(leftY);
        Matrix Y2 = middleX.transpose().mtimes(middleY);
        Matrix Y3 = rightX.transpose().mtimes(rightY);

//        System.out.println(Y1.transpose());
//        System.out.println(middleX +"" + middleY.transpose()+"" + Y2.transpose());
//        System.out.println(rightX +"" + rightY.transpose()+"" + Y3.transpose());

        this.theta = X.inv().mtimes(Y);

        //将估计的参数设置进参数函数中
        setTheta(this.theta);

        return this.getTheta();
    }

    /**
     * 将模糊化处理的原始标签，转换为可能性优势（ln(Math.PI/1-Math.PI)）
     * @return
     */
    public void processOriginalLeftLabel(){

        Matrix tempLeftY = DenseMatrix.Factory.zeros(this.leftY.getRowCount(),1);

        for (int i = 0; i < this.leftY.getRowCount(); i++) {
            double var = this.leftY.getAsDouble(i,0);
            tempLeftY.setAsDouble(Math.log(var/(1-var)),i,0);
        }
        setLeftY(tempLeftY);

    }

    public void processOriginalMiddleLabel(){

        Matrix tempMiddleY = DenseMatrix.Factory.zeros(this.middleY.getRowCount(),1);
        for (int i = 0; i < this.middleY.getRowCount(); i++) {
            double var = this.middleY.getAsDouble(i,0);
            tempMiddleY.setAsDouble(Math.log(var/(1-var)),i,0);
        }

        setMiddleY(tempMiddleY);

    }

    public void processOriginalRightLabel(){

        Matrix tempRightY = DenseMatrix.Factory.zeros(this.rightY.getRowCount(),1);
        for (int i = 0; i < this.rightY.getRowCount(); i++) {
            double var = this.rightY.getAsDouble(i,0);
            tempRightY.setAsDouble(Math.log(var/(1-var)),i,0);
        }

        setRightY(tempRightY);

    }



    //测试结果
    public static void main(String[] args) throws IOException {
        String dataPath = "/microcredit/src/dataSet/test/aaa.txt";
        LeastSquareEstmation leastSquareEstmation = new LeastSquareEstmation(dataPath,6);
        System.out.println(leastSquareEstmation.calculateTheta());

        System.out.println("模糊的左边值矩阵");
        System.out.println(leastSquareEstmation.getLeftX());
        System.out.println("模糊的中间值矩阵");
        System.out.println(leastSquareEstmation.getMiddleX());
        System.out.println("模糊的右边值矩阵");
        System.out.println(leastSquareEstmation.getRightX());

        System.out.println("处理后的模糊Y值");
        System.out.println(leastSquareEstmation.getLeftY().transpose() + "" +leastSquareEstmation.getMiddleY().transpose()+"" + leastSquareEstmation.getRightY().transpose());

        System.out.println(leastSquareEstmation.calculateTheta());

    }


}
