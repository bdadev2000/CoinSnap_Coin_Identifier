package com.google.protobuf;

/* loaded from: classes3.dex */
public final class C {
    private final byte[] buffer;
    private final AbstractC1895e0 output;

    public /* synthetic */ C(int i9, C2012v c2012v) {
        this(i9);
    }

    public H build() {
        this.output.checkNoSpaceLeft();
        return new E(this.buffer);
    }

    public AbstractC1895e0 getCodedOutput() {
        return this.output;
    }

    private C(int i9) {
        byte[] bArr = new byte[i9];
        this.buffer = bArr;
        this.output = AbstractC1895e0.newInstance(bArr);
    }
}
