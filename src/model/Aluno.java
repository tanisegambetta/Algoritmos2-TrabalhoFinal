package model;

public class Aluno {
	
	

	private String name;
	private String email;
	private String idade;
	private String cidade;
	
	public Aluno() {
		super();
		
	}

	public Aluno(String name, String email, String idade, String cidade) {
		super();
		this.name = name;
		this.email = email;
		this.idade = idade;
		this.cidade = cidade;
	}

	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getIdade(){
		return idade;
	}
	
	public void setIdade(String idade){
		this.idade = idade;
	}
	

	public String getCidade(){
		return cidade;
	}
	
	public void setCidade(String cidade){
		this.cidade = cidade;
	}
	
	@Override
	public String toString() {
		return "Aluno [Nome:" + name + ", Email:" + email + ", Idade:" + idade + ", Cidade:" + cidade + "]";
	}
}
	