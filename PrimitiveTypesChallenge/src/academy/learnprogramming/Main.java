package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        byte byteNum = 20;
        short shortNum = 10;
        int intNum = 400;
        long longNum = 50000L + 10L * (byteNum + shortNum + intNum);
        System.out.println(longNum);
    }
}
