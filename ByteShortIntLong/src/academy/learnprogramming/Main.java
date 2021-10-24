package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myValue = 10000;

//        min and max integer value that java can store
//        wrapper class is to convert primitive to object and vice versa
//        32 bit
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

//        overflow: cycled to the next value, ie. the min value that the computer can store a Java integer
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
//        underflow: cycled around to the maximum value
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));
//        ie. skips back to the min or max number

//        8 bit
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

//        16 bit
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

//        long is used for numbers larger than the max integer value
//        L indicates it is a long value
//        64 bit
        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

//        this is an error because the default whole number value used by java is an integer
//        ie. value in the parentheses is treated as an integer, but variable is looking for byte primitive type value
//        byte myNewByteValue = (myMinByteValue / 2);

//        solution
//        use casting to convert a number from one type to another
//        put the type we want in parentheses
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);

}
