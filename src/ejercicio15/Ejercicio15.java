/*
 * guarda los datos personales de un usuario
 * and open the template in the editor.
 */
package ejercicio15;

import java.util.Scanner;


public class Ejercicio15 {
//datos del ususario
       /* String nombre;
        int edad; 
        int num_cedula ;
        String fecha_nac;
        String direccion;
        int telefo;
        */       
   
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);//ingresar por teclado
        int opcion=0,opcion_usu=0; 
        int cont=0;
        int ingreso=0,ingreso2=0,saldo_cuenta=0, opcion_cli=0;
        PERSONAL_DATE individuo1=new PERSONAL_DATE();//creaion de usuario
        PERSONAL_DATE individuo2=new PERSONAL_DATE();//creaion de usuario
        
        CLIENT cliente1=new CLIENT();
        CLIENT cliente2=new CLIENT();
        
        while(true){
        System.out.println("Programa que guarda datos pesonales de un usuario");
        System.out.println("1.Prueba Ingresar usuario");
        System.out.println("2.Ver datos del usuario");
        System.out.println("3.Creacion de un cliente del banco");
        System.out.println("4.ver datos del cliente del banco");
        System.out.println("5.Modificar datos del cliente del banco");
        System.out.println("6.salir de la aplicacion ");
        System.out.print("Ingrese la opcion: ");
        opcion=teclado.nextInt();
        
           // System.out.println("el valor obtenido es: "+opcion);
            switch(opcion){
                case 1:
                    
                    System.out.println("*****INGRESAR DATOS DE USUARIO*****");
                    System.out.println("1.Usuario1.");
                    System.out.println("2.Usuario2.");
                    System.out.print("Ingrese opcion: ");
                    opcion_usu=teclado.nextInt();
                           switch(opcion_usu){
                                case 1:
                                    if(ingreso==0){
                                        ingreso=1; 
                                        individuo1.Loading_Data(opcion_usu);
                                        cont=1;
                                    }else{
                                System.out.println("solo se puede modificar ya se ingreso este usuario");
                                }
                              break;
                                case 2:
                                    if(ingreso2==0){
                                        ingreso2=1; 
                                        individuo2.Loading_Data(opcion_usu);
                                        cont=1;  
                                    }else{
                                System.out.println("solo se puede modificar ya se ingreso este usuario");
                                }
                              break;
                           }
                    break;
                case 2:
                    if(cont==0){
                    System.out.println("NO HAY USUARIOS INGRESELOS CON LA OPCION 1 ");
                    }else{
                    System.out.println("*****VER DATOS DE USUARIO*****");
                    System.out.println("1.Usuario1.");
                    System.out.println("2.Usuario2.");
                    System.out.print("Ingrese opcion: ");
                    opcion_usu=teclado.nextInt();
                    
                        if(opcion_usu==1){
                          individuo1.Data_Show(opcion_usu);
                          System.out.println("EDAD>>>>"+individuo1.getEdad());
                          System.out.println("NOMBRE>>>>"+individuo1.getNombre());
                        }else{
                          individuo2.Data_Show(opcion_usu);
                        }
                    
                    }
                    
                    break;
                case 3:
                    System.out.println("*****INGRESAR DATOS DE CLIENTE*****");
                    System.out.println("1.Cliente1.");
                    System.out.println("2.Cliente2.");
                    System.out.print("Ingrese opcion: ");
                    opcion_cli=teclado.nextInt();
                    
                        if( opcion_cli==1){
                            System.out.println("CLIENTE 1");
                            cliente1.Loading_Data(1);
                            System.out.print("saldo: ");
                            saldo_cuenta=teclado.nextInt();
                            cliente1.setSaldo_cuenta(saldo_cuenta);
                        }else{
                            System.out.println("CLIENTE 2");
                            cliente2.Loading_Data(2);
                            System.out.print("saldo: ");
                            saldo_cuenta=teclado.nextInt();
                            cliente2.setSaldo_cuenta(saldo_cuenta);
                        }
                    break;
                case 4:
                    System.out.println("*****VER DATOS DEL CLIENTE*****");
                    System.out.println("1.Cliente1.");
                    System.out.println("2.Cliente2.");
                    System.out.print("Ingrese opcion: ");
                    opcion_usu=teclado.nextInt();
                    
                        if(opcion_cli==1){
                            System.out.println("MOSTRANDO LOS DATOS CLIENTE 1");
                            cliente1.Data_Show(1);
                            System.out.println("saldo: "+cliente1.getSaldo_cuenta());
                        }else{
                            System.out.println("MOSTRANDO LOS DATOS CLIENTE 1");
                            cliente2.Data_Show(2);
                            System.out.println("saldo: "+cliente2.getSaldo_cuenta());
                        }
                                       
                    break;
                case 5:
                    System.out.println("*****MODIFICAR DATOS DEL CLIENTE*****");
                    System.out.println("1.Cliente1.");
                    System.out.println("2.Cliente2.");
                    System.out.print("Ingrese opcion: ");
                    opcion_usu=teclado.nextInt();
                    
                        if(opcion_cli==1){
                            System.out.println("MOSTRANDO LOS DATOS CLIENTE 1");
                            //cliente1.Data_Show(1);
                            cliente1.setNombre("carlos");
                            System.out.println("saldo: "+cliente1.getSaldo_cuenta());
                        }else{
                            System.out.println("MOSTRANDO LOS DATOS CLIENTE 1");
                            cliente2.Data_Show(2);
                            System.out.println("saldo: "+cliente2.getSaldo_cuenta());
                        }
                    
                    
                    break;
                default:
                    System.exit(0);//salida de tipo normal
                     break;

            }
            
        }    
        
        
    }
    
    
   
    
}
