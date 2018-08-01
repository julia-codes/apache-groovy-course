class Account {
    BigDecimal balance = 0.0

    def deposit (BigDecimal amount){
        //balance += amount < 0 ? 0.0 : amount
        if(amount <0 ){
            throw new Exception("Deposit Negative")
        }
        else{
            balance += amount
        }
    }
    def deposit(List amounts){
        for(amount in amounts){
            try{
                this.deposit(amount)
            }catch(Exception e){
                println "Deposit error: $e.message"
            }
        }
    }
    String toString(){
        "Balance: $balance"
    }
}
Account a = new Account()
try{
    a.deposit(200)
}catch(Exception e){
    println e.message
}finally{
    println a
}

try{
    a.deposit(-1)
}catch(Exception e){
    println "Deposit error: $e.message"
}finally{
    println a
}

a.balance = 0.0
List deposits = [10.00, 300.0, 5000.00, -1.00, 4.00]

a.deposit(deposits)
println a