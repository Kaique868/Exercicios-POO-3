import java.util.Scanner;

public class Aluno {
    private String nome;
    private String matricula;
    private double[] notas;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas= new double[4];

    }

    public void cadastrarNotas(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cadastrando as notas do(a) aluno(a) " +this.nome+ ":\n");

        for (int i=0; i<4; i++){
            System.out.print("Informa a nota " +(i+1)+ ":\n");
            notas[i]= scanner.nextDouble();
        }
    }

    public double calcularMedia(){
        double soma = 0;
        for (int i = 0; i < notas.length; i++){
            soma+= notas[i];
        }
        return soma/notas.length;
    }

    public boolean verificarAprovacao() {
        double media = calcularMedia();
        return media >= 7.0;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }
}
