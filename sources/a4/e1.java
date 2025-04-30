package a4;

import com.google.protobuf.V2;

/* loaded from: classes2.dex */
public enum e1 implements V2 {
    HISTORY_UNSPECIFIED(0),
    ORIGINALLY_SINGLE_PATTERN(1),
    FUTURE_MULTI_PATTERN(2),
    UNRECOGNIZED(-1);

    public final int b;

    e1(int i9) {
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
