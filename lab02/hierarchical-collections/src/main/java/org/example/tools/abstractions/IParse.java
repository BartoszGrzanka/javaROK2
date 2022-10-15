package org.example.tools.abstractions;

import org.example.model.Geography;

public interface IParse<TResult>{
    Geography parse(String line);
}
