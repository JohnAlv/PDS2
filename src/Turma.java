
public class Turma {
	private int ano;
	private int semestre;
	private int diaSemana;
	private String horarios;
	private Aluno[ ]aluno;
	private Professor[ ] professor;
	private Avaliacao[ ] avaliacao;
	
	
	Turma(int ano, int semestre, int diaSemana, String horarios, Aluno[ ] aluno, Professor[ ] professor, 
			Avaliacao [] avaliacao){
		this.ano = ano;
		this.semestre = semestre;
		this.diaSemana = diaSemana;
		this.horarios = horarios;
		this.aluno = aluno;
		this.professor = professor;
		this.avaliacao = avaliacao;
		
	}
	
	public void abrirTurma() {}
	public void alocarProfessor() {}
	public void matricularALuno() {}
	public void emitirDiario() {}
	
}
