package strategy;

public class CalcularImpuesto {
	public void calculo(Presupuesto presupuesto, String impuesto) {
		if("ICMS".equals(impuesto)) {
			double icms = new ICMS().calculaICMS(presupuesto);
			System.out.println(icms);
		}else if("ISS".equals(impuesto)) {
			double iss = new ISS().calculaISS(presupuesto);
			System.out.println(iss);
		}
	}
}
