package com.bykv.vk.openvk.preload.geckox.statistic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<Long, a> f13286a = new HashMap();
    private final Map<String, com.bykv.vk.openvk.preload.geckox.statistic.model.a> b = new HashMap();

    public static a a(long j7) {
        a aVar;
        Map<Long, a> map = f13286a;
        synchronized (map) {
            try {
                aVar = map.get(Long.valueOf(j7));
                if (aVar == null) {
                    aVar = new a();
                    map.put(Long.valueOf(j7), aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public final com.bykv.vk.openvk.preload.geckox.statistic.model.a a(String str) {
        com.bykv.vk.openvk.preload.geckox.statistic.model.a aVar;
        synchronized (this.b) {
            try {
                aVar = this.b.get(str);
                if (aVar == null) {
                    aVar = new com.bykv.vk.openvk.preload.geckox.statistic.model.a();
                    this.b.put(str, aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public final List<com.bykv.vk.openvk.preload.geckox.statistic.model.a> a() {
        ArrayList arrayList;
        synchronized (this.b) {
            arrayList = new ArrayList(this.b.values());
        }
        return arrayList;
    }
}
