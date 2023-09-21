package edu.codeup.codeupspringblog.Services;

import edu.codeup.codeupspringblog.models.Ad;
import edu.codeup.codeupspringblog.models.BlogPost;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service("mailService")
public class EmailSvc {

    private JavaMailSender javaMailSender;

    public EmailSvc(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    @Value("${spring.mail.from}")
    private String from;

    public void prepareAndSend(BlogPost post, String subject, String body) {
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setFrom(from);
        msg.setTo(post.getUser().getEmail());
        msg.setSubject(subject);
        msg.setText(body);
        try{
            this.javaMailSender.send(msg);
        }
        catch (MailException ex) {
            // simply log it and go on...
            System.err.println(ex.getMessage());
        }
    }
}