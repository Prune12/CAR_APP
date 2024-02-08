package com.backend.car_app.Service.implementation.adapter;

import com.backend.car_app.models.PDFDocument;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public class PDFDocumentAdapter implements Document {

     PDFDocument pdfDocument;

    public PDFDocumentAdapter(PDFDocument pdfDocument) {
        this.pdfDocument = pdfDocument;
    }

    @Override
    public void print() {
        pdfDocument.render();
    }
}