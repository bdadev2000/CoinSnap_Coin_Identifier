package com.google.protobuf;

/* loaded from: classes4.dex */
public enum j2 implements y3 {
    CARDINALITY_UNKNOWN(0),
    CARDINALITY_OPTIONAL(1),
    CARDINALITY_REQUIRED(2),
    CARDINALITY_REPEATED(3),
    UNRECOGNIZED(-1);

    public static final int CARDINALITY_OPTIONAL_VALUE = 1;
    public static final int CARDINALITY_REPEATED_VALUE = 3;
    public static final int CARDINALITY_REQUIRED_VALUE = 2;
    public static final int CARDINALITY_UNKNOWN_VALUE = 0;
    private static final z3 internalValueMap = new z3() { // from class: com.google.protobuf.h2
        @Override // com.google.protobuf.z3
        public j2 findValueByNumber(int i10) {
            return j2.forNumber(i10);
        }
    };
    private final int value;

    j2(int i10) {
        this.value = i10;
    }

    public static j2 forNumber(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return null;
                    }
                    return CARDINALITY_REPEATED;
                }
                return CARDINALITY_REQUIRED;
            }
            return CARDINALITY_OPTIONAL;
        }
        return CARDINALITY_UNKNOWN;
    }

    public static z3 internalGetValueMap() {
        return internalValueMap;
    }

    public static a4 internalGetVerifier() {
        return i2.INSTANCE;
    }

    @Override // com.google.protobuf.y3
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static j2 valueOf(int i10) {
        return forNumber(i10);
    }
}
