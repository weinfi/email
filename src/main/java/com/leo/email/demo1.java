package com.leo.email;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * Description:
 * Created by Liuq on 2020-01-31.
 */
public class demo1 {
    public static void main(String[] args) throws MessagingException {
        Properties props = new Properties();
        props.setProperty("mail.smtp.auth", "true");
        props.setProperty("mail.transport.protocol","smtp");
        Session session = Session.getInstance(props);
        session.setDebug(true);
        Message message = new MimeMessage(session);
        message.setText("你好");
        message.setFrom(new InternetAddress("951904219@qq.com"));
        Transport transport = session.getTransport();
        transport.connect("smtp.sina.com",25,"sickenbabay","569dc0f68e6ee535");
        transport.sendMessage(message, new Address[]{new InternetAddress("sickenbabay@sina.com")});
        transport.close();
    }
}
