fun main() {
    println("Digite o modelo do carro:")
    val model = readln()
    println("Digite a velocidade atual:")
    val velocity = readln().toLong()

    val meuCarro = Veiculo(velocity, model)
    println("Velocidade: ${meuCarro.velocity}")
    println("Aceleração: ${meuCarro.accelaration}")
    println("Modelo: ${meuCarro.model}")

    while(true){
        println("Escolha uma opção: (1) Aumentar velocidade / (2) Diminuir velocidade / (3) Sair")
        val option = readln().toInt()

        if (option == 1){
            meuCarro.velocityUp()
            println("Velocidade atual: ${meuCarro.velocity}")
        }else if (option == 2){
            meuCarro.velocityDown()
            println("Velocidade atual: ${meuCarro.velocity}")
        }else{
            break
        }
    }

}

