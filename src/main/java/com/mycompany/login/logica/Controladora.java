
package com.mycompany.login.logica;

import com.mycompany.login.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public String validarUsuario(String usuario, String contrasenia) {
        
        String mensaje = "";
        List<Usuario> listaUsuarios = controlPersis.traerUsuarios();
        
        for (Usuario usu : listaUsuarios) {            
            if (usu.getNombreUsuario().equals(usuario)) {
                
                if (usu.getContraseña().equals(contrasenia)) {
                    
                    mensaje = "Usuario y contraseña correctos. ¡Bienvenido/a!";
                    return mensaje;
                }
                else {
                    mensaje = "Contraseña incorrecta";
                    return mensaje;
                }
            }
            else {
                mensaje = "Usuario no encontrado.";
                //return mensaje;
            }
        }
        return mensaje;
    }
    
}
