package com.vungle.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k0 extends RelativeLayout {
    public static final e0 Companion = new e0(null);
    private static final String TAG = "BannerView";
    private hh.f adWidget;
    private final bh.z advertisement;
    private int calculatedPixelHeight;
    private int calculatedPixelWidth;
    private final AtomicBoolean destroyed;
    private com.vungle.ads.internal.ui.q imageView;
    private final Lazy impressionTracker$delegate;
    private boolean isOnImpressionCalled;
    private final bh.o3 placement;
    private com.vungle.ads.internal.presenter.q presenter;
    private final AtomicBoolean presenterStarted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(Context context, bh.o3 placement, bh.z advertisement, c0 adSize, d adConfig, com.vungle.ads.internal.presenter.c adPlayCallback, bh.i0 i0Var) throws InstantiationException {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        Intrinsics.checkNotNullParameter(adPlayCallback, "adPlayCallback");
        this.placement = placement;
        this.advertisement = advertisement;
        boolean z10 = false;
        this.destroyed = new AtomicBoolean(false);
        this.presenterStarted = new AtomicBoolean(false);
        this.impressionTracker$delegate = LazyKt.lazy(new g0(context));
        com.vungle.ads.internal.util.g0 g0Var = com.vungle.ads.internal.util.g0.INSTANCE;
        this.calculatedPixelHeight = g0Var.dpToPixels(context, adSize.getHeight());
        this.calculatedPixelWidth = g0Var.dpToPixels(context, adSize.getWidth());
        f0 f0Var = new f0(adPlayCallback, placement);
        try {
            hh.f fVar = new hh.f(context);
            this.adWidget = fVar;
            fVar.setCloseDelegate(new d0(this));
            ServiceLocator$Companion serviceLocator$Companion = e3.Companion;
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
            Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new h0(context));
            dh.f m95_init_$lambda3 = m95_init_$lambda3(LazyKt.lazy(lazyThreadSafetyMode, (Function0) new i0(context)));
            if (com.vungle.ads.internal.f0.INSTANCE.omEnabled() && advertisement.omEnabled()) {
                z10 = true;
            }
            dh.g make = m95_init_$lambda3.make(z10);
            com.vungle.ads.internal.ui.p pVar = new com.vungle.ads.internal.ui.p(advertisement, placement, ((com.vungle.ads.internal.executor.f) m94_init_$lambda2(lazy)).getOffloadExecutor(), null, 8, null);
            Lazy lazy2 = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new j0(context));
            pVar.setWebViewObserver(make);
            com.vungle.ads.internal.presenter.q qVar = new com.vungle.ads.internal.presenter.q(fVar, advertisement, placement, pVar, ((com.vungle.ads.internal.executor.f) m94_init_$lambda2(lazy)).getJobExecutor(), make, i0Var, m96_init_$lambda4(lazy2));
            qVar.setEventListener(f0Var);
            this.presenter = qVar;
            String watermark$vungle_ads_release = adConfig.getWatermark$vungle_ads_release();
            if (watermark$vungle_ads_release != null) {
                this.imageView = new com.vungle.ads.internal.ui.q(context, watermark$vungle_ads_release);
            }
        } catch (InstantiationException e2) {
            b bVar = new b();
            bVar.setPlacementId$vungle_ads_release(this.placement.getReferenceId());
            bVar.setEventId$vungle_ads_release(this.advertisement.eventId());
            bVar.setCreativeId$vungle_ads_release(this.advertisement.getCreativeId());
            f0Var.onError(bVar.logError$vungle_ads_release(), this.placement.getReferenceId());
            throw e2;
        }
    }

    /* renamed from: _init_$lambda-2 */
    private static final com.vungle.ads.internal.executor.a m94_init_$lambda2(Lazy<? extends com.vungle.ads.internal.executor.a> lazy) {
        return lazy.getValue();
    }

    /* renamed from: _init_$lambda-3 */
    private static final dh.f m95_init_$lambda3(Lazy<dh.f> lazy) {
        return lazy.getValue();
    }

    /* renamed from: _init_$lambda-4 */
    private static final com.vungle.ads.internal.platform.d m96_init_$lambda4(Lazy<? extends com.vungle.ads.internal.platform.d> lazy) {
        return lazy.getValue();
    }

    public static /* synthetic */ void a(k0 k0Var, View view) {
        m97onAttachedToWindow$lambda0(k0Var, view);
    }

    private final void checkHardwareAcceleration() {
        com.vungle.ads.internal.util.v.Companion.w(TAG, "hardwareAccelerated = " + isHardwareAccelerated());
        if (!isHardwareAccelerated()) {
            s.INSTANCE.logMetric$vungle_ads_release(com.vungle.ads.internal.protos.n.HARDWARE_ACCELERATE_DISABLED, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : this.placement.getReferenceId(), (r15 & 8) != 0 ? null : this.advertisement.getCreativeId(), (r15 & 16) != 0 ? null : this.advertisement.eventId(), (r15 & 32) == 0 ? null : null);
        }
    }

    private final com.vungle.ads.internal.l0 getImpressionTracker() {
        return (com.vungle.ads.internal.l0) this.impressionTracker$delegate.getValue();
    }

    /* renamed from: onAttachedToWindow$lambda-0 */
    public static final void m97onAttachedToWindow$lambda0(k0 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.vungle.ads.internal.util.v.Companion.d(TAG, "ImpressionTracker checked the banner view become visible.");
        boolean z10 = true;
        this$0.isOnImpressionCalled = true;
        this$0.checkHardwareAcceleration();
        if (this$0.getVisibility() != 0) {
            z10 = false;
        }
        this$0.setAdVisibility(z10);
    }

    private final void renderAd() {
        ViewParent viewParent;
        if (getVisibility() != 0) {
            return;
        }
        hh.f fVar = this.adWidget;
        if (fVar != null) {
            if (fVar != null) {
                viewParent = fVar.getParent();
            } else {
                viewParent = null;
            }
            if (!Intrinsics.areEqual(viewParent, this)) {
                addView(this.adWidget, this.calculatedPixelWidth, this.calculatedPixelHeight);
                com.vungle.ads.internal.ui.q qVar = this.imageView;
                if (qVar != null) {
                    addView(qVar, this.calculatedPixelWidth, this.calculatedPixelHeight);
                    com.vungle.ads.internal.ui.q qVar2 = this.imageView;
                    if (qVar2 != null) {
                        qVar2.bringToFront();
                    }
                }
            }
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = this.calculatedPixelHeight;
            layoutParams.width = this.calculatedPixelWidth;
            requestLayout();
        }
    }

    private final void setAdVisibility(boolean z10) {
        com.vungle.ads.internal.presenter.q qVar;
        if (this.isOnImpressionCalled && !this.destroyed.get() && (qVar = this.presenter) != null) {
            qVar.setAdVisibility(z10);
        }
    }

    public final void finishAdInternal(boolean z10) {
        int i10;
        if (this.destroyed.get()) {
            return;
        }
        this.destroyed.set(true);
        if (z10) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        int i11 = i10 | 2;
        com.vungle.ads.internal.presenter.q qVar = this.presenter;
        if (qVar != null) {
            qVar.stop();
        }
        com.vungle.ads.internal.presenter.q qVar2 = this.presenter;
        if (qVar2 != null) {
            qVar2.detach(i11);
        }
        getImpressionTracker().destroy();
        try {
            removeAllViews();
        } catch (Exception e2) {
            com.vungle.ads.internal.util.v.Companion.d(TAG, "Removing webView error: " + e2);
        }
    }

    public final bh.z getAdvertisement() {
        return this.advertisement;
    }

    public final bh.o3 getPlacement() {
        return this.placement;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.vungle.ads.internal.util.v.Companion.d(TAG, "onAttachedToWindow()");
        if (!this.presenterStarted.getAndSet(true)) {
            com.vungle.ads.internal.presenter.q qVar = this.presenter;
            if (qVar != null) {
                qVar.prepare();
            }
            com.vungle.ads.internal.presenter.q qVar2 = this.presenter;
            if (qVar2 != null) {
                qVar2.start();
            }
            getImpressionTracker().addView(this, new gb.d(this, 11));
        }
        renderAd();
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        boolean z10;
        super.onWindowVisibilityChanged(i10);
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setAdVisibility(z10);
    }
}
