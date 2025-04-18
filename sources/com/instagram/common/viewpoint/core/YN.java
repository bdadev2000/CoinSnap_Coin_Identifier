package com.instagram.common.viewpoint.core;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public class YN implements InterfaceC0474Cq, C6 {
    public long A00 = -1;
    public long A01 = -1;
    public long[] A02;
    public long[] A03;
    public final /* synthetic */ YM A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.C6
    public final C5 A8H(long j2) {
        int A0B = IK.A0B(this.A02, this.A04.A04(j2), true, true);
        long A03 = this.A04.A03(this.A02[A0B]);
        C7 c7 = new C7(A03, this.A00 + this.A03[A0B]);
        return (A03 >= j2 || A0B == this.A02.length - 1) ? new C5(c7) : new C5(c7, new C7(this.A04.A03(this.A02[A0B + 1]), this.A00 + this.A03[A0B + 1]));
    }

    public YN(YM ym) {
        this.A04 = ym;
    }

    public final void A00(long j2) {
        this.A00 = j2;
    }

    public final void A01(I4 i4) {
        i4.A0Z(1);
        int length = i4.A0G();
        int i2 = length / 18;
        this.A02 = new long[i2];
        this.A03 = new long[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.A02[i3] = i4.A0L();
            this.A03[i3] = i4.A0L();
            i4.A0Z(2);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0474Cq
    public final C6 A58() {
        return this;
    }

    @Override // com.instagram.common.viewpoint.core.C6
    public final long A7F() {
        C0588Hr c0588Hr;
        c0588Hr = this.A04.A01;
        return c0588Hr.A01();
    }

    @Override // com.instagram.common.viewpoint.core.C6
    public final boolean A9h() {
        return true;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0474Cq
    public final long AEl(InterfaceC0456By interfaceC0456By) throws IOException, InterruptedException {
        if (this.A01 < 0) {
            return -1L;
        }
        long result = -(this.A01 + 2);
        this.A01 = -1L;
        return result;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0474Cq
    public final long AGy(long j2) {
        long A04 = this.A04.A04(j2);
        long granule = this.A02[IK.A0B(this.A02, A04, true, true)];
        this.A01 = granule;
        return A04;
    }
}
