package clase;

import interfete.ICalculatorKmRulati;

public class CalculatorKmRulati {

	ICalculatorKmRulati calculatorBord;
	public int adunareKm(int x, int y) {
		return calculatorBord.adunaKm(x, y);
	}
	public ICalculatorKmRulati getCalc() {
		return calculatorBord;
	}
	public void setCalc(ICalculatorKmRulati calc) {
		this.calculatorBord = calc;
	}

}
