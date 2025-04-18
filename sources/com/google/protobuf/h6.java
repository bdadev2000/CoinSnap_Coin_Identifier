package com.google.protobuf;

/* loaded from: classes4.dex */
public enum h6 implements y3 {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);

    public static final int NULL_VALUE_VALUE = 0;
    private static final z3 internalValueMap = new z3() { // from class: com.google.protobuf.f6
        @Override // com.google.protobuf.z3
        public h6 findValueByNumber(int i10) {
            return h6.forNumber(i10);
        }
    };
    private final int value;

    h6(int i10) {
        this.value = i10;
    }

    public static h6 forNumber(int i10) {
        if (i10 != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    public static z3 internalGetValueMap() {
        return internalValueMap;
    }

    public static a4 internalGetVerifier() {
        return g6.INSTANCE;
    }

    @Override // com.google.protobuf.y3
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static h6 valueOf(int i10) {
        return forNumber(i10);
    }
}
