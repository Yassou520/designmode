package observermode;

public class ObserverClient {
    public static void main(String[] args) {
        Observer a = new ObserverA("北京", 15);
        Observer b = new ObserverA("南方", 17);
        WeatherData weatherData = new WeatherData();
        weatherData.registerObserver(a);
        weatherData.registerObserver(b);
        weatherData.setData(15);
    }
}
