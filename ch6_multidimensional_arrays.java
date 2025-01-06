public class ch6_multidimensional_arrays {
    public static void main(String[] args) {
        // multidimensional arrays means every array is array of itself
//        int[] marks; //a 1d arrays
        int[][] flats; //a 2d arrays
        flats = new int [2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;
//        System.out.println(flats[0][2]);  //normal method
//        System.out.println(flats.length);  //gives 2 as flats length is just 2
        System.out.println("printing a 2d array using for loop");
        for(int i=0; i<flats.length; i++){
            for(int j=0; j<flats[i].length;j++){
                System.out.printf(flats[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}

