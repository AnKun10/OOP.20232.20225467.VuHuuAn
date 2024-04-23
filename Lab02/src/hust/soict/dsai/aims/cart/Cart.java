package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
    public int qtyOrdered = 0;
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    public void displayItemsOrdered() {
        for (int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
            if (itemsOrdered[i] == null) {
                break;
            }
            System.out.println((i+1)+", "+itemsOrdered[i]);
        }
    }

    public void displayTotalCost() {
        for (int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
            if (itemsOrdered[i] == null) {
                break;
            }
            System.out.println((i+1)+",\t"+itemsOrdered[i].getTitle()+" \t"+itemsOrdered[i].getCost());
        }
        System.out.println("  \tTotal Cost \t"+totalCost());
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (this.qtyOrdered + 1 > MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is (almost) full");
            return;
        }
        this.itemsOrdered[qtyOrdered] = disc;
        this.qtyOrdered++;
        System.out.println("The disc has been added");
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (this.qtyOrdered + 2 > MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is (almost) full");
            return;
        }
        this.itemsOrdered[qtyOrdered] = dvd1;
        this.itemsOrdered[qtyOrdered+1] = dvd2;
        this.qtyOrdered += 2;
        System.out.println("The discs have been added");
    }

//    public void addDigitalVideoDisc(hust.soict.dsai.aims.disc.DigitalVideoDisc[] dvdList) {
//        if (dvdList.length + this.qtyOrdered > MAX_NUMBERS_ORDERED) {
//            System.out.println("The cart is (almost) full");
//            return;
//        }
//        for (int i = 0; i < dvdList.length; i++) {
//            itemsOrdered[this.qtyOrdered+i] = dvdList[i];
//        }
//        this.qtyOrdered += dvdList.length;
//        System.out.println("The disc(s) has(have) been added");
//    }

    public void addDigitalVideoDisc(DigitalVideoDisc... dvds) {
        if (dvds.length + this.qtyOrdered > MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is (almost) full");
            return;
        }
        for (int i = 0; i < dvds.length; i++) {
            itemsOrdered[this.qtyOrdered+i] = dvds[i];
        }
        this.qtyOrdered += dvds.length;
        System.out.println("The disc(s) has(have) been added");
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean isRemove = false;
        for (int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
            if (this.itemsOrdered[i].equals(disc)) {
                this.itemsOrdered[i] = this.itemsOrdered[qtyOrdered - 1];
                this.itemsOrdered[qtyOrdered - 1] = null;
                this.qtyOrdered--;
                isRemove = true;
                break;
            }
        }
        if (isRemove) {
            System.out.println("The disc has been removed");
        } else {
            System.out.println("Cannot find that disc in the cart");
        }
    }

    public float totalCost() {
        float total = 0;
        for (DigitalVideoDisc item : this.itemsOrdered) {
            if (item == null) {
                break;
            }
            total += item.getCost();
        }
        return total;
    }
}
