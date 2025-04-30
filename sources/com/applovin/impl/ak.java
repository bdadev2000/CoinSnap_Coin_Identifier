package com.applovin.impl;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class ak implements xe {
    @Override // com.applovin.impl.xe
    public final we a(ze zeVar) {
        ByteBuffer byteBuffer = (ByteBuffer) AbstractC0669a1.a(zeVar.f9273c);
        AbstractC0669a1.a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (zeVar.d()) {
            return null;
        }
        return a(zeVar, byteBuffer);
    }

    public abstract we a(ze zeVar, ByteBuffer byteBuffer);
}
