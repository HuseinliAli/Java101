class Car {

    String type;
    String model;
    String name;
    int speed;
    int topSpeed;
    void startEngine(){
        System.out.println("engine is starting...");
    }
    void stopEngine(){
        System.out.println("engine is stopping");
    }
    void speedIncrement(int inc){
        speed += inc;
    }
    void speedDecrement(int dec){
        speed -=dec;
    }
}
