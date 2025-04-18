package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Fa, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0578Fa extends AbstractC1158aq {
    public static String[] A04 = {"9yCAU6vHH5iW2uzgCW6HgdGPEZSQZZfL", "J47", "6rlZoFx9Uu0Bsrona1cKRXumzm4YYBbS", "bhq", "umQrlUDl61wUXIIBom7yT3QugrS", "j4Wkewb2uBFqLUCHLR63rcK9C", "eNU4QeIs11d2vjS0Im22LGZCKxJhHCKO", "6j5HGQ5u8FmBkqYMwiejF76PKOqfr1XC"};
    public final /* synthetic */ FY A00;
    public final /* synthetic */ AbstractC1177b9 A01;
    public final /* synthetic */ FS A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0578Fa(FY fy, boolean z10, boolean z11, FS fs, AbstractC1177b9 abstractC1177b9) {
        super(z10);
        this.A00 = fy;
        this.A03 = z11;
        this.A02 = fs;
        this.A01 = abstractC1177b9;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC1158aq
    public final void A00() {
        AnonymousClass18 anonymousClass18;
        anonymousClass18 = this.A00.A01;
        anonymousClass18.AD1(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC1158aq
    public final void A01(boolean z10) {
        C1070Yn c1070Yn;
        AtomicBoolean atomicBoolean;
        AnonymousClass18 anonymousClass18;
        C1070Yn c1070Yn2;
        c1070Yn = this.A00.A04;
        if (!C0659Ih.A1R(c1070Yn) || !this.A03) {
            atomicBoolean = this.A00.A0C;
            if (A04[4].length() == 16) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[1] = "NG7";
            strArr[3] = "cbl";
            atomicBoolean.set(true);
            anonymousClass18 = this.A00.A01;
            anonymousClass18.ACy(this.A01);
            return;
        }
        FY fy = this.A00;
        c1070Yn2 = fy.A04;
        fy.A06 = PC.A01(c1070Yn2, this.A02, 0, new C1184bG(this));
    }
}
