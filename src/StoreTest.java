package hust.soict.cybersecurity.aims.test.store;

import hust.soict.cybersecurity.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store(10); // Create a store with a capacity of 10 DVDs
        DigitalVideoDisc dvd1 = new DigitalVideoDisc ("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc ("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc ("Aladin", "Animation", 18.99f);

        store.addDVD(dvd1);
        store.addDVD(dvd2);

        store.removeDVD(dvd1);
        store.removeDVD(dvd3);
    }
}
