package MovieRS;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class createModel {
	private Map<Integer,List<Integer>> dataModel = new HashMap <Integer,List<Integer>>();
	//public static void main(String[] args) throws ParseException, IOException{
	public createModel(){
		
		
		// input from u.item
		int count = 1;
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
				for(int i = 6; i < 24;i++){
					if(parts[i].equals("1")){
						if(!dataModel.containsKey(i)){
							List<Integer> value = new ArrayList<Integer>();
							value.add(Integer.parseInt(parts[0]));
							this.dataModel.put(i, value);
						}else{
							List<Integer> value = dataModel.get(i);
							value.add(Integer.parseInt(parts[0]));
							this.dataModel.put(i, value);
						}
					}
				}
				count++;
			  }
//			  for(int i = 6; i < 24;i++){
//				  System.out.print(i+": ");
//				  System.out.println(dataModel.get(i));
//			  }
			  //Close the input stream
			  in.close();
		}catch (Exception e){//Catch exception if any
			  System.err.println("Error: " + e.getMessage());
			  System.out.print(count);
		}
	}
	public Map<Integer,List<Integer>> getDataModel(){
		return this.dataModel;
	}
}