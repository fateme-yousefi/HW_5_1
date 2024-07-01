public class HansOn1 {
    public static void main(String[] args) {
        String a = "Hello to My Colleagues";
        System.out.println(length(a));
    }
    public static int length(String Sentence){
        String[] b = Sentence.split(" ");
        String lastWorld = b[b.length-1];
        char[] last = lastWorld.toCharArray();
        int length1 = last.length;
        return length1;
    }
}
