package datastructures;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Comparator;
import java.util.Scanner;

import model.Aluno;
import model.No;

public class ListaEncadeada<T> {
	
	private No<T> primeira;
	private No<T> ultima;
	
	// adiciona um elemento no final da lista
	
	public void append(T dado){
		No<T> no = new No<T>();
		no.setDado(dado);
		
		//se nao tiver dado na lista
				if(primeira == null){
					//a primeira será o no
					primeira = no;
					
				} else {
					//se tiver dado na lista, enlaça
					no.setAnterior(ultima);
					ultima.setProxima(no);
				}
				
				//o no adicionado sera o ultimo
				ultima = no;
		
		
		
	}
		
		//adiciona no comeco da lista
		 
		public void addFirst(T dado) {
			
			No<T> no = new No<T>();
			no.setDado(dado);
			
			no.setProxima(primeira);
			primeira.setAnterior(no);
			
			this.primeira = no;
		}
	
		
	
	public T search(Comparator<T> cmp){
	
	/*	No<T> no = primeira;

	do {
		no = no.getProxima();
	
	} while (no != null);
	*/
	return null;
	
}
	
	
	public void printObjects(){
		No<T> no = primeira;

		do {
			if(no != null){
				System.out.println(no.getDado());
				no = no.getProxima();
			}
		} while (no != null);
	}
		
	
	public static ListaEncadeada<model.Aluno> loadFromFile(FileReader arquivo){
		
		ListaEncadeada<Aluno> alunos = new ListaEncadeada<>();
		Scanner sc;

		sc = new Scanner(arquivo);
		sc.useDelimiter("[,\n]");

		while (sc.hasNext()) {
			Aluno aluno = new Aluno();
			
			aluno.setName(sc.next());
			aluno.setEmail(sc.next());
			aluno.setIdade(sc.next());
			aluno.setCidade(sc.next());
			
			
		/*	while (sc.hasNext()) {
				Participante p = new Participante("Nome: "+sc.next(), "\nEmail: " +sc.next());
				System.out.println(p);
				
				}
	}
			catch (FileNotFoundException e) {
				System.out.println("Arquivo não encontrado.");
				return;
			}
		sc.close();
	}
			*/
			
		}
		return alunos;

			
	}
}
