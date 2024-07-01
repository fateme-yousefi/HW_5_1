public class Lecture5 {
    public static void main(String[] args) {
        String[] name = {"F", "Z", "A", "B", "C"};
//        System.out.println(name[0]);
        name[name.length-1]="D";
//        System.out.println(name[name.length - 1]);

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
//        System.out.println(numbers[4]);
        numbers[numbers.length-1]=20;
//        System.out.println(numbers[numbers.length-1]);

        for (int i=0; i<name.length; i++){
//            System.out.println(name[i]);
        }
        int n=0;
        while(n<10){
            System.out.println(n);
            n++;
        }

        int m =0;
        do {
            System.out.println(m);
            m++;}
        while (m<10);

    }
}
