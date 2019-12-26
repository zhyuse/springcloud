package com.springboot.servicefeign.Rongduanqi;

import com.springboot.servicefeign.Service.SchedualServiceHi;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "hi,sorry "+name;
    }
}