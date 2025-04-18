package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Xx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0998Xx implements DB {
    public static byte[] A03;
    public C9 A00;
    public IG A01;
    public boolean A02;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 48);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{39, 54, 54, 42, 47, 37, 39, 50, 47, 41, 40, 105, 62, 107, 53, 37, 50, 35, 117, 115};
    }

    @Override // com.instagram.common.viewpoint.core.DB
    public final void A4n(I4 i4) {
        if (!this.A02) {
            if (this.A01.A05() == -9223372036854775807L) {
                return;
            }
            this.A00.A69(Format.A02(null, A00(0, 20, Opcodes.FNEG), this.A01.A05()));
            this.A02 = true;
        }
        int A04 = i4.A04();
        this.A00.AFv(i4, A04);
        this.A00.AFw(this.A01.A04(), 1, A04, 0, null);
    }

    @Override // com.instagram.common.viewpoint.core.DB
    public final void A9F(IG ig, InterfaceC0457Bz interfaceC0457Bz, DH dh) {
        this.A01 = ig;
        dh.A05();
        this.A00 = interfaceC0457Bz.AHA(dh.A03(), 4);
        this.A00.A69(Format.A0B(dh.A04(), A00(0, 20, Opcodes.FNEG), null, -1, null));
    }
}
