package LyamdaExpressionAndStreamApi.FirstTask;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 1. Given a list of chats. Each chat consists of two fields: the name and the number of users in this chat.
 * *
 * * Task:
 * *
 * * - Remove chats with less than 1000 users from this list using Stream Api.
 * * - Sort the remaining chats using the stream api and the comparator in descending order by the number of users,
 * * and if this number matches, then by name in alphabetical order.
 * * - Also provide default sorting of chats by name.
 */
public class Runner {
    public static void main(String[] args) {

        List<Chats> chats = List.of(new Chats("first", 500),
                new Chats("second", 700),
                new Chats("third", 800),
                new Chats("fourth", 900),
                new Chats("fifth", 1000),
                new Chats("sixth", 1200),
                new Chats("seventh", 1560),
                new Chats("aaaa", 1560),
                new Chats("bbb", 1560),
                new Chats("eighth", 1100)
        );

        //1st
        List<Chats> moreThanThousand = chats.stream()
                .filter(count -> count.getCountOfUsers() > 1000)
                .collect(Collectors.toList());

        //2nd
        moreThanThousand.stream()
                .sorted(Comparator.comparing(Chats::getCountOfUsers).reversed()
                        .thenComparing(Chats::getChatOfName))
                .forEach(System.out::println);

        //3rd
        moreThanThousand.stream().sorted(Comparator.comparing(Chats::getChatOfName)).forEach(System.out::println);


    }
}
