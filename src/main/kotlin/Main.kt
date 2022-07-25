import java.util.*

// create a class named main whose purpose is to run all our program. It extends StudentData class
object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        //create an instance of FindGradeLetter class called letter
        val letter = FindGradeLetter()
        // FinderGraeLetter class is a sub class of StudentData class. So it calls all methods in StudentData class
        println("")
        // create a scanner object
        val scanner = Scanner(System.`in`)
        print("Please enter a student gpa please: ")
        val y = scanner.nextDouble()
        val x: String = letter.gradeLetter(y)
        println("Student Grade Letter is: $x")
        letter.schoolDecision(x)
        scanner.close()
        println("")
        println("++++++++++Thanks++++++++++++")
    }
}