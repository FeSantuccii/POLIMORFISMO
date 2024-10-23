package Pessoal;

public class Aluno extends Pessoa { //Aluno tem matricula
    private String matricula; //mesmo não usada, é o diferencial do aluno

    public Aluno(String nome, String matricula) {
        super(nome);
        this.matricula = matricula;
    }

    //usando gerarSaudacao
    @Override //override para manter polimorfismo
    public String gerarSaudacao() {
        return "Olá Aluno " + nome + "!";
    }
}