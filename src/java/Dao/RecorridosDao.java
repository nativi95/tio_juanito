
package Dao;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;
import modelo.BarriosBean;
import modelo.ColegiosBean;


public class RecorridosDao {
    
    PreparedStatement ps;
    ResultSet rs;
    private Conexion conn= new Conexion();

    public RecorridosDao(Conexion conn) {
    this.conn=conn;
    }
    
   
    
    public List<BarriosBean> mostrarBarrios(){
     List<BarriosBean> list=new LinkedList<>();
        String sql="select * from barrios";
        try {
            ps=conn.conectar().prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
            BarriosBean barrios=new BarriosBean(rs.getInt(1));
            barrios.setNombre(rs.getString(2));
            list.add(barrios);
            }
            
        } catch (Exception e) {
            System.out.println(ps+"");
        }
        
    return list;
    }
     public List<ColegiosBean> mostrarColegios(){
     List<ColegiosBean> list=new LinkedList<>();
        String sql="select * from barrios";
        try {
            ps=conn.conectar().prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
            ColegiosBean colegios=new ColegiosBean(rs.getInt(1));
            colegios.setNombre(rs.getString(2));
            list.add(colegios);
            }
            
        } catch (Exception e) {
            System.out.println(ps+"");
        }
        
    return list;
    }
    
    
}
