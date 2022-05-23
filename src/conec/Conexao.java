package conec;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {    
    
     public Connection con;
    
     public Conexao() {
     System.out.println("Conectando ao banco...");
     
        String connectionUrl ="jdbc:mysql://localhost:3306;"+"databaseName=manutencao;user=root;";
       
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
           } catch (ClassNotFoundException ex) {               
               Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);   
               
           }        
        
        try {
          con =  DriverManager.getConnection("jdbc:mysql://127.0.0.1/manutencao","root","");             
            } catch(SQLException ex) {
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex); 
                
        }
    
    }

    public Connection getCon() {
        return con;
    }   
//---------- criou pra teste
  
}
        
   

