public class isPrime {
    public static void main(String[] args) {
        System.out.println(avval(121));
    }

    public static boolean avval(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
