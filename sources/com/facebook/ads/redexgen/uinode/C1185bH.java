package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.bH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1185bH implements AnonymousClass61 {
    public final /* synthetic */ FY A00;
    public final /* synthetic */ boolean A01;

    public C1185bH(FY fy, boolean z10) {
        this.A00 = fy;
        this.A01 = z10;
    }

    @Override // com.facebook.ads.redexgen.uinode.AnonymousClass61
    public final void AAl() {
        C1070Yn c1070Yn;
        AtomicBoolean atomicBoolean;
        AnonymousClass18 anonymousClass18;
        C1070Yn c1070Yn2;
        C1F c1f;
        c1070Yn = this.A00.A04;
        if (!C0659Ih.A1R(c1070Yn) || !this.A01) {
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            anonymousClass18 = this.A00.A01;
            anonymousClass18.ACy(this.A00);
            return;
        }
        FY fy = this.A00;
        c1070Yn2 = fy.A04;
        c1f = this.A00.A03;
        fy.A06 = PC.A01(c1070Yn2, (FS) c1f, 0, new C1186bI(this));
    }

    @Override // com.facebook.ads.redexgen.uinode.AnonymousClass61
    public final void AAm() {
        AnonymousClass18 anonymousClass18;
        anonymousClass18 = this.A00.A01;
        anonymousClass18.AD1(this.A00, AdError.CACHE_ERROR);
    }
}
