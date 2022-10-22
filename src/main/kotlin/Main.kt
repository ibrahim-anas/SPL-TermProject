fun main() {
  // Allows users to set calorie goals (Maggie)
  println("Enter your calorie goal: ")
  var goal = readLine()?.toDoubleOrNull()?: error("enter a number")
  println("Your goal is " + goal + "!")
}
