package com.folders;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentReader {

    private File file;
    private List<Student> students;

    StudentReader(File directory) throws IOException{
        if(directory.isDirectory()){
            throw new IOException("This is not a valid File");
        }
        this.file = directory;
        students = new ArrayList<>();
    }

    public List<Student> getStudents() throws IOException {
        FileReader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);
        String readLine;
        while((readLine = br.readLine())!=null){
            String[] data = readLine.split(",");
            students.add(new Student(data[0],data[1]));
        }
        br.close();
        reader.close();

        return students;
    }
}
