package be.pxl.ja.streamingservice.model;

public class Documentary extends Movie {
    private String topic;

    public Documentary(String title, Rating rating) {
        super(title, rating);
        setGenre(Genre.DOCUMENTARY);
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }


    @Override
    public void play() {
        System.out.println("Playing documentary " + this);
    }

    @Override
    public void pause() {
        System.out.println("Pausing documentary " + this);;
    }
}
