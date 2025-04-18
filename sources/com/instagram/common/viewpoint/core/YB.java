package com.instagram.common.viewpoint.core;

import android.util.Log;
import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.google.android.material.internal.ViewUtils;
import java.util.Arrays;
import java.util.Collections;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class YB implements D3 {
    public static byte[] A0H;
    public static final byte[] A0I;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public C9 A07;
    public C9 A08;
    public C9 A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public final I3 A0D;
    public final I4 A0E;
    public final String A0F;
    public final boolean A0G;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0H, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 26);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A0H = new byte[]{-69, -81, -15, 4, 3, -81, -16, 2, 2, 4, -4, -8, -3, -10, -81, -48, -48, -46, -81, -37, -46, -67, 95, -126, -110, -111, 112, -125, Byte.MAX_VALUE, -126, -125, -112, 104, -119, -104, -119, -121, -104, -119, -120, 68, -123, -103, -120, -115, -109, 68, -109, -122, -114, -119, -121, -104, 68, -104, -99, -108, -119, 94, 68, -23, -8, -8, -12, -15, -21, -23, -4, -15, -9, -10, -73, -15, -20, -69, -25, -5, -22, -17, -11, -75, -13, -10, -70, -25, -77, -14, -25, -6, -13};
    }

    static {
        A06();
        A0I = new byte[]{73, 68, 51};
    }

    public YB(boolean z2) {
        this(z2, null);
    }

    public YB(boolean z2, String str) {
        this.A0D = new I3(new byte[7]);
        this.A0E = new I4(Arrays.copyOf(A0I, 10));
        A03();
        this.A0G = z2;
        this.A0F = str;
    }

    private void A01() throws A0 {
        this.A0D.A07(0);
        if (!this.A0C) {
            int A04 = this.A0D.A04(2) + 1;
            if (A04 != 2) {
                Log.w(A00(22, 10, 4), A00(32, 28, 10) + A04 + A00(0, 22, Opcodes.LNEG));
                A04 = 2;
            }
            int A042 = this.A0D.A04(4);
            this.A0D.A08(1);
            int audioObjectType = this.A0D.A04(3);
            byte[] A07 = AbstractC0580Hj.A07(A04, A042, audioObjectType);
            Pair<Integer, Integer> A03 = AbstractC0580Hj.A03(A07);
            Format format = Format.A07(this.A0A, A00(75, 15, 108), null, -1, -1, ((Integer) A03.second).intValue(), ((Integer) A03.first).intValue(), Collections.singletonList(A07), null, 0, this.A0F);
            int audioObjectType2 = format.A0C;
            this.A05 = 1024000000 / audioObjectType2;
            this.A09.A69(format);
            this.A0C = true;
        } else {
            this.A0D.A08(10);
        }
        this.A0D.A08(4);
        int A043 = (this.A0D.A04(13) - 2) - 5;
        if (this.A0B) {
            A043 -= 2;
        }
        A07(this.A09, this.A05, 0, A043);
    }

    private void A02() {
        this.A08.AFv(this.A0E, 10);
        this.A0E.A0Y(6);
        A07(this.A08, 0L, 10, this.A0E.A0D() + 10);
    }

    private void A03() {
        this.A03 = 0;
        this.A00 = 0;
        this.A01 = 256;
    }

    private void A04() {
        this.A03 = 2;
        this.A00 = 0;
    }

    private void A05() {
        this.A03 = 1;
        this.A00 = A0I.length;
        this.A02 = 0;
        this.A0E.A0Y(0);
    }

    private void A07(C9 c9, long j2, int i2, int i3) {
        this.A03 = 3;
        this.A00 = i2;
        this.A07 = c9;
        this.A04 = j2;
        this.A02 = i3;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0032. Please report as an issue. */
    private void A08(I4 i4) {
        byte[] bArr = i4.A00;
        int A06 = i4.A06();
        int A07 = i4.A07();
        while (A06 < A07) {
            int i2 = A06 + 1;
            int position = bArr[A06] & 255;
            if (this.A01 == 512 && position >= 240 && position != 255) {
                this.A0B = (position & 1) == 0;
                A04();
                i4.A0Y(i2);
                return;
            }
            switch (this.A01 | position) {
                case 329:
                    this.A01 = ViewUtils.EDGE_TO_EDGE_FLAGS;
                    A06 = i2;
                case 511:
                    this.A01 = 512;
                    A06 = i2;
                case 836:
                    this.A01 = 1024;
                    A06 = i2;
                case 1075:
                    A05();
                    i4.A0Y(i2);
                    return;
                default:
                    int data = this.A01;
                    if (data != 256) {
                        this.A01 = 256;
                        A06 = i2 - 1;
                    } else {
                        A06 = i2;
                    }
            }
        }
        i4.A0Y(A06);
    }

    private void A09(I4 i4) {
        int min = Math.min(i4.A04(), this.A02 - this.A00);
        this.A07.AFv(i4, min);
        int bytesToRead = this.A00;
        this.A00 = bytesToRead + min;
        int i2 = this.A00;
        int bytesToRead2 = this.A02;
        if (i2 == bytesToRead2) {
            this.A07.AFw(this.A06, 1, this.A02, 0, null);
            this.A06 += this.A04;
            A03();
        }
    }

    private boolean A0A(I4 i4, byte[] bArr, int i2) {
        int min = Math.min(i4.A04(), i2 - this.A00);
        int bytesToRead = this.A00;
        i4.A0c(bArr, bytesToRead, min);
        int bytesToRead2 = this.A00;
        this.A00 = bytesToRead2 + min;
        int bytesToRead3 = this.A00;
        return bytesToRead3 == i2;
    }

    @Override // com.instagram.common.viewpoint.core.D3
    public final void A4n(I4 i4) throws A0 {
        while (i4.A04() > 0) {
            switch (this.A03) {
                case 0:
                    A08(i4);
                    break;
                case 1:
                    if (!A0A(i4, this.A0E.A00, 10)) {
                        break;
                    } else {
                        A02();
                        break;
                    }
                case 2:
                    if (!A0A(i4, this.A0D.A00, this.A0B ? 7 : 5)) {
                        break;
                    } else {
                        A01();
                        break;
                    }
                case 3:
                    A09(i4);
                    break;
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.D3
    public final void A5B(InterfaceC0457Bz interfaceC0457Bz, DH dh) {
        dh.A05();
        this.A0A = dh.A04();
        this.A09 = interfaceC0457Bz.AHA(dh.A03(), 1);
        if (this.A0G) {
            dh.A05();
            this.A08 = interfaceC0457Bz.AHA(dh.A03(), 4);
            this.A08.A69(Format.A0B(dh.A04(), A00(60, 15, 110), null, -1, null));
            return;
        }
        this.A08 = new C1017Yq();
    }

    @Override // com.instagram.common.viewpoint.core.D3
    public final void AEL() {
    }

    @Override // com.instagram.common.viewpoint.core.D3
    public final void AEM(long j2, boolean z2) {
        this.A06 = j2;
    }

    @Override // com.instagram.common.viewpoint.core.D3
    public final void AG6() {
        A03();
    }
}
