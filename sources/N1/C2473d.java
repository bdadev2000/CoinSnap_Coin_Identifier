package n1;

import F2.h;
import android.app.Activity;
import android.widget.FrameLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.nativead.NativeAd;
import o1.C2493b;

/* renamed from: n1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2473d extends h {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f21826c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21827d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Activity f21828e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f21829f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ShimmerFrameLayout f21830g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C2475f f21831h;

    public C2473d(C2475f c2475f, h hVar, int i9, Activity activity, FrameLayout frameLayout, ShimmerFrameLayout shimmerFrameLayout) {
        this.f21831h = c2475f;
        this.f21826c = hVar;
        this.f21827d = i9;
        this.f21828e = activity;
        this.f21829f = frameLayout;
        this.f21830g = shimmerFrameLayout;
    }

    @Override // F2.h
    public final void E() {
        this.f21826c.E();
    }

    @Override // F2.h
    public final void G(LoadAdError loadAdError) {
        this.f21826c.G(loadAdError);
    }

    @Override // F2.h
    public final void H(AdError adError) {
        this.f21826c.H(adError);
    }

    @Override // F2.h
    public final void I() {
        this.f21826c.I();
    }

    @Override // F2.h
    public final void O(NativeAd nativeAd) {
        int i9 = this.f21827d;
        this.f21826c.M(new C2493b(i9, nativeAd));
        C2493b c2493b = new C2493b(i9, nativeAd);
        this.f21831h.getClass();
        C2475f.u(this.f21828e, c2493b, this.f21829f, this.f21830g);
    }
}
