@dataTable
Feature: Cucumber Data table implementation practices


  Scenario: List of fruits and veggies
    Then user should see below list
      | orange   |
      | apple    |
      | kiwi     |
      | cucumber |
      | pear     |
      | eggplant |
      | cherry   |

  #create a new scenario where we list the type of pets we love
  #Print out all the strings in the list

  Scenario: List of pets types I love
    Then  I Will share my favorites
      | Kangal           |
      | Husky            |
      | Golden Retriever |
      | Golden Doodle    |
      | Munchkin         |
      | Ragdoll cat      |


  Scenario: Officer reads data about driver
    Then officer is able to see any data he wants
      | name     | Jane         |
      | lastName | Doe          |
      | age      | 26           |
      | state    | CA           |
      | zipcode  | 99999        |
      | phone    | 111-111-1111 |


