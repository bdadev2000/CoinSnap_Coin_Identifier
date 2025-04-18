package com.facebook.appevents.codeless;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.a;
import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.appevents.internal.AppEventUtility;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@RestrictTo
/* loaded from: classes3.dex */
public final class CodelessManager {

    @Nullable
    private static String deviceSessionID;
    private static volatile boolean isCheckingSession;

    @Nullable
    private static SensorManager sensorManager;

    @Nullable
    private static ViewIndexer viewIndexer;

    @NotNull
    public static final CodelessManager INSTANCE = new CodelessManager();

    @NotNull
    private static final ViewIndexingTrigger viewIndexingTrigger = new ViewIndexingTrigger();

    @NotNull
    private static final AtomicBoolean isCodelessEnabled = new AtomicBoolean(true);

    @NotNull
    private static final AtomicBoolean isAppIndexingEnabled = new AtomicBoolean(false);

    private CodelessManager() {
    }

    private final void checkCodelessSession(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (isCheckingSession) {
                return;
            }
            isCheckingSession = true;
            FacebookSdk.getExecutor().execute(new a(str, 1));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* renamed from: checkCodelessSession$lambda-1 */
    public static final void m464checkCodelessSession$lambda1(String str) {
        String str2 = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        if (CrashShieldHandler.isObjectCrashing(CodelessManager.class)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            AttributionIdentifiers attributionIdentifiers = AttributionIdentifiers.Companion.getAttributionIdentifiers(FacebookSdk.getApplicationContext());
            JSONArray jSONArray = new JSONArray();
            String str3 = Build.MODEL;
            if (str3 == null) {
                str3 = "";
            }
            jSONArray.put(str3);
            if ((attributionIdentifiers == null ? null : attributionIdentifiers.getAndroidAdvertiserId()) != null) {
                jSONArray.put(attributionIdentifiers.getAndroidAdvertiserId());
            } else {
                jSONArray.put("");
            }
            jSONArray.put(AppEventsConstants.EVENT_PARAM_VALUE_NO);
            if (AppEventUtility.isEmulator()) {
                str2 = AppEventsConstants.EVENT_PARAM_VALUE_YES;
            }
            jSONArray.put(str2);
            Locale currentLocale = Utility.getCurrentLocale();
            jSONArray.put(currentLocale.getLanguage() + '_' + ((Object) currentLocale.getCountry()));
            String jSONArray2 = jSONArray.toString();
            p0.a.r(jSONArray2, "extInfoArray.toString()");
            bundle.putString(Constants.DEVICE_SESSION_ID, getCurrentDeviceSessionID$facebook_core_release());
            bundle.putString(Constants.EXTINFO, jSONArray2);
            GraphRequest.Companion companion = GraphRequest.Companion;
            boolean z2 = true;
            String format = String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[]{str}, 1));
            p0.a.r(format, "java.lang.String.format(locale, format, *args)");
            JSONObject jSONObject = companion.newPostRequestWithBundle(null, format, bundle, null).executeAndWait().getJSONObject();
            AtomicBoolean atomicBoolean = isAppIndexingEnabled;
            if (jSONObject == null || !jSONObject.optBoolean(Constants.APP_INDEXING_ENABLED, false)) {
                z2 = false;
            }
            atomicBoolean.set(z2);
            if (atomicBoolean.get()) {
                ViewIndexer viewIndexer2 = viewIndexer;
                if (viewIndexer2 != null) {
                    viewIndexer2.schedule();
                }
            } else {
                deviceSessionID = null;
            }
            isCheckingSession = false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessManager.class);
        }
    }

    public static final void disable() {
        if (CrashShieldHandler.isObjectCrashing(CodelessManager.class)) {
            return;
        }
        try {
            isCodelessEnabled.set(false);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessManager.class);
        }
    }

    public static final void enable() {
        if (CrashShieldHandler.isObjectCrashing(CodelessManager.class)) {
            return;
        }
        try {
            isCodelessEnabled.set(true);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessManager.class);
        }
    }

    @NotNull
    public static final String getCurrentDeviceSessionID$facebook_core_release() {
        if (CrashShieldHandler.isObjectCrashing(CodelessManager.class)) {
            return null;
        }
        try {
            if (deviceSessionID == null) {
                deviceSessionID = UUID.randomUUID().toString();
            }
            String str = deviceSessionID;
            if (str != null) {
                return str;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessManager.class);
            return null;
        }
    }

    public static final boolean getIsAppIndexingEnabled$facebook_core_release() {
        if (CrashShieldHandler.isObjectCrashing(CodelessManager.class)) {
            return false;
        }
        try {
            return isAppIndexingEnabled.get();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessManager.class);
            return false;
        }
    }

    private final boolean isDebugOnEmulator() {
        CrashShieldHandler.isObjectCrashing(this);
        return false;
    }

    public static final void onActivityDestroyed(@NotNull Activity activity) {
        if (CrashShieldHandler.isObjectCrashing(CodelessManager.class)) {
            return;
        }
        try {
            p0.a.s(activity, "activity");
            CodelessMatcher.Companion.getInstance().destroy(activity);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessManager.class);
        }
    }

    public static final void onActivityPaused(@NotNull Activity activity) {
        if (CrashShieldHandler.isObjectCrashing(CodelessManager.class)) {
            return;
        }
        try {
            p0.a.s(activity, "activity");
            if (isCodelessEnabled.get()) {
                CodelessMatcher.Companion.getInstance().remove(activity);
                ViewIndexer viewIndexer2 = viewIndexer;
                if (viewIndexer2 != null) {
                    viewIndexer2.unschedule();
                }
                SensorManager sensorManager2 = sensorManager;
                if (sensorManager2 == null) {
                    return;
                }
                sensorManager2.unregisterListener(viewIndexingTrigger);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessManager.class);
        }
    }

    public static final void onActivityResumed(@NotNull Activity activity) {
        CodelessManager codelessManager;
        if (CrashShieldHandler.isObjectCrashing(CodelessManager.class)) {
            return;
        }
        try {
            p0.a.s(activity, "activity");
            if (isCodelessEnabled.get()) {
                CodelessMatcher.Companion.getInstance().add(activity);
                Context applicationContext = activity.getApplicationContext();
                String applicationId = FacebookSdk.getApplicationId();
                FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(applicationId);
                if (!p0.a.g(appSettingsWithoutQuery == null ? null : Boolean.valueOf(appSettingsWithoutQuery.getCodelessEventsEnabled()), Boolean.TRUE)) {
                    if (INSTANCE.isDebugOnEmulator()) {
                    }
                    codelessManager = INSTANCE;
                    if (codelessManager.isDebugOnEmulator() || isAppIndexingEnabled.get()) {
                    }
                    codelessManager.checkCodelessSession(applicationId);
                    return;
                }
                SensorManager sensorManager2 = (SensorManager) applicationContext.getSystemService("sensor");
                if (sensorManager2 == null) {
                    return;
                }
                sensorManager = sensorManager2;
                Sensor defaultSensor = sensorManager2.getDefaultSensor(1);
                ViewIndexer viewIndexer2 = new ViewIndexer(activity);
                viewIndexer = viewIndexer2;
                ViewIndexingTrigger viewIndexingTrigger2 = viewIndexingTrigger;
                viewIndexingTrigger2.setOnShakeListener(new androidx.privacysandbox.ads.adservices.java.internal.a(1, appSettingsWithoutQuery, applicationId));
                sensorManager2.registerListener(viewIndexingTrigger2, defaultSensor, 2);
                if (appSettingsWithoutQuery != null && appSettingsWithoutQuery.getCodelessEventsEnabled()) {
                    viewIndexer2.schedule();
                }
                codelessManager = INSTANCE;
                if (codelessManager.isDebugOnEmulator()) {
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessManager.class);
        }
    }

    /* renamed from: onActivityResumed$lambda-0 */
    public static final void m465onActivityResumed$lambda0(FetchedAppSettings fetchedAppSettings, String str) {
        if (CrashShieldHandler.isObjectCrashing(CodelessManager.class)) {
            return;
        }
        try {
            p0.a.s(str, "$appId");
            boolean z2 = fetchedAppSettings != null && fetchedAppSettings.getCodelessEventsEnabled();
            boolean codelessSetupEnabled = FacebookSdk.getCodelessSetupEnabled();
            if (z2 && codelessSetupEnabled) {
                INSTANCE.checkCodelessSession(str);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessManager.class);
        }
    }

    public static final void updateAppIndexing$facebook_core_release(boolean z2) {
        if (CrashShieldHandler.isObjectCrashing(CodelessManager.class)) {
            return;
        }
        try {
            isAppIndexingEnabled.set(z2);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessManager.class);
        }
    }
}
