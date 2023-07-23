import java.util.Scanner;

public class NumberOfOneBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc .nextInt();
        System.out.println(findNumOf1Bits(num));
    }
    public static int findNumOf1Bits(int num)
    {
        int count = 0;
        while(num!=0)
        {
            if((num & 1)==1)
            {
                count++;
            }
            num = num >> 1;
        }
        return count;
    }
}