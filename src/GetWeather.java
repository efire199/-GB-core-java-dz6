public class GetWeather {
    private static final String APIKEY = "apikey=s7dAkEX7TwiX4FYJ6JN2i7jgbC9XAhoG" ;

    public static void getWeather5day (String id){
        try {
            OkHttpService httpService = new OkHttpService();
            String req= "http://dataservice.accuweather.com/forecasts/v1/daily/5day/" + id + "?" + APIKEY;
            System.out.println(httpService.run(req));
        }catch (Exception e){
            e.getStackTrace();
        }
    }
}
