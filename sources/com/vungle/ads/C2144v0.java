package com.vungle.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c7.C0665z;
import com.vungle.ads.internal.EnumC2091g;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import t7.AbstractC2712a;
import t7.EnumC2718g;
import t7.InterfaceC2717f;

/* renamed from: com.vungle.ads.v0 */
/* loaded from: classes3.dex */
public final class C2144v0 extends P {
    public static final int BOTTOM_LEFT = 2;
    public static final int BOTTOM_RIGHT = 3;
    public static final C2129n0 Companion = new C2129n0(null);
    public static final int TOP_LEFT = 0;
    public static final int TOP_RIGHT = 1;
    private i7.g adContentView;
    private ImageView adIconView;
    private int adOptionsPosition;
    private A0 adOptionsView;
    private final C2133p0 adPlayCallback;
    private FrameLayout adRootView;
    private Collection<? extends View> clickableViews;
    private final InterfaceC2717f executors$delegate;
    private final InterfaceC2717f imageLoader$delegate;
    private final InterfaceC2717f impressionTracker$delegate;
    private Map<String, String> nativeAdAssetMap;
    private com.vungle.ads.internal.presenter.y presenter;

    private C2144v0(Context context, String str, C2073d c2073d) {
        super(context, str, c2073d);
        this.imageLoader$delegate = AbstractC2712a.d(new C2136r0(this));
        ServiceLocator$Companion serviceLocator$Companion = f1.Companion;
        this.executors$delegate = AbstractC2712a.c(EnumC2718g.b, new C2142u0(context));
        this.impressionTracker$delegate = AbstractC2712a.d(new C2138s0(context));
        this.adOptionsPosition = 1;
        this.adOptionsView = new A0(context);
        this.adPlayCallback = new C2133p0(this, str);
    }

    public static /* synthetic */ void d(C2144v0 c2144v0, View view) {
        m113registerViewForInteraction$lambda5(c2144v0, view);
    }

    private final void displayImage(String str, ImageView imageView) {
        getImageLoader().displayImage(str, new C2135q0(imageView));
    }

    public static /* synthetic */ void getAdOptionsPosition$annotations() {
    }

    public final com.vungle.ads.internal.executor.a getExecutors() {
        return (com.vungle.ads.internal.executor.a) this.executors$delegate.getValue();
    }

    private final com.vungle.ads.internal.util.r getImageLoader() {
        return (com.vungle.ads.internal.util.r) this.imageLoader$delegate.getValue();
    }

    private final com.vungle.ads.internal.L getImpressionTracker() {
        return (com.vungle.ads.internal.L) this.impressionTracker$delegate.getValue();
    }

