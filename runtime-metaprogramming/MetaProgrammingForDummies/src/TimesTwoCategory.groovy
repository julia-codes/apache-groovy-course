package codes.julia
class TimesTwoCategory {
    static String shout(Integer i) {
        String end = ''
        i.times {end += "!"}
        return "Wow I\'m hanging out in the Integer class $end"
    }
}