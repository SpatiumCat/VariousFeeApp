fun main() {

    val typeOfAccount = "Visa"
    val currentAmount = 75000
    val amountForMonth = 1

    println(resultAmountWithFee(currentAmount, typeOfAccount, amountForMonth))

}

fun resultAmountWithFee(currentAmount: Int, typeOfAccount: String = "VK Pay", amountForMonth: Int = 0): Int =

    when (typeOfAccount) {
        "Mastercard", "Maestro" ->
            if (currentAmount + amountForMonth in 0..75000) currentAmount
            else feeForMastercardAndMaestro(currentAmount)
        "Visa", "Mir" -> feeForVisaAndMir(currentAmount)
        else -> currentAmount
    }

fun feeForMastercardAndMaestro(currentAmount: Int): Int {
    val feePercent = 0.06
    val extraFee = 20
    return (currentAmount * (1 + feePercent) + extraFee).toInt()
}

fun feeForVisaAndMir(currentAmount: Int): Int {
    val feePercent = 0.075
    val minimumFee = 35
    val resultFee = (currentAmount * (1 + feePercent)).toInt()
    return if (resultFee <= minimumFee) currentAmount + minimumFee else resultFee
}