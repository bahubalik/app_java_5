package app_java_5;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class A {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("D://test/test2.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("satish");
			bw.newLine();
			bw.write("anand");
			bw.newLine();
			bw.write("pampu");
			bw.close();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
