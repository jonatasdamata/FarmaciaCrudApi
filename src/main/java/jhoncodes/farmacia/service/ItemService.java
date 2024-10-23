package jhoncodes.farmacia.service;

import jhoncodes.farmacia.entity.Item;
import jhoncodes.farmacia.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public Optional<Item> getItemById(Long id){
        return itemRepository.findById(id);
    }

    public Item createItem(Item item){
        return itemRepository.save(item);
    }

    public Item updateItem(Long id, Item ItemDetails){
        Item item = itemRepository.findById(id).orElseThrow(() -> new RuntimeException("Item not found"));
        item.setName(ItemDetails.getName());
        item.setDescription(ItemDetails.getDescription());
        item.setQuantity(ItemDetails.getQuantity());
        item.setPrice(ItemDetails.getPrice());
        return itemRepository.save(item);
    }

    public void deleteItem(Long id){
        Item item = itemRepository.findById(id).orElseThrow(() -> new RuntimeException("Item not found"));
        itemRepository.delete(item);
    }
}
