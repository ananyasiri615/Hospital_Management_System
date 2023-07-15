package Database

import Modules.AdminModule
import java.sql.*

object Insert {
    var con: Connection? = null
    var username = "root"
    var password = "ananya10"

    fun insertDoctorDetails(doc_id: Int, doc_name: String, age: Int, gender: String, department: String) {
        getConnection()
        executeQuery(doc_id, doc_name, age, gender, department)
    }

    private fun executeQuery(doc_id: Int, doc_name: String, age: Int, gender: String, department: String) {
        try {
            var stmt: Statement? = null

            stmt = con!!.createStatement()
            val query = "INSERT INTO doctor(doc_id, doc_name, age, gender, department) VALUES (?, ?, ?, ?, ?)"
            val preparedStmt = con!!.prepareStatement(query)
            preparedStmt.setInt(1, doc_id)
            preparedStmt.setString(2, doc_name)
            preparedStmt.setInt(3, age)
            preparedStmt.setString(4, gender)
            preparedStmt.setString(5, department)

            val rows = preparedStmt.executeUpdate()

            println("Insertion Successful: $rows")

            preparedStmt.close()
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }

    private fun getConnection() {
        try {
            // Load the driver class
            Class.forName("com.mysql.cj.jdbc.Driver")
            // Obtaining the connection object
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/case_study", username, password)
        } catch (ex: Exception) {
            println("Exception occurred. Handled")
            ex.printStackTrace()
        }
    }
}

fun main(args: Array<String>) {
    val adminModule = AdminModule()
    val adminDetails = adminModule.getAdminDetails()

    Insert.insertDoctorDetails(
        adminDetails.doc_id,
        adminDetails.doc_name,
        adminDetails.age,
        adminDetails.gender,
        adminDetails.department
    )
}
