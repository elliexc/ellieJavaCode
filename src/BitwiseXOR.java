/**
 * author: zhanghongtao
 * date  : 2018-10-30 2:22 PM
 * email : zhtxcster@gmail.com
 */
public class BitwiseXOR {
    public static void main(String[] args)
    {
        //if int a = 010 java considers it as octal value of 8 as number starts with 0.
        int a = 0x0005;
        int b = 0x0007;

        // bitwise and
        // 0101 & 0111=0101
        System.out.println("a&b = " + (a & b));

        // bitwise and
        // 0101 | 0111=0111
        System.out.println("a|b = " + (a | b));

        // bitwise xor
        // 0101 ^ 0111=0010
        System.out.println("a^b = " + (a ^ b));

        // bitwise and
        // ~0101=1010
        System.out.println("~a = " + ~a);

        // can also be combined with
        // assignment operator to provide shorthand
        // assignment
        // a=a&b
        a &= b;
        System.out.println("a= " + a);
    }
}
