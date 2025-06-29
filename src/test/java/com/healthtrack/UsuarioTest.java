package com.healthtrack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    void testActualizarPeso() {
        Usuario u = new Usuario("Benjamin", 80);
        u.actualizarPeso(85); 
        assertEquals(85, u.getPeso(), 0.01, "Se esperaba 85, pero el peso resultante es: " + u.getPeso());
    }

    @Test
    void testNombreUsuario() {
        Usuario u = new Usuario("Benjamin", 70);
        assertEquals("Benjamin", u.getNombre(), "El nombre del usuario es correcto.");
    }
}
