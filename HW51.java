import com.sun.org.apache.xpath.internal.objects.XNumber;

public class HW51 {
    public static void main(String[] args) {
        System.out.println(isEqual(12345321));
    }

    public static boolean isEqual(int n) {
        int length = String.valueOf(n).length();
        int l = length - 1;
        char[] num = String.valueOf(n).toCharArray();
        for (int i = 0; i <= l / 2; i++) {
            if (num[i] != num[l - i]) {
                return false;
            }
        }
        return true;
    }
}
