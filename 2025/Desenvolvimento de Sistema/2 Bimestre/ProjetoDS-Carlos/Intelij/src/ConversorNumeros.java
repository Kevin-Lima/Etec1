
public class ConversorNumeros {

    public int stringInt(String numero){
        return Integer.parseInt(numero);
    }

    public double stringDouble(String numero){
        return Double.parseDouble(numero);
    }

    public String intString(int numero){
        return Integer.toString(numero);
    }

    public String doubleString(double numero){
        return Double.toString(numero);
        //return String.format("%.2f",numero);

    }

}
