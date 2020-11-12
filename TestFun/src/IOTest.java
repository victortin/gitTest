import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.*;


public class IOTest {

	public static void main(String[] args) {
		BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            try {
				inputStream = new BufferedReader(new FileReader("xanadu3.txt"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            try {
				outputStream = new PrintWriter(new FileWriter("characteroutput.txt"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

            String l;
            try {
				while ((l = inputStream.readLine()) != null) {
				    outputStream.println(l);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        } finally {
            if (inputStream != null) {
                try {
					inputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
		
	}
	
	
	
}


