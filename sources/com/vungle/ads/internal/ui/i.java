package com.vungle.ads.internal.ui;

import T.H0;
import T.K0;
import android.R;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowInsetsController;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import c7.C0665z;
import c7.I;
import c7.p1;
import c7.y1;
import com.vungle.ads.C2069b;
import com.vungle.ads.C2073d;
import com.vungle.ads.C2083i;
import com.vungle.ads.ServiceLocator$Companion;
import com.vungle.ads.V;
import com.vungle.ads.f1;
import com.vungle.ads.internal.F;
import com.vungle.ads.internal.presenter.A;
import com.vungle.ads.internal.util.v;
import t7.AbstractC2712a;
import t7.EnumC2718g;
import t7.InterfaceC2717f;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public abstract class i extends Activity {
    public static final a Companion = new a(null);
    public static final String REQUEST_KEY_EVENT_ID_EXTRA = "request_eventId";
    public static final String REQUEST_KEY_EXTRA = "request";
    private static final String TAG = "AdActivity";
    private static C0665z advertisement;
    private static I bidPayload;
    private static com.vungle.ads.internal.presenter.b eventListener;
    private static A presenterDelegate;
    private i7.f mraidAdWidget;
    private com.vungle.ads.internal.presenter.q mraidPresenter;
    private String placementRefId = "";
    private y1 unclosedAd;

    public static /* synthetic */ void getMraidAdWidget$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getMraidPresenter$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getPlacementRefId$vungle_ads_release$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void hideSystemUi() {
        H0 h02;
        WindowInsetsController insetsController;
        Window window = getWindow();
        E1.c cVar = new E1.c(getWindow().getDecorView());
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 30) {
            insetsController = window.getInsetsController();
            K0 k02 = new K0(insetsController, cVar);
            k02.f2868n = window;
            h02 = k02;
        } else if (i9 >= 26) {
            h02 = new H0(window, cVar);
        } else {
            h02 = new H0(window, cVar);
        }
        h02.X();
        h02.O(7);
    }

    private final void onConcurrentPlaybackError(String str) {
        String str2;
        V v6 = new V();
        com.vungle.ads.internal.presenter.b bVar = eventListener;
        if (bVar != null) {
            bVar.onError(v6, str);
        }
        v6.setPlacementId(this.placementRefId);
        C0665z c0665z = advertisement;
        String str3 = null;
        if (c0665z != null) {
            str2 = c0665z.getCreativeId();
        } else {
            str2 = null;
        }
        v6.setCreativeId(str2);
        C0665z c0665z2 = advertisement;
        if (c0665z2 != null) {
            str3 = c0665z2.eventId();
        }
        v6.setEventId(str3);
        v6.logErrorNoReturnValue$vungle_ads_release();
        v.Companion.e(TAG, "onConcurrentPlaybackError: " + v6.getLocalizedMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-2, reason: not valid java name */
    public static final com.vungle.ads.internal.signals.j m82onCreate$lambda2(InterfaceC2717f interfaceC2717f) {
        return (com.vungle.ads.internal.signals.j) interfaceC2717f.getValue();
    }

    /* renamed from: onCreate$lambda-6, reason: not valid java name */
    private static final com.vungle.ads.internal.executor.a m83onCreate$lambda6(InterfaceC2717f interfaceC2717f) {
        return (com.vungle.ads.internal.executor.a) interfaceC2717f.getValue();
    }

    /* renamed from: onCreate$lambda-7, reason: not valid java name */
    private static final e7.f m84onCreate$lambda7(InterfaceC2717f interfaceC2717f) {
        return (e7.f) interfaceC2717f.getValue();
    }

    /* renamed from: onCreate$lambda-8, reason: not valid java name */
    private static final com.vungle.ads.internal.platform.d m85onCreate$lambda8(InterfaceC2717f interfaceC2717f) {
        return (com.vungle.ads.internal.platform.d) interfaceC2717f.getValue();
    }

    public boolean canRotate$vungle_ads_release() {
        return false;
    }

    public final i7.f getMraidAdWidget$vungle_ads_release() {
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
    public void onConfigurationChanged(Configuration configuration) {
        G7.j.e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        int i9 = configuration.orientation;
        if (i9 == 2) {
            v.Companion.d(TAG, "landscape");
        } else if (i9 == 1) {
            v.Companion.d(TAG, "portrait");
        }
        com.vungle.ads.internal.presenter.q qVar = this.mraidPresenter;
        if (qVar != null) {
            qVar.onViewConfigurationChanged();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v7, types: [G7.f, java.lang.String] */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        String watermark$vungle_ads_release;
        super.onCreate(bundle);
        boolean z8 = true;
        requestWindowFeature(1);
        getWindow().setFlags(16777216, 16777216);
        a aVar = Companion;
        Intent intent = getIntent();
        G7.j.d(intent, "intent");
        String valueOf = String.valueOf(a.access$getPlacement(aVar, intent));
        this.placementRefId = valueOf;
        C0665z c0665z = advertisement;
        F f9 = F.INSTANCE;
        p1 placement = f9.getPlacement(valueOf);
        if (placement != null && c0665z != null) {
            getWindow().getDecorView().setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            String str2 = 0;
            y1 y1Var = null;
            try {
                i7.f fVar = new i7.f(this);
                ServiceLocator$Companion serviceLocator$Companion = f1.Companion;
                EnumC2718g enumC2718g = EnumC2718g.b;
                InterfaceC2717f c9 = AbstractC2712a.c(enumC2718g, new b(this));
                Intent intent2 = getIntent();
                G7.j.d(intent2, "intent");
                String access$getEventId = a.access$getEventId(aVar, intent2);
                if (access$getEventId != null) {
                    y1Var = new y1(access$getEventId, (String) str2, 2, (G7.f) str2);
                }
                this.unclosedAd = y1Var;
                if (y1Var != null) {
                    m82onCreate$lambda2(c9).recordUnclosedAd(y1Var);
                }
                fVar.setCloseDelegate(new f(this, c9));
                fVar.setOnViewTouchListener(new g(this));
                fVar.setOrientationDelegate(new h(this));
                InterfaceC2717f c10 = AbstractC2712a.c(enumC2718g, new c(this));
                p pVar = new p(c0665z, placement, ((com.vungle.ads.internal.executor.f) m83onCreate$lambda6(c10)).getOffloadExecutor(), m82onCreate$lambda2(c9));
                e7.f m84onCreate$lambda7 = m84onCreate$lambda7(AbstractC2712a.c(enumC2718g, new d(this)));
                if (!f9.omEnabled() || !c0665z.omEnabled()) {
                    z8 = false;
                }
                e7.g make = m84onCreate$lambda7.make(z8);
                com.vungle.ads.internal.executor.l jobExecutor = ((com.vungle.ads.internal.executor.f) m83onCreate$lambda6(c10)).getJobExecutor();
                InterfaceC2717f c11 = AbstractC2712a.c(enumC2718g, new e(this));
                pVar.setWebViewObserver(make);
                com.vungle.ads.internal.presenter.q qVar = new com.vungle.ads.internal.presenter.q(fVar, c0665z, placement, pVar, jobExecutor, make, bidPayload, m85onCreate$lambda8(c11));
                qVar.setEventListener(eventListener);
                qVar.setPresenterDelegate$vungle_ads_release(presenterDelegate);
                qVar.prepare();
                setContentView(fVar, fVar.getLayoutParams());
                C2073d adConfig = c0665z.getAdConfig();
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
                    C2069b c2069b = new C2069b();
                    c2069b.setPlacementId$vungle_ads_release(this.placementRefId);
                    C0665z c0665z2 = advertisement;
                    if (c0665z2 != null) {
                        str = c0665z2.eventId();
                    } else {
                        str = null;
                    }
                    c2069b.setEventId$vungle_ads_release(str);
                    C0665z c0665z3 = advertisement;
                    if (c0665z3 != null) {
                        str2 = c0665z3.getCreativeId();
                    }
                    c2069b.setCreativeId$vungle_ads_release(str2);
                    bVar.onError(c2069b.logError$vungle_ads_release(), this.placementRefId);
                }
                finish();
                return;
            }
        }
        com.vungle.ads.internal.presenter.b bVar2 = eventListener;
        if (bVar2 != null) {
            bVar2.onError(new C2083i(), this.placementRefId);
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
        G7.j.e(intent, "intent");
        super.onNewIntent(intent);
        a aVar = Companion;
        Intent intent2 = getIntent();
        G7.j.d(intent2, "getIntent()");
        String access$getPlacement = a.access$getPlacement(aVar, intent2);
        String access$getPlacement2 = a.access$getPlacement(aVar, intent);
        Intent intent3 = getIntent();
        G7.j.d(intent3, "getIntent()");
        String access$getEventId = a.access$getEventId(aVar, intent3);
        String access$getEventId2 = a.access$getEventId(aVar, intent);
        if ((access$getPlacement != null && access$getPlacement2 != null && !access$getPlacement.equals(access$getPlacement2)) || (access$getEventId != null && access$getEventId2 != null && !access$getEventId.equals(access$getEventId2))) {
            v.Companion.d(TAG, AbstractC2914a.k("Tried to play another placement ", access$getPlacement2, " while playing ", access$getPlacement));
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

    public final void setMraidAdWidget$vungle_ads_release(i7.f fVar) {
        this.mraidAdWidget = fVar;
    }

    public final void setMraidPresenter$vungle_ads_release(com.vungle.ads.internal.presenter.q qVar) {
        this.mraidPresenter = qVar;
    }

    public final void setPlacementRefId$vungle_ads_release(String str) {
        G7.j.e(str, "<set-?>");
        this.placementRefId = str;
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i9) {
        if (canRotate$vungle_ads_release()) {
            super.setRequestedOrientation(i9);
        }
    }
}
