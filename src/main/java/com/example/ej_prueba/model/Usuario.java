package com.example.ej_prueba.model;
import java.util.Scanner;

    public class Usuario {
        private String nombre;
        private String apellido;
        private String correo;
        private String contrasena;

        public Usuario(String nombre, String apellido, String correo, String contrasena) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.correo = correo;
            this.contrasena = contrasena;
        }

        public void mostrarInformacion() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Apellido: " + apellido);
            System.out.println("Correo: " + correo);
        }

        public static Usuario crearUsuario() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese su nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese su apellido: ");
            String apellido = scanner.nextLine();

            System.out.print("Ingrese su correo electrónico: ");
            String correo = scanner.nextLine();

            System.out.print("Ingrese su contraseña: ");
            String contrasena = scanner.nextLine();

            return new Usuario(nombre, apellido, correo, contrasena);
        }

        public static void main(String[] args) {
            Usuario nuevoUsuario = crearUsuario();
            nuevoUsuario.mostrarInformacion();
        }
    }

