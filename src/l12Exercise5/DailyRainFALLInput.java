package l12Exercise5;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DailyRainFALLInput {
	
	public static void main (String [] args)
	{
		String referFile = "outDataDailyRainfall.txt";
		System.out.println ("Reading data from " + referFile + "\n");
		
		try {
			
			DataInputStream dis = new DataInputStream(new FileInputStream(referFile));
			
			// Variables for processing byte-based data
			int totaldailyRF = 0;
			int dailyRF = 0;
			String station = "";
			int count = 0;
			
			station = dis.readUTF();
			
			while (dis.available() > 0) {
				
				dailyRF = dis.readInt();
				totaldailyRF += dailyRF;
				count++;
			}
			
			dis.close();
			
			int averageRF = totaldailyRF / count;
			System.out.print("\nAverage daily rainfall for " + count 
					+ " day in " + station + ": " + averageRF);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
}
