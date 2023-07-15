package Modules

import java.util.*

data class doctor(
    var doc_id: Int,
    var doc_name: String,
    var age: Int,
    var gender: String,
    var department: String
)

class AdminModule {
    private var sc: Scanner? = null

    fun getScanner(): Scanner {
        sc = Scanner(System.`in`)
        return sc!!
    }

    fun closeScanner() {
        sc?.close()
    }

    fun getAdminDetails(): doctor {
        val scanner = getScanner()

        println("Doctor Details: Enter Id: ")
        val doc_id: Int = scanner.nextInt()

        println("Doctor Details: Enter name: ")
        val doc_name: String = scanner.next()
        scanner.nextLine()

        println("Doctor Details: Enter age: ")
        val age: Int = scanner.nextInt()

        println("Doctor Details: Enter gender: ")
        val gender: String = scanner.next()

        println("Doctor Details: Enter Department: ")
        val department: String = scanner.next()

        closeScanner()

        return doctor(doc_id, doc_name, age, gender, department)
    }
}