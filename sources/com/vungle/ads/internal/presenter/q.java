package com.vungle.ads.internal.presenter;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import bh.c1;
import bh.i0;
import bh.o3;
import com.applovin.sdk.AppLovinMediationProvider;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vungle.ads.ServiceLocator$Companion;
import com.vungle.ads.b1;
import com.vungle.ads.e3;
import com.vungle.ads.f3;
import com.vungle.ads.i2;
import com.vungle.ads.internal.e0;
import com.vungle.ads.internal.f0;
import com.vungle.ads.internal.util.b0;
import com.vungle.ads.n3;
import java.io.File;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q implements hh.h, hh.i {
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
    private final hh.f adWidget;
    private final bh.z advertisement;
    private boolean backEnabled;
    private final i0 bidPayload;
    private b bus;
    private final Lazy clickCoordinateTracker$delegate;
    private Executor executor;
    private final Lazy executors$delegate;
    private boolean heartbeatEnabled;
    private final AtomicBoolean isDestroying;
    private final dh.g omTracker;
    private final Lazy pathProvider$delegate;
    private final o3 placement;
    private final com.vungle.ads.internal.platform.d platform;
    private a0 presenterDelegate;
    private final Lazy scheduler$delegate;
    private final AtomicBoolean sendReportIncentivized;
    private final Lazy signalManager$delegate;
    private final Lazy suspendableTimer$delegate;
    private String userId;
    private final Lazy vungleApiClient$delegate;
    private final com.vungle.ads.internal.ui.p vungleWebClient;

    public q(hh.f adWidget, bh.z advertisement, o3 placement, com.vungle.ads.internal.ui.p vungleWebClient, Executor executor, dh.g omTracker, i0 i0Var, com.vungle.ads.internal.platform.d platform) {
        Intrinsics.checkNotNullParameter(adWidget, "adWidget");
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(vungleWebClient, "vungleWebClient");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(omTracker, "omTracker");
        Intrinsics.checkNotNullParameter(platform, "platform");
        this.adWidget = adWidget;
        this.advertisement = advertisement;
        this.placement = placement;
        this.vungleWebClient = vungleWebClient;
        this.executor = executor;
        this.omTracker = omTracker;
        this.bidPayload = i0Var;
        this.platform = platform;
        this.isDestroying = new AtomicBoolean(false);
        this.sendReportIncentivized = new AtomicBoolean(false);
        ServiceLocator$Companion serviceLocator$Companion = e3.Companion;
        Context context = adWidget.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "adWidget.context");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        this.vungleApiClient$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new k(context));
        Context context2 = adWidget.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "adWidget.context");
        this.executors$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new l(context2));
        Context context3 = adWidget.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "adWidget.context");
        this.pathProvider$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new m(context3));
        Context context4 = adWidget.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "adWidget.context");
        this.signalManager$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new n(context4));
        this.scheduler$delegate = LazyKt.lazy(j.INSTANCE);
        this.suspendableTimer$delegate = LazyKt.lazy(new p(this));
        this.clickCoordinateTracker$delegate = LazyKt.lazy(new g(this));
    }

    private final void closeView() {
        Long l10 = this.adStartTime;
        if (l10 != null) {
            long currentTimeMillis = System.currentTimeMillis() - l10.longValue();
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

    /* JADX INFO: Access modifiers changed from: private */
    public final com.vungle.ads.internal.executor.a getExecutors() {
        return (com.vungle.ads.internal.executor.a) this.executors$delegate.getValue();
    }

    public static /* synthetic */ void getHeartbeatEnabled$vungle_ads_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.vungle.ads.internal.util.x getPathProvider() {
        return (com.vungle.ads.internal.util.x) this.pathProvider$delegate.getValue();
    }

    private final com.vungle.ads.internal.util.o getScheduler() {
        return (com.vungle.ads.internal.util.o) this.scheduler$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.vungle.ads.internal.signals.j getSignalManager() {
        return (com.vungle.ads.internal.signals.j) this.signalManager$delegate.getValue();
    }

    public static /* synthetic */ void getSuspendableTimer$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getUserId$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getVungleApiClient$vungle_ads_release$annotations() {
    }

    private final void handleWebViewException(n3 n3Var, boolean z10, String str) {
        com.vungle.ads.internal.util.v.Companion.e(TAG, "handleWebViewException: " + n3Var.getLocalizedMessage() + ", fatal: " + z10 + ", errorMsg: " + str);
        if (z10) {
            makeBusError(n3Var);
            closeView();
        }
    }

    public static /* synthetic */ void handleWebViewException$default(q qVar, n3 n3Var, boolean z10, String str, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = null;
        }
        qVar.handleWebViewException(n3Var, z10, str);
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
        StringBuilder sb2 = new StringBuilder();
        if (file2 != null) {
            str = file2.getPath();
        }
        sb2.append(str);
        File file3 = new File(vd.e.h(sb2, File.separator, "index.html"));
        if (!file3.exists()) {
            com.vungle.ads.s.INSTANCE.logError$vungle_ads_release(310, "Fail to load html " + file3.getPath(), this.placement.getReferenceId(), this.advertisement.getCreativeId(), this.advertisement.eventId());
            return false;
        }
        this.adWidget.showWebsite(bh.z.FILE_SCHEME + file3.getPath());
        return true;
    }

    private final void makeBusError(n3 n3Var) {
        b bVar = this.bus;
        if (bVar != null) {
            bVar.onError(n3Var, this.placement.getReferenceId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: prepare$lambda-14, reason: not valid java name */
    public static final void m47prepare$lambda14(q this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.backEnabled = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: processCommand$lambda-10, reason: not valid java name */
    public static final void m48processCommand$lambda10(q this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getSuspendableTimer$vungle_ads_release().reset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: processCommand$lambda-11, reason: not valid java name */
    public static final void m49processCommand$lambda11(q this$0, long j3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.vungleWebClient.notifyDiskAvailableSize(j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: processCommand$lambda-5, reason: not valid java name */
    public static final void m50processCommand$lambda5(q this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.vungleWebClient.notifyPropertiesChange(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: processCommand$lambda-6, reason: not valid java name */
    public static final void m51processCommand$lambda6(q this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.adWidget.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: processCommand$lambda-8, reason: not valid java name */
    public static final void m52processCommand$lambda8(q this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String referenceId = this$0.placement.getReferenceId();
        List list = null;
        Boolean bool = null;
        String str = null;
        com.vungle.ads.internal.network.a ri = this$0.getVungleApiClient$vungle_ads_release().ri(new c1(list, bool, str, this$0.adStartTime, this$0.advertisement.appId(), referenceId, this$0.userId, 7, (DefaultConstructorMarker) null));
        if (ri == null) {
            com.vungle.ads.internal.util.v.Companion.e(TAG, "Invalid ri call.");
        } else {
            ((com.vungle.ads.internal.network.h) ri).enqueue(new i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: processCommand$lambda-9, reason: not valid java name */
    public static final void m53processCommand$lambda9(q this$0, boolean z10, String str, String str2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.handleWebViewException(new b1(n3.CREATIVE_ERROR, null, 2, 0 == true ? 1 : 0), z10, kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.m(str, " : ", str2));
    }

    private final void recordPlayAssetMetric() {
        com.vungle.ads.internal.protos.n nVar;
        if (this.advertisement.getAssetsFullyDownloaded()) {
            nVar = com.vungle.ads.internal.protos.n.LOCAL_ASSETS_USED;
        } else {
            nVar = com.vungle.ads.internal.protos.n.REMOTE_ASSETS_USED;
        }
        com.vungle.ads.s.logMetric$vungle_ads_release$default(com.vungle.ads.s.INSTANCE, new f3(nVar), this.placement.getReferenceId(), this.advertisement.getCreativeId(), this.advertisement.eventId(), (String) null, 16, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportErrorAndCloseAd(n3 n3Var) {
        makeBusError(n3Var);
        closeView();
    }

    public final void detach(int i10) {
        boolean z10;
        b bVar;
        com.vungle.ads.internal.util.v.Companion.d(TAG, "detach()");
        boolean z11 = false;
        if ((i10 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        this.vungleWebClient.setWebViewObserver(null);
        this.vungleWebClient.setMraidDelegate(null);
        if (!z10 && z11 && !this.isDestroying.getAndSet(true) && (bVar = this.bus) != null) {
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

    public final e0 getClickCoordinateTracker$vungle_ads_release() {
        return (e0) this.clickCoordinateTracker$delegate.getValue();
    }

    public final boolean getHeartbeatEnabled$vungle_ads_release() {
        return this.heartbeatEnabled;
    }

    public final b0 getSuspendableTimer$vungle_ads_release() {
        return (b0) this.suspendableTimer$delegate.getValue();
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

    @Override // hh.i
    public void onReceivedError(String errorDesc, boolean z10) {
        Intrinsics.checkNotNullParameter(errorDesc, "errorDesc");
        if (z10) {
            reportErrorAndCloseAd(new b1(n3.AD_RENDER_NETWORK_ERROR, null, 2, 0 == true ? 1 : 0));
        }
    }

    @Override // hh.i
    public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        handleWebViewException$default(this, new b1(n3.WEBVIEW_RENDER_UNRESPONSIVE, null, 2, 0 == true ? 1 : 0), true, null, 4, null);
    }

    public final void onViewConfigurationChanged() {
        this.vungleWebClient.notifyPropertiesChange(true);
    }

    public final void onViewTouched(MotionEvent motionEvent) {
        if (motionEvent != null) {
            getClickCoordinateTracker$vungle_ads_release().trackCoordinate(motionEvent);
        }
    }

    @Override // hh.i
    public boolean onWebRenderingProcessGone(WebView webView, Boolean bool) {
        handleWebViewException$default(this, new b1(n3.WEB_CRASH, null, 2, 0 == true ? 1 : 0), true, null, 4, null);
        return true;
    }

    public final void prepare() {
        Integer num;
        int i10;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z10;
        int settings;
        boolean z11;
        int i11 = 0;
        this.isDestroying.set(false);
        this.adWidget.linkWebView(this.vungleWebClient);
        com.vungle.ads.d adConfig = this.advertisement.getAdConfig();
        if (adConfig != null && (settings = adConfig.getSettings()) > 0) {
            if ((settings & 2) == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.backEnabled = z11;
        }
        f0 f0Var = f0.INSTANCE;
        this.heartbeatEnabled = f0Var.heartbeatEnabled();
        com.vungle.ads.d adConfig2 = this.advertisement.getAdConfig();
        if (adConfig2 != null) {
            num = Integer.valueOf(adConfig2.getAdOrientation());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 0) {
            i10 = 7;
        } else if (num != null && num.intValue() == 1) {
            i10 = 6;
        } else {
            i10 = 4;
        }
        this.adWidget.setOrientation(i10);
        this.omTracker.start();
        this.vungleWebClient.setMraidDelegate(this);
        this.vungleWebClient.setErrorHandler(this);
        File assetDirectory = this.advertisement.getAssetDirectory();
        if (assetDirectory != null && assetDirectory.exists()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(assetDirectory.getPath());
            if (!loadMraid(new File(vd.e.h(sb2, File.separator, "template")))) {
                reportErrorAndCloseAd(new com.vungle.ads.i());
                return;
            }
            this.adStartTime = Long.valueOf(System.currentTimeMillis());
            a0 a0Var = this.presenterDelegate;
            if (a0Var != null) {
                str = ((i2) a0Var).getUserId();
            } else {
                str = null;
            }
            this.userId = str;
            a0 a0Var2 = this.presenterDelegate;
            if (a0Var2 == null || (str2 = ((i2) a0Var2).getAlertTitleText()) == null) {
                str2 = "";
            }
            a0 a0Var3 = this.presenterDelegate;
            if (a0Var3 == null || (str3 = ((i2) a0Var3).getAlertBodyText()) == null) {
                str3 = "";
            }
            a0 a0Var4 = this.presenterDelegate;
            if (a0Var4 == null || (str4 = ((i2) a0Var4).getAlertContinueButtonText()) == null) {
                str4 = "";
            }
            a0 a0Var5 = this.presenterDelegate;
            if (a0Var5 == null || (str5 = ((i2) a0Var5).getAlertCloseButtonText()) == null) {
                str5 = "";
            }
            this.advertisement.setIncentivizedText(str2, str3, str4, str5);
            if (f0Var.getGDPRIsCountryDataProtected() && Intrinsics.areEqual(AppLovinMediationProvider.UNKNOWN, fh.c.INSTANCE.getConsentStatus())) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.vungleWebClient.setConsentStatus(z10, f0Var.getGDPRConsentTitle(), f0Var.getGDPRConsentMessage(), f0Var.getGDPRButtonAccept(), f0Var.getGDPRButtonDeny());
            if (z10) {
                fh.c.INSTANCE.updateGdprConsent("opted_out_by_timeout", "vungle_modal", "");
            }
            int showCloseDelay = this.advertisement.getShowCloseDelay(Boolean.valueOf(this.placement.isIncentivized()));
            if (showCloseDelay > 0) {
                getScheduler().schedule(new e(this, i11), showCloseDelay);
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
        reportErrorAndCloseAd(new com.vungle.ads.i());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x020e, code lost:
    
        if (r23.equals(com.vungle.ads.internal.presenter.q.OPEN_NON_MRAID) == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01f9, code lost:
    
        if (r23.equals(com.vungle.ads.internal.presenter.q.OPEN) == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0212, code lost:
    
        r1 = r22.advertisement.adUnit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0218, code lost:
    
        if (r1 == null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x021a, code lost:
    
        r12 = r1.getDeeplinkUrl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x021e, code lost:
    
        r1 = com.vungle.ads.internal.util.t.INSTANCE.getContentStringValue(r24, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0224, code lost:
    
        if (r12 == null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x022a, code lost:
    
        if (r12.length() != 0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x022d, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0230, code lost:
    
        if (r2 == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0232, code lost:
    
        if (r1 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0238, code lost:
    
        if (r1.length() != 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x023b, code lost:
    
        if (r11 == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x023d, code lost:
    
        com.vungle.ads.internal.util.v.Companion.e(com.vungle.ads.internal.presenter.q.TAG, "CTA destination URL is not configured properly");
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0263, code lost:
    
        r1 = r22.bus;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0265, code lost:
    
        if (r1 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0267, code lost:
    
        r1.onNext(com.vungle.ads.internal.presenter.q.OPEN, "adClick", r22.placement.getReferenceId());
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0272, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x023a, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0245, code lost:
    
        r2 = r22.adWidget.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "adWidget.context");
        com.vungle.ads.internal.util.l.launch(r12, r1, r2, new com.vungle.ads.internal.ui.l(r22.bus, r22.placement.getReferenceId()), new com.vungle.ads.internal.presenter.h(r22));
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x022f, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x002b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0363  */
    @Override // hh.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean processCommand(java.lang.String r23, kotlinx.serialization.json.JsonObject r24) {
        /*
            Method dump skipped, instructions count: 1146
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.presenter.q.processCommand(java.lang.String, kotlinx.serialization.json.JsonObject):boolean");
    }

    public final void setAdStartTime$vungle_ads_release(Long l10) {
        this.adStartTime = l10;
    }

    public final void setAdVisibility(boolean z10) {
        this.vungleWebClient.setAdVisibility(z10);
    }

    public final void setBackEnabled$vungle_ads_release(boolean z10) {
        this.backEnabled = z10;
    }

    public final void setBus(b bVar) {
        this.bus = bVar;
    }

    public final void setEventListener(b bVar) {
        this.bus = bVar;
    }

    public final void setHeartbeatEnabled$vungle_ads_release(boolean z10) {
        this.heartbeatEnabled = z10;
    }

    public final void setPresenterDelegate$vungle_ads_release(a0 a0Var) {
        this.presenterDelegate = a0Var;
    }

    public final void setUserId$vungle_ads_release(String str) {
        this.userId = str;
    }

    public final void start() {
        com.vungle.ads.internal.util.v.Companion.d(TAG, "start()");
        this.adWidget.resumeWeb();
        setAdVisibility(true);
        if (f0.INSTANCE.adLoadOptimizationEnabled()) {
            recordPlayAssetMetric();
        }
    }

    public final void stop() {
        com.vungle.ads.internal.util.v.Companion.d(TAG, "stop()");
        this.adWidget.pauseWeb();
        setAdVisibility(false);
    }
}
