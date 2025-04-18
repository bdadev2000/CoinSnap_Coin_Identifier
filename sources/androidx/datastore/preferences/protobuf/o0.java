package androidx.datastore.preferences.protobuf;

import java.util.List;

/* loaded from: classes.dex */
public final class o0 extends p0 {
    @Override // androidx.datastore.preferences.protobuf.p0
    public final void a(Object obj, long j3) {
        ((c) ((g0) b2.o(obj, j3))).f1353b = false;
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public final void b(Object obj, Object obj2, long j3) {
        g0 g0Var = (g0) b2.o(obj, j3);
        g0 g0Var2 = (g0) b2.o(obj2, j3);
        int size = g0Var.size();
        int size2 = g0Var2.size();
        if (size > 0 && size2 > 0) {
            if (!((c) g0Var).f1353b) {
                g0Var = g0Var.mutableCopyWithCapacity(size2 + size);
            }
            g0Var.addAll(g0Var2);
        }
        if (size > 0) {
            g0Var2 = g0Var;
        }
        b2.v(obj, j3, g0Var2);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public final List c(Object obj, long j3) {
        int i10;
        g0 g0Var = (g0) b2.o(obj, j3);
        if (!((c) g0Var).f1353b) {
            int size = g0Var.size();
            if (size == 0) {
                i10 = 10;
            } else {
                i10 = size * 2;
            }
            g0 mutableCopyWithCapacity = g0Var.mutableCopyWithCapacity(i10);
            b2.v(obj, j3, mutableCopyWithCapacity);
            return mutableCopyWithCapacity;
        }
        return g0Var;
    }
}
