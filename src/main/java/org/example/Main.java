package org.example;

public class Main {
    public static void main(String[] args) {
        DirectoryClone directoryClone = new DirectoryClone();
        Thread cloneThread = new Thread(directoryClone);
        cloneThread.start();
        try {
            cloneThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException("Clone thread interrupted!");
        }
        showResult(directoryClone);
    }

    public static void showResult(DirectoryClone directoryClone) {
        System.out.println("\nSource folder structure:");
        System.out.println(DirectoryPrint.printDirectoryStructure(directoryClone.getSourceDirPath()));
        System.out.println("\nTarget folder structure:");
        System.out.println(DirectoryPrint.printDirectoryStructure(directoryClone.getTargetDirPath()));
    }
}