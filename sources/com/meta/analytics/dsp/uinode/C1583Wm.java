package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1583Wm implements InterfaceC1074Bs {
    public static byte[] A05;
    public static String[] A06 = {"4UYaWsXN1cGpTlRGsO1EVWVYv3mJMVWU", "hbK8JAe0mxfaYRX1PJWZwY", "A0tXjRJ", "osk77A0r9", "0YYQ7Ec", "0ahCLR5uyRlwKx93emwBc8GJDT750HRT", "YIO", "F1mMZvBQ8EiEftVGCLgPL0zcj9avMacR"};
    public static final InterfaceC1077Bv A07;
    public int A00;
    public int A01;
    public InterfaceC1076Bu A02;
    public C4 A03;
    public C1582Wl A04;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 98);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{53, 78, 83, 85, 80, 80, 79, 82, 84, 69, 68, 0, 79, 82, 0, 85, 78, 82, 69, 67, 79, 71, 78, 73, 90, 69, 68, 0, 87, 65, 86, 0, 72, 69, 65, 68, 69, 82, Ascii.SO, 52, 72, 55, 60, 66, 2, 69, 52, 74};
    }

    static {
        A01();
        A07 = new C1584Wn();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1074Bs
    public final void A8o(InterfaceC1076Bu interfaceC1076Bu) {
        this.A02 = interfaceC1076Bu;
        this.A03 = interfaceC1076Bu.AGi(0, 1);
        this.A04 = null;
        interfaceC1076Bu.A5Y();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1074Bs
    public final int AEH(InterfaceC1075Bt interfaceC1075Bt, C1079Bz c1079Bz) throws IOException, InterruptedException {
        if (this.A04 == null) {
            C1582Wl A00 = DF.A00(interfaceC1075Bt);
            this.A04 = A00;
            if (A00 != null) {
                this.A03.A5n(Format.A06(null, A00(39, 9, 113), null, A00.A00(), 32768, this.A04.A03(), this.A04.A04(), this.A04.A02(), null, null, 0, null));
                this.A00 = this.A04.A01();
            } else {
                throw new C10259v(A00(0, 39, 126));
            }
        }
        C1582Wl c1582Wl = this.A04;
        if (A06[0].charAt(24) != 'v') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[6] = "XBd";
        strArr[3] = "hS3DTCCH9";
        if (!c1582Wl.A07()) {
            DF.A03(interfaceC1075Bt, this.A04);
            this.A02.AFi(this.A04);
        }
        int AFQ = this.A03.AFQ(interfaceC1075Bt, 32768 - this.A01, true);
        if (AFQ != -1) {
            this.A01 += AFQ;
        }
        int i9 = this.A01 / this.A00;
        if (i9 > 0) {
            long A052 = this.A04.A05(interfaceC1075Bt.A7i() - this.A01);
            int i10 = this.A00 * i9;
            int i11 = this.A01 - i10;
            this.A01 = i11;
            this.A03.AFS(A052, 1, i10, i11, null);
        }
        return AFQ == -1 ? -1 : 0;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1074Bs
    public final void AFh(long j7, long j9) {
        this.A01 = 0;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1074Bs
    public final boolean AGR(InterfaceC1075Bt interfaceC1075Bt) throws IOException, InterruptedException {
        return DF.A00(interfaceC1075Bt) != null;
    }
}
