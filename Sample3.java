package BitManipulation;

public class Sample3 {
    public static int setIth(int n, int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }
    public static void main(String[] args) {
        System.out.println(setIth(5, 2));
    }
}
