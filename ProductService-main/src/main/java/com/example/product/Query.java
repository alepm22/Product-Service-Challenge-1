package com.example.product;

public interface Query <I,O>{
    O execute(I input);
}
