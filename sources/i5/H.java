package i5;

import com.google.protobuf.V2;

/* loaded from: classes2.dex */
public enum H implements V2 {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);

    public final int b;

    H(int i9) {
        this.b = i9;
    }

    public static H a(int i9) {
        if (i9 != 0) {
            if (i9 != 1) {
                return null;
            }
            return GAUGES_AND_SYSTEM_EVENTS;
        }
        return SESSION_VERBOSITY_NONE;
    }

    @Override // com.google.protobuf.V2
    public final int getNumber() {
        return this.b;
    }
}
