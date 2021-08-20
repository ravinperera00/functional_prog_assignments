object tute4_19001126_4 extends App{

    class Account(var money:Double){

        def applyInterest()={
            if(money >0)
            {
                money = money*(1.05);
            }else
            {
                money = money*(1.1)
            }
        }
    }

    def printNegativeAccounts(Bank : List[Account])={
        var count = 1;
        println("Accounts with negative balances : ");
        for(i <- Bank)
        {
            if(i.money < 0)
            {
                println("Account " + count.toString + " balance : " + i.money.toString);
            }
            count = count + 1;
        }
    }

    def printAccounts(Bank : List[Account])={
        var sum:Double = 0;
        var count = 1;
        for(i <- Bank)
        {
            sum = sum + (i.money);
            println("Account " + count.toString + " balance : " + i.money.toString);
            count = count + 1;
        }
        println("Total Balance : " + sum.toString);

    }

    def addInterest(Bank : List[Account])={
        for(i <- Bank)
        {
            i.applyInterest();
        }
    }
    

    val a1 = new Account(1000);
    val a2 = new Account(-350);
    val a3 = new Account(500);
    val a4 = new Account(-100);

    val Bank = List[Account](a1, a2, a3, a4);

    printNegativeAccounts(Bank);

    println("--- Accounts before applying interests ---")

    printAccounts(Bank);
    
    println("--- After applying interest ---");

    addInterest(Bank);
    printAccounts(Bank);

    
    



}
