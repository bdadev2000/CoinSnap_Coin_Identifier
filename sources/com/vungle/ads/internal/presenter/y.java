package com.vungle.ads.internal.presenter;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ContextThemeWrapper;
import android.view.View;
import c7.C0628g;
import c7.C0665z;
import com.applovin.sdk.AppLovinMediationProvider;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vungle.ads.C2137s;
import com.vungle.ads.C2148x0;
import com.vungle.ads.I0;
import com.vungle.ads.ServiceLocator$Companion;
import com.vungle.ads.f1;
import com.vungle.ads.internal.F;
import com.vungle.ads.o1;
import g7.C2309c;
import g7.EnumC2308b;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import t7.AbstractC2712a;
import t7.EnumC2718g;
import t7.InterfaceC2717f;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public final class y {
    public static final s Companion = new s(null);
    public static final String DOWNLOAD = "download";
    public static final String OPEN_PRIVACY = "openPrivacy";
    private static final String TAG = "NativeAdPresenter";
    public static final String TPAT = "tpat";
    public static final String VIDEO_VIEWED = "videoViewed";
    private Long adStartTime;
    private boolean adViewed;
    private final C0665z advertisement;
    private b bus;
    private final Context context;
    private Dialog currentDialog;
    private final z delegate;
    private Executor executor;
    private final InterfaceC2717f executors$delegate;
    private e7.b omTracker;
    private final InterfaceC2717f pathProvider$delegate;
    private final com.vungle.ads.internal.platform.d platform;
    private final InterfaceC2717f signalManager$delegate;
    private final InterfaceC2717f vungleApiClient$delegate;

    public y(Context context, z zVar, C0665z c0665z, Executor executor, com.vungle.ads.internal.platform.d dVar) {
        G7.j.e(context, "context");
        G7.j.e(zVar, "delegate");
        G7.j.e(executor, "executor");
        G7.j.e(dVar, "platform");
        this.context = context;
        this.delegate = zVar;
        this.advertisement = c0665z;
        this.executor = executor;
        this.platform = dVar;
        ServiceLocator$Companion serviceLocator$Companion = f1.Companion;
        EnumC2718g enumC2718g = EnumC2718g.b;
        this.vungleApiClient$delegate = AbstractC2712a.c(enumC2718g, new u(context));
        this.executors$delegate = AbstractC2712a.c(enumC2718g, new v(context));
        this.pathProvider$delegate = AbstractC2712a.c(enumC2718g, new w(context));
        this.signalManager$delegate = AbstractC2712a.c(enumC2718g, new x(context));
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
        if (F.INSTANCE.getGDPRIsCountryDataProtected() && AppLovinMediationProvider.UNKNOWN.equals(C2309c.INSTANCE.getConsentStatus())) {
            return true;
        }
        return false;
    }

    private final void onDownload(String str) {
        List list;
        String str2;
        String str3;
        String str4;
        String str5;
        C0628g adUnit;
        C0665z c0665z = this.advertisement;
        if (c0665z != null) {
            list = C0665z.getTpatUrls$default(c0665z, "clickUrl", null, null, 6, null);
        } else {
            list = null;
        }
        com.vungle.ads.internal.network.y vungleApiClient = getVungleApiClient();
        String placementRefId = ((C2148x0) this.delegate).getPlacementRefId();
        C0665z c0665z2 = this.advertisement;
        if (c0665z2 != null) {
            str2 = c0665z2.getCreativeId();
        } else {
            str2 = null;
        }
        C0665z c0665z3 = this.advertisement;
        if (c0665z3 != null) {
            str3 = c0665z3.eventId();
        } else {
            str3 = null;
        }
        com.vungle.ads.internal.network.l lVar = new com.vungle.ads.internal.network.l(vungleApiClient, placementRefId, str2, str3, ((com.vungle.ads.internal.executor.f) getExecutors()).getIoExecutor(), getPathProvider(), getSignalManager());
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                lVar.sendTpat((String) it.next(), this.executor);
            }
        } else {
            C2137s c2137s = C2137s.INSTANCE;
            String placementRefId2 = ((C2148x0) this.delegate).getPlacementRefId();
            C0665z c0665z4 = this.advertisement;
            if (c0665z4 != null) {
                str4 = c0665z4.getCreativeId();
            } else {
                str4 = null;
            }
            c2137s.logError$vungle_ads_release(129, "Empty tpat key: clickUrl", (r13 & 4) != 0 ? null : placementRefId2, (r13 & 8) != 0 ? null : str4, (r13 & 16) != 0 ? null : null);
        }
        if (str != null) {
            lVar.sendTpat(str, this.executor);
        }
        C0665z c0665z5 = this.advertisement;
        if (c0665z5 != null && (adUnit = c0665z5.adUnit()) != null) {
            str5 = adUnit.getDeeplinkUrl();
        } else {
            str5 = null;
        }
        com.vungle.ads.internal.util.l.launch(str5, str, this.context, new com.vungle.ads.internal.ui.l(this.bus, null), new t(this, lVar));
        b bVar = this.bus;
        if (bVar != null) {
            bVar.onNext(q.OPEN, "adClick", ((C2148x0) this.delegate).getPlacementRefId());
        }
    }

    private final void onPrivacy(String str) {
        String str2;
        if (str != null) {
            String str3 = null;
            if (!com.vungle.ads.internal.util.n.INSTANCE.isValidUrl(str)) {
                o1 placementId$vungle_ads_release = new I0(str).setPlacementId$vungle_ads_release(((C2148x0) this.delegate).getPlacementRefId());
                C0665z c0665z = this.advertisement;
                if (c0665z != null) {
                    str2 = c0665z.getCreativeId();
                } else {
                    str2 = null;
                }
                o1 creativeId$vungle_ads_release = placementId$vungle_ads_release.setCreativeId$vungle_ads_release(str2);
                C0665z c0665z2 = this.advertisement;
                if (c0665z2 != null) {
                    str3 = c0665z2.eventId();
                }
                creativeId$vungle_ads_release.setEventId$vungle_ads_release(str3).logErrorNoReturnValue$vungle_ads_release();
                return;
            }
            if (!com.vungle.ads.internal.util.l.launch(null, str, this.context, new com.vungle.ads.internal.ui.l(this.bus, ((C2148x0) this.delegate).getPlacementRefId()), null)) {
                new I0(str).logErrorNoReturnValue$vungle_ads_release();
            }
        }
    }

    public static /* synthetic */ void processCommand$default(y yVar, String str, String str2, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            str2 = null;
        }
        yVar.processCommand(str, str2);
    }

    private final void showGdpr() {
        C2309c.INSTANCE.updateGdprConsent("opted_out_by_timeout", "vungle_modal", null);
        if (!(this.context instanceof Activity)) {
            com.vungle.ads.internal.util.v.Companion.w(TAG, "We can not show GDPR dialog with application context.");
            return;
        }
        com.facebook.login.g gVar = new com.facebook.login.g(this, 1);
        F f9 = F.INSTANCE;
        String gDPRConsentTitle = f9.getGDPRConsentTitle();
        String gDPRConsentMessage = f9.getGDPRConsentMessage();
        String gDPRButtonAccept = f9.getGDPRButtonAccept();
        String gDPRButtonDeny = f9.getGDPRButtonDeny();
        Context context = this.context;
        AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(context, ((Activity) context).getApplicationInfo().theme));
        if (gDPRConsentTitle != null && gDPRConsentTitle.length() != 0) {
            builder.setTitle(gDPRConsentTitle);
        }
        if (gDPRConsentMessage != null && gDPRConsentMessage.length() != 0) {
            builder.setMessage(gDPRConsentMessage);
        }
        builder.setPositiveButton(gDPRButtonAccept, gVar);
        builder.setNegativeButton(gDPRButtonDeny, gVar);
        builder.setCancelable(false);
        AlertDialog create = builder.create();
        create.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.vungle.ads.internal.presenter.r
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                y.m75showGdpr$lambda9(y.this, dialogInterface);
            }
        });
        this.currentDialog = create;
        create.show();
    }

    /* renamed from: showGdpr$lambda-8 */
    public static final void m74showGdpr$lambda8(y yVar, DialogInterface dialogInterface, int i9) {
        String value;
        G7.j.e(yVar, "this$0");
        if (i9 != -2) {
            if (i9 != -1) {
                value = "opted_out_by_timeout";
            } else {
                value = EnumC2308b.OPT_IN.getValue();
            }
        } else {
            value = EnumC2308b.OPT_OUT.getValue();
        }
        C2309c.INSTANCE.updateGdprConsent(value, "vungle_modal", null);
        yVar.start();
    }

    /* renamed from: showGdpr$lambda-9 */
    public static final void m75showGdpr$lambda9(y yVar, DialogInterface dialogInterface) {
        G7.j.e(yVar, "this$0");
        yVar.currentDialog = null;
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
        e7.b bVar = this.omTracker;
        if (bVar != null) {
            bVar.stop();
        }
        Dialog dialog = this.currentDialog;
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
        Long l = this.adStartTime;
        if (l != null) {
            long currentTimeMillis = System.currentTimeMillis() - l.longValue();
            com.vungle.ads.internal.network.y vungleApiClient = getVungleApiClient();
            C0665z c0665z = this.advertisement;
            if (c0665z != null) {
                str = c0665z.placementId();
            } else {
                str = null;
            }
            C0665z c0665z2 = this.advertisement;
            if (c0665z2 != null) {
                str2 = c0665z2.getCreativeId();
            } else {
                str2 = null;
            }
            C0665z c0665z3 = this.advertisement;
            if (c0665z3 != null) {
                str3 = c0665z3.eventId();
            } else {
                str3 = null;
            }
            com.vungle.ads.internal.network.l lVar = new com.vungle.ads.internal.network.l(vungleApiClient, str, str2, str3, ((com.vungle.ads.internal.executor.f) getExecutors()).getIoExecutor(), getPathProvider(), getSignalManager());
            C0665z c0665z4 = this.advertisement;
            if (c0665z4 != null && (tpatUrls = c0665z4.getTpatUrls("ad.close", String.valueOf(currentTimeMillis), String.valueOf(((com.vungle.ads.internal.platform.b) this.platform).getVolumeLevel()))) != null) {
                lVar.sendTpats(tpatUrls, this.executor);
            }
        }
        b bVar2 = this.bus;
        if (bVar2 != null) {
            bVar2.onNext(TtmlNode.END, null, ((C2148x0) this.delegate).getPlacementRefId());
        }
    }

    public final void initOMTracker(String str) {
        boolean z8;
        G7.j.e(str, "omSdkData");
        C0665z c0665z = this.advertisement;
        if (c0665z != null) {
            z8 = c0665z.omEnabled();
        } else {
            z8 = false;
        }
        if (str.length() > 0 && F.INSTANCE.omEnabled() && z8) {
            this.omTracker = new e7.b(str);
        }
    }

    public final void onImpression() {
        e7.b bVar = this.omTracker;
        if (bVar != null) {
            bVar.impressionOccurred();
        }
    }

    public final void prepare() {
        start();
        b bVar = this.bus;
        if (bVar != null) {
            bVar.onNext("start", null, ((C2148x0) this.delegate).getPlacementRefId());
        }
        this.adStartTime = Long.valueOf(System.currentTimeMillis());
    }

    public final void processCommand(String str, String str2) {
        C2137s c2137s;
        List<String> tpatUrls$default;
        String str3;
        String str4;
        G7.j.e(str, "action");
        String str5 = null;
        switch (str.hashCode()) {
            case -511324706:
                if (str.equals("openPrivacy")) {
                    onPrivacy(str2);
                    return;
                }
                break;
            case 3566511:
                if (str.equals("tpat")) {
                    if (str2 != null && str2.length() != 0) {
                        if (G7.j.a(str2, "checkpoint.0")) {
                            C0665z c0665z = this.advertisement;
                            if (c0665z != null) {
                                tpatUrls$default = c0665z.getTpatUrls(str2, ((com.vungle.ads.internal.platform.b) this.platform).getCarrierName(), String.valueOf(((com.vungle.ads.internal.platform.b) this.platform).getVolumeLevel()));
                            }
                            tpatUrls$default = null;
                        } else {
                            C0665z c0665z2 = this.advertisement;
                            if (c0665z2 != null) {
                                tpatUrls$default = C0665z.getTpatUrls$default(c0665z2, str2, null, null, 6, null);
                            }
                            tpatUrls$default = null;
                        }
                        List<String> list = tpatUrls$default;
                        if (list != null && !list.isEmpty()) {
                            com.vungle.ads.internal.network.y vungleApiClient = getVungleApiClient();
                            String placementRefId = ((C2148x0) this.delegate).getPlacementRefId();
                            C0665z c0665z3 = this.advertisement;
                            if (c0665z3 != null) {
                                str3 = c0665z3.getCreativeId();
                            } else {
                                str3 = null;
                            }
                            C0665z c0665z4 = this.advertisement;
                            if (c0665z4 != null) {
                                str5 = c0665z4.eventId();
                            }
                            com.vungle.ads.internal.network.l lVar = new com.vungle.ads.internal.network.l(vungleApiClient, placementRefId, str3, str5, ((com.vungle.ads.internal.executor.f) getExecutors()).getIoExecutor(), getPathProvider(), getSignalManager());
                            Iterator<T> it = tpatUrls$default.iterator();
                            while (it.hasNext()) {
                                lVar.sendTpat((String) it.next(), this.executor);
                            }
                            return;
                        }
                        C2137s c2137s2 = C2137s.INSTANCE;
                        String d2 = AbstractC2914a.d("Invalid tpat key: ", str2);
                        String placementRefId2 = ((C2148x0) this.delegate).getPlacementRefId();
                        C0665z c0665z5 = this.advertisement;
                        if (c0665z5 != null) {
                            str5 = c0665z5.getCreativeId();
                        }
                        c2137s2.logError$vungle_ads_release(128, d2, (r13 & 4) != 0 ? null : placementRefId2, (r13 & 8) != 0 ? null : str5, (r13 & 16) != 0 ? null : null);
                        return;
                    }
                    c2137s = C2137s.INSTANCE;
                    String placementRefId3 = ((C2148x0) this.delegate).getPlacementRefId();
                    C0665z c0665z6 = this.advertisement;
                    if (c0665z6 != null) {
                        str5 = c0665z6.getCreativeId();
                    }
                    c2137s.logError$vungle_ads_release(129, "Empty tpat key", (r13 & 4) != 0 ? null : placementRefId3, (r13 & 8) != 0 ? null : str5, (r13 & 16) != 0 ? null : null);
                    return;
                }
                break;
            case 1118284383:
                if (str.equals("videoViewed")) {
                    b bVar = this.bus;
                    if (bVar != null && !this.adViewed) {
                        this.adViewed = true;
                        if (bVar != null) {
                            bVar.onNext("adViewed", null, ((C2148x0) this.delegate).getPlacementRefId());
                        }
                        com.vungle.ads.internal.network.y vungleApiClient2 = getVungleApiClient();
                        String placementRefId4 = ((C2148x0) this.delegate).getPlacementRefId();
                        C0665z c0665z7 = this.advertisement;
                        if (c0665z7 != null) {
                            str4 = c0665z7.getCreativeId();
                        } else {
                            str4 = null;
                        }
                        C0665z c0665z8 = this.advertisement;
                        if (c0665z8 != null) {
                            str5 = c0665z8.eventId();
                        }
                        com.vungle.ads.internal.network.l lVar2 = new com.vungle.ads.internal.network.l(vungleApiClient2, placementRefId4, str4, str5, ((com.vungle.ads.internal.executor.f) getExecutors()).getIoExecutor(), getPathProvider(), getSignalManager());
                        List<String> impressionUrls = ((C2148x0) this.delegate).getImpressionUrls();
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
                if (str.equals(DOWNLOAD)) {
                    onDownload(str2);
                    return;
                }
                break;
        }
        com.vungle.ads.internal.util.v.Companion.w(TAG, "Unknown native ad action: ".concat(str));
    }

    public final void setEventListener(b bVar) {
        this.bus = bVar;
    }

    public final void startTracking(View view) {
        G7.j.e(view, "rootView");
        e7.b bVar = this.omTracker;
        if (bVar != null) {
            bVar.start(view);
        }
    }
}
