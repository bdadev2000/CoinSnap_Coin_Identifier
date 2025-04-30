package com.google.ar.core;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class z extends LinkedHashMap {
    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        if (size() > 10) {
            return true;
        }
        return false;
    }
}
