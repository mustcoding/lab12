package exercise7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

//Re-create the solutions described in Exercise 5 using the suitable subclasses in 
//java.io.Reader and java.io.Writer.  Share the solutions in Github.
public class RainFallWriter {
	
	public static void main (String [] args)
	{
		String fileName= "WriterDataDailyRainfall.txt";
		String station= "Simpang Ampat";
		String coma=",";
		int rainfall[]= {5,0,0,4,1,0};
		
		try
		{
			BufferedWriter dos = new BufferedWriter(new FileWriter(fileName));
			PrintWriter print = new PrintWriter(dos);
			// 3. Write data into data stream
			print.print(station);
			
			
		
			// Process data
			for (int rainFallData : rainfall) {
				
				// 3. Write data into data stream
				print.print(coma);
				print.print(rainFallData);
					
			}
			
			// 4. Flush for each writing
			dos.flush();
			
			// 5. Close stream
			dos.close();
			
		}catch (Exception ex){
			ex.printStackTrace();
		}
		

				
	}

}
