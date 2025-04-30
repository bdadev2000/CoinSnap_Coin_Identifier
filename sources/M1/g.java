package m1;

import U4.RunnableC0311g;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.Display;
import androidx.lifecycle.EnumC0504n;
import androidx.lifecycle.I;
import com.applovin.impl.T2;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import k.AbstractActivityC2417f;
import p1.C2538b;
import r1.DialogC2656a;

/* loaded from: classes.dex */
public final class g {
    public static g m;

    /* renamed from: a, reason: collision with root package name */
    public int f21729a;
    public Handler b;

    /* renamed from: c, reason: collision with root package name */
    public e f21730c;

    /* renamed from: d, reason: collision with root package name */
    public DialogC2656a f21731d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21732e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21733f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f21734g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f21735h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f21736i;

    /* renamed from: j, reason: collision with root package name */
    public Context f21737j;

    /* renamed from: k, reason: collision with root package name */
    public InterstitialAd f21738k;
    public String l;

    public static AdSize a(Activity activity, String str) {
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(activity, (int) (displayMetrics.widthPixels / displayMetrics.density));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, m1.g] */
    public static g b() {
        if (m == null) {
            ?? obj = new Object();
            obj.f21729a = 0;
            obj.f21733f = false;
            obj.f21735h = false;
            obj.f21736i = false;
            m = obj;
            obj.f21734g = false;
        }
        return m;
    }

    public final void c(Context context, String str, F2.h hVar) {
        if (!C2538b.a().m && context.getSharedPreferences("setting_admob.pref", 0).getInt(str, 0) < 100) {
            InterstitialAd.load(context, str, new AdRequest.Builder().build(), new C2461a(this, hVar, context));
        } else {
            hVar.K(null);
        }
    }

    public final void d(Context context, String str, F2.h hVar) {
        if (C2538b.a().m) {
            return;
        }
        new AdLoader.Builder(context, str).forNativeAd(new T2(this, hVar, context, str)).withAdListener(new C2464d(this, hVar, context, str)).withNativeAdOptions(new NativeAdOptions.Builder().setVideoOptions(new VideoOptions.Builder().setStartMuted(true).build()).build()).build().loadAd(new AdRequest.Builder().build());
    }

    public final void e(AbstractActivityC2417f abstractActivityC2417f, F2.h hVar) {
        e eVar;
        this.f21734g = true;
        InterstitialAd interstitialAd = this.f21738k;
        if (interstitialAd == null) {
            hVar.N();
            return;
        }
        interstitialAd.setOnPaidEventListener(new F2.d(this, 18));
        Handler handler = this.b;
        if (handler != null && (eVar = this.f21730c) != null) {
            handler.removeCallbacks(eVar);
        }
        this.f21738k.setFullScreenContentCallback(new com.google.ads.mediation.d(this, hVar));
        if (I.f4828k.f4833h.f4904d.compareTo(EnumC0504n.f4895g) >= 0) {
            try {
                DialogC2656a dialogC2656a = this.f21731d;
                if (dialogC2656a != null && dialogC2656a.isShowing()) {
                    this.f21731d.dismiss();
                }
                DialogC2656a dialogC2656a2 = new DialogC2656a(abstractActivityC2417f);
                this.f21731d = dialogC2656a2;
                try {
                    dialogC2656a2.show();
                    k.f().f21748i = true;
                } catch (Exception unused) {
                    hVar.N();
                    return;
                }
            } catch (Exception e4) {
                this.f21731d = null;
                e4.printStackTrace();
            }
            new Handler().postDelayed(new RunnableC0311g(this, abstractActivityC2417f, hVar, 23), 800L);
            return;
        }
        this.f21734g = false;
    }
}
