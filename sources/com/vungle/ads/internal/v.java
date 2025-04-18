package com.vungle.ads.internal;

import android.content.Context;
import bh.o3;
import com.vungle.ads.ServiceLocator$Companion;
import com.vungle.ads.e3;
import com.vungle.ads.f1;
import com.vungle.ads.g3;
import com.vungle.ads.n3;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonKt;

/* loaded from: classes4.dex */
public abstract class v implements com.vungle.ads.internal.load.a {
    private static final String TAG = "AdInternal";
    private static final boolean THROW_ON_ILLEGAL_TRANSITION = false;
    private com.vungle.ads.internal.load.a adLoaderCallback;
    private g adState;
    private bh.z advertisement;
    private com.vungle.ads.internal.load.j baseAdLoader;
    private bh.i0 bidPayload;
    private final Context context;
    private o3 placement;
    private WeakReference<Context> playContext;
    private g3 requestMetric;
    private final Lazy signalManager$delegate;
    private final Lazy vungleApiClient$delegate;
    public static final i Companion = new i(null);
    private static final Json json = JsonKt.Json$default(null, h.INSTANCE, 1, null);

    public v(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.adState = g.NEW;
        ServiceLocator$Companion serviceLocator$Companion = e3.Companion;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        this.vungleApiClient$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new t(context));
        this.signalManager$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new u(context));
    }

    /* renamed from: _set_adState_$lambda-1$lambda-0 */
    private static final com.vungle.ads.internal.task.j m72_set_adState_$lambda1$lambda0(Lazy<? extends com.vungle.ads.internal.task.j> lazy) {
        return lazy.getValue();
    }

    public static /* synthetic */ n3 canPlayAd$default(v vVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: canPlayAd");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return vVar.canPlayAd(z10);
    }

    private final com.vungle.ads.internal.signals.j getSignalManager() {
        return (com.vungle.ads.internal.signals.j) this.signalManager$delegate.getValue();
    }

    private final com.vungle.ads.internal.network.y getVungleApiClient() {
        return (com.vungle.ads.internal.network.y) this.vungleApiClient$delegate.getValue();
    }

    /* renamed from: loadAd$lambda-2 */
    private static final dh.d m73loadAd$lambda2(Lazy<dh.d> lazy) {
        return lazy.getValue();
    }

    /* renamed from: loadAd$lambda-3 */
    private static final com.vungle.ads.internal.executor.f m74loadAd$lambda3(Lazy<com.vungle.ads.internal.executor.f> lazy) {
        return lazy.getValue();
    }

    /* renamed from: loadAd$lambda-4 */
    private static final com.vungle.ads.internal.util.x m75loadAd$lambda4(Lazy<com.vungle.ads.internal.util.x> lazy) {
        return lazy.getValue();
    }

    /* renamed from: loadAd$lambda-5 */
    private static final com.vungle.ads.internal.downloader.p m76loadAd$lambda5(Lazy<? extends com.vungle.ads.internal.downloader.p> lazy) {
        return lazy.getValue();
    }

    /* renamed from: onSuccess$lambda-9$lambda-6 */
    private static final com.vungle.ads.internal.executor.f m77onSuccess$lambda9$lambda6(Lazy<com.vungle.ads.internal.executor.f> lazy) {
        return lazy.getValue();
    }

    /* renamed from: onSuccess$lambda-9$lambda-7 */
    private static final com.vungle.ads.internal.util.x m78onSuccess$lambda9$lambda7(Lazy<com.vungle.ads.internal.util.x> lazy) {
        return lazy.getValue();
    }

    public void adLoadedAndUpdateConfigure$vungle_ads_release(bh.z advertisement) {
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
    }

    public final n3 canPlayAd(boolean z10) {
        n3 f1Var;
        String str;
        String str2;
        bh.z zVar = this.advertisement;
        String str3 = null;
        if (zVar == null) {
            f1Var = new com.vungle.ads.i();
        } else {
            boolean z11 = false;
            if (zVar != null && zVar.hasExpired()) {
                z11 = true;
            }
            if (z11) {
                if (z10) {
                    f1Var = new com.vungle.ads.f();
                } else {
                    f1Var = new com.vungle.ads.e();
                }
            } else {
                g gVar = this.adState;
                if (gVar == g.PLAYING) {
                    f1Var = new com.vungle.ads.t0();
                } else {
                    if (gVar == g.READY) {
                        return null;
                    }
                    f1Var = new f1(0, null, null, null, null, null, 63, null);
                }
            }
        }
        if (z10) {
            o3 o3Var = this.placement;
            if (o3Var != null) {
                str = o3Var.getReferenceId();
            } else {
                str = null;
            }
            n3 placementId$vungle_ads_release = f1Var.setPlacementId$vungle_ads_release(str);
            bh.z zVar2 = this.advertisement;
            if (zVar2 != null) {
                str2 = zVar2.getCreativeId();
            } else {
                str2 = null;
            }
            n3 creativeId$vungle_ads_release = placementId$vungle_ads_release.setCreativeId$vungle_ads_release(str2);
            bh.z zVar3 = this.advertisement;
            if (zVar3 != null) {
                str3 = zVar3.eventId();
            }
            creativeId$vungle_ads_release.setEventId$vungle_ads_release(str3).logErrorNoReturnValue$vungle_ads_release();
        }
        return f1Var;
    }

    public final void cancelDownload$vungle_ads_release() {
        com.vungle.ads.internal.load.j jVar = this.baseAdLoader;
        if (jVar != null) {
            jVar.cancel();
        }
    }

    public abstract String getAdSizeForAdRequest();

    public final g getAdState() {
        return this.adState;
    }

    public final bh.z getAdvertisement() {
        return this.advertisement;
    }

    public final bh.i0 getBidPayload() {
        return this.bidPayload;
    }

    public final Context getContext() {
        return this.context;
    }

    public final o3 getPlacement() {
        return this.placement;
    }

    public final boolean isErrorTerminal$vungle_ads_release(int i10) {
        return this.adState == g.READY && i10 == 304;
    }

    public abstract boolean isValidAdSize(String str);

    public abstract boolean isValidAdTypeForPlacement(o3 o3Var);

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        if (r7 == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0096, code lost:
    
        r28.onFailure(new com.vungle.ads.h1(r26).logError$vungle_ads_release());
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0094, code lost:
    
        if (r7 == false) goto L134;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.jvm.internal.DefaultConstructorMarker, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void loadAd(java.lang.String r26, java.lang.String r27, com.vungle.ads.internal.load.a r28) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.v.loadAd(java.lang.String, java.lang.String, com.vungle.ads.internal.load.a):void");
    }

    @Override // com.vungle.ads.internal.load.a
    public void onFailure(n3 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        setAdState(g.ERROR);
        com.vungle.ads.internal.load.a aVar = this.adLoaderCallback;
        if (aVar != null) {
            aVar.onFailure(error);
        }
    }

    @Override // com.vungle.ads.internal.load.a
    public void onSuccess(bh.z advertisement) {
        String str;
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        this.advertisement = advertisement;
        setAdState(g.READY);
        adLoadedAndUpdateConfigure$vungle_ads_release(advertisement);
        com.vungle.ads.internal.load.a aVar = this.adLoaderCallback;
        if (aVar != null) {
            aVar.onSuccess(advertisement);
        }
        g3 g3Var = this.requestMetric;
        if (g3Var != null) {
            g3Var.markEnd();
            com.vungle.ads.s sVar = com.vungle.ads.s.INSTANCE;
            o3 o3Var = this.placement;
            if (o3Var != null) {
                str = o3Var.getReferenceId();
            } else {
                str = null;
            }
            com.vungle.ads.s.logMetric$vungle_ads_release$default(sVar, g3Var, str, advertisement.getCreativeId(), advertisement.eventId(), (String) null, 16, (Object) null);
            long calculateIntervalDuration = g3Var.calculateIntervalDuration();
            ServiceLocator$Companion serviceLocator$Companion = e3.Companion;
            Context context = this.context;
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
            Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new p(context));
            Lazy lazy2 = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new q(this.context));
            List tpatUrls$default = bh.z.getTpatUrls$default(advertisement, "ad.loadDuration", String.valueOf(calculateIntervalDuration), null, 4, null);
            if (tpatUrls$default != null) {
                new com.vungle.ads.internal.network.l(getVungleApiClient(), advertisement.placementId(), advertisement.getCreativeId(), advertisement.eventId(), m77onSuccess$lambda9$lambda6(lazy).getIoExecutor(), m78onSuccess$lambda9$lambda7(lazy2), getSignalManager()).sendTpats(tpatUrls$default, m77onSuccess$lambda9$lambda6(lazy).getJobExecutor());
            }
        }
    }

    public final void play(Context context, com.vungle.ads.internal.presenter.c adPlayCallback) {
        WeakReference<Context> weakReference;
        bh.z zVar;
        Intrinsics.checkNotNullParameter(adPlayCallback, "adPlayCallback");
        if (context != null) {
            weakReference = new WeakReference<>(context);
        } else {
            weakReference = null;
        }
        this.playContext = weakReference;
        n3 canPlayAd = canPlayAd(true);
        if (canPlayAd != null) {
            adPlayCallback.onFailure(canPlayAd);
            if (isErrorTerminal$vungle_ads_release(canPlayAd.getCode())) {
                setAdState(g.ERROR);
                return;
            }
            return;
        }
        o3 o3Var = this.placement;
        if (o3Var == null || (zVar = this.advertisement) == null) {
            return;
        }
        r rVar = new r(adPlayCallback, this);
        cancelDownload$vungle_ads_release();
        renderAd$vungle_ads_release(rVar, o3Var, zVar);
    }

    public void renderAd$vungle_ads_release(com.vungle.ads.internal.presenter.c cVar, o3 placement, bh.z advertisement) {
        Context context;
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        com.vungle.ads.internal.ui.a aVar = com.vungle.ads.internal.ui.i.Companion;
        aVar.setEventListener$vungle_ads_release(new s(cVar, placement));
        aVar.setAdvertisement$vungle_ads_release(advertisement);
        aVar.setBidPayload$vungle_ads_release(this.bidPayload);
        WeakReference<Context> weakReference = this.playContext;
        if (weakReference == null || (context = weakReference.get()) == null) {
            context = this.context;
        }
        Intrinsics.checkNotNullExpressionValue(context, "playContext?.get() ?: context");
        com.vungle.ads.internal.util.h.Companion.startWhenForeground(context, null, aVar.createIntent(context, placement.getReferenceId(), advertisement.eventId()), null);
    }

    public final void setAdState(g value) {
        bh.z zVar;
        String eventId;
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.isTerminalState() && (zVar = this.advertisement) != null && (eventId = zVar.eventId()) != null) {
            ServiceLocator$Companion serviceLocator$Companion = e3.Companion;
            ((com.vungle.ads.internal.task.w) m72_set_adState_$lambda1$lambda0(LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new k(this.context)))).execute(com.vungle.ads.internal.task.c.Companion.makeJobInfo(eventId));
        }
        this.adState = this.adState.transitionTo(value);
    }

    public final void setAdvertisement(bh.z zVar) {
        this.advertisement = zVar;
    }

    public final void setBidPayload(bh.i0 i0Var) {
        this.bidPayload = i0Var;
    }

    public final void setPlacement(o3 o3Var) {
        this.placement = o3Var;
    }
}
