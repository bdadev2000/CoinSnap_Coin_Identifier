package I2;

import G7.j;
import M0.C0218i;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.C0513x;
import androidx.lifecycle.EnumC0504n;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.adview.AppLovinFullscreenAdViewObserver;
import com.applovin.impl.C0765v;
import com.applovin.impl.b5;
import com.applovin.impl.bc;
import com.applovin.impl.ob;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.sdk.AppLovinAd;
import com.facebook.internal.H;
import com.facebook.r;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.vungle.ads.internal.downloader.n;
import com.vungle.ads.internal.downloader.p;
import com.vungle.ads.internal.executor.l;
import com.vungle.ads.internal.load.m;
import com.vungle.ads.internal.util.x;
import i3.C2344c;
import java.io.File;
import java.util.HashSet;
import java.util.Map;
import java.util.logging.Logger;
import k.AbstractActivityC2417f;
import k3.i;
import l3.InterfaceC2443h;
import org.json.JSONObject;
import p3.C2542a;
import r1.DialogC2656a;
import r3.C2666i;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1443c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1444d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1445f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1446g;

    public /* synthetic */ f(b5 b5Var, com.applovin.impl.adview.a aVar, Activity activity, String str) {
        this.b = 1;
        this.f1444d = b5Var;
        this.f1445f = aVar;
        this.f1446g = activity;
        this.f1443c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f1444d;
        Object obj2 = this.f1446g;
        Object obj3 = this.f1445f;
        Object obj4 = this.f1443c;
        switch (this.b) {
            case 0:
                JSONObject jSONObject = (JSONObject) obj;
                String str = (String) obj4;
                h hVar = (h) obj2;
                String str2 = (String) obj3;
                if (!O2.a.b(h.class)) {
                    try {
                        j.e(jSONObject, "$viewData");
                        j.e(str, "$buttonText");
                        j.e(hVar, "this$0");
                        j.e(str2, "$pathID");
                        try {
                            String l = H.l(r.a());
                            if (l != null) {
                                String lowerCase = l.toLowerCase();
                                j.d(lowerCase, "(this as java.lang.String).toLowerCase()");
                                float[] c9 = a.c(lowerCase, jSONObject);
                                String e4 = a.e(str, hVar.f1452f, lowerCase);
                                if (c9 != null) {
                                    F2.g gVar = F2.g.f1140a;
                                    String[] f9 = F2.g.f(F2.c.f1128c, new float[][]{c9}, new String[]{e4});
                                    if (f9 != null) {
                                        String str3 = f9[0];
                                        b.a(str2, str3);
                                        if (!j.a(str3, "other")) {
                                            HashSet hashSet = h.f1449g;
                                            a.j(str3, str, c9);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        } catch (Exception unused) {
                            return;
                        }
                    } catch (Throwable th) {
                        O2.a.a(h.class, th);
                        return;
                    }
                }
                return;
            case 1:
                b5.a((b5) obj, (com.applovin.impl.adview.a) obj3, (Activity) obj2, (String) obj4);
                return;
            case 2:
                bc.b((AppLovinAdViewEventListener) obj, (AppLovinAd) obj4, (AppLovinAdView) obj3, (AppLovinAdViewDisplayErrorCode) obj2);
                return;
            case 3:
                ((ob) obj).a((ViewGroup) obj4, (Context) obj3, (AppLovinFullscreenAdViewObserver) obj2);
                return;
            case 4:
                ((o) obj).d((o.b) obj4, obj3, (Map) obj2);
                return;
            case 5:
                ImageViewUtils.a((k) obj, (String) obj4, (ImageView) obj3, (Uri) obj2);
                return;
            case 6:
                C0765v.a((C0765v) obj, (C0765v.b) obj2, (String) obj4, (String) obj3);
                return;
            case 7:
                com.vungle.ads.internal.load.e.a((File) obj, (com.vungle.ads.internal.load.e) obj4, (n) obj3, (com.vungle.ads.internal.load.j) obj2);
                return;
            case 8:
                com.vungle.ads.internal.load.o.a((m) obj, (x) obj4, (p) obj3, (l) obj2);
                return;
            case 9:
                m1.g gVar2 = (m1.g) obj;
                gVar2.getClass();
                Context context = (Context) obj4;
                F2.h hVar2 = (F2.h) obj3;
                if (((C0513x) ((AbstractActivityC2417f) context).getLifecycle()).f4904d.a(EnumC0504n.f4895g)) {
                    if (gVar2.f21736i && hVar2 != null) {
                        hVar2.N();
                        new Handler().postDelayed(new com.facebook.appevents.k(gVar2, context), 1500L);
                    }
                    ((InterstitialAd) obj2).show((Activity) context);
                    return;
                }
                DialogC2656a dialogC2656a = gVar2.f21731d;
                if (dialogC2656a != null && dialogC2656a.isShowing() && !((Activity) context).isDestroyed()) {
                    gVar2.f21731d.dismiss();
                }
                hVar2.H(new AdError(0, "Show fail in background after show loading ad", "LuanDT"));
                return;
            default:
                k3.j jVar = (k3.j) obj4;
                h3.g gVar3 = (h3.g) obj3;
                i iVar = (i) obj2;
                C2542a c2542a = (C2542a) obj;
                c2542a.getClass();
                Logger logger = C2542a.f22207f;
                try {
                    InterfaceC2443h a6 = c2542a.f22209c.a(jVar.f21433a);
                    if (a6 == null) {
                        String str4 = "Transport backend '" + jVar.f21433a + "' is not registered";
                        logger.warning(str4);
                        gVar3.b(new IllegalArgumentException(str4));
                    } else {
                        ((C2666i) c2542a.f22211e).j(new C0218i(c2542a, jVar, ((C2344c) a6).a(iVar), 6));
                        gVar3.b(null);
                    }
                    return;
                } catch (Exception e9) {
                    logger.warning("Error scheduling event " + e9.getMessage());
                    gVar3.b(e9);
                    return;
                }
        }
    }

    public /* synthetic */ f(C0765v c0765v, C0765v.b bVar, String str, String str2) {
        this.b = 6;
        this.f1444d = c0765v;
        this.f1446g = bVar;
        this.f1443c = str;
        this.f1445f = str2;
    }

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4, int i9) {
        this.b = i9;
        this.f1444d = obj;
        this.f1443c = obj2;
        this.f1445f = obj3;
        this.f1446g = obj4;
    }

    public /* synthetic */ f(JSONObject jSONObject, String str, h hVar, String str2) {
        this.b = 0;
        this.f1444d = jSONObject;
        this.f1443c = str;
        this.f1446g = hVar;
        this.f1445f = str2;
    }
}
