package mythread2;

public class TaxCalculator {
	private final double salary;
	
	private final double bonus;
	
	private CalculatorStrategy calculatorStrategy;
	
	public TaxCalculator(double salary, double bonus) {
		this.salary = salary;
		this.bonus = bonus;
	}
	
	protected double calcTax() {
		return calculatorStrategy.calaulate(salary, bonus);
	}
	
	public double calculate() {
		return this.calcTax();
	}

	public double getSalary() {
		return salary;
	}

	public double getBonus() {
		return bonus;
	}

	public CalculatorStrategy getCalculatorStrategy() {
		return calculatorStrategy;
	}

	public void setCalculatorStrategy(CalculatorStrategy calculatorStrategy) {
		this.calculatorStrategy = calculatorStrategy;
	}
	
}
