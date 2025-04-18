package com.vungle.ads;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a0 extends com.vungle.ads.internal.v {
    private final c0 adSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Context context, c0 adSize) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        this.adSize = adSize;
    }

    @Override // com.vungle.ads.internal.v
    public void adLoadedAndUpdateConfigure$vungle_ads_release(bh.z advertisement) {
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        super.adLoadedAndUpdateConfigure$vungle_ads_release(advertisement);
        advertisement.setAdSize(this.adSize);
    }

    @Override // com.vungle.ads.internal.v
    public String getAdSizeForAdRequest() {
        return this.adSize.getSizeName();
    }

    public final boolean isBannerAdSize$vungle_ads_release(String adSize) {
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        if (!Intrinsics.areEqual(adSize, c0.BANNER.getSizeName()) && !Intrinsics.areEqual(adSize, c0.BANNER_LEADERBOARD.getSizeName()) && !Intrinsics.areEqual(adSize, c0.BANNER_SHORT.getSizeName()) && !Intrinsics.areEqual(adSize, c0.VUNGLE_MREC.getSizeName())) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r10, com.vungle.ads.c0.VUNGLE_MREC.getSizeName()) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r10, com.vungle.ads.c0.VUNGLE_MREC.getSizeName()) != false) goto L24;
     */
    @Override // com.vungle.ads.internal.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isValidAdSize(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = "adSize"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            boolean r0 = r9.isBannerAdSize$vungle_ads_release(r10)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L2b
            bh.o3 r3 = r9.getPlacement()
            if (r3 == 0) goto L1b
            boolean r3 = r3.isMREC()
            if (r3 != r1) goto L1b
            r3 = r1
            goto L1c
        L1b:
            r3 = r2
        L1c:
            if (r3 == 0) goto L2b
            com.vungle.ads.c0 r3 = com.vungle.ads.c0.VUNGLE_MREC
            java.lang.String r3 = r3.getSizeName()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r3)
            if (r3 != 0) goto L2b
            goto L49
        L2b:
            if (r0 == 0) goto L4a
            bh.o3 r3 = r9.getPlacement()
            if (r3 == 0) goto L3a
            boolean r3 = r3.isBannerNonMREC()
            if (r3 != r1) goto L3a
            goto L3b
        L3a:
            r1 = r2
        L3b:
            if (r1 == 0) goto L4a
            com.vungle.ads.c0 r1 = com.vungle.ads.c0.VUNGLE_MREC
            java.lang.String r1 = r1.getSizeName()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r1)
            if (r1 == 0) goto L4a
        L49:
            r0 = r2
        L4a:
            if (r0 != 0) goto L78
            com.vungle.ads.s r1 = com.vungle.ads.s.INSTANCE
            r2 = 500(0x1f4, float:7.0E-43)
            java.lang.String r3 = "Invalidate size "
            java.lang.String r4 = " for banner ad"
            java.lang.String r3 = com.applovin.impl.mediation.ads.e.f(r3, r10, r4)
            bh.o3 r10 = r9.getPlacement()
            r4 = 0
            if (r10 == 0) goto L64
            java.lang.String r10 = r10.getReferenceId()
            goto L65
        L64:
            r10 = r4
        L65:
            r5 = 0
            bh.z r6 = r9.getAdvertisement()
            if (r6 == 0) goto L70
            java.lang.String r4 = r6.eventId()
        L70:
            r6 = r4
            r7 = 8
            r8 = 0
            r4 = r10
            com.vungle.ads.s.logError$vungle_ads_release$default(r1, r2, r3, r4, r5, r6, r7, r8)
        L78:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.a0.isValidAdSize(java.lang.String):boolean");
    }

    @Override // com.vungle.ads.internal.v
    public boolean isValidAdTypeForPlacement(bh.o3 placement) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        return placement.isBanner();
    }

    public final com.vungle.ads.internal.presenter.d wrapCallback$vungle_ads_release(com.vungle.ads.internal.presenter.c adPlayCallback) {
        Intrinsics.checkNotNullParameter(adPlayCallback, "adPlayCallback");
        return new z(adPlayCallback, this);
    }
}
