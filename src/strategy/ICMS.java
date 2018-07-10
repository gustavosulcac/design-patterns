package strategy;

public class ICMS implements Impuesto {
	@Override
	public double calcula(Presupuesto presupuesto) {
		return presupuesto.getValor() * 0.1;
	}
}
