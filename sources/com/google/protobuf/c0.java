package com.google.protobuf;

/* loaded from: classes4.dex */
public final class c0 {
    private final byte[] buffer;
    private final d1 output;

    public /* synthetic */ c0(int i10, v vVar) {
        this(i10);
    }

    public h0 build() {
        this.output.checkNoSpaceLeft();
        return new e0(this.buffer);
    }

    public d1 getCodedOutput() {
        return this.output;
    }

    private c0(int i10) {
        byte[] bArr = new byte[i10];
        this.buffer = bArr;
        this.output = d1.newInstance(bArr);
    }
}
