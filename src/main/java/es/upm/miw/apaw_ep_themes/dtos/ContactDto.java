package es.upm.miw.apaw_ep_themes.dtos;

import es.upm.miw.apaw_ep_themes.entities.Contact;
import es.upm.miw.apaw_ep_themes.exceptions.BadRequestException;

public class ContactDto {

    private int id;

    private String email;

    private int telephone;

    public ContactDto(){}

    public ContactDto(String email, int telephone){
        this.email = email;
        this.telephone = telephone;
    }

    public ContactDto(Contact contact){
        this.id = contact.getId();
        this.email = contact.getEmail();
        this.telephone = contact.getTelephone();
    }

    public int getId() {
        return this.id;
    }

    public void setID(int id){
        this.id = id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public int getTelephone(){
        return this.telephone;
    }

    public void setTelephone(int telephone){
        this.telephone = telephone;
    }

    public void validate() {
        if (Integer.toString(this.telephone).length() < 9 && this.email.isEmpty() ) {
            throw new BadRequestException("Incomplete ContactDto. ");
        }
    }

    @Override
    public String toString() {
        return "ContactDto{" +
                "id='" + this.id + '\'' +
                ", email=" + this.email +
                ", telephone='" + this.telephone + '\'' +
                '}';
    }
}
