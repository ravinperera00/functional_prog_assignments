object tute2_19001126_6 extends App{

    def fib(n:Int):Int={
        n match{
            case 0 => 0
            case 1 => 1
            case _ => {(fib(n-1) + fib(n-2))}
        }
    }

    def printSeq(n:Int):Unit={
        if(n > 1){
            printSeq(n - 1)
        }

        println(fib(n - 1).toString + " ")
    }

    println("Enter a number: ")
    val input = scala.io.StdIn.readInt()
    printSeq(input.toInt)


}