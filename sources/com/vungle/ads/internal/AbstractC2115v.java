package com.vungle.ads.internal;

import a.AbstractC0325a;
import android.content.Context;
import c7.C0665z;
import c7.p1;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.vungle.ads.C2074d0;
import com.vungle.ads.C2075e;
import com.vungle.ads.C2077f;
import com.vungle.ads.C2081h;
import com.vungle.ads.C2082h0;
import com.vungle.ads.C2083i;
import com.vungle.ads.C2121j0;
import com.vungle.ads.C2137s;
import com.vungle.ads.G0;
import com.vungle.ads.H0;
import com.vungle.ads.O0;
import com.vungle.ads.ServiceLocator$Companion;
import com.vungle.ads.f1;
import com.vungle.ads.h1;
import com.vungle.ads.m1;
import com.vungle.ads.o1;
import java.lang.ref.WeakReference;
import java.util.List;
import t7.AbstractC2712a;
import t7.EnumC2718g;
import t7.InterfaceC2717f;

/* renamed from: com.vungle.ads.internal.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2115v implements com.vungle.ads.internal.load.a {
    private static final String TAG = "AdInternal";
    private static final boolean THROW_ON_ILLEGAL_TRANSITION = false;
    private com.vungle.ads.internal.load.a adLoaderCallback;
    private EnumC2091g adState;
    private C0665z advertisement;
    private com.vungle.ads.internal.load.j baseAdLoader;
    private c7.I bidPayload;
    private final Context context;
    private p1 placement;
    private WeakReference<Context> playContext;
    private h1 requestMetric;
    private final InterfaceC2717f signalManager$delegate;
    private final InterfaceC2717f vungleApiClient$delegate;
    public static final C2093i Companion = new C2093i(null);
    private static final f8.b json = R2.b.a(C2092h.INSTANCE);

    public AbstractC2115v(Context context) {
        G7.j.e(context, "context");
        this.context = context;
        this.adState = EnumC2091g.NEW;
        ServiceLocator$Companion serviceLocator$Companion = f1.Companion;
        EnumC2718g enumC2718g = EnumC2718g.b;
        this.vungleApiClient$delegate = AbstractC2712a.c(enumC2718g, new C2106t(context));
        this.signalManager$delegate = AbstractC2712a.c(enumC2718g, new C2107u(context));
    }

    /* renamed from: _set_adState_$lambda-1$lambda-0, reason: not valid java name */
    private static final com.vungle.ads.internal.task.j m92_set_adState_$lambda1$lambda0(InterfaceC2717f interfaceC2717f) {
        return (com.vungle.ads.internal.task.j) interfaceC2717f.getValue();
    }

    public static /* synthetic */ o1 canPlayAd$default(AbstractC2115v abstractC2115v, boolean z8, int i9, Object obj) {
        if (obj == null) {
            if ((i9 & 1) != 0) {
                z8 = false;
            }
            return abstractC2115v.canPlayAd(z8);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: canPlayAd");
    }

    private final com.vungle.ads.internal.signals.j getSignalManager() {
        return (com.vungle.ads.internal.signals.j) this.signalManager$delegate.getValue();
    }

    private final com.vungle.ads.internal.network.y getVungleApiClient() {
        return (com.vungle.ads.internal.network.y) this.vungleApiClient$delegate.getValue();
    }

    /* renamed from: loadAd$lambda-2, reason: not valid java name */
    private static final e7.d m93loadAd$lambda2(InterfaceC2717f interfaceC2717f) {
        return (e7.d) interfaceC2717f.getValue();
    }

    /* renamed from: loadAd$lambda-3, reason: not valid java name */
    private static final com.vungle.ads.internal.executor.f m94loadAd$lambda3(InterfaceC2717f interfaceC2717f) {
        return (com.vungle.ads.internal.executor.f) interfaceC2717f.getValue();
    }

    /* renamed from: loadAd$lambda-4, reason: not valid java name */
    private static final com.vungle.ads.internal.util.x m95loadAd$lambda4(InterfaceC2717f interfaceC2717f) {
        return (com.vungle.ads.internal.util.x) interfaceC2717f.getValue();
    }

    /* renamed from: loadAd$lambda-5, reason: not valid java name */
    private static final com.vungle.ads.internal.downloader.p m96loadAd$lambda5(InterfaceC2717f interfaceC2717f) {
        return (com.vungle.ads.internal.downloader.p) interfaceC2717f.getValue();
    }

    /* renamed from: onSuccess$lambda-9$lambda-6, reason: not valid java name */
    private static final com.vungle.ads.internal.executor.f m97onSuccess$lambda9$lambda6(InterfaceC2717f interfaceC2717f) {
        return (com.vungle.ads.internal.executor.f) interfaceC2717f.getValue();
    }

    /* renamed from: onSuccess$lambda-9$lambda-7, reason: not valid java name */
    private static final com.vungle.ads.internal.util.x m98onSuccess$lambda9$lambda7(InterfaceC2717f interfaceC2717f) {
        return (com.vungle.ads.internal.util.x) interfaceC2717f.getValue();
    }

    public void adLoadedAndUpdateConfigure$vungle_ads_release(C0665z c0665z) {
        G7.j.e(c0665z, "advertisement");
    }

    public final o1 canPlayAd(boolean z8) {
        o1 c2082h0;
        String str;
        String str2;
        C0665z c0665z = this.advertisement;
        String str3 = null;
        if (c0665z == null) {
            c2082h0 = new C2083i();
        } else if (c0665z != null && c0665z.hasExpired()) {
            if (z8) {
                c2082h0 = new C2077f();
            } else {
                c2082h0 = new C2075e();
            }
        } else {
            EnumC2091g enumC2091g = this.adState;
            if (enumC2091g == EnumC2091g.PLAYING) {
                c2082h0 = new com.vungle.ads.V();
            } else {
                if (enumC2091g == EnumC2091g.READY) {
                    return null;
                }
                c2082h0 = new C2082h0(0, null, null, null, null, null, 63, null);
            }
        }
        if (z8) {
            p1 p1Var = this.placement;
            if (p1Var != null) {
                str = p1Var.getReferenceId();
            } else {
                str = null;
            }
            o1 placementId$vungle_ads_release = c2082h0.setPlacementId$vungle_ads_release(str);
            C0665z c0665z2 = this.advertisement;
            if (c0665z2 != null) {
                str2 = c0665z2.getCreativeId();
            } else {
                str2 = null;
            }
            o1 creativeId$vungle_ads_release = placementId$vungle_ads_release.setCreativeId$vungle_ads_release(str2);
            C0665z c0665z3 = this.advertisement;
            if (c0665z3 != null) {
                str3 = c0665z3.eventId();
            }
            creativeId$vungle_ads_release.setEventId$vungle_ads_release(str3).logErrorNoReturnValue$vungle_ads_release();
        }
        return c2082h0;
    }

    public final void cancelDownload$vungle_ads_release() {
        com.vungle.ads.internal.load.j jVar = this.baseAdLoader;
        if (jVar != null) {
            jVar.cancel();
        }
    }

    public abstract String getAdSizeForAdRequest();

    public final EnumC2091g getAdState() {
        return this.adState;
    }

    public final C0665z getAdvertisement() {
        return this.advertisement;
    }

    public final c7.I getBidPayload() {
        return this.bidPayload;
    }

    public final Context getContext() {
        return this.context;
    }

    public final p1 getPlacement() {
        return this.placement;
    }

    public final boolean isErrorTerminal$vungle_ads_release(int i9) {
        if (this.adState == EnumC2091g.READY && i9 == 304) {
            return true;
        }
        return false;
    }

    public abstract boolean isValidAdSize(String str);

    public abstract boolean isValidAdTypeForPlacement(p1 p1Var);

    public final void loadAd(String str, String str2, com.vungle.ads.internal.load.a aVar) {
        com.vungle.ads.internal.protos.n nVar;
        String str3;
        String str4;
        int i9;
        String str5;
        G7.j.e(str, "placementId");
        G7.j.e(aVar, "adLoaderCallback");
        this.adLoaderCallback = aVar;
        if (!m1.Companion.isInitialized()) {
            aVar.onFailure(new O0());
            return;
        }
        F f9 = F.INSTANCE;
        p1 placement = f9.getPlacement(str);
        if (placement == null) {
            aVar.onFailure(new H0(str).logError$vungle_ads_release());
            return;
        }
        this.placement = placement;
        if (!isValidAdTypeForPlacement(placement)) {
            aVar.onFailure(new G0(placement.getReferenceId()).logError$vungle_ads_release());
            return;
        }
        String adSizeForAdRequest = getAdSizeForAdRequest();
        String str6 = null;
        byte b = 0;
        byte b8 = 0;
        if (!isValidAdSize(adSizeForAdRequest)) {
            aVar.onFailure(new C2074d0(o1.INVALID_SIZE, b8 == true ? 1 : 0, 2, b == true ? 1 : 0));
            return;
        }
        if ((placement.getHeaderBidding() && (str2 == null || str2.length() == 0)) || (!placement.getHeaderBidding() && str2 != null && str2.length() != 0)) {
            aVar.onFailure(new C2121j0(str).logError$vungle_ads_release());
            return;
        }
        EnumC2091g enumC2091g = this.adState;
        if (enumC2091g != EnumC2091g.NEW) {
            switch (AbstractC2094j.$EnumSwitchMapping$0[enumC2091g.ordinal()]) {
                case 1:
                    throw new Error("An operation is not implemented.");
                case 2:
                    i9 = 203;
                    break;
                case 3:
                    i9 = 204;
                    break;
                case 4:
                    i9 = 205;
                    break;
                case 5:
                    i9 = 202;
                    break;
                case 6:
                    i9 = 206;
                    break;
                default:
                    throw new RuntimeException();
            }
            com.vungle.ads.internal.protos.g codeToLoggableReason = o1.Companion.codeToLoggableReason(i9);
            String str7 = this.adState + " state is incorrect for load";
            C0665z c0665z = this.advertisement;
            if (c0665z != null) {
                str5 = c0665z.getCreativeId();
            } else {
                str5 = null;
            }
            C0665z c0665z2 = this.advertisement;
            if (c0665z2 != null) {
                str6 = c0665z2.eventId();
            }
            aVar.onFailure(new C2082h0(o1.INVALID_AD_STATE, codeToLoggableReason, str7, str, str5, str6).logError$vungle_ads_release());
            return;
        }
        if (f9.adLoadOptimizationEnabled()) {
            nVar = com.vungle.ads.internal.protos.n.AD_REQUEST_TO_CALLBACK_ADO_DURATION_MS;
        } else {
            nVar = com.vungle.ads.internal.protos.n.AD_REQUEST_TO_CALLBACK_DURATION_MS;
        }
        h1 h1Var = new h1(nVar);
        this.requestMetric = h1Var;
        h1Var.markStart();
        if (str2 != null && str2.length() != 0) {
            try {
                f8.b bVar = json;
                this.bidPayload = (c7.I) bVar.a(AbstractC0325a.q(bVar.b, G7.s.b(c7.I.class)), str2);
            } catch (IllegalArgumentException e4) {
                C2137s c2137s = C2137s.INSTANCE;
                String str8 = "Unable to decode payload into BidPayload object. Error: " + e4.getLocalizedMessage();
                C0665z c0665z3 = this.advertisement;
                if (c0665z3 != null) {
                    str4 = c0665z3.eventId();
                } else {
                    str4 = null;
                }
                c2137s.logError$vungle_ads_release(213, str8, (r13 & 4) != 0 ? null : str, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : str4);
                aVar.onFailure(new C2081h());
                return;
            } catch (Throwable th) {
                C2137s c2137s2 = C2137s.INSTANCE;
                String str9 = "Unable to decode payload into BidPayload object. Error: " + th.getLocalizedMessage();
                C0665z c0665z4 = this.advertisement;
                if (c0665z4 != null) {
                    str3 = c0665z4.eventId();
                } else {
                    str3 = null;
                }
                c2137s2.logError$vungle_ads_release(209, str9, (r13 & 4) != 0 ? null : str, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : str3);
                aVar.onFailure(new C2081h());
                return;
            }
        }
        setAdState(EnumC2091g.LOADING);
        ServiceLocator$Companion serviceLocator$Companion = f1.Companion;
        Context context = this.context;
        EnumC2718g enumC2718g = EnumC2718g.b;
        InterfaceC2717f c9 = AbstractC2712a.c(enumC2718g, new C2096l(context));
        InterfaceC2717f c10 = AbstractC2712a.c(enumC2718g, new C2097m(this.context));
        InterfaceC2717f c11 = AbstractC2712a.c(enumC2718g, new C2098n(this.context));
        InterfaceC2717f c12 = AbstractC2712a.c(enumC2718g, new C2101o(this.context));
        if (str2 != null && str2.length() != 0) {
            com.vungle.ads.internal.load.t tVar = new com.vungle.ads.internal.load.t(this.context, getVungleApiClient(), m94loadAd$lambda3(c10), m93loadAd$lambda2(c9), m96loadAd$lambda5(c12), m95loadAd$lambda4(c11), new com.vungle.ads.internal.load.b(placement, this.bidPayload, adSizeForAdRequest));
            this.baseAdLoader = tVar;
            tVar.loadAd(this);
            return;
        }
        com.vungle.ads.internal.load.l lVar = new com.vungle.ads.internal.load.l(this.context, getVungleApiClient(), m94loadAd$lambda3(c10), m93loadAd$lambda2(c9), m96loadAd$lambda5(c12), m95loadAd$lambda4(c11), new com.vungle.ads.internal.load.b(placement, null, adSizeForAdRequest));
        this.baseAdLoader = lVar;
        lVar.loadAd(this);
    }

    @Override // com.vungle.ads.internal.load.a
    public void onFailure(o1 o1Var) {
        G7.j.e(o1Var, "error");
        setAdState(EnumC2091g.ERROR);
        com.vungle.ads.internal.load.a aVar = this.adLoaderCallback;
        if (aVar != null) {
            aVar.onFailure(o1Var);
        }
    }

    @Override // com.vungle.ads.internal.load.a
    public void onSuccess(C0665z c0665z) {
        String str;
        G7.j.e(c0665z, "advertisement");
        this.advertisement = c0665z;
        setAdState(EnumC2091g.READY);
        adLoadedAndUpdateConfigure$vungle_ads_release(c0665z);
        com.vungle.ads.internal.load.a aVar = this.adLoaderCallback;
        if (aVar != null) {
            aVar.onSuccess(c0665z);
        }
        h1 h1Var = this.requestMetric;
        if (h1Var != null) {
            h1Var.markEnd();
            C2137s c2137s = C2137s.INSTANCE;
            p1 p1Var = this.placement;
            if (p1Var != null) {
                str = p1Var.getReferenceId();
            } else {
                str = null;
            }
            C2137s.logMetric$vungle_ads_release$default(c2137s, h1Var, str, c0665z.getCreativeId(), c0665z.eventId(), (String) null, 16, (Object) null);
            long calculateIntervalDuration = h1Var.calculateIntervalDuration();
            ServiceLocator$Companion serviceLocator$Companion = f1.Companion;
            Context context = this.context;
            EnumC2718g enumC2718g = EnumC2718g.b;
            InterfaceC2717f c9 = AbstractC2712a.c(enumC2718g, new C2102p(context));
            InterfaceC2717f c10 = AbstractC2712a.c(enumC2718g, new C2104q(this.context));
            List tpatUrls$default = C0665z.getTpatUrls$default(c0665z, "ad.loadDuration", String.valueOf(calculateIntervalDuration), null, 4, null);
            if (tpatUrls$default != null) {
                new com.vungle.ads.internal.network.l(getVungleApiClient(), c0665z.placementId(), c0665z.getCreativeId(), c0665z.eventId(), m97onSuccess$lambda9$lambda6(c9).getIoExecutor(), m98onSuccess$lambda9$lambda7(c10), getSignalManager()).sendTpats(tpatUrls$default, m97onSuccess$lambda9$lambda6(c9).getJobExecutor());
            }
        }
    }

    public final void play(Context context, com.vungle.ads.internal.presenter.c cVar) {
        WeakReference<Context> weakReference;
        C0665z c0665z;
        G7.j.e(cVar, "adPlayCallback");
        if (context != null) {
            weakReference = new WeakReference<>(context);
        } else {
            weakReference = null;
        }
        this.playContext = weakReference;
        o1 canPlayAd = canPlayAd(true);
        if (canPlayAd != null) {
            cVar.onFailure(canPlayAd);
            if (isErrorTerminal$vungle_ads_release(canPlayAd.getCode())) {
                setAdState(EnumC2091g.ERROR);
                return;
            }
            return;
        }
        p1 p1Var = this.placement;
        if (p1Var == null || (c0665z = this.advertisement) == null) {
            return;
        }
        r rVar = new r(cVar, this);
        cancelDownload$vungle_ads_release();
        renderAd$vungle_ads_release(rVar, p1Var, c0665z);
    }

    public void renderAd$vungle_ads_release(com.vungle.ads.internal.presenter.c cVar, p1 p1Var, C0665z c0665z) {
        Context context;
        G7.j.e(p1Var, "placement");
        G7.j.e(c0665z, "advertisement");
        com.vungle.ads.internal.ui.a aVar = com.vungle.ads.internal.ui.i.Companion;
        aVar.setEventListener$vungle_ads_release(new C2105s(cVar, p1Var));
        aVar.setAdvertisement$vungle_ads_release(c0665z);
        aVar.setBidPayload$vungle_ads_release(this.bidPayload);
        WeakReference<Context> weakReference = this.playContext;
        if (weakReference == null || (context = weakReference.get()) == null) {
            context = this.context;
        }
        G7.j.d(context, "playContext?.get() ?: context");
        com.vungle.ads.internal.util.h.Companion.startWhenForeground(context, null, aVar.createIntent(context, p1Var.getReferenceId(), c0665z.eventId()), null);
    }

    public final void setAdState(EnumC2091g enumC2091g) {
        C0665z c0665z;
        String eventId;
        G7.j.e(enumC2091g, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (enumC2091g.isTerminalState() && (c0665z = this.advertisement) != null && (eventId = c0665z.eventId()) != null) {
            ServiceLocator$Companion serviceLocator$Companion = f1.Companion;
            ((com.vungle.ads.internal.task.w) m92_set_adState_$lambda1$lambda0(AbstractC2712a.c(EnumC2718g.b, new C2095k(this.context)))).execute(com.vungle.ads.internal.task.c.Companion.makeJobInfo(eventId));
        }
        this.adState = this.adState.transitionTo(enumC2091g);
    }

    public final void setAdvertisement(C0665z c0665z) {
        this.advertisement = c0665z;
    }

    public final void setBidPayload(c7.I i9) {
        this.bidPayload = i9;
    }

    public final void setPlacement(p1 p1Var) {
        this.placement = p1Var;
    }
}
