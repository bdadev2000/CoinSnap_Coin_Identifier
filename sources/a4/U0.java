package a4;

import com.google.protobuf.V2;

/* loaded from: classes2.dex */
public enum U0 implements V2 {
    UNSPECIFIED(0),
    INT64(1),
    BOOL(2),
    STRING(3),
    DOUBLE(4),
    UNRECOGNIZED(-1);

    public final int b;

    U0(int i9) {
        this.b = i9;
    }

    @Override // com.google.protobuf.V2
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
