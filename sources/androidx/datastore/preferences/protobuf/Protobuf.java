package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ListFieldSchema;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Protobuf {

    /* renamed from: c, reason: collision with root package name */
    public static final Protobuf f19325c = new Protobuf();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f19327b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final ManifestSchemaFactory f19326a = new ManifestSchemaFactory();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.datastore.preferences.protobuf.MessageSetSchema] */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.datastore.preferences.protobuf.MessageSetSchema] */
    public final Schema a(Class cls) {
        MessageSchema x;
        MessageSchema messageSchema;
        Class cls2;
        Charset charset = Internal.f19251a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f19327b;
        Schema schema = (Schema) concurrentHashMap.get(cls);
        if (schema != null) {
            return schema;
        }
        ManifestSchemaFactory manifestSchemaFactory = this.f19326a;
        manifestSchemaFactory.getClass();
        Class cls3 = SchemaUtil.f19346a;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = SchemaUtil.f19346a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        MessageInfo a2 = manifestSchemaFactory.f19280a.a(cls);
        if (a2.a()) {
            if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                messageSchema = new MessageSetSchema(SchemaUtil.d, ExtensionSchemas.f19183a, a2.b());
            } else {
                UnknownFieldSchema unknownFieldSchema = SchemaUtil.f19347b;
                ExtensionSchema extensionSchema = ExtensionSchemas.f19184b;
                if (extensionSchema == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                messageSchema = new MessageSetSchema(unknownFieldSchema, extensionSchema, a2.b());
            }
            x = messageSchema;
        } else {
            boolean isAssignableFrom = GeneratedMessageLite.class.isAssignableFrom(cls);
            ProtoSyntax protoSyntax = ProtoSyntax.f19322a;
            if (isAssignableFrom) {
                x = a2.c() == protoSyntax ? MessageSchema.x(a2, NewInstanceSchemas.f19317b, ListFieldSchema.f19274b, SchemaUtil.d, ExtensionSchemas.f19183a, MapFieldSchemas.f19292b) : MessageSchema.x(a2, NewInstanceSchemas.f19317b, ListFieldSchema.f19274b, SchemaUtil.d, null, MapFieldSchemas.f19292b);
            } else if (a2.c() == protoSyntax) {
                NewInstanceSchema newInstanceSchema = NewInstanceSchemas.f19316a;
                ListFieldSchema.ListFieldSchemaFull listFieldSchemaFull = ListFieldSchema.f19273a;
                UnknownFieldSchema unknownFieldSchema2 = SchemaUtil.f19347b;
                ExtensionSchema extensionSchema2 = ExtensionSchemas.f19184b;
                if (extensionSchema2 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                x = MessageSchema.x(a2, newInstanceSchema, listFieldSchemaFull, unknownFieldSchema2, extensionSchema2, MapFieldSchemas.f19291a);
            } else {
                x = MessageSchema.x(a2, NewInstanceSchemas.f19316a, ListFieldSchema.f19273a, SchemaUtil.f19348c, null, MapFieldSchemas.f19291a);
            }
        }
        Schema schema2 = (Schema) concurrentHashMap.putIfAbsent(cls, x);
        return schema2 != null ? schema2 : x;
    }
}
