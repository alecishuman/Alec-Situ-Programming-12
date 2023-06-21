import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.filefilter.TrueFileFilter;

import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static DatabaseHandler handler;
    public static void main(String[] args) {
        handler = new DatabaseHandler();
        while (true) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Type c to create a table for a directory \n " +
                    "Type d to display files in a directory \n" +
                    "Type e to finish the program");

            String input = sc.nextLine();

            if (input.equalsIgnoreCase("c")) {
                System.out.println("Provide a directory name: ");
                String directory = sc.nextLine();
                File userDir = new File(directory);

                if (!FileUtils.isDirectory(userDir)) {
                    System.out.println("Invalid Directory");
                    continue;
                }

                createTable(userDir);

            } else if (input.equalsIgnoreCase("d")) {
                System.out.println("Provide a directory name: ");
                String directory = sc.nextLine();

                File userDir = new File(directory);

                if (!FileUtils.isDirectory(userDir)) {
                    System.out.println("Invalid Directory");
                    continue;
                }

                printMember(userDir.getName());

            } else if (input.equalsIgnoreCase("e")) {
                break;
            }

        }
    }

    public static void addMember(String tblName, String id, String filename, String path, String extension, int size) {
        String qu = "INSERT INTO " + tblName + " VALUES (" +
                "'" + id + "'," +
                "'" + filename + "'," +
                "'" + path + "'," +
                "'" + extension + "'," +
                "'" + size + "')";
        handler.execAction(qu);
    }

    public static void printMember(String table) {
        String query = "SELECT * FROM " + table;
        ResultSet resultSet = handler.execQuery(query);
        try {
            while(resultSet.next()) {
                String filename = resultSet.getString("FILENAME");
                String path = resultSet.getString("PATH");
                String extension = resultSet.getString("EXTENSION");
                String size = resultSet.getString("SIZE");
                System.out.println("Filename: " + filename + "\tPath: " + path + "\tExtension: " + extension + "\tSize: " + size);
            }
        } catch(SQLException throwables) {
            throwables.printStackTrace();
        }

    }
    public static void createTable(File directory) {
        List<File> files;
        files = (List<File>) FileUtils.listFiles(directory, TrueFileFilter.INSTANCE, TrueFileFilter.INSTANCE);

        String directoryName = directory.getName();
        handler.createTable(directoryName);

        for (int i = 0; i < files.size(); i++) {
            File temp = files.get(i);
            addMember(directory.getName(), Integer.toString(i), temp.getName(), temp.getPath(), FilenameUtils.getExtension(temp.getName()), (int) temp.length());
        }
    }

}