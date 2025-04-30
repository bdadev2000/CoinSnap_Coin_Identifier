package com.google.protobuf;

/* renamed from: com.google.protobuf.f2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC1904f2 implements V2 {
    CARDINALITY_UNKNOWN(0),
    CARDINALITY_OPTIONAL(1),
    CARDINALITY_REQUIRED(2),
    CARDINALITY_REPEATED(3),
    UNRECOGNIZED(-1);

    public static final int CARDINALITY_OPTIONAL_VALUE = 1;
    public static final int CARDINALITY_REPEATED_VALUE = 3;
    public static final int CARDINALITY_REQUIRED_VALUE = 2;
    public static final int CARDINALITY_UNKNOWN_VALUE = 0;
    private static final W2 internalValueMap = new W2() { // from class: com.google.protobuf.d2
        @Override // com.google.protobuf.W2
        public EnumC1904f2 findValueByNumber(int i9) {
            return EnumC1904f2.forNumber(i9);
        }
    };
    private final int value;

    EnumC1904f2(int i9) {
        this.value = i9;
    }

    public static EnumC1904f2 forNumber(int i9) {
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
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

    public static W2 internalGetValueMap() {
        return internalValueMap;
    }

    public static X2 internalGetVerifier() {
        return C1897e2.INSTANCE;
    }

    @Override // com.google.protobuf.V2
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC1904f2 valueOf(int i9) {
        return forNumber(i9);
    }
}
