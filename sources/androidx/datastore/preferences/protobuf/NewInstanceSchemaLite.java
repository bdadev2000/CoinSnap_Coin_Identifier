package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NewInstanceSchemaLite implements NewInstanceSchema {
    @Override // androidx.datastore.preferences.protobuf.NewInstanceSchema
    public final Object a(MessageLite messageLite) {
        return ((GeneratedMessageLite) messageLite).m(GeneratedMessageLite.MethodToInvoke.d);
    }
}
