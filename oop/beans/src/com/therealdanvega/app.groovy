package com.therealdanvega

//Employee emp = new Employee(first:"Dan",last: "Vega",email: "danvega@gmail.com")
//println emp

//Employee emp = new Employee()
//emp.first = "Dan"

// println emp.first

DoubleBean db = new DoubleBean()
db.value = 100

println db.value //overridden get method that is returning the value times two
println db.@value //direct grab of the property, circumventing property grab
Tweet tweet = new Tweet( username: 'juliacodes', name: 'julia')
tweet.setPost("Testing out the #cool #hashtag #feature")
println tweet

tweet.setPost("#Testing out the #cool #hashtag #feature")
println tweet

tweet.setPost("@ApacheGroovy #Testing out the #cool #hashtag #feature")
println tweet

tweet.setPost("#Testing out the #cool #hashtag #feature in @ApacheGroovy with Mentions")
println tweet

tweet.retweet()
tweet.like()
tweet.like()
tweet.like()
tweet.like()
println tweet