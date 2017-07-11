@Igor3
Feature: Checkout

Scenario Outline: cound
 When we have <applecount> and <bananacound>
 Then their sum should be <totalcound>


Examples:
| applecount | bananacound | totalcound |
|     1      |  1          | 2          |