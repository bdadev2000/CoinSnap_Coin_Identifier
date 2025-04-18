package androidx.datastore.preferences.protobuf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NewInstanceSchemas {

    /* renamed from: a, reason: collision with root package name */
    public static final NewInstanceSchema f19316a;

    /* renamed from: b, reason: collision with root package name */
    public static final NewInstanceSchemaLite f19317b;

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.preferences.protobuf.NewInstanceSchemaLite, java.lang.Object] */
    static {
        NewInstanceSchema newInstanceSchema;
        try {
            newInstanceSchema = (NewInstanceSchema) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            newInstanceSchema = null;
        }
        f19316a = newInstanceSchema;
        f19317b = new Object();
    }
}
