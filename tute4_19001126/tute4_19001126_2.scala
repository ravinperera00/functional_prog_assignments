object tute4_19001126_2 extends App{

    class Rational(var num:Int, var den:Int){

        def neg() : Rational={
            var temp = new Rational(-num, den);
            return temp;
        }

        def sub(k : Rational): Rational={
            var y = k.neg();
            val temp = new Rational(num*(y.den) + (y.num)*den, den*(y.den));
            
            for(i <- 1 to (temp.num).max(temp.den))
            {
                if((temp.num)%i == 0 && (temp.den)%i == 0)
                {
                    temp.num = (temp.num)/i;
                    temp.den = (temp.den)/i;
                    
                }
            }
            return temp;
        }

        def printValue():String={
            return num.toString+"/"+den.toString;
        }

    }



    val x = new Rational(3,4);
    val y = new Rational(5,8);
    val z = new Rational(2,7);

    val result = (x.sub(y)).sub(z);     // ((x-y) - z)

    println("Number x : " + x.printValue());
    println("Number y : " + y.printValue());
    println("Number z : " + z.printValue());
    println("");
    println("Calculation : x - y - z")
    println("Output : " + result.printValue());

}


