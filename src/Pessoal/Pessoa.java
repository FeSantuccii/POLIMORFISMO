package Pessoal;

public abstract class Pessoa { //abstrata
 protected String nome;

 public Pessoa(String nome) {
     this.nome = nome;
 }

//metodo de saudação
 public abstract String gerarSaudacao();

 //metodo de email
 public void enviarEmail(String mensagem) {
     //usando a saudação
     String saudacao = gerarSaudacao();
     System.out.println(saudacao + "\n\n" + mensagem);
 }
}
