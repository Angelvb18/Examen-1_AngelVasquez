/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg1_angelvasquez;

import java.util.Date;

/**
 *
 * @author Angel
 */
public class Libro {
    Date aui = new Date();
    String titulo,ISBN,staus,personap,autores , genero , Editoriales  , idioma ;
    int anio,aniol=aui.getYear(),nump;

    public Libro(String titulo, String autores, String genero, String Editoriales, String idioma) {
        this.titulo = titulo;
        this.autores = autores;
        this.genero = genero;
        this.Editoriales = Editoriales;
        this.idioma = idioma;
        
    }

    

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getStaus() {
        return staus;
    }

    public void setStaus(String staus) {
        this.staus = staus;
    }

    public String getPersonap() {
        return personap;
    }

    public void setPersonap(String personap) {
        this.personap = personap;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEditoriales() {
        return Editoriales;
    }

    public void setEditoriales(String Editoriales) {
        this.Editoriales = Editoriales;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getAniol() {
        return aniol;
    }

    public void setAniol(int aniol) {
        this.aniol = aniol;
    }

    public int getNump() {
        return nump;
    }

    public void setNump(int nump) {
        this.nump = nump;
    }

   
    //10 libors , 1 admi, 2 clientes

    @Override
    public String toString() {
        return "Libro{" + "aui=" + aui + ", titulo=" + titulo + ", ISBN=" + ISBN + ", staus=" + staus + ", personap=" + personap + ", autores=" + autores + ", genero=" + genero + ", Editoriales=" + Editoriales + ", idioma=" + idioma + ", anio=" + anio + ", aniol=" + aniol + ", nump=" + nump + '}';
    }
    
    
    
}
