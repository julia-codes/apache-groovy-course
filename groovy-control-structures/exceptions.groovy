// Exceptions 
// ---------------------------------------
//Exceptions in Groovy are not Optional
/*
public void foo() throws Exception {
    throw new Exception()
}
*/
//Exceptions in Groovy are optional
def foo() {
    // do stuff
    throw new Exception("Foo Exception")
}

List log = []

try {
  foo()  
} catch( Exception e ) {
    log << e.message
    println e
} finally {
    log << 'finally'
}

println log

// Java 7 introduced a multi catch syntax
try {
    // do stuff
} catch( FileNotFoundException | NullPointerException e ) {
    println e.class.name
    println e.message
} 