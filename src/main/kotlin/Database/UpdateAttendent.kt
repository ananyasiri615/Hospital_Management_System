package Database

import java.sql.*
import Modules.DoctorModule
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
    fun isSlotAvailable(body_part: String: String, total_slots: Int): Boolean {
        val statement = con?.prepareStatement("SELECT COUNT(*) AS count FROM doctor WHERE body_part = ?")
        //select avail_slots from doctor where body_part = skin
        statement?.setString(1, body_part)
        val resultSet = statement?.executeQuery()
        var count = 0
        if (resultSet?.next() == true) {
            count = resultSet.getInt("count")
        }
        statement?.close()
        resultSet?.close()
        println(total_slots)
        return count < total_slots
    }
    fun getpatientDetails(body_part: String, avail_slots: Int ) {

        // Prepare the SQL statement to update the data into the Doctors table
        val statement = con?.prepareStatement("UPDATE doctor SET avail_slots = ? WHERE body_part = '?'")

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
