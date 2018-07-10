package strategy;

public class ISS implements Impuesto {
	@Override
	public double calcula(Presupuesto presupuesto) {
		return presupuesto.getValor() * 0.06;
	}
}
