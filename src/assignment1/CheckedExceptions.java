package assignment1;
import java.io.*;
public class CheckedExceptions {
	public static void main (String args[]){
	}
	  public void readFile() throws FileNotFoundException{
    String filename = "Hyderabad";
    File f = new File(filename);
    try{
    	FileReader fr = new FileReader(f);
    }catch(FileNotFoundException e){
    	e.printStackTrace();
    }
    FileReader fr = new FileReader(f);
  }
}
	
