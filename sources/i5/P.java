package i5;

import com.google.protobuf.V2;

/* loaded from: classes2.dex */
public enum P implements V2 {
    SOURCE_UNKNOWN(0),
    FL_LEGACY_V1(1);

    public final int b;

    P(int i9) {
        this.b = i9;
    }

    @Override // com.google.protobuf.V2
    public final int getNumber() {
        return this.b;
    }
}
