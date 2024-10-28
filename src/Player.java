public class Player {
    String surname;
    String name;
    String address;
    String cardNumber;

    public Player(String surname, String name, String address, String cardName) {
        this.surname = surname;
        this.name = name;
        this.address = address;
        this.cardNumber = cardName;


    }
    public String toString() {
        return "Player: " + surname + name + "," + "address : " + address + "," + "card: " + cardNumber;
    }
}
