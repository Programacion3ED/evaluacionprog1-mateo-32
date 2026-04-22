public class UsuarioSeguroAvanzado {

    private String username;
    private String password;
    private int intentosFallidos;
    private boolean bloqueado;
    private int maxIntentos;
    private boolean accesoExitoso;

    this.username = username;
    this.password = password;
    this.intentosFallidos = 0;
    this.bloqueado = false;
    this.accesoExitoso = false;

    if (maxIntentos<=0) {
        this.maxIntentos = 3;
    }else {
        this.maxIntentos = maxIntentos;

    }


}

public String getUsername () {
    return username;
}
public int getIntentosFallidos () {
    return intentosFallidos;
}
public boolean isBloqueado () {
    return bloqueado;
}