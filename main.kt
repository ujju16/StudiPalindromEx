import java.util.*

fun main() {
  val input = Scanner(System.`in`)
  println("Choisir un nombre")
  var nbre = input.nextInt()

  var inverseNbre = 0
  var remainder: Int
  val origineNbre: Int

  origineNbre = nbre

  while (nbre != 0) {
    remainder = nbre % 10
    inverseNbre = inverseNbre * 10 + remainder
    nbre /= 10
  }

  if (origineNbre == inverseNbre)
    println("$origineNbre est un palindrome")
  else
    println("$origineNbre n'est pas un palindrome")
}