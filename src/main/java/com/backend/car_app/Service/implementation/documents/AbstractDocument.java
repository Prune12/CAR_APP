package com.project.Entity.DocumentPackage;

import java.io.File;

public abstract class AbstractDocument {
    private String name;
    private File content;

    public AbstractDocument(String name,File content) {
        this.name = name;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public File getContent() {
        return content;
    }

    public void setContent(File content) {
        this.content = content;
    }

    public void display(){
        System.out.println("DocumentPackage(name="+name+")");
    }
}
