package com.backend.car_app.Service.implementation.documents;

import java.io.File;

public class DocumentPdf {
    private File content;

    public DocumentPdf(File content) {
        this.content = content;
    }

    public DocumentPdf() {
    }

    public File getContent() {
        return content;
    }

    public void setContent(File content) {
        this.content = content;
    }
}
