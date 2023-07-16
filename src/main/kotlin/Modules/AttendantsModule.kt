package Modules

import java.util.*
import Database.UpdateAttendent
class AttendantsModule {
    private var sc = Scanner(System.`in`)

    fun getpatientDetails() {
        println("Enter the patient's name: ")
        var patientName = sc.nextLine()

        println("Enter which body part to be examined: ")
        var part = sc.nextLine()

        var body_part: String? = null

        if (body_part == "skin"){
            println("Your appointment is fixed with Dr. John (Dermatologist)")
        }
        if (body_part == "lungs"){
            println("Your appointment is fixed with Dr. Sharpe (Oncologist)")
        }
        if (body_part == "heart"){
            println("Your appointment is fixed with Dr. Dhruv (Cardiologist)")
        }
        if (body_part == "ENT"){
            println("Your appointment is fixed with Dr. Divya (Dermatologist)")
        }
        if (body_part == "X-ray"){
            println("Your appointment is fixed with Dr. Shilpa (Radiologist)")
        }

    }
}