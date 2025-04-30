package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class U {

    /* renamed from: a, reason: collision with root package name */
    public static final T f4536a;
    public static final T b;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, androidx.datastore.preferences.protobuf.T] */
    static {
        T t9 = null;
        try {
            t9 = (T) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f4536a = t9;
        b = new Object();
    }
}
