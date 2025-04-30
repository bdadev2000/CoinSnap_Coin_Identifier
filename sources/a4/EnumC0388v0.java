package a4;

import com.google.protobuf.V2;

/* renamed from: a4.v0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC0388v0 implements V2 {
    VALUE_TYPE_UNSPECIFIED(0),
    BOOL(1),
    INT64(2),
    DOUBLE(3),
    STRING(4),
    DISTRIBUTION(5),
    MONEY(6),
    UNRECOGNIZED(-1);

    public final int b;

    EnumC0388v0(int i9) {
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
