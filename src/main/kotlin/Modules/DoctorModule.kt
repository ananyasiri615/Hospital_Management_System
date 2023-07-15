package Modules

import java.util.*

class DoctorModule {
    private val sc = Scanner(System.`in`)

    fun doctor() {
        println("Doctor enter your ID : ")
        var doc_id = sc.nextInt()

        println("How many hours you are available today? : ")
        var hours = sc.nextInt()

        var hrsTomins: Int = hours * 60
        var oneSlot: Int = 15
        var total_slots: Int = hrsTomins / 15

        println("How many hours break you will need? : ")
        var break_needed = sc.nextInt()

        if (hrsTomins > 120) {
            total_slots = (hours - break_needed)/4
            println("Appointments to be taken by you are: $total_slots")
        }
        else{
            println("Appointments to be taken by you are: $total_slots")
        }
    }
}