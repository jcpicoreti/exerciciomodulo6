class Carro(override var velocity: Long,
            override var model: String,
            override var acceleration: Long = 10
) : Veiculo() {

    override fun velocityUp() {
        velocity += acceleration
    }

    override fun velocityDown() {
        if (velocity - acceleration < 0){
            velocity = 0
        }else{
            velocity -= acceleration
        }
    }
}