public class SMSNewsChannel implements NewsChannel, Observer {
    private final News news;

    public SMSNewsChannel(News news) {
        this.news = news;
        news.addObserver(this);
    }

    @Override
    public void getNews() {
        System.out.println("---------------------------------");
        System.out.println("SMS News Channel");
        System.out.println("Sender Name: NewsAgency");
        System.out.println("Title: " + news.getTitle());
        System.out.println("Body: " + news.getBody());
    }

    public void update(Observable o, Object arg) {
        getNews();
    }
}
