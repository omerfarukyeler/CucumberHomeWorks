@dbQuery2
Feature: Database Query

  Background:
    Given user connects to the database


  Scenario: user verifies total number of products
    Given user connects to the employess table
    Then Bring the even number below the id row in the table

  Scenario: user find the total number of rows in the table
    Given user connects to the employess table
    Then find the total number of rows


  Scenario: user find the max salary in table
    Given user connects to the employess table
    Then find the max salary in table

  Scenario: userfind the second max salary in table
    Given user connects to the employess table
    Then find the second high salary

  Scenario: user get all the maximum salary information in the table
    Given user connects to the employess table
    Then find the maximum salary info

  Scenario:user get all the second high salary information in the table
    Given user connects to the employess table
    Then find the second high salary info

