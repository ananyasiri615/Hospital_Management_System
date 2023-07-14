package Modules

import java.util.*

class AttendantsModule {
    fun attendant() {
        var sc = Scanner(System.`in`)

        println("Enter the patient's name: ")
        var patientName = sc.nextLine()

        println("Enter which body part to be examined: ")
        var part = sc.nextLine()

        var bodypart: String? = null

        if (bodypart == "skin"){
            println("Your appointment is fixed with Dr. John (Dermatologist)")
        }
        if (bodypart == "lungs"){
            println("Your appointment is fixed with Dr. John (Oncologist)")
        }
        if (bodypart == "heart"){
            println("Your appointment is fixed with Dr. John (Cardiologist)")
        }
        if (bodypart == "ENT"){
            println("Your appointment is fixed with Dr. John (Dermatologist)")
        }
        if (bodypart == "X-ray"){
            println("Your appointment is fixed with Dr. John (Radiologist)")
        }

    }
}