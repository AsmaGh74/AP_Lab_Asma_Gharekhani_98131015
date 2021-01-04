package ceit.aut.ac.ir.utils;

import ceit.aut.ac.ir.model.Note;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileUtils {

    private static final String NOTES_PATH = "./notes/";

    //It's a static initializer. It's executed when the class is loaded.
    //It's similar to constructor
    static {
        boolean isSuccessful = new File(NOTES_PATH).mkdirs();
        System.out.println("Creating " + NOTES_PATH + " directory is successful: " + isSuccessful);
    }

    public static File[] getFilesInDirectory() {
        return new File(NOTES_PATH).listFiles();
    }


//    public static String fileReader(File file) {
//        //TODO: Phase1: read content from file
//
//        // *my code
//        String fileBody = "";
//        try {
//            FileReader fileReader = new FileReader(file);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            int ch;
//            while ((ch = bufferedReader.read()) != -1){
//                fileBody += (char) ch;
//            }
//            bufferedReader.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        //* end of my code
//
//        return fileBody;
//    }

//    public static void fileWriter(String content) {
//        //TODO: write content on file
//        String fileName = getProperFileName(content);
//
//        // *my code
//        try {
//            FileWriter fileWriter = new FileWriter(new File(NOTES_PATH, fileName+".txt"));
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            bufferedWriter.write(content);
//            bufferedWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        // * end of my code
//    }

    //TODO: Phase1: define method here for reading file with InputStream
    public static String fileReader(File file){
        String textToShow = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectStream = new ObjectInputStream(fileInputStream);
            Note note = (Note) objectStream.readObject();
            textToShow = note.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return textToShow;
    }


    //TODO: Phase1: define method here for writing file with OutputStream
    public static void fileWriter(String content){
        String title = getProperFileName(content);
        String date = getDate();
        Note newNote = new Note(title,content,date);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(NOTES_PATH + title + ".txt");
            ObjectOutputStream objectStream =  new ObjectOutputStream(fileOutputStream);
            objectStream.writeObject(newNote);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getDate(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }



    //TODO: Phase2: proper methods for handling serialization

    private static String getProperFileName(String content) {
        int loc = content.indexOf("\n");
        if (loc != -1) {
            return content.substring(0, loc);
        }
        if (!content.isEmpty()) {
            return content;
        }
        return System.currentTimeMillis() + "_new file.txt";
    }
}
