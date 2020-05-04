package com.dominikawebsite.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExampleWithException {

    public void readFromFile () throws IOException {
        int total = 0;
        BufferedReader reader = null; //initializing before try catch finally, so finally can see this variable
        try {
            reader = new BufferedReader(new FileReader("C:\\Dominika\\Numbers.txt"));
            String line = null;
            while ((line = reader.readLine()) != null) {
                total += Integer.valueOf(line);
                System.out.println("Counting: "+total);
            }
            System.out.println("Total: " + total);
        }
        catch(FileNotFoundException e){
            System.out.println("File not found: "+ e.getMessage());
        }
        catch(NumberFormatException e ){
            System.out.println("Invalid value: "+ e.getMessage());
        }
        catch(IOException e){ // base class of FileNotFoundException and that's why it's lower than FileNotFoundException
            System.out.println("Error interracting with file: "+ e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            try{ //there might be some issues with closing the file so we should also handle that error
            if (reader !=null)
            reader.close();}
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReaderExampleWithException myReader = new BufferedReaderExampleWithException();
        myReader.readFromFile();
        System.out.println("Koniec programu");
    }
}
