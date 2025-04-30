package e3;

import android.content.Context;
import android.util.Log;
import android.widget.RelativeLayout;
import c3.InterfaceC0604b;
import com.facebook.internal.C1838g;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.vungle.ads.C;
import com.vungle.ads.C2073d;
import com.vungle.ads.C2076e0;
import com.vungle.ads.C2149y;
import com.vungle.mediation.VungleInterstitialAdapter;
import n1.C2475f;

/* renamed from: e3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2220d implements InterfaceC0604b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20082a;
    public final /* synthetic */ Context b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f20083c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f20084d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f20085e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f20086f;

    public /* synthetic */ C2220d(Object obj, Context context, String str, C2073d c2073d, Object obj2, int i9) {
        this.f20082a = i9;
        this.f20086f = obj;
        this.b = context;
        this.f20083c = str;
        this.f20084d = c2073d;
        this.f20085e = obj2;
    }

    @Override // c3.InterfaceC0604b
    public final void a(AdError adError) {
        MediationBannerListener mediationBannerListener;
        MediationBannerListener mediationBannerListener2;
        switch (this.f20082a) {
            case 0:
                Log.w(VungleMediationAdapter.TAG, adError.toString());
                ((e) this.f20086f).b.onFailure(adError);
                return;
            case 1:
                ((MediationInterstitialListener) this.f20085e).onAdFailedToLoad((VungleInterstitialAdapter) this.f20086f, adError);
                Log.w(VungleMediationAdapter.TAG, adError.toString());
                return;
            default:
                Log.w(VungleMediationAdapter.TAG, adError.toString());
                VungleInterstitialAdapter vungleInterstitialAdapter = (VungleInterstitialAdapter) this.f20086f;
                mediationBannerListener = vungleInterstitialAdapter.mediationBannerListener;
                if (mediationBannerListener != null) {
                    mediationBannerListener2 = vungleInterstitialAdapter.mediationBannerListener;
                    mediationBannerListener2.onAdFailedToLoad(vungleInterstitialAdapter, adError);
                    return;
                }
                return;
        }
    }

    @Override // c3.InterfaceC0604b
    public final void b() {
        C2076e0 c2076e0;
        C2076e0 c2076e02;
        RelativeLayout relativeLayout;
        C2149y c2149y;
        C2149y c2149y2;
        switch (this.f20082a) {
            case 0:
                e eVar = (e) this.f20086f;
                eVar.f20089f.getClass();
                Context context = this.b;
                G7.j.e(context, "context");
                String str = this.f20083c;
                G7.j.e(str, "placementId");
                C2076e0 c2076e03 = new C2076e0(context, str, (C2073d) this.f20084d);
                eVar.f20088d = c2076e03;
                c2076e03.setAdListener(eVar);
                eVar.f20088d.load((String) this.f20085e);
                return;
            case 1:
                C2076e0 c2076e04 = new C2076e0(this.b, this.f20083c, (C2073d) this.f20084d);
                VungleInterstitialAdapter vungleInterstitialAdapter = (VungleInterstitialAdapter) this.f20086f;
                vungleInterstitialAdapter.interstitialAd = c2076e04;
                c2076e0 = vungleInterstitialAdapter.interstitialAd;
                c2076e0.setAdListener(new C2475f(vungleInterstitialAdapter, 29));
                c2076e02 = vungleInterstitialAdapter.interstitialAd;
                c2076e02.load(null);
                return;
            default:
                Context context2 = this.b;
                RelativeLayout relativeLayout2 = new RelativeLayout(context2);
                VungleInterstitialAdapter vungleInterstitialAdapter2 = (VungleInterstitialAdapter) this.f20086f;
                vungleInterstitialAdapter2.bannerLayout = relativeLayout2;
                AdSize adSize = (AdSize) this.f20085e;
                int heightInPixels = adSize.getHeightInPixels(context2);
                C c9 = (C) this.f20084d;
                if (heightInPixels <= 0) {
                    heightInPixels = Math.round(c9.getHeight() * context2.getResources().getDisplayMetrics().density);
                }
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(adSize.getWidthInPixels(context2), heightInPixels);
                relativeLayout = vungleInterstitialAdapter2.bannerLayout;
                relativeLayout.setLayoutParams(layoutParams);
                vungleInterstitialAdapter2.bannerAd = new C2149y(context2, this.f20083c, c9);
                c2149y = vungleInterstitialAdapter2.bannerAd;
                c2149y.setAdListener(new C1838g(vungleInterstitialAdapter2));
                c2149y2 = vungleInterstitialAdapter2.bannerAd;
                c2149y2.load(null);
                return;
        }
    }

    public C2220d(VungleInterstitialAdapter vungleInterstitialAdapter, Context context, AdSize adSize, C c9, String str) {
        this.f20082a = 2;
        this.f20086f = vungleInterstitialAdapter;
        this.b = context;
        this.f20085e = adSize;
        this.f20084d = c9;
        this.f20083c = str;
    }
}
