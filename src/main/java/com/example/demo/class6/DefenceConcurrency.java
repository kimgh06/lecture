package com.example.demo.class6;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class DefenceConcurrency {
    private static final String WHEN_SUCCESS = "success";
    private static final String WHEN_FAIL = "fail";

    private final CacheService cacheService;

    public String doSomething(String toBeProtect) {
        String hereKey = "requestPrimary";

        if (cacheService.acquire(hereKey, toBeProtect)) {
            cacheService.lock(hereKey, toBeProtect);
            log.info("락 획득, 필요한 처리 함.");
            return WHEN_SUCCESS;
        } else {
            log.info("락 획득 못함, 아무 처리 하지 않음.");
            return WHEN_FAIL;
        }
    }
}
