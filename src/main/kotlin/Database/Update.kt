package Database

import java.sql.*

class Update {
    private var con: Connection? = null
    private val username = "root"
    private val password = "ananya10"

    init {
        getConnection()
    }

    private fun getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver")
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/case_study", username, password)
        } catch (ex: Exception) {
            println("Exception occurred. Handled")
            ex.printStackTrace()
        }
    }

    fun updateDoctorDetails(doc_id: Int, hours: Double, break_needed: Double, total_slots: Int ) {
        // Prepare the SQL statement to insert the data into the Doctors table
        val statement = con?.prepareStatement("UPDATE doctor SET hours = ? ,break_needed = ?, total_slots = ? WHERE doc_id = ?")

        // Set the values for the prepared statement
        statement?.setDouble(1, hours)
        statement?.setDouble(2, break_needed)
        statement?.setInt(3, total_slots)
        statement?.setInt(4, doc_id)


        // Execute the update statement
        statement?.executeUpdate()

        // Close the database connection and resources
        statement?.close()
        con?.close()
    }
}
