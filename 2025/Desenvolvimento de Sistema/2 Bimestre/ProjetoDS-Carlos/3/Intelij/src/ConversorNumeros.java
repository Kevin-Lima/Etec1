public class ConversorNumeros {

    //esse metodo so pode ser executado dentro de um try catch, pq o 'throws NumberFormatException' esta dizendo que esse metodo pode dar erro, e se ele for chamado fora de um try catch e der erro, o programa sera encerrado
    public static int stringParaInt(String str) throws NumberFormatException {
        return Integer.parseInt(str);
    }

    public static double stringParaDouble(String str) throws NumberFormatException {
        return Double.parseDouble(str);
    }

    public static String intParaString(int num) {
        return Integer.toString(num);
    }

    public static String doubleParaString(double num) {
        return String.format("%2f.", num);
    }
}