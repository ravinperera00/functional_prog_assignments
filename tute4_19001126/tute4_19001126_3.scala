object tute4_19001126_3 extends App{

    class Account(var money:Double){


        def transfer(x:Account, amount : Double){
            x.money = x.money + amount;
            money = money - amount;
        }
        
    }

    val a1 = new Account(1000);
    val a2 = new Account(-350);
    
    
    println("Account 1 before transfer : " + a1.money.toString);
    println("Account 2 before transfer : " + a2.money.toString);
    println("\t---------")
    a1.transfer(a2,500);
    println("Account 1 after transfer : " + a1.money.toString);
    println("Account 2 after transfer : " + a2.money.toString);



}
