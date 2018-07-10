package strategy;

public class ISS {
	public double calculaISS(Presupuesto presupuesto) {
		return presupuesto.getValor() * 0.06;
	}
}
