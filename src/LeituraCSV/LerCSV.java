package LeituraCSV;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import model.Aluno;


public class LerCSV {

	/*Scanner sc;
	
	try {
		sc = new Scanner(new File("data/alunos.csv"));
		sc.useDelimiter(",|\\n");
		                
		while (sc.hasNext()) {
		Aluno aluno = new Aluno("Nome: "+sc.next(), "\nEmail: " +sc.next());
		System.out.println(aluno));
	}
}
		catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado.");
			return;
		}
	sc.close();
}

}
	*/
	
	public ArrayList<Aluno> CSV(ArrayList<Aluno> lista) {
		ArrayList<Aluno> aluno = new ArrayList<>();
		Scanner sc;
		boolean Linha = true;

		try {
			sc = new Scanner(new File("alunos.csv"));
			sc.useDelimiter("[,\n]");

		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado.");
			return aluno;
		}
		while (sc.hasNext()) {
			if (Linha) {
				Aluno alunos = new Aluno();
				alunos.setName(sc.next());
				alunos.setEmail(sc.next());
				alunos.setIdade(sc.next());
				alunos.setCidade(sc.next());
				
				Aluno p = new Aluno("Nome: "+alunos.getName(), "\nEmail: " +alunos.getEmail(),
						"\nIdade: "+alunos.getIdade(), "\nCidade: "+alunos.getCidade());
				System.out.println(p);
				
								
		}

		sc.close();

		}
		return aluno;
	}
}
	