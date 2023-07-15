package Database

import java.sql.Connection
import java.sql.DriverManager

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

    fun updateDoctorDetails(doc_id: Int, hours: Int, break_needed: Int, total_slots:Int, avail_slots: Int ) {
        // Prepare the SQL statement to insert the data into the Doctors table
        val statement = con?.prepareStatement("UPDATE doctor SET hours = ? ,break_needed = ?, total_slots = ?,avail_slots = ? WHERE doc_id = ?';")

        // Set the values for the prepared statement
        statement?.setInt(1, doc_id)
        statement?.setInt(2, hours)
        statement?.setInt(3, break_needed)
        statement?.setInt(4, total_slots)
        statement?.setInt(5, avail_slots)


        // Execute the insert statement
        statement?.executeUpdate()

        // Close the database connection and resources
        statement?.close()
        con?.close()
    }
}
