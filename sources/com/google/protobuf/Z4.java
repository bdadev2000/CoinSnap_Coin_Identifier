package com.google.protobuf;

/* loaded from: classes3.dex */
public enum Z4 implements V2 {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    UNRECOGNIZED(-1);

    public static final int SYNTAX_PROTO2_VALUE = 0;
    public static final int SYNTAX_PROTO3_VALUE = 1;
    private static final W2 internalValueMap = new W2() { // from class: com.google.protobuf.X4
        @Override // com.google.protobuf.W2
        public Z4 findValueByNumber(int i9) {
            return Z4.forNumber(i9);
        }
    };
    private final int value;

    Z4(int i9) {
        this.value = i9;
    }

    public static Z4 forNumber(int i9) {
        if (i9 != 0) {
            if (i9 != 1) {
                return null;
            }
            return SYNTAX_PROTO3;
        }
        return SYNTAX_PROTO2;
    }

    public static W2 internalGetValueMap() {
        return internalValueMap;
    }

    public static X2 internalGetVerifier() {
        return Y4.INSTANCE;
    }

    @Override // com.google.protobuf.V2
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Z4 valueOf(int i9) {
        return forNumber(i9);
    }
}
