List nums = [1,2,3,6,7,9,4,5,3,6,8,9]
println nums
println nums.class.name

println "\nadd | remove | get | clear"

nums.push(99)
nums.putAt(0,77)
nums[0] = 78
nums + 7
nums << 66
println nums

nums.pop()
nums.removeAt(0)
def newList = nums - 3
println newList

println nums[4]
println nums.getAt(0..3)
nums = []

println "\nflatten"
nums << [3,4,5]
nums << [1,2]
println nums
println nums.flatten()

println "\nequals"
def myNumbers = [1,2,3]
def myNumbers2 = [1,2,3]
println myNumbers.equals(myNumbers2)

println "\nfindAll"
println nums.findAll { it == 4 }
println nums.flatten().findAll { it < 5 }

println "\ngetAt(Range)"
println nums.getAt(0..1)
println nums.getAt(0..1).flatten()

println "\nreverse list"
println nums.reverse()

println "\nunique"
println nums.unique()

println "\nJava Collections List(LinkedList) (Set,SortedSet)"
def evens = [10,2,8,4,24,14,2] as Set
println evens
println evens.class.name

List odds = [1,3,7,9,5,3,9] as LinkedList
println odds
println odds.class.name