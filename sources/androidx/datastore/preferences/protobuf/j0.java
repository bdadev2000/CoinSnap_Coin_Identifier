package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* loaded from: classes.dex */
public class j0 extends IOException {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f1378c = 0;
    private static final long serialVersionUID = -1616151763072450476L;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1379b;

    public j0(String str) {
        super(str);
    }

    public static j0 a() {
        return new j0("Protocol message had invalid UTF-8.");
    }

    public static i0 b() {
        return new i0();
    }

    public static j0 c() {
        return new j0("CodedInputStream encountered a malformed varint.");
    }

    public static j0 d() {
        return new j0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static j0 e() {
        return new j0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public j0(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }
}
