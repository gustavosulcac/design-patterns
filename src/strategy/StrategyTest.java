package strategy;

public class StrategyTest {
	public static void main(String[] args) {
		Impuesto icms = new ICMS();
		Impuesto iss = new ISS();
		
		Double valor = 500.0;
		Presupuesto presupuesto = new Presupuesto(valor);
		
		CalcularImpuesto calcularImpuesto = new CalcularImpuesto();
		
		calcularImpuesto.calculo(presupuesto, icms);
		calcularImpuesto.calculo(presupuesto, iss);
	}
}
