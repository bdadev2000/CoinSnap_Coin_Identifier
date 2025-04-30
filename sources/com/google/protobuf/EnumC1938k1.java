package com.google.protobuf;

/* renamed from: com.google.protobuf.k1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC1938k1 implements V2 {
    IDEMPOTENCY_UNKNOWN(0),
    NO_SIDE_EFFECTS(1),
    IDEMPOTENT(2);

    public static final int IDEMPOTENCY_UNKNOWN_VALUE = 0;
    public static final int IDEMPOTENT_VALUE = 2;
    public static final int NO_SIDE_EFFECTS_VALUE = 1;
    private static final W2 internalValueMap = new W2() { // from class: com.google.protobuf.i1
        @Override // com.google.protobuf.W2
        public EnumC1938k1 findValueByNumber(int i9) {
            return EnumC1938k1.forNumber(i9);
        }
    };
    private final int value;

    EnumC1938k1(int i9) {
        this.value = i9;
    }

    public static EnumC1938k1 forNumber(int i9) {
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    return null;
                }
                return IDEMPOTENT;
            }
            return NO_SIDE_EFFECTS;
        }
        return IDEMPOTENCY_UNKNOWN;
    }

    public static W2 internalGetValueMap() {
        return internalValueMap;
    }

    public static X2 internalGetVerifier() {
        return C1931j1.INSTANCE;
    }

    @Override // com.google.protobuf.V2
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static EnumC1938k1 valueOf(int i9) {
        return forNumber(i9);
    }
}
