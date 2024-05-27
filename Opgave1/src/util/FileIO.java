package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {
    public ArrayList<String> readData(String path) {
        ArrayList<String> dataList = new ArrayList<>();
        File file = new File(path);
        if(!file.exists()) {                    // If no file exists, we create an empty file
            saveData("header", new ArrayList<>(), path);
        }
        try {
            Scanner scan = new Scanner(file);
            scan.nextLine();                    // Skip header

            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                dataList.add(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return dataList;
    }

    public void saveData(String header,ArrayList<Object> dataList, String path) {
        try {
            FileWriter writer = new FileWriter(path);
            writer.write(header+"\n");
            for (Object item : dataList) {
                writer.write(item + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("File not saved");

        }

    }
}

