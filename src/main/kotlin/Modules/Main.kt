package Modules

import java.util.*

fun main(args: Array<String>) {
    println("Hello, Sir/Madam!")
    println()
    confirmDes()
}
fun confirmDes() {
    println("Confirm your designation")
    println("1. Doctor")
    println("2. Admin")
    println("3. Attendant")
    print("Please enter your designation: ")

    val scanner = Scanner(System.`in`)
    val input = scanner.nextLine()

    when (input?.toIntOrNull()) {
        1 -> {
            println("Hello, doctor!")
            val docvar = DoctorModule()
            docvar.doctor()
        }
        2 -> {
            println("Hello, admin!")
            val adminvar = AdminModule()
            adminvar.getAdminDetails()
        }
        3 -> {
            println("Hello, attendant!")
            val attendantvar = AttendantsModule()
            attendantvar.attendant()
        }
        else -> println("Invalid designation")
    }

    scanner.close()
}
