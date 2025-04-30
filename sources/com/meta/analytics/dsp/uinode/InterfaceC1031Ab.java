package com.meta.analytics.dsp.uinode;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.facebook.ads.redexgen.X.Ab, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public interface InterfaceC1031Ab {
    public static final ByteBuffer A00 = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    boolean A4Q(int i9, int i10, int i11) throws C1030Aa;

    ByteBuffer A7W();

    int A7X();

    int A7Y();

    int A7Z();

    boolean A8w();

    boolean A91();

    void AEE();

    void AEF(ByteBuffer byteBuffer);

    void flush();

    void reset();
}
