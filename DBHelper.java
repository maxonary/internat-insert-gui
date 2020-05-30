import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DBHelper
{
    //Verbindung zur StatusGUI zum Anzeigen des Erfolgs der Eingaben
    StatusGUI status = new StatusGUI();
    
    Connection conn = null;
    Statement stmt = null;
    ResultSet rset = null;
    
    
    
    
    public Connection createConnection() {
        String protokoll = "jdbc:sqlite:";
        //falls nötig den eigenen Pfad der Datei einfügen
        String datenbank = "/Users/maxonary/Documents/Informatik/BlueJ.4.2.2/Maximilian_Arnold_Schülerverwaltung_Internat/database.db" /*"database.db"*/;
    
        try {
            //1. Passenden Treiber laden
            Class.forName("org.sqlite.JDBC").newInstance();
            //2. Verbindung zur DB erstellen
            conn = DriverManager.getConnection(protokoll+datenbank);
            System.out.println("Verbindung zur Datenbank steht.");
            // 3. Erzeugen eines Statements durch das Verbindungs-Objekt
            stmt = conn.createStatement();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return conn;
    }
    
    public void closeConnection() {
        try {
            // 6. Ergebnismenge schliessen
            rset.close();
            // 7. Statement schliessen
            stmt.close();
            // 8. Verbindung schliessen     
            conn.close();
            System.out.println("Abgemeldet.\n");
            
            /**Anzeigen dass die Eingabe erfolgreich war (siehe StatusGUI)**/
            status.good();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
    
    
    
}
