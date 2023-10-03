import java.text.DecimalFormat
import kotlin.math.roundToLong


/**
 * @author amarnath-nitt 22/06/23
 * */

private val decimalFormat: DecimalFormat? = DecimalFormat("0.0000")
fun main() {
    var name : String = "Nitin Rajput"
    var age : Int = 24
    var income : Double = 2345.543
    sayHello(name, age, income)
}

fun sayHello(name: String, age: Int, income: Double) {
    if (decimalFormat != null) {
        println("Hello! $name . \nYour age is $age. \nYour income is ${decimalFormat.format(income)}")
    }
}
