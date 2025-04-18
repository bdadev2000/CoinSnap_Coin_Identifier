package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Xr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0992Xr implements InterfaceC0455Bx {
    public static byte[] A05;
    public static final C0 A06;
    public int A00;
    public int A01;
    public InterfaceC0457Bz A02;
    public C9 A03;
    public C0991Xq A04;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 64);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-97, -72, -67, -65, -70, -70, -71, -68, -66, -81, -82, 106, -71, -68, 106, -65, -72, -68, -81, -83, -71, -79, -72, -77, -60, -81, -82, 106, -63, -85, -64, 106, -78, -81, -85, -82, -81, -68, 120, -33, -13, -30, -25, -19, -83, -16, -33, -11};
    }

    static {
        A01();
        A06 = new C0993Xs();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0455Bx
    public final void A9D(InterfaceC0457Bz interfaceC0457Bz) {
        this.A02 = interfaceC0457Bz;
        this.A03 = interfaceC0457Bz.AHA(0, 1);
        this.A04 = null;
        interfaceC0457Bz.A5u();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0455Bx
    public final int AEk(InterfaceC0456By interfaceC0456By, C4 c4) throws IOException, InterruptedException {
        if (this.A04 == null) {
            this.A04 = DK.A00(interfaceC0456By);
            if (this.A04 != null) {
                this.A03.A69(Format.A06(null, A00(39, 9, 62), null, this.A04.A00(), 32768, this.A04.A03(), this.A04.A04(), this.A04.A02(), null, null, 0, null));
                this.A00 = this.A04.A01();
            } else {
                throw new A0(A00(0, 39, 10));
            }
        }
        if (!this.A04.A07()) {
            DK.A03(interfaceC0456By, this.A04);
            this.A02.AG8(this.A04);
        }
        int AFu = this.A03.AFu(interfaceC0456By, 32768 - this.A01, true);
        if (AFu != -1) {
            this.A01 += AFu;
        }
        int i2 = this.A01 / this.A00;
        if (i2 > 0) {
            long A052 = this.A04.A05(interfaceC0456By.A86() - this.A01);
            int i3 = this.A00 * i2;
            this.A01 -= i3;
            this.A03.AFw(A052, 1, i3, this.A01, null);
        }
        return AFu == -1 ? -1 : 0;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0455Bx
    public final void AG7(long j2, long j3) {
        this.A01 = 0;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0455Bx
    public final boolean AGs(InterfaceC0456By interfaceC0456By) throws IOException, InterruptedException {
        return DK.A00(interfaceC0456By) != null;
    }
}
