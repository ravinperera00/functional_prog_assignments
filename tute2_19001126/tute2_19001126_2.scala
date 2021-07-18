object tute2_19001126_2 extends App{

    def gcd(a:Int, b:Int):Int={
        a match{
            case 0 => b
            case a if(a > b) => gcd(b, a)
            case _ => gcd(a, b%a)
        }
    }

    def isPrime(n:Int, k:Int = 2): Boolean={
        k match{
            case k if(n == k) => true
            case k if(gcd(n,k) > 1) => false
            case k => isPrime(n, k+1)
        }
    }

    def printPrimeSeq(n:Int):Unit={
        n match{
            case 1 => return
            case x if(isPrime(x)) => {printPrimeSeq(x-1); print(x.toString + " ")}
            case x => printPrimeSeq(x-1)
        }
    }

    println("Enter a number: ")
    val input = scala.io.StdIn.readInt()
    printPrimeSeq(9)


}