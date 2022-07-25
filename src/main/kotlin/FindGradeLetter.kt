class FindGradeLetter {
    fun gradeLetter(gpa: Double): String {
        var gradLetter = " "
        if (gpa in 3.7..4.0) gradLetter = "A" else if (gpa in 2.7..3.6) {
            gradLetter = "B"
            println()
        } else if (gpa in 1.7..2.6) {
            gradLetter = "C"
            println()
        } else if (gpa in 0.7..1.6) {
            gradLetter = "D"
            println()
        } else {
            gradLetter = "F"
            println()
        }
        return gradLetter
    }

    fun schoolDecision(gradLetter: String?) {
        when (gradLetter) {
            "B" -> println("student demostrate a Considerable Understanding")
            "C" -> println("Student demonstrates a Sufficient Understanding")
            "D" -> println("student demostrate a Poor Understanding")
            "F" -> println("Student fails the class")
            "A" -> println("Student demonstrates an Outstanding Understanding")
            else -> println("Error: letter does not match")
        }
    }
}