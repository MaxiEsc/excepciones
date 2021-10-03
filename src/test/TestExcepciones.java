package test;

import aritmetica.Aritmetica;
import excepciones.OperacionExcepcion;

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        try{
        resultado = Aritmetica.division(10, 0);
        System.out.println("resultado = " + resultado);
        }catch(OperacionExcepcion e){
            System.out.println("Ocurrio un error de tipo operaicon exception");
            System.out.println(e.getMessage());
        }catch(Exception e){
            e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Se reviso la division entre 0");
        }
    }
}
