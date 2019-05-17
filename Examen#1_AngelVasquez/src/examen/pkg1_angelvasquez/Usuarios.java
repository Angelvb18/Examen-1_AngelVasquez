/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg1_angelvasquez;

import java.util.ArrayList;

/**
 *
 * @author Angel
 */
public class Usuarios {
    String Nombre,Apellido,psw,tipo= "Cliente";
     int edad,codigo;
     ArrayList prestados ;
     ArrayList historial ;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
     
    public Usuarios(String Nombre, String Apellido, String psw, int edad) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.psw = psw;
        this.edad = edad;
    }

    public Usuarios(String Nombre, String Apellido, String psw, String tipo, int edad, int codigo) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.psw = psw;
        this.tipo = tipo;
        this.edad = edad;
        this.codigo = codigo;
    }
        
   

    public Usuarios() {
    }

    public String getNombre() {
        return Nombre;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(Usuarios a,int x) {
        int ed=a.getEdad(),num = 0;
        
        if(x < 10)
        {
           num=Integer.parseInt("0"+x+ed);
        }
        else
        {
           num=Integer.parseInt(x+""+ed);
        }
        codigo = num;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList getPrestados() {
        return prestados;
    }

    public void setPrestados(ArrayList prestados) {
        this.prestados = prestados;
    }

    public ArrayList getHistorial() {
        return historial;
    }

    public void setHistorial(ArrayList historial) {
        this.historial = historial;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", edad=" + edad + ", prestados=" + prestados + ", historial=" + historial + '}';
    }
    
}
