package com.facebook.ads.redexgen.uinode;

import android.util.Log;
import android.util.Pair;
import androidx.core.app.NotificationCompat;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;
import java.util.Collections;
import kotlin.UByte;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: assets/audience_network.dex */
public final class X6 implements InterfaceC0534Cy {
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
    public final C0650Hy A0D;
    public final C0651Hz A0E;
    public final String A0F;
    public final boolean A0G;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0H, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 124);
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

    public X6(boolean z10) {
        this(z10, null);
    }

    public X6(boolean z10, String str) {
        this.A0D = new C0650Hy(new byte[7]);
        this.A0E = new C0651Hz(Arrays.copyOf(A0J, 10));
        A03();
        this.A0G = z10;
        this.A0F = str;
    }

    private void A01() throws C04599v {
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
            byte[] audioSpecificConfig = AbstractC0630He.A07(A04, channelConfig, audioObjectType);
            Pair<Integer, Integer> A03 = AbstractC0630He.A03(audioSpecificConfig);
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

    private void A07(C4 c42, long j3, int i10, int i11) {
        this.A03 = 3;
        this.A00 = i10;
        this.A07 = c42;
        this.A04 = j3;
        this.A02 = i11;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0031. Please report as an issue. */
    private void A08(C0651Hz c0651Hz) {
        byte[] bArr = c0651Hz.A00;
        int A06 = c0651Hz.A06();
        int A07 = c0651Hz.A07();
        while (A06 < A07) {
            int i10 = A06 + 1;
            int i11 = bArr[A06] & UByte.MAX_VALUE;
            int endOffset = this.A01;
            if (endOffset == 512 && i11 >= 240 && i11 != 255) {
                this.A0B = (i11 & 1) == 0;
                A04();
                c0651Hz.A0Y(i10);
                return;
            }
            switch (endOffset | i11) {
                case 329:
                    this.A01 = 768;
                    A06 = i10;
                case 511:
                    this.A01 = 512;
                    A06 = i10;
                case 836:
                    this.A01 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    A06 = i10;
                case 1075:
                    A05();
                    c0651Hz.A0Y(i10);
                    return;
                default:
                    if (endOffset != 256) {
                        this.A01 = NotificationCompat.FLAG_LOCAL_ONLY;
                        A06 = i10 - 1;
                    } else {
                        A06 = i10;
                    }
            }
        }
        c0651Hz.A0Y(A06);
    }

    private void A09(C0651Hz c0651Hz) {
        int min = Math.min(c0651Hz.A04(), this.A02 - this.A00);
        this.A07.AFR(c0651Hz, min);
        int bytesToRead = this.A00 + min;
        this.A00 = bytesToRead;
        int i10 = this.A02;
        if (bytesToRead == i10) {
            this.A07.AFS(this.A06, 1, i10, 0, null);
            this.A06 += this.A04;
            A03();
        }
    }

    private boolean A0A(C0651Hz c0651Hz, byte[] bArr, int i10) {
        int min = Math.min(c0651Hz.A04(), i10 - this.A00);
        int bytesToRead = this.A00;
        c0651Hz.A0c(bArr, bytesToRead, min);
        int bytesToRead2 = this.A00;
        int bytesToRead3 = bytesToRead2 + min;
        this.A00 = bytesToRead3;
        return bytesToRead3 == i10;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0534Cy
    public final void A4R(C0651Hz c0651Hz) throws C04599v {
        while (c0651Hz.A04() > 0) {
            switch (this.A03) {
                case 0:
                    A08(c0651Hz);
                    break;
                case 1:
                    if (!A0A(c0651Hz, this.A0E.A00, 10)) {
                        break;
                    } else {
                        A02();
                        break;
                    }
                case 2:
                    if (!A0A(c0651Hz, this.A0D.A00, this.A0B ? 7 : 5)) {
                        break;
                    } else {
                        A01();
                        break;
                    }
                case 3:
                    A09(c0651Hz);
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0534Cy
    public final void A4p(InterfaceC0510Bu interfaceC0510Bu, DC dc2) {
        dc2.A05();
        this.A0A = dc2.A04();
        this.A09 = interfaceC0510Bu.AGi(dc2.A03(), 1);
        if (this.A0G) {
            dc2.A05();
            C4 AGi = interfaceC0510Bu.AGi(dc2.A03(), 4);
            this.A08 = AGi;
            if (A0I[4].length() != 12) {
                throw new RuntimeException();
            }
            A0I[5] = "GBp";
            AGi.A5n(Format.A0B(dc2.A04(), A00(60, 15, 69), null, -1, null));
            return;
        }
        this.A08 = new C1042Xl();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0534Cy
    public final void ADs() {
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0534Cy
    public final void ADt(long j3, boolean z10) {
        this.A06 = j3;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0534Cy
    public final void AFg() {
        A03();
    }
}
