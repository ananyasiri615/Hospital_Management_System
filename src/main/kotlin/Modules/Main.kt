package Modules

import java.util.*
data class doctor(
    var doc_id: Int,
    var doc_name: String,
    var age: Int,
    var gender: String,
    var department: String,
    var body_part:String,
    var hours: Double,
    var total_slots: Int,
    var avail_slots: Int
)

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

    var scanner = Scanner(System.`in`)
    var input = scanner.nextLine()

    when (input?.toIntOrNull()) {
        1 -> {
            println("Hello, doctor!")
            var docvar = DoctorModule()
            docvar.getdoctorDetails()
        }
        2 -> {
            println("Hello, admin!")
            var adminvar = AdminModule()
            adminvar.getAdminDetails()
        }
        3 -> {
            println("Hello, attendant!")
            var attendantvar = AttendantsModule()
            attendantvar.getPatientDetails()
        }
        else -> println("Invalid designation")
    }

    scanner.close()
}
