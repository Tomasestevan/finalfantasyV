package jobs;

import java.util.ArrayList;

public class CharacterRepo {
    public ArrayList<Character> characters = new ArrayList<Character>();

    public Character GetCharacter(String nombre){
        characters.add(new Character("roberto","asd","asd","asd")); //Forma cabeza de agregar un pj
        for (Character unWach : characters) {
            if (unWach.Nombre.equals(nombre)) {
                return unWach;
            }
        };
       throw new RuntimeException("No Existe Ese Personaje Pa");
    }
    public void AgregarPersonaje(Character unChac){
        characters.add(unChac);
    }

}
