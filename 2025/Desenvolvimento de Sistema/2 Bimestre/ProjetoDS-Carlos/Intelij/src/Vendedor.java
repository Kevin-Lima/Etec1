public class Vendedor {
    private String nome;
    private double salarioBase;

    public Vendedor(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome(){
        return nome;
    }

    public Double getSalarioBase(){
        return salarioBase;
    }

    public double calcularComissao(double valor){
        return valor * (0.03+(salarioBase * 0.00001));
    }

}
