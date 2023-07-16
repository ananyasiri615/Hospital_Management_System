package Modules

import java.util.*
import Database.UpdateAttendent
import Modules.*


class AttendantsModule {
    var sc = Scanner(System.`in`)

    fun getpatientDetails() {
        println("Enter the patient's name: ")
        var patientName = sc.nextLine()

        println("Enter which body part to be examined: ")
        val body_part = sc.nextLine()


        val total_slots= DoctorModule().getDoctorDetails()

        val connectivity = UpdateAttendent()
        if (connectivity.isSlotAvailable(body_part, total_slots)) {
            println("Your appointment is fixed with the appropriate doctor.")
        } else {
            println("Failed to book the appointment. Please try again.")
        }
    }
}
