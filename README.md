# Milestone 1 - Health Bud
<!-- We can come up with a name for the app later --> 

Assignment Reference: https://courses.codepath.org/courses/and102/unit/7#!milestones

## Table of Contents

1. [Overview](#Overview)
1. [Product Spec](#Product-Spec)
1. [Wireframes](#Wireframes)

## Overview

### Description

Health Bud is a health app that allows users to keep track of their medicine intake and reminds users of when to take them. The health app also allows users to keep track of what workouts they have done and what workout to do next. 
<!-- Feel free to edit the description --> 

### App Evaluation

[Evaluation of your app across the following attributes]

* **Category**: Health & Fitness
* **Mobile:** Mobile makes it more convenient than website
* **Story:** Allows users to keep track of daily their daily medicine intake and/or workout routines. This would receive a positive response since it's lifestyle related. 
* **Habit:** Habit-forming because a lot of people go to gym on regular basis and take medicine on regular basis. Users will regularly log on in order to track down what medications they took/have taken and/or what workouts they have done that day. 
* **Scope:** Should not be too technically tracking since one of the primary features of the application includes tracking down activities (medicine/exercising). 
* **Market:** Anyone that wants to keep track of their lifestyle choices, such as medication/exercising, may use this app. 

## Product Spec

### 1. User Features (Required and Optional)

**Required Features**
- [x] Users can click a button on the log page to go to a log medicine page
- [x] Users can click a button on the log page to go to a log exercise
- [x] Users can click a button on the log page to go to a log food/calories 
- [x] Users can navigate between the dashboard, log, and calendar via a navigation view
- [ ] Users should be able to keep track of what medication they have taken and log the information through the app
- [ ] Users should be able to receive a reminder/notification of when to take medication/log their intake for the day
- [ ] Users can see when they have previously logged in data for past medications/workouts
- [ ] Users are able to set how often they need to take a certain medicine


**Stretch Features**
- [ ] Users can keep track of other areas related to health, such as workouts and food 
   - [ ] Users can keep track of workouts
   - [ ] Users can keep track of food/calorie intake
- [ ] Users can verify if they have created an account with the given information (email/phone number/etc.) 
    * Two-Factor Authentication
- [ ] Users can edit previous logs to update any necessary information 


### 2. Screen Archetypes

- Welcome Screen
    - User can either sign up or log into the application
- Registration Screen
    -  User can sign up and create an account with the application
        -  Information that might be asked: 
            -  Name (first, last)
            -  Age/Birth date 
            -  Username 
            -  Email
            -  Phone number (Optional?)
            -  Password for account 
- Log in Screen
    - User can log in 
- Dashboard Screen 
    - Users are greeted with a welcome screen (?)
        - i.e. "Welcome back, [USERNAME]! Let's start the day off by filling out your log." 
    - Users can see a calendar that indicates what days they have logged their medication intake
- Log Screen 
    - Users are able to log their dose for the day
        - Users are able to select what medicine to log (if they have multiple) using some sort of drop down menu
        - Users can add any additional comments in a text box (might be useful for future doctor visits, etc.)
        - After filling out the information, users should be able to save their log information with a submit button/etc. 
- Calendar Screen
    - Users are able to see past logs in the form of a calendar 
        - Days where users have logged information will be labeled (with a color, label, misc. indicator)


### 3. Navigation

**Tab Navigation** (Tab to Screen)

* Dashboard 
* Log
* Calendar

**Flow Navigation** (Screen to Screen)

- Welcome Screen 
    - => Login Screen
    - => Registration Screen
- Login Screen 
    - => Dashboard
- Registration Screen
    - => Dashboard
- Dashboard Screen
    - => None (for now)
- Log Screen
    - => Dashboard Screen (after logging medicine intake)
- Calendar Screen
    - => None (for now)

## Wireframes

[Add picture of your hand sketched wireframes in this section]

![](https://i.imgur.com/JGVauWR.jpg)


### [BONUS] Digital Wireframes & Mockups

### [BONUS] Interactive Prototype
