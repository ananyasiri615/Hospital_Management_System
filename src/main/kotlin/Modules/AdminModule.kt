package Modules

import Database.Insert
import java.util.*

class AdminModule {
    private val scanner = Scanner(System.`in`)

    fun getAdminDetails() {
        println("Enter the doctor's details")
        println("Enter Doctor ID: ")
        var doc_id = scanner.nextInt()
        scanner.nextLine()

        println("Enter Doctor name: ")
        var doc_name = scanner.nextLine()

        print("Enter Doctor Age: ")
        var age = scanner.nextInt()
        scanner.nextLine()

        print("Enter Doctor Gender: ")
        var gender = scanner.nextLine()

        print("Enter Doctor Department: ")
        var department = scanner.nextLine()

        print("Enter body part: ")
        var body_part = scanner.nextLine()

        print("Doctor details Added successfully")

        val connectivity = Insert()
        connectivity.insertDoctorDetails(doc_id, doc_name, age, gender, department, body_part)
    }
}