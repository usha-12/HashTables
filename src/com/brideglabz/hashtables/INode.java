package com.brideglabz.hashtables;

public interface INode<K> {

        K getKey();
        void setKey(K key);
        INode<K> getNext();
        void setnext(INode<K> next);
}
