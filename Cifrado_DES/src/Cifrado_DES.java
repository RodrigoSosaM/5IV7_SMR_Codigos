
import java.io.*;

/*Vamos a crear un programa que se encargue de poder cifrar un archivo
de texto a traves del cifrado DES utilizando las librerias de
crypto y security de java para atender los cifrados simetricos y asimetricos
Vamos a recibir como parametro un archivo de txt, asi como una clave*/

import javax.crypto.*;

import javax.crypto.spec.*;   //generar las llaves del cifrado

import java.security.*;      //trae las instancias del tipo de cifrado




public class Cifrado_DES {
    
    public void encriptar(String args ,String Key) throws Exception {
        /*
        Lo primero que vamos a hacer es comprobar si tenemos cargado el fichero o
        archivo de texto que vamos a cifrar
        */
        
        if(args== null){
            mensajeAyuda();
            System.exit(1);
        }
        
        
        /*
        Lo primero que se debe de hacer es cargar el tipo de instancia o proveedor
        del cifrado simetrico que se va a utilizar
        */
       
        //la llave la podemos crear a partir de una funcion generica
        //llamada funcion hash   MD5
        //una secuencia de numeros pseudoaleatorios
        
        //debe de pedir la llave debe de ser de 64 bits = 8 letras
        
        SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
        DESKeySpec kspec = new DESKeySpec(Key.getBytes());
            SecretKey subllave = skf.generateSecret(kspec);
        
        
        
        //vamos a empezar con el algoritmo
        //vamos a crear las subllaves a su formato binario
        
        
        //vamos a cifrar
        //aqui es donde vamos a definir el tipo de cifrado
        //el modo del cifrado
        //si se debe de agregar o no relleno para aumentar la seguridad del mismo
        //si va a tener algun estandar PKCS
        Cipher cifrado = Cipher.getInstance("DES/ECB/PKCS5Padding");  //AES, RSA, cualquier otro tipo de cifrado
        /*
        Vamos a decirle que todos los bloques de 64 bits que se conformen para 
        cifrar con des si el bloque no alcanza a llenarse con el texto plano
        pueda aplicar relleno para acompletar el bloque
        
        ALGORITMO : DES
        MODO : ECB (CIFRADO DE BLOQUES ELECTRONICO)
        RELLENO: PKCS5
        */
        
        
        cifrado.init(Cipher.ENCRYPT_MODE, subllave);
        
        
        //leer el archivo y tener el buffer para la lectura, el tamaño y que entre en un bucle hasta
        //terminar de leer el tamño del archivo
        
        //el archivo o fichero lo transformamos a bits y hay que leerlo y cifrarlo o descifrarlo
        
        byte[] buffer = new byte[1000]; //quiero ir leyendo de 1000 en 1000 bits del fichero
        
        byte[] bufferCifrado; //aqui voy almacenar el resultado
        
        FileInputStream in = new FileInputStream(args);
        
        FileOutputStream out = new FileOutputStream(args+".cifrado");
        
        int bytesleidos = in.read(buffer, 0, 1000);
        while(bytesleidos != -1){
            //mientras no se llegue al final del archivo o fichero
            bufferCifrado = cifrado.update(buffer, 0, bytesleidos);
            //para el texto claro leer y enviarlo al buffer cifrado
            out.write(bufferCifrado);
            //escribir el archivo cifrado
            bytesleidos = in.read(buffer, 0, 1000);
        }
        //acompletar el fichero o archivo con el cifrado
        bufferCifrado = cifrado.doFinal();
        out.write(bufferCifrado); //escribir el final del texto cifrado si lo hay
        
        in.close();
        out.close();
        
        
        //vamos a descifrar
         
        
        
        
        
    }
        
    public void descifrar(String yeah , String jotaro)throws Exception{
        
        if(yeah == null){
            mensajeAyuda();
            System.exit(1);
        }
        SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
        DESKeySpec kspec = new DESKeySpec(jotaro.getBytes());
            SecretKey subllave = skf.generateSecret(kspec);
        
        //vamos a cifrar
        //aqui es donde vamos a definir el tipo de cifrado
        //el modo del cifrado
        //si se debe de agregar o no relleno para aumentar la seguridad del mismo
        //si va a tener algun estandar PKCS
        Cipher cifrado = Cipher.getInstance("DES/ECB/PKCS5Padding");  //AES, RSA, cualquier otro tipo de cifrado
        /*
        Vamos a decirle que todos los bloques de 64 bits que se conformen para 
        cifrar con des si el bloque no alcanza a llenarse con el texto plano
        pueda aplicar relleno para acompletar el bloque
        
        ALGORITMO : DES
        MODO : ECB (CIFRADO DE BLOQUES ELECTRONICO)
        RELLENO: PKCS5
        */
        
        
        cifrado.init(Cipher.DECRYPT_MODE, subllave);
        
        
        //leer el archivo y tener el buffer para la lectura, el tamaño y que entre en un bucle hasta
        //terminar de leer el tamño del archivo
        
        //el archivo o fichero lo transformamos a bits y hay que leerlo y cifrarlo o descifrarlo
        
        byte[] buffer = new byte[1000];
        byte[] bufferPlano; //aqui voy almacenar el resultado descifrado
        
         FileInputStream in = new FileInputStream(yeah);
        
         FileOutputStream out = new FileOutputStream(yeah+".descifrado");
        
        int bytesleidos = in.read(buffer, 0, 1000);
        while(bytesleidos != -1){
            //mientras no se llegue al final del archivo o fichero
            bufferPlano = cifrado.update(buffer, 0, bytesleidos);
            //para el texto claro leer y enviarlo al buffer cifrado
            out.write(bufferPlano);
            //escribir el archivo cifrado
            bytesleidos = in.read(buffer, 0, 1000);
        }
        //acompletar el fichero o archivo con el descifrado
        bufferPlano = cifrado.doFinal();
        out.write(bufferPlano); //escribir el final del texto descifrado si lo hay
        
        in.close();
        out.close();
        }
       
    
    
    public static void mensajeAyuda() {

    }

    public static void mostrarBytes(byte[] buffer) {
        System.out.write(buffer, 0, buffer.length);
    }
    
}
