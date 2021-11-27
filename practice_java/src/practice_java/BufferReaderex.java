package practice_java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderex {
 public void filereaderexception() throws IOException {
	 boolean bflag=false;

	 try {
	 File file=new File("C:\\Users\\MYHOME\\Desktop\\jps.txt");
	 FileReader fr=new FileReader(file);
	 BufferedReader br=new BufferedReader(fr);
	 String line="";
	 System.out.println("This is a BufferedReeader.......");
	 while((line=br.readLine() )!= null) {
		 System.out.println(line);
	 }
	fr.close();
	bflag=true;
 }
	catch(IOException e){
		e.printStackTrace();
	}
	 finally {
		 if(bflag) {
			 System.out.println("Sucesses fully read the file content");
		 }
		 else {
			 System.out.println("Faile to read the file content");
		 }
	 }
 }
	public static void main(String[] args) throws IOException {
		BufferReaderex brf=new BufferReaderex();
 brf.filereaderexception();
	}

}
