package test;

import java.io.FileNotFoundException;
import java.io.FileReader;

import comparators.SearchByAgeAndCity;
import comparators.SearchByEmail;
import comparators.SearchByName;
import datastructures.ListaEncadeada;
import model.Aluno;

public class ProgramaC_Alunos {

	private static final String name = "";
	private static final String email = "";
	private static final String idade = "";
	private static final String cidade = "";
	
	public static void main(String[] args) {
	FileReader arquivo = null;
		try {
			arquivo = new FileReader("data/alunos.csv"); //importa CSV
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
		ListaEncadeada<Aluno> lista = ListaEncadeada.loadFromFile(arquivo);//carrega arquivo em lista encadeada
		
		
		
		System.out.println(lista.search(new SearchByName(name)));
		System.out.println(lista.search(new SearchByEmail(email)));
		System.out.println(lista.search(new SearchByAgeAndCity(idade,cidade)));
	}

}
