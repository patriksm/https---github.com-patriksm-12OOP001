class Vehicle {
    private String brand;
    private String model;
    private String registrationDate;

    public Vehicle() {
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setRegistrationDate(String registrationDate){
        this.registrationDate = registrationDate;
    }

    public String getBrand(){
        return this.brand;
    }

    public String getModel(){
        return this.model;
    }

    public String getRegistrataionDate(){
        return this.registrationDate;
    }


    public String toString(){
        return this.brand + " " + this.model + " " + this.registrationDate ;
    }
}