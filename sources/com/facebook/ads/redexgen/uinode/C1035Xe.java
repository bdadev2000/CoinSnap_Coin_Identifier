package com.facebook.ads.redexgen.uinode;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Xe, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1035Xe implements InterfaceC0508Bs {
    public static byte[] A0F;
    public static String[] A0G = {"QnLOeuXESrCaGCWmeMmr3ccgSJivirlh", "YhzsmTzzzxhtyY2gbPt9z7nrByNpJ8AG", "zwujZ5tU8kb2uxp5tp3MFQMZqwl6Xl8T", "kc6RUJmY0MGel4Ws9MlGHroinjQjp2AB", "ZiGWNZua4Zts1sNsjYBSU4OXsNo5k01z", "vZczIWNBPrLvTkXGahgR3lrPVHA61MAE", "WEnNwLMqAaXyN6vSaeVfRhJYgSEHaora", "u0NJWOpvT5UyzhfOPQB88kiisy6mVL7a"};
    public static final InterfaceC0511Bv A0H;
    public static final int A0I;
    public int A00;
    public int A02;
    public int A03;
    public long A05;
    public InterfaceC0510Bu A06;
    public C1037Xg A07;
    public C1032Xb A08;
    public boolean A09;
    public final C0651Hz A0C = new C0651Hz(4);
    public final C0651Hz A0B = new C0651Hz(9);
    public final C0651Hz A0E = new C0651Hz(11);
    public final C0651Hz A0D = new C0651Hz();
    public final C1034Xd A0A = new C1034Xd();
    public int A01 = 1;
    public long A04 = C.TIME_UNSET;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 84);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0F = new byte[]{-41, -35, -25};
    }

    static {
        A03();
        A0H = new C1036Xf();
        A0I = IF.A08(A01(0, 3, 61));
    }

    private C0651Hz A00(InterfaceC0509Bt interfaceC0509Bt) throws IOException, InterruptedException {
        if (this.A02 > this.A0D.A05()) {
            C0651Hz c0651Hz = this.A0D;
            c0651Hz.A0b(new byte[Math.max(c0651Hz.A05() * 2, this.A02)], 0);
        } else {
            this.A0D.A0Y(0);
        }
        this.A0D.A0X(this.A02);
        interfaceC0509Bt.readFully(this.A0D.A00, 0, this.A02);
        return this.A0D;
    }

    private void A02() {
        long j3;
        if (!this.A09) {
            this.A06.AFi(new C1040Xj(C.TIME_UNSET));
            this.A09 = true;
        }
        if (this.A04 == C.TIME_UNSET) {
            if (this.A0A.A0D() == C.TIME_UNSET) {
                long j10 = this.A05;
                String[] strArr = A0G;
                if (strArr[5].charAt(20) != strArr[0].charAt(20)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0G;
                strArr2[7] = "L5UStG7DYoKpX710PXz3zQwSbfDogpGa";
                strArr2[6] = "NY6hXsIFzv8ItyXdU8z07IBZswL3MGXa";
                j3 = -j10;
            } else {
                j3 = 0;
            }
            this.A04 = j3;
        }
    }

    private void A04(InterfaceC0509Bt interfaceC0509Bt) throws IOException, InterruptedException {
        interfaceC0509Bt.AGP(this.A00);
        this.A00 = 0;
        this.A01 = 3;
    }

    private boolean A05(InterfaceC0509Bt interfaceC0509Bt) throws IOException, InterruptedException {
        if (!interfaceC0509Bt.AEM(this.A0B.A00, 0, 9, true)) {
            return false;
        }
        this.A0B.A0Y(0);
        this.A0B.A0Z(4);
        int A0E = this.A0B.A0E();
        int flags = A0E & 4;
        boolean hasVideo = flags != 0;
        int flags2 = A0E & 1;
        boolean z10 = flags2 != 0;
        if (hasVideo && this.A07 == null) {
            this.A07 = new C1037Xg(this.A06.AGi(8, 1));
        }
        if (z10 && this.A08 == null) {
            this.A08 = new C1032Xb(this.A06.AGi(9, 2));
        }
        this.A06.A5Y();
        int flags3 = this.A0B.A08();
        this.A00 = (flags3 - 9) + 4;
        this.A01 = 2;
        return true;
    }

    private boolean A06(InterfaceC0509Bt interfaceC0509Bt) throws IOException, InterruptedException {
        boolean z10 = true;
        int i10 = this.A03;
        if (i10 == 8 && this.A07 != null) {
            A02();
            C1037Xg c1037Xg = this.A07;
            C0651Hz A00 = A00(interfaceC0509Bt);
            long j3 = this.A04;
            String[] strArr = A0G;
            if (strArr[2].charAt(9) == strArr[1].charAt(9)) {
                throw new RuntimeException();
            }
            A0G[4] = "14LyfFoDFqyov0bzU05kIxDiosYU9C09";
            c1037Xg.A00(A00, j3 + this.A05);
        } else if (i10 == 9 && this.A08 != null) {
            A02();
            this.A08.A00(A00(interfaceC0509Bt), this.A04 + this.A05);
        } else {
            if (i10 == 18) {
                boolean wasConsumed = this.A09;
                if (!wasConsumed) {
                    this.A0A.A00(A00(interfaceC0509Bt), this.A05);
                    long A0D = this.A0A.A0D();
                    if (A0D != C.TIME_UNSET) {
                        this.A06.AFi(new C1040Xj(A0D));
                        this.A09 = true;
                    }
                }
            }
            interfaceC0509Bt.AGP(this.A02);
            z10 = false;
        }
        this.A00 = 4;
        this.A01 = 2;
        return z10;
    }

    private boolean A07(InterfaceC0509Bt interfaceC0509Bt) throws IOException, InterruptedException {
        if (!interfaceC0509Bt.AEM(this.A0E.A00, 0, 11, true)) {
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

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0508Bs
    public final void A8o(InterfaceC0510Bu interfaceC0510Bu) {
        this.A06 = interfaceC0510Bu;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0508Bs
    public final int AEH(InterfaceC0509Bt interfaceC0509Bt, C0513Bz c0513Bz) throws IOException, InterruptedException {
        while (true) {
            switch (this.A01) {
                case 1:
                    if (!A05(interfaceC0509Bt)) {
                        return -1;
                    }
                    break;
                case 2:
                    A04(interfaceC0509Bt);
                    break;
                case 3:
                    if (!A07(interfaceC0509Bt)) {
                        return -1;
                    }
                    break;
                case 4:
                    if (!A06(interfaceC0509Bt)) {
                        break;
                    } else {
                        return 0;
                    }
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0508Bs
    public final void AFh(long j3, long j10) {
        this.A01 = 1;
        this.A04 = C.TIME_UNSET;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0508Bs
    public final boolean AGR(InterfaceC0509Bt interfaceC0509Bt) throws IOException, InterruptedException {
        interfaceC0509Bt.ADv(this.A0C.A00, 0, 3);
        this.A0C.A0Y(0);
        if (this.A0C.A0G() != A0I) {
            return false;
        }
        interfaceC0509Bt.ADv(this.A0C.A00, 0, 2);
        this.A0C.A0Y(0);
        if ((this.A0C.A0I() & 250) != 0) {
            return false;
        }
        interfaceC0509Bt.ADv(this.A0C.A00, 0, 4);
        this.A0C.A0Y(0);
        int dataOffset = this.A0C.A08();
        interfaceC0509Bt.AFM();
        interfaceC0509Bt.A3W(dataOffset);
        interfaceC0509Bt.ADv(this.A0C.A00, 0, 4);
        this.A0C.A0Y(0);
        int dataOffset2 = this.A0C.A08();
        return dataOffset2 == 0;
    }
}
