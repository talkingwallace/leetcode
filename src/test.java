import java.util.HashMap;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Arrays;

public class test {
    public static void main(String args[]){
        Stack<Integer> a = new Stack<Integer>();
        a.push(12);
        a.push(12);
        a.push(12);
        System.out.print(a.peek());
        String i = "cao ni ma de";
        String s[] = i.split(" ");
        for(String k:s){
            System.out.print(k);
        }
    }
}
