import java.util.Scanner;
public class ch6_practice_set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Q1
//        float[] random ={50.6f,56.8f,68.3f,89.7f,23.45f};
//        float sum =0;
////        for (int i=0; i<random.length;i++){
////            sum += random[i];
////        }
//        //this can be used
//        for (float element:random){
//            sum =sum+element;
//        }
//        System.out.println(sum);


        //Q2
//        int [] arr = {65,78,21,79,32,56,47,62,32,64,18,72,51,66,52,76,24,15,48,16,25,37,26};
//        System.out.println("enter the number please");
//        int num = sc.nextInt();
//        boolean isinarray =false;  //here we consider that no is not present in array
//        for (float element:arr){  //if no is now present for loop had to prove it
//            if (num==element){
//                isinarray =true; //when boolean become true loop breaks
//                break;
//            }
//        }
//        if (isinarray){  //means if isinarray is true
//            System.out.println("yes\n given number is  present in this array");
//        }
//        else{
//            System.out.println("no\n number is not present in this array");
//        }


        //Q3
//        int [] phymarks ={79,56,45,82,19,67,94,100,36,74,58,25,46,82,96,91};
//        int sum =0;
//        //this can be used
//        for (float element:phymarks){
//            sum += element;
//        }
//        double average = sum/phymarks.length;
//        System.out.println("the average value of marks"+average);

        //Q4
        //AAM Zindgi
//        int [][] mat1 = new int[2][3];
//        mat1[0][0] = 2;
//        mat1[0][1] = 6;
//        mat1[0][2] = 8;
//        mat1[1][0] = 4;
//        mat1[1][1] = 5;
//        mat1[1][2] = 7;
        //MENTOS ZINDGi
//        int [][] mat1 = {{2,3,4},
//                          {5,6,7}};
//        int [][] mat2 = {{5,6,7},
//                          {7,4,1}};
//        int [][] result = {{0,0,0},
//                           {0,0,0}};
//        for(int i=0; i<mat1.length; i++){
//            for(int j =0; j<mat1[i].length; j++){
//                result[i][j] = mat1[i][j]+mat2[i][j];
//                System.out.printf("setting values for i=%d and j=%d\n",i,j);
//            }
//        }
//        for(int i=0; i<mat1.length; i++){
//            for(int j =0; j<mat1[i].length; j++){ //row number of times
//                result[i][j] = mat1[i][j]+mat2[i][j];// column number of times
//                System.out.print(result[i][j]+"\t");
//            }
//            System.out.println("");
//        }


        //Q5

        /*to reverse an array we have to just change interchange the terms as array[i] to array[l-1-i]th term
        i.e. let arr{a,b,c,d,e} ,length 5 and index=0,1,2,3,4 and new array be  vrr
        we have to replace a->e and b->d while c be same...........means arr[0] = vrr[5-1-0=4] and arr[1] = vrr[5-1-1=3]
        it means from middle term the position of objects will be interchanges
        ***maths.floorDiv***be used
         */
//        int [] arr = {65,78,21,79,32,56,47,48,16,25,37,26};
//        int n = Math.floorDiv(arr.length,2);  //this will give the lowest int of decimal places like 2.45 -> 2
//        int l = arr.length;
//        int temp;
//        for(int i=0; i<n;i++ ){
//            //interchanging of number as arr[i] -> arr[l-1-i]
//            //arr[arr.length-1-i] = arr[i]; this is totally wrong as the remaining values remains same
//            //so for swapping two numbers....|3| |4| we should take a temporary box as follow
//            temp =arr[i]; //means temp = 65 now arr[0] become blank
//            arr[i]=arr[l-i-1]; //means arr[11](18) goes to arr[0](65) now arr[11] is blank
//            arr[l-i-1] = temp; // means arr[11]() takes value of temp(65) and here swapping completes
//        }
//        for (int i : arr) {
//            System.out.print(i + "\t");
//        }


        //Q6
//        int [] arr = {65,78,21,79,32,56,47,48,16,25,37,26};
//        int max = Integer.MIN_VALUE;
//        for(int e :arr){
//            if(max<e){
//                max = e;
//            }
//        }
//        System.out.println("thE value of the maximum element in this array is: " +max);

        //Q07
//        int min = Integer.MAX_VALUE;
//        int [] arr = {65,78,21,79,32,56,47,48,16,25,37,26};
//        for(int e :arr){
//            if(min>e){
//                min = e;
//            }
//        }
//        System.out.println(min);


        //Q8
//        int [] arr = {00,10,20,30,40,50,60,70,80,90,100};
//        boolean sortedarray = true; //when using boolean like this.... understand the  one breaking cmd
//        for(int i=0; i<arr.length-1;i++){
//            if(arr[i]>arr[i+1]){
//                sortedarray = false;
//                break;
//            }
//        }
//        if(sortedarray){
//            System.out.println("array is sorted");
//        }
//        else{
//            System.out.println("array is not sorted");
//        }
    }
}
