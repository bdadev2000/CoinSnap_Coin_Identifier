package com.google.protobuf;

/* loaded from: classes3.dex */
public final class W4 implements K3 {
    private final int[] checkInitialized;
    private final N3 defaultInstance;
    private final C1946l2[] fields;
    private final boolean messageSetWireFormat;
    private final EnumC1962n4 syntax;

    public W4(EnumC1962n4 enumC1962n4, boolean z8, int[] iArr, C1946l2[] c1946l2Arr, Object obj) {
        this.syntax = enumC1962n4;
        this.messageSetWireFormat = z8;
        this.checkInitialized = iArr;
        this.fields = c1946l2Arr;
        this.defaultInstance = (N3) C1898e3.checkNotNull(obj, "defaultInstance");
    }

    public static V4 newBuilder() {
        return new V4();
    }

    public int[] getCheckInitialized() {
        return this.checkInitialized;
    }

    @Override // com.google.protobuf.K3
    public N3 getDefaultInstance() {
        return this.defaultInstance;
    }

    public C1946l2[] getFields() {
        return this.fields;
    }

    @Override // com.google.protobuf.K3
    public EnumC1962n4 getSyntax() {
        return this.syntax;
    }

    @Override // com.google.protobuf.K3
    public boolean isMessageSetWireFormat() {
        return this.messageSetWireFormat;
    }

    public static V4 newBuilder(int i9) {
        return new V4(i9);
    }
}
