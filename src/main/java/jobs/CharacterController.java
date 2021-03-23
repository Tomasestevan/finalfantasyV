package jobs;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.google.gson.Gson;
import spark.Request;
import spark.Response;

public class CharacterController {
    public String getPersonaje(Request req, Response res) throws JsonProcessingException { //queremos devolver un json request y responsse por spark
        Character chac = new Gson().fromJson(req.body(), Character.class); //pasamos el json que nos llego le damos el valor a un objeto character
        Character pj = Repo.GetCharacter(chac.Nombre); //lo obtenemos de la base de datos
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();// copy paste google
        String json = ow.writeValueAsString(pj);// convertimos personaje objeto a personaje json
        return json;
    }
    public CharacterRepo Repo = new CharacterRepo();

    public String postPersonaje(Request req, Response res){
        Character chac = new Gson().fromJson(req.body(), Character.class);
        Repo.AgregarPersonaje(chac);
        return ("oki");
    }
}
