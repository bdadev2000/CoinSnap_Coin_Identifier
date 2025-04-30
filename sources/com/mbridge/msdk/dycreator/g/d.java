package com.mbridge.msdk.dycreator.g;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class d extends a {
    public final void a(Object obj) {
        i iVar;
        try {
            synchronized (this) {
                try {
                    ConcurrentHashMap<Integer, Object> concurrentHashMap = this.f15278a;
                    if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                        for (Map.Entry<Integer, Object> entry : this.f15278a.entrySet()) {
                            if (entry != null && (entry.getValue() instanceof i) && (iVar = (i) entry.getValue()) != null) {
                                iVar.a(obj);
                            }
                        }
                    }
                } finally {
                }
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }
}
