package com.pluralsight;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--Welcome to Children Story Reader--");
        System.out.print("Choose a story (goldilocks,hansel_and_gretel, or marry_had_a_little_lamb): ");
        String fileName = scanner.nextLine();

        try {
            FileReader fileReader = new FileReader( "src/main/resources/" + fileName + ".txt");
            BufferedReader bufReader = new BufferedReader(fileReader);

            String line;
            int lineNumber = 1;

            while ((line = bufReader.readLine()) != null) {
                System.out.println(lineNumber + ":" + line);
                lineNumber++;
                try {
                    Thread.sleep(600);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            bufReader.close();


        }catch (Exception e) {
            System.out.println("Story not found, try again.");

        }
    }
}
