package com.google.firebase.perf.config;

import Y4.d;
import Y4.w;
import Y4.x;
import a5.C0397a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import g4.C2291a;
import g4.C2296f;
import h5.C2323d;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k5.b;
import k5.h;
import k5.k;
import l5.o;

@Keep
/* loaded from: classes2.dex */
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_APP_START_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_APP_START_CONFIG_FETCH_DELAY_MS = 25000;
    private final ConcurrentHashMap<String, h> allRcConfigMap;
    private final long appStartConfigFetchDelayInMs;
    private final long appStartTimeInMs;
    private final w cache;
    private final Executor executor;

    @Nullable
    private b firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;

    @Nullable
    private N4.b firebaseRemoteConfigProvider;
    private static final C0397a logger = C0397a.d();
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12);

    @SuppressLint({"ThreadPoolCreation"})
    private RemoteConfigManager() {
        this(w.b(), new ThreadPoolExecutor(0, 1, FETCH_NEVER_HAPPENED_TIMESTAMP_MS, TimeUnit.SECONDS, new LinkedBlockingQueue()), null, 5000 + new Random().nextInt(25000), getInitialStartupMillis());
    }

    public static long getInitialStartupMillis() {
        C2291a c2291a = (C2291a) C2296f.c().b(C2291a.class);
        if (c2291a != null) {
            return c2291a.f20426a;
        }
        return System.currentTimeMillis();
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private h getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (isFirebaseRemoteConfigAvailable() && this.allRcConfigMap.containsKey(str)) {
            h hVar = this.allRcConfigMap.get(str);
            o oVar = (o) hVar;
            if (oVar.b == 2) {
                logger.b("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", oVar.d(), str);
                return hVar;
            }
            return null;
        }
        return null;
    }

    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    private boolean hasAppStartConfigFetchDelayElapsed(long j7) {
        if (j7 - this.appStartTimeInMs >= this.appStartConfigFetchDelayInMs) {
            return true;
        }
        return false;
    }

    private boolean hasLastFetchBecomeStale(long j7) {
        if (j7 - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS) {
            return true;
        }
        return false;
    }

    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0(Boolean bool) {
        syncConfigValues(this.firebaseRemoteConfig.b());
    }

    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(Exception exc) {
        logger.g("Call to Remote Config failed: %s. This may cause a degraded experience with Firebase Performance. Please reach out to Firebase Support https://firebase.google.com/support/", exc);
        this.firebaseRemoteConfigLastFetchTimestampMs = FETCH_NEVER_HAPPENED_TIMESTAMP_MS;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        if (hasAppStartConfigFetchDelayElapsed(currentSystemTimeMillis) && hasLastFetchBecomeStale(currentSystemTimeMillis)) {
            return true;
        }
        return false;
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        this.firebaseRemoteConfig.a().addOnSuccessListener(this.executor, new x(this)).addOnFailureListener(this.executor, new x(this));
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (!isFirebaseRemoteConfigAvailable()) {
            return;
        }
        if (this.allRcConfigMap.isEmpty()) {
            this.allRcConfigMap.putAll(this.firebaseRemoteConfig.b());
        }
        if (shouldFetchAndActivateRemoteConfigValues()) {
            triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
        }
    }

    public C2323d getBoolean(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config boolean value is null.");
            return new C2323d();
        }
        h remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new C2323d(Boolean.valueOf(((o) remoteConfigValue).a()));
            } catch (IllegalArgumentException unused) {
                o oVar = (o) remoteConfigValue;
                if (!oVar.d().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", oVar.d(), str);
                }
            }
        }
        return new C2323d();
    }

    public long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public C2323d getDouble(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config double value is null.");
            return new C2323d();
        }
        h remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new C2323d(Double.valueOf(((o) remoteConfigValue).b()));
            } catch (IllegalArgumentException unused) {
                o oVar = (o) remoteConfigValue;
                if (!oVar.d().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", oVar.d(), str);
                }
            }
        }
        return new C2323d();
    }

    public C2323d getLong(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config long value is null.");
            return new C2323d();
        }
        h remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new C2323d(Long.valueOf(((o) remoteConfigValue).c()));
            } catch (IllegalArgumentException unused) {
                o oVar = (o) remoteConfigValue;
                if (!oVar.d().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", oVar.d(), str);
                }
            }
        }
        return new C2323d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T getRemoteConfigValueOrDefault(String str, T t9) {
        Object obj;
        h remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                if (t9 instanceof Boolean) {
                    obj = Boolean.valueOf(((o) remoteConfigValue).a());
                } else if (t9 instanceof Double) {
                    obj = Double.valueOf(((o) remoteConfigValue).b());
                } else {
                    if (!(t9 instanceof Long) && !(t9 instanceof Integer)) {
                        if (t9 instanceof String) {
                            obj = ((o) remoteConfigValue).d();
                        } else {
                            T t10 = (T) ((o) remoteConfigValue).d();
                            try {
                                logger.b("No matching type found for the defaultValue: '%s', using String.", t9);
                                return t10;
                            } catch (IllegalArgumentException unused) {
                                t9 = t10;
                                o oVar = (o) remoteConfigValue;
                                if (!oVar.d().isEmpty()) {
                                    logger.b("Could not parse value: '%s' for key: '%s'.", oVar.d(), str);
                                    return t9;
                                }
                                return t9;
                            }
                        }
                    }
                    obj = Long.valueOf(((o) remoteConfigValue).c());
                }
                return obj;
            } catch (IllegalArgumentException unused2) {
            }
        } else {
            return t9;
        }
    }

    public C2323d getString(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config String value is null.");
            return new C2323d();
        }
        h remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            return new C2323d(((o) remoteConfigValue).d());
        }
        return new C2323d();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        N4.b bVar;
        k kVar;
        if (this.firebaseRemoteConfig == null && (bVar = this.firebaseRemoteConfigProvider) != null && (kVar = (k) bVar.get()) != null) {
            this.firebaseRemoteConfig = kVar.b(FIREPERF_FRC_NAMESPACE_NAME);
        }
        if (this.firebaseRemoteConfig != null) {
            return true;
        }
        return false;
    }

    public boolean isLastFetchFailed() {
        b bVar = this.firebaseRemoteConfig;
        if (bVar == null || bVar.d().b == 1 || this.firebaseRemoteConfig.d().b == 2) {
            return true;
        }
        return false;
    }

    public void setFirebaseRemoteConfigProvider(@Nullable N4.b bVar) {
        this.firebaseRemoteConfigProvider = bVar;
    }

    public void syncConfigValues(Map<String, h> map) {
        this.allRcConfigMap.putAll(map);
        for (String str : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(str)) {
                this.allRcConfigMap.remove(str);
            }
        }
        d x9 = d.x();
        ConcurrentHashMap<String, h> concurrentHashMap = this.allRcConfigMap;
        x9.getClass();
        h hVar = concurrentHashMap.get("fpr_experiment_app_start_ttid");
        if (hVar != null) {
            try {
                this.cache.g("com.google.firebase.perf.ExperimentTTID", ((o) hVar).a());
                return;
            } catch (Exception unused) {
                logger.a("ExperimentTTID remote config flag has invalid value, expected boolean.");
                return;
            }
        }
        logger.a("ExperimentTTID remote config flag does not exist.");
    }

    public RemoteConfigManager(w wVar, Executor executor, b bVar, long j7, long j9) {
        ConcurrentHashMap<String, h> concurrentHashMap;
        this.firebaseRemoteConfigLastFetchTimestampMs = FETCH_NEVER_HAPPENED_TIMESTAMP_MS;
        this.cache = wVar;
        this.executor = executor;
        this.firebaseRemoteConfig = bVar;
        if (bVar == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = new ConcurrentHashMap<>(bVar.b());
        }
        this.allRcConfigMap = concurrentHashMap;
        this.appStartTimeInMs = j9;
        this.appStartConfigFetchDelayInMs = j7;
    }
}
