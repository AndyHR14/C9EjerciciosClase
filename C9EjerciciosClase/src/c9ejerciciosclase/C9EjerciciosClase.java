/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c9ejerciciosclase;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class C9EjerciciosClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante arrEstudiante[] = new Estudiante[2];
        obtenerInformacion(arrEstudiante);
        mostrarInformacion(arrEstudiante);
    }
    public static void obtenerInformacion(Estudiante[] arreglo){
        for (int x = 0; x < arreglo.length; x++) {
            JOptionPane.showMessageDialog(null, "Se solicitaran los datos del estudiante " + x+1);
            int cedula = Integer.parseInt(JOptionPane.showInputDialog("Escriba la cedula:"));
            String nombre = JOptionPane.showInputDialog("Escriba el nombre:");
            String apellidos = JOptionPane.showInputDialog("Escriba los apellidos:");
            arreglo[x] = new Estudiante(cedula,nombre,apellidos);
        }
    }
    public static void mostrarInformacion(Estudiante[] arrEstudiante){
        for (int x = 0; x < arrEstudiante.length; x++) {
            JOptionPane.showMessageDialog(null, arrEstudiante[x].getCedula() + " " + arrEstudiante[x].getNombre() + " " + arrEstudiante[x].getApellidos());
        }
    }
}
