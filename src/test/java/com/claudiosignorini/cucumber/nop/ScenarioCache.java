package com.claudiosignorini.cucumber.nop;

import java.util.HashMap;
import java.util.Map;

final class ScenarioCache {

    private static final ThreadLocal<ScenarioCache> cacheHolder =
            ThreadLocal.withInitial(ScenarioCache::new);

    static ScenarioCache get() {
        return cacheHolder.get();
    }

    private final Map<String, Object> objectMap = new HashMap<>();

    private ScenarioCache() {
        // nothing to do or die for
    }

    void putObject(String name, Object object) {
        objectMap.put(name, object);
    }

    <T> T getObject(String name, Class<T> expectedClass) {
        Object object = objectMap.get(name);
        return expectedClass.cast(object);
    }

}
