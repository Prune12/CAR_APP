package com.backend.car_app.Service.implementation.singleton;

import java.util.ArrayList;

import com.backend.car_app.Service.implementation.documents.AbstractDocument;

public class LiasseVierge {
    private static LiasseVierge _instance = null;
    private ArrayList<AbstractDocument> documents;

    private LiasseVierge() {
        documents = new ArrayList<AbstractDocument>();
    }

    public static LiasseVierge instance() {
        if (_instance == null)
            _instance = new LiasseVierge();
        return _instance;
    }

    public void ajoute(AbstractDocument doc) {
        documents.add(doc);
    }

    public void retire(AbstractDocument doc) {
        documents.remove(doc);
    }
}
