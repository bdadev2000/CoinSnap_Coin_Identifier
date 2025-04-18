package com.facebook;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.AsyncTask;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import b1.f0;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.Profile;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.AppEventsLoggerImpl;
import com.facebook.appevents.AppEventsManager;
import com.facebook.appevents.internal.ActivityLifecycleTracker;
import com.facebook.appevents.internal.AppEventsLoggerUtility;
import com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.BoltsMeasurementEventListener;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppGateKeepersManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.LockOnGetVariable;
import com.facebook.internal.Logger;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.internal.instrument.InstrumentManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import e0.q;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import z0.m;

/* loaded from: classes2.dex */
public final class FacebookSdk {

    @NotNull
    public static final String ADVERTISER_ID_COLLECTION_ENABLED_PROPERTY = "com.facebook.sdk.AdvertiserIDCollectionEnabled";

    @NotNull
    public static final String APPLICATION_ID_PROPERTY = "com.facebook.sdk.ApplicationId";

    @NotNull
    public static final String APPLICATION_NAME_PROPERTY = "com.facebook.sdk.ApplicationName";

    @NotNull
    public static final String APP_EVENT_PREFERENCES = "com.facebook.sdk.appEventPreferences";

    @NotNull
    private static final String ATTRIBUTION_PREFERENCES = "com.facebook.sdk.attributionTracking";

    @NotNull
    public static final String AUTO_INIT_ENABLED_PROPERTY = "com.facebook.sdk.AutoInitEnabled";

    @NotNull
    public static final String AUTO_LOG_APP_EVENTS_ENABLED_PROPERTY = "com.facebook.sdk.AutoLogAppEventsEnabled";

    @NotNull
    public static final String CALLBACK_OFFSET_CHANGED_AFTER_INIT = "The callback request code offset can't be updated once the SDK is initialized. Call FacebookSdk.setCallbackRequestCodeOffset inside your Application.onCreate method";

    @NotNull
    public static final String CALLBACK_OFFSET_NEGATIVE = "The callback request code offset can't be negative.";

    @NotNull
    public static final String CALLBACK_OFFSET_PROPERTY = "com.facebook.sdk.CallbackOffset";

    @NotNull
    public static final String CLIENT_TOKEN_PROPERTY = "com.facebook.sdk.ClientToken";

    @NotNull
    public static final String CLOUDBRIDGE_SAVED_CREDENTIALS = "com.facebook.sdk.CloudBridgeSavedCredentials";

    @NotNull
    public static final String CODELESS_DEBUG_LOG_ENABLED_PROPERTY = "com.facebook.sdk.CodelessDebugLogEnabled";

    @NotNull
    public static final String DATA_PROCESSING_OPTIONS_PREFERENCES = "com.facebook.sdk.DataProcessingOptions";

    @NotNull
    public static final String DATA_PROCESSION_OPTIONS = "data_processing_options";

    @NotNull
    public static final String DATA_PROCESSION_OPTIONS_COUNTRY = "data_processing_options_country";

    @NotNull
    public static final String DATA_PROCESSION_OPTIONS_STATE = "data_processing_options_state";

    @NotNull
    public static final String FB_GG = "fb.gg";

    @NotNull
    public static final String GAMING = "gaming";

    @NotNull
    public static final String INSTAGRAM = "instagram";
    private static final int MAX_REQUEST_CODE_RANGE = 100;

    @NotNull
    public static final String MONITOR_ENABLED_PROPERTY = "com.facebook.sdk.MonitorEnabled";

    @NotNull
    private static final String PUBLISH_ACTIVITY_PATH = "%s/activities";

    @NotNull
    public static final String WEB_DIALOG_THEME = "com.facebook.sdk.WebDialogTheme";

    @Nullable
    private static volatile String appClientToken;
    private static Context applicationContext;

    @Nullable
    private static volatile String applicationId;

    @Nullable
    private static volatile String applicationName;
    public static boolean bypassAppSwitch;
    private static LockOnGetVariable<File> cacheDir;

