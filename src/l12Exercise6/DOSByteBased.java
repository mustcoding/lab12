package l12Exercise6;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DOSByteBased {
	
	public static void main (String [] args)
	{
		String fileName= "outDataDOSDailyRainfall.txt";
		String DSR [][]= {{"Melaka Tengah","0300061RF","Bukit Katil","63","0","0","0","0","37"},
			             {"Melaka Tengah","2222006","Cheng","20","0","0","3","0","42"},
				         {"Alor Gajah","0310281RF","Durian Tunggal","2","0","0","3","0","8"},
				         {"Alor Gajah","2421003","Simpang Ampat","0","0","4","1","0","6"},
				         {"Jasin","2225044","Chohong","6","0","0","21","0","39"},
				         {"Jasin","2125002","Telok Rimba","13","0","0","1","1","69"}};
		
		try
		{
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName));
			
			// 3. Write data into data stream
			
		
			for (String[] dsr : DSR)
			{
				String district = dsr[0];
				String code = dsr[1];
				String station = dsr[2];
				String rainfall[] = {dsr[3],dsr[4],dsr[5],dsr[6],dsr[7],dsr[8]};
	
				dos.writeUTF(district);
				dos.writeUTF(code);
				dos.writeUTF(station);
				
				for (String RainFall : rainfall)
				{
					dos.writeInt(Integer.parseInt(RainFall));
				}
			}
			
			/*for (int r=0 ; r<DSR.length ; r++)
			{
				for (int c=0 ; c<DSR.length ; c++)
				{
					String district = DSR[r][0];
					String code = DSR[r][1];
					String station = DSR[r][2];
					String rainfall[] = {DSR[r][3],DSR[r][4],DSR[r][5],DSR[r][6],DSR[r][7],DSR[r][8]};
					
					dos.writeUTF(district);
					dos.writeUTF(code);
					dos.writeUTF(station);
					
					for (String RainFall : rainfall)
					{
						dos.writeInt(Integer.parseInt(RainFall));
					}
				}
			
				
			}*/
			
				
			// 4. Flush for each writing
			dos.flush();
			
			
			// 5. Close stream
			dos.close();
			
			System.out.println("Rainfall data has been written to the file: " + fileName);
			
		}catch (Exception ex){
			ex.printStackTrace();
		}
			
	}

}
