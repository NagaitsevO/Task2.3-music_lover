fun main() {
    val termStatus = true
    val termDiscount = 0.01
    val previousePurchasesSumm = 1012
    val discountFix = 100
    val discountPercent = 0.05
    val pricePurchaseSumm = 11_000.00
    var currentPurchaseSumm = pricePurchaseSumm

    if ((previousePurchasesSumm > 1_001) && (previousePurchasesSumm < 10_000))
        currentPurchaseSumm -= discountFix
    if (previousePurchasesSumm > 10_001)
        currentPurchaseSumm = currentPurchaseSumm * (1 - discountPercent)
    if (termStatus == true)
        currentPurchaseSumm = currentPurchaseSumm * (1 - termDiscount)

    println("Сумма Вашей покупки по прайсу = $pricePurchaseSumm рублей")
    println("Сумма Вашей покупки с учётом скидок = $currentPurchaseSumm рублей")

}