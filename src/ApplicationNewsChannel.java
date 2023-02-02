public class ApplicationNewsChannel implements NewsChannel, Observer {
    private final News news;

    public ApplicationNewsChannel(News news) {
        this.news = news;
        news.addObserver(this);
    }

    @Override
    public void getNews() {
        System.out.println("---------------------------------");
        System.out.println("Application News Channel");
        System.out.println("Title: " + news.getTitle());
        System.out.println("Body: " + news.getBody());
        System.out.println("Image: " + news.getImage());
    }

    public void update(Observable o, Object arg) {
        getNews();
    }
}
