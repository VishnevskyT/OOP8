package exercise_4;
/**
 Завдання 4
 Подивитися завдання 2. Перевизначити методи equals & hashCode у кожному класі. Створити клас Main, де створити
 об'єкти класів і продемонструвати перевизначені методи.
 */
public class Main {
    public static void main(String[] args) {

        Device monitor1 = new Monitor("Gnusmas", 1_199.99f, "JH6AD4567SU", 1024, 718);
        Device monitor2 = new Monitor("Gnusmas", 1_199.99f, "JH6AD4567SU", 1024, 718);
        Device ethernetAdapter1 = new EthernetAdapter("TP_Link", 199.99f, "UA12321413DG", 1000, "AF-FD-5F-34-A3-GG");
        Device ethernetAdapter2 = new EthernetAdapter("TP_Link", 199.99f, "UA12321413DG", 1000, "AF-FD-5F-34-A3-GG");


        System.out.println("Перевірка hash-кодів об'єктів після перевизначення методу:\n"
                + monitor1.getClass().getSimpleName() + " 1 = " + monitor1.hashCode() + ";\n" +
                monitor2.getClass().getSimpleName() + " 2 = " + monitor2.hashCode() + ";\n" +
                ethernetAdapter1.getClass().getSimpleName() + " 1 = " + ethernetAdapter1.hashCode() + ";\n" +
                ethernetAdapter2.getClass().getSimpleName() + " 2 = " + ethernetAdapter2.hashCode() + ";");
        System.out.println("Перевірка еквівалентності об'єктів після перевизначення методу:\n" +
                monitor1.getClass().getSimpleName() + " 1 еквівалентний " + monitor2.getClass().getSimpleName() +
                " 2 ? - " + monitor1.equals(monitor2) + ";\n" +
                ethernetAdapter1.getClass().getSimpleName() + " 1 еквівалентний " + ethernetAdapter2.getClass().getSimpleName() +
                " 2 ? - " + ethernetAdapter1.equals(ethernetAdapter2));


    }
}
