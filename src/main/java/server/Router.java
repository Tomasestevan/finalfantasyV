package server;
import jobs.CharacterController;
import spark.Spark;
public class Router {
    public static CharacterController CHACCON = new CharacterController();
    public static void configure(){
        Spark.get("/prueba", (request, response) -> "{\"nombre\":\"Pepito\", \"dni\":\"123\"}");
        Spark.get("/character", CHACCON::getPersonaje);
        Spark.post("/character", CHACCON::postPersonaje);

    }
}
