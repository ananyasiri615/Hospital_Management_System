package Modules

import java.util.*

class AdminModule {
    fun admin() {
        var sc = Scanner(System.`in`)

        println("Doctor Details: Enter Id: ")
        var doc_id: Int = sc.nextInt()

        println("Doctor Details: Enter name: ")
        var doc_name: String = sc.next()

        println("Doctor Details: Enter age: ")
        var age: Int = sc.nextInt()

        println("Doctor Details: Enter gender: ")
        var gender: String = sc.next()

        println("Doctor Details: Enter Department: ")
        var department: String = sc.next()
    }
}