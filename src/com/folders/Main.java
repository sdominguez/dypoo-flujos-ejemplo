package com.folders;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String path = "C:/Users/sauld/OneDrive - Universidad Veracruzana/2024-AgoEne2025-EE/DPOO";
        String destinationpath = "C:/Users/sauld/OneDrive/Escritorio/test/";
        String studentsfilepath = path+"/alumnos.txt";

        try {
            StudentReader reader = new StudentReader(new File(studentsfilepath));
            for(Student s : reader.getStudents()){
                new FolderCreator(destinationpath+s.getFullName()).create();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }
}
