package androidx.datastore.preferences.protobuf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ExtensionSchemas {

    /* renamed from: a, reason: collision with root package name */
    public static final ExtensionSchemaLite f19183a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final ExtensionSchema f19184b;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.ExtensionSchemaLite, java.lang.Object] */
    static {
        ExtensionSchema extensionSchema;
        try {
            extensionSchema = (ExtensionSchema) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            extensionSchema = null;
        }
        f19184b = extensionSchema;
    }
}
