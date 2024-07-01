public class HW52 {
    public static void main(String[] args) {
        String a = "Hello to My Colleagues";
        System.out.println(lastWorld(a));
    }

    public static int lastWorld(String Sentence) {
        char[] SentenceCh = Sentence.toCharArray();
        int length = 0;
        int i = SentenceCh.length - 1;
        while (SentenceCh[i] != ' ') {
            length += 1;
            i--;
        }
        return length;
    }
}
