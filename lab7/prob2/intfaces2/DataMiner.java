package lab7.prob2.intfaces2;

import java.util.ArrayList;
import java.util.List;

public class DataMiner {
	public static void main(String[] args) {
		DataMiner dm = new DataMiner();
		dm.objects.add(new Rectangle(5, 7));
		dm.objects.add(new Rectangle(2, 9));
		dm.objects.add(new Ellipse(4, 6));
		dm.objects.add(new Circle(6));
		dm.objects.add(new EquilateralTriangle(3));
		dm.objects.add(new EquilateralTriangle(5));
		System.out.println(dm.computeAveragePerimeter());
	}

	List<ClosedCurve> objects = new ArrayList<>();

	// OO (good) way of performing computation
	public double computeAveragePerimeter() {
		if (objects == null || objects.isEmpty())
			return 0.0;
		double sum = 0.0;
		for (int i = 0; i < objects.size(); ++i) {
			sum += objects.get(i).computePerimeter();
		}
		return sum / objects.size();
	}

}
