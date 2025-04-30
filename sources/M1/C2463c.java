package m1;

import android.util.Log;
import android.widget.FrameLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import w4.v0;

/* renamed from: m1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2463c extends AdListener {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ShimmerFrameLayout f21711c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f21712d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ F2.h f21713f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AdView f21714g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f21715h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g f21716i;

    public C2463c(g gVar, ShimmerFrameLayout shimmerFrameLayout, FrameLayout frameLayout, AdView adView, String str) {
        this.b = 0;
        this.f21716i = gVar;
        this.f21711c = shimmerFrameLayout;
        this.f21712d = frameLayout;
        this.f21713f = null;
        this.f21714g = adView;
        this.f21715h = str;
    }

    @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        switch (this.b) {
            case 0:
                super.onAdClicked();
                g gVar = this.f21716i;
                if (gVar.f21733f) {
                    k.f().f21749j = true;
                }
                F2.h hVar = this.f21713f;
                if (hVar != null) {
                    hVar.E();
                    Log.d("MiaStudio", "onAdClicked");
                }
                v0.s(gVar.f21737j, this.f21715h);
                return;
            default:
                super.onAdClicked();
                g gVar2 = this.f21716i;
                if (gVar2.f21733f) {
                    k.f().f21749j = true;
                }
                v0.s(gVar2.f21737j, this.f21715h);
                F2.h hVar2 = this.f21713f;
                if (hVar2 != null) {
                    hVar2.E();
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        switch (this.b) {
            case 0:
                ShimmerFrameLayout shimmerFrameLayout = this.f21711c;
                shimmerFrameLayout.b();
                this.f21712d.setVisibility(8);
                shimmerFrameLayout.setVisibility(8);
                F2.h hVar = this.f21713f;
                if (hVar != null) {
                    hVar.G(loadAdError);
                    return;
                }
                return;
            default:
                super.onAdFailedToLoad(loadAdError);
                ShimmerFrameLayout shimmerFrameLayout2 = this.f21711c;
                shimmerFrameLayout2.b();
                this.f21712d.setVisibility(8);
                shimmerFrameLayout2.setVisibility(8);
                F2.h hVar2 = this.f21713f;
                if (hVar2 != null) {
                    hVar2.G(loadAdError);
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdImpression() {
        switch (this.b) {
            case 0:
                super.onAdImpression();
                F2.h hVar = this.f21713f;
                if (hVar != null) {
                    hVar.I();
                    return;
                }
                return;
            default:
                super.onAdImpression();
                return;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        switch (this.b) {
            case 0:
                StringBuilder sb = new StringBuilder("Banner adapter class name: ");
                AdView adView = this.f21714g;
                sb.append(adView.getResponseInfo().getMediationAdapterClassName());
                Log.d("MiaStudio", sb.toString());
                ShimmerFrameLayout shimmerFrameLayout = this.f21711c;
                shimmerFrameLayout.b();
                shimmerFrameLayout.setVisibility(8);
                this.f21712d.setVisibility(0);
                if (adView != null) {
                    adView.setOnPaidEventListener(new F2.e(9, this, adView));
                }
                F2.h hVar = this.f21713f;
                if (hVar != null) {
                    hVar.getClass();
                    return;
                }
                return;
            default:
                StringBuilder sb2 = new StringBuilder("Banner adapter class name: ");
                AdView adView2 = this.f21714g;
                sb2.append(adView2.getResponseInfo().getMediationAdapterClassName());
                Log.d("MiaStudio", sb2.toString());
                ShimmerFrameLayout shimmerFrameLayout2 = this.f21711c;
                shimmerFrameLayout2.b();
                shimmerFrameLayout2.setVisibility(8);
                this.f21712d.setVisibility(0);
                adView2.setOnPaidEventListener(new F2.e(10, this, adView2));
                F2.h hVar2 = this.f21713f;
                if (hVar2 != null) {
                    hVar2.getClass();
                    return;
                }
                return;
        }
    }

    public C2463c(g gVar, ShimmerFrameLayout shimmerFrameLayout, FrameLayout frameLayout, F2.h hVar, AdView adView, String str) {
        this.b = 1;
        this.f21716i = gVar;
        this.f21711c = shimmerFrameLayout;
        this.f21712d = frameLayout;
        this.f21713f = hVar;
        this.f21714g = adView;
        this.f21715h = str;
    }
}
