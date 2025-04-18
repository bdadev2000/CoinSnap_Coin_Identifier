package com.google.protobuf;

/* loaded from: classes4.dex */
public enum a8 implements y3 {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    UNRECOGNIZED(-1);

    public static final int SYNTAX_PROTO2_VALUE = 0;
    public static final int SYNTAX_PROTO3_VALUE = 1;
    private static final z3 internalValueMap = new z3() { // from class: com.google.protobuf.y7
        @Override // com.google.protobuf.z3
        public a8 findValueByNumber(int i10) {
            return a8.forNumber(i10);
        }
    };
    private final int value;

    a8(int i10) {
        this.value = i10;
    }

    public static a8 forNumber(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return null;
            }
            return SYNTAX_PROTO3;
        }
        return SYNTAX_PROTO2;
    }

    public static z3 internalGetValueMap() {
        return internalValueMap;
    }

    public static a4 internalGetVerifier() {
        return z7.INSTANCE;
    }

    @Override // com.google.protobuf.y3
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static a8 valueOf(int i10) {
        return forNumber(i10);
    }
}
