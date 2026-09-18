public record Temperature(double celsius) {
    public Temperature{
        if(celsius < -273.15) throw new IllegalArgumentException();
    }
     double toFahrenheit() {
        return (celsius * 9/5) + 32;
    }
}
