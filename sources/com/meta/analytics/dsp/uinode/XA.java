package com.meta.analytics.dsp.uinode;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class XA implements InterfaceC1074Bs {
    public static byte[] A04;
    public static String[] A05 = {"89ZAS4gKAvfsCOhGFLRndaPlzH5Jylu0", "WDj0w8iYShPhw5JkNLQVjMzFidij1YMB", "SZD8V9ebG6DMCxkEToUDQHseHkwYH45y", "flB69VC8Ebs69L5nDVZVAs6kLxLMfW9p", "Dc9Giep11FBAOEJK", "fiVRhSZcsaoyqUlEeIiHO4czNXpaN55t", "HHz5E2PDkz6p7na9zQig", "GASwop9kiLfFsL9tAHZWlbr16muWtU3x"};
    public static final InterfaceC1077Bv A06;
    public static final int A07;
    public boolean A00;
    public final long A01;
    public final X9 A02;
    public final C1217Hz A03;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 70);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-8, -13, -30};
        if (A05[3].charAt(6) != 'C') {
            throw new RuntimeException();
        }
        A05[6] = "Dcf";
    }

    static {
        A01();
        A06 = new XB();
        A07 = IF.A08(A00(0, 3, 105));
    }

    public XA() {
        this(0L);
    }

    public XA(long j7) {
        this.A01 = j7;
        this.A02 = new X9();
        this.A03 = new C1217Hz(2786);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1074Bs
    public final void A8o(InterfaceC1076Bu interfaceC1076Bu) {
        this.A02.A4p(interfaceC1076Bu, new DC(0, 1));
        interfaceC1076Bu.A5Y();
        interfaceC1076Bu.AFi(new C1606Xj(C.TIME_UNSET));
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1074Bs
    public final int AEH(InterfaceC1075Bt interfaceC1075Bt, C1079Bz c1079Bz) throws IOException, InterruptedException {
        int read = interfaceC1075Bt.read(this.A03.A00, 0, 2786);
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
        int i9 = 0;
        while (true) {
            interfaceC1075Bt.ADv(c1217Hz.A00, 0, 5);
            c1217Hz.A0Y(0);
            int headerPosition = c1217Hz.A0I();
            if (headerPosition != 2935) {
                i9 = 0;
                interfaceC1075Bt.AFM();
                syncBytes++;
                int headerPosition2 = syncBytes - startPosition;
                if (headerPosition2 >= 8192) {
                    return false;
                }
                interfaceC1075Bt.A3W(syncBytes);
            } else {
                i9++;
                if (i9 >= 4) {
                    return true;
                }
                int headerPosition3 = AQ.A05(c1217Hz.A00);
                if (headerPosition3 == -1) {
                    return false;
                }
                interfaceC1075Bt.A3W(headerPosition3 - 5);
            }
        }
    }
}
