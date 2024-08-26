
package practicagit;


public class PracticaGit {

   
    public static void main(String[] args) {
         
        // Crear un objeto Reloj
        Reloj unReloj = new Reloj(1, 10, "Modelo Boca Juniors", "12");

        // Crear un objeto Persona
        Persona unaPersona = new Persona("Edinson", "Cavani", 37, 1.84);

        // Usar metodos de Reloj desde el objeto Persona
        unaPersona.decirHora(unReloj);

        // Crear un objeto RelojFit
        RelojFit relojFit = new RelojFit(1, 10, "ModeloFit", "67890");

        // Usar metodos de RelojFit
        relojFit.cuentaPasos(0,0,10, 5);
        relojFit.frecuenciaAleatoria();

        // Mostrar información
        System.out.println("Modelo de RelojFit: " + relojFit.getModelo());
        relojFit.limpiarPantalla();
        unaPersona.decirHora(relojFit);
    }
}
    
    

