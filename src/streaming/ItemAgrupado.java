package streaming;

import java.util.ArrayList;

public abstract class ItemAgrupado extends Item {
	private ArrayList<Filme> filmes;

	public ItemAgrupado(String titulo, String genero, String diretor) {
		super(titulo, genero, diretor);
		filmes = new ArrayList<Filme>();
	}
	
	public ArrayList<Filme> getFilmes() {
		return filmes;
	}
	
	public void adicionar(Filme filme) {
		filmes.add(filme);
	}

	@Override
	public int getDuracao() {
		int duracaoTotal = 0;
		for(Filme filme : getFilmes()) {
			duracaoTotal += filme.getDuracao();
		}
		return duracaoTotal;
	}

	@Override
	public void imprimir() {
		System.out.println(getTitulo() + " - (" + getGenero() + ")");
		for(int i = 0; i < getFilmes().size(); i++) {
			System.out.print(i + 1 + ". ");
			getFilmes().get(i).imprimir();
		}
		System.out.println("Duração total: " + getDuracao() + " min.");
	}

}
