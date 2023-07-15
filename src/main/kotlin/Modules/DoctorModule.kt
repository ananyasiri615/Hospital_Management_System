package Modules

import Database.Update
import java.util.*

class DoctorModule {
    private val sc = Scanner(System.`in`)

    fun getdoctorDetails() {
        println("Enter your details about the day")
        println("Doctor enter your ID : ")
        var doc_id = sc.nextInt()

        println("How many hours you are available today? : ")
        var hours = sc.nextDouble()

        var total_slots: Int

        println("How many hours break you will need? : ")
        var break_needed = sc.nextDouble()

        total_slots = ((hours - break_needed)*4).toInt()
        println("Appointments to be taken by you are: $total_slots")

        print("Doctor details Added successfully")

        var connectivity = Update()
        connectivity.updateDoctorDetails(doc_id, hours, break_needed, total_slots)
    }
}