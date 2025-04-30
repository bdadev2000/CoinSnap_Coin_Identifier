package com.vungle.ads.internal.signals;

import G7.s;
import a.AbstractC0325a;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import c7.y1;
import com.vungle.ads.ServiceLocator$Companion;
import com.vungle.ads.f1;
import com.vungle.ads.internal.F;
import com.vungle.ads.internal.util.x;
import f7.C2275b;
import java.util.concurrent.ConcurrentHashMap;
import t7.AbstractC2712a;
import t7.EnumC2718g;
import t7.InterfaceC2717f;

/* loaded from: classes3.dex */
public final class j {
    public static final d Companion = new d(null);
    public static final String SESSION_COUNT_KEY = "vungle_signal_session_count";
    private static final int SESSION_COUNT_NOT_SET = -1;
    public static final String SESSION_TIME_KEY = "vungle_signal_session_creation_time";
    public static final int SIGNAL_VERSION = 1;
    private static final String TAG = "SignalManager";
    public static final long TWENTY_FOUR_HOURS_MILLIS = 86400000;
    private final Context context;
    private c currentSession;
    private long enterBackgroundTime;
    private long enterForegroundTime;
    private final InterfaceC2717f filePreferences$delegate;
    private final f8.b json;
    private ConcurrentHashMap<String, Long> mapOfLastLoadTimes;
    private int sessionCount;
    private long sessionDuration;
    private long sessionSeriesCreatedTime;
    private h7.c unclosedAdDetector;

    public j(Context context) {
        G7.j.e(context, "context");
        this.context = context;
        this.json = R2.b.a(e.INSTANCE);
        this.enterForegroundTime = System.currentTimeMillis();
        this.sessionCount = -1;
        this.mapOfLastLoadTimes = new ConcurrentHashMap<>();
        ServiceLocator$Companion serviceLocator$Companion = f1.Companion;
        EnumC2718g enumC2718g = EnumC2718g.b;
        this.filePreferences$delegate = AbstractC2712a.c(enumC2718g, new g(context));
        registerNotifications();
        this.sessionSeriesCreatedTime = getFilePreferences().getLong(SESSION_TIME_KEY, -1L);
        updateSessionCount();
        this.currentSession = new c(this.sessionCount);
        h7.c cVar = new h7.c(context, this.currentSession.getSessionId(), m76_init_$lambda0(AbstractC2712a.c(enumC2718g, new h(context))), m77_init_$lambda1(AbstractC2712a.c(enumC2718g, new i(context))));
        this.unclosedAdDetector = cVar;
        this.currentSession.setUnclosedAd(cVar.retrieveUnclosedAd());
    }

    /* renamed from: _init_$lambda-0, reason: not valid java name */
    private static final com.vungle.ads.internal.executor.a m76_init_$lambda0(InterfaceC2717f interfaceC2717f) {
        return (com.vungle.ads.internal.executor.a) interfaceC2717f.getValue();
    }

    /* renamed from: _init_$lambda-1, reason: not valid java name */
    private static final x m77_init_$lambda1(InterfaceC2717f interfaceC2717f) {
        return (x) interfaceC2717f.getValue();
    }

    public static /* synthetic */ void getCurrentSession$vungle_ads_release$annotations() {
    }

    private final void registerNotifications() {
        com.vungle.ads.internal.util.h.Companion.addLifecycleListener(new f(this));
    }

