package com.vungle.ads.internal.signals;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import bh.x3;
import com.vungle.ads.ServiceLocator$Companion;
import com.vungle.ads.e3;
import com.vungle.ads.internal.f0;
import com.vungle.ads.internal.util.x;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonKt;

/* loaded from: classes4.dex */
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
    private final Lazy filePreferences$delegate;
    private final Json json;
    private ConcurrentHashMap<String, Long> mapOfLastLoadTimes;
    private int sessionCount;
    private long sessionDuration;
    private long sessionSeriesCreatedTime;
    private gh.c unclosedAdDetector;

    public j(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.json = JsonKt.Json$default(null, e.INSTANCE, 1, null);
        this.enterForegroundTime = System.currentTimeMillis();
        this.sessionCount = -1;
        this.mapOfLastLoadTimes = new ConcurrentHashMap<>();
        ServiceLocator$Companion serviceLocator$Companion = e3.Companion;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        this.filePreferences$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new g(context));
        registerNotifications();
        this.sessionSeriesCreatedTime = getFilePreferences().getLong(SESSION_TIME_KEY, -1L);
        updateSessionCount();
        this.currentSession = new c(this.sessionCount);
        gh.c cVar = new gh.c(context, this.currentSession.getSessionId(), m56_init_$lambda0(LazyKt.lazy(lazyThreadSafetyMode, (Function0) new h(context))), m57_init_$lambda1(LazyKt.lazy(lazyThreadSafetyMode, (Function0) new i(context))));
        this.unclosedAdDetector = cVar;
        this.currentSession.setUnclosedAd(cVar.retrieveUnclosedAd());
    }

    /* renamed from: _init_$lambda-0, reason: not valid java name */
    private static final com.vungle.ads.internal.executor.a m56_init_$lambda0(Lazy<? extends com.vungle.ads.internal.executor.a> lazy) {
        return lazy.getValue();
    }

    /* renamed from: _init_$lambda-1, reason: not valid java name */
    private static final x m57_init_$lambda1(Lazy<x> lazy) {
        return lazy.getValue();
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
        long j3 = this.sessionSeriesCreatedTime;
        long j10 = currentTimeMillis - j3;
        if (j3 >= 0 && j10 < TWENTY_FOUR_HOURS_MILLIS) {
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
            StringBuilder sb2 = new StringBuilder("1:");
            Json json = this.json;
            c cVar = this.currentSession;
            KSerializer<Object> serializer = SerializersKt.serializer(json.getSerializersModule(), Reflection.typeOf(c.class));
            Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            sb2.append(json.encodeToString(serializer, cVar));
            return sb2.toString();
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

    public final eh.b getFilePreferences() {
        return (eh.b) this.filePreferences$delegate.getValue();
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

    public final synchronized m getSignaledAd(String placementId) {
        long currentTimeMillis;
        Long l10;
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        currentTimeMillis = System.currentTimeMillis();
        if (this.mapOfLastLoadTimes.containsKey(placementId)) {
            l10 = this.mapOfLastLoadTimes.get(placementId);
        } else {
            l10 = null;
        }
        this.mapOfLastLoadTimes.put(placementId, Long.valueOf(currentTimeMillis));
        return new m(l10, currentTimeMillis);
    }

    public final String getUuid() {
        return this.currentSession.getSessionId();
    }

    public final synchronized void increaseSessionDepthCounter() {
        c cVar = this.currentSession;
        cVar.setSessionDepthCounter(cVar.getSessionDepthCounter() + 1);
    }

    public final void recordUnclosedAd(x3 unclosedAd) {
        Intrinsics.checkNotNullParameter(unclosedAd, "unclosedAd");
        if (f0.INSTANCE.signalsDisabled()) {
            return;
        }
        this.unclosedAdDetector.addUnclosedAd(unclosedAd);
    }

    public final void registerSignaledAd(Context context, m signaledAd) {
        Intrinsics.checkNotNullParameter(signaledAd, "signaledAd");
        this.currentSession.getSignaledAd().clear();
        this.currentSession.getSignaledAd().add(signaledAd);
        this.currentSession.getSignaledAd().get(0).setScreenOrientation(screenOrientation(context));
    }

    public final void removeUnclosedAd(x3 unclosedAd) {
        Intrinsics.checkNotNullParameter(unclosedAd, "unclosedAd");
        if (f0.INSTANCE.signalsDisabled()) {
            return;
        }
        this.unclosedAdDetector.removeUnclosedAd(unclosedAd);
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
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.currentSession = cVar;
    }

    public final void setEnterBackgroundTime(long j3) {
        this.enterBackgroundTime = j3;
    }

    public final void setEnterForegroundTime(long j3) {
        this.enterForegroundTime = j3;
    }

    public final void setMapOfLastLoadTimes(ConcurrentHashMap<String, Long> concurrentHashMap) {
        Intrinsics.checkNotNullParameter(concurrentHashMap, "<set-?>");
        this.mapOfLastLoadTimes = concurrentHashMap;
    }

    public final void setSessionCount(int i10) {
        this.sessionCount = i10;
    }

    public final void setSessionDuration(long j3) {
        this.sessionDuration = j3;
    }

    public final void setSessionSeriesCreatedTime(long j3) {
        this.sessionSeriesCreatedTime = j3;
    }

    public final void updateTemplateSignals(String str) {
        boolean z10;
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 && (true ^ this.currentSession.getSignaledAd().isEmpty())) {
            this.currentSession.getSignaledAd().get(0).setTemplateSignals(str);
        }
    }
}
