/**
 *
 */
package greeter

/**
 * @author piu.sharma
 *
 */
object Calct {
	def main(args: Array[String]) {
		var sum:Int =0
		for(n <- 1 until(1000) ; if n%3 == 0 || n%5 == 0)
		  //if(n%3 == 0 || n%5 == 0)
		    sum += n
		println(sum)
	}
}