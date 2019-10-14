package es.upm.miw.apaw_ep_themes.dtos;

import es.upm.miw.apaw_ep_themes.entities.Subscription;

public class SubscriptionCreationDto {
    private int id;

    private int chanelId;

    private int userId;

    public SubscriptionCreationDto(int id, int chanelId, int userId ){
        this.id = id;
        this.chanelId = chanelId;
        this.userId = userId;
    }

    public int getChanelId(){
        return this.chanelId;
    }

    public void setChanelId(int chanelId){
        this.chanelId = chanelId;
    }

    public int getUserId(){
        return this.userId;
    }

    public void setUserId(int userId){
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "SubscriptionCreationDto{" +
                "id='" + this.id + '\'' +
                ", chanelId='" + this.chanelId + '\'' +
                ", userId='" + this.userId + '\'' +
                '}';
    }
}
