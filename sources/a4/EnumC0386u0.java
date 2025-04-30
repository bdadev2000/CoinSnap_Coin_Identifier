package a4;

import com.google.protobuf.V2;

/* renamed from: a4.u0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC0386u0 implements V2 {
    METRIC_KIND_UNSPECIFIED(0),
    GAUGE(1),
    DELTA(2),
    CUMULATIVE(3),
    UNRECOGNIZED(-1);

    public final int b;

    EnumC0386u0(int i9) {
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
