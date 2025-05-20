import java.io.*;

public class FileReaderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr;
		try {
			fr = new FileReader("test.txt");
			int ch;
			while ((ch=fr.read()) != -1)
				System.out.print((char) ch + " ");
			fr.close();
		}catch (IOException e) { e.printStackTrace();}
	}

}
