package Database

import java.sql.*

class Insert {
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

    fun insertDoctorDetails(doc_id: Int, doc_name: String, age: Int, gender: String, department: String) {
        // Prepare the SQL statement to insert the data into the Doctors table
        val statement = con?.prepareStatement("INSERT INTO doctor(doc_id, doc_name, age, gender, department) VALUES (?, ?, ?, ?, ?)")

        // Set the values for the prepared statement
        statement?.setInt(1, doc_id)
        statement?.setString(2, doc_name)
        statement?.setInt(3, age)
        statement?.setString(4, gender)
        statement?.setString(5, department)

        // Execute the insert statement
        statement?.executeUpdate()

        // Close the database connection and resources
        statement?.close()
        con?.close()
    }
}
