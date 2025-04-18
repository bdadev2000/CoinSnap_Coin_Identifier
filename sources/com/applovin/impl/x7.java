package com.applovin.impl;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class x7 extends dk {
    public w7 a(bh bhVar) {
        return new w7((String) b1.a((Object) bhVar.t()), (String) b1.a((Object) bhVar.t()), bhVar.s(), bhVar.s(), Arrays.copyOfRange(bhVar.c(), bhVar.d(), bhVar.e()));
    }

    @Override // com.applovin.impl.dk
    public bf a(ef efVar, ByteBuffer byteBuffer) {
        return new bf(a(new bh(byteBuffer.array(), byteBuffer.limit())));
    }
}
