import com.google.common.base.Charsets;
import com.google.common.io.Files;
import internal.json.JSONFactory;
import internal.rest.RestHelper;
import objects.Zway;
import org.restlet.data.Reference;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * Created with IntelliJ IDEA.
 * User: gpt
 * Date: 25/04/13
 * Time: 19:24
 * To change this template use File | Settings | File Templates.
 */
public class Razberry {

    //test
    public static void main(String[] args) throws IOException {

        Razberry razberry = new Razberry();
        Zway zway = razberry.getZwayFromFile();


    }
    JSONFactory factory = new JSONFactory();

    public Zway getZway() {
        try {
            String zwayUri = "http://zwave-cam.dyndns.org:8083/ZWaveAPI/Data/0" ;
            String jsonData = RestHelper.postJsonData(new Reference(zwayUri),"");
            //Files.write(jsonData, new File("temp.json"), Charsets.UTF_8);
            return factory.createZWayObject(jsonData);
        } catch (IOException ex) {
            return null;
        }
    }
    // Method to mock the access to the zway big json for development support.
    // uses a stored file instead of the http request
    public Zway getZwayFromFile() {
        try {
            File data = new File("zwayData.json");
            String jsonData =  Files.toString(data, Charsets.UTF_8);
            return factory.createZWayObject(jsonData);
        } catch (IOException ex) {
            return null;
        }
    }

}
