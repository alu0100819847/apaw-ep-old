package es.upm.miw.apaw_ep_themes.entities;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.time.LocalDateTime;

@Document
public class Subscription {

    @Id
    private int id;

    private float donation;

    private LocalDateTime creationDate;

    @DBRef
    private User user;

    @DBRef
    private Chanel chanel;

    public Subscription(User user, Chanel chanel) {
        this.user = user;
        this.creationDate = LocalDateTime.now();
        this.chanel = chanel;
        this.donation = 0;
    }

    public int getId(){
        return this.id;
    }

    public User getUser(){
        return this.user;
    }

    public Chanel getChanel(){
        return this.chanel;
    }

    public LocalDateTime getCreationDate(){
        return this.creationDate;
    }

    public float getDonation(){
        return this.donation;
    }

}
