package mythread2;

public class SimplCalculatorStrategy implements CalculatorStrategy{

	@Override
	public double calaulate(double salary, double bonus) {
		// TODO Auto-generated method stub
		return salary * 0.1 + bonus * 0.15;
	}

}
