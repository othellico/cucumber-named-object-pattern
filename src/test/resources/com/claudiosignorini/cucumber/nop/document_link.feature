Feature: Document link

  Scenario: Create a link between two documents

    When I create a new document "A"
    And I create a new document "B"
    And I create a link from the document "A" to the document "B"