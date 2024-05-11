public class Main { //класс типа заполнения формы?

    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Ivan";
        post.surname = "Ivanov";
        post.patronymic = "Ivanovich";
        post.passport = "4444 N 444444";
        post.phone = "79218717977";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;

    }
}
