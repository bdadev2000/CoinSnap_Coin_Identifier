package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* loaded from: classes.dex */
public final class p extends IOException {
    private static final long serialVersionUID = -6947486886997889499L;

    public p(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
