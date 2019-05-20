package logistic.fuzzylogistic.test;

import java.io.IOException;
import java.util.List;

import org.ujmp.core.Matrix;

import logistic.fuzzylogistic.FuzzyLogistic;
import logistic.fuzzylogistic.LeastSquareEstmation;

public class TestLogisticRegression {
	
	public static void main(String[] args) throws IOException{
		//利用模糊最小二乘法估计模糊逻辑回归的参数
	    String dataPath = "src/dataSet/test/aaa.txt";
	    LeastSquareEstmation leastSquareEstmation = new LeastSquareEstmation(dataPath,6);
	    FuzzyLogistic fuzzyLogistic = new FuzzyLogistic();
	    Matrix estimatePara = leastSquareEstmation.calculateTheta();

	    System.out.println(estimatePara);


	    //统计预测正确的个数
	    Integer correctCount = 0;

	    //处理测试集数据
	    String dataPath1 = "src/dataSet/test/aaa.txt";
	    fuzzyLogistic.processDataSet(dataPath1,6);

	    //获取的是预测结果和实际结果的混合list
	    List<List<List<Double>>> acceptFinalResult = fuzzyLogistic.predictResult(estimatePara);
	    System.out.println(acceptFinalResult);

	    //获取预测的结果
	    List<List<Double>> predictResult = fuzzyLogistic.predictUser(estimatePara);
	    System.out.println(predictResult);

	    //获取归一化的结果
	    List<Double> normalResult = fuzzyLogistic.resultNormalization(predictResult);
	    System.out.println(normalResult);


//	    System.out.println("正确的个数为：" + correctCount);
//	    System.out.println("总的个数为：" );
//	    System.out.println("预测准确率" );
//	    System.out.println("--------------------------------------------------------------------");
	}

}
