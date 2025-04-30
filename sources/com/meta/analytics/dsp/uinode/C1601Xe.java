package com.meta.analytics.dsp.uinode;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Xe, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1601Xe implements InterfaceC1074Bs {
    public static byte[] A0F;
    public static String[] A0G = {"QnLOeuXESrCaGCWmeMmr3ccgSJivirlh", "YhzsmTzzzxhtyY2gbPt9z7nrByNpJ8AG", "zwujZ5tU8kb2uxp5tp3MFQMZqwl6Xl8T", "kc6RUJmY0MGel4Ws9MlGHroinjQjp2AB", "ZiGWNZua4Zts1sNsjYBSU4OXsNo5k01z", "vZczIWNBPrLvTkXGahgR3lrPVHA61MAE", "WEnNwLMqAaXyN6vSaeVfRhJYgSEHaora", "u0NJWOpvT5UyzhfOPQB88kiisy6mVL7a"};
    public static final InterfaceC1077Bv A0H;
    public static final int A0I;
    public int A00;
    public int A02;
    public int A03;
    public long A05;
    public InterfaceC1076Bu A06;
    public C1603Xg A07;
    public C1598Xb A08;
    public boolean A09;
    public final C1217Hz A0C = new C1217Hz(4);
    public final C1217Hz A0B = new C1217Hz(9);
    public final C1217Hz A0E = new C1217Hz(11);
    public final C1217Hz A0D = new C1217Hz();
    public final C1600Xd A0A = new C1600Xd();
    public int A01 = 1;
    public long A04 = C.TIME_UNSET;

    public static String A01(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 84);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0F = new byte[]{-41, -35, -25};
    }

    static {
        A03();
        A0H = new C1602Xf();
        A0I = IF.A08(A01(0, 3, 61));
    }

    private C1217Hz A00(InterfaceC1075Bt interfaceC1075Bt) throws IOException, InterruptedException {
        if (this.A02 > this.A0D.A05()) {
            C1217Hz c1217Hz = this.A0D;
            c1217Hz.A0b(new byte[Math.max(c1217Hz.A05() * 2, this.A02)], 0);
        } else {
            this.A0D.A0Y(0);
        }
        this.A0D.A0X(this.A02);
        interfaceC1075Bt.readFully(this.A0D.A00, 0, this.A02);
        return this.A0D;
    }

    private void A02() {
        long j7;
        if (!this.A09) {
            this.A06.AFi(new C1606Xj(C.TIME_UNSET));
            this.A09 = true;
        }
        if (this.A04 == C.TIME_UNSET) {
            if (this.A0A.A0D() == C.TIME_UNSET) {
                long j9 = this.A05;
                String[] strArr = A0G;
                if (strArr[5].charAt(20) != strArr[0].charAt(20)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0G;
                strArr2[7] = "L5UStG7DYoKpX710PXz3zQwSbfDogpGa";
                strArr2[6] = "NY6hXsIFzv8ItyXdU8z07IBZswL3MGXa";
                j7 = -j9;
            } else {
                j7 = 0;
            }
            this.A04 = j7;
        }
    }

    private void A04(InterfaceC1075Bt interfaceC1075Bt) throws IOException, InterruptedException {
        interfaceC1075Bt.AGP(this.A00);
        this.A00 = 0;
        this.A01 = 3;
    }

    private boolean A05(InterfaceC1075Bt interfaceC1075Bt) throws IOException, InterruptedException {
        if (!interfaceC1075Bt.AEM(this.A0B.A00, 0, 9, true)) {
            return false;
        }
        this.A0B.A0Y(0);
        this.A0B.A0Z(4);
        int A0E = this.A0B.A0E();
        int flags = A0E & 4;
        boolean hasVideo = flags != 0;
        int flags2 = A0E & 1;
        boolean z8 = flags2 != 0;
        if (hasVideo && this.A07 == null) {
            this.A07 = new C1603Xg(this.A06.AGi(8, 1));
        }
        if (z8 && this.A08 == null) {
            this.A08 = new C1598Xb(this.A06.AGi(9, 2));
        }
        this.A06.A5Y();
        int flags3 = this.A0B.A08();
        this.A00 = (flags3 - 9) + 4;
        this.A01 = 2;
        return true;
    }

    private boolean A06(InterfaceC1075Bt interfaceC1075Bt) throws IOException, InterruptedException {
        boolean z8 = true;
        int i9 = this.A03;
        if (i9 == 8 && this.A07 != null) {
            A02();
            C1603Xg c1603Xg = this.A07;
            C1217Hz A00 = A00(interfaceC1075Bt);
            long j7 = this.A04;
            String[] strArr = A0G;
            if (strArr[2].charAt(9) == strArr[1].charAt(9)) {
                throw new RuntimeException();
            }
            A0G[4] = "14LyfFoDFqyov0bzU05kIxDiosYU9C09";
            c1603Xg.A00(A00, j7 + this.A05);
        } else if (i9 == 9 && this.A08 != null) {
            A02();
            this.A08.A00(A00(interfaceC1075Bt), this.A04 + this.A05);
        } else {
            if (i9 == 18) {
                boolean wasConsumed = this.A09;
                if (!wasConsumed) {
                    this.A0A.A00(A00(interfaceC1075Bt), this.A05);
                    long A0D = this.A0A.A0D();
                    if (A0D != C.TIME_UNSET) {
                        this.A06.AFi(new C1606Xj(A0D));
                        this.A09 = true;
                    }
                }
            }
            interfaceC1075Bt.AGP(this.A02);
            z8 = false;
        }
        this.A00 = 4;
        this.A01 = 2;
        return z8;
    }

    private boolean A07(InterfaceC1075Bt interfaceC1075Bt) throws IOException, InterruptedException {
        if (!interfaceC1075Bt.AEM(this.A0E.A00, 0, 11, true)) {
            return false;
        }
        this.A0E.A0Y(0);
        this.A03 = this.A0E.A0E();
        this.A02 = this.A0E.A0G();
        this.A05 = this.A0E.A0G();
        this.A05 = ((this.A0E.A0E() << 24) | this.A05) * 1000;
        this.A0E.A0Z(3);
        this.A01 = 4;
        return true;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1074Bs
    public final void A8o(InterfaceC1076Bu interfaceC1076Bu) {
        this.A06 = interfaceC1076Bu;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1074Bs
    public final int AEH(InterfaceC1075Bt interfaceC1075Bt, C1079Bz c1079Bz) throws IOException, InterruptedException {
        while (true) {
            switch (this.A01) {
                case 1:
                    if (!A05(interfaceC1075Bt)) {
                        return -1;
                    }
                    break;
                case 2:
                    A04(interfaceC1075Bt);
                    break;
                case 3:
                    if (!A07(interfaceC1075Bt)) {
                        return -1;
                    }
                    break;
                case 4:
                    if (!A06(interfaceC1075Bt)) {
                        break;
                    } else {
                        return 0;
                    }
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1074Bs
    public final void AFh(long j7, long j9) {
        this.A01 = 1;
        this.A04 = C.TIME_UNSET;
        this.A00 = 0;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1074Bs
    public final boolean AGR(InterfaceC1075Bt interfaceC1075Bt) throws IOException, InterruptedException {
        interfaceC1075Bt.ADv(this.A0C.A00, 0, 3);
        this.A0C.A0Y(0);
        if (this.A0C.A0G() != A0I) {
            return false;
        }
        interfaceC1075Bt.ADv(this.A0C.A00, 0, 2);
        this.A0C.A0Y(0);
        if ((this.A0C.A0I() & 250) != 0) {
            return false;
        }
        interfaceC1075Bt.ADv(this.A0C.A00, 0, 4);
        this.A0C.A0Y(0);
        int dataOffset = this.A0C.A08();
        interfaceC1075Bt.AFM();
        interfaceC1075Bt.A3W(dataOffset);
        interfaceC1075Bt.ADv(this.A0C.A00, 0, 4);
        this.A0C.A0Y(0);
        int dataOffset2 = this.A0C.A08();
        return dataOffset2 == 0;
    }
}
