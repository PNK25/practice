package practice_java;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadAFile {
	public void exceptaion() throws IOException {
		File file=new File("C:\\Users\\MYHOME\\Desktop\\jps.txt");
		FileReader fr=new FileReader(file);
		int content;
		while((content=fr.read())!=-1) {
			System.out.print((char)(content));
			
		}
	}
   
	public void ExceptionTryCatch() {
		boolean bFlag=false;
		try {
			File file=new File("C:\\Users\\MYHOME\\Desktop\\jps.txt");
			FileReader fr=new FileReader(file);
			int content;
			while((content=fr.read())!=-1) {
				System.out.print((char)(content));
		}
			bFlag=true;	
	}
		
		catch(IOException e) {
			e.printStackTrace();
		}
		finally{
			if(bFlag) {
				System.out.println("Sucesses fully readad file content");
			}
			else {
				System.out.println("Faile to read the File content");
			}
		}
		}
	public static void main(String[] args) throws IOException {
		ReadAFile raf=new ReadAFile();
		raf.exceptaion();
		
		raf.ExceptionTryCatch();

	}

}
