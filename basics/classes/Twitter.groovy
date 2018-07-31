
String n = "JuliaTweets"
String u = "julia.codes"


Tweet test = new Tweet(username: u, name: n, content: "Hello World")
println "Testing: \n $test"

test.retweet()
test.like()

println "$test"

test.retweet()
test.like()

println "$test"

println "---------------------------------------------"

Tweet halloween = new Tweet(username: u, name: n, content: "Happy Halloween!")
halloween.like()
Tweet NY = new Tweet(username: u, name: n, content: "Happy New Year!")
NY.retweet()
NY.retweet()
NY.retweet()
NY.retweet()
NY.retweet()

def list = [test, halloween, NY]

for(tweet in list){
    println tweet
}