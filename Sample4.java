package BitManipulation;

public class Sample4 {

    // Clear ith bit
    public static int Clearith(int n, int i){
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    // Update ith bit to newbit
    public static int Update(int num, int i, int newbit){
        num = Clearith(num, i);  // reassign, don't redeclare
        int bitmask = newbit << i;
        return num | bitmask;
    }

    // Keep all bits from i-th bit and above, clear lower bits
    public static int LastBit(int n, int i){
        int bitmask = (~0) << i;
        return n & bitmask;
    }

    public static void main(String[] args) {
        System.out.println(Update(10, 2, 3)); // Output: 14
        System.out.println(LastBit(10, 2));   // Output: 8
    }
}
