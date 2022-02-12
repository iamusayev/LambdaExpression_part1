package LyamdaExpressionAndStreamApi.SecondTask;

public class Chats {

    private String name;
    private User user;

    public Chats(String name, User user) {
        this.name = name;
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Chats{" +
               "name='" + name + '\'' +
               ", user=" + user +
               '}';
    }
}
