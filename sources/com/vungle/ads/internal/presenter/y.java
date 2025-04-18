package com.vungle.ads.internal.presenter;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.applovin.sdk.AppLovinMediationProvider;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vungle.ads.ServiceLocator$Companion;
import com.vungle.ads.e3;
import com.vungle.ads.g2;
import com.vungle.ads.internal.f0;
import com.vungle.ads.n3;
import com.vungle.ads.v1;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y {
    public static final s Companion = new s(null);
    public static final String DOWNLOAD = "download";
    public static final String OPEN_PRIVACY = "openPrivacy";
    private static final String TAG = "NativeAdPresenter";
    public static final String TPAT = "tpat";
    public static final String VIDEO_VIEWED = "videoViewed";
    private Long adStartTime;
    private boolean adViewed;
    private final bh.z advertisement;
    private b bus;
    private final Context context;
    private Dialog currentDialog;
    private final z delegate;
    private Executor executor;
    private final Lazy executors$delegate;
    private dh.b omTracker;
    private final Lazy pathProvider$delegate;
    private final com.vungle.ads.internal.platform.d platform;
    private final Lazy signalManager$delegate;
    private final Lazy vungleApiClient$delegate;

    public y(Context context, z delegate, bh.z zVar, Executor executor, com.vungle.ads.internal.platform.d platform) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(platform, "platform");
        this.context = context;
        this.delegate = delegate;
        this.advertisement = zVar;
        this.executor = executor;
        this.platform = platform;
        ServiceLocator$Companion serviceLocator$Companion = e3.Companion;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        this.vungleApiClient$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new u(context));
        this.executors$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new v(context));
        this.pathProvider$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new w(context));
        this.signalManager$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new x(context));
    }

    private final com.vungle.ads.internal.executor.a getExecutors() {
        return (com.vungle.ads.internal.executor.a) this.executors$delegate.getValue();
    }

    private final com.vungle.ads.internal.util.x getPathProvider() {
        return (com.vungle.ads.internal.util.x) this.pathProvider$delegate.getValue();
    }

    private final com.vungle.ads.internal.signals.j getSignalManager() {
        return (com.vungle.ads.internal.signals.j) this.signalManager$delegate.getValue();
    }

    private final com.vungle.ads.internal.network.y getVungleApiClient() {
        return (com.vungle.ads.internal.network.y) this.vungleApiClient$delegate.getValue();
    }

    private final boolean needShowGdpr() {
        return f0.INSTANCE.getGDPRIsCountryDataProtected() && Intrinsics.areEqual(AppLovinMediationProvider.UNKNOWN, fh.c.INSTANCE.getConsentStatus());
    }

    private final void onDownload(String str) {
        List list;
        String str2;
        String str3;
        boolean z10;
        String str4;
        bh.g adUnit;
        String str5;
        bh.z zVar = this.advertisement;
        if (zVar != null) {
            list = bh.z.getTpatUrls$default(zVar, "clickUrl", null, null, 6, null);
        } else {
            list = null;
        }
        com.vungle.ads.internal.network.y vungleApiClient = getVungleApiClient();
        String placementRefId = ((v1) this.delegate).getPlacementRefId();
        bh.z zVar2 = this.advertisement;
        if (zVar2 != null) {
            str2 = zVar2.getCreativeId();
        } else {
            str2 = null;
        }
        bh.z zVar3 = this.advertisement;
        if (zVar3 != null) {
            str3 = zVar3.eventId();
        } else {
            str3 = null;
        }
        com.vungle.ads.internal.network.l lVar = new com.vungle.ads.internal.network.l(vungleApiClient, placementRefId, str2, str3, ((com.vungle.ads.internal.executor.f) getExecutors()).getIoExecutor(), getPathProvider(), getSignalManager());
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            com.vungle.ads.s sVar = com.vungle.ads.s.INSTANCE;
            String placementRefId2 = ((v1) this.delegate).getPlacementRefId();
            bh.z zVar4 = this.advertisement;
            if (zVar4 != null) {
                str5 = zVar4.getCreativeId();
            } else {
                str5 = null;
            }
            sVar.logError$vungle_ads_release(129, "Empty tpat key: clickUrl", (r13 & 4) != 0 ? null : placementRefId2, (r13 & 8) != 0 ? null : str5, (r13 & 16) != 0 ? null : null);
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                lVar.sendTpat((String) it.next(), this.executor);
            }
        }
        if (str != null) {
            lVar.sendTpat(str, this.executor);
        }
        bh.z zVar5 = this.advertisement;
        if (zVar5 != null && (adUnit = zVar5.adUnit()) != null) {
            str4 = adUnit.getDeeplinkUrl();
        } else {
            str4 = null;
        }
        com.vungle.ads.internal.util.l.launch(str4, str, this.context, new com.vungle.ads.internal.ui.l(this.bus, null), new t(this, lVar));
        b bVar = this.bus;
        if (bVar != null) {
            bVar.onNext(q.OPEN, "adClick", ((v1) this.delegate).getPlacementRefId());
        }
    }

    private final void onPrivacy(String str) {
        String str2;
        if (str != null) {
            String str3 = null;
            if (!com.vungle.ads.internal.util.n.INSTANCE.isValidUrl(str)) {
                n3 placementId$vungle_ads_release = new g2(str).setPlacementId$vungle_ads_release(((v1) this.delegate).getPlacementRefId());
                bh.z zVar = this.advertisement;
                if (zVar != null) {
                    str2 = zVar.getCreativeId();
                } else {
                    str2 = null;
                }
                n3 creativeId$vungle_ads_release = placementId$vungle_ads_release.setCreativeId$vungle_ads_release(str2);
                bh.z zVar2 = this.advertisement;
                if (zVar2 != null) {
                    str3 = zVar2.eventId();
                }
                creativeId$vungle_ads_release.setEventId$vungle_ads_release(str3).logErrorNoReturnValue$vungle_ads_release();
                return;
            }
            if (!com.vungle.ads.internal.util.l.launch(null, str, this.context, new com.vungle.ads.internal.ui.l(this.bus, ((v1) this.delegate).getPlacementRefId()), null)) {
                new g2(str).logErrorNoReturnValue$vungle_ads_release();
            }
        }
    }

    public static /* synthetic */ void processCommand$default(y yVar, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        yVar.processCommand(str, str2);
    }

    private final void showGdpr() {
        boolean z10;
        fh.c.INSTANCE.updateGdprConsent("opted_out_by_timeout", "vungle_modal", null);
        if (!(this.context instanceof Activity)) {
            com.vungle.ads.internal.util.v.Companion.w(TAG, "We can not show GDPR dialog with application context.");
            return;
        }
        z2.c cVar = new z2.c(this, 2);
        f0 f0Var = f0.INSTANCE;
        String gDPRConsentTitle = f0Var.getGDPRConsentTitle();
        String gDPRConsentMessage = f0Var.getGDPRConsentMessage();
        String gDPRButtonAccept = f0Var.getGDPRButtonAccept();
        String gDPRButtonDeny = f0Var.getGDPRButtonDeny();
        Context context = this.context;
        AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(context, ((Activity) context).getApplicationInfo().theme));
        boolean z11 = true;
        if (gDPRConsentTitle != null && gDPRConsentTitle.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            builder.setTitle(gDPRConsentTitle);
        }
        if (gDPRConsentMessage != null && gDPRConsentMessage.length() != 0) {
            z11 = false;
        }
        if (!z11) {
            builder.setMessage(gDPRConsentMessage);
        }
        builder.setPositiveButton(gDPRButtonAccept, cVar);
        builder.setNegativeButton(gDPRButtonDeny, cVar);
        builder.setCancelable(false);
        AlertDialog create = builder.create();
        create.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.vungle.ads.internal.presenter.r
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                y.m55showGdpr$lambda9(y.this, dialogInterface);
            }
        });
        this.currentDialog = create;
        create.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showGdpr$lambda-8, reason: not valid java name */
    public static final void m54showGdpr$lambda8(y this$0, DialogInterface dialogInterface, int i10) {
        String value;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i10 != -2) {
            if (i10 != -1) {
                value = "opted_out_by_timeout";
            } else {
                value = fh.b.OPT_IN.getValue();
            }
        } else {
            value = fh.b.OPT_OUT.getValue();
        }
        fh.c.INSTANCE.updateGdprConsent(value, "vungle_modal", null);
        this$0.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showGdpr$lambda-9, reason: not valid java name */
    public static final void m55showGdpr$lambda9(y this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.currentDialog = null;
    }

    private final void start() {
        if (needShowGdpr()) {
            showGdpr();
        }
    }

    public final void detach() {
        String str;
        String str2;
        String str3;
        List<String> tpatUrls;
        dh.b bVar = this.omTracker;
        if (bVar != null) {
            bVar.stop();
        }
        Dialog dialog = this.currentDialog;
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
        Long l10 = this.adStartTime;
        if (l10 != null) {
            long currentTimeMillis = System.currentTimeMillis() - l10.longValue();
            com.vungle.ads.internal.network.y vungleApiClient = getVungleApiClient();
            bh.z zVar = this.advertisement;
            if (zVar != null) {
                str = zVar.placementId();
            } else {
                str = null;
            }
            bh.z zVar2 = this.advertisement;
            if (zVar2 != null) {
                str2 = zVar2.getCreativeId();
            } else {
                str2 = null;
            }
            bh.z zVar3 = this.advertisement;
            if (zVar3 != null) {
                str3 = zVar3.eventId();
            } else {
                str3 = null;
            }
            com.vungle.ads.internal.network.l lVar = new com.vungle.ads.internal.network.l(vungleApiClient, str, str2, str3, ((com.vungle.ads.internal.executor.f) getExecutors()).getIoExecutor(), getPathProvider(), getSignalManager());
            bh.z zVar4 = this.advertisement;
            if (zVar4 != null && (tpatUrls = zVar4.getTpatUrls("ad.close", String.valueOf(currentTimeMillis), String.valueOf(((com.vungle.ads.internal.platform.b) this.platform).getVolumeLevel()))) != null) {
                lVar.sendTpats(tpatUrls, this.executor);
            }
        }
        b bVar2 = this.bus;
        if (bVar2 != null) {
            bVar2.onNext(TtmlNode.END, null, ((v1) this.delegate).getPlacementRefId());
        }
    }

    public final void initOMTracker(String omSdkData) {
        boolean z10;
        Intrinsics.checkNotNullParameter(omSdkData, "omSdkData");
        bh.z zVar = this.advertisement;
        boolean z11 = false;
        if (zVar != null) {
            z10 = zVar.omEnabled();
        } else {
            z10 = false;
        }
        if (omSdkData.length() > 0) {
            z11 = true;
        }
        if (z11 && f0.INSTANCE.omEnabled() && z10) {
            this.omTracker = new dh.b(omSdkData);
        }
    }

    public final void onImpression() {
        dh.b bVar = this.omTracker;
        if (bVar != null) {
            bVar.impressionOccurred();
        }
    }

    public final void prepare() {
        start();
        b bVar = this.bus;
        if (bVar != null) {
            bVar.onNext("start", null, ((v1) this.delegate).getPlacementRefId());
        }
        this.adStartTime = Long.valueOf(System.currentTimeMillis());
    }

    public final void processCommand(String action, String str) {
        boolean z10;
        List<String> tpatUrls$default;
        String str2;
        String placementRefId;
        String str3;
        Intrinsics.checkNotNullParameter(action, "action");
        boolean z11 = true;
        String str4 = null;
        switch (action.hashCode()) {
            case -511324706:
                if (action.equals("openPrivacy")) {
                    onPrivacy(str);
                    return;
                }
                break;
            case 3566511:
                if (action.equals("tpat")) {
                    if (str != null && str.length() != 0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        com.vungle.ads.s sVar = com.vungle.ads.s.INSTANCE;
                        String placementRefId2 = ((v1) this.delegate).getPlacementRefId();
                        bh.z zVar = this.advertisement;
                        if (zVar != null) {
                            str4 = zVar.getCreativeId();
                        }
                        sVar.logError$vungle_ads_release(129, "Empty tpat key", (r13 & 4) != 0 ? null : placementRefId2, (r13 & 8) != 0 ? null : str4, (r13 & 16) != 0 ? null : null);
                        return;
                    }
                    if (Intrinsics.areEqual(str, "checkpoint.0")) {
                        bh.z zVar2 = this.advertisement;
                        if (zVar2 != null) {
                            tpatUrls$default = zVar2.getTpatUrls(str, ((com.vungle.ads.internal.platform.b) this.platform).getCarrierName(), String.valueOf(((com.vungle.ads.internal.platform.b) this.platform).getVolumeLevel()));
                        }
                        tpatUrls$default = null;
                    } else {
                        bh.z zVar3 = this.advertisement;
                        if (zVar3 != null) {
                            tpatUrls$default = bh.z.getTpatUrls$default(zVar3, str, null, null, 6, null);
                        }
                        tpatUrls$default = null;
                    }
                    List<String> list = tpatUrls$default;
                    if (list != null && !list.isEmpty()) {
                        z11 = false;
                    }
                    if (z11) {
                        com.vungle.ads.s sVar2 = com.vungle.ads.s.INSTANCE;
                        String e2 = vd.e.e("Invalid tpat key: ", str);
                        placementRefId = ((v1) this.delegate).getPlacementRefId();
                        bh.z zVar4 = this.advertisement;
                        if (zVar4 != null) {
                            str4 = zVar4.getCreativeId();
                        }
                        sVar2.logError$vungle_ads_release(128, e2, (r13 & 4) != 0 ? null : placementRefId, (r13 & 8) != 0 ? null : str4, (r13 & 16) != 0 ? null : null);
                        return;
                    }
                    com.vungle.ads.internal.network.y vungleApiClient = getVungleApiClient();
                    String placementRefId3 = ((v1) this.delegate).getPlacementRefId();
                    bh.z zVar5 = this.advertisement;
                    if (zVar5 != null) {
                        str2 = zVar5.getCreativeId();
                    } else {
                        str2 = null;
                    }
                    bh.z zVar6 = this.advertisement;
                    if (zVar6 != null) {
                        str4 = zVar6.eventId();
                    }
                    com.vungle.ads.internal.network.l lVar = new com.vungle.ads.internal.network.l(vungleApiClient, placementRefId3, str2, str4, ((com.vungle.ads.internal.executor.f) getExecutors()).getIoExecutor(), getPathProvider(), getSignalManager());
                    Iterator<T> it = tpatUrls$default.iterator();
                    while (it.hasNext()) {
                        lVar.sendTpat((String) it.next(), this.executor);
                    }
                    return;
                }
                break;
            case 1118284383:
                if (action.equals("videoViewed")) {
                    b bVar = this.bus;
                    if (bVar != null && !this.adViewed) {
                        this.adViewed = true;
                        if (bVar != null) {
                            bVar.onNext("adViewed", null, ((v1) this.delegate).getPlacementRefId());
                        }
                        com.vungle.ads.internal.network.y vungleApiClient2 = getVungleApiClient();
                        String placementRefId4 = ((v1) this.delegate).getPlacementRefId();
                        bh.z zVar7 = this.advertisement;
                        if (zVar7 != null) {
                            str3 = zVar7.getCreativeId();
                        } else {
                            str3 = null;
                        }
                        bh.z zVar8 = this.advertisement;
                        if (zVar8 != null) {
                            str4 = zVar8.eventId();
                        }
                        com.vungle.ads.internal.network.l lVar2 = new com.vungle.ads.internal.network.l(vungleApiClient2, placementRefId4, str3, str4, ((com.vungle.ads.internal.executor.f) getExecutors()).getIoExecutor(), getPathProvider(), getSignalManager());
                        List<String> impressionUrls = ((v1) this.delegate).getImpressionUrls();
                        if (impressionUrls != null) {
                            Iterator<T> it2 = impressionUrls.iterator();
                            while (it2.hasNext()) {
                                lVar2.sendTpat((String) it2.next(), this.executor);
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                break;
            case 1427818632:
                if (action.equals(DOWNLOAD)) {
                    onDownload(str);
                    return;
                }
                break;
        }
        com.vungle.ads.internal.util.v.Companion.w(TAG, "Unknown native ad action: ".concat(action));
    }

    public final void setEventListener(b bVar) {
        this.bus = bVar;
    }

    public final void startTracking(View rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        dh.b bVar = this.omTracker;
        if (bVar != null) {
            bVar.start(rootView);
        }
    }
}
