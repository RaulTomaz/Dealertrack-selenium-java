# DealerTrack Brasil search

tools:

- Selenium-java;
- Cucumber;
- Junit 4.

Maven compiler version (JDK): 14.0.1

**Observation:** If the machine for running the automation has a different JDK version, simply update it on pom.xml file on lines 12/13:

```
 <properties>
        <maven.compiler.source>14.0.1</maven.compiler.source>
        <maven.compiler.target>14.0.1</maven.compiler.target>
    </properties>
```

Automation structured with following concepts:

- Page Objects;
- BDD methodology - Using gherkin syntax;
- Clean code concepts - Tell, don't ask; single responsibility;
- Data manipulation through JSON file
