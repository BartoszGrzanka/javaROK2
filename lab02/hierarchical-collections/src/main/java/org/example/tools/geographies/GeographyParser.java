package org.example.tools.geographies;

import org.example.model.Geography;
import org.example.tools.abstractions.IParse;

import java.util.Arrays;
import java.util.List;

public class GeographyParser implements IParse {
    @Override
    public Geography parse(String line) {
        Geography geography = new Geography();
        List<String> result = Arrays.asList(line.trim().split("\\s*;\\s*"));


        geography.setId(Integer.parseInt(result.get(0)));
        geography.setType(String.valueOf(result.get(1)));
        geography.setName(String.valueOf(result.get(2)));
        geography.setCode(String.valueOf(result.get(3)));
        if(result.get(4).contains("NULL")){
            geography.setParentId(null);
        }
        else{
            geography.setParentId(Integer.parseInt(result.get(4)));
        }

//        System.out.println(geography.getId());
//        System.out.println(geography.getCode());
//        System.out.println(geography.getName());
//        System.out.println(geography.getType());
//        System.out.println(geography.getParentId());

        return geography;
    }
}
