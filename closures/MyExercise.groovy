def method = {
        Closure c -> println c
}
Closure closey = { -> println "Boo"}
method(closey)

List animals = ['Alligator', 'Rat','Zebra', 'Ant', 'Aardvark']
animals.each {println it}

Map days = [1:'SUNDAY', 2:'MONDAY', 3:'TUESDAY', 4:'WEDNESDAY', 5:'THURSDAY', 6:'FRIDAY', 7:'SATURDAY']


days.each {k, v -> println "$v is Day number $k"}

def methodMulti = {
    String a, int b, Boolean c ->
    "It is $c that $b is $a"
}

def curryBig = methodMulti.curry("REALLY BIG")
println curryBig(13, true)
def curryFalse = methodMulti.rcurry(false)
println curryFalse("Unlucky", 13)
def curry13 = methodMulti.ncurry(1,13)
println curry13("The Best Number", true)

def aanimal = animals.find {it.startsWith('A')}
println aanimal
def aanimals = animals.findAll {it.startsWith('A')}
println aanimals

Boolean isThereACat = animals.any {animal -> animal.equals('Cat')}
println "There is a cat: $isThereACat"

Boolean isThereAZebra = animals.any {animal -> animal.equals('Zebra')}
println "There is a Zebra: $isThereAZebra"

Boolean areAllA = animals.every {animal -> animal.toUpperCase().contains('A')}
println "There is an 'A' in all Animals: $areAllA"
println animals

List advanced_animals = [
    [name:'Alligator', skin: 'Scales'],
    [name:'Rat', skin: 'Fur'],
    [name:'Zebra', skin: 'Fur'],
    [name:'Ant', skin: 'Chitin'],
    [name:'Aardvark', skin: 'Fur']
]

def grouped = advanced_animals.groupBy({animal -> animal.skin})
println grouped
println grouped.Fur
println grouped.Scales
println grouped.Chitin
