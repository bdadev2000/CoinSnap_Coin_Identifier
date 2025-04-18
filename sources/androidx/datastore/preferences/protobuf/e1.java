package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class e1 {
    public static final d1 a;

    /* renamed from: b, reason: collision with root package name */
    public static final d1 f1365b;

    static {
        d1 d1Var;
        try {
            d1Var = (d1) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            d1Var = null;
        }
        a = d1Var;
        f1365b = new d1();
    }
}
