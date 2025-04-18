package com.mbridge.msdk.dycreator.g;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public abstract class a extends com.mbridge.msdk.dycreator.c.a {

    /* renamed from: b, reason: collision with root package name */
    private List<Object> f12921b = new ArrayList();
    protected ConcurrentHashMap<Integer, Object> a = new ConcurrentHashMap<>();

    public final synchronized void a(Object obj, int i10) {
        if (obj != null) {
            ConcurrentHashMap<Integer, Object> concurrentHashMap = this.a;
            if (concurrentHashMap != null && !concurrentHashMap.containsValue(obj)) {
                this.a.put(Integer.valueOf(i10), obj);
            }
        }
    }

    public final synchronized void a() {
        this.a.clear();
    }
}
