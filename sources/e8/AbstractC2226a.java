package e8;

import java.util.Iterator;

/* renamed from: e8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2226a implements a8.b {
    public abstract Object a();

    public abstract int b(Object obj);

    public abstract Iterator c(Object obj);

    public abstract int d(Object obj);

    @Override // a8.b
    public Object deserialize(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        return e(cVar);
    }

    public final Object e(d8.c cVar) {
        G7.j.e(cVar, "decoder");
        Object a6 = a();
        int b = b(a6);
        d8.a b8 = cVar.b(getDescriptor());
        while (true) {
            int h6 = b8.h(getDescriptor());
            if (h6 != -1) {
                f(b8, h6 + b, a6, true);
            } else {
                b8.c(getDescriptor());
                return h(a6);
            }
        }
    }

    public abstract void f(d8.a aVar, int i9, Object obj, boolean z8);

    public abstract Object g(Object obj);

    public abstract Object h(Object obj);
}
