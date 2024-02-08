package com.backend.car_app.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


public class PDFDocument {

    private String filePath;

    public PDFDocument(String filePath) {
        this.filePath = filePath;
    }

    public PDFDocument() {

    }


    public void render() {

    }
}
