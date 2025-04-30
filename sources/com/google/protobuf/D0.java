package com.google.protobuf;

/* loaded from: classes3.dex */
public enum D0 implements V2 {
    LABEL_OPTIONAL(1),
    LABEL_REQUIRED(2),
    LABEL_REPEATED(3);

    public static final int LABEL_OPTIONAL_VALUE = 1;
    public static final int LABEL_REPEATED_VALUE = 3;
    public static final int LABEL_REQUIRED_VALUE = 2;
    private static final W2 internalValueMap = new W2() { // from class: com.google.protobuf.B0
        @Override // com.google.protobuf.W2
        public D0 findValueByNumber(int i9) {
            return D0.forNumber(i9);
        }
    };
    private final int value;

    D0(int i9) {
        this.value = i9;
    }

    public static D0 forNumber(int i9) {
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    return null;
                }
                return LABEL_REPEATED;
            }
            return LABEL_REQUIRED;
        }
        return LABEL_OPTIONAL;
    }

    public static W2 internalGetValueMap() {
        return internalValueMap;
    }

    public static X2 internalGetVerifier() {
        return C0.INSTANCE;
    }

    @Override // com.google.protobuf.V2
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static D0 valueOf(int i9) {
        return forNumber(i9);
    }
}
