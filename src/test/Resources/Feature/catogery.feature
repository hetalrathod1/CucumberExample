Feature: catogery functionality
  @category
  Scenario Outline:user should be able to navigate to all "<catogary>" page Successfully

    Given user is on hompage
    When user click on "<category>" link
    Then user should be able to navigate to all "<category page>"   Successfully
    Examples:
      | category | category page |
      | Computers   |  1https://demo.nopcommerce.com/computers |
      | Electronics  | https://demo.nopcommerce.com/electronics  |
      | Apparel | https://demo.nopcommerce.com/apparel |
      | Books  | https://demo.nopcommerce.com/books |



