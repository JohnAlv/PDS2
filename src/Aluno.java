
public class Aluno extends Pessoa {
	
	private String matricula;
	private String situacao;
	private Curso curso;
	private Turma [ ] turma;
	private Avaliacao[ ] avaliacao;
	
	Aluno(String nome, String endereco, String telefone, String matricula, String situacao, Curso curso, Turma[ ] turma,
			Avaliacao [ ] avaliacao){
		super(nome,endereco,telefone);
		this.matricula= matricula;
		this.situacao= situacao;
		this.curso = curso;
		this.turma = turma;
		this.avaliacao = avaliacao;
	}
	
	public void matriculaCurso() {}
	
	public void trancar(){}
	
	public void formar(){}
	
	public void evadir(){}
	
	public void obterAvaliacoes(){}
	
	public void emitirHistorico() {}
}
