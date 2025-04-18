package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* loaded from: classes4.dex */
class GeneratedMessageInfoFactory implements MessageInfoFactory {

    /* renamed from: a, reason: collision with root package name */
    public static final GeneratedMessageInfoFactory f19236a = new Object();

    @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
    public final MessageInfo a(Class cls) {
        if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (MessageInfo) GeneratedMessageLite.o(cls.asSubclass(GeneratedMessageLite.class)).m(GeneratedMessageLite.MethodToInvoke.f19243c);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
    public final boolean b(Class cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }
}
