package Database

import java.sql.DriverManager
import java.sql.*

object Select {
    var con : Connection ? = null
    var username = "root"
    var password = "ananya10"

    @JvmStatic
    fun main(args: Array<String>) {
        getConnection()
        executeQuery()
    }
    fun executeQuery(){
        try {
            var stmt: Statement? = null
            var rs: ResultSet? = null

            stmt = con!!.createStatement()
            // Read Operation
            var query: String = "select * from doctor"

            if (stmt.execute(query)) {
                rs = stmt.resultSet
            }
            while (rs!!.next()) {
                println("Doctor ID: "+rs.getInt("doc_id"))
                println("Doctor Name: "+rs.getString("doc_name"))
                println("Age: "+rs.getInt("age"))
                println("Gender: "+rs.getString("gender"))
                println("Department: "+rs.getString("department"))
                println("No. of Hours: "+rs.getInt("hours"))
                println("Total Slots: "+rs.getInt("total_slots"))
                println("Available Slots: "+rs.getInt("avail_slots"))

            }
        }catch (ex: Exception){
            ex.printStackTrace()
        }
    }
    fun getConnection() {
        try {
            // Load the driver class
            Class.forName("com.mysql.cj.jdbc.Driver")
            // Obtaining the connection object
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/case_study", username, password)
        } catch (ex: Exception) {
            println("Exception occured. Handled")
            ex.printStackTrace()
        }

    }

}