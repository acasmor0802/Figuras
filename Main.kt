import kotlin.math.PI
import kotlin.math.sqrt

abstract class Figura(val color: String) {
    abstract fun area(): Double
    abstract fun perimetro(): Double
}

class Circulo(color: String, private val radio: Double) : Figura(color) {
    override fun area() = PI * radio * radio
    override fun perimetro() = 2 * PI * radio
}

class Rectangulo(color: String, private val largo: Double, private val ancho: Double) : Figura(color) {
    override fun area() = largo * ancho
    override fun perimetro() = 2 * (largo + ancho)
}

class Triangulo(
    color: String,
    private val lado1: Double,
    private val lado2: Double,
    private val lado3: Double
) : Figura(color) {
    override fun area(): Double {
        val s = perimetro() / 2
        return sqrt(s * (s - lado1) * (s - lado2) * (s - lado3))
    }

    override fun perimetro() = lado1 + lado2 + lado3
}
fun main() {
    val figuras = listOf(
        Circulo("Rojo", 5.0),
        Rectangulo("Azul", 4.0, 6.0),
        Triangulo("Verde", 3.0, 4.0, 5.0)
    )

    figuras.forEach { figura ->
        println("${figura::class.simpleName} - Color: ${figura.color}")
        println("Área: ${"%.2f".format(figura.area())}")
        println("Perímetro: ${"%.2f".format(figura.perimetro())}\n")
    }
}
