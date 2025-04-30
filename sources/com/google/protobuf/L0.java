package com.google.protobuf;

/* loaded from: classes3.dex */
public enum L0 implements V2 {
    STRING(0),
    CORD(1),
    STRING_PIECE(2);

    public static final int CORD_VALUE = 1;
    public static final int STRING_PIECE_VALUE = 2;
    public static final int STRING_VALUE = 0;
    private static final W2 internalValueMap = new W2() { // from class: com.google.protobuf.J0
        @Override // com.google.protobuf.W2
        public L0 findValueByNumber(int i9) {
            return L0.forNumber(i9);
        }
    };
    private final int value;

    L0(int i9) {
        this.value = i9;
    }

    public static L0 forNumber(int i9) {
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    return null;
                }
                return STRING_PIECE;
            }
            return CORD;
        }
        return STRING;
    }

    public static W2 internalGetValueMap() {
        return internalValueMap;
    }

    public static X2 internalGetVerifier() {
        return K0.INSTANCE;
    }

    @Override // com.google.protobuf.V2
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static L0 valueOf(int i9) {
        return forNumber(i9);
    }
}
