package com.vungle.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import c7.C0665z;
import java.util.concurrent.atomic.AtomicBoolean;
import t7.AbstractC2712a;
import t7.EnumC2718g;
import t7.InterfaceC2717f;

/* loaded from: classes3.dex */
public final class K extends RelativeLayout {
    public static final E Companion = new E(null);
    private static final String TAG = "BannerView";
    private i7.f adWidget;
    private final C0665z advertisement;
    private int calculatedPixelHeight;
    private int calculatedPixelWidth;
    private final AtomicBoolean destroyed;
    private com.vungle.ads.internal.ui.q imageView;
    private final InterfaceC2717f impressionTracker$delegate;
    private boolean isOnImpressionCalled;
    private final c7.p1 placement;
    private com.vungle.ads.internal.presenter.q presenter;
    private final AtomicBoolean presenterStarted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(Context context, c7.p1 p1Var, C0665z c0665z, C c9, C2073d c2073d, com.vungle.ads.internal.presenter.c cVar, c7.I i9) throws InstantiationException {
        super(context);
        G7.j.e(context, "context");
        G7.j.e(p1Var, "placement");
        G7.j.e(c0665z, "advertisement");
        G7.j.e(c9, "adSize");
        G7.j.e(c2073d, "adConfig");
        G7.j.e(cVar, "adPlayCallback");
        this.placement = p1Var;
        this.advertisement = c0665z;
        boolean z8 = false;
        this.destroyed = new AtomicBoolean(false);
        this.presenterStarted = new AtomicBoolean(false);
        this.impressionTracker$delegate = AbstractC2712a.d(new G(context));
        com.vungle.ads.internal.util.G g9 = com.vungle.ads.internal.util.G.INSTANCE;
        this.calculatedPixelHeight = g9.dpToPixels(context, c9.getHeight());
        this.calculatedPixelWidth = g9.dpToPixels(context, c9.getWidth());
        F f9 = new F(cVar, p1Var);
        try {
            i7.f fVar = new i7.f(context);
            this.adWidget = fVar;
            fVar.setCloseDelegate(new D(this));
            ServiceLocator$Companion serviceLocator$Companion = f1.Companion;
            EnumC2718g enumC2718g = EnumC2718g.b;
            InterfaceC2717f c10 = AbstractC2712a.c(enumC2718g, new H(context));
            e7.f m6_init_$lambda3 = m6_init_$lambda3(AbstractC2712a.c(enumC2718g, new I(context)));
            if (com.vungle.ads.internal.F.INSTANCE.omEnabled() && c0665z.omEnabled()) {
                z8 = true;
            }
            e7.g make = m6_init_$lambda3.make(z8);
            com.vungle.ads.internal.ui.p pVar = new com.vungle.ads.internal.ui.p(c0665z, p1Var, ((com.vungle.ads.internal.executor.f) m5_init_$lambda2(c10)).getOffloadExecutor(), null, 8, null);
            InterfaceC2717f c11 = AbstractC2712a.c(enumC2718g, new J(context));
            pVar.setWebViewObserver(make);
            com.vungle.ads.internal.presenter.q qVar = new com.vungle.ads.internal.presenter.q(fVar, c0665z, p1Var, pVar, ((com.vungle.ads.internal.executor.f) m5_init_$lambda2(c10)).getJobExecutor(), make, i9, m7_init_$lambda4(c11));
            qVar.setEventListener(f9);
            this.presenter = qVar;
            String watermark$vungle_ads_release = c2073d.getWatermark$vungle_ads_release();
            if (watermark$vungle_ads_release != null) {
                this.imageView = new com.vungle.ads.internal.ui.q(context, watermark$vungle_ads_release);
            }
        } catch (InstantiationException e4) {
            C2069b c2069b = new C2069b();
            c2069b.setPlacementId$vungle_ads_release(this.placement.getReferenceId());
            c2069b.setEventId$vungle_ads_release(this.advertisement.eventId());
            c2069b.setCreativeId$vungle_ads_release(this.advertisement.getCreativeId());
            f9.onError(c2069b.logError$vungle_ads_release(), this.placement.getReferenceId());
            throw e4;
        }
    }

