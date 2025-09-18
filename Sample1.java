package BitManipulation;

public class Sample1 {
    public static void EvenOdd(int n){
        int bitmask = 1;
        if((n & bitmask) == 1){
            System.out.println("Odd Number");
        }
        else{
            System.out.println("Even Number");
        }
    }
    public static void main(String[] args) {
        EvenOdd(5);
        EvenOdd(4);
    }
}
