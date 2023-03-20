public class Funciones {

    private String nombre;
    private String parametro;
    private String codigo;
    private String codigoCompleto;
    /**
     * metodo que devuelve el nombre de la funcion
     * @param request
     * @return el nombre de la funcion
     */
   
    public Funciones(String nombre, String parametro, String codigo, String codigoCompleto){
        this.nombre = nombre;
        this.parametro = parametro;
        this.codigo = codigo;
        this.codigoCompleto = codigoCompleto;
    }

    /**  metodo que retorna el nombre de la funcion
     * @param request
     * @return
     */
    
    public String getNombre() {
        return nombre;
    }

    /**  metodo que retorna el nombre del parametro
     * @param request
     * @return
     */
    public String getParametro() {
        return parametro;
    }

    /**  metodo que retorna el nombre del codigo
     * @param request
     * @return
     */
    public String getCodigo() {
        return codigo;
    }

    /**  metodo que retorna el nombre del codigo completo
     * @param request
     * @return
     */
    public String getCodigoCompleto () {
        return codigoCompleto;
    }


}
