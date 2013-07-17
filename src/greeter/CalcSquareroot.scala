package greeter

/**
 * Calculates the square root of any Integer supplied.
 * Please excuse me on the package nomenclature :)
 */
object CalcSquareroot {

  def main(args: Array[String]): Unit = {
    val approximations = 15
    var assumption: Double = 2.00
    var num :Int = args(0).toInt
    
    for (n <- 1 until approximations){
     assumption = (assumption - (((assumption * assumption) - num) / (2*assumption))) 
    }
    println("Square root of " + num + " is : " + assumption)
  }
}