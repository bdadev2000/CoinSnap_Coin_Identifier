package com.mbridge.msdk.dycreator.g;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public abstract class a extends com.mbridge.msdk.dycreator.c.a {
    private List<Object> b = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    protected ConcurrentHashMap<Integer, Object> f15278a = new ConcurrentHashMap<>();

    public final synchronized void a(Object obj, int i9) {
        if (obj != null) {
            ConcurrentHashMap<Integer, Object> concurrentHashMap = this.f15278a;
            if (concurrentHashMap != null && !concurrentHashMap.containsValue(obj)) {
                this.f15278a.put(Integer.valueOf(i9), obj);
            }
        }
    }

    public final synchronized void a() {
        this.f15278a.clear();
    }
}
