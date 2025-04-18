package d3;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.nativead.NativeAd;

/* loaded from: classes.dex */
public final class d extends jb.g {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ jb.g f16801h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f16802i;

    public d(hf.b bVar, int i10) {
        this.f16801h = bVar;
        this.f16802i = i10;
    }

    @Override // jb.g
    public final void o() {
        this.f16801h.o();
    }

    @Override // jb.g
    public final void q(LoadAdError loadAdError) {
        this.f16801h.q(loadAdError);
    }

    @Override // jb.g
    public final void r(AdError adError) {
        this.f16801h.r(adError);
    }

    @Override // jb.g
    public final void x(NativeAd nativeAd) {
        this.f16801h.v(new e3.b(this.f16802i, nativeAd));
    }
}
