package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.annotation.RestrictTo;
import com.facebook.AccessToken;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Currency;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class AppEventsLogger {

    @NotNull
    public static final String ACTION_APP_EVENTS_FLUSHED = "com.facebook.sdk.APP_EVENTS_FLUSHED";

    @NotNull
    public static final String APP_EVENTS_EXTRA_FLUSH_RESULT = "com.facebook.sdk.APP_EVENTS_FLUSH_RESULT";

    @NotNull
    public static final String APP_EVENTS_EXTRA_NUM_EVENTS_FLUSHED = "com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED";

    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final String TAG = AppEventsLogger.class.getCanonicalName();

    @NotNull
    private final AppEventsLoggerImpl loggerImpl;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final void activateApp(@NotNull Application application) {
            p0.a.s(application, "application");
            AppEventsLoggerImpl.Companion.activateApp(application, null);
        }

        public final void augmentWebView(@NotNull WebView webView, @Nullable Context context) {
            p0.a.s(webView, "webView");
            AppEventsLoggerImpl.Companion.augmentWebView(webView, context);
        }

        public final void clearUserData() {
            UserDataStore.clear();
        }

        public final void clearUserID() {
            AnalyticsUserIDStore.setUserID(null);
        }

        @NotNull
        public final String getAnonymousAppDeviceGUID(@NotNull Context context) {
            p0.a.s(context, "context");
            return AppEventsLoggerImpl.Companion.getAnonymousAppDeviceGUID(context);
        }

        @Nullable
        public final FlushBehavior getFlushBehavior() {
            return AppEventsLoggerImpl.Companion.getFlushBehavior();
        }

        @NotNull
        public final String getUserData() {
            return UserDataStore.getHashedUserData$facebook_core_release();
        }

        @Nullable
        public final String getUserID() {
            return AnalyticsUserIDStore.getUserID();
        }

        public final void initializeLib(@NotNull Context context, @Nullable String str) {
            p0.a.s(context, "context");
            AppEventsLoggerImpl.Companion.initializeLib(context, str);
        }

        @NotNull
        public final AppEventsLogger newLogger(@NotNull Context context) {
            p0.a.s(context, "context");
            return new AppEventsLogger(context, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
        }

        public final void onContextStop() {
            AppEventsLoggerImpl.Companion.onContextStop();
        }

        public final void setFlushBehavior(@NotNull FlushBehavior flushBehavior) {
            p0.a.s(flushBehavior, "flushBehavior");
            AppEventsLoggerImpl.Companion.setFlushBehavior(flushBehavior);
        }

        @RestrictTo
        public final void setInstallReferrer(@Nullable String str) {
            AppEventsLoggerImpl.Companion.setInstallReferrer(str);
        }

        public final void setPushNotificationsRegistrationId(@Nullable String str) {
            AppEventsLoggerImpl.Companion.setPushNotificationsRegistrationId(str);
        }

        public final void setUserData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10) {
            UserDataStore.setUserDataAndHash(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
        }

        public final void setUserID(@Nullable String str) {
            AnalyticsUserIDStore.setUserID(str);
        }

        public final void activateApp(@NotNull Application application, @Nullable String str) {
            p0.a.s(application, "application");
            AppEventsLoggerImpl.Companion.activateApp(application, str);
        }

        @NotNull
        public final AppEventsLogger newLogger(@NotNull Context context, @Nullable AccessToken accessToken) {
            p0.a.s(context, "context");
            return new AppEventsLogger(context, null, accessToken, 0 == true ? 1 : 0);
        }

        @NotNull
        public final AppEventsLogger newLogger(@NotNull Context context, @Nullable String str, @Nullable AccessToken accessToken) {
            p0.a.s(context, "context");
            return new AppEventsLogger(context, str, accessToken, null);
        }

        @NotNull
        public final AppEventsLogger newLogger(@NotNull Context context, @Nullable String str) {
            p0.a.s(context, "context");
            return new AppEventsLogger(context, str, null, 0 == true ? 1 : 0);
        }
    }

    /* loaded from: classes2.dex */
    public enum FlushBehavior {
        AUTO,
        EXPLICIT_ONLY;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static FlushBehavior[] valuesCustom() {
            FlushBehavior[] valuesCustom = values();
            return (FlushBehavior[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* loaded from: classes2.dex */
    public enum ProductAvailability {
        IN_STOCK,
        OUT_OF_STOCK,
        PREORDER,
        AVALIABLE_FOR_ORDER,
        DISCONTINUED;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static ProductAvailability[] valuesCustom() {
            ProductAvailability[] valuesCustom = values();
            return (ProductAvailability[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* loaded from: classes2.dex */
    public enum ProductCondition {
        NEW,
        REFURBISHED,
        USED;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static ProductCondition[] valuesCustom() {
            ProductCondition[] valuesCustom = values();
            return (ProductCondition[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public /* synthetic */ AppEventsLogger(Context context, String str, AccessToken accessToken, k kVar) {
        this(context, str, accessToken);
    }

    public static final void activateApp(@NotNull Application application) {
        Companion.activateApp(application);
    }

    public static final void augmentWebView(@NotNull WebView webView, @Nullable Context context) {
        Companion.augmentWebView(webView, context);
    }

    public static final void clearUserData() {
        Companion.clearUserData();
    }

    public static final void clearUserID() {
        Companion.clearUserID();
    }

    @NotNull
    public static final String getAnonymousAppDeviceGUID(@NotNull Context context) {
        return Companion.getAnonymousAppDeviceGUID(context);
    }

    @Nullable
    public static final FlushBehavior getFlushBehavior() {
        return Companion.getFlushBehavior();
    }

    @NotNull
    public static final String getUserData() {
        return Companion.getUserData();
    }

    @Nullable
    public static final String getUserID() {
        return Companion.getUserID();
    }

    public static final void initializeLib(@NotNull Context context, @Nullable String str) {
        Companion.initializeLib(context, str);
    }

    @NotNull
    public static final AppEventsLogger newLogger(@NotNull Context context) {
        return Companion.newLogger(context);
    }

    public static final void onContextStop() {
        Companion.onContextStop();
    }

    public static final void setFlushBehavior(@NotNull FlushBehavior flushBehavior) {
        Companion.setFlushBehavior(flushBehavior);
    }

    @RestrictTo
    public static final void setInstallReferrer(@Nullable String str) {
        Companion.setInstallReferrer(str);
    }

    public static final void setPushNotificationsRegistrationId(@Nullable String str) {
        Companion.setPushNotificationsRegistrationId(str);
    }

    public static final void setUserData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10) {
        Companion.setUserData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    public static final void setUserID(@Nullable String str) {
        Companion.setUserID(str);
    }

    public final void flush() {
        this.loggerImpl.flush();
    }

    @NotNull
    public final String getApplicationId() {
        return this.loggerImpl.getApplicationId();
    }

    public final boolean isValidForAccessToken(@NotNull AccessToken accessToken) {
        p0.a.s(accessToken, SDKConstants.PARAM_ACCESS_TOKEN);
        return this.loggerImpl.isValidForAccessToken(accessToken);
    }

    public final void logEvent(@Nullable String str) {
        this.loggerImpl.logEvent(str);
    }

    public final void logProductItem(@Nullable String str, @Nullable ProductAvailability productAvailability, @Nullable ProductCondition productCondition, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable BigDecimal bigDecimal, @Nullable Currency currency, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Bundle bundle) {
        this.loggerImpl.logProductItem(str, productAvailability, productCondition, str2, str3, str4, str5, bigDecimal, currency, str6, str7, str8, bundle);
    }

    public final void logPurchase(@Nullable BigDecimal bigDecimal, @Nullable Currency currency) {
        this.loggerImpl.logPurchase(bigDecimal, currency);
    }

    public final void logPushNotificationOpen(@NotNull Bundle bundle) {
        p0.a.s(bundle, "payload");
        this.loggerImpl.logPushNotificationOpen(bundle, null);
    }

    private AppEventsLogger(Context context, String str, AccessToken accessToken) {
        this.loggerImpl = new AppEventsLoggerImpl(context, str, accessToken);
    }

    public static final void activateApp(@NotNull Application application, @Nullable String str) {
        Companion.activateApp(application, str);
    }

    @NotNull
    public static final AppEventsLogger newLogger(@NotNull Context context, @Nullable AccessToken accessToken) {
        return Companion.newLogger(context, accessToken);
    }

    public final void logEvent(@Nullable String str, double d) {
        this.loggerImpl.logEvent(str, d);
    }

    public final void logPurchase(@Nullable BigDecimal bigDecimal, @Nullable Currency currency, @Nullable Bundle bundle) {
        this.loggerImpl.logPurchase(bigDecimal, currency, bundle);
    }

    public final void logPushNotificationOpen(@NotNull Bundle bundle, @Nullable String str) {
        p0.a.s(bundle, "payload");
        this.loggerImpl.logPushNotificationOpen(bundle, str);
    }

    @NotNull
    public static final AppEventsLogger newLogger(@NotNull Context context, @Nullable String str) {
        return Companion.newLogger(context, str);
    }

    public final void logEvent(@Nullable String str, @Nullable Bundle bundle) {
        this.loggerImpl.logEvent(str, bundle);
    }

    @NotNull
    public static final AppEventsLogger newLogger(@NotNull Context context, @Nullable String str, @Nullable AccessToken accessToken) {
        return Companion.newLogger(context, str, accessToken);
    }

    public final void logEvent(@Nullable String str, double d, @Nullable Bundle bundle) {
        this.loggerImpl.logEvent(str, d, bundle);
    }
}
