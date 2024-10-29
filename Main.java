import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
                ArrayList<Persona> personas = new ArrayList<>();
                personas.add(new Persona("Mel"));
                personas.add(new Persona("Mili"));
                personas.add(new Persona("Antonella"));
                personas.add(new Persona("Amelie"));
                personas.add(new Persona("Angie"));
        System.out.println("Personas que empiezan con A : ");
                long contador = personas.stream()
                        .filter(persona -> persona.getNombre().startsWith("A"))
                        .peek(persona -> System.out.println(persona.getNombre()))
                        .count();
                System.out.println("Cantidad de personas que su nombre empieza con A : "+contador);
            }
        }
