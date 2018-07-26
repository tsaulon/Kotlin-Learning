//  Store class and function declarations in a package (module)
package geometry.shapes
import java.util.Random

class Circle(val diameter: Double){
    val radius: Double
        get() = this.diameter/2
    val area: Double
        get() = Math.PI*Math.pow(this.radius, 2.0)
    val circumference: Double
        get() = 2*Math.PI*this.radius

    override fun toString(): String = "Diameter: ${String.format("%.2f", this.diameter)} " +
                                      "Radius: ${String.format("%.2f", this.radius)} " +
                                      "Circumference: ${String.format("%.2f", this.circumference)}"
}

//  Helper Function
fun createRandomCircle(): Circle = Circle(Random().nextDouble())