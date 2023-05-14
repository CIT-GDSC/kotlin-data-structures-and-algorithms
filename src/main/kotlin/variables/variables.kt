package variables

fun main() {
//	callUserName()
	sum(5, 8)
}

fun callUserName() {
	val userName: String = "Alpha user"
	val amount: Number = 18
	val condition: Boolean = true
	print("welcome to kotlin, $userName your Number is $amount and the condition is $condition")
}

fun sum(a: Int, b: Int): Unit {
	println(a + b)
}
