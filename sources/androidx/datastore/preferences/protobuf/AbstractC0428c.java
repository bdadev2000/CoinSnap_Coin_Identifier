package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0428c {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f4548a;
    public static final boolean b;

    static {
        Class<?> cls;
        boolean z8;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f4548a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        if (cls2 != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        b = z8;
    }

    public static boolean a() {
        if (f4548a != null && !b) {
            return true;
        }
        return false;
    }
}
