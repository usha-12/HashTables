package com.brideglabz.hashtables;

import java.util.LinkedList;

public class HashMap<K, V> {
    LinkedList<K> list;
    public HashMap() {
        this.list = new LinkedList<>();
    }


    public V get(K key) {
        MapNode<K, V> mapNode = (MapNode<K, V>) this.list.search(key);

        return (mapNode == null) ? null : mapNode.getValue();
    }
    public void add(K key, V value) {
        MapNode<K, V> mapNode = (MapNode<K, V>) this.list.search(key);

        if(mapNode == null) {
            mapNode = new MapNode<>(key, value);
            this.list.append(mapNode);
        }
        else
            mapNode.setValue(value);
    }

    @Override
    public String toString() {
        return "HashMapNodes { " + list + " } ";
    }
}
//Remove avoidable word from the
//phrase “Paranoids are not paranoid
//because they are paranoid but
//because they keep putting themselves
//deliberately into paranoid avoidable
//situations”
//- Use LinkedList to do the Hash Table Operation like here
//the removal of word avoidable
//- To do this create MyMapNode with Key Value Pair and
//create LinkedList of MyMapNodeg