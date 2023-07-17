package Modules

import Database.UpdateAttendent
import java.util.*

class AttendantsModule {
    private val sc = Scanner(System.`in`)

    fun getPatientDetails() {
        println("Enter the patient's name: ")
        val patientName = sc.nextLine()

        println("Enter which body part to be examined: ")
        val body_part = sc.nextLine()

        val doctorModule = DoctorModule()
        val total_slots = doctorModule.getdoctorDetails()

        val connectivity = UpdateAttendent()
        if (total_slots > 0) {
            if (connectivity.isSlotAvailable(body_part, total_slots)) {
                    println("Your appointment is fixed with the appropriate doctor.")
            }
            else {
                println("No slots available for the selected body part. Please come tomorrow.")
            }
        }
        connectivity.getpatientDetails(body_part, avail_slots)
    }
}
