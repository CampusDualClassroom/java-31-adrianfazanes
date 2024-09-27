package com.campusdual.classroom;

import java.io.BufferedReader;
import java.io.FileReader;

public class Exercise31 {

    public static void main(String[] args) {
        try (FileReader fr = new FileReader("src/main/resources/lorem.txt")) {
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while((linea=br.readLine())!=null)
                System.out.println(linea);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
