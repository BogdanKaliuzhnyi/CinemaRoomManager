class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {
        System.out.println(twoDimArray[0][0] + " " + twoDimArray[0][twoDimArray[0].length - 1] + "\n"
                + twoDimArray[twoDimArray.length - 1][0] + " " +
                twoDimArray[twoDimArray.length - 1][twoDimArray[twoDimArray.length - 1].length - 1]);
    }
}