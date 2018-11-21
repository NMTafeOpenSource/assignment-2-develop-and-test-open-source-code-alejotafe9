package vehiclestarter;

 
public class Vehicle {
	public String	manufacturer;
	public String	model;
	public int	makeYear;
        public String   tankCapacity;
        public String	registrationNumber;
        public String	odometerReading;
        public String	petrol;
        public String	pricePetrol;
        public String	lastService;
        
	//public FuelPurchase	fuelPurchase;

    public Vehicle(String manufacturer, String model, int makeYear, String tankCapacity, String registrationNumber, String odometerReading, String petrol, String pricePetrol, String lastService) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.makeYear = makeYear;
        this.tankCapacity = tankCapacity;
        this.registrationNumber = registrationNumber;
        this.odometerReading = odometerReading;
        this.petrol = petrol;
        this.pricePetrol = pricePetrol;
        this.lastService = lastService;
    }

    
    

    public Vehicle() {        
    }

    // TODO Add missing getter and setter methods

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMakeYear() {
        return makeYear;
    }

    public void setMakeYear(int makeYear) {
        this.makeYear = makeYear;
    }

    public String getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(String tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(String odometerReading) {
        this.odometerReading = odometerReading;
    }

    public String getPetrol() {
        return petrol;
    }

    public void setPetrol(String petrol) {
        this.petrol = petrol;
    }

    public String getPricePetrol() {
        return pricePetrol;
    }

    public void setPricePetrol(String pricePetrol) {
        this.pricePetrol = pricePetrol;
    }

    public String getLastService() {
        return lastService;
    }

    public void setLastService(String lastService) {
        this.lastService = lastService;
    }

    
    
        
        
	/**
	 * Prints details for {@link Vehicle}
	 */
	public void printDetails() {
		System.out.println("Vehicle: " + makeYear + " " + manufacturer + " " + model);		
                // TODO Display additional information about this vehicle
	}

        
        // TODO Create an addKilometers method which takes a parameter for distance travelled 
        // and adds it to the odometer reading. 

        // adds fuel to the car
        /*public void addFuel(double litres, double price){            
            fuelPurchase.purchaseFuel(litres, price);
        }   */     

}
