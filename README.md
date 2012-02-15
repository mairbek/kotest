## Kotest

Testing framework written in kotlin programming language.

### Main features

 - Simple for unit testing
 - Suitable for acceptance testing
 - Easily configurable
 - BDD support
 - Environments support
 - Powerful matchers

### Unit test example

  class MyTest : UnitTest {
       before() {
            // set up
       }
       after() {
            // tear down
       }
       test ("Test something") {
            // do something      }
       test ("Test something") {
       }
  }

### Bdd test example

  class MyFeature extends BddTest {
    feature ("") {
      info ("")
      info ("")
      info ("")
  }

  scenario ("") {
    given ("")
    ...
    when ("")
    ...
    then("")
    }
  }

