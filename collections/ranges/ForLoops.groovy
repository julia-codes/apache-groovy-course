for( int x = 1; x <= 10; ++x) { 
    print x
}

println ""

for( int y = 10; y >= 1; --y) {
    print y
}

println ""

def letters = ['a','b','c']
for( int i = 0; i < letters.size(); ++i) {
    print letters[i]
}
println "\n -- Range -- "
Range r = 1..10
println r.from
println r.to

assert (0..10).contains(0)
assert (0..10).contains(11) == false
assert (0..<10).contains(10) == false

Date today = new Date()
Date tomorrow = today +1
Date yesterday = today - 1

println "Yesterday $yesterday \nToday $today \nTomorrow $tomorrow"

Range days = yesterday..tomorrow
println days
