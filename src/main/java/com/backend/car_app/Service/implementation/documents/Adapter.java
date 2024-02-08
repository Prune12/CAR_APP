package com.backend.car_app.Service.implementation.documents;

import java.io.File;

public class Adapter extends AbstractDocument{
    private DocumentPdf documentPdf;

    public Adapter(String name, File content,DocumentPdf documentPdf) {
        super(name, content);
        documentPdf.setContent(content);
    }

    public DocumentPdf getDocumentPdf() {
        return documentPdf;
    }

    public void setDocumentPdf(DocumentPdf documentPdf) {
        this.documentPdf = documentPdf;
    }
}
