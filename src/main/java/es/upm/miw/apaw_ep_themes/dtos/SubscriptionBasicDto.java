package es.upm.miw.apaw_ep_themes.dtos;

import es.upm.miw.apaw_ep_themes.entities.Subscription;

public class SubscriptionBasicDto {

    private int id;

    private float donation;

    public SubscriptionBasicDto() { }

    public SubscriptionBasicDto(Subscription subscription){
        this.id = subscription.getId();
    }

    public float getDonation(){
        return this.donation;
    }

    public void setDonation(float donation){
        this.donation = donation;
    }

    @Override
    public String toString() {
        return "ChanelBasicDto{" +
                "id='" + this.id + '\'' +
                ", donation='" + this.donation + '\'' +
                '}';
    }
}
