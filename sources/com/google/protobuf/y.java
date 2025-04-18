package com.google.protobuf;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class y implements a0 {
    private y() {
    }

    public /* synthetic */ y(v vVar) {
        this();
    }

    @Override // com.google.protobuf.a0
    public byte[] copyFrom(byte[] bArr, int i10, int i11) {
        return Arrays.copyOfRange(bArr, i10, i11 + i10);
    }
}
