package strategy;

public class ICMS {
	public double calculaICMS(Presupuesto presupuesto) {
		return presupuesto.getValor() * 0.1;
	}
}
