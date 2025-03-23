
class Cricket {

    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    void setdata(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Match extends Cricket {

    int no_of_odi, no_of_test;

    void display() {
        super.display();
        System.out.println("No of ODI: " + no_of_odi);
        System.out.println("No of Test: " + no_of_test);
    }

    void setdata(String name, int age, int no_of_odi, int no_of_test) {
        super.setdata(name, age);
        this.no_of_odi = no_of_odi;
        this.no_of_test = no_of_test;
    }
}

class Main {

    public static void main(String[] args) {
        if (args.length < 20) {
            System.out.println("Error: Please enter data for 5 players (4 values per player).");
            return;
        }

        Match[] matches = new Match[5];

        for (int i = 0; i < 5; i++) {
            matches[i] = new Match();
            try {
                matches[i].setdata(
                        args[i * 4],
                        Integer.parseInt(args[i * 4 + 1]),
                        Integer.parseInt(args[i * 4 + 2]),
                        Integer.parseInt(args[i * 4 + 3])
                );
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter valid integer values for age, ODI, and Test matches.");
                return;
            }
        }

        for (int i = 0; i < 5; i++) {
            matches[i].display();
            System.out.println("-------------------");
        }
    }
}
