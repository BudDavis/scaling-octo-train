# scaling-octo-train


 mvn exec:java -Dexec.mainClass=uta.cse.cse3310.JSBSimEdit.App

 

Project Set up
* maven create
* one window, with tabs
* unit test example
* system test example
* packaging 

System Design
* Leave everything in the xml data structure`
* create query / update layer
 

* Overall Program
* Read / Write / Files / Access to data

        fileheader
        metrics
        mass_balance
        ground_reactions
        external_reactions
        buoyant_forces 
        propulsion 
        system 
        autopilot 
        flight_control 
        aerodynamics  
        input 
        output 
      
Documentation
* Requirements Spreadsheet
* * User Interface mockups- with details
* class diagram











https://stackoverflow.com/questions/72676914/how-to-enable-gui-app-in-github-codespaces

https://docs.gtk.org/gtk4/getting_started.html

https://www.fltk.org/doc-1.4/basics.html

https://rawgit.com/wxFormBuilder/ticpp/docs/ticpp.html

git 

https://stackoverflow.com/questions/91179/automated-tests-for-java-swing-guis

parsing xml with java:

https://docs.oracle.com/javase/tutorial/jaxb/intro/index.html
which turned into https://github.com/eclipse-ee4j/jaxb-ri
which goes here:
         https://eclipse-ee4j.github.io/jaxb-ri/
 
What I used to make the java project:

                        
                       mvn archetype:generate -DgroupId=uta.cse.cse3310.JSBSimEdit -DartifactId=JSBSimEdit  -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false

mvn package

to compile and run:

java -cp target/JSBSimEdit-1.0-SNAPSHOT.jar uta.cse.cse3310.JSBSimEdit.App



https://jsbsim.sourceforge.net/JSBSimReferenceManual.pdf



What Technology to use?

Java:  
    Multiplatform +
    Lots of libs  +
    slow runtime  -  (who cares)


Fltk:
    Moves slow +
    still relies on OS installed libs  -


GTK4:
    Moves fast -
    C          -

QT:
    political a mess -
    moves fast       -

Node:
    no knowledge     -
    lightest install +





