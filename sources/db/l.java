package db;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class l implements zb.c, zb.b {
    public final HashMap a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public ArrayDeque f16959b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final Executor f16960c;

    public l(Executor executor) {
        this.f16960c = executor;
    }

    public final synchronized void a(Executor executor, zb.a aVar) {
        executor.getClass();
        if (!this.a.containsKey(va.b.class)) {
            this.a.put(va.b.class, new ConcurrentHashMap());
        }
        ((ConcurrentHashMap) this.a.get(va.b.class)).put(aVar, executor);
    }
}
