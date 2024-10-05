Feature: Bookcard Application login

Scenario: Login success
Given I open website "kompas.com"
Given I click on login button
And I type "username" on fieldUsername
And I type "pass" on fieldPass
And I click button login

#
#Scenario: Login unsuccess
#Given I open website "kompas.com"
#Given I click on login button
#And I type "username123" on fieldUsername
#And I type "pass123" on fieldPass
#And I click button login
