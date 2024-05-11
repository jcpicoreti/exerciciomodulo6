abstract class Veiculo(var velocity: Long, var model: String, var acceleration: Long = 10 ) {

    fun velocityUp(){
        velocity += acceleration
    }

    fun velocityDown(){
        if (velocity - acceleration < 0){
            velocity = 0
        }else{
            velocity -= acceleration
        }

    }
}