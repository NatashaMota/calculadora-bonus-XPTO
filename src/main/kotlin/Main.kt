fun main(args: Array<String>) {
    var cargo = "coordenador";
    var idade = 60
    var anosExperiencia = 18
    var melhorIdade: Boolean

    imprimirResultado(bonusPorCargo(cargo, anosExperiencia), calculoMelhorIdade(idade))
}

fun bonusPorCargo(cargo: String, anosExperiencia: Int): Float{
    var bonus: Float = 0f
    when (cargo){
        "gerente" -> bonus = calculoGerente(anosExperiencia)
        "coordenador" -> bonus = calculoCoordenador(anosExperiencia)
        "engenheiro" -> bonus = calculoEngenheiros(anosExperiencia)
    }
    return bonus
}

fun imprimirResultado(bonus: Float, melhorIdade: Boolean){
    print("O bônus é de R$${bonus}")
    if (melhorIdade){
        println(" + 5 dias de folga.")
    }
}

fun calculoMelhorIdade(idade: Int) = idade in 60..200;

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

fun calculoEngenheiros(anosExperiencia: Int): Float{
    return 1000.00f
}