import scala.util.Random;
/**
  * Created by natalya on 05.07.2016.
  */
class MyRandom {
  private lazy val x = new Random().nextInt();

  def myNextInt : Pair[Int, MyRandom]  = {
    new Pair(x, new MyRandom())
  }
}

object MyRandom {
  def main(args: Array[String]) {
    val rand = new MyRandom()
    val (value, mr) = rand.myNextInt
    println(s"Randrom int $value, next random $mr")
  }
}
