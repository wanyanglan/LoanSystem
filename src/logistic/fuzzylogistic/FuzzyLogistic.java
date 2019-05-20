package logistic.fuzzylogistic;

import org.ujmp.core.DenseMatrix;
import org.ujmp.core.Matrix;
import org.ujmp.core.calculation.Calculation;

import logistic.dataprocess.ReadDataSet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class FuzzyLogistic {

    /**
     * 测试数据集
     */
    private Matrix leftX;
    private Matrix middleX;
    private Matrix rightX;

    /**
     * 测试的标签集合
     */
    private Matrix leftY;
    private Matrix middleY;
    private Matrix rightY;

    /**
     * 待训练的参数
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

    /**
     * 数据预处理，构建X矩阵和标签矩阵

     */

    public FuzzyLogistic(){

    }

    //数据处理，包括响应矩阵的构建
    public void processDataSet(String dataPath,int labelPos) throws IOException{
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

    }

    //处理预测后的模糊Y的值(E(y)/(1+E(y)))
    public double processPredictAfterResult(double thetaSum){

        return Math.pow(Math.E,thetaSum)/(1+Math.pow(Math.E,thetaSum));

    }

    /**
     * 模糊logistic的损失函数
     * @param rowVector  当前样例数据，是一个行向量
     * @return
     */
    private double fuzzySigmod(Matrix rowVector, Matrix estimatePara){
        double predictResult = 0.0;

        //预测的Y值，计算Y=aX0+a1X1+a2X2....的结果
        double thetaSum = estimatePara.transpose().mtimes(rowVector.transpose()).getValueSum();
        //将预测的模糊值转变为（0到1之间的值，便于判断）
        predictResult = processPredictAfterResult(thetaSum);

        return predictResult;
    }

    /**
     * 将预测结果和原始结果封装共同返回
     * @param estimatePara    估计的参数值
     * @return
     */
    public List<List<List<Double>>> predictResult(Matrix estimatePara){

        /*处理左边的预测值*/
        List<Double> listLeftPredictResult = new ArrayList<>();
        List<Double> listLeftOriginalResult = new ArrayList<>();
        //getRowCount()获取行的数量(处理下限的X矩阵)
        for (int i = 0; i < leftX.getRowCount(); i++) {

            //选取特定行与列
            Matrix rowVector = leftX.selectRows(Calculation.Ret.NEW,i);
            //System.out.println("左边的每行"+rowVector);
            Double predictResult = fuzzySigmod(rowVector,estimatePara);
            Double label = leftY.getAsDouble(i,0);

            listLeftPredictResult.add(predictResult);
            listLeftOriginalResult.add(label);

        }

        /*处理中间的预测值和实际值*/

        List<Double> listMiddlePredictResult = new ArrayList<>();
        List<Double> listMiddleOriginalResult = new ArrayList<>();

        for (int i = 0; i < middleX.getRowCount(); i++) {

            //选取特定行与列
            Matrix rowVector1 = middleX.selectRows(Calculation.Ret.NEW,i);
            double predictResult1 = fuzzySigmod(rowVector1,estimatePara);
            double label1 = middleY.getAsDouble(i,0);

            listMiddlePredictResult.add(predictResult1);
            listMiddleOriginalResult.add(label1);
        }

        /*处理右边的预测值和实际值*/
        List<Double> listRightPredictResult = new ArrayList<>();
        List<Double> listRightOriginalResult = new ArrayList<>();
        for (int i = 0; i < rightX.getRowCount(); i++) {

            //选取特定行与列
            Matrix rowVector2 = rightX.selectRows(Calculation.Ret.NEW,i);
            Double predictResult2 = fuzzySigmod(rowVector2,estimatePara);
            double label2 = rightY.getAsDouble(i,0);

            listRightPredictResult.add(predictResult2);
            listRightOriginalResult.add(label2);
        }

        //存放预测结果和响应的实际结果
        List<List<List<Double>>> finalResult = new ArrayList<>();
        for (int i = 0; i < listLeftPredictResult.size(); i++) {
            List<List<Double>> tempCombinePreOrOrig = new ArrayList<>();
            //存放每个预测后的模糊结果值
            List<Double> tempPredictResult = new ArrayList<>();
            tempPredictResult.add(listLeftPredictResult.get(i));
            tempPredictResult.add(listMiddlePredictResult.get(i));
            tempPredictResult.add(listRightPredictResult.get(i));

            List<Double> tempOriginalResult = new ArrayList<>();
            tempOriginalResult.add(listLeftOriginalResult.get(i));
            tempOriginalResult.add(listMiddleOriginalResult.get(i));
            tempOriginalResult.add(listRightOriginalResult.get(i));

            tempCombinePreOrOrig.add(tempPredictResult);
            tempCombinePreOrOrig.add(tempOriginalResult);
            finalResult.add(tempCombinePreOrOrig);

        }


        return finalResult;
    }

    /**
     * 只有预测的结果(当新来一个用户的时候，直接查看预测的该用户的结果)
     * @param estimatePara   估计的参数
     * @return               返回预测的结果
     */
    public List<List<Double>> predictUser(Matrix estimatePara){
        /*处理左边的预测值*/
        List<Double> listLeftPredictResult = new ArrayList<>();

        //getRowCount()获取行的数量(处理下限的X矩阵)
        for (int i = 0; i < leftX.getRowCount(); i++) {

            //选取特定行与列
            Matrix rowVector = leftX.selectRows(Calculation.Ret.NEW,i);
            //System.out.println("左边的每行"+rowVector);
            Double predictResult = fuzzySigmod(rowVector,estimatePara);

            listLeftPredictResult.add(predictResult);

        }

        /*处理中间的预测值和实际值*/

        List<Double> listMiddlePredictResult = new ArrayList<>();

        for (int i = 0; i < middleX.getRowCount(); i++) {

            //选取特定行与列
            Matrix rowVector1 = middleX.selectRows(Calculation.Ret.NEW,i);
            double predictResult1 = fuzzySigmod(rowVector1,estimatePara);

            listMiddlePredictResult.add(predictResult1);

        }

        /*处理右边的预测值和实际值*/
        List<Double> listRightPredictResult = new ArrayList<>();
        for (int i = 0; i < rightX.getRowCount(); i++) {

            //选取特定行与列
            Matrix rowVector2 = rightX.selectRows(Calculation.Ret.NEW,i);
            Double predictResult2 = fuzzySigmod(rowVector2,estimatePara);

            listRightPredictResult.add(predictResult2);

        }

        //存放所有的预测结果
        List<List<Double>> finalResult = new ArrayList<>();
        for (int i = 0; i < listLeftPredictResult.size(); i++) {
            //存放每个预测后的模糊结果值
            List<Double> tempPredictResult = new ArrayList<>();
            tempPredictResult.add(listLeftPredictResult.get(i));
            tempPredictResult.add(listMiddlePredictResult.get(i));
            tempPredictResult.add(listRightPredictResult.get(i));

            finalResult.add(tempPredictResult);

        }

        return finalResult;
    }

    /**
     * 预测结果归一化
     * @param predictResult   最终的预测结果
     * @return
     */
    public List<Double> resultNormalization(List<List<Double>> predictResult){
        List<Double> possValue = new ArrayList<>();
        for (int i = 0; i < predictResult.size(); i++) {
            double tempResult = 0;
            for (int j = 0; j < predictResult.get(i).size(); j++) {
                tempResult += predictResult.get(i).get(j);
            }
            tempResult = tempResult/3;

            possValue.add(tempResult);
        }
        return possValue;
    }

    //判断预测结果的准确率（testPredictResult：是预测结果和实际结果的混合list）
    public List<List<Double>> testResultNormalization(List<List<List<Double>>> testPredictResult){
        List<List<Double>> commonResult = new ArrayList<>(); //封装预测结果和实际结果
        List<Double> predictResult = new ArrayList<>(); //存放预测结果归一化后的值
        List<Double> actualResult = new ArrayList<>();  //存放实际结果归一化后的值
        for (int i = 0; i < testPredictResult.size(); i++) {

            List<List<Double>> temp = testPredictResult.get(i);
            List<Double> normalizationResult = resultNormalization(temp);
            for (int j = 0; j <normalizationResult.size() ; j+=2) {
                predictResult.add(normalizationResult.get(j));
                actualResult.add(normalizationResult.get(j+1));
            }

        }

        commonResult.add(predictResult);
        commonResult.add(actualResult);
        return commonResult;
    }

    //测试预测的正确率
    public double testData(List<Double> predictResult,List<Double> actualResult){
        Integer count = 0;  //正确的个数
        List<Integer> tempPredictRssult = new ArrayList<>();
        List<Integer> tempActualResult = new ArrayList<>();
        for (int i = 0; i < predictResult.size(); i++) {
            if(predictResult.get(i)<0.5){
                tempPredictRssult.add(0);
            }else{
                tempPredictRssult.add(1);
            }
        }
        for (int i = 0; i < actualResult.size(); i++) {
            if(actualResult.get(i)<0.5){
                tempActualResult.add(0);
            }else{
                tempActualResult.add(1);
            }
        }

        for (int i = 0; i < tempPredictRssult.size(); i++) {
            if(tempPredictRssult.get(i) == tempActualResult.get(i)){
                count++;
            }
        }

        return count/(tempPredictRssult.size()+0.0);
    }


    /**
     * 方案二：利用逻辑回归的损失函数处理
     */
    //todo 后来添加
    //预测用户的信用结果，模糊的Y值不经过(E(y)/(1+E(y)))处理
    public List<List<Double>> predictUser1(Matrix estimatePara){
        /*处理左边的预测值*/
        List<Double> listLeftPredictResult = new ArrayList<>();

        //getRowCount()获取行的数量(处理下限的X矩阵)
        for (int i = 0; i < leftX.getRowCount(); i++) {

            //选取特定行与列
            Matrix rowVector = leftX.selectRows(Calculation.Ret.NEW,i);
            //System.out.println("左边的每行"+rowVector);
            Double predictResult = fuzzySigmod1(rowVector,estimatePara);

            listLeftPredictResult.add(predictResult);

        }

        /*处理中间的预测值和实际值*/

        List<Double> listMiddlePredictResult = new ArrayList<>();

        for (int i = 0; i < middleX.getRowCount(); i++) {

            //选取特定行与列
            Matrix rowVector1 = middleX.selectRows(Calculation.Ret.NEW,i);
            double predictResult1 = fuzzySigmod1(rowVector1,estimatePara);

            listMiddlePredictResult.add(predictResult1);

        }

        /*处理右边的预测值和实际值*/
        List<Double> listRightPredictResult = new ArrayList<>();
        for (int i = 0; i < rightX.getRowCount(); i++) {

            //选取特定行与列
            Matrix rowVector2 = rightX.selectRows(Calculation.Ret.NEW,i);
            Double predictResult2 = fuzzySigmod1(rowVector2,estimatePara);

            listRightPredictResult.add(predictResult2);

        }

        //存放所有的预测结果
        List<List<Double>> fuzzyFinalResult = new ArrayList<>();
        int size = listLeftPredictResult.size();
        for (int j = 0; j < size; j++) {
            //存放每个预测的模糊结果值
            List<Double> tempPredictResult1 = new ArrayList<>();
            tempPredictResult1.add(listLeftPredictResult.get(j));
            tempPredictResult1.add(listMiddlePredictResult.get(j));
            tempPredictResult1.add(listRightPredictResult.get(j));

            fuzzyFinalResult.add(tempPredictResult1);
        }

        return fuzzyFinalResult;
    }

    //todo 后来添加
    /**
     * 计算向量的内积（系数和解释变量的乘积和）
     * @param rowVector  当前样例数据，是一个行向量
     * @return           返回计算后的向量内积
     */
    private double fuzzySigmod1(Matrix rowVector, Matrix estimatePara){
        //预测的Y值，计算Y=aX0+a1X1+a2X2....的结果
        double thetaSum = estimatePara.transpose().mtimes(rowVector.transpose()).getValueSum();
        return thetaSum;
    }

    //todo 后来添加
    //直接将预测后的值进行归一化处理
    public List<Double> processFuzzyPredictResult(List<List<Double>> fuzzyPredictResult){
        List<Double> unProcessValue = new ArrayList<>();
        for (int i = 0; i < fuzzyPredictResult.size(); i++) {
            double tempResult = fuzzyPredictResult.get(i).get(0)+fuzzyPredictResult.get(i).get(1)+fuzzyPredictResult.get(i).get(2);
            tempResult = tempResult/3;

            unProcessValue.add(tempResult);
        }
        return unProcessValue;
    }

    //todo 后来添加
    //逻辑回归损失函数
    public double sigmod(double x){
        return 1.0 / (1 + Math.exp(-x));
    }

    //todo 后来添加
    public List<Double> classifyVector(List<List<Double>> fuzzyPredictResult){
        List<Double> classify = processFuzzyPredictResult(fuzzyPredictResult);
        List<Double> sigmodResult = new ArrayList<>();
        for (int i = 0; i < classify.size(); i++) {
            sigmodResult.add(sigmod(classify.get(i)));
        }
        return sigmodResult;

    }

    public static void main(String[] args) throws IOException{

        //利用模糊最小二乘法估计模糊逻辑回归的参数
        String dataPath = "src/dataSet/test/aaa.txt";
        LeastSquareEstmation leastSquareEstmation = new LeastSquareEstmation(dataPath,6);
        FuzzyLogistic fuzzyLogistic = new FuzzyLogistic();
        Matrix estimatePara = leastSquareEstmation.calculateTheta();

        System.out.println(estimatePara);


        //处理测试集数据
        String dataPath1 = "src/dataSet/test/aaa.txt";
        fuzzyLogistic.processDataSet(dataPath1,6);


        /**
         * 第一种方法测试
         */
        //获取的是预测结果和实际结果的混合list
        List<List<List<Double>>> acceptFinalResult = fuzzyLogistic.predictResult(estimatePara);
        System.out.println("模糊预测结果和模糊实际结果共同封装后结果："+acceptFinalResult);

        //获取预测的结果
        List<List<Double>> predictResult = fuzzyLogistic.predictUser(estimatePara);
        System.out.println("预测出的模糊结果："+predictResult);

        //获取归一化的结果
        List<Double> normalResult = fuzzyLogistic.resultNormalization(predictResult);
        System.out.println("预测的模糊结果归一化："+normalResult);

        //测试训练的结果和实际的结果
        List<List<Double>> aaa = fuzzyLogistic.testResultNormalization(acceptFinalResult);
        System.out.println("预测结果："+aaa.get(0));
        System.out.println("实际结果："+aaa.get(1));


        double correctRate = fuzzyLogistic.testData(aaa.get(0),aaa.get(1));
        System.out.println("正确率为：" + correctRate);


        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        /**
         * 第二种方法测试
         */
        //获取预测的结果
        List<List<Double>> fuzzyPredictResult = fuzzyLogistic.predictUser1(estimatePara);
        System.out.println("预测出的模糊结果："+fuzzyPredictResult);
        //模糊预测结果的归一化
        List<Double> fuzzyNormalResult = fuzzyLogistic.resultNormalization(fuzzyPredictResult);
        System.out.println("预测的模糊结果归一化："+fuzzyNormalResult);

        List<Double> sigmodResult = fuzzyLogistic.classifyVector(fuzzyPredictResult);
        System.out.println("模糊逻辑回归的结果"+sigmodResult);

    }

}
