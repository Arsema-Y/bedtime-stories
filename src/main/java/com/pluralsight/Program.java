package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //user chooses a story
        System.out.println("Stories available: goldilocks.txt" +
                "\nhansel_and_gretel.txt" +
                "\nmary_had_a_little_lamb.txt");
        System.out.print("Enter the name of the story: ");
        String fileName = keyboard.nextLine();

        //pull story file
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        //connect user choice w file reader


        String storyLine = bufferedReader.readLine();
        //int for numbering system of lines
        int number = 1;

        //print chosen file
        while (storyLine != null) {
            //TODO: add sout for numbering before printing line
            /* numbering system~ printed lines
             * ++number: 1 + number vs number++: number + 1
             */
            System.out.print(number++ + ". ");
            System.out.println(storyLine);
            storyLine = bufferedReader.readLine();
        }


    }

    //story file-reader methods

}
