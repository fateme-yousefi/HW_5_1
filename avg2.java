public class avg2 {
    public static void main(String[] args) {
        int[] numbers = {10, 10, 30, 10, 10, 20};
        System.out.println(avg(numbers));
    }
    public static double avg(int[] adad){
        int sum=0;
        for (int i=0; i<adad.length; i++){
            sum+=adad[i];
        }
        double avgg= (sum/adad.length);
        return avgg;

    }
}
