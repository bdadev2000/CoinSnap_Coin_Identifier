package com.meta.analytics.dsp.uinode;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class X7 implements InterfaceC1074Bs {
    public static byte[] A04;
    public static String[] A05 = {"zdP8mq1V4qx9ZCdsfAD4NG7cLFVpQAAe", "koAkuIv", "fyRTvmHGGGsRl9BV6D3JToZwd0QymLEV", "Ol6FmQC", "pWzJ4KWOtVeOprDRKRooJjLfCIz1i7Yl", "FaGWZpOEFJ3DEiDU22ljd64Ld5pUV9HD", "txEKQBUTk3v9kOkzxdvVTnLo1IME9gDG", "VQ1knBpCfCAoSCLl3kVfN2N5wBdN5LBp"};
    public static final InterfaceC1077Bv A06;
    public static final int A07;
    public boolean A00;
    public final long A01;
    public final X6 A02;
    public final C1217Hz A03;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i9, i9 + i10);
        int i12 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A05;
            if (strArr[2].charAt(21) == strArr[4].charAt(21)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[6] = "6nR4pRT1Z5KTQHbqvhpghrBhlvQkSoKV";
            strArr2[5] = "SkXTa4uQceGhkSQtr6wVij7rDC15CMq5";
            if (i12 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 67);
            i12++;
        }
    }

    public static void A01() {
        A04 = new byte[]{66, 79, 56};
    }

    static {
        A01();
        A06 = new X8();
        A07 = IF.A08(A00(0, 3, 72));
    }

    public X7() {
        this(0L);
    }

    public X7(long j7) {
        this.A01 = j7;
        this.A02 = new X6(true);
        this.A03 = new C1217Hz(200);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1074Bs
    public final void A8o(InterfaceC1076Bu interfaceC1076Bu) {
        this.A02.A4p(interfaceC1076Bu, new DC(0, 1));
        interfaceC1076Bu.A5Y();
        interfaceC1076Bu.AFi(new C1606Xj(C.TIME_UNSET));
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1074Bs
    public final int AEH(InterfaceC1075Bt interfaceC1075Bt, C1079Bz c1079Bz) throws IOException, InterruptedException {
        int read = interfaceC1075Bt.read(this.A03.A00, 0, 200);
        if (read == -1) {
            return -1;
        }
        this.A03.A0Y(0);
        this.A03.A0X(read);
        if (!this.A00) {
            this.A02.ADt(this.A01, true);
            this.A00 = true;
        }
        this.A02.A4R(this.A03);
        return 0;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1074Bs
    public final void AFh(long j7, long j9) {
        this.A00 = false;
        this.A02.AFg();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1074Bs
    public final boolean AGR(InterfaceC1075Bt interfaceC1075Bt) throws IOException, InterruptedException {
        C1217Hz c1217Hz = new C1217Hz(10);
        C1216Hy c1216Hy = new C1216Hy(c1217Hz.A00);
        int startPosition = 0;
        while (true) {
            interfaceC1075Bt.ADv(c1217Hz.A00, 0, 10);
            c1217Hz.A0Y(0);
            if (c1217Hz.A0G() != A07) {
                break;
            }
            c1217Hz.A0Z(3);
            int A0D = c1217Hz.A0D();
            startPosition += A0D + 10;
            interfaceC1075Bt.A3W(A0D);
        }
        interfaceC1075Bt.AFM();
        interfaceC1075Bt.A3W(startPosition);
        int syncBytes = startPosition;
        int validFramesCount = 0;
        int i9 = 0;
        while (true) {
            interfaceC1075Bt.ADv(c1217Hz.A00, 0, 2);
            c1217Hz.A0Y(0);
            int headerPosition = 65526 & c1217Hz.A0I();
            if (headerPosition != 65520) {
                i9 = 0;
                validFramesCount = 0;
                interfaceC1075Bt.AFM();
                syncBytes++;
                int headerPosition2 = syncBytes - startPosition;
                if (headerPosition2 >= 8192) {
                    return false;
                }
                interfaceC1075Bt.A3W(syncBytes);
            } else {
                i9++;
                if (i9 >= 4 && validFramesCount > 188) {
                    return true;
                }
                interfaceC1075Bt.ADv(c1217Hz.A00, 0, 4);
                c1216Hy.A07(14);
                int headerPosition3 = c1216Hy.A04(13);
                if (headerPosition3 <= 6) {
                    return false;
                }
                interfaceC1075Bt.A3W(headerPosition3 - 6);
                validFramesCount += headerPosition3;
            }
        }
    }
}
