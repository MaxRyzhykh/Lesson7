package academy.belhard;

public final class Person {

    private String firstName;
    private String lastName;
    private Gender gender;


    public Person(String firstName, String lastName, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }


    @Override
    public int hashCode() {
        int hash = firstName.hashCode() + 9 * lastName.hashCode() + gender.hashCode();
        return hash;
    }


    @Override
    public String toString() {
        return "firstName: " + firstName + "   lastName: " + lastName
                + "   gender: " + gender;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if(!(obj instanceof Person)){
            return false;
        }

        Person person = (Person) obj;

        return firstName == person.firstName && lastName == person.lastName && gender == person.gender;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}