package com.fatec.component;

public interface Component {
    void render();
    void add (Component component);
    void remove (Component component);
}
