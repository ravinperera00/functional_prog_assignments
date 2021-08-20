object tute4_19001126_1 extends App{

    class Rational(var num:Int, var den:Int){

        def neg() : Rational={
            var temp = new Rational(-num, den);
            return temp;
        }

        def printValue():String={
            return num.toString+"/"+den.toString;
        }

    }



    var x = new Rational(3,4);
    var y = new Rational(5,8);
    println("--- Before negating ---");
    println("Number 1 : " + x.printValue());
    println("Number 2 : " + y.printValue());
    x = x.neg();
    y = y.neg();
    println("--- After negating ---");
    println("Number 1 : " + x.printValue());
    println("Number 2 : " + y.printValue());

}