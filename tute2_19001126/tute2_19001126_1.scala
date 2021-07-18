object tute2_19001126_1 extends App{

    def gcd(a:Int, b:Int):Int={
        a match{
            case 0 => b
            case a if(a > b) => gcd(b, a)
            case _ => gcd(a, b%a)
        }
    }

    def isPrime(n:Int, k:Int = 2):String={
        k match{
            case k if(n == k) => "a prime"
            case k if(gcd(n,k) > 1) => "not a prime"
            case k => isPrime(n, k+1)
        }
    }

    println("Enter a number: ")
    val input = scala.io.StdIn.readInt()
    println(input.toString + " is " + isPrime(input))


}