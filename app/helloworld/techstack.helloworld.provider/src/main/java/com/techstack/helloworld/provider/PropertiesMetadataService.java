package com.techstack.helloworld.provider;


import com.techstack.helloworld.api.MetaDataService;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PropertiesMetadataService implements MetaDataService {

    private final Map<String, Object> data = new ConcurrentHashMap();

    @Override
    public Map<String, Object> metadata() {
        return data;
    }

    @Override
    public boolean add(String key, Object value) {
        if (data.containsKey(key)) {
            return false;
        }

        data.put(key, value);
        return true;
    }

    @Override
    public boolean remove(String key) {
        if (data.containsKey(key)) {
            return false;
        }

        data.remove(key);
        return true;
    }
}
