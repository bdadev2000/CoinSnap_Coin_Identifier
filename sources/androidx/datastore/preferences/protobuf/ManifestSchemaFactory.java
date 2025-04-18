package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ManifestSchemaFactory implements SchemaFactory {

    /* renamed from: b, reason: collision with root package name */
    public static final AnonymousClass1 f19279b = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final MessageInfoFactory f19280a;

    /* renamed from: androidx.datastore.preferences.protobuf.ManifestSchemaFactory$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static class AnonymousClass1 implements MessageInfoFactory {
        @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
        public final MessageInfo a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
        public final boolean b(Class cls) {
            return false;
        }
    }

    /* loaded from: classes3.dex */
    public static class CompositeMessageInfoFactory implements MessageInfoFactory {

        /* renamed from: a, reason: collision with root package name */
        public MessageInfoFactory[] f19281a;

        @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
        public final MessageInfo a(Class cls) {
            for (MessageInfoFactory messageInfoFactory : this.f19281a) {
                if (messageInfoFactory.b(cls)) {
                    return messageInfoFactory.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
        }

        @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
        public final boolean b(Class cls) {
            for (MessageInfoFactory messageInfoFactory : this.f19281a) {
                if (messageInfoFactory.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.ManifestSchemaFactory$CompositeMessageInfoFactory, androidx.datastore.preferences.protobuf.MessageInfoFactory, java.lang.Object] */
    public ManifestSchemaFactory() {
        MessageInfoFactory messageInfoFactory;
        MessageInfoFactory[] messageInfoFactoryArr = new MessageInfoFactory[2];
        messageInfoFactoryArr[0] = GeneratedMessageInfoFactory.f19236a;
        try {
            messageInfoFactory = (MessageInfoFactory) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            messageInfoFactory = f19279b;
        }
        messageInfoFactoryArr[1] = messageInfoFactory;
        ?? obj = new Object();
        obj.f19281a = messageInfoFactoryArr;
        Charset charset = Internal.f19251a;
        this.f19280a = obj;
    }
}
