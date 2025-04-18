package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1005Vx implements InterfaceC0621Gu {
    public static byte[] A00;
    public static final InterfaceC0620Gt A01;
    public static final C1005Vx A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 107);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{51, 2, Ascii.SUB, Ascii.SUB, Ascii.SO, 87, 4, Ascii.CAN, 2, 5, Ascii.DC4, Ascii.DC2};
    }

    static {
        A01();
        A02 = new C1005Vx();
        A01 = new C1006Vy();
    }

    public C1005Vx() {
    }

    public /* synthetic */ C1005Vx(C1006Vy c1006Vy) {
        this();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0621Gu
    public final Uri A8E() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0621Gu
    public final long ADl(C0625Gy c0625Gy) throws IOException {
        throw new IOException(A00(0, 12, 28));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0621Gu
    public final void close() throws IOException {
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0621Gu
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        throw new UnsupportedOperationException();
    }
}
