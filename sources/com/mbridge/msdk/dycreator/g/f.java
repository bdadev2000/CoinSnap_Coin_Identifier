package com.mbridge.msdk.dycreator.g;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public final class f extends a {
    public final void a(Object obj) {
        e eVar;
        ConcurrentHashMap<Integer, Object> concurrentHashMap = this.a;
        if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
            for (Map.Entry<Integer, Object> entry : this.a.entrySet()) {
                if (entry != null) {
                    try {
                        if (entry.getValue() != null && (eVar = (e) entry.getValue()) != null) {
                            eVar.a(obj);
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
    }
}
