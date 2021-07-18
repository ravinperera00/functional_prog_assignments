object tute2_19001126_4 extends App{

    def isEven(n:Int):Boolean={
        n match{
            case 0 => true
            case _ => (isOdd(n-1))
        }
    }

    def isOdd(n:Int):Boolean = !(isEven(n))

    println("Enter a number: ")
    val input = scala.io.StdIn.readInt()
    println("The number is " + (if (isEven(input.toInt)) "Even" else "Odd"))


}