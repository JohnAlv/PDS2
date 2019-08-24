
public class Professor extends Pessoa {
	
	private String titulacaoMaxima;
	private Turma[ ] turmas;
	private Curso [ ] curso;
	
	
	
	Professor(String nome, String endereco, String telefone, String titulacaoMaxima, Turma[ ] turmas, Curso[ ] curso){
		super(nome,endereco,telefone);
		this.titulacaoMaxima = titulacaoMaxima;
		this.turmas = turmas;
		this.curso = curso;
		
	}
	
	public void cadastrar() {}
	
}
