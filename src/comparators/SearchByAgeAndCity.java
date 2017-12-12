package comparators;

import java.util.Comparator;

import model.Aluno;

public class SearchByAgeAndCity implements Comparator<Aluno> {

	public SearchByAgeAndCity(String idade, String cidade) {
		
	}
	public SearchByAgeAndCity() {
		super();
		
	}
	@Override
	public int compare(Aluno o1, Aluno o2) {
		
		return 0;
	}

}
