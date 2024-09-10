package com.folders;

import java.io.File;
import java.io.IOException;

public class FolderCreator {
    private File directory;
    private String directoryPath;

    FolderCreator(String directoryPath){
        this.directoryPath = directoryPath;
    }

    public void create(){
        directory = new File(directoryPath);
        if (!directory.exists()) {
            if (directory.mkdirs()) {
                System.out.println("Directorio creado exitosamente: " + directoryPath);
            } else {
                System.out.println("No se pudo crear el directorio"+ directoryPath);
            }
        }
    }

}
