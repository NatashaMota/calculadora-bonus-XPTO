fun main(args: Array<String>) {
    var cargo = "coordenador";
    var idade = 60
    var anosExperiencia = 18

    var bonus: Float
    var melhorIdade: Boolean

    if (cargo.contentEquals("gerente", true)){
        bonus = calculoGerente(anosExperiencia)
    } else if (cargo.contentEquals("coordenador", true)){
        bonus = calculoCoordenador(anosExperiencia)
    } else if(cargo.contentEquals("engenheiro", true)){
        bonus = calculoEngenheiros(anosExperiencia)
    } else{
        bonus = 0f
    }

    imprimirResultado(bonus, calculoMelhorIdade(idade))
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