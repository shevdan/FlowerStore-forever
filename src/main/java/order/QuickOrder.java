package order;

import flowerstore.Item;

import java.util.ArrayList;
import java.util.List;

public class QuickOrder extends Order{
    private List<Item> items = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    private QuickOrder(List<Item> items, User user){
        this.items = items;
        addUser(user);
        order();
    }

    public QuickOrder createQuickOrder(List<Item> items, User user){
        return new QuickOrder(items, user);
    }
}
