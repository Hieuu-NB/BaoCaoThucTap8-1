package com.example.tt06012022;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class a {
    private String a;
    private String b;

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }
}
