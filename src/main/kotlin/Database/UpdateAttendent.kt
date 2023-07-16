package Database

import java.sql.*

class UpdateAttendent {
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
    fun isDoctorAvailable(body_part: String) {

    }
    fun getpatientDetails(body_part: String, avail_slots: Int ) {
        // Prepare the SQL statement to insert the data into the Doctors table
        val statement = con?.prepareStatement("UPDATE doctor SET avail_slots = ? WHERE body_part = ?")

        // Set the values for the prepared statement
        statement?.setInt(1, avail_slots)
        statement?.setString(2, body_part)


        // Execute the update statement
        statement?.executeUpdate()

        // Close the database connection and resources
        statement?.close()
        con?.close()
    }
}