    /* renamed from: _init_$lambda-2 */
    private static final com.vungle.ads.internal.executor.a m5_init_$lambda2(InterfaceC2717f interfaceC2717f) {
        return (com.vungle.ads.internal.executor.a) interfaceC2717f.getValue();
    }

    /* renamed from: _init_$lambda-3 */
    private static final e7.f m6_init_$lambda3(InterfaceC2717f interfaceC2717f) {
        return (e7.f) interfaceC2717f.getValue();
    }

    /* renamed from: _init_$lambda-4 */
    private static final com.vungle.ads.internal.platform.d m7_init_$lambda4(InterfaceC2717f interfaceC2717f) {
        return (com.vungle.ads.internal.platform.d) interfaceC2717f.getValue();
    }

    public static /* synthetic */ void a(K k6, View view) {
        m8onAttachedToWindow$lambda0(k6, view);
    }

    private final void checkHardwareAcceleration() {
        com.vungle.ads.internal.util.v.Companion.w(TAG, "hardwareAccelerated = " + isHardwareAccelerated());
        if (!isHardwareAccelerated()) {
            C2137s.INSTANCE.logMetric$vungle_ads_release(com.vungle.ads.internal.protos.n.HARDWARE_ACCELERATE_DISABLED, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : this.placement.getReferenceId(), (r15 & 8) != 0 ? null : this.advertisement.getCreativeId(), (r15 & 16) != 0 ? null : this.advertisement.eventId(), (r15 & 32) == 0 ? null : null);
        }
    }

    private final com.vungle.ads.internal.L getImpressionTracker() {
        return (com.vungle.ads.internal.L) this.impressionTracker$delegate.getValue();
    }

    /* renamed from: onAttachedToWindow$lambda-0 */
    public static final void m8onAttachedToWindow$lambda0(K k6, View view) {
        G7.j.e(k6, "this$0");
        com.vungle.ads.internal.util.v.Companion.d(TAG, "ImpressionTracker checked the banner view become visible.");
        boolean z8 = true;
        k6.isOnImpressionCalled = true;
        k6.checkHardwareAcceleration();
        if (k6.getVisibility() != 0) {
            z8 = false;
        }
        k6.setAdVisibility(z8);
    }

    private final void renderAd() {
        ViewParent viewParent;
        if (getVisibility() != 0) {
            return;
        }
        i7.f fVar = this.adWidget;
        if (fVar != null) {
            if (fVar != null) {
                viewParent = fVar.getParent();
            } else {
                viewParent = null;
            }
            if (!G7.j.a(viewParent, this)) {
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

    private final void setAdVisibility(boolean z8) {
        com.vungle.ads.internal.presenter.q qVar;
        if (this.isOnImpressionCalled && !this.destroyed.get() && (qVar = this.presenter) != null) {
            qVar.setAdVisibility(z8);
        }
    }

    public final void finishAdInternal(boolean z8) {
        int i9;
        if (this.destroyed.get()) {
            return;
        }
        this.destroyed.set(true);
        if (z8) {
            i9 = 4;
        } else {
            i9 = 0;
        }
        int i10 = i9 | 2;
        com.vungle.ads.internal.presenter.q qVar = this.presenter;
        if (qVar != null) {
            qVar.stop();
        }
        com.vungle.ads.internal.presenter.q qVar2 = this.presenter;
        if (qVar2 != null) {
            qVar2.detach(i10);
        }
        getImpressionTracker().destroy();
        try {
            removeAllViews();
        } catch (Exception e4) {
            com.vungle.ads.internal.util.v.Companion.d(TAG, "Removing webView error: " + e4);
        }
    }

    public final C0665z getAdvertisement() {
        return this.advertisement;
    }

    public final c7.p1 getPlacement() {
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
            getImpressionTracker().addView(this, new F2.d(this, 13));
        }
        renderAd();
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i9) {
        boolean z8;
        super.onWindowVisibilityChanged(i9);
        if (i9 == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        setAdVisibility(z8);
    }
}
