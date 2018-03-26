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


    public Number add(Number other) {
        //--o -----------------------------------------
        StringBuilder sbDigit = new StringBuilder();
        StringBuilder sbOther = new StringBuilder();
        //--o -----------------------------------------
        sbOther.append(other.getDigit());

        Map<Character,Integer> mapa = new HashMap();
        char lletra = 65;
        for (int i = 10, count = 0; i <= 15; i++, count ++) {
            lletra += count;
            mapa.put(lletra, i);
            count = 0;
        }
        //--o -----------------------------------------
        for (int i = 0; i < sbOther.length(); i++) {
            if(mapa.containsKey(sbOther.charAt(i))){
                System.out.println("Mapa " + mapa.get(sbOther.charAt(i)));
            }
        }

        StringBuilder rslt = new StringBuilder();
        //System.out.println(mapa);
        rslt.append(other.getDigit());
        Number nb = new Number(rslt.toString());

        return nb;
    }

    @Override
    public String toString() {
        return "Number{" +
                "digit='" + digit + '\'' +
                '}';
    }
}
