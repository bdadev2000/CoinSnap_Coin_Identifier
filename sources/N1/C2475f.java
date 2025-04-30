package n1;

import F2.h;
import J1.q;
import T1.A;
import T1.C0296b;
import T1.F;
import T1.G;
import T1.InterfaceC0295a;
import T1.u;
import T1.v;
import T7.p;
import U.t;
import W1.l;
import W1.m;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.lifecycle.EnumC0504n;
import androidx.lifecycle.I;
import androidx.lifecycle.b0;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.viewpager2.widget.ViewPager2;
import b3.C0558c;
import com.bytedance.sdk.openadsdk.api.init.BiddingTokenCallback;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.internal.play_billing.zzai;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.o;
import com.mbridge.msdk.foundation.same.net.Aa;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.out.SDKInitStatusListener;
import com.tools.arruler.photomeasure.camera.ruler.R;
import com.vungle.ads.InterfaceC2080g0;
import com.vungle.ads.P;
import com.vungle.ads.internal.signals.j;
import com.vungle.ads.o1;
import com.vungle.mediation.VungleInterstitialAdapter;
import h5.C2326g;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import m1.C2462b;
import m1.C2463c;
import m1.g;
import m1.k;
import o1.C2492a;
import o1.C2493b;
import org.json.JSONObject;
import p1.C2538b;
import q1.C2639a;
import r0.AbstractC2654b;
import r0.C2653a;
import r1.DialogC2656a;
import u4.AbstractC2762g;

