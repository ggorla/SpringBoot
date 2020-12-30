package BeanScope;

public class Restaruant {
    private String welcomeNote;

    public void setWelcomeNote(String welcomeNote) {
        this.welcomeNote = welcomeNote;
    }
    public void greetCustomer(){
        System.out.println(welcomeNote);
    }
}
