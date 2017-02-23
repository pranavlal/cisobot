/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plugins.quorum.botPackage;
import org.alicebot.ab.*; 
/**
 *
 * @author user
 */
public class botHandler {
    public java.lang.Object me_ = null;
    String botname="ciso";
    String botPath="resources/botdata";
    Bot bot;
    public botHandler()
    {
        bot=new Bot(botname,botPath);
        
    };
    public String botConverse(String rq)
    {
        String answer="";
        Chat chatSession = new Chat(bot);
        answer=chatSession.multisentenceRespond(rq);
        
        return answer;
        
    };
public static void main(String[] args) { }
}

