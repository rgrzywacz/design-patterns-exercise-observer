package auction;

import java.time.LocalDateTime;

import customer.Customer;

public class Auction {
    private int id;

    private String item;
    private String description;
    private LocalDateTime dueDate;

    private Customer seller;

    private double highestBid;
    private Customer buyer;

    public Auction(int id, String item, String description, LocalDateTime dueDate, Customer seller, double highestBid, Customer buyer) {
        this.id = id;
        this.item = item;
        this.description = description;
        this.dueDate = dueDate;
        this.seller = seller;
        this.highestBid = highestBid;
        this.buyer = buyer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public Customer getSeller() {
        return seller;
    }

    public void setSeller(Customer seller) {
        this.seller = seller;
    }

    public double getHighestBid() {
        return highestBid;
    }

    public void setHighestBid(double highestBid) {
        this.highestBid = highestBid;
    }

    public Customer getBuyer() {
        return buyer;
    }

    public void setBuyer(Customer buyer) {
        this.buyer = buyer;
    }
}


