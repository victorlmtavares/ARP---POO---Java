//Programador: Victor Loyola Maia Tavares
//Data: 28/09/2021
package streaming;

public class Serie extends ItemAgrupado {
	private int temporadas;

	public Serie(String titulo, String genero, String diretor, int temporadas) {
		super(titulo, genero, diretor);
		this.temporadas = temporadas;
	}

	public int getTemporadas() {
		return temporadas;
	}
	
	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Temporadas: " + getTemporadas());
	}
}
