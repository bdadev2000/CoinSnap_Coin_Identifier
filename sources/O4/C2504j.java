package o4;

import g4.AbstractC2292b;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: o4.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2504j implements K4.c, K4.b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f21962a;
    public ArrayDeque b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f21963c;

    public C2504j() {
        p4.l lVar = p4.l.b;
        this.f21962a = new HashMap();
        this.b = new ArrayDeque();
        this.f21963c = lVar;
    }

    public final synchronized void a(Executor executor, K4.a aVar) {
        try {
            executor.getClass();
            if (!this.f21962a.containsKey(AbstractC2292b.class)) {
                this.f21962a.put(AbstractC2292b.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f21962a.get(AbstractC2292b.class)).put(aVar, executor);
        } catch (Throwable th) {
            throw th;
        }
    }
}
