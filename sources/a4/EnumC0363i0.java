package a4;

import com.google.protobuf.V2;

/* renamed from: a4.i0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC0363i0 implements V2 {
    STRING(0),
    BOOL(1),
    INT64(2),
    UNRECOGNIZED(-1);

    public final int b;

    EnumC0363i0(int i9) {
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
