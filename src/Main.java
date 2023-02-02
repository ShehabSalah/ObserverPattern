public class Main {
    public static void main(String[] args) {
        News news = new News();

        EmailNewsChannel emailNewsChannel = new EmailNewsChannel(news);
        SMSNewsChannel smsNewsChannel = new SMSNewsChannel(news);
        ApplicationNewsChannel applicationNewsChannel = new ApplicationNewsChannel(news);

        news.setNews("First News Title 1", "News Body 1", "News Image URL 1");
        // wait for 5 seconds
        waitFiveSec();
        // update news
        System.out.println("---------------------------------> Second Update News");
        news.setNews("First News Title 2", "News Body 2", "News Image URL 2");
        // wait for 5 seconds
        waitFiveSec();
        // update news
        System.out.println("---------------------------------> Third Update News");
        news.setNews("First News Title 3", "News Body 3", "News Image URL 3");
    }

    // This method only to give you time to see what is happening when you change the news
    private static void waitFiveSec() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}