    private final String getMainImagePath() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map == null || (str = map.get(C2148x0.TOKEN_MAIN_IMAGE)) == null) {
            return "";
        }
        return str;
    }

    /* renamed from: registerViewForInteraction$lambda-1 */
    private static final com.vungle.ads.internal.platform.d m110registerViewForInteraction$lambda1(InterfaceC2717f interfaceC2717f) {
        return (com.vungle.ads.internal.platform.d) interfaceC2717f.getValue();
    }

    /* renamed from: registerViewForInteraction$lambda-2 */
    public static final void m111registerViewForInteraction$lambda2(C2144v0 c2144v0, View view) {
        G7.j.e(c2144v0, "this$0");
        com.vungle.ads.internal.presenter.y yVar = c2144v0.presenter;
        if (yVar != null) {
            yVar.processCommand("openPrivacy", c2144v0.getPrivacyUrl$vungle_ads_release());
        }
    }

    /* renamed from: registerViewForInteraction$lambda-4$lambda-3 */
    public static final void m112registerViewForInteraction$lambda4$lambda3(C2144v0 c2144v0, View view) {
        G7.j.e(c2144v0, "this$0");
        com.vungle.ads.internal.presenter.y yVar = c2144v0.presenter;
        if (yVar != null) {
            yVar.processCommand(com.vungle.ads.internal.presenter.y.DOWNLOAD, c2144v0.getCtaUrl$vungle_ads_release());
        }
    }

    /* renamed from: registerViewForInteraction$lambda-5 */
    public static final void m113registerViewForInteraction$lambda5(C2144v0 c2144v0, View view) {
        G7.j.e(c2144v0, "this$0");
        com.vungle.ads.internal.presenter.y yVar = c2144v0.presenter;
        if (yVar != null) {
            com.vungle.ads.internal.presenter.y.processCommand$default(yVar, "videoViewed", null, 2, null);
        }
        com.vungle.ads.internal.presenter.y yVar2 = c2144v0.presenter;
        if (yVar2 != null) {
            yVar2.processCommand("tpat", "checkpoint.0");
        }
        com.vungle.ads.internal.presenter.y yVar3 = c2144v0.presenter;
        if (yVar3 != null) {
            yVar3.onImpression();
        }
    }

    public final String getAdBodyText() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map == null || (str = map.get(C2148x0.TOKEN_APP_DESCRIPTION)) == null) {
            return "";
        }
        return str;
    }

    public final String getAdCallToActionText() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map == null || (str = map.get(C2148x0.TOKEN_CTA_BUTTON_TEXT)) == null) {
            return "";
        }
        return str;
    }

    public final int getAdOptionsPosition() {
        return this.adOptionsPosition;
    }

    public final String getAdSponsoredText() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map == null || (str = map.get(C2148x0.TOKEN_SPONSORED_BY)) == null) {
            return "";
        }
        return str;
    }

    public final Double getAdStarRating() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map == null || (str = map.get(C2148x0.TOKEN_APP_RATING_VALUE)) == null) {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Double.valueOf(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final String getAdTitle() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map == null || (str = map.get(C2148x0.TOKEN_APP_NAME)) == null) {
            return "";
        }
        return str;
    }

    public final String getAppIcon() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map == null || (str = map.get(C2148x0.TOKEN_APP_ICON)) == null) {
            return "";
        }
        return str;
    }

    public final String getCtaUrl$vungle_ads_release() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map == null || (str = map.get(C2148x0.TOKEN_CTA_BUTTON_URL)) == null) {
            return "";
        }
        return str;
    }

    public final String getPrivacyIconUrl$vungle_ads_release() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map == null || (str = map.get(C2148x0.TOKEN_VUNGLE_PRIVACY_ICON_URL)) == null) {
            return "";
        }
        return str;
    }

    public final String getPrivacyUrl$vungle_ads_release() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map == null || (str = map.get(C2148x0.TOKEN_VUNGLE_PRIVACY_URL)) == null) {
            return "";
        }
        return str;
    }

    public final boolean hasCallToAction() {
        if (getCtaUrl$vungle_ads_release().length() > 0) {
            return true;
        }
        return false;
    }

    @Override // com.vungle.ads.P
    public void onAdLoaded$vungle_ads_release(C0665z c0665z) {
        G7.j.e(c0665z, "advertisement");
        super.onAdLoaded$vungle_ads_release(c0665z);
        this.nativeAdAssetMap = c0665z.getMRAIDArgsInMap();
    }

    public final void performCTA() {
        com.vungle.ads.internal.presenter.y yVar = this.presenter;
        if (yVar != null) {
            yVar.processCommand(com.vungle.ads.internal.presenter.y.DOWNLOAD, getCtaUrl$vungle_ads_release());
        }
    }

    public final void registerViewForInteraction(FrameLayout frameLayout, i7.g gVar, ImageView imageView, Collection<? extends View> collection) {
        String str;
        G7.j.e(frameLayout, "rootView");
        G7.j.e(gVar, "mediaView");
        C2137s c2137s = C2137s.INSTANCE;
        c2137s.logMetric$vungle_ads_release(new g1(com.vungle.ads.internal.protos.n.PLAY_AD_API), (r13 & 2) != 0 ? null : getPlacementId(), (r13 & 4) != 0 ? null : getCreativeId(), (r13 & 8) != 0 ? null : getEventId(), (r13 & 16) != 0 ? null : null);
        final int i9 = 1;
        o1 canPlayAd = getAdInternal().canPlayAd(true);
        if (canPlayAd != null) {
            if (getAdInternal().isErrorTerminal$vungle_ads_release(canPlayAd.getCode())) {
                getAdInternal().setAdState(EnumC2091g.ERROR);
                Map<String, String> map = this.nativeAdAssetMap;
                if (map != null) {
                    map.clear();
                }
            }
            Q adListener = getAdListener();
            if (adListener != null) {
                adListener.onAdFailedToPlay(this, canPlayAd);
                return;
            }
            return;
        }
        getResponseToShowMetric$vungle_ads_release().markEnd();
        C2137s.logMetric$vungle_ads_release$default(c2137s, getResponseToShowMetric$vungle_ads_release(), getPlacementId(), getCreativeId(), getEventId(), (String) null, 16, (Object) null);
        getShowToDisplayMetric$vungle_ads_release().markStart();
        this.adRootView = frameLayout;
        this.adContentView = gVar;
        this.adIconView = imageView;
        this.clickableViews = collection;
        ServiceLocator$Companion serviceLocator$Companion = f1.Companion;
        InterfaceC2717f c9 = AbstractC2712a.c(EnumC2718g.b, new C2140t0(getContext()));
        Context context = getContext();
        com.vungle.ads.internal.load.a adInternal = getAdInternal();
        G7.j.c(adInternal, "null cannot be cast to non-null type com.vungle.ads.internal.presenter.NativePresenterDelegate");
        this.presenter = new com.vungle.ads.internal.presenter.y(context, (com.vungle.ads.internal.presenter.z) adInternal, getAdInternal().getAdvertisement(), ((com.vungle.ads.internal.executor.f) getExecutors()).getJobExecutor(), m110registerViewForInteraction$lambda1(c9));
        Map<String, String> map2 = this.nativeAdAssetMap;
        if (map2 == null || (str = map2.get(C2148x0.TOKEN_OM_SDK_DATA)) == null) {
            str = "";
        }
        com.vungle.ads.internal.presenter.y yVar = this.presenter;
        if (yVar != null) {
            yVar.initOMTracker(str);
        }
        com.vungle.ads.internal.presenter.y yVar2 = this.presenter;
        if (yVar2 != null) {
            yVar2.startTracking(frameLayout);
        }
        com.vungle.ads.internal.presenter.y yVar3 = this.presenter;
        if (yVar3 != null) {
            yVar3.setEventListener(new com.vungle.ads.internal.presenter.b(this.adPlayCallback, getAdInternal().getPlacement()));
        }
        final int i10 = 0;
        this.adOptionsView.setOnClickListener(new View.OnClickListener(this) { // from class: com.vungle.ads.m0

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ C2144v0 f19773c;

            {
                this.f19773c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        C2144v0.m111registerViewForInteraction$lambda2(this.f19773c, view);
                        return;
                    default:
                        C2144v0.m112registerViewForInteraction$lambda4$lambda3(this.f19773c, view);
                        return;
                }
            }
        });
        if (collection == null) {
            collection = android.support.v4.media.session.a.w(gVar);
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setOnClickListener(new View.OnClickListener(this) { // from class: com.vungle.ads.m0

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ C2144v0 f19773c;

                {
                    this.f19773c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i9) {
                        case 0:
                            C2144v0.m111registerViewForInteraction$lambda2(this.f19773c, view);
                            return;
                        default:
                            C2144v0.m112registerViewForInteraction$lambda4$lambda3(this.f19773c, view);
                            return;
                    }
                }
            });
        }
        this.adOptionsView.renderTo(frameLayout, this.adOptionsPosition);
        getImpressionTracker().addView(frameLayout, new F2.d(this, 14));
        displayImage(getMainImagePath(), gVar.getMainImage$vungle_ads_release());
        displayImage(getAppIcon(), imageView);
        displayImage(getPrivacyIconUrl$vungle_ads_release(), this.adOptionsView.getPrivacyIcon$vungle_ads_release());
        String watermark$vungle_ads_release = getAdConfig().getWatermark$vungle_ads_release();
        if (watermark$vungle_ads_release != null) {
            Context context2 = frameLayout.getContext();
            G7.j.d(context2, "rootView.context");
            com.vungle.ads.internal.ui.q qVar = new com.vungle.ads.internal.ui.q(context2, watermark$vungle_ads_release);
            frameLayout.addView(qVar);
            qVar.bringToFront();
        }
        com.vungle.ads.internal.presenter.y yVar4 = this.presenter;
        if (yVar4 != null) {
            yVar4.prepare();
        }
    }

    public final void setAdOptionsPosition(int i9) {
        this.adOptionsPosition = i9;
    }

    public final void unregisterView() {
        if (getAdInternal().getAdState() == EnumC2091g.FINISHED) {
            return;
        }
        Collection<? extends View> collection = this.clickableViews;
        if (collection != null) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setOnClickListener(null);
            }
        }
        Map<String, String> map = this.nativeAdAssetMap;
        if (map != null) {
            map.clear();
        }
        getImpressionTracker().destroy();
        i7.g gVar = this.adContentView;
        if (gVar != null) {
            gVar.destroy();
        }
        this.adOptionsView.destroy();
        com.vungle.ads.internal.presenter.y yVar = this.presenter;
        if (yVar != null) {
            yVar.detach();
        }
    }

    @Override // com.vungle.ads.P
    public C2148x0 constructAdInternal$vungle_ads_release(Context context) {
        G7.j.e(context, "context");
        return new C2148x0(context);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2144v0(Context context, String str) {
        this(context, str, new C2073d());
        G7.j.e(context, "context");
        G7.j.e(str, "placementId");
    }
}
