package mythread2;

public class TaxCalculatorMain {
	public static void main(String[] args) {
		/*TaxCalculator calculator = new TaxCalculator(10000d, 2000d){
			@Override
			protected double calcTax() {
				return getSalary() * 0.1 + getBonus() * 0.15;
			}
		};
		
		double tax = calculator.calculate();*/
		TaxCalculator calculator = new TaxCalculator(10000d, 2000d);
		
		CalculatorStrategy strategy = new SimplCalculatorStrategy();
		
		calculator.setCalculatorStrategy(strategy);
		System.err.println(calculator.calculate());
	}
}
