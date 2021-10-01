package ru.mirea.task3;

public class Human {
    Leg leg;
    Head head;
    Hand hand;

    public Human(String hairstyle, double head_volume, double leg_length, double shoe_size, double hand_length,
                 double palm_length){
        leg  = new Leg  (leg_length, shoe_size);
        head = new Head (hairstyle, head_volume);
        hand = new Hand (hand_length, palm_length);
    }

    public Human(Head head, Leg leg, Hand hand){
        this.hand = hand;
        this.head = head;
        this.leg  = leg;
    }

    public Hand getHand() {
        return hand;
    }

    public Head getHead() {
        return head;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }
}
