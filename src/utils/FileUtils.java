package utils;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileUtils {

    public static void saveFile(String source, String dest) {
        try {
            Files.copy(Paths.get(source), Paths.get(dest));
        } catch (Exception e) {
            System.out.println("File copy failed");
        }
    }

    public static void deleteFile(String path) {
        try {
            new File(path).delete();
        } catch (Exception e) {
            System.out.println("Delete failed");
        }
    }
}