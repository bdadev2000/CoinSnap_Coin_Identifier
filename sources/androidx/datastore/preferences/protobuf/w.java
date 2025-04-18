package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class w {
    public static final v a = new v();

    /* renamed from: b, reason: collision with root package name */
    public static final v f1476b;

    static {
        v vVar;
        try {
            vVar = (v) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            vVar = null;
        }
        f1476b = vVar;
    }
}
