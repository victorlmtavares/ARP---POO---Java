//Programador: Victor Loyola Maia Tavares
//Data: 28/09/2021
package streaming;

public class Filme extends Item {
	private int duracao;
	public Filme(String titulo, String genero, String diretor, int duracao) {
		super(titulo, genero, diretor);
		this.duracao = duracao;
	}

	@Override
	public int getDuracao() {
		return this.duracao;
	}

	@Override
	public void imprimir() {
		System.out.println(getTitulo() + " (" + this.getDuracao() + ") - " + getDuracao() + " min." );
	}

}
