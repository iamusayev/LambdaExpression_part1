package LyamdaExpressionAndStreamApi.FirstTask;

public class Chats {
    private String chatOfName;
    private int countOfUsers;

    public Chats(String chatOfName, int countOfUsers) {
        this.chatOfName = chatOfName;
        this.countOfUsers = countOfUsers;
    }

    public String getChatOfName() {
        return chatOfName;
    }

    public void setChatOfName(String chatOfName) {
        this.chatOfName = chatOfName;
    }

    public int getCountOfUsers() {
        return countOfUsers;
    }

    public void setCountOfUsers(int countOfUsers) {
        this.countOfUsers = countOfUsers;
    }

    @Override
    public String toString() {
        return "Chats{" +
               "chatOfName='" + chatOfName + '\'' +
               ", countOfUsers=" + countOfUsers +
               '}';
    }
}
