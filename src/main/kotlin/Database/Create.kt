package Database

import java.sql.DriverManager
import java.sql.*

object Create {
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

            // Create table
            var query: String = "create table doctor(doc_id int, doc_name varchar(100),age int,gender varchar(100),department varchar(100),hours int,break float,total_slots int, avail_slots int)"
           // var queryy: String = "insert into menu(id,item,quality) values (1,'Maggie', 'Good') "

            val rows = stmt!!.executeUpdate(query)
            //val rows1 = stmt!!.executeUpdate(queryy)
            println("Table created Successfully & values inserted ")
        }catch (ex: Exception){
            ex.printStackTrace()
        }
    }
    fun getConnection(){
        try {
            // Load the driver class
            Class.forName("com.mysql.cj.jdbc.Driver")
            // Obtaining the connection object
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/case_study", username, password)
        }catch (ex: Exception){
            println("Exception occured. Handled")
            ex.printStackTrace()
        }

    }

}