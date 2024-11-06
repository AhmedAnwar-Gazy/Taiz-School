package entites;

public  abstract  class Person {
    private int id;
    private String name;
    private int berthDate;
    private boolean gender;

    public Person(String name, int berthDate, boolean gender) {
        this.name = name;
        this.berthDate = berthDate;
        this.gender = gender;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getBerthDate() {
        return this.berthDate;
    }

    public boolean getGender() {
        return this.gender;
    }
}


