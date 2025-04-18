package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* loaded from: classes.dex */
public final class w0 {
    public static int a(int i10, Object obj, Object obj2) {
        v0 v0Var = (v0) obj;
        u0 u0Var = (u0) obj2;
        int i11 = 0;
        if (!v0Var.isEmpty()) {
            for (Map.Entry entry : v0Var.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                u0Var.getClass();
                int e02 = r.e0(i10);
                int a = u0.a(u0Var.a, key, value);
                i11 += r.g0(a) + a + e02;
            }
        }
        return i11;
    }

    public static v0 b(Object obj, Object obj2) {
        v0 v0Var = (v0) obj;
        v0 v0Var2 = (v0) obj2;
        if (!v0Var2.isEmpty()) {
            if (!v0Var.f1474b) {
                v0Var = v0Var.b();
            }
            v0Var.a();
            if (!v0Var2.isEmpty()) {
                v0Var.putAll(v0Var2);
            }
        }
        return v0Var;
    }

    public static void c(Object obj) {
        ((v0) obj).f1474b = false;
    }
}
