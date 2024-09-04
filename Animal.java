package Modificadores;

public class Animal {


private String nome;
private String cor;
private String tamanho;
private String peso;
private String raca;


public Animal() {
}


protected String getNome() {
return nome;
}

protected void setNome(String nome) {
this.nome = nome;
}

protected String getCor() {
return cor;
}

protected void setCor(String cor) {
this.cor = cor;
}

protected String getTamanho() {
return tamanho;
}

protected void setTamanho(String tamanho) {
this.tamanho = tamanho;
}

protected String getPeso() {
return peso;
}

protected void setPeso(String peso) {
this.peso = peso;
}

protected String getRaca() {
return raca;
}

protected void setRaca(String raca) {
this.raca = raca;
}
}


class Default {
public static void main(String[] args) {

Animal animal = new Animal();


animal.setNome("Leão");
animal.setCor("Amarelo");
animal.setTamanho("Grande");
animal.setPeso("190kg");
animal.setRaca("Panthera leo");


System.out.println("Nome: " + animal.getNome());
System.out.println("Cor: " + animal.getCor());
System.out.println("Tamanho: " + animal.getTamanho());
System.out.println("Peso: " + animal.getPeso());
System.out.println("Raça: " + animal.getRaca());
}
}
