package m1;

import android.content.Context;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import k.AbstractActivityC2417f;

/* loaded from: classes.dex */
public final class e implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f21720c = true;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f21721d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ F2.h f21722f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g f21723g;

    public /* synthetic */ e(g gVar, Context context, W6.c cVar, int i9) {
        this.b = i9;
        this.f21723g = gVar;
        this.f21721d = context;
        this.f21722f = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                g gVar = this.f21723g;
                if (gVar.f21738k != null) {
                    boolean z8 = this.f21720c;
                    F2.h hVar = this.f21722f;
                    if (z8) {
                        gVar.e((AbstractActivityC2417f) this.f21721d, hVar);
                        return;
                    } else {
                        hVar.getClass();
                        return;
                    }
                }
                gVar.f21735h = true;
                return;
            default:
                g gVar2 = this.f21723g;
                gVar2.f21732e = true;
                InterstitialAd interstitialAd = gVar2.f21738k;
                F2.h hVar2 = this.f21722f;
                if (interstitialAd != null) {
                    if (this.f21720c) {
                        gVar2.e((AbstractActivityC2417f) this.f21721d, hVar2);
                        return;
                    } else {
                        hVar2.getClass();
                        return;
                    }
                }
                if (hVar2 != null) {
                    hVar2.N();
                    gVar2.f21734g = false;
                    return;
                }
                return;
        }
    }
}
