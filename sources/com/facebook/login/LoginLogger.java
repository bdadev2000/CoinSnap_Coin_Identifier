package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.login.LoginClient;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class LoginLogger {

    @NotNull
    public static final String EVENT_EXTRAS_DEFAULT_AUDIENCE = "default_audience";

    @NotNull
    public static final String EVENT_EXTRAS_FACEBOOK_VERSION = "facebookVersion";

    @NotNull
    public static final String EVENT_EXTRAS_FAILURE = "failure";

    @NotNull
    public static final String EVENT_EXTRAS_IS_REAUTHORIZE = "isReauthorize";

    @NotNull
    public static final String EVENT_EXTRAS_LOGIN_BEHAVIOR = "login_behavior";

    @NotNull
    public static final String EVENT_EXTRAS_MISSING_INTERNET_PERMISSION = "no_internet_permission";

    @NotNull
    public static final String EVENT_EXTRAS_NEW_PERMISSIONS = "new_permissions";

    @NotNull
    public static final String EVENT_EXTRAS_NOT_TRIED = "not_tried";

    @NotNull
    public static final String EVENT_EXTRAS_PERMISSIONS = "permissions";

    @NotNull
    public static final String EVENT_EXTRAS_REQUEST_CODE = "request_code";

    @NotNull
    public static final String EVENT_EXTRAS_TARGET_APP = "target_app";

    @NotNull
    public static final String EVENT_EXTRAS_TRY_LOGIN_ACTIVITY = "try_login_activity";

    @NotNull
    public static final String EVENT_NAME_FOA_LOGIN_COMPLETE = "foa_mobile_login_complete";

    @NotNull
    public static final String EVENT_NAME_FOA_LOGIN_METHOD_COMPLETE = "foa_mobile_login_method_complete";

    @NotNull
    public static final String EVENT_NAME_FOA_LOGIN_METHOD_NOT_TRIED = "foa_mobile_login_method_not_tried";

    @NotNull
    public static final String EVENT_NAME_FOA_LOGIN_METHOD_START = "foa_mobile_login_method_start";

    @NotNull
    public static final String EVENT_NAME_FOA_LOGIN_START = "foa_mobile_login_start";

    @NotNull
    public static final String EVENT_NAME_LOGIN_COMPLETE = "fb_mobile_login_complete";

    @NotNull
    public static final String EVENT_NAME_LOGIN_HEARTBEAT = "fb_mobile_login_heartbeat";

    @NotNull
    public static final String EVENT_NAME_LOGIN_METHOD_COMPLETE = "fb_mobile_login_method_complete";

    @NotNull
    public static final String EVENT_NAME_LOGIN_METHOD_NOT_TRIED = "fb_mobile_login_method_not_tried";

    @NotNull
    public static final String EVENT_NAME_LOGIN_METHOD_START = "fb_mobile_login_method_start";

    @NotNull
    public static final String EVENT_NAME_LOGIN_START = "fb_mobile_login_start";

    @NotNull
    public static final String EVENT_NAME_LOGIN_STATUS_COMPLETE = "fb_mobile_login_status_complete";

    @NotNull
    public static final String EVENT_NAME_LOGIN_STATUS_START = "fb_mobile_login_status_start";

    @NotNull
    public static final String EVENT_PARAM_AUTH_LOGGER_ID = "0_auth_logger_id";

    @NotNull
    public static final String EVENT_PARAM_CHALLENGE = "7_challenge";

    @NotNull
    public static final String EVENT_PARAM_ERROR_CODE = "4_error_code";

    @NotNull
    public static final String EVENT_PARAM_ERROR_MESSAGE = "5_error_message";

    @NotNull
    public static final String EVENT_PARAM_EXTRAS = "6_extras";

    @NotNull
    public static final String EVENT_PARAM_FOA_METHOD_RESULT_SKIPPED = "foa_skipped";

    @NotNull
    public static final String EVENT_PARAM_LOGIN_RESULT = "2_result";

    @NotNull
    public static final String EVENT_PARAM_METHOD = "3_method";

    @NotNull
    public static final String EVENT_PARAM_METHOD_RESULT_SKIPPED = "skipped";

    @NotNull
    public static final String EVENT_PARAM_TIMESTAMP = "1_timestamp_ms";

    @NotNull
    public static final String FACEBOOK_PACKAGE_NAME = "com.facebook.katana";

    @NotNull
    private final String applicationId;

    @Nullable
    private String facebookVersion;

    @NotNull
    private final InternalAppEventsLogger logger;

    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final ScheduledExecutorService worker = Executors.newSingleThreadScheduledExecutor();

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final Bundle newAuthorizationLoggingBundle(String str) {
            Bundle bundle = new Bundle();
            bundle.putLong(LoginLogger.EVENT_PARAM_TIMESTAMP, System.currentTimeMillis());
            bundle.putString(LoginLogger.EVENT_PARAM_AUTH_LOGGER_ID, str);
            bundle.putString(LoginLogger.EVENT_PARAM_METHOD, "");
            bundle.putString(LoginLogger.EVENT_PARAM_LOGIN_RESULT, "");
            bundle.putString(LoginLogger.EVENT_PARAM_ERROR_MESSAGE, "");
            bundle.putString(LoginLogger.EVENT_PARAM_ERROR_CODE, "");
            bundle.putString(LoginLogger.EVENT_PARAM_EXTRAS, "");
            return bundle;
        }
    }

    public LoginLogger(@NotNull Context context, @NotNull String str) {
        PackageInfo packageInfo;
        p0.a.s(context, "context");
        p0.a.s(str, "applicationId");
        this.applicationId = str;
        this.logger = new InternalAppEventsLogger(context, str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0)) == null) {
                return;
            }
            this.facebookVersion = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static /* synthetic */ void logAuthorizationMethodComplete$default(LoginLogger loginLogger, String str, String str2, String str3, String str4, String str5, Map map, String str6, int i2, Object obj) {
        if (CrashShieldHandler.isObjectCrashing(LoginLogger.class)) {
            return;
        }
        try {
            loginLogger.logAuthorizationMethodComplete(str, str2, str3, str4, str5, map, (i2 & 64) != 0 ? EVENT_NAME_LOGIN_METHOD_COMPLETE : str6);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, LoginLogger.class);
        }
    }

    public static /* synthetic */ void logAuthorizationMethodNotTried$default(LoginLogger loginLogger, String str, String str2, String str3, int i2, Object obj) {
        if (CrashShieldHandler.isObjectCrashing(LoginLogger.class)) {
            return;
        }
        if ((i2 & 4) != 0) {
            str3 = EVENT_NAME_LOGIN_METHOD_NOT_TRIED;
        }
        try {
            loginLogger.logAuthorizationMethodNotTried(str, str2, str3);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, LoginLogger.class);
        }
    }

    public static /* synthetic */ void logAuthorizationMethodStart$default(LoginLogger loginLogger, String str, String str2, String str3, int i2, Object obj) {
        if (CrashShieldHandler.isObjectCrashing(LoginLogger.class)) {
            return;
        }
        if ((i2 & 4) != 0) {
            str3 = EVENT_NAME_LOGIN_METHOD_START;
        }
        try {
            loginLogger.logAuthorizationMethodStart(str, str2, str3);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, LoginLogger.class);
        }
    }

    public static /* synthetic */ void logCompleteLogin$default(LoginLogger loginLogger, String str, Map map, LoginClient.Result.Code code, Map map2, Exception exc, String str2, int i2, Object obj) {
        if (CrashShieldHandler.isObjectCrashing(LoginLogger.class)) {
            return;
        }
        if ((i2 & 32) != 0) {
            str2 = EVENT_NAME_LOGIN_COMPLETE;
        }
        try {
            loginLogger.logCompleteLogin(str, map, code, map2, exc, str2);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, LoginLogger.class);
        }
    }

    private final void logHeartbeatEvent(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            final Bundle newAuthorizationLoggingBundle = Companion.newAuthorizationLoggingBundle(str);
            worker.schedule(new Runnable() { // from class: com.facebook.login.d
                @Override // java.lang.Runnable
                public final void run() {
                    LoginLogger.m568logHeartbeatEvent$lambda0(LoginLogger.this, newAuthorizationLoggingBundle);
                }
            }, 5L, TimeUnit.SECONDS);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* renamed from: logHeartbeatEvent$lambda-0 */
    public static final void m568logHeartbeatEvent$lambda0(LoginLogger loginLogger, Bundle bundle) {
        if (CrashShieldHandler.isObjectCrashing(LoginLogger.class)) {
            return;
        }
        try {
            p0.a.s(loginLogger, "this$0");
            p0.a.s(bundle, "$bundle");
            loginLogger.logger.logEventImplicitly(EVENT_NAME_LOGIN_HEARTBEAT, bundle);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, LoginLogger.class);
        }
    }

    public static /* synthetic */ void logStartLogin$default(LoginLogger loginLogger, LoginClient.Request request, String str, int i2, Object obj) {
        if (CrashShieldHandler.isObjectCrashing(LoginLogger.class)) {
            return;
        }
        if ((i2 & 2) != 0) {
            str = EVENT_NAME_LOGIN_START;
        }
        try {
            loginLogger.logStartLogin(request, str);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, LoginLogger.class);
        }
    }

    public static /* synthetic */ void logUnexpectedError$default(LoginLogger loginLogger, String str, String str2, String str3, int i2, Object obj) {
        if (CrashShieldHandler.isObjectCrashing(LoginLogger.class)) {
            return;
        }
        if ((i2 & 4) != 0) {
            str3 = "";
        }
        try {
            loginLogger.logUnexpectedError(str, str2, str3);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, LoginLogger.class);
        }
    }

    @NotNull
    public final String getApplicationId() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.applicationId;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final void logAuthorizationMethodComplete(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Map<String, String> map) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            logAuthorizationMethodComplete$default(this, str, str2, str3, str4, str5, map, null, 64, null);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logAuthorizationMethodNotTried(@Nullable String str, @Nullable String str2) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            logAuthorizationMethodNotTried$default(this, str, str2, null, 4, null);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logAuthorizationMethodStart(@Nullable String str, @Nullable String str2) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            logAuthorizationMethodStart$default(this, str, str2, null, 4, null);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logCompleteLogin(@Nullable String str, @NotNull Map<String, String> map, @Nullable LoginClient.Result.Code code, @Nullable Map<String, String> map2, @Nullable Exception exc) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            p0.a.s(map, "loggingExtras");
            logCompleteLogin$default(this, str, map, code, map2, exc, null, 32, null);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logLoginStatusError(@Nullable String str, @NotNull Exception exc) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            p0.a.s(exc, "exception");
            Bundle newAuthorizationLoggingBundle = Companion.newAuthorizationLoggingBundle(str);
            newAuthorizationLoggingBundle.putString(EVENT_PARAM_LOGIN_RESULT, LoginClient.Result.Code.ERROR.getLoggingValue());
            newAuthorizationLoggingBundle.putString(EVENT_PARAM_ERROR_MESSAGE, exc.toString());
            this.logger.logEventImplicitly(EVENT_NAME_LOGIN_STATUS_COMPLETE, newAuthorizationLoggingBundle);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logLoginStatusFailure(@Nullable String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Bundle newAuthorizationLoggingBundle = Companion.newAuthorizationLoggingBundle(str);
            newAuthorizationLoggingBundle.putString(EVENT_PARAM_LOGIN_RESULT, EVENT_EXTRAS_FAILURE);
            this.logger.logEventImplicitly(EVENT_NAME_LOGIN_STATUS_COMPLETE, newAuthorizationLoggingBundle);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logLoginStatusStart(@Nullable String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            this.logger.logEventImplicitly(EVENT_NAME_LOGIN_STATUS_START, Companion.newAuthorizationLoggingBundle(str));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logLoginStatusSuccess(@Nullable String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Bundle newAuthorizationLoggingBundle = Companion.newAuthorizationLoggingBundle(str);
            newAuthorizationLoggingBundle.putString(EVENT_PARAM_LOGIN_RESULT, LoginClient.Result.Code.SUCCESS.getLoggingValue());
            this.logger.logEventImplicitly(EVENT_NAME_LOGIN_STATUS_COMPLETE, newAuthorizationLoggingBundle);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logStartLogin(@NotNull LoginClient.Request request) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            p0.a.s(request, "pendingLoginRequest");
            logStartLogin$default(this, request, null, 2, null);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logUnexpectedError(@Nullable String str, @Nullable String str2) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            logUnexpectedError$default(this, str, str2, null, 4, null);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logAuthorizationMethodComplete(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Map<String, String> map, @Nullable String str6) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Bundle newAuthorizationLoggingBundle = Companion.newAuthorizationLoggingBundle(str);
            if (str3 != null) {
                newAuthorizationLoggingBundle.putString(EVENT_PARAM_LOGIN_RESULT, str3);
            }
            if (str4 != null) {
                newAuthorizationLoggingBundle.putString(EVENT_PARAM_ERROR_MESSAGE, str4);
            }
            if (str5 != null) {
                newAuthorizationLoggingBundle.putString(EVENT_PARAM_ERROR_CODE, str5);
            }
            if (map != null && (!map.isEmpty())) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (entry.getKey() != null) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                newAuthorizationLoggingBundle.putString(EVENT_PARAM_EXTRAS, new JSONObject(linkedHashMap).toString());
            }
            newAuthorizationLoggingBundle.putString(EVENT_PARAM_METHOD, str2);
            this.logger.logEventImplicitly(str6, newAuthorizationLoggingBundle);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logAuthorizationMethodNotTried(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Bundle newAuthorizationLoggingBundle = Companion.newAuthorizationLoggingBundle(str);
            newAuthorizationLoggingBundle.putString(EVENT_PARAM_METHOD, str2);
            this.logger.logEventImplicitly(str3, newAuthorizationLoggingBundle);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logAuthorizationMethodStart(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Bundle newAuthorizationLoggingBundle = Companion.newAuthorizationLoggingBundle(str);
            newAuthorizationLoggingBundle.putString(EVENT_PARAM_METHOD, str2);
            this.logger.logEventImplicitly(str3, newAuthorizationLoggingBundle);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logCompleteLogin(@Nullable String str, @NotNull Map<String, String> map, @Nullable LoginClient.Result.Code code, @Nullable Map<String, String> map2, @Nullable Exception exc, @Nullable String str2) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            p0.a.s(map, "loggingExtras");
            Bundle newAuthorizationLoggingBundle = Companion.newAuthorizationLoggingBundle(str);
            if (code != null) {
                newAuthorizationLoggingBundle.putString(EVENT_PARAM_LOGIN_RESULT, code.getLoggingValue());
            }
            if ((exc == null ? null : exc.getMessage()) != null) {
                newAuthorizationLoggingBundle.putString(EVENT_PARAM_ERROR_MESSAGE, exc.getMessage());
            }
            JSONObject jSONObject = map.isEmpty() ^ true ? new JSONObject(map) : null;
            if (map2 != null) {
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                try {
                    for (Map.Entry<String, String> entry : map2.entrySet()) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        if (key != null) {
                            jSONObject.put(key, value);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
            if (jSONObject != null) {
                newAuthorizationLoggingBundle.putString(EVENT_PARAM_EXTRAS, jSONObject.toString());
            }
            this.logger.logEventImplicitly(str2, newAuthorizationLoggingBundle);
            if (code == LoginClient.Result.Code.SUCCESS) {
                logHeartbeatEvent(str);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logStartLogin(@NotNull LoginClient.Request request, @Nullable String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            p0.a.s(request, "pendingLoginRequest");
            Bundle newAuthorizationLoggingBundle = Companion.newAuthorizationLoggingBundle(request.getAuthId());
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("login_behavior", request.getLoginBehavior().toString());
                jSONObject.put(EVENT_EXTRAS_REQUEST_CODE, LoginClient.Companion.getLoginRequestCode());
                jSONObject.put("permissions", TextUtils.join(",", request.getPermissions()));
                jSONObject.put("default_audience", request.getDefaultAudience().toString());
                jSONObject.put(EVENT_EXTRAS_IS_REAUTHORIZE, request.isRerequest());
                String str2 = this.facebookVersion;
                if (str2 != null) {
                    jSONObject.put(EVENT_EXTRAS_FACEBOOK_VERSION, str2);
                }
                if (request.getLoginTargetApp() != null) {
                    jSONObject.put(EVENT_EXTRAS_TARGET_APP, request.getLoginTargetApp().toString());
                }
                newAuthorizationLoggingBundle.putString(EVENT_PARAM_EXTRAS, jSONObject.toString());
            } catch (JSONException unused) {
            }
            this.logger.logEventImplicitly(str, newAuthorizationLoggingBundle);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logUnexpectedError(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Bundle newAuthorizationLoggingBundle = Companion.newAuthorizationLoggingBundle("");
            newAuthorizationLoggingBundle.putString(EVENT_PARAM_LOGIN_RESULT, LoginClient.Result.Code.ERROR.getLoggingValue());
            newAuthorizationLoggingBundle.putString(EVENT_PARAM_ERROR_MESSAGE, str2);
            newAuthorizationLoggingBundle.putString(EVENT_PARAM_METHOD, str3);
            this.logger.logEventImplicitly(str, newAuthorizationLoggingBundle);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }
}