    private final void updateSessionCount() {
        if (this.sessionCount == -1) {
            this.sessionCount = getFilePreferences().getInt(SESSION_COUNT_KEY, 0);
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j7 = this.sessionSeriesCreatedTime;
        long j9 = currentTimeMillis - j7;
        if (j7 >= 0 && j9 < TWENTY_FOUR_HOURS_MILLIS) {
            this.sessionCount++;
        } else {
            this.sessionCount = 1;
            getFilePreferences().put(SESSION_TIME_KEY, currentTimeMillis);
            this.sessionSeriesCreatedTime = currentTimeMillis;
        }
        getFilePreferences().put(SESSION_COUNT_KEY, this.sessionCount);
        getFilePreferences().apply();
    }

    private final void updateSessionDuration() {
        this.currentSession.setSessionDuration((System.currentTimeMillis() + this.sessionDuration) - this.enterForegroundTime);
    }

    public final void createNewSessionData() {
        updateSessionCount();
        this.currentSession = new c(this.sessionCount);
    }

    public final String generateSignals() {
        updateSessionDuration();
        try {
            f8.b bVar = this.json;
            return "1:".concat(bVar.b(AbstractC0325a.q(bVar.b, s.b(c.class)), this.currentSession));
        } catch (Error | Exception unused) {
            return null;
        }
    }

    public final Context getContext() {
        return this.context;
    }

    public final c getCurrentSession$vungle_ads_release() {
        return this.currentSession;
    }

    public final long getEnterBackgroundTime() {
        return this.enterBackgroundTime;
    }

    public final long getEnterForegroundTime() {
        return this.enterForegroundTime;
    }

    public final C2275b getFilePreferences() {
        return (C2275b) this.filePreferences$delegate.getValue();
    }

    public final ConcurrentHashMap<String, Long> getMapOfLastLoadTimes() {
        return this.mapOfLastLoadTimes;
    }

    public final int getSessionCount() {
        return this.sessionCount;
    }

    public final long getSessionDuration() {
        return this.sessionDuration;
    }

    public final long getSessionSeriesCreatedTime() {
        return this.sessionSeriesCreatedTime;
    }

    public final synchronized m getSignaledAd(String str) {
        long currentTimeMillis;
        Long l;
        try {
            G7.j.e(str, "placementId");
            currentTimeMillis = System.currentTimeMillis();
            if (this.mapOfLastLoadTimes.containsKey(str)) {
                l = this.mapOfLastLoadTimes.get(str);
            } else {
                l = null;
            }
            this.mapOfLastLoadTimes.put(str, Long.valueOf(currentTimeMillis));
        } catch (Throwable th) {
            throw th;
        }
        return new m(l, currentTimeMillis);
    }

    public final String getUuid() {
        return this.currentSession.getSessionId();
    }

    public final synchronized void increaseSessionDepthCounter() {
        c cVar = this.currentSession;
        cVar.setSessionDepthCounter(cVar.getSessionDepthCounter() + 1);
    }

    public final void recordUnclosedAd(y1 y1Var) {
        G7.j.e(y1Var, "unclosedAd");
        if (F.INSTANCE.signalsDisabled()) {
            return;
        }
        this.unclosedAdDetector.addUnclosedAd(y1Var);
    }

    public final void registerSignaledAd(Context context, m mVar) {
        G7.j.e(mVar, "signaledAd");
        this.currentSession.getSignaledAd().clear();
        this.currentSession.getSignaledAd().add(mVar);
        this.currentSession.getSignaledAd().get(0).setScreenOrientation(screenOrientation(context));
    }

    public final void removeUnclosedAd(y1 y1Var) {
        G7.j.e(y1Var, "unclosedAd");
        if (F.INSTANCE.signalsDisabled()) {
            return;
        }
        this.unclosedAdDetector.removeUnclosedAd(y1Var);
    }

    public final int screenOrientation(Context context) {
        Integer num;
        Configuration configuration;
        if (context == null) {
            context = this.context;
        }
        Resources resources = context.getResources();
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            num = Integer.valueOf(configuration.orientation);
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 2) {
            return 2;
        }
        if (num != null && num.intValue() == 1) {
            return 1;
        }
        if (num != null && num.intValue() == 0) {
            return 0;
        }
        return -1;
    }

    public final void setCurrentSession$vungle_ads_release(c cVar) {
        G7.j.e(cVar, "<set-?>");
        this.currentSession = cVar;
    }

    public final void setEnterBackgroundTime(long j7) {
        this.enterBackgroundTime = j7;
    }

    public final void setEnterForegroundTime(long j7) {
        this.enterForegroundTime = j7;
    }

    public final void setMapOfLastLoadTimes(ConcurrentHashMap<String, Long> concurrentHashMap) {
        G7.j.e(concurrentHashMap, "<set-?>");
        this.mapOfLastLoadTimes = concurrentHashMap;
    }

    public final void setSessionCount(int i9) {
        this.sessionCount = i9;
    }

    public final void setSessionDuration(long j7) {
        this.sessionDuration = j7;
    }

    public final void setSessionSeriesCreatedTime(long j7) {
        this.sessionSeriesCreatedTime = j7;
    }

    public final void updateTemplateSignals(String str) {
        if (str != null && str.length() != 0 && (!this.currentSession.getSignaledAd().isEmpty())) {
            this.currentSession.getSignaledAd().get(0).setTemplateSignals(str);
        }
    }
}
