package androidx.datastore.preferences.protobuf;

import java.util.Collections;

/* renamed from: androidx.datastore.preferences.protobuf.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0438m {

    /* renamed from: a, reason: collision with root package name */
    public static volatile C0438m f4589a;
    public static final C0438m b;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.m, java.lang.Object] */
    static {
        try {
            Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
        ?? obj = new Object();
        Collections.emptyMap();
        b = obj;
    }

    public static C0438m a() {
        C0438m c0438m = f4589a;
        if (c0438m == null) {
            synchronized (C0438m.class) {
                try {
                    c0438m = f4589a;
                    if (c0438m == null) {
                        Class cls = AbstractC0437l.f4588a;
                        if (cls != null) {
                            try {
                                c0438m = (C0438m) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                            f4589a = c0438m;
                        }
                        c0438m = b;
                        f4589a = c0438m;
                    }
                } finally {
                }
            }
        }
        return c0438m;
    }
}
