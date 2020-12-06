package pl.sarnacki;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * User
 */
/**
 * InnerStructures
 */
interface Interface {

    void yo(String yo);
    
}

 class User {

    String name;
    String surname;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}

/**
 * InnerStructures
 */
class Ziom {
    
    public Interface interface1; 

    public final void name() {
    interface1.yo("elo");
    }
    
}

public class Structures {
    public static void main(String[] args) {
        // User user1 = new User("Jan", "Kowalski");
        // User user2 = new User("Waldemar", "Kawka");
        // User user3 = new User("Jakub", "Watral");
        // User user4 = new User("Emilia", "Okon");
        // User user5 = new User("Marzena", "Smith");
        // System.out.println(user1.getSurname());

        // User[] users = { new User("Jan", "Kowalski"), new User("Waldemar", "Kawka"),
        // new User("Jakub", "Watral"),
        // new User("Emilia", "Okon"), new User("Marzena", "Smith") };

        // for (int i = 0; i < users.length; i++) {
        // System.out.println(users[i].getName() + " " + users[i].getSurname());
        // }

        // for (User user : users) {
        // System.out.println(user.getName() + " " + user.getSurname());
        // }

        List<User> usersList = new ArrayList<>();

        usersList.add(new User("Jan", "Kowalski"));
        usersList.add(new User("Waldemar", "Kawka"));
        // usersList.add(new User("Jakub", "Watral"));
        // usersList.add(new User("Emilia", "Okon"));
        // usersList.add(new User("Marzena", "Smith"));

        // for (int i = 0; i < usersList.size(); i++) {
        // System.out.println(usersList.get(i).getName() + " " +
        // usersList.get(i).getSurname());
        // }

        // for (User user : usersList) {
        // System.out.println(user.getName() + " " + user.getSurname());
        // }

        usersList.removeIf(user -> user.getName().equals("Jan"));
        // usersList.removeAll(usersList);
        // usersList.clear();
        Set<User> usersSet = new HashSet<>();
        usersSet.add(new User("Jan", "Kowalski"));
        usersSet.add(new User("Waldemar", "Kawka"));
        usersSet.add(new User("Jakub", "Watral"));
        usersSet.add(new User("Emilia", "Okon"));
        usersSet.add(new User("Marzena", "Smith"));

        // usersSet.forEach(user -> System.out.println(user.getName() + " " +
        // user.getSurname()));

        Map<Integer, User> usersMap = new HashMap<>();
        usersMap.put(1, new User("Jan", "Kowalski"));
        usersMap.put(2, new User("Waldemar", "Kawka"));
        usersMap.put(3, new User("Jakub", "Watral"));
        usersMap.put(4, new User("Emilia", "Okon"));
        usersMap.put(5, new User("Marzena", "Smith"));

        // usersMap.forEach((id, user) -> System.out.println("ID: " + id + " " +
        // user.getName() + " " + user.getSurname()));

        List<String> names = usersSet.stream().filter((user) -> user.getSurname().startsWith("K"))
                .sorted(Comparator.comparing(User::getSurname)).map(user -> user.getSurname())
                .collect(Collectors.toList());

        for (String name : names) {
            System.out.println(name);
        }

    }
}
