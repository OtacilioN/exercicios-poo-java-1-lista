
public class Medidas {
	private String unidadeDeDistancia, unidadeDeMassa, unidadeDeTemperatura;
	private double distancia, massa;
	private int temperatura;
	
	public Medidas(){
		
	}
	
	public Medidas(String unidadeDeDistancia, String unidadeDeMassa, String unidadeDeTemperatura, double distancia,
			double massa, int temperatura) {
		this.unidadeDeDistancia = unidadeDeDistancia;
		this.unidadeDeMassa = unidadeDeMassa;
		this.unidadeDeTemperatura = unidadeDeTemperatura;
		this.distancia = distancia;
		this.massa = massa;
		this.temperatura = temperatura;
	}

	// unidadeDeDistancia
	public String getUnidadeDeDistancia(){
		return this.unidadeDeDistancia;
	}
	public void setAtributo1(String unidadeDeDistancia) {
		this.unidadeDeDistancia = unidadeDeDistancia;
	}
	
	// unidadeDeMassa
	public String getUnidadeDeMassa(){
		return this.unidadeDeMassa;
	}
	public void setUnidadeDeMassa(String unidadeDeMassa) {
		this.unidadeDeMassa = unidadeDeMassa;
	}
	
	// unidadeDeTemperatura
	public String getUnidadeDeTemperatura(){
		return this.unidadeDeTemperatura;
	}
	public void setUnidadeDeTemperatura(String unidadeDeTemperatura) {
		this.unidadeDeTemperatura = unidadeDeTemperatura;
	}
	
	// Valores
	
	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public double getMassa() {
		return massa;
	}

	public void setMassa(double massa) {
		this.massa = massa;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Medidas medida1 = new Medidas("km", "kg", "C", 2.0, 2.0, 2);
		Medidas medida2 = new Medidas("mi", "lb", "F", 2.0, 2.0, 2);
		System.out.println(ConversorDeMedidas.converterDistancia(medida1, medida2));
		System.out.println(ConversorDeMedidas.converterTemperatura(medida1, medida2));
		System.out.println(ConversorDeMedidas.converterMassa(medida1, medida2));
	}

}
