package capstoneproject;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

class Parser{

    public static String cannedResponse(JSONObject query){

        String response = "";
        if(query == null){
            System.out.print("Invalid Query Type");
        }

        //ArrayList<JSONObject> response = (ArrayList<JSONObject>) query.get("response");
        // switch (query.get("type")){
        //     case "weather":
        //         response += "Today's forcast is " + response.get(0) + ".";

        //         break;

        //     case "time":
        //         response += "The time is" + query.get("response") + ".";
        //         break;

        //     case "coinflip":
        //         response += query.get("response");
        //         break;

        // }
        return response;

    }
}