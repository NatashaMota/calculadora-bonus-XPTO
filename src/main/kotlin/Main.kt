fun main() {

    var cargo: String? = null
    while ((cargo == null) || (cargo == "")){
        print("Cargo: ")
        cargo = readLine()

    }

    var idade: Int? = null
    while (idade == null){
        print("Idade: ")
        idade = readLine()?.toInt()
    }

    var anosExperiencia: Int? = null
    while (anosExperiencia == null){
        print("Anos de experiencia: ")
        anosExperiencia = readLine()?.toInt()
    }

    imprimirResultado(bonusPorCargo(cargo, anosExperiencia), calculoMelhorIdade(idade))
}

fun bonusPorCargo(cargo: String, anosExperiencia: Int): Float{
    return when (cargo){
        "gerente" -> calculoGerente(anosExperiencia)
        "coordenador" -> calculoCoordenador(anosExperiencia)
        "engenheiro" -> calculoEngenheiros()
        else -> 0f
    }
}

fun imprimirResultado(bonus: Float, melhorIdade: Boolean){
    print("O bônus é de R$${bonus}")
    if (melhorIdade){
        println(" + 5 dias de folga.")
    }
}

fun calculoMelhorIdade(idade: Int) = idade in 60..200

fun calculoGerente(anosExperiencia: Int): Float{
    return if(anosExperiencia >= 2){
        3000.00f
    } else{
        2000.00f
    }
}

fun calculoCoordenador(anosExperiencia: Int): Float{
    return if(anosExperiencia < 1){
        1500.00f
    } else{
        1800.00f
    }
}

fun calculoEngenheiros(): Float{
    return 1000.00f
}