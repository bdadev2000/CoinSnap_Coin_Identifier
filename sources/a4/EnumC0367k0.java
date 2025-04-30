package a4;

import com.google.protobuf.V2;

/* renamed from: a4.k0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC0367k0 implements V2 {
    LAUNCH_STAGE_UNSPECIFIED(0),
    EARLY_ACCESS(1),
    ALPHA(2),
    BETA(3),
    GA(4),
    DEPRECATED(5),
    UNRECOGNIZED(-1);

    public final int b;

    EnumC0367k0(int i9) {
        this.b = i9;
    }

    public static EnumC0367k0 a(int i9) {
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 != 4) {
                            if (i9 != 5) {
                                return null;
                            }
                            return DEPRECATED;
                        }
                        return GA;
                    }
                    return BETA;
                }
                return ALPHA;
            }
            return EARLY_ACCESS;
        }
        return LAUNCH_STAGE_UNSPECIFIED;
    }

    @Override // com.google.protobuf.V2
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
