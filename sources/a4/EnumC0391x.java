package a4;

import com.google.protobuf.V2;

/* renamed from: a4.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC0391x implements V2 {
    CHANGE_TYPE_UNSPECIFIED(0),
    ADDED(1),
    REMOVED(2),
    MODIFIED(3),
    UNRECOGNIZED(-1);

    public final int b;

    EnumC0391x(int i9) {
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
