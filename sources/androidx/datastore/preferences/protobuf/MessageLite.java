package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* loaded from: classes.dex */
public interface MessageLite extends MessageLiteOrBuilder {

    /* loaded from: classes.dex */
    public interface Builder extends MessageLiteOrBuilder, Cloneable {
        MessageLite e();
    }

    GeneratedMessageLite.Builder a();

    ByteString b();

    int c();

    GeneratedMessageLite.Builder d();

    void g(CodedOutputStream codedOutputStream);
}
