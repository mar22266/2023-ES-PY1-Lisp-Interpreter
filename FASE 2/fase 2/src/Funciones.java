public class Funciones {
    /**
     * Atributos de la clase Funciones
     */
    private String nombre;
    private String parametro;
    private String codigo;
    private String codigoCompleto;


    /**
     * Constructor de la clase funciones
     * @param nombre
     * @param parametro
     * @param codigo
     * @param codigoCompleto
     */
    public Funciones(String nombre, String parametro, String codigo, String codigoCompleto){
        this.nombre = nombre;
        this.parametro = parametro;
        this.codigo = codigo;
        this.codigoCompleto = codigoCompleto;
    }

    /**  metodo que retorna el nombre de la funcion
     * @param
     * @return
     */
    
    public String getNombre() {
        return nombre;
    }

    /**  metodo que retorna el nombre del parametro
     * @param
     * @return
     */
    public String getParametro() {
        return parametro;
    }

    /**  metodo que retorna el nombre del codigo
     * @param
     * @return
     */
    public String getCodigo() {
        return codigo;
    }

    /**  metodo que retorna el nombre del codigo completo
     * @param
     * @return
     */
    public String getCodigoCompleto () {
        return codigoCompleto;
    }


}
