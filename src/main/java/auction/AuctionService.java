package auction;

import customer.Customer;

public class AuctionService {
    public boolean bid(Auction auction, Customer buyer, double amount) {
        if (auction.getHighestBid()<amount) {
            auction.setHighestBid(amount);
            auction.setBuyer(buyer);
            return true;
        }
        return false;
    }
}
