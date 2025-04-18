package db;

import java.util.Set;

/* loaded from: classes3.dex */
public interface b {
    cc.c a(s sVar);

    default Object b(Class cls) {
        return e(s.a(cls));
    }

    default Set c(s sVar) {
        return (Set) g(sVar).get();
    }

    default cc.c d(Class cls) {
        return a(s.a(cls));
    }

    default Object e(s sVar) {
        cc.c a = a(sVar);
        if (a == null) {
            return null;
        }
        return a.get();
    }

    cc.b f(s sVar);

    cc.c g(s sVar);
}
