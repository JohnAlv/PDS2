
public class Disciplina {
	
	private int codigo;
	private int cargaHoraria;
	private String descricao;
	private String emenda;
	private String bibliografia;
	private Turma[ ] turma;
	private Curso curso;
	
	Disciplina(int codigo, int cargaHoraria, String descricao, String emenda, String bibliografia, Turma[ ] turma, 
			Curso curso){
		this.codigo = codigo;
		this.cargaHoraria = cargaHoraria;
		this.descricao = descricao;
		this.emenda = emenda;
		this.bibliografia = bibliografia;
		this.turma = turma;
		this.curso = curso;
		
	}
	
	public void cadastrar() {}
	
	
	
}
