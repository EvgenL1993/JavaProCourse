package org.homework3.model;

import org.homework3.enums.FilePath;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Admin extends Support {

    public Admin(String name, String surname, String email, String password, boolean sex, String country) {
        super(name, surname, email, password, sex, country);
    }

    public void deleteFile(boolean booleanValue) throws Exception {
        if (booleanValue) {
            Path file = Paths.get(FilePath.FILE_PATH.getFilePath());
            Files.deleteIfExists(file);
            System.out.println("Из за найденного совпадения файл был удален");
        } else System.out.println("Совпадений не найдено, файл не удален");
    }
}
