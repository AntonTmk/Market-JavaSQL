package sample;


import org.omg.PortableInterceptor.USER_EXCEPTION;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseHandler extends Configs {
Connection dbConnection;
public Connection getDbConnection() throws ClassNotFoundException, SQLException{
    String connectionString="jdbc:mysql://"+dbHost+":"+dbPort+"/"+dbName;

    Class.forName("com.mysql.jdbc.Driver");

    dbConnection= DriverManager.getConnection(connectionString, dbUser, dbPass);

    return dbConnection;
}
public void signUP(String a, int b) throws SQLException, ClassNotFoundException {
    String insert = "INSERT INTO "+Const.TABLE+ "("+Const.first+","+Const.second+")"+"VALUES(?,?)";
    PreparedStatement prST;
    prST = getDbConnection().prepareStatement(insert);
    prST.setString(1, a);
    prST.setInt(2, b);

    try {
        prST.executeUpdate();
    }catch(SQLException e){
        e.printStackTrace();
    }

    }

  /*  public String min(){
    Scanner in = new Scanner(System.in);
        String select = "SELECT "+Const.first+" FROM "+ Const.TABLE+" WHERE "+Const.second+"=(SELECT min("+Const.second+") FROM "+Const.TABLE+");";
String a = resultSet
        return a;
    }*/
}
