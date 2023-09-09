// -------------------------------------------------------
// Assignment (#3 Q2)
// Written by: (Ibrahim Elyyan)
// For COMP 248 Section (U) – Winter 2021
// --------------------------------------------------------

//Author: Ibrahim Elyyan

//Date: March 11, 2021

// PURPOSE: Quantize the values of the pixels

import java.util.Scanner;

public class ImageQuantization {
    public static void main(String[] args) {
        // Creating an array that will eventually store the value of the pixels from user input
        int[] pixel = new int[10];
        Scanner key = new Scanner(System.in);
        // Prompting the user to enter the pixel values
        System.out.println("Please input pixel values : ");
        System.out.print("pixel 1 : ");
        pixel[0] = key.nextInt();
        System.out.print("pixel 2 : ");
        pixel[1] = key.nextInt();
        System.out.print("pixel 3 : ");
        pixel[2] = key.nextInt();
        System.out.print("pixel 4 : ");
        pixel[3] = key.nextInt();
        System.out.print("pixel 5 : ");
        pixel[4] = key.nextInt();
        System.out.print("pixel 6 : ");
        pixel[5] = key.nextInt();
        System.out.print("pixel 7 : ");
        pixel[6] = key.nextInt();
        System.out.print("pixel 8 : ");
        pixel[7] = key.nextInt();
        System.out.print("pixel 9 : ");
        pixel[8] = key.nextInt();
        System.out.print("pixel 10 : ");
        pixel[9] = key.nextInt();
        // Determining the correct quantized value
        for (int i = 0; i < pixel.length;i++){
            if (pixel[i]>=0 && pixel[i]<=20) {
                pixel[i] = 10;
            }
            else if (pixel[i]>20 && pixel[i]<=40){
                pixel[i] = 30;
            }
            else if (pixel[i] > 40 && pixel[i]<=60){
                pixel[i] = 50;
            }
            else if (pixel[i] > 60 && pixel[i]<=80){
                pixel[i] = 70;
            }
            else if (pixel[i] > 80 && pixel[i]<=100){
                pixel[i] = 90;
            }
            else if (pixel[i] > 100 && pixel[i]<=120){
                pixel[i] = 110;
            }
            else if (pixel[i] > 120 && pixel[i]<=140){
                pixel[i] = 130;
            }
            else if (pixel[i] > 140 && pixel[i]<=160){
                pixel[i] = 150;
            }
            else if (pixel[i] > 160 && pixel[i]<=180){
                pixel[i] = 170;
            } else {
                pixel[i] = 190;
            }
        }
        // Displaying result
        System.out.println("Quantized pixel values :");
        for (int j =0; j < pixel.length; j++){
            System.out.print(pixel[j] + " ");
        }
        key.close();
    }
}
