package l12Exercise5;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DailyRainfallOutput {

	public static void main (String [] args)
	{
		String fileName= "outDataDailyRainfall.txt";
		String station= "Simpang Ampat";
		int rainfall[]= {5,0,0,4,1,0};
		
		try
		{
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName));
			
			// 3. Write data into data stream
			dos.writeUTF(station);
		
			// Process data
			for (int rainFallData : rainfall) {
				
				// 3. Write data into data stream
				
				dos.writeInt(rainFallData);
				
				
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
