package predicates;

import interfaces.Predicado;
import model.Aluno;

public class NamePredicate implements Predicado<Aluno> {

	public NamePredicate(String name) {
			}

	@Override
	public boolean teste(Aluno objeto) {
		
		return false;
	}

}
