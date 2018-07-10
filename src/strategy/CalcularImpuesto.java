package strategy;

public class CalcularImpuesto {
	public void calculo(Presupuesto presupuesto, String impuesto) {
		if("ICMS".equals(impuesto)) {
			double icms = presupuesto.getValor() * 0.1;
			System.out.println(icms);
		}else if("ISS".equals(impuesto)) {
			double iss = presupuesto.getValor() * 0.06;
			System.out.println(iss);
		}
	}
}
