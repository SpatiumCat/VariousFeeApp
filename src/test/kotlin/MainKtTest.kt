import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun feeForVisaAndMirShouldReturnNormalFee() {
        val currentAmount = 75000

        val result = feeForVisaAndMir(currentAmount)

        assertEquals(80625, result)
    }

    @Test
    fun feeForVisaAndMirShouldReturnMinimumFee() {
        val currentAmount = 100

        val result = feeForVisaAndMir(currentAmount)

        assertEquals(135, result)
    }

    @Test
    fun resultAmountWithFee_ShouldReturnForMaestro () {

        val typeOfAccount = "Maestro"
        val currentAmount = 75000
        val amountForMonth = 0

        val result = resultAmountWithFee(currentAmount, typeOfAccount, amountForMonth)

        assertEquals(75000, result)
    }

    @Test
    fun resultAmountWithFee_ShouldReturnForMaestro2 () {

        val typeOfAccount = "Maestro"
        val currentAmount = 1000
        val amountForMonth = 678

        val result = resultAmountWithFee(currentAmount, typeOfAccount, amountForMonth)

        assertEquals(1000, result)
    }


    @Test
    fun resultAmountWithFee_ShouldReturnForMaestroExtraLimit () {

        val typeOfAccount = "Maestro"
        val currentAmount = 75001
        val amountForMonth = 0

        val result = resultAmountWithFee(currentAmount, typeOfAccount, amountForMonth)

        assertEquals(79521, result)
    }

    @Test
    fun resultAmountWithFee_ShouldReturnForMastercard () {

        val typeOfAccount = "Mastercard"
        val currentAmount = 75000
        val amountForMonth = 0

        val result = resultAmountWithFee(currentAmount, typeOfAccount, amountForMonth)

        assertEquals(75000, result)
    }

    @Test
    fun resultAmountWithFee_ShouldReturnForMastercard2 () {

        val typeOfAccount = "Mastercard"
        val currentAmount = 1000
        val amountForMonth = 678

        val result = resultAmountWithFee(currentAmount, typeOfAccount, amountForMonth)

        assertEquals(1000, result)
    }

    @Test
    fun resultAmountWithFee_ShouldReturnForMastercardExtraLimit () {

        val typeOfAccount = "Mastercard"
        val currentAmount = 75001
        val amountForMonth = 0

        val result = resultAmountWithFee(currentAmount, typeOfAccount, amountForMonth)

        assertEquals(79521, result)
    }

    @Test
    fun resultAmountWithFee_ShouldReturnForVisa () {

        val typeOfAccount = "Visa"
        val currentAmount = 75000
        val amountForMonth = 0

        val result = resultAmountWithFee(currentAmount, typeOfAccount, amountForMonth)

        assertEquals(80625, result)
    }

    @Test
    fun resultAmountWithFee_ShouldReturnForMir () {

        val typeOfAccount = "Mir"
        val currentAmount = 75000
        val amountForMonth = 0

        val result = resultAmountWithFee(currentAmount, typeOfAccount, amountForMonth)

        assertEquals(80625, result)
    }

    @Test
    fun resultAmountWithFee_ShouldReturnForVKPay () {

        val typeOfAccount = "SberPay"
        val currentAmount = 73000
        val amountForMonth = 0

        val result = resultAmountWithFee(currentAmount, amountForMonth = amountForMonth, typeOfAccount = typeOfAccount)

        assertEquals(73000, result)
    }

    @Test
    fun resultAmountWithFee_ShouldReturnForVKPay2 () {

        val typeOfAccount = "VK Pay"
        val currentAmount = 74000
        val amountForMonth = 0

        val result = resultAmountWithFee(currentAmount)

        assertEquals(74000, result)
    }
}