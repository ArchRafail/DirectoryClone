package org.example;

import java.io.File;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.Scanner;

public class DirectoryCreate {
    private String pathDir;

    private DirectoryCreate(String path) {
        this.pathDir = path;
    }

    public static DirectoryCreate directoryInstanceCreate() {
        String path = pathToDir();
        File dir = new File(path);
        if (!dir.exists())
            throw new RuntimeException("Directory is not exist!");
        return new DirectoryCreate(path);
    }

    public String getPathDir() {
        return pathDir;
    }

    private static String pathToDir() {
        Scanner scanner = new Scanner(System.in);
        String prePath = scanner.nextLine();
        try {
            Paths.get(prePath);
        } catch(InvalidPathException | NullPointerException ex) {
            throw new RuntimeException("Incorrect path to directory.");
        }
        return prePath.replace("\\","\\\\");
    }
}
