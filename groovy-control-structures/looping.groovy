// Looping
// --------------------------------------------

// while
List numbers = [1,2,3]
while( numbers ) {
    // do something
    numbers.remove(0)
}

assert numbers == []

// for 

//for( variable in iterable ) { }

List nums = [1,2,3]
for( Integer i in 1..10 ) {
    println i
}

for( i in 1..5 ) { 

}//inside of for loop is not a closure

Closure c = { } 


// return/break/continue

String getFoo() {
    "foo"// to be returned, don't have to return
}

Integer a = 1
while( true ) { // infinite loop
    a++
    break//get out of the while loop
}
assert a == 2

for( String s in 'a'..'z' ){
    if( s == 'a') continue
    println s
    if( s > 'b' ) break
}


