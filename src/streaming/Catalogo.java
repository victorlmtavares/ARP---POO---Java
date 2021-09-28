package streaming;

import java.util.ArrayList;

public class Catalogo {
	private ArrayList<Item> catalogo;
	public Catalogo() {
		catalogo = new ArrayList<Item>();
	}
	
	public void adicionar(Item item) {
		catalogo.add(item);
	}
	
	public void imprimir() {
		for(Item item : catalogo) {
			item.imprimir();
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Catalogo catalogo = new Catalogo();
		Filme filme = new Filme("Bastardos Inglórios", "Aventura/Drama", "Tarantino", 153);
		catalogo.adicionar(filme);
		
		Serie got = new Serie("Guerra dos Tronos", "Fantasia", "HBO", 3);
		got.adicionar(new Filme("O inverno está chegando", "Drama", "Tim Van Patten", 62));
		got.adicionar(new Filme("A estrada do rei", "Aventura", "Tim Van Patten", 56));
		got.adicionar(new Filme("Lorde Snow", "Aventura", "Brian Kirk", 58));
		catalogo.adicionar(got);
		
		Show show = new Show("Irmãos (Live)", "Samba", "Telo Borges");
		show.adicionar(new Filme("A voz do morro", "Pagode", "Zé Ketti", 2));
		show.adicionar(new Filme("Eu sou o samba", "Samba", "Alexandre Pires", 3));
		catalogo.adicionar(show);
		
		catalogo.imprimir();

	}

}
