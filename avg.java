import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class avg {
    public static void main(String[] args) {
        int[] numbers = {10, 10, 30, 10, 10, 20};
        int sum=0;
        for (int i=0; i<numbers.length; i++){
                sum+=numbers[i];
        }
        double avgg= (sum/numbers.length);
        System.out.println(avgg);
    }
}
