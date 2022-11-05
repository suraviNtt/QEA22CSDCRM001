package seleniumBasics;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class AB {
	
	
		   public static void main(String[] args) throws JSONException {
		      String json = "{employee : { age:30, name : Raja, technology:Java}}";
		      //Convert JSON to XML
		      String xml = convert(json, "root"); // This method converts json object to xml string
		      System.out.println(xml);
		   }
		   public static String convert(String json, String root) throws JSONException {
		      JSONObject jsonObject = new JSONObject(json);
		      String xml = "<?xml version=\"1.0\" encoding=\"ISO-8859-15\"?><"+root+">" + XML.toString(jsonObject) + "</"+root+">";
		      return xml;
		   }

}
