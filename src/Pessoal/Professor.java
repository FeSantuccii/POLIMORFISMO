package Pessoal;

public class Professor extends Pessoa { //herança com privado titulo
    private String titulo;

    public Professor(String nome, String titulo) {
        super(nome);
        this.titulo = titulo; //seria um Dr
    }

    //Usando gerarSaudacao
    @Override
    public String gerarSaudacao() {
        return "Olá Prof. " + titulo + " " + nome + "!";
    }
}
