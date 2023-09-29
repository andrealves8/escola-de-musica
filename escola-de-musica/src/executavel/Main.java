package executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import classes.Aluno;
import classes.Disciplina;

public class Main {

	public static void main(String[] args) {

		int escolha = 0;

		do {
			escolha = JOptionPane.showConfirmDialog(null, "DESEJA ADICIONAR UM ALUNO? ");

			if (escolha == 0) {

				Aluno aluno = new Aluno();

				List<Aluno> listaAlunos = new ArrayList<Aluno>();
				String nomeAluno = JOptionPane.showInputDialog("NOME DO ALUNO?");
				aluno.setNome(nomeAluno);
				listaAlunos.add(aluno);

				for (int pos = 1; pos <= 2; pos++) {
					String nomeDisciplina = JOptionPane.showInputDialog("NOME DA DISCIPLINA " + pos + "?");
					String notaDisciplina = JOptionPane.showInputDialog("NOTA DA DISCIPLINA " + pos + "?");

					Disciplina disciplina = new Disciplina();
					disciplina.setDisciplina(nomeDisciplina);
					disciplina.setNota(Double.valueOf(notaDisciplina));

					aluno.getDisciplina().add(disciplina);
				}

				System.out.println(aluno);
			}

		} while (escolha == 0);
	}
}
