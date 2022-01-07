class Deer(
    val name: String,
    private val speed: Int,
    private val stamina: Int,
    private val recoveryTime: Int,
) {
    fun calculate(time: Int): Int {
        var remainingTime = time
        var distance = 0
        while (remainingTime > 0) {
            distance += stamina * speed
            remainingTime -= stamina
            remainingTime -= recoveryTime
        }
        return distance
    }
}