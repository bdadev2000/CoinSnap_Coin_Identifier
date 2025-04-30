package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1571Vx implements InterfaceC1187Gu {
    public static byte[] A00;
    public static final InterfaceC1186Gt A01;
    public static final C1571Vx A02;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 107);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{51, 2, Ascii.SUB, Ascii.SUB, Ascii.SO, 87, 4, Ascii.CAN, 2, 5, Ascii.DC4, Ascii.DC2};
    }

    static {
        A01();
        A02 = new C1571Vx();
        A01 = new C1572Vy();
    }

    public C1571Vx() {
    }

    public /* synthetic */ C1571Vx(C1572Vy c1572Vy) {
        this();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1187Gu
    public final Uri A8E() {
        return null;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1187Gu
    public final long ADl(C1191Gy c1191Gy) throws IOException {
        throw new IOException(A00(0, 12, 28));
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1187Gu
    public final void close() throws IOException {
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1187Gu
    public final int read(byte[] bArr, int i9, int i10) throws IOException {
        throw new UnsupportedOperationException();
    }
}