    @Nullable
    private static volatile Boolean codelessDebugLogEnabled;

    @Nullable
    private static Executor executor;
    public static boolean hasCustomTabsPrefetching;
    public static boolean ignoreAppSwitchToLoggedOut;
    private static volatile boolean isDebugEnabledField;
    private static boolean isFullyInitialized;
    private static boolean isLegacyTokenUpgradeSupported;

    @NotNull
    public static final FacebookSdk INSTANCE = new FacebookSdk();
    private static final String TAG = FacebookSdk.class.getCanonicalName();

    @NotNull
    private static final HashSet<LoggingBehavior> loggingBehaviors = f0.q(LoggingBehavior.DEVELOPER_ERRORS);

    @NotNull
    private static AtomicLong onProgressThreshold = new AtomicLong(65536);
    private static final int DEFAULT_CALLBACK_REQUEST_CODE_OFFSET = 64206;
    private static int callbackRequestCodeOffset = DEFAULT_CALLBACK_REQUEST_CODE_OFFSET;

    @NotNull
    private static final ReentrantLock LOCK = new ReentrantLock();

    @NotNull
    private static String graphApiVersion = ServerProtocol.getDefaultAPIVersion();

    @NotNull
    private static final AtomicBoolean sdkInitialized = new AtomicBoolean(false);

    @NotNull
    public static final String INSTAGRAM_COM = "instagram.com";

    @NotNull
    private static volatile String instagramDomain = INSTAGRAM_COM;

    @NotNull
    public static final String FACEBOOK_COM = "facebook.com";

    @NotNull
    private static volatile String facebookDomain = FACEBOOK_COM;

    @NotNull
    private static GraphRequestCreator graphRequestCreator = new androidx.compose.animation.core.a(25);

    @VisibleForTesting
    /* loaded from: classes2.dex */
    public interface GraphRequestCreator {
        @NotNull
        GraphRequest createPostRequest(@Nullable AccessToken accessToken, @Nullable String str, @Nullable JSONObject jSONObject, @Nullable GraphRequest.Callback callback);
    }

    /* loaded from: classes2.dex */
    public interface InitializeCallback {
        void onInitialized();
    }

    private FacebookSdk() {
    }

