package l12Exercise6;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DISByteBased {
	
	public static void main (String [] args)
	{
		String referFile = "outDataDOSDailyRainfall.txt";
		System.out.println ("Reading data from " + referFile + "\n");
		
		try {
			DataInputStream dis = new DataInputStream(new FileInputStream(referFile));
			
			// Variables for processing byte-based data
			int totaldailyRF = 0;
			int dailyRF = 0;
			
			String district = "";
			String code= "";
			String station = "";
			int count = 0;
			
			
			while (dis.available() > 0)
			{
				district = dis.readUTF();
				System.out.println ("District : "+district);
				
				code = dis.readUTF();
				System.out.println ("Code ID : "+code);
				
				station = dis.readUTF();
				System.out.println ("Station : "+station);
				
				
				System.out.println("Data Rainfall : ");
				for (int i=0 ; i<6 ; i++)
				{
					dailyRF = dis.readInt();
					System.out.print(dailyRF+" ");
					totaldailyRF += dailyRF;
					count++;
				}
				
				int averageRF = totaldailyRF / count;
				System.out.print("\nAverage daily rainfall for " + count 
						+ " day in " + station + ": " + averageRF);
				System.out.println("\n\n");
				
				dailyRF = 0;
				count = 0;
				totaldailyRF = 0;
			}
		
			dis.close();
			
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	

}
