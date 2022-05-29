# tests created by: Hyulya Gyuler
@ParameterTypeAndDataTable
Feature: Testing ParameterType and Data Table

  Rule: Numbers are positive and negative
    @TestingSum
    Scenario: Calculation for positive and negative numbers from a Data Table
      Given we have the following numbers:
        | 3 | -1 |
        | 2 | -5 |
      When we use operator sum
      Then we print the results and compare

    @TestingDifference
    Scenario: Calculation for positive and negative numbers from a Data Table
      Given we have the following numbers:
        | 3 | -1 |
        | 2 | -5 |
      When we use operator difference
      Then we print the results and compare
