package comparators;

import java.util.Comparator;

import model.Aluno;

public class SearchByEmail implements Comparator<Aluno> {

	public SearchByEmail(String email) {
		// constructor
	}
	
	public SearchByEmail() {
		
	}

	@Override
	public int compare(Aluno o1, Aluno o2) {
		return o1.getEmail().compareTo(o2.getEmail());
		
	}
	
		
}
