object tute5_19001126_1 extends App{
    import scala.math.pow
    import scala.math.sqrt

    case class Point(a:Int, b:Int){
        def x:Int=a;
        def y:Int=b;

        def +(other: Point):Point={Point(this.x + other.x, this.y + other.y);}
        def move(dx:Int, dy:Int):Point={Point(this.x + dx, this.y + dy);}
        def distance(other:Point):Double={sqrt(pow(this.x - other.x,2) + pow(this.y - other.y,2));}
        def invert():Point={Point(this.y,this.x)};
    }


    val p1 = Point(0,3);
    val p2 = Point(4,0);
    val p3 = p2.invert()
    println("p1 is " + p1);
    println("p2 is " + p2);
    println("------------");
    print("Addition of p1 and p2 is ");
    println(p1+p2);
    print("p1 moved by (3,4) results in ");
    println(p1.move(3,4));
    print("Distance between p1 and p2 is ");
    println(p1.distance(p2));
    print("Invert of p2 is ");
    println(p3);


}