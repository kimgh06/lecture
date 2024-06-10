package com.example.demo.class6;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CacheService {
    private static final Map<String, String> CACHE_MAP = new HashMap<>();

    public boolean acquire(final String key, final String value) {
        if (CACHE_MAP.get(key) == null) {
            return true;
        }
        return CACHE_MAP.get(key).equals(value) == false;
    }

    public void lock(final String key, final String value) {
        try {
            CACHE_MAP.put(key, value);
        } catch (Exception e) {
            throw new IllegalStateException("lock 실패");
        }
    }
}
