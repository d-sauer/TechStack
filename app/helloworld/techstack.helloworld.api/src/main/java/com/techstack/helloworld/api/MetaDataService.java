package com.techstack.helloworld.api;

import java.util.Map;

public interface MetaDataService {

    Map<String, Object> metadata();

    boolean add(String key, Object value);

    boolean remove(String key);

}
