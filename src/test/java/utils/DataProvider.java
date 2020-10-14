package utils;

import gherkin.deps.com.google.gson.JsonObject;
import gherkin.deps.com.google.gson.JsonParser;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class DataProvider {
    JsonParser jsonParser = new JsonParser();
    static JsonObject jsonObject = new JsonObject();

    public void collectJsonValues(){
        try{
            FileReader jsonFile = new FileReader("src/test/java/utils/massa-testes.json");
            jsonObject = jsonParser.parse(jsonFile).getAsJsonObject();

        }catch(FileNotFoundException notFound)
        {
            System.out.println("file was not found " + notFound.getMessage());
        }
    }

    public JsonObject getJsonData(){
        return jsonObject;
    }

}
