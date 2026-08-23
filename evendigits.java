class evendigits {
    public static void main(String[] args) {
        int[] nums = { 23, 234, 1234, 1, 16 };
        System.out.println("Even digits count is : " + findNum(nums));

        System.out.println("Count of digits entered : " + digits(-12345));
        System.out.println("Count of digits entered : " + digits2(-12345));
    }

    static int findNum(int[] nums) {
        int count = 0;
        for (int num : nums) { // every number in num[]
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    // function to check whether a number contains even digits or not
    static boolean even(int num) {
        int numOfDigits = digits(num);

        /*
         * if(numOfDigits%2==0){
         * return true;
         * }
         */

        return numOfDigits % 2 == 0;
        // statement returns true is true ||| false if false
    }

    static int digits2(int num) {
        if (num < 0) {
            num = num * -1;
        }
        return (int) (Math.log10(num)) + 1;
    }

    // counts the number of digits in the user entered num
    static int digits(int num) {

        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }

        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

}
