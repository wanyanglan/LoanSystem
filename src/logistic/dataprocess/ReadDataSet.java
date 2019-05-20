package logistic.dataprocess;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 从txt中加载训练数据
 * @author wyl
 */

public class ReadDataSet {
    /**
     * 存放每个响应变量对应的解释变量(x1,x2,x3,x4,x5,x6,x7......)
     */
    private List<List<Double>> datasLeft = new ArrayList<>();
    private List<List<Double>> datasMiddle = new ArrayList<>();
    private List<List<Double>> datasRight = new ArrayList<>();

    /**
     * 存放所有的响应变量(0或者1:y)
     */
    private List<Double> labelsLeft = new ArrayList<>();
    private List<Double> labelsMiddle = new ArrayList<>();
    private List<Double> labelsRight = new ArrayList<>();

    /**
     * 存放的是（解释变量组合，响应变量）
     */
    private List<List<Object>> dataLeftSets = new ArrayList<>();
    private List<List<Object>> dataMiddleSets = new ArrayList<>();
    private List<List<Object>> dataRightSets = new ArrayList<>();


    public ReadDataSet() {
    }

    /**
     * 从txt中读取数据
     * @param fileName    读取的文件名
     * @param separator   按什么分隔符分割字符串
     * @param labelPos    标识所在的下标
     * @throws IOException
     */
    public void loadDataFromTxt(String fileName, String separator, Integer labelPos) throws IOException {
        File file = new File(fileName);
        BufferedReader reader = null;
        String readLine = null;
        try{
            reader = new BufferedReader(new FileReader(file));
            while((readLine = reader.readLine()) != null){
                String[] string = readLine.split(separator);

                //存放除标签外的其他解释变量
                List<Double> dataListLeft = new ArrayList<>();
                List<Double> dataListMiddle = new ArrayList<>();
                List<Double> dataListRight = new ArrayList<>();

                for (int i = 0; i < string.length; i+=3) {
                    if(i == labelPos) {
                        this.labelsLeft.add(Double.parseDouble(string[i].trim()));
                        this.labelsMiddle.add(Double.parseDouble(string[i+1].trim()));
                        this.labelsRight.add(Double.parseDouble(string[i+2].trim()));

                    } else{
                        dataListLeft.add(Double.parseDouble(string[i].trim()));
                        dataListMiddle.add(Double.parseDouble(string[i+1].trim()));
                        dataListRight.add(Double.parseDouble(string[i+2].trim()));
                    }
                }

                this.datasLeft.add(dataListLeft);
                this.datasMiddle.add(dataListMiddle);
                this.datasRight.add(dataListRight);
            }

            for (int i = 0; i < this.datasLeft.size(); i++) {
                List<Object> listLeft = new ArrayList<>();
                listLeft.add(datasLeft.get(i));
                listLeft.add(labelsLeft.get(i));
                dataLeftSets.add(listLeft);

            }

            for (int i = 0; i < this.datasMiddle.size(); i++) {
                List<Object> listMiddle = new ArrayList<>();
                listMiddle.add(datasMiddle.get(i));
                listMiddle.add(labelsMiddle.get(i));
                dataMiddleSets.add(listMiddle);

            }

            for (int i = 0; i < this.datasRight.size(); i++) {
                List<Object> listRight = new ArrayList<>();
                listRight.add(datasRight.get(i));
                listRight.add(labelsRight.get(i));
                dataRightSets.add(listRight);

            }

        }catch (Exception e){
            e.printStackTrace();

        }finally {
            if(reader == null){
                try{
                    reader.close();

                }catch(Exception e){
                    e.printStackTrace();

                }
            }
        }
    }

    public List<List<Double>> getDatasLeft() {
        return datasLeft;
    }

    public void setDatasLeft(List<List<Double>> datasLeft) {
        this.datasLeft = datasLeft;
    }

    public List<List<Double>> getDatasMiddle() {
        return datasMiddle;
    }

    public void setDatasMiddle(List<List<Double>> datasMiddle) {
        this.datasMiddle = datasMiddle;
    }

    public List<List<Double>> getDatasRight() {
        return datasRight;
    }

    public void setDatasRight(List<List<Double>> datasRight) {
        this.datasRight = datasRight;
    }

    public List<Double> getLabelsLeft() {
        return labelsLeft;
    }

    public void setLabelsLeft(List<Double> labelsLeft) {
        this.labelsLeft = labelsLeft;
    }

    public List<Double> getLabelsMiddle() {
        return labelsMiddle;
    }

    public void setLabelsMiddle(List<Double> labelsMiddle) {
        this.labelsMiddle = labelsMiddle;
    }

    public List<Double> getLabelsRight() {
        return labelsRight;
    }

    public void setLabelsRight(List<Double> labelsRight) {
        this.labelsRight = labelsRight;
    }

    public List<List<Object>> getDataLeftSets() {
        return dataLeftSets;
    }

    public void setDataLeftSets(List<List<Object>> dataLeftSets) {
        this.dataLeftSets = dataLeftSets;
    }

    public List<List<Object>> getDataMiddleSets() {
        return dataMiddleSets;
    }

    public void setDataMiddleSets(List<List<Object>> dataMiddleSets) {
        this.dataMiddleSets = dataMiddleSets;
    }

    public List<List<Object>> getDataRightSets() {
        return dataRightSets;
    }

    public void setDataRightSets(List<List<Object>> dataRightSets) {
        this.dataRightSets = dataRightSets;
    }

    //获取下限解释变量，响应变量组合的大小
    public Integer getLeftSize(){
        return dataLeftSets.size();
    }

    //获取中间值解释变量，响应变量组合的大小
    public Integer getMiddleSize(){
        return dataMiddleSets.size();
    }

    //获取上限解释变量，响应变量组合的大小
    public Integer getRightSize(){
        return dataRightSets.size();
    }

    public static void main(String[] args) throws IOException{

        //测试
        ReadDataSet readDataSet = new ReadDataSet();

        readDataSet.loadDataFromTxt("fuzzyLogistic/dataSet/test/aaa.txt"," ",6);
        System.out.println(readDataSet.getDatasLeft());
        System.out.println(readDataSet.getLabelsLeft());

        System.out.println(readDataSet.getDatasMiddle());
        System.out.println(readDataSet.getLabelsMiddle());

        System.out.println(readDataSet.getDatasRight());
        System.out.println(readDataSet.getLabelsRight());

        System.out.println(readDataSet.getDataLeftSets());
        System.out.println(readDataSet.getDataMiddleSets());
        System.out.println(readDataSet.getDataRightSets());


        System.out.println(readDataSet.getLeftSize());
        System.out.println(readDataSet.getMiddleSize());
        System.out.println(readDataSet.getRightSize());
    }
}
