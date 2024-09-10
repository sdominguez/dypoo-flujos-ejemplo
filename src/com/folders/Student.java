package com.folders;

public class Student {
    private String fullName;
    private String id;

    public Student(){
        fullName = "";
        id = "";
    }

    public Student(String id, String fullName){
        this.fullName = fullName.toUpperCase();
        this.id = id.toUpperCase();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullname(String fullname) {
        this.fullName = fullname.toUpperCase();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id.toUpperCase();
    }
}
