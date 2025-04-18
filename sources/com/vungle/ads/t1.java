package com.vungle.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t1 extends o0 {
    public static final int BOTTOM_LEFT = 2;
    public static final int BOTTOM_RIGHT = 3;
    public static final l1 Companion = new l1(null);
    public static final int TOP_LEFT = 0;
    public static final int TOP_RIGHT = 1;
    private hh.g adContentView;
    private ImageView adIconView;
    private int adOptionsPosition;
    private y1 adOptionsView;
    private final n1 adPlayCallback;
    private FrameLayout adRootView;
    private Collection<? extends View> clickableViews;
    private final Lazy executors$delegate;
    private final Lazy imageLoader$delegate;
    private final Lazy impressionTracker$delegate;
    private Map<String, String> nativeAdAssetMap;
    private com.vungle.ads.internal.presenter.y presenter;

    private t1(Context context, String str, d dVar) {
        super(context, str, dVar);
        this.imageLoader$delegate = LazyKt.lazy(new p1(this));
        ServiceLocator$Companion serviceLocator$Companion = e3.Companion;
        this.executors$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new s1(context));
        this.impressionTracker$delegate = LazyKt.lazy(new q1(context));
        this.adOptionsPosition = 1;
        this.adOptionsView = new y1(context);
        this.adPlayCallback = new n1(this, str);
    }

    public static /* synthetic */ void c(t1 t1Var, View view) {
        m121registerViewForInteraction$lambda5(t1Var, view);
    }

    private final void displayImage(String str, ImageView imageView) {
        getImageLoader().displayImage(str, new o1(imageView));
    }

    public static /* synthetic */ void getAdOptionsPosition$annotations() {
    }

    public final com.vungle.ads.internal.executor.a getExecutors() {
        return (com.vungle.ads.internal.executor.a) this.executors$delegate.getValue();
    }

    private final com.vungle.ads.internal.util.r getImageLoader() {
        return (com.vungle.ads.internal.util.r) this.imageLoader$delegate.getValue();
    }

    private final com.vungle.ads.internal.l0 getImpressionTracker() {
        return (com.vungle.ads.internal.l0) this.impressionTracker$delegate.getValue();
    }

    private final String getMainImagePath() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(v1.TOKEN_MAIN_IMAGE)) == null) ? "" : str;
    }

    /* renamed from: registerViewForInteraction$lambda-1 */
    private static final com.vungle.ads.internal.platform.d m118registerViewForInteraction$lambda1(Lazy<? extends com.vungle.ads.internal.platform.d> lazy) {
        return lazy.getValue();
    }

    /* renamed from: registerViewForInteraction$lambda-2 */
    public static final void m119registerViewForInteraction$lambda2(t1 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.vungle.ads.internal.presenter.y yVar = this$0.presenter;
        if (yVar != null) {
            yVar.processCommand("openPrivacy", this$0.getPrivacyUrl$vungle_ads_release());
        }
    }

    /* renamed from: registerViewForInteraction$lambda-4$lambda-3 */
    public static final void m120registerViewForInteraction$lambda4$lambda3(t1 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.vungle.ads.internal.presenter.y yVar = this$0.presenter;
        if (yVar != null) {
            yVar.processCommand(com.vungle.ads.internal.presenter.y.DOWNLOAD, this$0.getCtaUrl$vungle_ads_release());
        }
    }

    /* renamed from: registerViewForInteraction$lambda-5 */
    public static final void m121registerViewForInteraction$lambda5(t1 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.vungle.ads.internal.presenter.y yVar = this$0.presenter;
        if (yVar != null) {
            com.vungle.ads.internal.presenter.y.processCommand$default(yVar, "videoViewed", null, 2, null);
        }
        com.vungle.ads.internal.presenter.y yVar2 = this$0.presenter;
        if (yVar2 != null) {
            yVar2.processCommand("tpat", "checkpoint.0");
        }
        com.vungle.ads.internal.presenter.y yVar3 = this$0.presenter;
        if (yVar3 != null) {
            yVar3.onImpression();
        }
    }

    public final String getAdBodyText() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(v1.TOKEN_APP_DESCRIPTION)) == null) ? "" : str;
    }

    public final String getAdCallToActionText() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(v1.TOKEN_CTA_BUTTON_TEXT)) == null) ? "" : str;
    }

    public final int getAdOptionsPosition() {
        return this.adOptionsPosition;
    }

    public final String getAdSponsoredText() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(v1.TOKEN_SPONSORED_BY)) == null) ? "" : str;
    }

    public final Double getAdStarRating() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map == null || (str = map.get(v1.TOKEN_APP_RATING_VALUE)) == null) {
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
        return (map == null || (str = map.get(v1.TOKEN_APP_NAME)) == null) ? "" : str;
    }

    public final String getAppIcon() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(v1.TOKEN_APP_ICON)) == null) ? "" : str;
    }

    public final String getCtaUrl$vungle_ads_release() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(v1.TOKEN_CTA_BUTTON_URL)) == null) ? "" : str;
    }

    public final String getPrivacyIconUrl$vungle_ads_release() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(v1.TOKEN_VUNGLE_PRIVACY_ICON_URL)) == null) ? "" : str;
    }

    public final String getPrivacyUrl$vungle_ads_release() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(v1.TOKEN_VUNGLE_PRIVACY_URL)) == null) ? "" : str;
    }

    public final boolean hasCallToAction() {
        return getCtaUrl$vungle_ads_release().length() > 0;
    }

    @Override // com.vungle.ads.o0
    public void onAdLoaded$vungle_ads_release(bh.z advertisement) {
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        super.onAdLoaded$vungle_ads_release(advertisement);
        this.nativeAdAssetMap = advertisement.getMRAIDArgsInMap();
    }

    public final void performCTA() {
        com.vungle.ads.internal.presenter.y yVar = this.presenter;
        if (yVar != null) {
            yVar.processCommand(com.vungle.ads.internal.presenter.y.DOWNLOAD, getCtaUrl$vungle_ads_release());
        }
    }

    public final void registerViewForInteraction(FrameLayout rootView, hh.g mediaView, ImageView imageView, Collection<? extends View> collection) {
        String str;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        s sVar = s.INSTANCE;
        sVar.logMetric$vungle_ads_release(new f3(com.vungle.ads.internal.protos.n.PLAY_AD_API), (r13 & 2) != 0 ? null : getPlacementId(), (r13 & 4) != 0 ? null : getCreativeId(), (r13 & 8) != 0 ? null : getEventId(), (r13 & 16) != 0 ? null : null);
        final int i10 = 1;
        n3 canPlayAd = getAdInternal().canPlayAd(true);
        if (canPlayAd != null) {
            if (getAdInternal().isErrorTerminal$vungle_ads_release(canPlayAd.getCode())) {
                getAdInternal().setAdState(com.vungle.ads.internal.g.ERROR);
                Map<String, String> map = this.nativeAdAssetMap;
                if (map != null) {
                    map.clear();
                }
            }
            p0 adListener = getAdListener();
            if (adListener != null) {
                adListener.onAdFailedToPlay(this, canPlayAd);
                return;
            }
            return;
        }
        getResponseToShowMetric$vungle_ads_release().markEnd();
        s.logMetric$vungle_ads_release$default(sVar, getResponseToShowMetric$vungle_ads_release(), getPlacementId(), getCreativeId(), getEventId(), (String) null, 16, (Object) null);
        getShowToDisplayMetric$vungle_ads_release().markStart();
        this.adRootView = rootView;
        this.adContentView = mediaView;
        this.adIconView = imageView;
        this.clickableViews = collection;
        ServiceLocator$Companion serviceLocator$Companion = e3.Companion;
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new r1(getContext()));
        Context context = getContext();
        com.vungle.ads.internal.load.a adInternal = getAdInternal();
        Intrinsics.checkNotNull(adInternal, "null cannot be cast to non-null type com.vungle.ads.internal.presenter.NativePresenterDelegate");
        this.presenter = new com.vungle.ads.internal.presenter.y(context, (com.vungle.ads.internal.presenter.z) adInternal, getAdInternal().getAdvertisement(), ((com.vungle.ads.internal.executor.f) getExecutors()).getJobExecutor(), m118registerViewForInteraction$lambda1(lazy));
        Map<String, String> map2 = this.nativeAdAssetMap;
        if (map2 == null || (str = map2.get(v1.TOKEN_OM_SDK_DATA)) == null) {
            str = "";
        }
        com.vungle.ads.internal.presenter.y yVar = this.presenter;
        if (yVar != null) {
            yVar.initOMTracker(str);
        }
        com.vungle.ads.internal.presenter.y yVar2 = this.presenter;
        if (yVar2 != null) {
            yVar2.startTracking(rootView);
        }
        com.vungle.ads.internal.presenter.y yVar3 = this.presenter;
        if (yVar3 != null) {
            yVar3.setEventListener(new com.vungle.ads.internal.presenter.b(this.adPlayCallback, getAdInternal().getPlacement()));
        }
        final int i11 = 0;
        this.adOptionsView.setOnClickListener(new View.OnClickListener(this) { // from class: com.vungle.ads.k1

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ t1 f16764c;

            {
                this.f16764c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = i11;
                t1 t1Var = this.f16764c;
                switch (i12) {
                    case 0:
                        t1.m119registerViewForInteraction$lambda2(t1Var, view);
                        return;
                    default:
                        t1.m120registerViewForInteraction$lambda4$lambda3(t1Var, view);
                        return;
                }
            }
        });
        if (collection == null) {
            collection = CollectionsKt.listOf(mediaView);
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setOnClickListener(new View.OnClickListener(this) { // from class: com.vungle.ads.k1

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ t1 f16764c;

                {
                    this.f16764c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i12 = i10;
                    t1 t1Var = this.f16764c;
                    switch (i12) {
                        case 0:
                            t1.m119registerViewForInteraction$lambda2(t1Var, view);
                            return;
                        default:
                            t1.m120registerViewForInteraction$lambda4$lambda3(t1Var, view);
                            return;
                    }
                }
            });
        }
        this.adOptionsView.renderTo(rootView, this.adOptionsPosition);
        getImpressionTracker().addView(rootView, new gb.d(this, 12));
        displayImage(getMainImagePath(), mediaView.getMainImage$vungle_ads_release());
        displayImage(getAppIcon(), imageView);
        displayImage(getPrivacyIconUrl$vungle_ads_release(), this.adOptionsView.getPrivacyIcon$vungle_ads_release());
        String watermark$vungle_ads_release = getAdConfig().getWatermark$vungle_ads_release();
        if (watermark$vungle_ads_release != null) {
            Context context2 = rootView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "rootView.context");
            com.vungle.ads.internal.ui.q qVar = new com.vungle.ads.internal.ui.q(context2, watermark$vungle_ads_release);
            rootView.addView(qVar);
            qVar.bringToFront();
        }
        com.vungle.ads.internal.presenter.y yVar4 = this.presenter;
        if (yVar4 != null) {
            yVar4.prepare();
        }
    }

    public final void setAdOptionsPosition(int i10) {
        this.adOptionsPosition = i10;
    }

    public final void unregisterView() {
        if (getAdInternal().getAdState() == com.vungle.ads.internal.g.FINISHED) {
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
        hh.g gVar = this.adContentView;
        if (gVar != null) {
            gVar.destroy();
        }
        this.adOptionsView.destroy();
        com.vungle.ads.internal.presenter.y yVar = this.presenter;
        if (yVar != null) {
            yVar.detach();
        }
    }

    @Override // com.vungle.ads.o0
    public v1 constructAdInternal$vungle_ads_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new v1(context);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t1(Context context, String placementId) {
        this(context, placementId, new d());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
    }
}
