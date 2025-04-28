public class Vendedor {
    private int id;
    private String nome;
    private double salarioBase;

    public Vendedor(int id,String nome, double salarioBase) {
        this.id = id;
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public int getId() {
        return id;
    }

    public String getNome(){
        return nome;
    }

    public Double getSalarioBase(){
        return salarioBase;
    }

    public double calcularComissao(double valorVendido){
        return valorVendido * (0.03+(salarioBase * 0.00001));
    }



}
