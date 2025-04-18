package androidx.datastore.preferences.protobuf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class MapFieldSchemas {

    /* renamed from: a, reason: collision with root package name */
    public static final MapFieldSchema f19291a;

    /* renamed from: b, reason: collision with root package name */
    public static final MapFieldSchemaLite f19292b;

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.preferences.protobuf.MapFieldSchemaLite, java.lang.Object] */
    static {
        MapFieldSchema mapFieldSchema;
        try {
            mapFieldSchema = (MapFieldSchema) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            mapFieldSchema = null;
        }
        f19291a = mapFieldSchema;
        f19292b = new Object();
    }
}
