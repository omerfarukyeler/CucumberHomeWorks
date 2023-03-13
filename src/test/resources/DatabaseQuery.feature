@dbQuery
Feature: Database Query

  Background:
    Given user connects to the database


  Scenario: user verifies total number of products
    Given user connects to the market table
    Then the total number of products is found and print

  Scenario: user verifies the product with the highest price
    Given user connects to the market table
    Then the higher price is found and print


  Scenario: user changes one of the product names
    Given user connects to the market table
    Then product name change is verified and print

  Scenario: user find and print the average price of the products
    Given user connects to the market table
    Then print average price

  Scenario: user print different headers of columns in the table
    Given user connects to the market table
    Then print headers differently

  Scenario:user print product names in all capital letters
    Given user connects to the market table
    Then Capitalize product names

  Scenario:user print the product names in all lowercase letters
    Given user connects to the market table
    Then Lowercase product names

  Scenario:user print product names with first letter capitalized
    Given user connects to the market table
    Then The first letter of the product name must be lowercase

  Scenario:user sort products below a certain price by name and price in descending order
    Given user connects to the market table
    Then products below a certain price are printed in descending order

