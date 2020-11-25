import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.sql.Date;
import java.io.FileNotFoundException;

import java.awt.List;

public class CSVReader {

	String csvFile;
	public static final String delimiter = ",";

	public CSVReader(String csvfile) {
		csvFile = csvfile;
	  }
	

	public static void write(String csvFile) {

		try {
			FileWriter fw = new FileWriter(csvFile, true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);

			// Date date = new Date();

			// pw.println(actionName + "," + date.toString());
			pw.flush();
			pw.close();

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static ArrayList<String[]> read(String csvFile) {
		ArrayList<String[]> list = new ArrayList<String[]>();
		try {
			File file = new File(csvFile);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			String line = "";

			String[] tempArr;
			while ((line = br.readLine()) != null) {
				tempArr = line.split(delimiter);
				list.add(tempArr);
			}
			br.close();

		} catch (IOException ex) {
			ex.printStackTrace();
		}

		return list;
	}

	public static int findCategory(String category, ArrayList<String[]> list) {
		int index = 0;
		for (int i = 0; i < list.get(0).length; i++) {
			if (category.equals(list.get(0)[i])) {
				index = i;
			}
		}
		return index;
	}

	public static ArrayList<String> findByName(String name, int column, ArrayList<String[]> list) {
		ArrayList<String> list2 = new ArrayList<String>();
		for (int i = 0; i < list.size(); i++) {
			if (name.equals(list.get(i)[column])) {
				for (String strings : list.get(i)) {
					list2.add(strings);
				}
			}
		}
		return list2;
	}

	public static void main(String[] args) {


		// csv file to read
		String csvFile = "C:/Users/Przemyslaw/Projects/ZooService/src/Lol.csv";
		CSVReader csv = new CSVReader(csvFile);
		ArrayList<String[]> list = csv.read(csvFile);
		ArrayList<String> list2 = csv.findByName("super", csv.findCategory("Name", list), list);
		for (String strings : list2) {
			System.out.println(strings);
		}


		// for (int i = 0; i < args.length; i++) {
		// System.out.println(list[i][0]);
		// }
	}

}
