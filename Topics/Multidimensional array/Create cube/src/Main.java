class ArrayOperations {
    public static int[][][] createCube() {
        int[][][] array = new int[3][3][3];
        int n = 0;
        for (int i = 0; i < array.length; i++) {
            n = 0;
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = n++;
                }
            }
        }
        return array;
    }
}