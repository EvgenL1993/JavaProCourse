package org.homework3.enums;

public enum FilePath {
    FILE_PATH("src/main/java/org/homework3/file1.txt");

    String filePath;

    FilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }
}
