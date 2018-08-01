def map = [:]
println map
println map.getClass().getName()

def person = [first:"Dan",last:"Vega",email:"danvega@gmail.com"]
println person
println person.first // like serialized objects from json

person.twitter = "@therealdanvega"
println person
println '\n------The twitter one------'
def emailKey = "EmailAddress"
def twitter = [username:"@therealdanvega",(emailKey):"danvega@gmail.com", 'Visible Name': "Dan Vega"]
println twitter.keySet()
println twitter.username
println twitter[emailKey]
println twitter['Visible Name']
println '------The twitter one------\n'

println person.size()
println person.sort()

// looping through person
for( entry in person ) {
    println entry
}

for( key in person.keySet() ) {
    println "$key:${person[key]}"
}

// each | eachWithIndex