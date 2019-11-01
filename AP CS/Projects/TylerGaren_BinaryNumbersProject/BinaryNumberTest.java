public class BinaryNumberTest {
    public static void main() {
        BinaryNumber num1 = new BinaryNumber(10); // 0xa, 0b1010
        BinaryNumber num2 = new BinaryNumber("0xc"); // 12, 0b1100
        if (num1.toInt() != 10 || num2.toInt() != 12)
            System.out.println("toInt() Fail");
        else System.out.println("toInt() Pass");
        if (!num1.toBinaryString().equals("0b1010") || !num2.toBinaryString().equals("0b1100"))
            System.out.println("Incorrect toBinaryString()");
        else System.out.println("toInt() Pass");
        if (!num1.toHexString().equals("0xa") || !num2.toHexString().equals("0xc"))
            System.out.println("Incorrect toHexString()");
        else System.out.println("toInt() Pass");
        if (num1.add(num2).toInt() != 22)
            System.out.println("add() Fail");
        else System.out.println("add() Pass");
        
    // BinaryNumber add(BinaryNumber x);
    // BinaryNumber negate();
    // BinaryNumber subtract(BinaryNumber x);
    // BinaryNumber shiftLeft();
    // BinaryNumber uShiftRight();
    // BinaryNumber and(BinaryNumber x);
    // BinaryNumber or(BinaryNumber x);
    // BinaryNumber xOr(BinaryNumber x);
    // String toBinaryString();
    // String toHexString();
    }
}