package ejercicio15;

import java.util.Scanner;



public class PERSONAL_DATE {
    private String nombre;
    private int edad; 
    private int num_cedula ;
    private String fecha_nac;
    private String direccion;
    private int telefo;
    //constructor
    public  PERSONAL_DATE() {
                
    }
    Scanner teclado = new Scanner(System.in);//ingresar por teclado
  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNum_cedula() {
        return num_cedula;
    }

    public void setNum_cedula(int num_cedula) {
        this.num_cedula = num_cedula;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefo() {
        return telefo;
    }

    public void setTelefo(int telefo) {
        this.telefo = telefo;
    }
      
   
    
    public void Loading_Data(int opcion_usu){
            System.out.println("--------------------");
            System.out.println("USUARIO"+opcion_usu);
            System.out.println("Ingrese.");
            System.out.print("Nombre: ");
            nombre=teclado.nextLine();
            System.out.print("Edad: ");
            edad=teclado.nextInt();
            System.out.print("Numero de cedula: ");
            num_cedula =teclado.nextInt();
            teclado.nextLine();//para limpiar el bufer
            System.out.print("Fecha de nacimiento: ");
            fecha_nac=teclado.nextLine();
            System.out.print("Direccion: ");
            direccion=teclado.nextLine();
            //teclado.nextLine();//para limpiar el bufer
            System.out.print("Numero de telefono: ");
            telefo=teclado.nextInt();
            teclado.nextLine();//para limpiar el bufer
            
    }
   
    public void Data_Show(int opcion_usu) {
            System.out.println("--------------------");
            System.out.println("DATOS DEL USUARIO"+opcion_usu);
            System.out.println("Nombre: "+nombre);
            System.out.println("Edad: "+edad);
            System.out.println("Numero de cedula: "+num_cedula);
            System.out.println("Fecha de nacimiento: "+fecha_nac);
            System.out.println("Direccion: "+direccion);
            System.out.println("Numero de telefono: "+telefo);
    }


}
