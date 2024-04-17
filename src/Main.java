import com.google.gson.Gson;

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}




public class Main {
    public static void main(String[] args) {
        User ivan = new User("Ivan",16);
        // сериализация
        Gson gson = new Gson();
        String str = gson.toJson(ivan);
        System.out.println(str);

        String getstr = "{\"name\":\"Ivan\",\"age\":16}";
        // десериализация
        User olga = gson.fromJson(getstr,User.class);
        System.out.println(olga.getAge());
        System.out.println(olga.getName());

    }
}