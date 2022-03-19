import java.io.Console;
import java.io.PrintWriter;
import java.util.*;


public class java_tut {

    public static int add(int x, int y){
        return x+y;
    }


    static String number = new String();

    public static void main(String[] args){
        test1 p = new test1(3,3);

        java_tut a = new java_tut();
        System.out.println(a.add(3,5));
        ArrayList<Integer> b = new ArrayList(Arrays.asList(7,1,2,4,5,6));
        Collections.sort(b);
        for (int k : b){
            System.out.println(k);
        }

        for (int i=0; i < b.size(); i++){
            System.out.println(b.get(i));
        }



//        Scanner read = new Scanner(System.in);
//        int x = read.nextInt();
//        System.out.println("Welcome " + x);

//        switch (number){
//            case "Why":
//                break;
//            case "Maybe":
//                break;
//        }
//
//
//        do{
//            System.out.println(ok.length);
//        }while (ready);

    }
}
