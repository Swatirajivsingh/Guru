import java.io.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadData {
	public String s;
	public String fileName = "C:\\Users\\Swati\\Desktop\\Logindata.csv";
	public FileWriter fileWriter;
	public BufferedWriter bufferedWriter;
	public Scanner in;


public void ReadData()
{
     try {
            FileReader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);
 
            String line;
 
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 

 public static void main(String [] args) {
         ReadData sd = new ReadData();
         sd.ReadData();
     
 }

}
