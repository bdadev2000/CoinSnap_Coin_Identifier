package c3;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.Display;
import androidx.emoji2.text.n;
import androidx.lifecycle.l0;
import androidx.lifecycle.o;
import com.ads.control.admob.AppOpenManager;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: m, reason: collision with root package name */
    public static j f2565m;

    /* renamed from: b, reason: collision with root package name */
    public Handler f2566b;

    /* renamed from: c, reason: collision with root package name */
    public g f2567c;

    /* renamed from: d, reason: collision with root package name */
    public i3.a f2568d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2569e;

    /* renamed from: j, reason: collision with root package name */
    public Context f2574j;

    /* renamed from: k, reason: collision with root package name */
    public InterstitialAd f2575k;

    /* renamed from: l, reason: collision with root package name */
    public String f2576l;
    public int a = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2570f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2571g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2572h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2573i = false;

    public static AdSize a(Activity activity, Boolean bool, String str) {
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i10 = (int) (displayMetrics.widthPixels / displayMetrics.density);
        if (bool.booleanValue()) {
            if (str.equalsIgnoreCase("BANNER_INLINE_LARGE_STYLE")) {
                return AdSize.getCurrentOrientationInlineAdaptiveBannerAdSize(activity, i10);
            }
            return AdSize.getInlineAdaptiveBannerAdSize(i10, 50);
        }
        return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(activity, i10);
    }

    public static j b() {
        if (f2565m == null) {
            j jVar = new j();
            f2565m = jVar;
            jVar.f2571g = false;
        }
        return f2565m;
    }

    public final void c(Context context, String str, jb.g gVar) {
        if (!g3.c.a().f18018m && context.getSharedPreferences("setting_admob.pref", 0).getInt(str, 0) < 100) {
            InterstitialAd.load(context, str, new AdRequest.Builder().build(), new c(this, gVar, context));
        } else {
            gVar.t(null);
        }
    }

    public final void d(Context context, String str, jb.g gVar) {
        if (g3.c.a().f18018m) {
            return;
        }
        new AdLoader.Builder(context, str).forNativeAd(new androidx.fragment.app.f(this, gVar, context, str)).withAdListener(new f(this, gVar, context, str)).withNativeAdOptions(new NativeAdOptions.Builder().setVideoOptions(new VideoOptions.Builder().setStartMuted(true).build()).build()).build().loadAd(new AdRequest.Builder().build());
    }

    public final void e(h.m mVar, jb.g gVar) {
        g gVar2;
        this.f2571g = true;
        InterstitialAd interstitialAd = this.f2575k;
        if (interstitialAd == null) {
            gVar.w();
            return;
        }
        interstitialAd.setOnPaidEventListener(new androidx.core.app.h(this, 3));
        Handler handler = this.f2566b;
        if (handler != null && (gVar2 = this.f2567c) != null) {
            handler.removeCallbacks(gVar2);
        }
        this.f2575k.setFullScreenContentCallback(new i(this, gVar));
        if (l0.f1793k.f1799h.f1835d.a(o.RESUMED)) {
            try {
                i3.a aVar = this.f2568d;
                if (aVar != null && aVar.isShowing()) {
                    this.f2568d.dismiss();
                }
                i3.a aVar2 = new i3.a(mVar, 0);
                this.f2568d = aVar2;
                try {
                    aVar2.show();
                    AppOpenManager.f().f2915l = true;
                } catch (Exception unused) {
                    gVar.w();
                    return;
                }
            } catch (Exception e2) {
                this.f2568d = null;
                e2.printStackTrace();
            }
            new Handler().postDelayed(new n(5, this, mVar, gVar), 800L);
            return;
        }
        this.f2571g = false;
    }
}
