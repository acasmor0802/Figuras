import kotlin.math.PI
import kotlin.math.sqrt

class Circulo(color: String, private val radio: Double) : Figura(color) {
    override fun area(): Double {
        return PI * radio * radio
    }

    override fun perimetro(): Double {
        return 2 * PI * radio
    }
}
