package logistic.commonlogistic;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Logistic {
	/**
	 * 数据预处理
	 * @param fileName
	 * @return
	 */
	public List<HorseEntity> initDataSet(String fileName){
		List<HorseEntity> dataSet = new ArrayList<HorseEntity>();
		
		BufferedReader bufferedReader = null;		
		try {
			//读取txt文件
			bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
			String line = null;
			while((line = bufferedReader.readLine())!=null) {
				HorseEntity horseEntity = new HorseEntity();
				//使用一个或多个空格分割字符串
				String[] s = line.split("\\s+");    
				
				List<Double> list = new ArrayList<Double>();
				list.add(1.0);
				for (int i=0; i<s.length-1;i++) {
					list.add(Double.parseDouble(s[i]));
				}
				
				horseEntity.setAttributes(list);
				horseEntity.setLabel(s[s.length-1]);
				
				dataSet.add(horseEntity);
			}
			return dataSet;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		finally {
			try {
				//关闭文件流
				bufferedReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	/**
	 * 阶跃函数（二分类激活函数）
	 * @param x
	 * @return
	 */
	public double sigmod(double x) {
		return 1.0 / (1 + Math.exp(-x));
	}
	
	/**
	 * 多分类激活函数
	 * @param theta	训练参数
	 * @param soft_in  输入数据
	 * @return
	 */
	public double[] softMax(double[][] theta, double[] soft_in) {
		
		if (theta[0].length != soft_in.length) {
            System.out.println("输入矩阵不匹配，无法进行矩阵运算");
            return null;
        }
        double[] result = new double[theta.length];//返回标签
        double[] value = new double[theta.length];// 分子
        double  denominator = 0.0;//分母
        for (int i = 0; i < result.length; i++) {
            double temValue = 0.0;
            for (int j = 0; j < soft_in.length; j++) {
                temValue += theta[i][j]*soft_in[j];
            }
            value[i] = Math.pow(Math.E, temValue);
            denominator += Math.pow(Math.E, temValue);
        }
        for (int i = 0; i < result.length; i++) {
            result[i] = value[i]/denominator;
        }
        return result;
	}
	
	
	//重新计算权重值
	public List<Double> vecAddVec(List<Double> weights, double alpha,double error, List<Double> attributes){
		List<Double> list = new ArrayList<Double>();
		for (int i = 0; i < weights.size(); i++) {
			list.add(weights.get(i)+alpha*error*attributes.get(i));
		}
		return list;
	}
	
	/**
	 * 计算向量的内积
	 * 相当于改进的随机梯度算法中的sum(dataMatrix[randIndex]*weights)
	 * @param attributes
	 * @param weights
	 * @return
	 */
	public double vecMultipVec(List<Double> attributes,List<Double> weights) {
		double sum = 0.0;
		for (int i = 0; i < attributes.size(); i++) {
			sum += attributes.get(i)* weights.get(i);
		}
		return sum;
	}
	
	/**
	 * 改进的随机梯度上升算法
	 * @param trainDataSet  训练集
	 * @param number	      迭代次数
	 * @return              权重向量
	 */
	public List<Double> stocGradAscent(List<HorseEntity> trainDataSet, int number){
		//初始化回归系数
		List<Double> weights = new ArrayList<Double>();
		for(int i = 0; i< trainDataSet.get(0).getAttributes().size();i++) {
			weights.add(1.0);
		}
		for(int i=0; i<number; i++) {
			for (int j = 0; j < trainDataSet.size(); j++) {

				double alpha = 4.0/(1.0+i+j) + 0.0001;      //修改步长调节模型的准确率
				
				//产生一个0~trainDataSet的伪随机数
				int randIndex = new Random().nextInt(trainDataSet.size());
			
				double h = sigmod(vecMultipVec(trainDataSet.get(randIndex).getAttributes(), weights));
				double error = Double.parseDouble(trainDataSet.get(randIndex).getLabel()) - h;
				weights = vecAddVec(weights, alpha, error, trainDataSet.get(randIndex).getAttributes());
	
				//随机选取更新
				trainDataSet.remove(randIndex);		
			}
		}
		return weights;
	}
	
	/**
	 * 获取预测的结果
	 * @param attributes    特征值
	 * @param trainWeight   训练的各个特征的权重系数
	 * @return 预测结果值
	 */
	public double classifyVector(List<Double> attributes, List<Double> trainWeight) {
		double prob = sigmod(vecMultipVec(attributes, trainWeight));
		//System.out.println(prob);
		if(prob > 0.5) {
			return 1.0;
		}else {
			return 0.0;
		}
	}
	
	public double testdata() {	
		List<HorseEntity> trainDataSet = initDataSet("src/dataSet/horse/horseColicTraining.txt");
		List<HorseEntity> testDataSet = initDataSet("src/dataSet/horse/horseColicTest.txt");
		
		List<Double> trainWeights = stocGradAscent(trainDataSet, 500);      //修改迭代次数调整模型的准确率
		System.out.println(trainWeights);
		int errorCount = 0;
		
		for (HorseEntity horseEntity : testDataSet) {
            //System.out.println("当前例子标签：" + (int)(Double.parseDouble(horseEntity.getLabel())) + " 预测的标签值" + (int)classifyVector(horseEntity.getAttributes(), trainWeights));
			if ((int)classifyVector(horseEntity.getAttributes(), trainWeights) 
					!= (int)(Double.parseDouble(horseEntity.getLabel()))) {
				++ errorCount;
			}
		}
		System.out.println("the error rate of this test is: " + (double) errorCount / testDataSet.size());
		return (double) errorCount/testDataSet.size();
	}
	

}
