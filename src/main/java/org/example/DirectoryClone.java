package org.example;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DirectoryClone implements Runnable {
    private String sourceDirPath;
    private String targetDirPath;

    public DirectoryClone() {
        System.out.print("Input the full path to source directory: ");
        this.sourceDirPath = DirectoryCreate.directoryInstanceCreate().getPathDir();
        System.out.print("Input the full path to target directory: ");
        this.targetDirPath = DirectoryCreate.directoryInstanceCreate().getPathDir();
    }

    public String getSourceDirPath() {
        return sourceDirPath;
    }

    public String getTargetDirPath() {
        return targetDirPath;
    }

    @Override
    public void run() {
        Path sourcePath = Path.of(this.sourceDirPath);
        Path targetPath = Path.of(this.targetDirPath);
        try {
            Files.walkFileTree(sourcePath, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                    Files.createDirectories(targetPath.resolve(sourcePath.relativize(dir)));
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    Files.copy(file, targetPath.resolve(sourcePath.relativize(file)), StandardCopyOption.REPLACE_EXISTING);
                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (IOException e) {
            throw new RuntimeException("An error during walking files process.");
        }
        System.out.println("\nStructure of source directory was copied successfully!");
    }
}
