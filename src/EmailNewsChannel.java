public class EmailNewsChannel implements NewsChannel, Observer {
    private final News news;

    public EmailNewsChannel(News news) {
        this.news = news;
        news.addObserver(this);
    }

    @Override
    public void getNews() {
        System.out.println("Email News Channel");
        System.out.println("Title: " + news.getTitle());
        System.out.println("Body: " + news.getBody());
        System.out.println("Image: " + news.getImage());
    }

    public void update(Observable o, Object arg) {
        getNews();
    }
}
