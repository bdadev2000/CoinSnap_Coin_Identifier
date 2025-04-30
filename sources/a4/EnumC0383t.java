package a4;

import com.google.protobuf.V2;

/* renamed from: a4.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC0383t implements V2 {
    PATH_TRANSLATION_UNSPECIFIED(0),
    CONSTANT_ADDRESS(1),
    APPEND_PATH_TO_ADDRESS(2),
    UNRECOGNIZED(-1);

    public final int b;

    EnumC0383t(int i9) {
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
