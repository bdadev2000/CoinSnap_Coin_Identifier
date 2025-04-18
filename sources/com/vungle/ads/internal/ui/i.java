package com.vungle.ads.internal.ui;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import bh.i0;
import bh.o3;
import bh.x3;
import bh.z;
import com.vungle.ads.ServiceLocator$Companion;
import com.vungle.ads.e3;
import com.vungle.ads.internal.f0;
import com.vungle.ads.internal.presenter.a0;
import com.vungle.ads.internal.util.v;
import com.vungle.ads.t0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import n0.w2;

/* loaded from: classes4.dex */
public abstract class i extends Activity {
    public static final a Companion = new a(null);
    public static final String REQUEST_KEY_EVENT_ID_EXTRA = "request_eventId";
    public static final String REQUEST_KEY_EXTRA = "request";
    private static final String TAG = "AdActivity";
    private static z advertisement;
    private static i0 bidPayload;
    private static com.vungle.ads.internal.presenter.b eventListener;
    private static a0 presenterDelegate;
    private hh.f mraidAdWidget;
    private com.vungle.ads.internal.presenter.q mraidPresenter;
    private String placementRefId = "";
    private x3 unclosedAd;

    public static /* synthetic */ void getMraidAdWidget$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getMraidPresenter$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getPlacementRefId$vungle_ads_release$annotations() {
    }

    private final void hideSystemUi() {
        w2 w2Var = new w2(getWindow(), getWindow().getDecorView());
        Intrinsics.checkNotNullExpressionValue(w2Var, "getInsetsController(window, window.decorView)");
        ka.e eVar = w2Var.a;
        eVar.u();
        eVar.m();
    }

