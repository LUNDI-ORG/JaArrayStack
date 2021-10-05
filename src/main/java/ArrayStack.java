import java.util.Scanner;
import java.util.Stack;
    public class ArrayStack{
        static Scanner z=new Scanner(System.in);
    public static void main(String[] args) {
        Array as = new Array(3);
        as.set(0,"Aluncedo");
        as.set(1,"Lundi");
        as.set(2,"Langa");
        System.out.println(as.get(1));
        Array ss = new Array(1);
        ss.set(0, "Sakhumzi Chutshela");
        System.out.println(ss.get(0));
        System.out.println(ss.size());
        as.add(3, "Akhona");
        System.out.println(as.get(3));
        as.remove(3);
        as.resize();
        System.out.println(as.get(3));
        
    
}
        }
