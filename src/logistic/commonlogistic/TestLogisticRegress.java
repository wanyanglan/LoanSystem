package logistic.commonlogistic;

public class TestLogisticRegress {
	
	public static void main(String[] args) {
		Logistic logistic = new Logistic();
		double sum = 0.0;
		for (int i = 0; i < 10; i++) {
			sum += logistic.testdata();
		}
//		logistic.testdata();
		System.out.println("after 10 iterations the average error rate is:"+sum/10);
	}
	

}
