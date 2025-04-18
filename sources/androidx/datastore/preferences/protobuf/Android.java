package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
final class Android {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f19104a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f19105b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f19104a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f19105b = cls2 != null;
    }

    public static boolean a() {
        return (f19104a == null || f19105b) ? false : true;
    }
}
