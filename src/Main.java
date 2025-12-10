public class Main {
    public static void main(String[] args) {
        // Пример использования класса Sauce
        Sauce sauce1 = new Sauce("Чили", Sauce.Spiciness.VERY_SPICY);
        Sauce sauce2 = new Sauce("Кетчуп", Sauce.Spiciness.NOT_SPICY);

        System.out.println(sauce1);
        System.out.println(sauce2);
    }
}

class Sauce {
    private String name;
    private Spiciness spiciness;

    public enum Spiciness {
        VERY_SPICY,
        SPICY,
        NOT_SPICY
    }

    public Sauce(String name, Spiciness spiciness) {
        this.name = name;
        this.spiciness = spiciness;
    }

    @Override
    public String toString() {
        return "Соус " + name + ": " + spiciness.toString().toLowerCase().replace('_', ' ');
    }
}
