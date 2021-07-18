object tute2_19001126_5 extends App{

    def isEven(n:Int):Boolean={
        n match{
            case 0 => true
            case _ => (isOdd(n-1))
        }
    }

    def isOdd(n:Int):Boolean = !(isEven(n))


    def addEvenNumbers(n:Int):Int={
        n match{
            case 0 => 0
            case x if(isEven(x)) => {x + addEvenNumbers(x-1)}
            case x => addEvenNumbers(x-1)
        }
    }

    println("Enter a number: ")
    val input = scala.io.StdIn.readInt()
    println("Addition of numbers from 0 to " + input.toString + " is " + addEvenNumbers(input.toInt).toString)


}