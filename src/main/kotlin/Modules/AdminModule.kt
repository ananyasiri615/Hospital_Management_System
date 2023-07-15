package Modules

import Database.Insert
import java.util.*

data class doctor(
    var doc_id: Int,
    var doc_name: String,
    var age: Int,
    var gender: String,
    var department: String
)

class AdminModule {
    private val scanner = Scanner(System.`in`)

    fun getAdminDetails() {
        println("Enter the doctor's details")
        println("Enter Doctor ID: ")
        val doc_id = scanner.nextInt()
        scanner.nextLine()

        println("Enter Doctor name: ")
        val doc_name = scanner.nextLine()

        print("Enter Doctor Age: ")
        val age = scanner.nextInt()
        scanner.nextLine()

        print("Enter Doctor Gender: ")
        val gender = scanner.nextLine()

        print("Enter Doctor Department: ")
        val department = scanner.nextLine()

        print("Doctor details Added successfully")

        val connectivity = Insert()
        connectivity.insertDoctorDetails(doc_id, doc_name, age, gender, department)
    }
}