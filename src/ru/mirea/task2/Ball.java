package ru.mirea.task2;

public class Ball {
    private String material;
    private String type;

    public Ball(String material, String type){
        this.material = material;
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public String getType() {
        return type;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString(){
        return "Ball {material='" + this.material + "'" + ", type=" + this.type + "}";
    }
}
