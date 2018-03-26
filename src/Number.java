import java.util.HashMap;
import java.util.Map;

public class Number {

    public String digit;

    Number(String digit) {
        this.digit = digit;
    }

    public String getDigit() {
        return digit;
    }

    public void setDigit(String digit) {
        this.digit = digit;
    }

    //--o Creamos un hashMap con los valores hexadecimales de A - F
    private Map<Character, Integer> constructionMap(){
        Map<Character,Integer> mapa = new HashMap();
        char lletra = 65;
        for (int i = 10, count = 0; i <= 15; i++, count ++) {
            lletra += count;
            mapa.put(lletra, i);
            count = 0;
        }
        return mapa;
    }


    public Number add(Number other) {
        //--o -----------------------------------------
        StringBuilder sbDigit = new StringBuilder();
        StringBuilder sbOther = new StringBuilder();
        StringBuilder sbResult = new StringBuilder();
        //--o -----------------------------------------
        sbDigit.append(this.getDigit());
        sbOther.append(other.getDigit());
        //--o -----------------------------------------
        int valorDigit = 0 ;
        int valorOther = 0;
        int result = 0;
        for (int i = 0; i < sbOther.length(); i++) {
            valorDigit = Integer.parseInt(String.valueOf(sbDigit.charAt(i)));
            if(constructionMap().containsKey(sbOther.charAt(i))) {
                valorOther =  constructionMap().get(sbOther.charAt(i));
            } else {
                valorOther = Integer.parseInt(String.valueOf(sbOther.charAt(i)));
            }

            result = valorDigit + valorOther;
            if (constructionMap().containsKey(result)){
                sbResult.append(constructionMap().get(result));
            } else {
                sbResult.append(String.valueOf(result));
            }

        }

        //sbResult.append(other.getDigit());
        Number nb = new Number(sbResult.toString());

        return nb;
    }

    @Override
    public String toString() {
        return "Number{" +
                "digit='" + digit + '\'' +
                '}';
    }
}
