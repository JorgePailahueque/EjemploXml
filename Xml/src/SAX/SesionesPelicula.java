/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SAX;

import java.util.Vector;

    

class SesionesPelicula {
    private Pelicula pelicula;
    private Vector sesionesStrPelicula;
   
    public SesionesPelicula(Pelicula pelicula, Vector sesionesStrPelicula) {
        this.pelicula = pelicula;
        this.sesionesStrPelicula = sesionesStrPelicula;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Vector getSesionesStrPelicula() {
        return sesionesStrPelicula;
    }

    public void setSesionesStrPelicula(Vector sesionesStrPelicula) {
        this.sesionesStrPelicula = sesionesStrPelicula;
    }
    
}
