package com.google.protobuf;

/* renamed from: com.google.protobuf.g4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC1913g4 implements V2 {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);

    public static final int NULL_VALUE_VALUE = 0;
    private static final W2 internalValueMap = new W2() { // from class: com.google.protobuf.e4
        @Override // com.google.protobuf.W2
        public EnumC1913g4 findValueByNumber(int i9) {
            return EnumC1913g4.forNumber(i9);
        }
    };
    private final int value;

    EnumC1913g4(int i9) {
        this.value = i9;
    }

    public static EnumC1913g4 forNumber(int i9) {
        if (i9 != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    public static W2 internalGetValueMap() {
        return internalValueMap;
    }

    public static X2 internalGetVerifier() {
        return C1906f4.INSTANCE;
    }

    @Override // com.google.protobuf.V2
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC1913g4 valueOf(int i9) {
        return forNumber(i9);
    }
}
