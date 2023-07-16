package Modules

import Database.Update
import java.util.*

class DoctorModule {
     var sc = Scanner(System.`in`)

    fun getdoctorDetails(): Int {
        println("Enter your details about the day")
        println("Doctor enter your ID : ")
        var doc_id = sc.nextInt()

        println("How many hours you are available today? : ")
        var hours = sc.nextDouble()

        var total_slots: Int

        if (hours < 2.0 && hours < 0) {
            total_slots = (hours * 60 / 15).toInt()
        }
        else if (hours >= 2) {
            var availableHours = hours - 0.5
            total_slots = (availableHours * 60 / 15).toInt()
        }
        else{
            println("Hey Doctor please inform the hospital that you are on leave today!!!")
            total_slots = 0
        }

        println("Appointments to be taken by you are: $total_slots")

        print("Doctor details Added successfully")

        var connectivity = Update()
        connectivity.updateDoctorDetails(doc_id, hours, total_slots)

        return total_slots
    }

}