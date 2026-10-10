import java.util.Scanner;

public class Turma {
    private Aluno[] alunos;
    private int quantidadeAlunos;

    public Turma(int capacidade) {
        this.alunos = new Aluno[capacidade];
        this.quantidadeAlunos = 0;
    }

    public boolean adicionarAluno(Aluno aluno) {
        if (quantidadeAlunos < alunos.length) {
            alunos[quantidadeAlunos] = aluno;
            quantidadeAlunos++;
            return true;
        }
        return false;
    }

    public void listarAprovados() {
        System.out.println("\n=== Alunos Aprovados ===");
        boolean encontrou = false;
        for (int i = 0; i < quantidadeAlunos; i++) {
            if (alunos[i].verificarAprovacao()) {
                System.out.printf("Nome: %s | Matrícula: %s | Média: %.2f\n",
                        alunos[i].getNome(), alunos[i].getMatricula(), alunos[i].calcularMedia());
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum aluno aprovado.");
        }
    }

    public void listarReprovados() {
        System.out.println("\n=== Alunos Reprovados ===");
        boolean encontrou = false;
        for (int i = 0; i < quantidadeAlunos; i++) {
            if (!alunos[i].verificarAprovacao()) {
                System.out.printf("Nome: %s | Matrícula: %s | Média: %.2f\n",
                        alunos[i].getNome(), alunos[i].getMatricula(), alunos[i].calcularMedia());
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum aluno reprovado.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade máxima de alunos da turma:\n ");
        int capacidade = scanner.nextInt();

        Turma turma = new Turma(capacidade);

        for (int i = 0; i < capacidade; i++) {
            System.out.println("\n--- Cadastro do Aluno " + (i + 1) + " ---");


            scanner.nextLine();

            System.out.print("Digite o nome do aluno:\n ");
            String nome = scanner.nextLine();

            System.out.print("Digite a matrícula do aluno: ");
            String matricula = scanner.nextLine();


            Aluno aluno = new Aluno(nome, matricula);


            aluno.cadastrarNotas();


            turma.adicionarAluno(aluno);
        }

        System.out.println("\n========================================");
        System.out.println("RESULTADO FINAL DA TURMA");
        System.out.println("========================================");

        turma.listarAprovados();
        turma.listarReprovados();

        scanner.close();
    }


}
