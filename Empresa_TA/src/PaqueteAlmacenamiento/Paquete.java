package PaqueteAlmacenamiento;

import PatronCoadTransaccion.LineaTransaccionCompra;
import PatronCoadTransaccion.LineaTransaccionVenta;
import java.util.ArrayList;

public class Paquete{
    private String ID_PAQUETE;
    private double PESO_MAXIMO_APILADO;
    private int CANTIDAD_PRODUCTOS;
    private Dimension DIMENSIONES;
    private ArrayList<Producto> PRODUCTOS;
    private LineaTransaccionCompra linea_transaccion_compra;
    private LineaTransaccionVenta linea_transaccion_venta; 
    public void GenerarReporteDePaquete(){}
}

