class Manager {
}

class Developer {
}

class EmployeeRole {
    public static void main(String[] args) {
        Developer d = new Developer();
        Object obj = d;

        try {
            Manager m = (Manager) obj;
            System.out.println("Conversion successful");
        }
        catch (ClassCastException e) {
            System.out.println("Invalid Employee Role Conversion");
        }

        Manager m1 = new Manager();
        Object obj1 = m1;

        try {
            Manager m2 = (Manager) obj1;
            System.out.println("Conversion successful");
        }
        catch (ClassCastException e) {
            System.out.println("Invalid Employee Role Conversion");
        }
    }
}