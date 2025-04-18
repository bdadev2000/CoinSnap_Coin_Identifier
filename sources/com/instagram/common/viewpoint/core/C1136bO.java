package com.instagram.common.viewpoint.core;

import com.facebook.ads.Ad;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAdListener;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.bO, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1136bO implements InterfaceC03427f {
    public int A00 = -1;
    public long A01 = -1;
    public AdExperienceType A02;
    public RewardData A03;
    public RewardedVideoAdListener A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public Ad A09;
    public WeakReference<Ad> A0A;
    public final C1045Zs A0B;
    public final InterfaceC03608d A0C;
    public final String A0D;

    public C1136bO(C1045Zs c1045Zs, String str, Ad ad, InterfaceC03608d interfaceC03608d) {
        this.A0B = c1045Zs;
        this.A0D = str;
        this.A09 = ad;
        this.A0A = new WeakReference<>(ad);
        this.A0C = interfaceC03608d;
        c1045Zs.A0M(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.InterfaceC03427f
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final RewardedVideoAdListener A6I() {
        return this.A04;
    }

    public final C1045Zs A01() {
        return this.A0B;
    }

    public final void A02(Ad ad) {
        if (ad == null && !C0608Im.A0r(this.A0B)) {
            return;
        }
        this.A09 = ad;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03427f
    public final Ad A6E() {
        return this.A09 != null ? this.A09 : this.A0A.get();
    }
}
