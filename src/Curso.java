
public class Curso {

	private int codigo;
	private String descricao;
	private Aluno [ ] aluno;
	private Disciplina [ ] disciplina;
	private Professor [ ] professor;
	
	Curso(int codigo, String descricao, Aluno[ ] aluno, Disciplina [ ] disciplina, Professor [ ] professor){
		this.codigo = codigo;
		this.descricao =  descricao;
		this.aluno = aluno;
		this.disciplina = disciplina;
		this.professor = professor;
	}
	
	public void cadastrar() {}
}
