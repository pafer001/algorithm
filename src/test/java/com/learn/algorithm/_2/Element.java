package com.learn.algorithm._2;

public class Element implements Comparable<Element> {
    private String ch;

    public Element(String ch) {
        this.ch = ch;
    }

    public String getCh() {
        return ch;
    }

    public void setCh(String ch) {
        this.ch = ch;
    }

    @Override
    public int compareTo(Element o) {
        return ch.compareTo(o.ch);
    }

    @Override
    public String toString() {
        return "Element{" +
                "ch='" + ch + '\'' +
                '}';
    }
}
