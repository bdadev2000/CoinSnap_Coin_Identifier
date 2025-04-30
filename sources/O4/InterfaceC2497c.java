package o4;

import java.util.Set;

/* renamed from: o4.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC2497c {
    default Set a(q qVar) {
        return (Set) e(qVar).get();
    }

    default Object b(Class cls) {
        return f(q.a(cls));
    }

    default N4.b c(Class cls) {
        return g(q.a(cls));
    }

    o d(q qVar);

    N4.b e(q qVar);

    default Object f(q qVar) {
        N4.b g9 = g(qVar);
        if (g9 == null) {
            return null;
        }
        return g9.get();
    }

    N4.b g(q qVar);
}
