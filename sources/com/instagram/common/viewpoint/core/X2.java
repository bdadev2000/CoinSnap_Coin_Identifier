package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class X2 implements InterfaceC0570Gz {
    public static byte[] A00;
    public static final InterfaceC0569Gy A01;
    public static final X2 A02;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 65);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{95, 110, 118, 118, 98, 59, 104, 116, 110, 105, 120, 126};
    }

    static {
        A01();
        A02 = new X2();
        A01 = new X3();
    }

    public X2() {
    }

    public /* synthetic */ X2(X3 x3) {
        this();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0570Gz
    public final Uri A8c() {
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0570Gz
    public final long AEE(H3 h3) throws IOException {
        throw new IOException(A00(0, 12, 90));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0570Gz
    public final void close() throws IOException {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0570Gz
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        throw new UnsupportedOperationException();
    }
}
