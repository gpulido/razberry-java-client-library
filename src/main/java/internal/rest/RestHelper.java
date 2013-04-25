package internal.rest;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import org.restlet.Response;
import org.restlet.data.MediaType;
import org.restlet.data.Method;
import org.restlet.data.Parameter;
import org.restlet.data.Reference;
import org.restlet.ext.json.JsonRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.ClientResource;

import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: gpt
 * Date: 11/01/13
 * Time: 14:33
 * To change this template use File | Settings | File Templates.
 */
public class RestHelper {


    public static String getJsonData(Reference reference, Iterable<Parameter> extraParameters) throws java.io.IOException {
        reference.addQueryParameters(extraParameters);
        ClientResource cr = new ClientResource(reference);
        cr.setMethod(Method.GET);
        Representation rep = cr.get(MediaType.APPLICATION_JSON);
        String jsonData = rep.getText();
        return jsonData;
    }

    public static String getJsonData(Reference reference, Parameter extraParameter) throws java.io.IOException {
        ArrayList<Parameter> extraParameters = new ArrayList<Parameter>();
        extraParameters.add(extraParameter);
        return getJsonData(reference, extraParameters);
    }

    public static String getJsonData(Reference reference) throws java.io.IOException {
        ArrayList<Parameter> extraParameters = new ArrayList<Parameter>();
        return getJsonData(reference, extraParameters);
    }

    public static String postJsonData(Reference reference, String jsonData, Iterable<Parameter> extraParameters) throws java.io.IOException {
        reference.addQueryParameters(extraParameters);
        ClientResource cr = new ClientResource(reference);
        cr.setMethod(Method.POST);
        Representation rep = cr.post(new JsonRepresentation(jsonData));
        Response resp = cr.getResponse();
        String jsonResponse = "";
        String nid = "";
        if (resp.getStatus().isSuccess()) {
            jsonResponse = resp.getEntity().getText();
            return jsonResponse;
        } else {
            System.out.println(resp.getStatus().getName());
        }
        return "";
    }



    public static String postJsonData(Reference reference, String jsonData, Parameter extraParameter) throws java.io.IOException {
        ArrayList<Parameter> extraParameters = new ArrayList<Parameter>();
        extraParameters.add(extraParameter);
        return postJsonData(reference, jsonData, extraParameters);
    }
    /*
    public static String postJsonData(Reference reference, String jsonData) throws java.io.IOException {
        ArrayList<Parameter> extraParameters = new ArrayList<Parameter>();
        return postJsonData(reference, jsonData, extraParameters);
    }
    */

    public static String postJsonData(Reference reference, String jsonData) throws java.io.IOException {
        File data = new File("temp.json");
        return Files.toString(data, Charsets.UTF_8);

    }



}
