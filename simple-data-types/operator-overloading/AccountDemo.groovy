@groovy.transform.ToString
class Account{
    

    BigDecimal balance = 0
    String type

    BigDecimal plus(Account other) {
        this.balance + other.balance
    }
    

    def deposit(BigDecimal amount){
        balance += amount
    }
    def withdraw(BigDecimal amount) {
        balance -= amount
    }
}

Account checking = new Account(type:"Checking")
checking.deposit(100.00)
Account savings = new Account(type:"Savings")
savings.deposit(50.00)

println savings
println checking
println savings + checking

savings.deposit(500)
println savings