package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class X {

    /* renamed from: c, reason: collision with root package name */
    public static final X f4537c = new X();
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final J f4538a = new J();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.datastore.preferences.protobuf.S] */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.datastore.preferences.protobuf.S] */
    public final InterfaceC0426a0 a(Class cls) {
        Q q9;
        Q q10;
        Class cls2;
        AbstractC0449y.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        InterfaceC0426a0 interfaceC0426a0 = (InterfaceC0426a0) concurrentHashMap.get(cls);
        if (interfaceC0426a0 == null) {
            J j7 = this.f4538a;
            j7.getClass();
            Class cls3 = b0.f4545a;
            if (!AbstractC0446v.class.isAssignableFrom(cls) && (cls2 = b0.f4545a) != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
            Z messageInfoFor = ((O) j7.f4515a).messageInfoFor(cls);
            if ((messageInfoFor.f4544d & 2) == 2) {
                boolean isAssignableFrom = AbstractC0446v.class.isAssignableFrom(cls);
                AbstractC0425a abstractC0425a = messageInfoFor.f4542a;
                if (isAssignableFrom) {
                    q10 = new S(b0.f4547d, AbstractC0440o.f4590a, abstractC0425a);
                } else {
                    j0 j0Var = b0.b;
                    C0439n c0439n = AbstractC0440o.b;
                    if (c0439n != null) {
                        q10 = new S(j0Var, c0439n, abstractC0425a);
                    } else {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                }
                q9 = q10;
            } else if (AbstractC0446v.class.isAssignableFrom(cls)) {
                if (messageInfoFor.d() == 1) {
                    q9 = Q.q(messageInfoFor, U.b, G.b, b0.f4547d, AbstractC0440o.f4590a, N.b);
                } else {
                    q9 = Q.q(messageInfoFor, U.b, G.b, b0.f4547d, null, N.b);
                }
            } else if (messageInfoFor.d() == 1) {
                T t9 = U.f4536a;
                E e4 = G.f4513a;
                j0 j0Var2 = b0.b;
                C0439n c0439n2 = AbstractC0440o.b;
                if (c0439n2 != null) {
                    q9 = Q.q(messageInfoFor, t9, e4, j0Var2, c0439n2, N.f4519a);
                } else {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
            } else {
                q9 = Q.q(messageInfoFor, U.f4536a, G.f4513a, b0.f4546c, null, N.f4519a);
            }
            InterfaceC0426a0 interfaceC0426a02 = (InterfaceC0426a0) concurrentHashMap.putIfAbsent(cls, q9);
            if (interfaceC0426a02 != null) {
                return interfaceC0426a02;
            }
            return q9;
        }
        return interfaceC0426a0;
    }
}
