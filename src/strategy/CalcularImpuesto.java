package strategy;

public class CalcularImpuesto {
	public void calculo(Presupuesto presupuesto, Impuesto impuesto) {
		double icms = impuesto.calcula(presupuesto);
		System.out.println(icms);
	}
}
