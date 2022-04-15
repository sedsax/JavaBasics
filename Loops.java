package com.sedsax.javalearning;

public class Loops {
    public static void main(String[] args){

        int[] myNumbers = {12,15,18,21,24};

        for(int i=0; i<myNumbers.length; i++){
            int x = myNumbers[i] / 3 * 5;
            System.out.println(x);
        }

        for(int number : myNumbers){    //dizinin içindeki elemanları number değişkenine atar
            System.out.println(number / 3 * 5);
            //for döngüsü genellikle dizlerle ve bu şekilde kullanılır.
        }

        //-----------------------
        //While

        int j=0;
        while(j<4) {
            System.out.println(j);
            j++;
        }



    }
}
