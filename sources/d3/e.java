package d3;

import android.app.Activity;
import android.widget.FrameLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.nativead.NativeAd;

/* loaded from: classes.dex */
public final class e extends jb.g {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ jb.g f16803h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f16804i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Activity f16805j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f16806k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ShimmerFrameLayout f16807l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f16808m;

    public e(g gVar, hf.a aVar, int i10, Activity activity, FrameLayout frameLayout, ShimmerFrameLayout shimmerFrameLayout) {
        this.f16808m = gVar;
        this.f16803h = aVar;
        this.f16804i = i10;
        this.f16805j = activity;
        this.f16806k = frameLayout;
        this.f16807l = shimmerFrameLayout;
    }

    @Override // jb.g
    public final void o() {
        this.f16803h.o();
    }

    @Override // jb.g
    public final void q(LoadAdError loadAdError) {
        this.f16803h.q(loadAdError);
    }

    @Override // jb.g
    public final void r(AdError adError) {
        this.f16803h.r(adError);
    }

    @Override // jb.g
    public final void s() {
        this.f16803h.s();
    }

    @Override // jb.g
    public final void x(NativeAd nativeAd) {
        int i10 = this.f16804i;
        this.f16803h.v(new e3.b(i10, nativeAd));
        e3.b bVar = new e3.b(i10, nativeAd);
        this.f16808m.getClass();
        g.C(this.f16805j, bVar, this.f16806k, this.f16807l);
    }
}
