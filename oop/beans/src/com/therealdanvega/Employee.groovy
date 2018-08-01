package com.therealdanvega

@groovy.transform.ToString
class Employee implements Serializable {

    String first,last,email
//^consists of the base of the groovy bean that is equivalent
// to the EmployeeBean Java file
    String fullName
//Below is deliberately setting values for the set/get of a property
    //even though groovy creates this
    void setFullName(String name){
        fullName = name
    }

    String getFullName(){
        "Full Name: ${fullName}"
    }

}
