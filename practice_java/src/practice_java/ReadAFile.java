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
		try {
			File file=new File("C:\\Users\\MYHOME\\Desktop\\jps.txt");
			FileReader fr=new FileReader(file);
			int content;
			while((content=fr.read())!=-1) {
				System.out.print((char)(content));
		}
			
	}
		catch(IOException e) {
			e.printStackTrace();
		}
		}
	public static void main(String[] args) throws IOException {
		ReadAFile raf=new ReadAFile();
		raf.exceptaion();
		
		raf.ExceptionTryCatch();

	}

}
