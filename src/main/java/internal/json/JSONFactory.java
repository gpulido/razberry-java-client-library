package internal.json;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import objects.*;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *  Class that transforms JSON representations of objects onto instance of java objects
 *
 * @author Gabriel Pulido - gabriel.pulidodetorres at gmail.com
 */
public class JSONFactory {
    private Gson gson;

    public JSONFactory() {
        gson = new Gson();//.setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ").create();
    }


    public Zway createZWayObject(String jsonData) {
            return gson.fromJson(jsonData, Zway.class);
            //JSONObject jsonObject = new JSONObject(jsonData);
            //return createZWayObject(jsonObject);
    }

    /*
    private Zway createZWayObject(JSONObject jsonObject) {
        try {
            return gson.fromJson(jsonObject, Zway.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }
    */



}
