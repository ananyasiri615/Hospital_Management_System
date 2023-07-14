package Modules

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

    val input = readlnOrNull()

    when (input?.toIntOrNull()) {
        1 -> {
            println("Hello, doctor!")
            var docvar = DoctorModule()
            docvar.doctor()
        }
        2 -> {
            println("Hello, admin!")
            var adminvar = AdminModule()
            adminvar.admin()
        }
        3 -> {
            println("Hello, attendant!")
            var attendantvar = AttendantsModule()
            attendantvar.attendant()
        }
        else -> println("Invalid designation")
    }
}
