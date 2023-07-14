package Modules

import java.util.*

class DoctorModule {
    fun doctor() {
        var sc = Scanner(System.`in`)

        println("How many hours you are available today? : ")
        var hours = sc.nextInt()

        var hrsTomins: Int = hours * 60
        var oneSlot: Int = 15
        var total_slots_possible: Int = hrsTomins / 15

        println("How many hours break you will need? : ")
        var break_needed = sc.nextInt()

        if (hrsTomins > 120) {
            total_slots_possible = (hours - break_needed)/4
            println("Appointments to be taken by you are: $total_slots_possible")
            println("You can take break of 30 minutes")
        }
        else{
            println("Appointments to be taken by you are: $total_slots_possible")
        }
    }
}