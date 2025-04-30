package n1;

import F2.h;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.nativead.NativeAd;
import o1.C2493b;

/* renamed from: n1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2472c extends h {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f21824c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21825d;

    public C2472c(h hVar, int i9) {
        this.f21824c = hVar;
        this.f21825d = i9;
    }

    @Override // F2.h
    public final void E() {
        this.f21824c.E();
    }

    @Override // F2.h
    public final void G(LoadAdError loadAdError) {
        this.f21824c.G(loadAdError);
    }

    @Override // F2.h
    public final void H(AdError adError) {
        this.f21824c.H(adError);
    }

    @Override // F2.h
    public final void O(NativeAd nativeAd) {
        this.f21824c.M(new C2493b(this.f21825d, nativeAd));
    }
}
