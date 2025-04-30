package com.vungle.ads.internal.presenter;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import c7.C0623d0;
import c7.C0665z;
import c7.I;
import c7.p1;
import com.applovin.sdk.AppLovinMediationProvider;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vungle.ads.C2073d;
import com.vungle.ads.C2074d0;
import com.vungle.ads.C2083i;
import com.vungle.ads.C2137s;
import com.vungle.ads.K0;
import com.vungle.ads.ServiceLocator$Companion;
import com.vungle.ads.f1;
import com.vungle.ads.g1;
import com.vungle.ads.internal.E;
import com.vungle.ads.internal.F;
import com.vungle.ads.internal.network.InterfaceC2099a;
import com.vungle.ads.internal.util.B;
import com.vungle.ads.o1;
import g7.C2309c;
import java.io.File;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import t7.AbstractC2712a;
import t7.EnumC2718g;
import t7.InterfaceC2717f;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public final class q implements i7.h, i7.i {
    private static final String ACTION = "action";
    public static final String ACTION_WITH_VALUE = "actionWithValue";
    public static final String CLOSE = "close";
    public static final String CONSENT_ACTION = "consentAction";
    public static final String CREATIVE_HEARTBEAT = "creativeHeartbeat";
    public static final f Companion = new f(null);
    public static final String ERROR = "error";
    public static final String GET_AVAILABLE_DISK_SPACE = "getAvailableDiskSpace";
    private static final double HEARTBEAT_INTERVAL = 6.0d;
    public static final String OPEN = "open";
    private static final String OPEN_NON_MRAID = "openNonMraid";
    public static final String OPEN_PRIVACY = "openPrivacy";
    public static final String SET_ORIENTATION_PROPERTIES = "setOrientationProperties";
    public static final String SUCCESSFUL_VIEW = "successfulView";
    private static final String TAG = "MRAIDPresenter";
    public static final String TPAT = "tpat";
    public static final String UPDATE_SIGNALS = "updateSignals";
    private static final String USE_CUSTOM_CLOSE = "useCustomClose";
    private static final String USE_CUSTOM_PRIVACY = "useCustomPrivacy";
    public static final String VIDEO_LENGTH = "videoLength";
    public static final String VIDEO_VIEWED = "videoViewed";
    private Long adStartTime;
    private boolean adViewed;
    private final i7.f adWidget;
    private final C0665z advertisement;
    private boolean backEnabled;
    private final I bidPayload;
    private b bus;
    private final InterfaceC2717f clickCoordinateTracker$delegate;
    private Executor executor;
    private final InterfaceC2717f executors$delegate;
    private boolean heartbeatEnabled;
    private final AtomicBoolean isDestroying;
    private final e7.g omTracker;
    private final InterfaceC2717f pathProvider$delegate;
    private final p1 placement;
    private final com.vungle.ads.internal.platform.d platform;
    private A presenterDelegate;
    private final InterfaceC2717f scheduler$delegate;
    private final AtomicBoolean sendReportIncentivized;
    private final InterfaceC2717f signalManager$delegate;
    private final InterfaceC2717f suspendableTimer$delegate;
    private String userId;
    private final InterfaceC2717f vungleApiClient$delegate;
    private final com.vungle.ads.internal.ui.p vungleWebClient;

    public q(i7.f fVar, C0665z c0665z, p1 p1Var, com.vungle.ads.internal.ui.p pVar, Executor executor, e7.g gVar, I i9, com.vungle.ads.internal.platform.d dVar) {
        G7.j.e(fVar, "adWidget");
        G7.j.e(c0665z, "advertisement");
        G7.j.e(p1Var, "placement");
        G7.j.e(pVar, "vungleWebClient");
        G7.j.e(executor, "executor");
        G7.j.e(gVar, "omTracker");
        G7.j.e(dVar, "platform");
        this.adWidget = fVar;
        this.advertisement = c0665z;
        this.placement = p1Var;
        this.vungleWebClient = pVar;
        this.executor = executor;
        this.omTracker = gVar;
        this.bidPayload = i9;
        this.platform = dVar;
        this.isDestroying = new AtomicBoolean(false);
        this.sendReportIncentivized = new AtomicBoolean(false);
        ServiceLocator$Companion serviceLocator$Companion = f1.Companion;
        Context context = fVar.getContext();
        G7.j.d(context, "adWidget.context");
        EnumC2718g enumC2718g = EnumC2718g.b;
        this.vungleApiClient$delegate = AbstractC2712a.c(enumC2718g, new k(context));
        Context context2 = fVar.getContext();
        G7.j.d(context2, "adWidget.context");
        this.executors$delegate = AbstractC2712a.c(enumC2718g, new l(context2));
        Context context3 = fVar.getContext();
        G7.j.d(context3, "adWidget.context");
        this.pathProvider$delegate = AbstractC2712a.c(enumC2718g, new m(context3));
        Context context4 = fVar.getContext();
        G7.j.d(context4, "adWidget.context");
        this.signalManager$delegate = AbstractC2712a.c(enumC2718g, new n(context4));
        this.scheduler$delegate = AbstractC2712a.d(j.INSTANCE);
        this.suspendableTimer$delegate = AbstractC2712a.d(new p(this));
        this.clickCoordinateTracker$delegate = AbstractC2712a.d(new g(this));
    }

    private final void closeView() {
        Long l = this.adStartTime;
        if (l != null) {
            long currentTimeMillis = System.currentTimeMillis() - l.longValue();
            com.vungle.ads.internal.network.l lVar = new com.vungle.ads.internal.network.l(getVungleApiClient$vungle_ads_release(), this.placement.getReferenceId(), this.advertisement.getCreativeId(), this.advertisement.eventId(), ((com.vungle.ads.internal.executor.f) getExecutors()).getIoExecutor(), getPathProvider(), getSignalManager());
            List<String> tpatUrls = this.advertisement.getTpatUrls("ad.close", String.valueOf(currentTimeMillis), String.valueOf(((com.vungle.ads.internal.platform.b) this.platform).getVolumeLevel()));
            if (tpatUrls != null) {
                lVar.sendTpats(tpatUrls, this.executor);
            }
        }
        this.adWidget.close();
    }

    public static /* synthetic */ void getAdStartTime$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getBackEnabled$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getBus$annotations() {
    }

    public static /* synthetic */ void getClickCoordinateTracker$vungle_ads_release$annotations() {
    }

    public final com.vungle.ads.internal.executor.a getExecutors() {
        return (com.vungle.ads.internal.executor.a) this.executors$delegate.getValue();
    }

    public static /* synthetic */ void getHeartbeatEnabled$vungle_ads_release$annotations() {
    }

    public final com.vungle.ads.internal.util.x getPathProvider() {
        return (com.vungle.ads.internal.util.x) this.pathProvider$delegate.getValue();
    }

    private final com.vungle.ads.internal.util.o getScheduler() {
        return (com.vungle.ads.internal.util.o) this.scheduler$delegate.getValue();
    }

    public final com.vungle.ads.internal.signals.j getSignalManager() {
        return (com.vungle.ads.internal.signals.j) this.signalManager$delegate.getValue();
    }

    public static /* synthetic */ void getSuspendableTimer$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getUserId$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getVungleApiClient$vungle_ads_release$annotations() {
    }

    private final void handleWebViewException(o1 o1Var, boolean z8, String str) {
        com.vungle.ads.internal.util.v.Companion.e(TAG, "handleWebViewException: " + o1Var.getLocalizedMessage() + ", fatal: " + z8 + ", errorMsg: " + str);
        if (z8) {
            makeBusError(o1Var);
            closeView();
        }
    }

    public static /* synthetic */ void handleWebViewException$default(q qVar, o1 o1Var, boolean z8, String str, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            str = null;
        }
        qVar.handleWebViewException(o1Var, z8, str);
    }

    public static /* synthetic */ void isDestroying$vungle_ads_release$annotations() {
    }

    private final boolean loadMraid(File file) {
        File file2;
        String parent = file.getParent();
        String str = null;
        if (parent != null) {
            file2 = new File(parent);
        } else {
            file2 = null;
        }
        StringBuilder sb = new StringBuilder();
        if (file2 != null) {
            str = file2.getPath();
        }
        sb.append(str);
        File file3 = new File(AbstractC2914a.h(sb, File.separator, "index.html"));
        if (!file3.exists()) {
            C2137s.INSTANCE.logError$vungle_ads_release(310, "Fail to load html " + file3.getPath(), this.placement.getReferenceId(), this.advertisement.getCreativeId(), this.advertisement.eventId());
            return false;
        }
        this.adWidget.showWebsite(C0665z.FILE_SCHEME + file3.getPath());
        return true;
    }

    private final void makeBusError(o1 o1Var) {
        b bVar = this.bus;
        if (bVar != null) {
            bVar.onError(o1Var, this.placement.getReferenceId());
        }
    }

    /* renamed from: prepare$lambda-14 */
    public static final void m67prepare$lambda14(q qVar) {
        G7.j.e(qVar, "this$0");
        qVar.backEnabled = true;
    }

    /* renamed from: processCommand$lambda-10 */
    public static final void m68processCommand$lambda10(q qVar) {
        G7.j.e(qVar, "this$0");
        qVar.getSuspendableTimer$vungle_ads_release().reset();
    }

    /* renamed from: processCommand$lambda-11 */
    public static final void m69processCommand$lambda11(q qVar, long j7) {
        G7.j.e(qVar, "this$0");
        qVar.vungleWebClient.notifyDiskAvailableSize(j7);
    }

    /* renamed from: processCommand$lambda-5 */
    public static final void m70processCommand$lambda5(q qVar) {
        G7.j.e(qVar, "this$0");
        qVar.vungleWebClient.notifyPropertiesChange(true);
    }

    /* renamed from: processCommand$lambda-6 */
    public static final void m71processCommand$lambda6(q qVar) {
        G7.j.e(qVar, "this$0");
        qVar.adWidget.setVisibility(0);
    }

    /* renamed from: processCommand$lambda-8 */
    public static final void m72processCommand$lambda8(q qVar) {
        G7.j.e(qVar, "this$0");
        String referenceId = qVar.placement.getReferenceId();
        InterfaceC2099a ri = qVar.getVungleApiClient$vungle_ads_release().ri(new C0623d0((List) null, (Boolean) null, (String) null, qVar.adStartTime, qVar.advertisement.appId(), referenceId, qVar.userId, 7, (G7.f) null));
        if (ri == null) {
            com.vungle.ads.internal.util.v.Companion.e(TAG, "Invalid ri call.");
        } else {
            ((com.vungle.ads.internal.network.h) ri).enqueue(new i());
        }
    }

    /* renamed from: processCommand$lambda-9 */
    public static final void m73processCommand$lambda9(q qVar, boolean z8, String str, String str2) {
        G7.j.e(qVar, "this$0");
        qVar.handleWebViewException(new C2074d0(o1.CREATIVE_ERROR, null, 2, null), z8, com.mbridge.msdk.foundation.entity.o.k(str, " : ", str2));
    }

    private final void recordPlayAssetMetric() {
        com.vungle.ads.internal.protos.n nVar;
        if (this.advertisement.getAssetsFullyDownloaded()) {
            nVar = com.vungle.ads.internal.protos.n.LOCAL_ASSETS_USED;
        } else {
            nVar = com.vungle.ads.internal.protos.n.REMOTE_ASSETS_USED;
        }
        C2137s.INSTANCE.logMetric$vungle_ads_release(new g1(nVar), (r13 & 2) != 0 ? null : this.placement.getReferenceId(), (r13 & 4) != 0 ? null : this.advertisement.getCreativeId(), (r13 & 8) != 0 ? null : this.advertisement.eventId(), (r13 & 16) != 0 ? null : null);
    }

    public final void reportErrorAndCloseAd(o1 o1Var) {
        makeBusError(o1Var);
        closeView();
    }

    public final void detach(int i9) {
        boolean z8;
        b bVar;
        com.vungle.ads.internal.util.v.Companion.d(TAG, "detach()");
        boolean z9 = false;
        if ((i9 & 1) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if ((i9 & 2) != 0) {
            z9 = true;
        }
        this.vungleWebClient.setWebViewObserver(null);
        this.vungleWebClient.setMraidDelegate(null);
        if (!z8 && z9 && !this.isDestroying.getAndSet(true) && (bVar = this.bus) != null) {
            bVar.onNext(TtmlNode.END, null, this.placement.getReferenceId());
        }
        this.adWidget.destroyWebView(this.omTracker.stop());
        if (this.heartbeatEnabled) {
            getSuspendableTimer$vungle_ads_release().cancel();
        }
    }

    public final Long getAdStartTime$vungle_ads_release() {
        return this.adStartTime;
    }

    public final boolean getBackEnabled$vungle_ads_release() {
        return this.backEnabled;
    }

    public final b getBus() {
        return this.bus;
    }

    public final E getClickCoordinateTracker$vungle_ads_release() {
        return (E) this.clickCoordinateTracker$delegate.getValue();
    }

    public final boolean getHeartbeatEnabled$vungle_ads_release() {
        return this.heartbeatEnabled;
    }

    public final B getSuspendableTimer$vungle_ads_release() {
        return (B) this.suspendableTimer$delegate.getValue();
    }

    public final String getUserId$vungle_ads_release() {
        return this.userId;
    }

    public final com.vungle.ads.internal.network.y getVungleApiClient$vungle_ads_release() {
        return (com.vungle.ads.internal.network.y) this.vungleApiClient$delegate.getValue();
    }

    public final void handleExit() {
        if (this.backEnabled) {
            this.adWidget.showWebsite("javascript:window.vungle.mraidBridgeExt.requestMRAIDClose()");
        }
    }

    public final AtomicBoolean isDestroying$vungle_ads_release() {
        return this.isDestroying;
    }

    @Override // i7.i
    public void onReceivedError(String str, boolean z8) {
        G7.j.e(str, "errorDesc");
        if (z8) {
            reportErrorAndCloseAd(new C2074d0(o1.AD_RENDER_NETWORK_ERROR, null, 2, null));
        }
    }

    @Override // i7.i
    public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        handleWebViewException$default(this, new C2074d0(o1.WEBVIEW_RENDER_UNRESPONSIVE, null, 2, null), true, null, 4, null);
    }

    public final void onViewConfigurationChanged() {
        this.vungleWebClient.notifyPropertiesChange(true);
    }

    public final void onViewTouched(MotionEvent motionEvent) {
        if (motionEvent != null) {
            getClickCoordinateTracker$vungle_ads_release().trackCoordinate(motionEvent);
        }
    }

    @Override // i7.i
    public boolean onWebRenderingProcessGone(WebView webView, Boolean bool) {
        handleWebViewException$default(this, new C2074d0(o1.WEB_CRASH, null, 2, null), true, null, 4, null);
        return true;
    }

    public final void prepare() {
        Integer num;
        int i9;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int settings;
        boolean z8;
        boolean z9 = false;
        this.isDestroying.set(false);
        this.adWidget.linkWebView(this.vungleWebClient);
        C2073d adConfig = this.advertisement.getAdConfig();
        if (adConfig != null && (settings = adConfig.getSettings()) > 0) {
            if ((settings & 2) == 2) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.backEnabled = z8;
        }
        F f9 = F.INSTANCE;
        this.heartbeatEnabled = f9.heartbeatEnabled();
        C2073d adConfig2 = this.advertisement.getAdConfig();
        if (adConfig2 != null) {
            num = Integer.valueOf(adConfig2.getAdOrientation());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 0) {
            i9 = 7;
        } else if (num != null && num.intValue() == 1) {
            i9 = 6;
        } else {
            i9 = 4;
        }
        this.adWidget.setOrientation(i9);
        this.omTracker.start();
        this.vungleWebClient.setMraidDelegate(this);
        this.vungleWebClient.setErrorHandler(this);
        File assetDirectory = this.advertisement.getAssetDirectory();
        if (assetDirectory != null && assetDirectory.exists()) {
            StringBuilder sb = new StringBuilder();
            sb.append(assetDirectory.getPath());
            if (!loadMraid(new File(AbstractC2914a.h(sb, File.separator, "template")))) {
                reportErrorAndCloseAd(new C2083i());
                return;
            }
            this.adStartTime = Long.valueOf(System.currentTimeMillis());
            A a6 = this.presenterDelegate;
            if (a6 != null) {
                str = ((K0) a6).getUserId();
            } else {
                str = null;
            }
            this.userId = str;
            A a9 = this.presenterDelegate;
            if (a9 == null || (str2 = ((K0) a9).getAlertTitleText()) == null) {
                str2 = "";
            }
            A a10 = this.presenterDelegate;
            if (a10 == null || (str3 = ((K0) a10).getAlertBodyText()) == null) {
                str3 = "";
            }
            A a11 = this.presenterDelegate;
            if (a11 == null || (str4 = ((K0) a11).getAlertContinueButtonText()) == null) {
                str4 = "";
            }
            A a12 = this.presenterDelegate;
            if (a12 == null || (str5 = ((K0) a12).getAlertCloseButtonText()) == null) {
                str5 = "";
            }
            this.advertisement.setIncentivizedText(str2, str3, str4, str5);
            if (f9.getGDPRIsCountryDataProtected() && AppLovinMediationProvider.UNKNOWN.equals(C2309c.INSTANCE.getConsentStatus())) {
                z9 = true;
            }
            this.vungleWebClient.setConsentStatus(z9, f9.getGDPRConsentTitle(), f9.getGDPRConsentMessage(), f9.getGDPRButtonAccept(), f9.getGDPRButtonDeny());
            if (z9) {
                C2309c.INSTANCE.updateGdprConsent("opted_out_by_timeout", "vungle_modal", "");
            }
            int showCloseDelay = this.advertisement.getShowCloseDelay(Boolean.valueOf(this.placement.isIncentivized()));
            if (showCloseDelay > 0) {
                getScheduler().schedule(new e(this, 4), showCloseDelay);
            } else {
                this.backEnabled = true;
            }
            b bVar = this.bus;
            if (bVar != null) {
                bVar.onNext("start", null, this.placement.getReferenceId());
            }
            if (this.heartbeatEnabled) {
                getSuspendableTimer$vungle_ads_release().start();
                return;
            }
            return;
        }
        reportErrorAndCloseAd(new C2083i());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01f3, code lost:
    
        if (r21.equals(com.vungle.ads.internal.presenter.q.OPEN) == false) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x020c, code lost:
    
        r1 = r20.advertisement.adUnit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0212, code lost:
    
        if (r1 == null) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0214, code lost:
    
        r10 = r1.getDeeplinkUrl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0218, code lost:
    
        r1 = com.vungle.ads.internal.util.t.INSTANCE.getContentStringValue(r22, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x021e, code lost:
    
        if (r10 == null) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0224, code lost:
    
        if (r10.length() != 0) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x022f, code lost:
    
        r2 = r20.adWidget.getContext();
        G7.j.d(r2, "adWidget.context");
        com.vungle.ads.internal.util.l.launch(r10, r1, r2, new com.vungle.ads.internal.ui.l(r20.bus, r20.placement.getReferenceId()), new com.vungle.ads.internal.presenter.h(r20));
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0255, code lost:
    
        r1 = r20.bus;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0257, code lost:
    
        if (r1 == null) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0259, code lost:
    
        r1.onNext(com.vungle.ads.internal.presenter.q.OPEN, "adClick", r20.placement.getReferenceId());
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0264, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0226, code lost:
    
        if (r1 == null) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x022c, code lost:
    
        if (r1.length() != 0) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x024e, code lost:
    
        com.vungle.ads.internal.util.v.Companion.e(com.vungle.ads.internal.presenter.q.TAG, "CTA destination URL is not configured properly");
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0208, code lost:
    
        if (r21.equals(com.vungle.ads.internal.presenter.q.OPEN_NON_MRAID) == false) goto L368;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0029. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0353  */
    @Override // i7.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean processCommand(java.lang.String r21, f8.v r22) {
        /*
            Method dump skipped, instructions count: 1130
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.presenter.q.processCommand(java.lang.String, f8.v):boolean");
    }

    public final void setAdStartTime$vungle_ads_release(Long l) {
        this.adStartTime = l;
    }

    public final void setAdVisibility(boolean z8) {
        this.vungleWebClient.setAdVisibility(z8);
    }

    public final void setBackEnabled$vungle_ads_release(boolean z8) {
        this.backEnabled = z8;
    }

    public final void setBus(b bVar) {
        this.bus = bVar;
    }

    public final void setEventListener(b bVar) {
        this.bus = bVar;
    }

    public final void setHeartbeatEnabled$vungle_ads_release(boolean z8) {
        this.heartbeatEnabled = z8;
    }

    public final void setPresenterDelegate$vungle_ads_release(A a6) {
        this.presenterDelegate = a6;
    }

    public final void setUserId$vungle_ads_release(String str) {
        this.userId = str;
    }

    public final void start() {
        com.vungle.ads.internal.util.v.Companion.d(TAG, "start()");
        this.adWidget.resumeWeb();
        setAdVisibility(true);
        if (F.INSTANCE.adLoadOptimizationEnabled()) {
            recordPlayAssetMetric();
        }
    }

    public final void stop() {
        com.vungle.ads.internal.util.v.Companion.d(TAG, "stop()");
        this.adWidget.pauseWeb();
        setAdVisibility(false);
    }
}