    private final void onConcurrentPlaybackError(String str) {
        String str2;
        t0 t0Var = new t0();
        com.vungle.ads.internal.presenter.b bVar = eventListener;
        if (bVar != null) {
            bVar.onError(t0Var, str);
        }
        t0Var.setPlacementId(this.placementRefId);
        z zVar = advertisement;
        String str3 = null;
        if (zVar != null) {
            str2 = zVar.getCreativeId();
        } else {
            str2 = null;
        }
        t0Var.setCreativeId(str2);
        z zVar2 = advertisement;
        if (zVar2 != null) {
            str3 = zVar2.eventId();
        }
        t0Var.setEventId(str3);
        t0Var.logErrorNoReturnValue$vungle_ads_release();
        v.Companion.e(TAG, "onConcurrentPlaybackError: " + t0Var.getLocalizedMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-2, reason: not valid java name */
    public static final com.vungle.ads.internal.signals.j m62onCreate$lambda2(Lazy<com.vungle.ads.internal.signals.j> lazy) {
        return lazy.getValue();
    }

    /* renamed from: onCreate$lambda-6, reason: not valid java name */
    private static final com.vungle.ads.internal.executor.a m63onCreate$lambda6(Lazy<? extends com.vungle.ads.internal.executor.a> lazy) {
        return lazy.getValue();
    }

    /* renamed from: onCreate$lambda-7, reason: not valid java name */
    private static final dh.f m64onCreate$lambda7(Lazy<dh.f> lazy) {
        return lazy.getValue();
    }

    /* renamed from: onCreate$lambda-8, reason: not valid java name */
    private static final com.vungle.ads.internal.platform.d m65onCreate$lambda8(Lazy<? extends com.vungle.ads.internal.platform.d> lazy) {
        return lazy.getValue();
    }

    public boolean canRotate$vungle_ads_release() {
        return false;
    }

    public final hh.f getMraidAdWidget$vungle_ads_release() {
        return this.mraidAdWidget;
    }

    public final com.vungle.ads.internal.presenter.q getMraidPresenter$vungle_ads_release() {
        return this.mraidPresenter;
    }

    public final String getPlacementRefId$vungle_ads_release() {
        return this.placementRefId;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        com.vungle.ads.internal.presenter.q qVar = this.mraidPresenter;
        if (qVar != null) {
            qVar.handleExit();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int i10 = newConfig.orientation;
        if (i10 == 2) {
            v.Companion.d(TAG, "landscape");
        } else if (i10 == 1) {
            v.Companion.d(TAG, "portrait");
        }
        com.vungle.ads.internal.presenter.q qVar = this.mraidPresenter;
        if (qVar != null) {
            qVar.onViewConfigurationChanged();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v7, types: [kotlin.jvm.internal.DefaultConstructorMarker, java.lang.String] */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        String watermark$vungle_ads_release;
        super.onCreate(bundle);
        boolean z10 = true;
        requestWindowFeature(1);
        getWindow().setFlags(16777216, 16777216);
        a aVar = Companion;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        String valueOf = String.valueOf(a.access$getPlacement(aVar, intent));
        this.placementRefId = valueOf;
        z zVar = advertisement;
        f0 f0Var = f0.INSTANCE;
        o3 placement = f0Var.getPlacement(valueOf);
        if (placement != null && zVar != null) {
            getWindow().getDecorView().setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            String str2 = 0;
            x3 x3Var = null;
            try {
                hh.f fVar = new hh.f(this);
                ServiceLocator$Companion serviceLocator$Companion = e3.Companion;
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
                Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new b(this));
                Intent intent2 = getIntent();
                Intrinsics.checkNotNullExpressionValue(intent2, "intent");
                String access$getEventId = a.access$getEventId(aVar, intent2);
                if (access$getEventId != null) {
                    x3Var = new x3(access$getEventId, (String) str2, 2, (DefaultConstructorMarker) str2);
                }
                this.unclosedAd = x3Var;
                if (x3Var != null) {
                    m62onCreate$lambda2(lazy).recordUnclosedAd(x3Var);
                }
                fVar.setCloseDelegate(new f(this, lazy));
                fVar.setOnViewTouchListener(new g(this));
                fVar.setOrientationDelegate(new h(this));
                Lazy lazy2 = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new c(this));
                p pVar = new p(zVar, placement, ((com.vungle.ads.internal.executor.f) m63onCreate$lambda6(lazy2)).getOffloadExecutor(), m62onCreate$lambda2(lazy));
                dh.f m64onCreate$lambda7 = m64onCreate$lambda7(LazyKt.lazy(lazyThreadSafetyMode, (Function0) new d(this)));
                if (!f0Var.omEnabled() || !zVar.omEnabled()) {
                    z10 = false;
                }
                dh.g make = m64onCreate$lambda7.make(z10);
                com.vungle.ads.internal.executor.l jobExecutor = ((com.vungle.ads.internal.executor.f) m63onCreate$lambda6(lazy2)).getJobExecutor();
                Lazy lazy3 = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new e(this));
                pVar.setWebViewObserver(make);
                com.vungle.ads.internal.presenter.q qVar = new com.vungle.ads.internal.presenter.q(fVar, zVar, placement, pVar, jobExecutor, make, bidPayload, m65onCreate$lambda8(lazy3));
                qVar.setEventListener(eventListener);
                qVar.setPresenterDelegate$vungle_ads_release(presenterDelegate);
                qVar.prepare();
                setContentView(fVar, fVar.getLayoutParams());
                com.vungle.ads.d adConfig = zVar.getAdConfig();
                if (adConfig != null && (watermark$vungle_ads_release = adConfig.getWatermark$vungle_ads_release()) != null) {
                    q qVar2 = new q(this, watermark$vungle_ads_release);
                    ((FrameLayout) getWindow().getDecorView().findViewById(R.id.content)).addView(qVar2);
                    qVar2.bringToFront();
                }
                this.mraidAdWidget = fVar;
                this.mraidPresenter = qVar;
                return;
            } catch (InstantiationException unused) {
                com.vungle.ads.internal.presenter.b bVar = eventListener;
                if (bVar != null) {
                    com.vungle.ads.b bVar2 = new com.vungle.ads.b();
                    bVar2.setPlacementId$vungle_ads_release(this.placementRefId);
                    z zVar2 = advertisement;
                    if (zVar2 != null) {
                        str = zVar2.eventId();
                    } else {
                        str = null;
                    }
                    bVar2.setEventId$vungle_ads_release(str);
                    z zVar3 = advertisement;
                    if (zVar3 != null) {
                        str2 = zVar3.getCreativeId();
                    }
                    bVar2.setCreativeId$vungle_ads_release(str2);
                    bVar.onError(bVar2.logError$vungle_ads_release(), this.placementRefId);
                }
                finish();
                return;
            }
        }
        com.vungle.ads.internal.presenter.b bVar3 = eventListener;
        if (bVar3 != null) {
            bVar3.onError(new com.vungle.ads.i(), this.placementRefId);
        }
        finish();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        com.vungle.ads.internal.presenter.q qVar = this.mraidPresenter;
        if (qVar != null) {
            qVar.detach((isChangingConfigurations() ? 1 : 0) | 2);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        a aVar = Companion;
        Intent intent2 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent2, "getIntent()");
        String access$getPlacement = a.access$getPlacement(aVar, intent2);
        String access$getPlacement2 = a.access$getPlacement(aVar, intent);
        Intent intent3 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent3, "getIntent()");
        String access$getEventId = a.access$getEventId(aVar, intent3);
        String access$getEventId2 = a.access$getEventId(aVar, intent);
        if ((access$getPlacement != null && access$getPlacement2 != null && !Intrinsics.areEqual(access$getPlacement, access$getPlacement2)) || (access$getEventId != null && access$getEventId2 != null && !Intrinsics.areEqual(access$getEventId, access$getEventId2))) {
            v.Companion.d(TAG, eb.j.l("Tried to play another placement ", access$getPlacement2, " while playing ", access$getPlacement));
            onConcurrentPlaybackError(access$getPlacement2);
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        com.vungle.ads.internal.presenter.q qVar = this.mraidPresenter;
        if (qVar != null) {
            qVar.stop();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        hideSystemUi();
        com.vungle.ads.internal.presenter.q qVar = this.mraidPresenter;
        if (qVar != null) {
            qVar.start();
        }
    }

    public final void setMraidAdWidget$vungle_ads_release(hh.f fVar) {
        this.mraidAdWidget = fVar;
    }

    public final void setMraidPresenter$vungle_ads_release(com.vungle.ads.internal.presenter.q qVar) {
        this.mraidPresenter = qVar;
    }

    public final void setPlacementRefId$vungle_ads_release(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.placementRefId = str;
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i10) {
        if (canRotate$vungle_ads_release()) {
            super.setRequestedOrientation(i10);
        }
    }
}
