package logistic.commonlogistic;

import java.util.List;

/**
 * HorseEntity表示的就是矩阵里面的一行数据
 * @author wyl
 */
public class HorseEntity {
	//数据值
	private List<Double> attributes;   		//每个样本的特征值 
	private String label;          			//标签空间
	public List<Double> getAttributes() {
		return attributes;
	}
	public void setAttributes(List<Double> attributes) {
		this.attributes = attributes;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}

}
