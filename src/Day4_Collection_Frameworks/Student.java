package Day4_Collection_Frameworks;

class Student {
    String name;
    int id;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}
