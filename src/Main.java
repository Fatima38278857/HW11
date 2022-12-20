public class Main {
    public static void main(String[] args) {

        // Задание 1

        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("Ф И О, сотрудника - " + " " + fullName);

        // Задание 2

        String fullNameUpper = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета —" + " " + fullNameUpper);


        // Задание 3
        fullName = "Иванов Семён Семёнович";
        String fullNameReplace = fullName.replace("ё", "е");
        System.out.println("Данные Ф.И.О. сотрудника - " + fullNameReplace);
    }
}