package com.instagram.common.viewpoint.core;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.facebook.ads.redexgen.X.Ag, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public interface InterfaceC0414Ag {
    public static final ByteBuffer A00 = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    boolean A4m(int i2, int i3, int i4) throws C0413Af;

    ByteBuffer A7u();

    int A7v();

    int A7w();

    int A7x();

    boolean A9L();

    boolean A9Q();

    void AEh();

    void AEi(ByteBuffer byteBuffer);

    void flush();

    void reset();
}
