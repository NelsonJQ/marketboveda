package logica;
//aaaa
public class Admin{
    //Atributos
    int IDadmin;
    String Nombre_admin;
    String Email_admin;
    int Cedula_admin;
    String Direccion_admin;
    String Contraseña_admin;
    
    public int getIDadmin() {
        return IDadmin;
    }

    public void setIDadmin(int IDadmin) {
        this.IDadmin = IDadmin;
    }

    public String getNombre_admin() {
        return Nombre_admin;
    }

    public void setNombre_admin(String Nombre_admin) {
        this.Nombre_admin = Nombre_admin;
    }

    public String getEmail_admin() {
        return Email_admin;
    }

    public void setEmail_admin(String Email_admin) {
        this.Email_admin = Email_admin;
    }

    public int getCedula_admin() {
        return Cedula_admin;
    }

    public void setCedula_admin(int Cedula_admin) {
        this.Cedula_admin = Cedula_admin;
    }

    public String getDireccion_admin() {
        return Direccion_admin;
    }

    public void setDireccion_admin(String Direccion_admin) {
        this.Direccion_admin = Direccion_admin;
    }

    public String getContraseña_admin() {
        return Contraseña_admin;
    }

    public void setContraseña_admin(String Contraseña_admin) {
        this.Contraseña_admin = Contraseña_admin;
    }

//Constructor
public Admin(int IDadmin, String Nombre_admin, String Email_admin, int Cedula_admin, String Direccion_admin, String Contraseña_admin){
        this.IDadmin = IDadmin;
        this.Nombre_admin = Nombre_admin;
        this.Email_admin = Email_admin;
        this.Cedula_admin = Cedula_admin;
        this.Direccion_admin = Direccion_admin;
        this.Contraseña_admin = Contraseña_admin;
    }

//Funciones
//Aun no funciona, no se como importar la otra clase Cliente para guardar los datos
    public void RegistrarCliente(int IDcliente, String Nombre_cliente, String Email_cliente, int Cedula_cliente, String Direccion_cliente, String Contraseña_cliente) {
        //complete
    }

//Salida función imprimir
}




