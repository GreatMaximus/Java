package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class Reader {
    public static void main(String[] args) {
        BufferedReader file = null;
        String [] array;

        int count = 0;
        try{
            file = new BufferedReader(new FileReader("src/com/company/Max.txt"));
            String line;
            String formatedLine;
            while((line = file.readLine()) != null){
                formatedLine = "";
                for(int i = 0; i<line.length();i++){
                    if(line.charAt(i) != ','){
                        formatedLine += line.charAt(i);
                    }
                }
                System.out.println(line);
                System.out.println(formatedLine);
                array = formatedLine.split(" ");
                System.out.println(Arrays.toString(array));
                for (int i = 0; i < array.length; i++){

                        if(array[i].equals("Baby") || array[i].equals("baby")){
                            count++;
                        }
                    }

                }

            System.out.println(count);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}



