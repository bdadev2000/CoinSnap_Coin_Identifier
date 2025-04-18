package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: c, reason: collision with root package name */
    public static final h1 f1372c = new h1();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f1373b = new ConcurrentHashMap();
    public final t0 a = new t0();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.datastore.preferences.protobuf.c1] */
    /* JADX WARN: Type inference failed for: r4v8, types: [androidx.datastore.preferences.protobuf.c1] */
    public final k1 a(Class cls) {
        boolean z10;
        b1 r6;
        b1 b1Var;
        Class cls2;
        Charset charset = h0.a;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.f1373b;
            k1 k1Var = (k1) concurrentHashMap.get(cls);
            if (k1Var == null) {
                t0 t0Var = this.a;
                t0Var.getClass();
                Class cls3 = l1.a;
                if (!e0.class.isAssignableFrom(cls) && (cls2 = l1.a) != null && !cls2.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
                }
                y0 messageInfoFor = t0Var.a.messageInfoFor(cls);
                j1 j1Var = (j1) messageInfoFor;
                boolean z11 = true;
                if ((j1Var.f1382d & 2) == 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    boolean isAssignableFrom = e0.class.isAssignableFrom(cls);
                    b bVar = j1Var.a;
                    if (isAssignableFrom) {
                        b1Var = new c1(l1.f1425d, w.a, bVar);
                    } else {
                        t1 t1Var = l1.f1423b;
                        v vVar = w.f1476b;
                        if (vVar != null) {
                            b1Var = new c1(t1Var, vVar, bVar);
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    }
                    r6 = b1Var;
                } else if (e0.class.isAssignableFrom(cls)) {
                    if (j1Var.d() != 1) {
                        z11 = false;
                    }
                    if (z11) {
                        r6 = b1.r(messageInfoFor, e1.f1365b, p0.f1448b, l1.f1425d, w.a, x0.f1480b);
                    } else {
                        r6 = b1.r(messageInfoFor, e1.f1365b, p0.f1448b, l1.f1425d, null, x0.f1480b);
                    }
                } else {
                    if (j1Var.d() != 1) {
                        z11 = false;
                    }
                    if (z11) {
                        d1 d1Var = e1.a;
                        n0 n0Var = p0.a;
                        t1 t1Var2 = l1.f1423b;
                        v vVar2 = w.f1476b;
                        if (vVar2 != null) {
                            r6 = b1.r(messageInfoFor, d1Var, n0Var, t1Var2, vVar2, x0.a);
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    } else {
                        r6 = b1.r(messageInfoFor, e1.a, p0.a, l1.f1424c, null, x0.a);
                    }
                }
                k1 k1Var2 = (k1) concurrentHashMap.putIfAbsent(cls, r6);
                if (k1Var2 != null) {
                    return k1Var2;
                }
                return r6;
            }
            return k1Var;
        }
        throw new NullPointerException("messageType");
    }
}
