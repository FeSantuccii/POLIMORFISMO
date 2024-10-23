package Pessoal;

public class Main {
    public static void main(String[] args) {
        //Criando um Professor e um Aluno
        Pessoa professor = new Professor("Alan Turing", "Dr.");
        Pessoa aluno = new Aluno("Felipe Santucci", "190236"); //Nome e matricula

        //Email para professor
        String mensagemProfessor = "Esta é a sua mensagem importante, Professor.";
        professor.enviarEmail(mensagemProfessor);

        //Email para aluno
        String mensagemAluno = "Esta é a sua mensagem importante, Aluno.";
        aluno.enviarEmail(mensagemAluno);
    }
}
