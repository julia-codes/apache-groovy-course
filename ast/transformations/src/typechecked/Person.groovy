package typechecked

import groovy.transform.TypeChecked

@groovy.transform.TypeChecked()
class Person {

    String firstName
    String lastName

    String getFullName(){
        "$firstName $lastName"
    }
    void printFullName(){
        println "$firstName $lastName"
    }
    void greet(){
        "Hello! My name is $firstName"
    }
}
