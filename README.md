# Introduction 
Framework for automation testing<br>
Uploaded in this repository 2/17/2022

Introduction wiki: https://bag-2020prj.visualstudio.com/EnergiePortal/_wiki/wikis/Kommunalportal-2.0.wiki/1873/Automation-Testing-Selenium-Webdriver

# Getting Started
To run a test in your local machine
<ol> 
<li> Import the project/framework in your IDE IntelliJ</li>
<li> In terminal of your IDE type "<i>mvn clean install</i>" (without quote) </li>
</ol>
<br>
To run specific feature file/s in your local machine
<ol> 
<li> Open the feature file/s you want to run</li>
<li> Edit @Run into @RunSolo</li>
<li> Open file: src/test/java/TestRunner.java</li>
<li> Edit line 17 into: tags = "@RunSolo",</li>
<li> In terminal of your IDE type "<i>mvn test</i>" (without quote) </li>
</ol>

# To Create automation script
<ol> 
<li> Create a cucumber feature file (IntelliJ)</li>
<li> In your feature file, create stepdefinition class</li>
<li> In your stepdefinition class, create a static webdriver variable then inherit the Instance class</li>
<li> Create the page object model class (page class) then inherit the stepdefinition class </li>
</ol>

#This repository is for B2B Testers. Maintained by Fritz Alabastro
