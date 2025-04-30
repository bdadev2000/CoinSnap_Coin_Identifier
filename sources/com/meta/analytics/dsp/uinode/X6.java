package com.meta.analytics.dsp.uinode;

import android.util.Log;
import android.util.Pair;
import androidx.core.app.NotificationCompat;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: assets/audience_network.dex */
public final class X6 implements InterfaceC1100Cy {
    public static byte[] A0H;
    public static String[] A0I = {"aRSbhnMLIcOzj", "ArMoJofeV0W2c5eK3C8YvO0k1qJSW4Bu", "08qFCQPWLGI3uv5FT5gA6GEjfGrW3Yqx", "08xirDFjjs8oqtTIfBkr", "oUVAEbDN9zve", "EoNb", "rtTHy9LVM9SlY", "UaKoPz55Hu2hTR949azFeJYsN1lXPKTw"};
    public static final byte[] A0J;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public C4 A07;
    public C4 A08;
    public C4 A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public final C1216Hy A0D;
    public final C1217Hz A0E;
    public final String A0F;
    public final boolean A0G;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A0H, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 124);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A0H = new byte[]{-31, -43, Ascii.ETB, 42, 41, -43, Ascii.SYN, 40, 40, 42, 34, Ascii.RS, 35, Ascii.FS, -43, -10, -10, -8, -43, 1, -8, -29, -8, Ascii.ESC, 43, 42, 9, Ascii.FS, Ascii.CAN, Ascii.ESC, Ascii.FS, 41, -39, -6, 9, -6, -8, 9, -6, -7, -75, -10, 10, -7, -2, 4, -75, 4, -9, -1, -6, -8, 9, -75, 9, Ascii.SO, 5, -6, -49, -75, 34, 49, 49, 45, 42, 36, 34, 53, 42, 48, 47, -16, 42, 37, -12, 0, Ascii.DC4, 3, 8, Ascii.SO, -50, Ascii.FF, Ascii.SI, -45, 0, -52, Ascii.VT, 0, 19, Ascii.FF};
    }

    static {
        A06();
        A0J = new byte[]{73, 68, 51};
    }

    public X6(boolean z8) {
        this(z8, null);
    }

    public X6(boolean z8, String str) {
        this.A0D = new C1216Hy(new byte[7]);
        this.A0E = new C1217Hz(Arrays.copyOf(A0J, 10));
        A03();
        this.A0G = z8;
        this.A0F = str;
    }

    private void A01() throws C10259v {
        this.A0D.A07(0);
        if (!this.A0C) {
            int A04 = this.A0D.A04(2) + 1;
            if (A04 != 2) {
                Log.w(A00(22, 10, 59), A00(32, 28, 25) + A04 + A00(0, 22, 57));
                A04 = 2;
            }
            int channelConfig = this.A0D.A04(4);
            this.A0D.A08(1);
            int audioObjectType = this.A0D.A04(3);
            byte[] audioSpecificConfig = AbstractC1196He.A07(A04, channelConfig, audioObjectType);
            Pair<Integer, Integer> A03 = AbstractC1196He.A03(audioSpecificConfig);
            Format A07 = Format.A07(this.A0A, A00(75, 15, 35), null, -1, -1, ((Integer) A03.second).intValue(), ((Integer) A03.first).intValue(), Collections.singletonList(audioSpecificConfig), null, 0, this.A0F);
            int audioObjectType2 = A07.A0C;
            this.A05 = 1024000000 / audioObjectType2;
            this.A09.A5n(A07);
            this.A0C = true;
        } else {
            this.A0D.A08(10);
        }
        this.A0D.A08(4);
        int A042 = (this.A0D.A04(13) - 2) - 5;
        if (this.A0B) {
            A042 -= 2;
        }
        A07(this.A09, this.A05, 0, A042);
    }

    private void A02() {
        this.A08.AFR(this.A0E, 10);
        this.A0E.A0Y(6);
        A07(this.A08, 0L, 10, this.A0E.A0D() + 10);
    }

    private void A03() {
        this.A03 = 0;
        this.A00 = 0;
        this.A01 = NotificationCompat.FLAG_LOCAL_ONLY;
    }

    private void A04() {
        this.A03 = 2;
        this.A00 = 0;
    }

    private void A05() {
        this.A03 = 1;
        this.A00 = A0J.length;
        this.A02 = 0;
        this.A0E.A0Y(0);
    }

    private void A07(C4 c42, long j7, int i9, int i10) {
        this.A03 = 3;
        this.A00 = i9;
        this.A07 = c42;
        this.A04 = j7;
        this.A02 = i10;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0031. Please report as an issue. */
    private void A08(C1217Hz c1217Hz) {
        byte[] bArr = c1217Hz.A00;
        int A06 = c1217Hz.A06();
        int A07 = c1217Hz.A07();
        while (A06 < A07) {
            int i9 = A06 + 1;
            int i10 = bArr[A06] & 255;
            int endOffset = this.A01;
            if (endOffset == 512 && i10 >= 240 && i10 != 255) {
                this.A0B = (i10 & 1) == 0;
                A04();
                c1217Hz.A0Y(i9);
                return;
            }
            switch (endOffset | i10) {
                case 329:
                    this.A01 = 768;
                    A06 = i9;
                case 511:
                    this.A01 = 512;
                    A06 = i9;
                case 836:
                    this.A01 = 1024;
                    A06 = i9;
                case 1075:
                    A05();
                    c1217Hz.A0Y(i9);
                    return;
                default:
                    if (endOffset != 256) {
                        this.A01 = NotificationCompat.FLAG_LOCAL_ONLY;
                        A06 = i9 - 1;
                    } else {
                        A06 = i9;
                    }
            }
        }
        c1217Hz.A0Y(A06);
    }

    private void A09(C1217Hz c1217Hz) {
        int min = Math.min(c1217Hz.A04(), this.A02 - this.A00);
        this.A07.AFR(c1217Hz, min);
        int bytesToRead = this.A00 + min;
        this.A00 = bytesToRead;
        int i9 = this.A02;
        if (bytesToRead == i9) {
            this.A07.AFS(this.A06, 1, i9, 0, null);
            this.A06 += this.A04;
            A03();
        }
    }

    private boolean A0A(C1217Hz c1217Hz, byte[] bArr, int i9) {
        int min = Math.min(c1217Hz.A04(), i9 - this.A00);
        int bytesToRead = this.A00;
        c1217Hz.A0c(bArr, bytesToRead, min);
        int bytesToRead2 = this.A00;
        int bytesToRead3 = bytesToRead2 + min;
        this.A00 = bytesToRead3;
        return bytesToRead3 == i9;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1100Cy
    public final void A4R(C1217Hz c1217Hz) throws C10259v {
        while (c1217Hz.A04() > 0) {
            switch (this.A03) {
                case 0:
                    A08(c1217Hz);
                    break;
                case 1:
                    if (!A0A(c1217Hz, this.A0E.A00, 10)) {
                        break;
                    } else {
                        A02();
                        break;
                    }
                case 2:
                    if (!A0A(c1217Hz, this.A0D.A00, this.A0B ? 7 : 5)) {
                        break;
                    } else {
                        A01();
                        break;
                    }
                case 3:
                    A09(c1217Hz);
                    break;
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1100Cy
    public final void A4p(InterfaceC1076Bu interfaceC1076Bu, DC dc) {
        dc.A05();
        this.A0A = dc.A04();
        this.A09 = interfaceC1076Bu.AGi(dc.A03(), 1);
        if (this.A0G) {
            dc.A05();
            C4 AGi = interfaceC1076Bu.AGi(dc.A03(), 4);
            this.A08 = AGi;
            if (A0I[4].length() != 12) {
                throw new RuntimeException();
            }
            A0I[5] = "GBp";
            AGi.A5n(Format.A0B(dc.A04(), A00(60, 15, 69), null, -1, null));
            return;
        }
        this.A08 = new C1608Xl();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1100Cy
    public final void ADs() {
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1100Cy
    public final void ADt(long j7, boolean z8) {
        this.A06 = j7;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1100Cy
    public final void AFg() {
        A03();
    }
}
