package com.larstebooy.bounded.parameters;

import java.util.*;

public class Box<E extends Drink & Alcoholisch> {

    private List<E> list = new ArrayList<>();
    private Set<E> set = new HashSet<>();
    private Map<String, E> map = new HashMap();

    private void addToList(E e) {
        list.add(e);
    }

    private void addToSet(E e) {
        set.add(e);
    }

    private void addToMap(String k, E e) {
        map.put(k,e);
    }

//    public List<E> sortList(){
//        Collections.sort(list);
//        return list;
//    }

    public Set<E> sortSet(){
        Collections.sort((List)set);
        return set;
    }

    public Map<String, E> sortMap(){

        return null;
    }

}
