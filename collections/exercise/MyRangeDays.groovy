enum DaysWithNums{
    SUNDAY(0), MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6)
}
//With numbers I get this error Could not find matching constructor for: Days(java.lang.String, java.lang.Integer, java.lang.Integer)
enum Days{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
println Days.values()
Range dayrange = Days.SUNDAY..Days.SATURDAY
println dayrange
assert dayrange.contains(Days.WEDNESDAY)
println dayrange.from
println dayrange.to
 