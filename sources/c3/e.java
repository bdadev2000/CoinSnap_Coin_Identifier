package c3;

import android.util.Log;
import android.widget.FrameLayout;
import com.ads.control.admob.AppOpenManager;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;

/* loaded from: classes.dex */
public final class e extends AdListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2543b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ShimmerFrameLayout f2544c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f2545d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jb.g f2546f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AdView f2547g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f2548h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j f2549i;

    public /* synthetic */ e(j jVar, ShimmerFrameLayout shimmerFrameLayout, FrameLayout frameLayout, jb.g gVar, AdView adView, String str, int i10) {
        this.f2543b = i10;
        this.f2549i = jVar;
        this.f2544c = shimmerFrameLayout;
        this.f2545d = frameLayout;
        this.f2546f = gVar;
        this.f2547g = adView;
        this.f2548h = str;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        int i10 = this.f2543b;
        String str = this.f2548h;
        jb.g gVar = this.f2546f;
        j jVar = this.f2549i;
        switch (i10) {
            case 0:
                super.onAdClicked();
                if (jVar.f2570f) {
                    AppOpenManager.f().f2916m = true;
                }
                if (gVar != null) {
                    gVar.o();
                    Log.d("ITGStudio", "onAdClicked");
                }
                d6.g.t(jVar.f2574j, str);
                return;
            default:
                super.onAdClicked();
                if (jVar.f2570f) {
                    AppOpenManager.f().f2916m = true;
                }
                d6.g.t(jVar.f2574j, str);
                if (gVar != null) {
                    gVar.o();
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        int i10 = this.f2543b;
        jb.g gVar = this.f2546f;
        FrameLayout frameLayout = this.f2545d;
        ShimmerFrameLayout shimmerFrameLayout = this.f2544c;
        switch (i10) {
            case 0:
                shimmerFrameLayout.b();
                frameLayout.setVisibility(8);
                shimmerFrameLayout.setVisibility(8);
                if (gVar != null) {
                    gVar.q(loadAdError);
                    return;
                }
                return;
            default:
                super.onAdFailedToLoad(loadAdError);
                shimmerFrameLayout.b();
                frameLayout.setVisibility(8);
                shimmerFrameLayout.setVisibility(8);
                if (gVar != null) {
                    gVar.q(loadAdError);
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        switch (this.f2543b) {
            case 0:
                super.onAdImpression();
                jb.g gVar = this.f2546f;
                if (gVar != null) {
                    gVar.s();
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
        int i10 = this.f2543b;
        FrameLayout frameLayout = this.f2545d;
        ShimmerFrameLayout shimmerFrameLayout = this.f2544c;
        AdView adView = this.f2547g;
        switch (i10) {
            case 0:
                Log.d("ITGStudio", "Banner adapter class name: " + adView.getResponseInfo().getMediationAdapterClassName());
                shimmerFrameLayout.b();
                shimmerFrameLayout.setVisibility(8);
                frameLayout.setVisibility(0);
                adView.setOnPaidEventListener(new androidx.fragment.app.e(2, this, adView));
                return;
            default:
                Log.d("ITGStudio", "Banner adapter class name: " + adView.getResponseInfo().getMediationAdapterClassName());
                shimmerFrameLayout.b();
                shimmerFrameLayout.setVisibility(8);
                frameLayout.setVisibility(0);
                adView.setOnPaidEventListener(new androidx.fragment.app.e(3, this, adView));
                return;
        }
    }
}
