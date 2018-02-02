import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
public class Util {
	private final String fileName = "C:\\Users\\Swati\\Desktop\\Logindata.csv";
	public void ContentReader() throws IOException {
        try (
            Reader reader = Files.newBufferedReader(Paths.get(fileName));
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
        ) {
            Iterable<CSVRecord> csvRecords = csvParser.getRecords();

            for (CSVRecord csvRecord : csvRecords) {
                // Accessing Values by Column Index

                String uid = csvRecord.get(0);
                String password = csvRecord.get(1);
               
                
                System.out.println("User ID:" + uid);
                System.out.println("Password : " + password);
                
               // System.out.println("---------------\n\n");
            }
            
      
        }
	}
        public void Screenshot1(WebDriver driver) throws IOException 
        {
        	   // Code to take Screenshot
        				File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        				// Code to save screenshot at desired location
        				FileUtils.copyFile(scrFile, new File("c:\\screenshot.png"));
        }   
 
}
