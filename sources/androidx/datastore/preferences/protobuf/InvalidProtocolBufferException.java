package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* loaded from: classes4.dex */
public class InvalidProtocolBufferException extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;

    /* loaded from: classes4.dex */
    public static class InvalidWireTypeException extends InvalidProtocolBufferException {
        private static final long serialVersionUID = 3283890091615336259L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.InvalidProtocolBufferException, java.io.IOException] */
    public static InvalidProtocolBufferException a() {
        return new IOException("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.InvalidProtocolBufferException, java.io.IOException] */
    public static InvalidProtocolBufferException b() {
        return new IOException("Protocol message contained an invalid tag (zero).");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.InvalidProtocolBufferException, java.io.IOException] */
    public static InvalidProtocolBufferException c() {
        return new IOException("Protocol message had invalid UTF-8.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException, java.io.IOException] */
    public static InvalidWireTypeException d() {
        return new IOException("Protocol message tag had invalid wire type.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.InvalidProtocolBufferException, java.io.IOException] */
    public static InvalidProtocolBufferException e() {
        return new IOException("CodedInputStream encountered a malformed varint.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.InvalidProtocolBufferException, java.io.IOException] */
    public static InvalidProtocolBufferException f() {
        return new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.InvalidProtocolBufferException, java.io.IOException] */
    public static InvalidProtocolBufferException g() {
        return new IOException("Failed to parse the message.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.InvalidProtocolBufferException, java.io.IOException] */
    public static InvalidProtocolBufferException h() {
        return new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
