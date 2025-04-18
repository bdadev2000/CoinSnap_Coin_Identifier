package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class d {
    public static final Class a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f1357b;

    static {
        Class<?> cls;
        boolean z10;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        if (cls2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f1357b = z10;
    }

    public static boolean a() {
        return (a == null || f1357b) ? false : true;
    }
}
