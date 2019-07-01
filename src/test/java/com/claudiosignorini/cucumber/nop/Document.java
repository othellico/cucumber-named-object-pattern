package com.claudiosignorini.cucumber.nop;

import java.util.HashSet;
import java.util.Set;

public class Document {

    private final Set<Document> linkedDocs = new HashSet<>();

    public void link(Document destination) {
        linkedDocs.add(destination);
    }

}