    public static final void addLoggingBehavior(@NotNull LoggingBehavior loggingBehavior) {
        p0.a.s(loggingBehavior, "behavior");
        HashSet<LoggingBehavior> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            hashSet.add(loggingBehavior);
            INSTANCE.updateGraphDebugBehavior();
        }
    }

    public static final void clearLoggingBehaviors() {
        HashSet<LoggingBehavior> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            hashSet.clear();
        }
    }

    public static /* synthetic */ void f(Context context, String str) {
        m418publishInstallAsync$lambda15(context, str);
    }

    public static final void fullyInitialize() {
        isFullyInitialized = true;
    }

    public static final boolean getAdvertiserIDCollectionEnabled() {
        return UserSettingsManager.getAdvertiserIDCollectionEnabled();
    }

    @NotNull
    public static final Context getApplicationContext() {
        Validate.sdkInitialized();
        Context context = applicationContext;
        if (context != null) {
            return context;
        }
        p0.a.B0("applicationContext");
        throw null;
    }

    @NotNull
    public static final String getApplicationId() {
        Validate.sdkInitialized();
        String str = applicationId;
        if (str != null) {
            return str;
        }
        throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    @Nullable
    public static final String getApplicationName() {
        Validate.sdkInitialized();
        return applicationName;
    }

    @Nullable
    public static final String getApplicationSignature(@Nullable Context context) {
        PackageManager packageManager;
        if (CrashShieldHandler.isObjectCrashing(FacebookSdk.class)) {
            return null;
        }
        try {
            Validate.sdkInitialized();
            if (context == null || (packageManager = context.getPackageManager()) == null) {
                return null;
            }
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 64);
                Signature[] signatureArr = packageInfo.signatures;
                if (signatureArr != null && signatureArr.length != 0) {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                    messageDigest.update(packageInfo.signatures[0].toByteArray());
                    return Base64.encodeToString(messageDigest.digest(), 9);
                }
            } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, FacebookSdk.class);
            return null;
        }
    }

    public static final boolean getAutoInitEnabled() {
        return UserSettingsManager.getAutoInitEnabled();
    }

    public static final boolean getAutoLogAppEventsEnabled() {
        return UserSettingsManager.getAutoLogAppEventsEnabled();
    }

    @Nullable
    public static final File getCacheDir() {
        Validate.sdkInitialized();
        LockOnGetVariable<File> lockOnGetVariable = cacheDir;
        if (lockOnGetVariable != null) {
            return lockOnGetVariable.getValue();
        }
        p0.a.B0("cacheDir");
        throw null;
    }

    public static final int getCallbackRequestCodeOffset() {
        Validate.sdkInitialized();
        return callbackRequestCodeOffset;
    }

    @NotNull
    public static final String getClientToken() {
        Validate.sdkInitialized();
        String str = appClientToken;
        if (str != null) {
            return str;
        }
        throw new FacebookException("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }

    public static final boolean getCodelessDebugLogEnabled() {
        Validate.sdkInitialized();
        Boolean bool = codelessDebugLogEnabled;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static final boolean getCodelessSetupEnabled() {
        return UserSettingsManager.getCodelessSetupEnabled();
    }

    @NotNull
    public static final Executor getExecutor() {
        ReentrantLock reentrantLock = LOCK;
        reentrantLock.lock();
        try {
            if (executor == null) {
                executor = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            reentrantLock.unlock();
            Executor executor2 = executor;
            if (executor2 != null) {
                return executor2;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @NotNull
    public static final String getFacebookDomain() {
        return facebookDomain;
    }

    @NotNull
    public static final String getFacebookGamingDomain() {
        return "fb.gg";
    }

    @NotNull
    public static final String getGraphApiVersion() {
        Utility utility = Utility.INSTANCE;
        String str = TAG;
        String format = String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{graphApiVersion}, 1));
        p0.a.r(format, "java.lang.String.format(format, *args)");
        Utility.logd(str, format);
        return graphApiVersion;
    }

    @NotNull
    public static final String getGraphDomain() {
        AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
        return Utility.getGraphDomainFromTokenDomain(currentAccessToken != null ? currentAccessToken.getGraphDomain() : null);
    }

    @NotNull
    public static final String getInstagramDomain() {
        return instagramDomain;
    }

    public static final boolean getLimitEventAndDataUsage(@NotNull Context context) {
        p0.a.s(context, "context");
        Validate.sdkInitialized();
        return context.getSharedPreferences(APP_EVENT_PREFERENCES, 0).getBoolean("limitEventUsage", false);
    }

    @NotNull
    public static final Set<LoggingBehavior> getLoggingBehaviors() {
        Set<LoggingBehavior> unmodifiableSet;
        HashSet<LoggingBehavior> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            unmodifiableSet = Collections.unmodifiableSet(new HashSet(hashSet));
            p0.a.r(unmodifiableSet, "unmodifiableSet(HashSet(loggingBehaviors))");
        }
        return unmodifiableSet;
    }

    public static final boolean getMonitorEnabled() {
        return UserSettingsManager.getMonitorEnabled();
    }

    public static final long getOnProgressThreshold() {
        Validate.sdkInitialized();
        return onProgressThreshold.get();
    }

    @NotNull
    public static final String getSdkVersion() {
        return FacebookSdkVersion.BUILD;
    }

    /* renamed from: graphRequestCreator$lambda-0 */
    public static final GraphRequest m417graphRequestCreator$lambda0(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.Callback callback) {
        return GraphRequest.Companion.newPostRequest(accessToken, str, jSONObject, callback);
    }

    public static final boolean isDebugEnabled() {
        return isDebugEnabledField;
    }

    public static final boolean isFacebookRequestCode(int i2) {
        int i3 = callbackRequestCodeOffset;
        return i2 >= i3 && i2 < i3 + 100;
    }

    @RestrictTo
    public static final synchronized boolean isFullyInitialized() {
        boolean z2;
        synchronized (FacebookSdk.class) {
            z2 = isFullyInitialized;
        }
        return z2;
    }

    public static final boolean isInitialized() {
        return sdkInitialized.get();
    }

    public static final boolean isLegacyTokenUpgradeSupported() {
        return isLegacyTokenUpgradeSupported;
    }

    public static final boolean isLoggingBehaviorEnabled(@NotNull LoggingBehavior loggingBehavior) {
        boolean z2;
        p0.a.s(loggingBehavior, "behavior");
        HashSet<LoggingBehavior> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            if (isDebugEnabled()) {
                z2 = hashSet.contains(loggingBehavior);
            }
        }
        return z2;
    }

    public static final void loadDefaultsFromMetadata$facebook_core_release(@Nullable Context context) {
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            p0.a.r(applicationInfo, "try {\n          context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)\n        } catch (e: PackageManager.NameNotFoundException) {\n          return\n        }");
            if (applicationInfo.metaData == null) {
                return;
            }
            if (applicationId == null) {
                Object obj = applicationInfo.metaData.get(APPLICATION_ID_PROPERTY);
                if (obj instanceof String) {
                    String str = (String) obj;
                    Locale locale = Locale.ROOT;
                    p0.a.r(locale, "ROOT");
                    String lowerCase = str.toLowerCase(locale);
                    p0.a.r(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    if (m.q1(lowerCase, "fb", false)) {
                        String substring = str.substring(2);
                        p0.a.r(substring, "(this as java.lang.String).substring(startIndex)");
                        applicationId = substring;
                    } else {
                        applicationId = str;
                    }
                } else if (obj instanceof Number) {
                    throw new FacebookException("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            if (applicationName == null) {
                applicationName = applicationInfo.metaData.getString(APPLICATION_NAME_PROPERTY);
            }
            if (appClientToken == null) {
                appClientToken = applicationInfo.metaData.getString(CLIENT_TOKEN_PROPERTY);
            }
            if (callbackRequestCodeOffset == DEFAULT_CALLBACK_REQUEST_CODE_OFFSET) {
                callbackRequestCodeOffset = applicationInfo.metaData.getInt(CALLBACK_OFFSET_PROPERTY, DEFAULT_CALLBACK_REQUEST_CODE_OFFSET);
            }
            if (codelessDebugLogEnabled == null) {
                codelessDebugLogEnabled = Boolean.valueOf(applicationInfo.metaData.getBoolean(CODELESS_DEBUG_LOG_ENABLED_PROPERTY, false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    private final void publishInstallAndWaitForResponse(Context context, String str) {
        try {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                AttributionIdentifiers attributionIdentifiers = AttributionIdentifiers.Companion.getAttributionIdentifiers(context);
                SharedPreferences sharedPreferences = context.getSharedPreferences(ATTRIBUTION_PREFERENCES, 0);
                String z02 = p0.a.z0("ping", str);
                long j2 = sharedPreferences.getLong(z02, 0L);
                try {
                    AppEventsLoggerUtility appEventsLoggerUtility = AppEventsLoggerUtility.INSTANCE;
                    JSONObject jSONObjectForGraphAPICall = AppEventsLoggerUtility.getJSONObjectForGraphAPICall(AppEventsLoggerUtility.GraphAPIActivityType.MOBILE_INSTALL_EVENT, attributionIdentifiers, AppEventsLogger.Companion.getAnonymousAppDeviceGUID(context), getLimitEventAndDataUsage(context), context);
                    String installReferrer = AppEventsLoggerImpl.Companion.getInstallReferrer();
                    if (installReferrer != null) {
                        jSONObjectForGraphAPICall.put("install_referrer", installReferrer);
                    }
                    String format = String.format(PUBLISH_ACTIVITY_PATH, Arrays.copyOf(new Object[]{str}, 1));
                    p0.a.r(format, "java.lang.String.format(format, *args)");
                    GraphRequest createPostRequest = graphRequestCreator.createPostRequest(null, format, jSONObjectForGraphAPICall, null);
                    if (j2 == 0 && createPostRequest.executeAndWait().getError() == null) {
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.putLong(z02, System.currentTimeMillis());
                        edit.apply();
                        Logger.Companion companion = Logger.Companion;
                        LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
                        String str2 = TAG;
                        p0.a.r(str2, "TAG");
                        companion.log(loggingBehavior, str2, "MOBILE_APP_INSTALL has been logged");
                    }
                } catch (JSONException e) {
                    throw new FacebookException("An error occurred while publishing install.", e);
                }
            } catch (Exception e2) {
                Utility.logd("Facebook-publish", e2);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @VisibleForTesting
    public static final void publishInstallAsync(@NotNull Context context, @NotNull String str) {
        if (CrashShieldHandler.isObjectCrashing(FacebookSdk.class)) {
            return;
        }
        try {
            p0.a.s(context, "context");
            p0.a.s(str, "applicationId");
            Context applicationContext2 = context.getApplicationContext();
            if (applicationContext2 == null) {
                return;
            }
            FetchedAppGateKeepersManager fetchedAppGateKeepersManager = FetchedAppGateKeepersManager.INSTANCE;
            if (!FetchedAppGateKeepersManager.getGateKeeperForKey(AppEventsLoggerImpl.APP_EVENTS_KILLSWITCH, getApplicationId(), false)) {
                getExecutor().execute(new androidx.core.content.res.a(25, applicationContext2, str));
            }
            FeatureManager featureManager = FeatureManager.INSTANCE;
            if (FeatureManager.isEnabled(FeatureManager.Feature.OnDeviceEventProcessing) && OnDeviceProcessingManager.isOnDeviceProcessingEnabled()) {
                OnDeviceProcessingManager.sendInstallEventAsync(str, ATTRIBUTION_PREFERENCES);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, FacebookSdk.class);
        }
    }

    /* renamed from: publishInstallAsync$lambda-15 */
    public static final void m418publishInstallAsync$lambda15(Context context, String str) {
        p0.a.s(context, "$applicationContext");
        p0.a.s(str, "$applicationId");
        INSTANCE.publishInstallAndWaitForResponse(context, str);
    }

    public static final void removeLoggingBehavior(@NotNull LoggingBehavior loggingBehavior) {
        p0.a.s(loggingBehavior, "behavior");
        HashSet<LoggingBehavior> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            hashSet.remove(loggingBehavior);
        }
    }

    @d0.a
    public static final synchronized void sdkInitialize(@NotNull Context context, int i2) {
        synchronized (FacebookSdk.class) {
            p0.a.s(context, "applicationContext");
            sdkInitialize(context, i2, null);
        }
    }

    /* renamed from: sdkInitialize$lambda-3 */
    public static final File m419sdkInitialize$lambda3() {
        Context context = applicationContext;
        if (context != null) {
            return context.getCacheDir();
        }
        p0.a.B0("applicationContext");
        throw null;
    }

    /* renamed from: sdkInitialize$lambda-4 */
    public static final void m420sdkInitialize$lambda4(boolean z2) {
        if (z2) {
            InstrumentManager.start();
        }
    }

    /* renamed from: sdkInitialize$lambda-5 */
    public static final void m421sdkInitialize$lambda5(boolean z2) {
        if (z2) {
            AppEventsManager.start();
        }
    }

    /* renamed from: sdkInitialize$lambda-6 */
    public static final void m422sdkInitialize$lambda6(boolean z2) {
        if (z2) {
            hasCustomTabsPrefetching = true;
        }
    }

    /* renamed from: sdkInitialize$lambda-7 */
    public static final void m423sdkInitialize$lambda7(boolean z2) {
        if (z2) {
            ignoreAppSwitchToLoggedOut = true;
        }
    }

    /* renamed from: sdkInitialize$lambda-8 */
    public static final void m424sdkInitialize$lambda8(boolean z2) {
        if (z2) {
            bypassAppSwitch = true;
        }
    }

    /* renamed from: sdkInitialize$lambda-9 */
    public static final Void m425sdkInitialize$lambda9(InitializeCallback initializeCallback) {
        AccessTokenManager.Companion.getInstance().loadCurrentAccessToken();
        ProfileManager.Companion.getInstance().loadCurrentProfile();
        if (AccessToken.Companion.isCurrentAccessTokenActive()) {
            Profile.Companion companion = Profile.Companion;
            if (companion.getCurrentProfile() == null) {
                companion.fetchProfileForCurrentAccessToken();
            }
        }
        if (initializeCallback != null) {
            initializeCallback.onInitialized();
        }
        AppEventsLogger.Companion companion2 = AppEventsLogger.Companion;
        companion2.initializeLib(getApplicationContext(), applicationId);
        UserSettingsManager.logIfAutoAppLinkEnabled();
        Context applicationContext2 = getApplicationContext().getApplicationContext();
        p0.a.r(applicationContext2, "getApplicationContext().applicationContext");
        companion2.newLogger(applicationContext2).flush();
        return null;
    }

    public static final void setAdvertiserIDCollectionEnabled(boolean z2) {
        UserSettingsManager.setAdvertiserIDCollectionEnabled(z2);
    }

    public static final void setApplicationId(@NotNull String str) {
        p0.a.s(str, "applicationId");
        Validate.notEmpty(str, "applicationId");
        applicationId = str;
    }

    public static final void setApplicationName(@Nullable String str) {
        applicationName = str;
    }

    public static final void setAutoInitEnabled(boolean z2) {
        UserSettingsManager.setAutoInitEnabled(z2);
        if (z2) {
            fullyInitialize();
        }
    }

    public static final void setAutoLogAppEventsEnabled(boolean z2) {
        UserSettingsManager.setAutoLogAppEventsEnabled(z2);
        if (z2) {
            Application application = (Application) getApplicationContext();
            ActivityLifecycleTracker activityLifecycleTracker = ActivityLifecycleTracker.INSTANCE;
            ActivityLifecycleTracker.startTracking(application, getApplicationId());
        }
    }

    public static final void setCacheDir(@NotNull File file) {
        p0.a.s(file, "cacheDir");
        cacheDir = new LockOnGetVariable<>(file);
    }

    public static final void setClientToken(@Nullable String str) {
        appClientToken = str;
    }

    public static final void setCodelessDebugLogEnabled(boolean z2) {
        codelessDebugLogEnabled = Boolean.valueOf(z2);
    }

    public static final void setDataProcessingOptions(@Nullable String[] strArr) {
        if (CrashShieldHandler.isObjectCrashing(FacebookSdk.class)) {
            return;
        }
        try {
            setDataProcessingOptions(strArr, 0, 0);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, FacebookSdk.class);
        }
    }

    public static final void setExecutor(@NotNull Executor executor2) {
        p0.a.s(executor2, "executor");
        ReentrantLock reentrantLock = LOCK;
        reentrantLock.lock();
        try {
            executor = executor2;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final void setFacebookDomain(@NotNull String str) {
        p0.a.s(str, "facebookDomain");
        Log.w(TAG, "WARNING: Calling setFacebookDomain from non-DEBUG code.");
        facebookDomain = str;
    }

    public static final void setGraphApiVersion(@NotNull String str) {
        p0.a.s(str, "graphApiVersion");
        Log.w(TAG, "WARNING: Calling setGraphApiVersion from non-DEBUG code.");
        if (Utility.isNullOrEmpty(str) || p0.a.g(graphApiVersion, str)) {
            return;
        }
        graphApiVersion = str;
    }

    @VisibleForTesting
    public static final void setGraphRequestCreator$facebook_core_release(@NotNull GraphRequestCreator graphRequestCreator2) {
        p0.a.s(graphRequestCreator2, "graphRequestCreator");
        graphRequestCreator = graphRequestCreator2;
    }

    public static final void setIsDebugEnabled(boolean z2) {
        isDebugEnabledField = z2;
    }

    public static final void setLegacyTokenUpgradeSupported(boolean z2) {
        isLegacyTokenUpgradeSupported = z2;
    }

    public static final void setLimitEventAndDataUsage(@NotNull Context context, boolean z2) {
        p0.a.s(context, "context");
        context.getSharedPreferences(APP_EVENT_PREFERENCES, 0).edit().putBoolean("limitEventUsage", z2).apply();
    }

    public static final void setMonitorEnabled(boolean z2) {
        UserSettingsManager.setMonitorEnabled(z2);
    }

    public static final void setOnProgressThreshold(long j2) {
        onProgressThreshold.set(j2);
    }

    private final void updateGraphDebugBehavior() {
        HashSet<LoggingBehavior> hashSet = loggingBehaviors;
        if (hashSet.contains(LoggingBehavior.GRAPH_API_DEBUG_INFO)) {
            LoggingBehavior loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_WARNING;
            if (hashSet.contains(loggingBehavior)) {
                return;
            }
            hashSet.add(loggingBehavior);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        com.facebook.FacebookSdk.callbackRequestCodeOffset = r3;
        sdkInitialize(r2, r4);
     */
    @d0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final synchronized void sdkInitialize(@org.jetbrains.annotations.NotNull android.content.Context r2, int r3, @org.jetbrains.annotations.Nullable com.facebook.FacebookSdk.InitializeCallback r4) {
        /*
            java.lang.Class<com.facebook.FacebookSdk> r0 = com.facebook.FacebookSdk.class
            monitor-enter(r0)
            java.lang.String r1 = "applicationContext"
            p0.a.s(r2, r1)     // Catch: java.lang.Throwable -> L1d
            java.util.concurrent.atomic.AtomicBoolean r1 = com.facebook.FacebookSdk.sdkInitialized     // Catch: java.lang.Throwable -> L1d
            boolean r1 = r1.get()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1f
            int r1 = com.facebook.FacebookSdk.callbackRequestCodeOffset     // Catch: java.lang.Throwable -> L1d
            if (r3 != r1) goto L15
            goto L1f
        L15:
            com.facebook.FacebookException r2 = new com.facebook.FacebookException     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = "The callback request code offset can't be updated once the SDK is initialized. Call FacebookSdk.setCallbackRequestCodeOffset inside your Application.onCreate method"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1d
            throw r2     // Catch: java.lang.Throwable -> L1d
        L1d:
            r2 = move-exception
            goto L30
        L1f:
            if (r3 < 0) goto L28
            com.facebook.FacebookSdk.callbackRequestCodeOffset = r3     // Catch: java.lang.Throwable -> L1d
            sdkInitialize(r2, r4)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)
            return
        L28:
            com.facebook.FacebookException r2 = new com.facebook.FacebookException     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = "The callback request code offset can't be negative."
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1d
            throw r2     // Catch: java.lang.Throwable -> L1d
        L30:
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.FacebookSdk.sdkInitialize(android.content.Context, int, com.facebook.FacebookSdk$InitializeCallback):void");
    }

    public static final void setDataProcessingOptions(@Nullable String[] strArr, int i2, int i3) {
        if (CrashShieldHandler.isObjectCrashing(FacebookSdk.class)) {
            return;
        }
        if (strArr == null) {
            try {
                strArr = new String[0];
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, FacebookSdk.class);
                return;
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(DATA_PROCESSION_OPTIONS, new JSONArray((Collection) q.n0(strArr)));
            jSONObject.put(DATA_PROCESSION_OPTIONS_COUNTRY, i2);
            jSONObject.put(DATA_PROCESSION_OPTIONS_STATE, i3);
            Context context = applicationContext;
            if (context != null) {
                context.getSharedPreferences(DATA_PROCESSING_OPTIONS_PREFERENCES, 0).edit().putString(DATA_PROCESSION_OPTIONS, jSONObject.toString()).apply();
            } else {
                p0.a.B0("applicationContext");
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    @d0.a
    public static final synchronized void sdkInitialize(@NotNull Context context) {
        synchronized (FacebookSdk.class) {
            p0.a.s(context, "applicationContext");
            sdkInitialize(context, (InitializeCallback) null);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.concurrent.Callable] */
    @d0.a
    public static final synchronized void sdkInitialize(@NotNull Context context, @Nullable final InitializeCallback initializeCallback) {
        synchronized (FacebookSdk.class) {
            p0.a.s(context, "applicationContext");
            AtomicBoolean atomicBoolean = sdkInitialized;
            if (atomicBoolean.get()) {
                if (initializeCallback != null) {
                    initializeCallback.onInitialized();
                }
                return;
            }
            Validate.hasFacebookActivity(context, false);
            Validate.hasInternetPermissions(context, false);
            Context applicationContext2 = context.getApplicationContext();
            p0.a.r(applicationContext2, "applicationContext.applicationContext");
            applicationContext = applicationContext2;
            AppEventsLogger.Companion.getAnonymousAppDeviceGUID(context);
            Context context2 = applicationContext;
            if (context2 != null) {
                loadDefaultsFromMetadata$facebook_core_release(context2);
                String str = applicationId;
                if (str != null && str.length() != 0) {
                    String str2 = appClientToken;
                    if (str2 != null && str2.length() != 0) {
                        atomicBoolean.set(true);
                        if (getAutoInitEnabled()) {
                            fullyInitialize();
                        }
                        Context context3 = applicationContext;
                        if (context3 != null) {
                            if ((context3 instanceof Application) && UserSettingsManager.getAutoLogAppEventsEnabled()) {
                                ActivityLifecycleTracker activityLifecycleTracker = ActivityLifecycleTracker.INSTANCE;
                                Context context4 = applicationContext;
                                if (context4 == null) {
                                    p0.a.B0("applicationContext");
                                    throw null;
                                }
                                ActivityLifecycleTracker.startTracking((Application) context4, applicationId);
                            }
                            FetchedAppSettingsManager.loadAppSettingsAsync();
                            NativeProtocol.updateAllAvailableProtocolVersionsAsync();
                            BoltsMeasurementEventListener.Companion companion = BoltsMeasurementEventListener.Companion;
                            Context context5 = applicationContext;
                            if (context5 != null) {
                                companion.getInstance(context5);
                                cacheDir = new LockOnGetVariable<>((Callable) new Object());
                                FeatureManager featureManager = FeatureManager.INSTANCE;
                                FeatureManager.checkFeature(FeatureManager.Feature.Instrument, new androidx.compose.animation.core.a(20));
                                FeatureManager.checkFeature(FeatureManager.Feature.AppEvents, new androidx.compose.animation.core.a(21));
                                FeatureManager.checkFeature(FeatureManager.Feature.ChromeCustomTabsPrefetching, new androidx.compose.animation.core.a(22));
                                FeatureManager.checkFeature(FeatureManager.Feature.IgnoreAppSwitchToLoggedOut, new androidx.compose.animation.core.a(23));
                                FeatureManager.checkFeature(FeatureManager.Feature.BypassAppSwitch, new androidx.compose.animation.core.a(24));
                                getExecutor().execute(new FutureTask(new Callable() { // from class: com.facebook.g
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        Void m425sdkInitialize$lambda9;
                                        m425sdkInitialize$lambda9 = FacebookSdk.m425sdkInitialize$lambda9(FacebookSdk.InitializeCallback.this);
                                        return m425sdkInitialize$lambda9;
                                    }
                                }));
                                return;
                            }
                            p0.a.B0("applicationContext");
                            throw null;
                        }
                        p0.a.B0("applicationContext");
                        throw null;
                    }
                    throw new FacebookException("A valid Facebook app client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk.");
                }
                throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
            }
            p0.a.B0("applicationContext");
            throw null;
        }
    }
}
