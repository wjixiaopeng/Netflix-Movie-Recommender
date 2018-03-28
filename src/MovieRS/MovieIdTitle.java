package MovieRS;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieIdTitle {
	private Map<Integer,String> IdTitle;
	public MovieIdTitle(){
		IdTitle = new HashMap<Integer,String>();
		int count = 0;// this will help to count will line has error
		try{
			  // Open the file that is the first 
			  // command line parameter
			  FileInputStream fstream = new FileInputStream("data/movieinformation.txt");
			  // Get the object of DataInputStream
			  DataInputStream in = new DataInputStream(fstream);
			  BufferedReader br = new BufferedReader(new InputStreamReader(in));
			  String curLine;
			  //Read File Line By Line
			  
			  while ((curLine = br.readLine()) != null){
			  // split current line's string with "|" and store them in temp that is a arraylist
				String[] parts = curLine.split("	");
				IdTitle.put(Integer.parseInt(parts[0]), parts[1]);
				count++;
			  }
//			 
			  in.close();
		}catch (Exception e){//Catch exception if any
			  System.err.println("Error: " + e.getMessage());
			  System.out.print(count);
		}
	}
	public Map<Integer, String> getIdTitle() {// you can use this function to invoke the map
		return IdTitle;
	}
	public String getTitle(int movieID){
		return this.IdTitle.get(movieID);
	}
	
}

