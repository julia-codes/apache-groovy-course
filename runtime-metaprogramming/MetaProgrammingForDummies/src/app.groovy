package codes.julia

Tweet tweet = new Tweet(username: "juliacodes", name: "julia", post: "Hello World #firstTweet within the @apachegroovy #class")

tweet.getMentions('@')
println tweet.name
println tweet.moose
tweet.name = 'moose'
tweet.moose = 'name'
println tweet

println "-------Expando-------"
Expando e = new Expando()

e.name = 'Julia'
e.username = 'JuliaCodes'
e.sayHello = {-> println "$name says hello! - @$username"}

println e
e.sayHello()

Tweet.metaClass.sayHello = { -> println "$name : $username \n\t $post \n - $timestamp"}

tweet.sayHello()

println "-------Times Two-----"
use (TimesTwoCategory){
    println 3.shout()
}