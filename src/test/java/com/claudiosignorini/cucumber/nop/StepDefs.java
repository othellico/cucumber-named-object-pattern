package com.claudiosignorini.cucumber.nop;

import cucumber.api.java.en.When;

public class StepDefs {

    @When("I create a new document {string}")
    public void iCreateANewDocument(String docName) {
        Document doc = new Document();
        ScenarioCache.get().putObject(docName, doc);
    }

    @When("I create a link from the document {string} to the document {string}")
    public void iCreateALinkFromTheDocumentToTheDocument(String sourceDocName, String destDocName) {
        Document source = ScenarioCache.get().getObject(sourceDocName, Document.class);
        Document destination = ScenarioCache.get().getObject(destDocName, Document.class);
        source.link(destination);
    }

}
