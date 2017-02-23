package plugins.quorum.httprq;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import plugins.quorum.httprq.HttpRequest;

import com.eclipsesource.json.*;
/**
 *
 * @author user
 */
public class HttpRequestManager {
public java.lang.Object me_ = null;
    public String searchDuckduckgo(String st)
{
    HttpRequest request;
    
            request=HttpRequest.get("http://api.duckduckgo.com/?",true,"q",st,"format","json","pretty",1,"no_html",1,"t","cisobot").accept("application/json")
                    .connectTimeout(2000)
            .userAgent("Mozilla/5.0 (Windows NT 10.0; WOW64; rv:49.0) Gecko/20100101 Firefox/49.0");
            
            

            String rsp;
rsp=request.body();
JsonObject jso=JsonObject.readFrom(rsp);
String abt=jso.get("AbstractText").asString();       


return abt;
}

        
public static void main(String[] args) { }    
}
