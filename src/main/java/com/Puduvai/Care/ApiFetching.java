
package com.Puduvai.Care;

import java.util.*;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import javax.annotation.PostConstruct;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ApiFetching {
	private static String uRL="http://pycare-api.herokuapp.com/status";
	List<Tracker> result=new ArrayList();
	
	public List<Tracker> getResult() {
		return result;
	}


	@PostConstruct
	@Scheduled(cron = "* * 1 * * *")
	public void fetchVirusData() throws IOException, InterruptedException{
		List<Tracker> locallist=new ArrayList();
        try {

            URL url = new URL(uRL);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            //Getting the response code
            int responsecode = conn.getResponseCode();

            if (responsecode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responsecode);
            } else {

                String inline = "";
                Scanner scanner = new Scanner(url.openStream());

                //Write all the JSON data into a string using a scanner
                while (scanner.hasNext()) {
                    inline += scanner.nextLine();
                }
       //       System.out.println(inline);  contains api output in string frmt

                //Close the scanner
                scanner.close();
                String str=inline;
                JSONArray arr = new JSONArray(str);
                for (int i = 0; i < arr.length(); i++) {

                    JSONObject new_obj = arr.getJSONObject(i);   //jsonobjct-obj contains keyvalue pairs
                    Tracker obj=new Tracker();
                  //  int total=Integer.parseInt(new_obj.get("total"));
                    
                    obj.setTotal( (String) new_obj.get("total"));
                   

                    obj.setCured((String)new_obj.get("cured"));
                     obj.setActive((String)new_obj.get("active"));
                    obj.setDeath((String)new_obj.get("death"));
                    obj.setLastUpdatedOn((String)new_obj.get("lastUpdatedOn"));
                    locallist.add(obj);
                    }
               
                
                this.result=locallist;
                
                }
       }     

         catch (Exception e) {
            e.printStackTrace();
        }
    }
	   
}