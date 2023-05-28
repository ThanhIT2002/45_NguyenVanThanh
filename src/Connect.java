import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author admin
 */
public class Connect {
    private final Connection conn;
    public void Close() throws SQLException{
        if(conn!=null){
            conn.close();
        }
    }
    public Connect() throws SQLException,ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/cau2";
        this.conn = DriverManager.getConnection(url,"root","");
    }

    public ResultSet GetData(String hocsinh)throws SQLException,ClassNotFoundException{
        ResultSet RS = null;
        Statement st = this.conn.createStatement();
        String sql = "select * from hocsinh";
        RS = st.executeQuery(sql);
        return RS;
    }
    public ResultSet GetDataSearch(String TimKiem)throws SQLException,ClassNotFoundException{
        ResultSet RS = null;
        Statement st = this.conn.createStatement();
        RS = st.executeQuery("select * from hocsinh where TenHS LIKE '%"+TimKiem+"%'");
        return RS;
    }
     public void Insert(String MaHS,String TenHS,float DiemToan,float DiemVan)throws SQLException{
        Statement sta = this.conn.createStatement();
        String sqlInsert = "insert hocsinh values('"+MaHS+"','"+TenHS+"',"+DiemToan+","+DiemVan+")";
        sta.executeUpdate(sqlInsert);
    }
      public void update(String MaHS,String TenHS,float DiemToan,float DiemVan) throws SQLException{
        Statement st = this.conn.createStatement();
        String sqlTenHS = "update hocsinh set  TenHS= '"+TenHS+"'where MaHS ='"+MaHS+"'";
        String sqlDiemToan = "update hocsinh set DiemToan = '"+DiemToan+"'where MaHS ='"+MaHS+"'";
        String sqlDiemVan = "update hocsinh set DiemVan = '"+DiemVan+"'where MaHS ='"+MaHS+"'";
        
        st.executeUpdate(sqlTenHS);
        st.executeUpdate(sqlDiemToan);
        st.executeUpdate(sqlDiemVan);
    }
     public void Delete(String MaHS) throws SQLException,ClassNotFoundException{
        Statement st = this.conn.createStatement();
        st.executeUpdate("delete from hocsinh where MaHS= '"+MaHS+"'");
    }
    public static void main(String[] arg )throws SQLException,ClassNotFoundException{
        Connect cn = new  Connect();
    }
   
}