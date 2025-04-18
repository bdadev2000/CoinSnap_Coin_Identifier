package c3;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;

/* loaded from: classes.dex */
public final class h extends jb.g {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f2559h = true;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Context f2560i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ jb.g f2561j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ j f2562k;

    public h(j jVar, Context context, wg.a aVar) {
        this.f2562k = jVar;
        this.f2560i = context;
        this.f2561j = aVar;
    }

    @Override // jb.g
    public final void q(LoadAdError loadAdError) {
        jb.g gVar;
        g gVar2;
        j jVar = this.f2562k;
        if (!jVar.f2569e && (gVar = this.f2561j) != null) {
            gVar.w();
            Handler handler = jVar.f2566b;
            if (handler != null && (gVar2 = jVar.f2567c) != null) {
                handler.removeCallbacks(gVar2);
            }
            gVar.q(loadAdError);
        }
    }

    @Override // jb.g
    public final void r(AdError adError) {
        jb.g gVar = this.f2561j;
        if (gVar != null) {
            gVar.r(adError);
            gVar.w();
        }
    }

    @Override // jb.g
    public final void t(InterstitialAd interstitialAd) {
        j jVar = this.f2562k;
        if (!jVar.f2569e && interstitialAd != null) {
            jVar.f2575k = interstitialAd;
            if (jVar.f2572h) {
                boolean z10 = this.f2559h;
                jb.g gVar = this.f2561j;
                if (z10) {
                    jVar.e((h.m) this.f2560i, gVar);
                } else {
                    gVar.getClass();
                }
            }
        }
    }
}
