abstract class Veiculo() {
    abstract var velocity: Long
    abstract var model: String
    abstract var acceleration: Long

    abstract fun velocityUp()

    abstract fun velocityDown()
}