/* renamed from: n1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2475f implements C0.d, t, S5.b, v, InterfaceC0295a, F, p, T7.b, m, SDKInitStatusListener, RewardItem, BiddingTokenCallback, PAGAppOpenAdInteractionListener, InterfaceC2080g0 {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C2475f f21832d;
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public Object f21833c;

    public C2475f(int i9) {
        this.b = i9;
        switch (i9) {
            case 12:
                this.f21833c = new C2326g(500L);
                return;
            default:
                this.f21833c = new int[2];
                return;
        }
    }

    public static void l(List list) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return;
        }
        o.v(it.next());
        throw null;
    }

    public static void n(h hVar, Context context, C2492a c2492a) {
        boolean z8;
        if (System.currentTimeMillis() - context.getSharedPreferences("mia_ad_pref", 0).getLong("KEY_LAST_IMPRESSION_INTERSTITIAL_TIME", 0L) < ((C2639a) p().f21833c).f22751g * 1000) {
            hVar.N();
            return;
        }
        if (c2492a != null) {
            if (c2492a.b != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (!(!z8)) {
                m1.f fVar = new m1.f(hVar, context, c2492a);
                g b = g.b();
                InterstitialAd interstitialAd = c2492a.b;
                b.f21729a = 3;
                if (context.getSharedPreferences("setting.pref", 0).getBoolean("IS_FIRST_OPEN", false)) {
                    context.getSharedPreferences("setting_admob.pref", 0).edit().putLong("KEY_FIRST_TIME", System.currentTimeMillis()).apply();
                    context.getSharedPreferences("setting.pref", 0).edit().putBoolean("IS_FIRST_OPEN", true).apply();
                } else {
                    if (System.currentTimeMillis() - context.getSharedPreferences("setting_admob.pref", 0).getLong("KEY_FIRST_TIME", System.currentTimeMillis()) >= j.TWENTY_FOUR_HOURS_MILLIS) {
                        context.getSharedPreferences("setting_admob.pref", 0).edit().clear().apply();
                        context.getSharedPreferences("setting_admob.pref", 0).edit().putLong("KEY_FIRST_TIME", System.currentTimeMillis()).apply();
                    }
                }
                if (C2538b.a().m) {
                    fVar.N();
                    return;
                }
                if (interstitialAd == null) {
                    fVar.N();
                    return;
                }
                interstitialAd.setFullScreenContentCallback(new C2462b(b, context, fVar, interstitialAd));
                if (context.getSharedPreferences("setting_admob.pref", 0).getInt(interstitialAd.getAdUnitId(), 0) < 100) {
                    int i9 = b.f21729a + 1;
                    b.f21729a = i9;
                    if (i9 >= 3) {
                        if (I.f4828k.f4833h.f4904d.compareTo(EnumC0504n.f4895g) >= 0) {
                            try {
                                DialogC2656a dialogC2656a = b.f21731d;
                                if (dialogC2656a != null && dialogC2656a.isShowing()) {
                                    b.f21731d.dismiss();
                                }
                                DialogC2656a dialogC2656a2 = new DialogC2656a(context);
                                b.f21731d = dialogC2656a2;
                                dialogC2656a2.setCancelable(false);
                                try {
                                    fVar.L();
                                    b.f21731d.show();
                                    k.f().f21748i = true;
                                } catch (Exception unused) {
                                    fVar.N();
                                    return;
                                }
                            } catch (Exception e4) {
                                b.f21731d = null;
                                e4.printStackTrace();
                            }
                            new Handler().postDelayed(new I2.f(b, context, fVar, interstitialAd, 9), 800L);
                        }
                        b.f21729a = 0;
                        return;
                    }
                    DialogC2656a dialogC2656a3 = b.f21731d;
                    if (dialogC2656a3 != null) {
                        dialogC2656a3.dismiss();
                    }
                    fVar.N();
                    return;
                }
                fVar.N();
                return;
            }
        }
        hVar.N();
    }

    public static synchronized C2475f p() {
        C2475f c2475f;
        synchronized (C2475f.class) {
            try {
                if (f21832d == null) {
                    f21832d = new C2475f(0, false);
                }
                c2475f = f21832d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2475f;
    }

    public static void q(Context context, String str, h hVar) {
        g.b().c(context, str, new C2470a(0, new D3.f(), hVar));
    }

    public static void s(Activity activity, String str, h hVar) {
        g b = g.b();
        b.getClass();
        FrameLayout frameLayout = (FrameLayout) activity.findViewById(R.id.banner_container);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) activity.findViewById(R.id.shimmer_container_banner);
        if (C2538b.a().m) {
            shimmerFrameLayout.setVisibility(8);
            return;
        }
        shimmerFrameLayout.setVisibility(0);
        com.facebook.shimmer.d dVar = shimmerFrameLayout.f13817c;
        ValueAnimator valueAnimator = dVar.f13841e;
        if (valueAnimator != null && !valueAnimator.isStarted() && dVar.getCallback() != null) {
            dVar.f13841e.start();
        }
        try {
            AdView adView = new AdView(activity);
            adView.setAdUnitId(str);
            frameLayout.addView(adView);
            AdSize a6 = g.a(activity, "");
            shimmerFrameLayout.getLayoutParams().height = (int) ((a6.getHeight() * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
            adView.setAdSize(a6);
            adView.setLayerType(1, null);
            AdRequest.Builder builder = new AdRequest.Builder();
            Bundle bundle = new Bundle();
            bundle.putString("collapsible", "bottom");
            bundle.putString("collapsible_request_id", UUID.randomUUID().toString());
            builder.addNetworkExtrasBundle(AdMobAdapter.class, bundle);
            adView.loadAd(builder.build());
            adView.setAdListener(new C2463c(b, shimmerFrameLayout, frameLayout, hVar, adView, str));
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public static void t(Activity activity, String str, int i9, h hVar) {
        g.b().d(activity, str, new C2472c(hVar, i9));
    }

    public static void u(Activity activity, C2493b c2493b, FrameLayout frameLayout, ShimmerFrameLayout shimmerFrameLayout) {
        if (c2493b.f21937c == null) {
            shimmerFrameLayout.setVisibility(8);
            return;
        }
        NativeAdView nativeAdView = (NativeAdView) LayoutInflater.from(activity).inflate(c2493b.b, (ViewGroup) null);
        shimmerFrameLayout.b();
        shimmerFrameLayout.setVisibility(8);
        frameLayout.setVisibility(0);
        g b = g.b();
        NativeAd nativeAd = c2493b.f21937c;
        b.getClass();
        nativeAdView.setMediaView((MediaView) nativeAdView.findViewById(R.id.ad_media));
        nativeAdView.setHeadlineView(nativeAdView.findViewById(R.id.ad_headline));
        nativeAdView.setBodyView(nativeAdView.findViewById(R.id.ad_body));
        nativeAdView.setCallToActionView(nativeAdView.findViewById(R.id.ad_call_to_action));
        nativeAdView.setIconView(nativeAdView.findViewById(R.id.ad_app_icon));
        nativeAdView.setPriceView(nativeAdView.findViewById(R.id.ad_price));
        nativeAdView.setStarRatingView(nativeAdView.findViewById(R.id.ad_stars));
        nativeAdView.setAdvertiserView(nativeAdView.findViewById(R.id.ad_advertiser));
        try {
            ((TextView) nativeAdView.getHeadlineView()).setText(nativeAd.getHeadline());
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        try {
            if (nativeAd.getBody() == null) {
                nativeAdView.getBodyView().setVisibility(4);
            } else {
                nativeAdView.getBodyView().setVisibility(0);
                ((TextView) nativeAdView.getBodyView()).setText(nativeAd.getBody());
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        try {
            if (nativeAd.getCallToAction() == null) {
                View callToActionView = nativeAdView.getCallToActionView();
                Objects.requireNonNull(callToActionView);
                callToActionView.setVisibility(4);
            } else {
                View callToActionView2 = nativeAdView.getCallToActionView();
                Objects.requireNonNull(callToActionView2);
                callToActionView2.setVisibility(0);
                ((TextView) nativeAdView.getCallToActionView()).setText(nativeAd.getCallToAction());
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        try {
            if (nativeAd.getIcon() == null) {
                View iconView = nativeAdView.getIconView();
                Objects.requireNonNull(iconView);
                iconView.setVisibility(8);
            } else {
                ((ImageView) nativeAdView.getIconView()).setImageDrawable(nativeAd.getIcon().getDrawable());
                nativeAdView.getIconView().setVisibility(0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        try {
            if (nativeAd.getPrice() == null) {
                View priceView = nativeAdView.getPriceView();
                Objects.requireNonNull(priceView);
                priceView.setVisibility(4);
            } else {
                View priceView2 = nativeAdView.getPriceView();
                Objects.requireNonNull(priceView2);
                priceView2.setVisibility(0);
                ((TextView) nativeAdView.getPriceView()).setText(nativeAd.getPrice());
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        try {
            if (nativeAd.getStarRating() == null) {
                View starRatingView = nativeAdView.getStarRatingView();
                Objects.requireNonNull(starRatingView);
                starRatingView.setVisibility(4);
            } else {
                View starRatingView2 = nativeAdView.getStarRatingView();
                Objects.requireNonNull(starRatingView2);
                ((RatingBar) starRatingView2).setRating(nativeAd.getStarRating().floatValue());
                nativeAdView.getStarRatingView().setVisibility(0);
            }
        } catch (Exception e13) {
            e13.printStackTrace();
        }
        try {
            if (nativeAd.getAdvertiser() == null) {
                nativeAdView.getAdvertiserView().setVisibility(4);
            } else {
                ((TextView) nativeAdView.getAdvertiserView()).setText(nativeAd.getAdvertiser());
                nativeAdView.getAdvertiserView().setVisibility(0);
            }
        } catch (Exception e14) {
            e14.printStackTrace();
        }
        nativeAdView.setNativeAd(nativeAd);
        frameLayout.removeAllViews();
        frameLayout.addView(nativeAdView);
    }

    @Override // S5.b, c6.InterfaceC0614b
    public JSONObject a(View view) {
        if (view == null) {
            return U5.b.a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        int[] iArr = (int[]) this.f21833c;
        view.getLocationOnScreen(iArr);
        return U5.b.a(iArr[0], iArr[1], width, height);
    }

    @Override // W1.m
    public int b() {
        return (e() << 8) | e();
    }

    @Override // U.t
    public boolean c(View view) {
        int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
        ViewPager2 viewPager2 = (ViewPager2) ((b1.h) this.f21833c).f5272f;
        if (viewPager2.f5181t) {
            viewPager2.b(currentItem);
        }
        return true;
    }

    @Override // S5.b
    public void d(View view, JSONObject jSONObject, S5.a aVar, boolean z8, boolean z9) {
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i9 = 0;
        if (z8) {
            HashMap hashMap = new HashMap();
            while (i9 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i9);
                ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
                i9++;
            }
            ArrayList arrayList2 = new ArrayList(hashMap.keySet());
            Collections.sort(arrayList2);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((ArrayList) hashMap.get((Float) it.next())).iterator();
                while (it2.hasNext()) {
                    ((V5.b) aVar).a((View) it2.next(), this, jSONObject, z9);
                }
            }
            return;
        }
        while (i9 < viewGroup.getChildCount()) {
            ((V5.b) aVar).a(viewGroup.getChildAt(i9), this, jSONObject, z9);
            i9++;
        }
    }

    @Override // W1.m
    public short e() {
        int read = ((InputStream) this.f21833c).read();
        if (read != -1) {
            return (short) read;
        }
        throw new l();
    }

    @Override // T1.InterfaceC0295a
    public com.bumptech.glide.load.data.e f(AssetManager assetManager, String str) {
        return new com.bumptech.glide.load.data.j(assetManager, str, 1);
    }

    @Override // C0.d
    public void g() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public int getAmount() {
        switch (this.b) {
            case 20:
                try {
                    return Integer.getInteger(((RewardInfo) this.f21833c).getRewardAmount()).intValue();
                } catch (Exception e4) {
                    Log.w(MintegralMediationAdapter.TAG, "Failed to get reward amount.", e4);
                    return 0;
                }
            default:
                return ((PAGRewardItem) this.f21833c).getRewardAmount();
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public String getType() {
        switch (this.b) {
            case 20:
                return ((RewardInfo) this.f21833c).getRewardName();
            default:
                return ((PAGRewardItem) this.f21833c).getRewardName();
        }
    }

    @Override // T7.p
    public Object getValue() {
        return ((p) this.f21833c).getValue();
    }

    @Override // T1.F
    public com.bumptech.glide.load.data.e h(Uri uri) {
        return new com.bumptech.glide.load.data.a((ContentResolver) this.f21833c, uri, 1);
    }

    @Override // T1.v
    public u i(A a6) {
        switch (this.b) {
            case 11:
                return new C0296b(0, (AssetManager) this.f21833c, this);
            case 12:
            default:
                return new G(this);
            case 13:
                return new C0296b((Resources) this.f21833c, a6.b(Uri.class, InputStream.class));
        }
    }

    @Override // W1.m
    public int j(int i9, byte[] bArr) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < i9 && (i11 = ((InputStream) this.f21833c).read(bArr, i10, i9 - i10)) != -1) {
            i10 += i11;
        }
        if (i10 == 0 && i11 == -1) {
            throw new l();
        }
        return i10;
    }

    @Override // T7.b
    public Object k(T7.c cVar, w7.f fVar) {
        return ((p) this.f21833c).k(cVar, fVar);
    }

    public String m(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            I4.d dVar = (I4.d) this.f21833c;
            I4.e eVar = new I4.e(stringWriter, dVar.f1460a, dVar.b, dVar.f1461c, dVar.f1462d);
            eVar.h(obj);
            eVar.j();
            eVar.b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    public b0 o(M7.b bVar) {
        String str;
        G7.j.e(bVar, "modelClass");
        Class cls = ((G7.e) bVar).f1329a;
        G7.j.e(cls, "jClass");
        String str2 = null;
        if (!cls.isAnonymousClass() && !cls.isLocalClass()) {
            boolean isArray = cls.isArray();
            HashMap hashMap = G7.e.f1327c;
            if (isArray) {
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = (String) hashMap.get(componentType.getName())) != null) {
                    str2 = str.concat("Array");
                }
                if (str2 == null) {
                    str2 = "kotlin.Array";
                }
            } else {
                str2 = (String) hashMap.get(cls.getName());
                if (str2 == null) {
                    str2 = cls.getCanonicalName();
                }
            }
        }
        if (str2 != null) {
            return ((l5.k) this.f21833c).h(bVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(str2));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdClicked() {
        MediationAppOpenAdCallback mediationAppOpenAdCallback = ((C0558c) this.f21833c).f5283g;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.reportAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdDismissed() {
        MediationAppOpenAdCallback mediationAppOpenAdCallback = ((C0558c) this.f21833c).f5283g;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdClosed();
        }
    }

    @Override // com.vungle.ads.InterfaceC2080g0, com.vungle.ads.InterfaceC2070b0, com.vungle.ads.Q
    public void onAdEnd(P p2) {
        VungleInterstitialAdapter vungleInterstitialAdapter = (VungleInterstitialAdapter) this.f21833c;
        if (VungleInterstitialAdapter.e(vungleInterstitialAdapter) != null) {
            VungleInterstitialAdapter.e(vungleInterstitialAdapter).onAdClosed(vungleInterstitialAdapter);
        }
    }

    @Override // com.vungle.ads.InterfaceC2080g0, com.vungle.ads.InterfaceC2070b0, com.vungle.ads.Q
    public void onAdFailedToLoad(P p2, o1 o1Var) {
        AdError adError = VungleMediationAdapter.getAdError(o1Var);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        VungleInterstitialAdapter vungleInterstitialAdapter = (VungleInterstitialAdapter) this.f21833c;
        if (VungleInterstitialAdapter.e(vungleInterstitialAdapter) != null) {
            VungleInterstitialAdapter.e(vungleInterstitialAdapter).onAdFailedToLoad(vungleInterstitialAdapter, adError);
        }
    }

    @Override // com.vungle.ads.InterfaceC2080g0, com.vungle.ads.InterfaceC2070b0, com.vungle.ads.Q
    public void onAdFailedToPlay(P p2, o1 o1Var) {
        Log.w(VungleMediationAdapter.TAG, VungleMediationAdapter.getAdError(o1Var).toString());
    }

    @Override // com.vungle.ads.InterfaceC2080g0, com.vungle.ads.InterfaceC2070b0, com.vungle.ads.Q
    public void onAdLeftApplication(P p2) {
        VungleInterstitialAdapter vungleInterstitialAdapter = (VungleInterstitialAdapter) this.f21833c;
        if (VungleInterstitialAdapter.e(vungleInterstitialAdapter) != null) {
            VungleInterstitialAdapter.e(vungleInterstitialAdapter).onAdLeftApplication(vungleInterstitialAdapter);
        }
    }

    @Override // com.vungle.ads.InterfaceC2080g0, com.vungle.ads.InterfaceC2070b0, com.vungle.ads.Q
    public void onAdLoaded(P p2) {
        VungleInterstitialAdapter vungleInterstitialAdapter = (VungleInterstitialAdapter) this.f21833c;
        if (VungleInterstitialAdapter.e(vungleInterstitialAdapter) != null) {
            VungleInterstitialAdapter.e(vungleInterstitialAdapter).onAdLoaded(vungleInterstitialAdapter);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdShowed() {
        C0558c c0558c = (C0558c) this.f21833c;
        MediationAppOpenAdCallback mediationAppOpenAdCallback = c0558c.f5283g;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdOpened();
            c0558c.f5283g.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.InterfaceC2080g0, com.vungle.ads.InterfaceC2070b0, com.vungle.ads.Q
    public void onAdStart(P p2) {
        VungleInterstitialAdapter vungleInterstitialAdapter = (VungleInterstitialAdapter) this.f21833c;
        if (VungleInterstitialAdapter.e(vungleInterstitialAdapter) != null) {
            VungleInterstitialAdapter.e(vungleInterstitialAdapter).onAdOpened(vungleInterstitialAdapter);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.BiddingTokenCallback
    public void onBiddingTokenCollected(String str) {
        ((SignalCallbacks) this.f21833c).onSuccess(str);
    }

    @Override // com.mbridge.msdk.out.SDKInitStatusListener
    public void onInitFail(String str) {
        AdError l = android.support.v4.media.session.a.l(105, str);
        ((InitializationCompleteCallback) this.f21833c).onInitializationFailed(l.getMessage());
        Log.w(MintegralMediationAdapter.TAG, l.toString());
    }

    @Override // com.mbridge.msdk.out.SDKInitStatusListener
    public void onInitSuccess() {
        try {
            Aa aa = new Aa();
            Method declaredMethod = Aa.class.getDeclaredMethod(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, String.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(aa, "Y+H6DFttYrPQYcIBiQKwJQKQYrN=");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        ((InitializationCompleteCallback) this.f21833c).onInitializationSucceeded();
    }

    public void r() {
        View view = (View) this.f21833c;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override // W1.m
    public long skip(long j7) {
        if (j7 < 0) {
            return 0L;
        }
        long j9 = j7;
        while (j9 > 0) {
            InputStream inputStream = (InputStream) this.f21833c;
            long skip = inputStream.skip(j9);
            if (skip > 0) {
                j9 -= skip;
            } else {
                if (inputStream.read() == -1) {
                    break;
                }
                j9--;
            }
        }
        return j7 - j9;
    }

    public JSONObject v() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.f21833c;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(AbstractC2762g.j(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream2 = fileInputStream;
                        AbstractC2762g.c(fileInputStream2, "Error while closing settings cache file.");
                        throw th;
                    }
                } catch (Exception e4) {
                    e = e4;
                    Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                    AbstractC2762g.c(fileInputStream, "Error while closing settings cache file.");
                    return null;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            AbstractC2762g.c(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e9) {
            e = e9;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            AbstractC2762g.c(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    public void w(ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            HashSet hashSet = new HashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                q qVar = (q) it.next();
                if (!"play_pass_subs".equals(qVar.b)) {
                    hashSet.add(qVar.b);
                }
            }
            if (hashSet.size() <= 1) {
                this.f21833c = zzai.zzj(arrayList);
                return;
            }
            throw new IllegalArgumentException("All products should be of the same product type.");
        }
        throw new IllegalArgumentException("Product list cannot be empty.");
    }

    public void x() {
        View view;
        View view2 = (View) this.f21833c;
        if (view2 == null) {
            return;
        }
        if (!view2.isInEditMode() && !view2.onCheckIsTextEditor()) {
            view = view2.getRootView().findFocus();
        } else {
            view2.requestFocus();
            view = view2;
        }
        if (view == null) {
            view = view2.getRootView().findViewById(android.R.id.content);
        }
        if (view != null && view.hasWindowFocus()) {
            view.post(new D3.b(view, 6));
        }
    }

    @Override // C0.d
    public void a(int i9, Serializable serializable) {
        String str;
        switch (i9) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i9 == 6 || i9 == 7 || i9 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f21833c).setResultCode(i9);
    }

    @Override // com.vungle.ads.InterfaceC2080g0, com.vungle.ads.InterfaceC2070b0, com.vungle.ads.Q
    public void onAdClicked(P p2) {
        VungleInterstitialAdapter vungleInterstitialAdapter = (VungleInterstitialAdapter) this.f21833c;
        if (VungleInterstitialAdapter.e(vungleInterstitialAdapter) != null) {
            VungleInterstitialAdapter.e(vungleInterstitialAdapter).onAdClicked(vungleInterstitialAdapter);
        }
    }

    public /* synthetic */ C2475f(int i9, boolean z8) {
        this.b = i9;
    }

    public /* synthetic */ C2475f(Object obj, int i9) {
        this.b = i9;
        this.f21833c = obj;
    }

    public C2475f(z4.c cVar) {
        this.b = 1;
        this.f21833c = new File((File) cVar.f24546c, "com.crashlytics.settings.json");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2475f(f0 f0Var, d0 d0Var) {
        this(f0Var, d0Var, C2653a.b);
        this.b = 23;
        G7.j.e(f0Var, "store");
    }

    public C2475f(f0 f0Var, d0 d0Var, AbstractC2654b abstractC2654b) {
        this.b = 23;
        G7.j.e(f0Var, "store");
        G7.j.e(abstractC2654b, "defaultCreationExtras");
        this.f21833c = new l5.k(f0Var, d0Var, abstractC2654b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2475f(androidx.lifecycle.g0 r3, n7.C2485c r4) {
        /*
            r2 = this;
            r0 = 23
            r2.b = r0
            java.lang.String r0 = "owner"
            G7.j.e(r3, r0)
            androidx.lifecycle.f0 r0 = r3.getViewModelStore()
            boolean r1 = r3 instanceof androidx.lifecycle.InterfaceC0499i
            if (r1 == 0) goto L18
            androidx.lifecycle.i r3 = (androidx.lifecycle.InterfaceC0499i) r3
            r0.b r3 = r3.getDefaultViewModelCreationExtras()
            goto L1a
        L18:
            r0.a r3 = r0.C2653a.b
        L1a:
            r2.<init>(r0, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.C2475f.<init>(androidx.lifecycle.g0, n7.c):void");
    }

    @Override // com.vungle.ads.InterfaceC2080g0, com.vungle.ads.InterfaceC2070b0, com.vungle.ads.Q
    public void onAdImpression(P p2) {
    }
}
