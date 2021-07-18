object tute2_19001126_3 extends App{

    def addition(n:Int):Int={
        n match{
            case 0 => 0
            case _ => n + addition(n-1)
        }
    }

    println("Enter a number: ")
    val input = scala.io.StdIn.readInt()
    println("Addition of numbers from 0 to " + input.toString + " is " + addition(input.toInt).toString)


}