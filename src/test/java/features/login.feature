Feature: User Login
  I want to check that user can login to the system
  
  Scenario: user login successfully 
  Given user is in Home page
  When click on login button
  And entered valid user name and password
  Then login succefully and profile page appears 