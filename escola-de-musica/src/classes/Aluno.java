package classes;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private String nome;
	private String dataNasc;
	private int matricula;
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public Aluno() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public void setDisciplina(List<Disciplina> disciplina) {
		this.disciplinas = disciplina;
	}

	public List<Disciplina> getDisciplina() {
		return disciplinas;
	}

	public double notaMedia() {
		double somaNotas = 0.0;

		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();

		}
		return somaNotas / disciplinas.size();

	}

	public boolean resultado() {
		if (notaMedia() > 7) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", dataNasc=" + dataNasc + ", matricula=" + matricula + ", disciplinas="
				+ disciplinas + ", Média=" + notaMedia() + ", resultado=" + (resultado() ? "APROVADO!" : "REPROVADO!")
				+ "]";
	}

}
