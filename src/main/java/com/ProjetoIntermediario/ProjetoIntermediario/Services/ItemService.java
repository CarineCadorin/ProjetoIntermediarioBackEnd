package com.ProjetoIntermediario.ProjetoIntermediario.Services;

import com.ProjetoIntermediario.ProjetoIntermediario.Entities.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    private final List<Item> itemList = new ArrayList<>();
    private Long nextId = 1L;

    public List<Item> findAll() {
        return itemList;
    }

    public Optional<Item> findById(Long id) {
        return itemList.stream().filter(item -> item.getId().equals(id)).findFirst();
    }

    public Item save(Item item) {
        item.setId(nextId++);
        itemList.add(item);
        return item;
    }

    public Optional<Item> update(Long id, Item newItem) {
        return findById(id).map(item -> {
            item.setName(newItem.getName());
            item.setDescription(newItem.getDescription());
            return item;
        });
    }

    public boolean delete(Long id) {
        return itemList.removeIf(item -> item.getId().equals(id));
    }
}