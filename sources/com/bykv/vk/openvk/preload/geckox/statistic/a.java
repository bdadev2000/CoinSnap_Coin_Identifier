package com.bykv.vk.openvk.preload.geckox.statistic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class a {
    private static final Map<Long, a> a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, com.bykv.vk.openvk.preload.geckox.statistic.model.a> f10107b = new HashMap();

    public static a a(long j3) {
        a aVar;
        Map<Long, a> map = a;
        synchronized (map) {
            aVar = map.get(Long.valueOf(j3));
            if (aVar == null) {
                aVar = new a();
                map.put(Long.valueOf(j3), aVar);
            }
        }
        return aVar;
    }

    public final com.bykv.vk.openvk.preload.geckox.statistic.model.a a(String str) {
        com.bykv.vk.openvk.preload.geckox.statistic.model.a aVar;
        synchronized (this.f10107b) {
            aVar = this.f10107b.get(str);
            if (aVar == null) {
                aVar = new com.bykv.vk.openvk.preload.geckox.statistic.model.a();
                this.f10107b.put(str, aVar);
            }
        }
        return aVar;
    }

    public final List<com.bykv.vk.openvk.preload.geckox.statistic.model.a> a() {
        ArrayList arrayList;
        synchronized (this.f10107b) {
            arrayList = new ArrayList(this.f10107b.values());
        }
        return arrayList;
    }
}
