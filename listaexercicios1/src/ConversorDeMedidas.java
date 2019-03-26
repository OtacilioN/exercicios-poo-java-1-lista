
public class ConversorDeMedidas {
	public static String converterMassa(Medidas medida1, Medidas medida2) {
		final double massaK = 2.2046;
				
		double resultado = medida1.getMassa();
		String convertFrom = medida1.getUnidadeDeMassa();
		String toConvert = medida2.getUnidadeDeMassa();
		String saida = "";
		
		if(toConvert == convertFrom) {
			return "Não foi possível realizar conversão, unidades já estão na mesma medida.";
		}
		if("kg".equals(toConvert)) {
			resultado = resultado / massaK;
			saida = String.valueOf(resultado)+ "lb";
		}
		if("lb".equals(toConvert)) {
			resultado = resultado * massaK;
			saida = String.valueOf(resultado)+ "kg";
			
		}
		return saida;
	}
	
	public static String converterTemperatura(Medidas medida1, Medidas medida2) {
		final double temperaturaK1 = 32;
		final double temperaturaK2 = 1.8;
		
		double resultado = medida1.getTemperatura();
		String convertFrom = medida1.getUnidadeDeTemperatura();
		String toConvert = medida2.getUnidadeDeTemperatura();
		String saida = "";
		
		if(toConvert == convertFrom) {
			return "Não foi possível realizar conversão, unidades já estão na mesma medida.";
		}
		if("C".equals(toConvert)) {
			resultado = (resultado-32) / temperaturaK2;
			saida = String.valueOf(resultado)+ "F";
		}
		if("F".equals(toConvert)) {
			resultado = resultado * temperaturaK2 + temperaturaK1;
			saida = String.valueOf(resultado)+ "C";
		}
		return saida;
	}
	
	public static String converterDistancia(Medidas medida1, Medidas medida2) {
		final double distanciaK = 1.609;
				
		double resultado = medida1.getDistancia();
		String convertFrom = medida1.getUnidadeDeDistancia();
		String toConvert = medida2.getUnidadeDeDistancia();
		String saida = "";
		
		if(toConvert == convertFrom) {
			return "Não foi possível realizar conversão, unidades já estão na mesma medida.";
		}
		if("mi".equals(toConvert)) {
			resultado = resultado / distanciaK;
			saida = String.valueOf(resultado)+ "km";
		}
		if("km".equals(toConvert)) {
			resultado = resultado * distanciaK;
			saida = String.valueOf(resultado)+ "mi";
		}
		return saida;
	}
}
