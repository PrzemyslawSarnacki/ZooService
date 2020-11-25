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

    public static String csvFile;
    public static final String delimiter = ",";

    public CSVReader(String csvfile) {
        csvFile = csvfile;
    }

    public final void write(String[] argumentsToWrite) {

        try {
            FileWriter fw = new FileWriter(csvFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            // Date date = new Date();

            pw.println(argumentsToWrite[0] + "," + argumentsToWrite[1] + "," + argumentsToWrite[2]);
            pw.flush();
            pw.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public final ArrayList<String[]> read() {
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
    
    public final int getIncrementedId(ArrayList<String[]> list) {
        int id = 0;
        int idPosition = this.findCategory("id", list);
        id = Integer.parseInt(list.get(list.size()-1)[idPosition]);
        return id + 1;
    }

     

    public final int findCategory(String category, ArrayList<String[]> list) {
        int index = 0;
        for (int i = 0; i < list.get(0).length; i++) {
            if (category.equals(list.get(0)[i])) {
                index = i;
            }
        }
        return index;
    }

    public final ArrayList<String> findByName(String name,  ArrayList<String[]> list) {
        ArrayList<String> foundList = new ArrayList<String>();
        int column = this.findCategory("Name", list);
        for (int i = 0; i < list.size(); i++) {
            if (name.equals(list.get(i)[column])) {
                for (String strings : list.get(i)) {
                    foundList.add(strings);
                }
            }
        }
        return foundList;
    }
     


    public static void main(String[] args) {
        // csv file to read
        String csvFile = "C:/Users/Przemyslaw/Projects/ZooService/src/Lol.csv";
        CSVReader csv = new CSVReader(csvFile);
        ArrayList<String[]> list = csv.read();
        ArrayList<String> list2 = csv.findByName("super", list);
        for (String strings : list2) {
            System.out.println(strings);
        }
        String[] argsStrings = {"11","warr","gsp"};
        csv.write(argsStrings);
        System.out.println(
        csv.getIncrementedId(list)
        );
    }

}
