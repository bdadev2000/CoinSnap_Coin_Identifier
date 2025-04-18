package com.facebook.login;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import b1.f0;
import com.applovin.impl.nw;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookActivity;
import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphResponse;
import com.facebook.LoginStatusCallback;
import com.facebook.Profile;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.CustomTabUtils;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.login.LoginClient;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import e0.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z0.m;

/* loaded from: classes2.dex */
public class LoginManager {

    @NotNull
    public static final Companion Companion;

    @NotNull
    private static final String EXPRESS_LOGIN_ALLOWED = "express_login_allowed";

    @NotNull
    private static final String MANAGE_PERMISSION_PREFIX = "manage";

    @NotNull
    private static final Set<String> OTHER_PUBLISH_PERMISSIONS;

    @NotNull
    private static final String PREFERENCE_LOGIN_MANAGER = "com.facebook.loginManager";

    @NotNull
    private static final String PUBLISH_PERMISSION_PREFIX = "publish";

    @NotNull
    private static final String TAG;
    private static volatile LoginManager instance;
    private boolean isFamilyLogin;

    @Nullable
    private String messengerPageId;
    private boolean resetMessengerState;

    @NotNull
    private final SharedPreferences sharedPreferences;
    private boolean shouldSkipAccountDeduplication;

    @NotNull
    private LoginBehavior loginBehavior = LoginBehavior.NATIVE_WITH_FALLBACK;

    @NotNull
    private DefaultAudience defaultAudience = DefaultAudience.FRIENDS;

    @NotNull
    private String authType = ServerProtocol.DIALOG_REREQUEST_AUTH_TYPE;

    @NotNull
    private LoginTargetApp loginTargetApp = LoginTargetApp.FACEBOOK;

    /* loaded from: classes2.dex */
    public static final class ActivityStartActivityDelegate implements StartActivityDelegate {

        @NotNull
        private final Activity activityContext;

        public ActivityStartActivityDelegate(@NotNull Activity activity) {
            p0.a.s(activity, "activity");
            this.activityContext = activity;
        }

        public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity p02, Intent p12, int p2) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
            if (p12 == null) {
                return;
            }
            BrandSafetyUtils.detectAdClick(p12, com.facebook.BuildConfig.LIBRARY_PACKAGE_NAME);
            p02.startActivityForResult(p12, p2);
        }

        @Override // com.facebook.login.StartActivityDelegate
        @NotNull
        public Activity getActivityContext() {
            return this.activityContext;
        }

        @Override // com.facebook.login.StartActivityDelegate
        public void startActivityForResult(@NotNull Intent intent, int i2) {
            p0.a.s(intent, SDKConstants.PARAM_INTENT);
            safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(getActivityContext(), intent, i2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class AndroidxActivityResultRegistryOwnerStartActivityDelegate implements StartActivityDelegate {

        @NotNull
        private final ActivityResultRegistryOwner activityResultRegistryOwner;

        @NotNull
        private final CallbackManager callbackManager;

        public AndroidxActivityResultRegistryOwnerStartActivityDelegate(@NotNull ActivityResultRegistryOwner activityResultRegistryOwner, @NotNull CallbackManager callbackManager) {
            p0.a.s(activityResultRegistryOwner, "activityResultRegistryOwner");
            p0.a.s(callbackManager, "callbackManager");
            this.activityResultRegistryOwner = activityResultRegistryOwner;
            this.callbackManager = callbackManager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: startActivityForResult$lambda-0, reason: not valid java name */
        public static final void m572startActivityForResult$lambda0(AndroidxActivityResultRegistryOwnerStartActivityDelegate androidxActivityResultRegistryOwnerStartActivityDelegate, LoginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder loginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder, Pair pair) {
            p0.a.s(androidxActivityResultRegistryOwnerStartActivityDelegate, "this$0");
            p0.a.s(loginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder, "$launcherHolder");
            CallbackManager callbackManager = androidxActivityResultRegistryOwnerStartActivityDelegate.callbackManager;
            int requestCode = CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
            Object obj = pair.first;
            p0.a.r(obj, "result.first");
            callbackManager.onActivityResult(requestCode, ((Number) obj).intValue(), (Intent) pair.second);
            ActivityResultLauncher<Intent> launcher = loginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder.getLauncher();
            if (launcher != null) {
                launcher.c();
            }
            loginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder.setLauncher(null);
        }

        @Override // com.facebook.login.StartActivityDelegate
        @Nullable
        public Activity getActivityContext() {
            Object obj = this.activityResultRegistryOwner;
            if (obj instanceof Activity) {
                return (Activity) obj;
            }
            return null;
        }

        @Override // com.facebook.login.StartActivityDelegate
        public void startActivityForResult(@NotNull Intent intent, int i2) {
            p0.a.s(intent, SDKConstants.PARAM_INTENT);
            LoginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder loginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder = new LoginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder();
            loginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder.setLauncher(this.activityResultRegistryOwner.getActivityResultRegistry().d("facebook-login", new ActivityResultContract<Intent, Pair<Integer, Intent>>() { // from class: com.facebook.login.LoginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$1
                @Override // androidx.activity.result.contract.ActivityResultContract
                @NotNull
                public Intent createIntent(@NotNull Context context, @NotNull Intent intent2) {
                    p0.a.s(context, "context");
                    p0.a.s(intent2, "input");
                    return intent2;
                }

                @Override // androidx.activity.result.contract.ActivityResultContract
                @NotNull
                public Pair<Integer, Intent> parseResult(int i3, @Nullable Intent intent2) {
                    Pair<Integer, Intent> create = Pair.create(Integer.valueOf(i3), intent2);
                    p0.a.r(create, "create(resultCode, intent)");
                    return create;
                }
            }, new g(this, loginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder)));
            ActivityResultLauncher<Intent> launcher = loginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder.getLauncher();
            if (launcher == null) {
                return;
            }
            launcher.b(intent);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Set<String> getOtherPublishPermissions() {
            return f0.C("ads_management", "create_event", "rsvp_event");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void handleLoginStatusError(String str, String str2, String str3, LoginLogger loginLogger, LoginStatusCallback loginStatusCallback) {
            FacebookException facebookException = new FacebookException(str + ": " + ((Object) str2));
            loginLogger.logLoginStatusError(str3, facebookException);
            loginStatusCallback.onError(facebookException);
        }

        @VisibleForTesting
        @NotNull
        public final LoginResult computeLoginResult(@NotNull LoginClient.Request request, @NotNull AccessToken accessToken, @Nullable AuthenticationToken authenticationToken) {
            p0.a.s(request, "request");
            p0.a.s(accessToken, "newToken");
            Set<String> permissions = request.getPermissions();
            Set d12 = u.d1(u.C0(accessToken.getPermissions()));
            if (request.isRerequest()) {
                d12.retainAll(permissions);
            }
            Set d13 = u.d1(u.C0(permissions));
            d13.removeAll(d12);
            return new LoginResult(accessToken, authenticationToken, d12, d13);
        }

        @RestrictTo
        @Nullable
        public final Map<String, String> getExtraDataFromIntent(@Nullable Intent intent) {
            if (intent == null) {
                return null;
            }
            intent.setExtrasClassLoader(LoginClient.Result.class.getClassLoader());
            LoginClient.Result result = (LoginClient.Result) intent.getParcelableExtra(LoginFragment.RESULT_KEY);
            if (result == null) {
                return null;
            }
            return result.extraData;
        }

        @NotNull
        public LoginManager getInstance() {
            if (LoginManager.instance == null) {
                synchronized (this) {
                    LoginManager.instance = new LoginManager();
                }
            }
            LoginManager loginManager = LoginManager.instance;
            if (loginManager != null) {
                return loginManager;
            }
            p0.a.B0("instance");
            throw null;
        }

        @RestrictTo
        public final boolean isPublishPermission(@Nullable String str) {
            if (str != null) {
                return m.q1(str, LoginManager.PUBLISH_PERMISSION_PREFIX, false) || m.q1(str, LoginManager.MANAGE_PERMISSION_PREFIX, false) || LoginManager.OTHER_PUBLISH_PERMISSIONS.contains(str);
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public final class FacebookLoginActivityResultContract extends ActivityResultContract<Collection<? extends String>, CallbackManager.ActivityResultParameters> {

        @Nullable
        private CallbackManager callbackManager;

        @Nullable
        private String loggerID;

        public /* synthetic */ FacebookLoginActivityResultContract(CallbackManager callbackManager, String str, int i2, k kVar) {
            this(LoginManager.this, (i2 & 1) != 0 ? null : callbackManager, (i2 & 2) != 0 ? null : str);
        }

        @Nullable
        public final CallbackManager getCallbackManager() {
            return this.callbackManager;
        }

        @Nullable
        public final String getLoggerID() {
            return this.loggerID;
        }

        public final void setCallbackManager(@Nullable CallbackManager callbackManager) {
            this.callbackManager = callbackManager;
        }

        public final void setLoggerID(@Nullable String str) {
            this.loggerID = str;
        }

        public FacebookLoginActivityResultContract(@Nullable LoginManager loginManager, @Nullable CallbackManager callbackManager, String str) {
            p0.a.s(loginManager, "this$0");
            LoginManager.this = loginManager;
            this.callbackManager = callbackManager;
            this.loggerID = str;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @NotNull
        public Intent createIntent(@NotNull Context context, @NotNull Collection<String> collection) {
            p0.a.s(context, "context");
            p0.a.s(collection, "permissions");
            LoginClient.Request createLoginRequestWithConfig = LoginManager.this.createLoginRequestWithConfig(new LoginConfiguration(collection, null, 2, 0 == true ? 1 : 0));
            String str = this.loggerID;
            if (str != null) {
                createLoginRequestWithConfig.setAuthId(str);
            }
            LoginManager.this.logStartLogin(context, createLoginRequestWithConfig);
            Intent facebookActivityIntent = LoginManager.this.getFacebookActivityIntent(createLoginRequestWithConfig);
            if (LoginManager.this.resolveIntent(facebookActivityIntent)) {
                return facebookActivityIntent;
            }
            FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
            LoginManager.this.logCompleteLogin(context, LoginClient.Result.Code.ERROR, null, facebookException, false, createLoginRequestWithConfig);
            throw facebookException;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @NotNull
        public CallbackManager.ActivityResultParameters parseResult(int i2, @Nullable Intent intent) {
            LoginManager.onActivityResult$default(LoginManager.this, i2, intent, null, 4, null);
            int requestCode = CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
            CallbackManager callbackManager = this.callbackManager;
            if (callbackManager != null) {
                callbackManager.onActivityResult(requestCode, i2, intent);
            }
            return new CallbackManager.ActivityResultParameters(requestCode, i2, intent);
        }
    }

    /* loaded from: classes2.dex */
    public static final class FragmentStartActivityDelegate implements StartActivityDelegate {

        @Nullable
        private final Activity activityContext;

        @NotNull
        private final FragmentWrapper fragment;

        public FragmentStartActivityDelegate(@NotNull FragmentWrapper fragmentWrapper) {
            p0.a.s(fragmentWrapper, "fragment");
            this.fragment = fragmentWrapper;
            this.activityContext = fragmentWrapper.getActivity();
        }

        public static void safedk_FragmentWrapper_startActivityForResult_51accca8f1bb017fcda2a6aac31602e6(FragmentWrapper p02, Intent p12, int p2) {
            Logger.d("SafeDK-Special|SafeDK: Call> Lcom/facebook/internal/FragmentWrapper;->startActivityForResult(Landroid/content/Intent;I)V");
            if (p12 == null) {
                return;
            }
            BrandSafetyUtils.detectAdClick(p12, com.facebook.BuildConfig.LIBRARY_PACKAGE_NAME);
            p02.startActivityForResult(p12, p2);
        }

        @Override // com.facebook.login.StartActivityDelegate
        @Nullable
        public Activity getActivityContext() {
            return this.activityContext;
        }

        @Override // com.facebook.login.StartActivityDelegate
        public void startActivityForResult(@NotNull Intent intent, int i2) {
            p0.a.s(intent, SDKConstants.PARAM_INTENT);
            safedk_FragmentWrapper_startActivityForResult_51accca8f1bb017fcda2a6aac31602e6(this.fragment, intent, i2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class LoginLoggerHolder {

        @NotNull
        public static final LoginLoggerHolder INSTANCE = new LoginLoggerHolder();

        @Nullable
        private static LoginLogger logger;

        private LoginLoggerHolder() {
        }

        @Nullable
        public final synchronized LoginLogger getLogger(@Nullable Context context) {
            if (context == null) {
                context = FacebookSdk.getApplicationContext();
            }
            if (context == null) {
                return null;
            }
            if (logger == null) {
                logger = new LoginLogger(context, FacebookSdk.getApplicationId());
            }
            return logger;
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        OTHER_PUBLISH_PERMISSIONS = companion.getOtherPublishPermissions();
        String cls = LoginManager.class.toString();
        p0.a.r(cls, "LoginManager::class.java.toString()");
        TAG = cls;
    }

    public LoginManager() {
        Validate.sdkInitialized();
        SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences(PREFERENCE_LOGIN_MANAGER, 0);
        p0.a.r(sharedPreferences, "getApplicationContext().getSharedPreferences(PREFERENCE_LOGIN_MANAGER, Context.MODE_PRIVATE)");
        this.sharedPreferences = sharedPreferences;
        if (!FacebookSdk.hasCustomTabsPrefetching || CustomTabUtils.getChromePackage() == null) {
            return;
        }
        CustomTabsClient.a(FacebookSdk.getApplicationContext(), "com.android.chrome", new CustomTabPrefetchHelper());
        CustomTabsClient.b(FacebookSdk.getApplicationContext(), FacebookSdk.getApplicationContext().getPackageName());
    }

    @VisibleForTesting
    @NotNull
    public static final LoginResult computeLoginResult(@NotNull LoginClient.Request request, @NotNull AccessToken accessToken, @Nullable AuthenticationToken authenticationToken) {
        return Companion.computeLoginResult(request, accessToken, authenticationToken);
    }

    public static /* synthetic */ FacebookLoginActivityResultContract createLogInActivityResultContract$default(LoginManager loginManager, CallbackManager callbackManager, String str, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLogInActivityResultContract");
        }
        if ((i2 & 1) != 0) {
            callbackManager = null;
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        return loginManager.createLogInActivityResultContract(callbackManager, str);
    }

    private final LoginClient.Request createLoginRequestFromResponse(GraphResponse graphResponse) {
        Set<String> permissions;
        AccessToken accessToken = graphResponse.getRequest().getAccessToken();
        ArrayList arrayList = null;
        if (accessToken != null && (permissions = accessToken.getPermissions()) != null) {
            arrayList = u.C0(permissions);
        }
        return createLoginRequest(arrayList);
    }

    private final void finishLogin(AccessToken accessToken, AuthenticationToken authenticationToken, LoginClient.Request request, FacebookException facebookException, boolean z2, FacebookCallback<LoginResult> facebookCallback) {
        if (accessToken != null) {
            AccessToken.Companion.setCurrentAccessToken(accessToken);
            Profile.Companion.fetchProfileForCurrentAccessToken();
        }
        if (authenticationToken != null) {
            AuthenticationToken.Companion.setCurrentAuthenticationToken(authenticationToken);
        }
        if (facebookCallback != null) {
            LoginResult computeLoginResult = (accessToken == null || request == null) ? null : Companion.computeLoginResult(request, accessToken, authenticationToken);
            if (z2 || (computeLoginResult != null && computeLoginResult.getRecentlyGrantedPermissions().isEmpty())) {
                facebookCallback.onCancel();
                return;
            }
            if (facebookException != null) {
                facebookCallback.onError(facebookException);
            } else {
                if (accessToken == null || computeLoginResult == null) {
                    return;
                }
                setExpressLoginStatus(true);
                facebookCallback.onSuccess(computeLoginResult);
            }
        }
    }

    @RestrictTo
    @Nullable
    public static final Map<String, String> getExtraDataFromIntent(@Nullable Intent intent) {
        return Companion.getExtraDataFromIntent(intent);
    }

    @NotNull
    public static LoginManager getInstance() {
        return Companion.getInstance();
    }

    private final boolean isExpressLoginAllowed() {
        return this.sharedPreferences.getBoolean(EXPRESS_LOGIN_ALLOWED, true);
    }

    @RestrictTo
    public static final boolean isPublishPermission(@Nullable String str) {
        return Companion.isPublishPermission(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logCompleteLogin(Context context, LoginClient.Result.Code code, Map<String, String> map, Exception exc, boolean z2, LoginClient.Request request) {
        LoginLogger logger = LoginLoggerHolder.INSTANCE.getLogger(context);
        if (logger == null) {
            return;
        }
        if (request == null) {
            LoginLogger.logUnexpectedError$default(logger, LoginLogger.EVENT_NAME_LOGIN_COMPLETE, "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", null, 4, null);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(LoginLogger.EVENT_EXTRAS_TRY_LOGIN_ACTIVITY, z2 ? AppEventsConstants.EVENT_PARAM_VALUE_YES : AppEventsConstants.EVENT_PARAM_VALUE_NO);
        logger.logCompleteLogin(request.getAuthId(), hashMap, code, map, exc, request.isFamilyLogin() ? LoginLogger.EVENT_NAME_FOA_LOGIN_COMPLETE : LoginLogger.EVENT_NAME_LOGIN_COMPLETE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logStartLogin(Context context, LoginClient.Request request) {
        LoginLogger logger = LoginLoggerHolder.INSTANCE.getLogger(context);
        if (logger == null || request == null) {
            return;
        }
        logger.logStartLogin(request, request.isFamilyLogin() ? LoginLogger.EVENT_NAME_FOA_LOGIN_START : LoginLogger.EVENT_NAME_LOGIN_START);
    }

    private final void loginWithConfiguration(FragmentWrapper fragmentWrapper, LoginConfiguration loginConfiguration) {
        logIn(fragmentWrapper, loginConfiguration);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean onActivityResult$default(LoginManager loginManager, int i2, Intent intent, FacebookCallback facebookCallback, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onActivityResult");
        }
        if ((i3 & 4) != 0) {
            facebookCallback = null;
        }
        return loginManager.onActivityResult(i2, intent, facebookCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: registerCallback$lambda-0, reason: not valid java name */
    public static final boolean m569registerCallback$lambda0(LoginManager loginManager, FacebookCallback facebookCallback, int i2, Intent intent) {
        p0.a.s(loginManager, "this$0");
        return loginManager.onActivityResult(i2, intent, facebookCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean resolveIntent(Intent intent) {
        return FacebookSdk.getApplicationContext().getPackageManager().resolveActivity(intent, 0) != null;
    }

    private final void retrieveLoginStatusImpl(Context context, LoginStatusCallback loginStatusCallback, long j2) {
        String applicationId = FacebookSdk.getApplicationId();
        String uuid = UUID.randomUUID().toString();
        p0.a.r(uuid, "randomUUID().toString()");
        LoginLogger loginLogger = new LoginLogger(context == null ? FacebookSdk.getApplicationContext() : context, applicationId);
        if (!isExpressLoginAllowed()) {
            loginLogger.logLoginStatusFailure(uuid);
            loginStatusCallback.onFailure();
            return;
        }
        LoginStatusClient newInstance$facebook_common_release = LoginStatusClient.Companion.newInstance$facebook_common_release(context, applicationId, uuid, FacebookSdk.getGraphApiVersion(), j2, null);
        newInstance$facebook_common_release.setCompletedListener(new nw(uuid, loginLogger, loginStatusCallback, applicationId));
        loginLogger.logLoginStatusStart(uuid);
        if (newInstance$facebook_common_release.start()) {
            return;
        }
        loginLogger.logLoginStatusFailure(uuid);
        loginStatusCallback.onFailure();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: retrieveLoginStatusImpl$lambda-2, reason: not valid java name */
    public static final void m570retrieveLoginStatusImpl$lambda2(String str, LoginLogger loginLogger, LoginStatusCallback loginStatusCallback, String str2, Bundle bundle) {
        p0.a.s(str, "$loggerRef");
        p0.a.s(loginLogger, "$logger");
        p0.a.s(loginStatusCallback, "$responseCallback");
        p0.a.s(str2, "$applicationId");
        if (bundle == null) {
            loginLogger.logLoginStatusFailure(str);
            loginStatusCallback.onFailure();
            return;
        }
        String string = bundle.getString(NativeProtocol.STATUS_ERROR_TYPE);
        String string2 = bundle.getString(NativeProtocol.STATUS_ERROR_DESCRIPTION);
        if (string != null) {
            Companion.handleLoginStatusError(string, string2, str, loginLogger, loginStatusCallback);
            return;
        }
        String string3 = bundle.getString(NativeProtocol.EXTRA_ACCESS_TOKEN);
        Utility utility = Utility.INSTANCE;
        Date bundleLongAsDate = Utility.getBundleLongAsDate(bundle, NativeProtocol.EXTRA_EXPIRES_SECONDS_SINCE_EPOCH, new Date(0L));
        ArrayList<String> stringArrayList = bundle.getStringArrayList(NativeProtocol.EXTRA_PERMISSIONS);
        String string4 = bundle.getString(NativeProtocol.RESULT_ARGS_SIGNED_REQUEST);
        String string5 = bundle.getString("graph_domain");
        Date bundleLongAsDate2 = Utility.getBundleLongAsDate(bundle, NativeProtocol.EXTRA_DATA_ACCESS_EXPIRATION_TIME, new Date(0L));
        String userIDFromSignedRequest = (string4 == null || string4.length() == 0) ? null : LoginMethodHandler.Companion.getUserIDFromSignedRequest(string4);
        if (string3 == null || string3.length() == 0 || stringArrayList == null || stringArrayList.isEmpty() || userIDFromSignedRequest == null || userIDFromSignedRequest.length() == 0) {
            loginLogger.logLoginStatusFailure(str);
            loginStatusCallback.onFailure();
            return;
        }
        AccessToken accessToken = new AccessToken(string3, str2, userIDFromSignedRequest, stringArrayList, null, null, null, bundleLongAsDate, null, bundleLongAsDate2, string5);
        AccessToken.Companion.setCurrentAccessToken(accessToken);
        Profile.Companion.fetchProfileForCurrentAccessToken();
        loginLogger.logLoginStatusSuccess(str);
        loginStatusCallback.onCompleted(accessToken);
    }

    public static void safedk_StartActivityDelegate_startActivityForResult_05ba5c64909d4884baa1ad0bdf7b46fb(StartActivityDelegate p02, Intent p12, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Lcom/facebook/login/StartActivityDelegate;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p12 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p12, com.facebook.BuildConfig.LIBRARY_PACKAGE_NAME);
        p02.startActivityForResult(p12, p2);
    }

    private final void setExpressLoginStatus(boolean z2) {
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putBoolean(EXPRESS_LOGIN_ALLOWED, z2);
        edit.apply();
    }

    private final void startLogin(StartActivityDelegate startActivityDelegate, LoginClient.Request request) throws FacebookException {
        logStartLogin(startActivityDelegate.getActivityContext(), request);
        CallbackManagerImpl.Companion.registerStaticCallback(CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode(), new CallbackManagerImpl.Callback() { // from class: com.facebook.login.f
            @Override // com.facebook.internal.CallbackManagerImpl.Callback
            public final boolean onActivityResult(int i2, Intent intent) {
                boolean m571startLogin$lambda1;
                m571startLogin$lambda1 = LoginManager.m571startLogin$lambda1(LoginManager.this, i2, intent);
                return m571startLogin$lambda1;
            }
        });
        if (tryFacebookActivity(startActivityDelegate, request)) {
            return;
        }
        FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        logCompleteLogin(startActivityDelegate.getActivityContext(), LoginClient.Result.Code.ERROR, null, facebookException, false, request);
        throw facebookException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startLogin$lambda-1, reason: not valid java name */
    public static final boolean m571startLogin$lambda1(LoginManager loginManager, int i2, Intent intent) {
        p0.a.s(loginManager, "this$0");
        return onActivityResult$default(loginManager, i2, intent, null, 4, null);
    }

    private final boolean tryFacebookActivity(StartActivityDelegate startActivityDelegate, LoginClient.Request request) {
        Intent facebookActivityIntent = getFacebookActivityIntent(request);
        if (!resolveIntent(facebookActivityIntent)) {
            return false;
        }
        try {
            safedk_StartActivityDelegate_startActivityForResult_05ba5c64909d4884baa1ad0bdf7b46fb(startActivityDelegate, facebookActivityIntent, LoginClient.Companion.getLoginRequestCode());
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    private final void validatePublishPermissions(Collection<String> collection) {
        if (collection == null) {
            return;
        }
        for (String str : collection) {
            if (!Companion.isPublishPermission(str)) {
                throw new FacebookException(androidx.compose.foundation.text.input.a.A("Cannot pass a read permission (", str, ") to a request for publish authorization"));
            }
        }
    }

    private final void validateReadPermissions(Collection<String> collection) {
        if (collection == null) {
            return;
        }
        for (String str : collection) {
            if (Companion.isPublishPermission(str)) {
                throw new FacebookException(androidx.compose.foundation.text.input.a.A("Cannot pass a publish or manage permission (", str, ") to a request for read authorization"));
            }
        }
    }

    @NotNull
    public final FacebookLoginActivityResultContract createLogInActivityResultContract() {
        return createLogInActivityResultContract$default(this, null, null, 3, null);
    }

    @NotNull
    public LoginClient.Request createLoginRequest(@Nullable Collection<String> collection) {
        LoginBehavior loginBehavior = this.loginBehavior;
        Set e12 = collection == null ? null : u.e1(collection);
        DefaultAudience defaultAudience = this.defaultAudience;
        String str = this.authType;
        String applicationId = FacebookSdk.getApplicationId();
        String uuid = UUID.randomUUID().toString();
        p0.a.r(uuid, "randomUUID().toString()");
        LoginClient.Request request = new LoginClient.Request(loginBehavior, e12, defaultAudience, str, applicationId, uuid, this.loginTargetApp, null, null, null, null, 1920, null);
        request.setRerequest(AccessToken.Companion.isCurrentAccessTokenActive());
        request.setMessengerPageId(this.messengerPageId);
        request.setResetMessengerState(this.resetMessengerState);
        request.setFamilyLogin(this.isFamilyLogin);
        request.setShouldSkipAccountDeduplication(this.shouldSkipAccountDeduplication);
        return request;
    }

    @NotNull
    public LoginClient.Request createLoginRequestWithConfig(@NotNull LoginConfiguration loginConfiguration) {
        String codeVerifier;
        p0.a.s(loginConfiguration, "loginConfig");
        CodeChallengeMethod codeChallengeMethod = CodeChallengeMethod.S256;
        try {
            PKCEUtil pKCEUtil = PKCEUtil.INSTANCE;
            codeVerifier = PKCEUtil.generateCodeChallenge(loginConfiguration.getCodeVerifier(), codeChallengeMethod);
        } catch (FacebookException unused) {
            codeChallengeMethod = CodeChallengeMethod.PLAIN;
            codeVerifier = loginConfiguration.getCodeVerifier();
        }
        CodeChallengeMethod codeChallengeMethod2 = codeChallengeMethod;
        String str = codeVerifier;
        LoginBehavior loginBehavior = this.loginBehavior;
        Set e12 = u.e1(loginConfiguration.getPermissions());
        DefaultAudience defaultAudience = this.defaultAudience;
        String str2 = this.authType;
        String applicationId = FacebookSdk.getApplicationId();
        String uuid = UUID.randomUUID().toString();
        p0.a.r(uuid, "randomUUID().toString()");
        LoginClient.Request request = new LoginClient.Request(loginBehavior, e12, defaultAudience, str2, applicationId, uuid, this.loginTargetApp, loginConfiguration.getNonce(), loginConfiguration.getCodeVerifier(), str, codeChallengeMethod2);
        request.setRerequest(AccessToken.Companion.isCurrentAccessTokenActive());
        request.setMessengerPageId(this.messengerPageId);
        request.setResetMessengerState(this.resetMessengerState);
        request.setFamilyLogin(this.isFamilyLogin);
        request.setShouldSkipAccountDeduplication(this.shouldSkipAccountDeduplication);
        return request;
    }

    @NotNull
    public LoginClient.Request createReauthorizeRequest() {
        String applicationId = FacebookSdk.getApplicationId();
        String uuid = UUID.randomUUID().toString();
        p0.a.r(uuid, "randomUUID().toString()");
        LoginClient.Request request = new LoginClient.Request(LoginBehavior.DIALOG_ONLY, new HashSet(), this.defaultAudience, "reauthorize", applicationId, uuid, this.loginTargetApp, null, null, null, null, 1920, null);
        request.setFamilyLogin(this.isFamilyLogin);
        request.setShouldSkipAccountDeduplication(this.shouldSkipAccountDeduplication);
        return request;
    }

    @NotNull
    public final String getAuthType() {
        return this.authType;
    }

    @NotNull
    public final DefaultAudience getDefaultAudience() {
        return this.defaultAudience;
    }

    @NotNull
    public Intent getFacebookActivityIntent(@NotNull LoginClient.Request request) {
        p0.a.s(request, "request");
        Intent intent = new Intent();
        intent.setClass(FacebookSdk.getApplicationContext(), FacebookActivity.class);
        intent.setAction(request.getLoginBehavior().toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", request);
        intent.putExtra(LoginFragment.REQUEST_KEY, bundle);
        return intent;
    }

    @NotNull
    public final LoginBehavior getLoginBehavior() {
        return this.loginBehavior;
    }

    @NotNull
    public final LoginTargetApp getLoginTargetApp() {
        return this.loginTargetApp;
    }

    public final boolean getShouldSkipAccountDeduplication() {
        return this.shouldSkipAccountDeduplication;
    }

    public final boolean isFamilyLogin() {
        return this.isFamilyLogin;
    }

    public final void logIn(@NotNull Fragment fragment, @Nullable Collection<String> collection) {
        p0.a.s(fragment, "fragment");
        logIn(new FragmentWrapper(fragment), collection);
    }

    public final void logInWithConfiguration(@NotNull Fragment fragment, @NotNull LoginConfiguration loginConfiguration) {
        p0.a.s(fragment, "fragment");
        p0.a.s(loginConfiguration, "loginConfig");
        loginWithConfiguration(new FragmentWrapper(fragment), loginConfiguration);
    }

    @d0.a
    public final void logInWithPublishPermissions(@NotNull Fragment fragment, @NotNull Collection<String> collection) {
        p0.a.s(fragment, "fragment");
        p0.a.s(collection, "permissions");
        logInWithPublishPermissions(new FragmentWrapper(fragment), collection);
    }

    @d0.a
    public final void logInWithReadPermissions(@NotNull Fragment fragment, @NotNull Collection<String> collection) {
        p0.a.s(fragment, "fragment");
        p0.a.s(collection, "permissions");
        logInWithReadPermissions(new FragmentWrapper(fragment), collection);
    }

    public void logOut() {
        AccessToken.Companion.setCurrentAccessToken(null);
        AuthenticationToken.Companion.setCurrentAuthenticationToken(null);
        Profile.Companion.setCurrentProfile(null);
        setExpressLoginStatus(false);
    }

    @VisibleForTesting
    public final boolean onActivityResult(int i2, @Nullable Intent intent) {
        return onActivityResult$default(this, i2, intent, null, 4, null);
    }

    public final void reauthorizeDataAccess(@NotNull Activity activity) {
        p0.a.s(activity, "activity");
        startLogin(new ActivityStartActivityDelegate(activity), createReauthorizeRequest());
    }

    public final void registerCallback(@Nullable CallbackManager callbackManager, @Nullable final FacebookCallback<LoginResult> facebookCallback) {
        if (!(callbackManager instanceof CallbackManagerImpl)) {
            throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
        }
        ((CallbackManagerImpl) callbackManager).registerCallback(CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode(), new CallbackManagerImpl.Callback() { // from class: com.facebook.login.e
            @Override // com.facebook.internal.CallbackManagerImpl.Callback
            public final boolean onActivityResult(int i2, Intent intent) {
                boolean m569registerCallback$lambda0;
                m569registerCallback$lambda0 = LoginManager.m569registerCallback$lambda0(LoginManager.this, facebookCallback, i2, intent);
                return m569registerCallback$lambda0;
            }
        });
    }

    public final void resolveError(@NotNull Activity activity, @NotNull GraphResponse graphResponse) {
        p0.a.s(activity, "activity");
        p0.a.s(graphResponse, "response");
        startLogin(new ActivityStartActivityDelegate(activity), createLoginRequestFromResponse(graphResponse));
    }

    public final void retrieveLoginStatus(@NotNull Context context, @NotNull LoginStatusCallback loginStatusCallback) {
        p0.a.s(context, "context");
        p0.a.s(loginStatusCallback, "responseCallback");
        retrieveLoginStatus(context, 5000L, loginStatusCallback);
    }

    @NotNull
    public final LoginManager setAuthType(@NotNull String str) {
        p0.a.s(str, "authType");
        this.authType = str;
        return this;
    }

    @NotNull
    public final LoginManager setDefaultAudience(@NotNull DefaultAudience defaultAudience) {
        p0.a.s(defaultAudience, "defaultAudience");
        this.defaultAudience = defaultAudience;
        return this;
    }

    @NotNull
    public final LoginManager setFamilyLogin(boolean z2) {
        this.isFamilyLogin = z2;
        return this;
    }

    @NotNull
    public final LoginManager setLoginBehavior(@NotNull LoginBehavior loginBehavior) {
        p0.a.s(loginBehavior, "loginBehavior");
        this.loginBehavior = loginBehavior;
        return this;
    }

    @NotNull
    public final LoginManager setLoginTargetApp(@NotNull LoginTargetApp loginTargetApp) {
        p0.a.s(loginTargetApp, "targetApp");
        this.loginTargetApp = loginTargetApp;
        return this;
    }

    @NotNull
    public final LoginManager setMessengerPageId(@Nullable String str) {
        this.messengerPageId = str;
        return this;
    }

    @NotNull
    public final LoginManager setResetMessengerState(boolean z2) {
        this.resetMessengerState = z2;
        return this;
    }

    @NotNull
    public final LoginManager setShouldSkipAccountDeduplication(boolean z2) {
        this.shouldSkipAccountDeduplication = z2;
        return this;
    }

    public final void unregisterCallback(@Nullable CallbackManager callbackManager) {
        if (!(callbackManager instanceof CallbackManagerImpl)) {
            throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
        }
        ((CallbackManagerImpl) callbackManager).unregisterCallback(CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode());
    }

    @NotNull
    public final FacebookLoginActivityResultContract createLogInActivityResultContract(@Nullable CallbackManager callbackManager) {
        return createLogInActivityResultContract$default(this, callbackManager, null, 2, null);
    }

    public final void logIn(@NotNull Fragment fragment, @Nullable Collection<String> collection, @Nullable String str) {
        p0.a.s(fragment, "fragment");
        logIn(new FragmentWrapper(fragment), collection, str);
    }

    public final void logInWithPublishPermissions(@NotNull Fragment fragment, @NotNull CallbackManager callbackManager, @NotNull Collection<String> collection) {
        p0.a.s(fragment, "fragment");
        p0.a.s(callbackManager, "callbackManager");
        p0.a.s(collection, "permissions");
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            logInWithPublishPermissions(activity, callbackManager, collection);
            return;
        }
        throw new FacebookException(p0.a.z0(fragment, "Cannot obtain activity context on the fragment "));
    }

    public final void logInWithReadPermissions(@NotNull Fragment fragment, @NotNull CallbackManager callbackManager, @NotNull Collection<String> collection) {
        p0.a.s(fragment, "fragment");
        p0.a.s(callbackManager, "callbackManager");
        p0.a.s(collection, "permissions");
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            logInWithReadPermissions(activity, callbackManager, collection);
            return;
        }
        throw new FacebookException(p0.a.z0(fragment, "Cannot obtain activity context on the fragment "));
    }

    public final void loginWithConfiguration(@NotNull Activity activity, @NotNull LoginConfiguration loginConfiguration) {
        p0.a.s(activity, "activity");
        p0.a.s(loginConfiguration, "loginConfig");
        logIn(activity, loginConfiguration);
    }

    @VisibleForTesting
    public boolean onActivityResult(int i2, @Nullable Intent intent, @Nullable FacebookCallback<LoginResult> facebookCallback) {
        LoginClient.Result.Code code;
        boolean z2;
        AccessToken accessToken;
        AuthenticationToken authenticationToken;
        LoginClient.Request request;
        Map<String, String> map;
        AuthenticationToken authenticationToken2;
        LoginClient.Result.Code code2 = LoginClient.Result.Code.ERROR;
        FacebookException facebookException = null;
        if (intent != null) {
            intent.setExtrasClassLoader(LoginClient.Result.class.getClassLoader());
            LoginClient.Result result = (LoginClient.Result) intent.getParcelableExtra(LoginFragment.RESULT_KEY);
            if (result != null) {
                request = result.request;
                LoginClient.Result.Code code3 = result.code;
                if (i2 != -1) {
                    r5 = i2 == 0;
                    accessToken = null;
                    authenticationToken2 = null;
                } else if (code3 == LoginClient.Result.Code.SUCCESS) {
                    accessToken = result.token;
                    authenticationToken2 = result.authenticationToken;
                } else {
                    authenticationToken2 = null;
                    facebookException = new FacebookAuthorizationException(result.errorMessage);
                    accessToken = null;
                }
                map = result.loggingExtras;
                z2 = r5;
                authenticationToken = authenticationToken2;
                code = code3;
            }
            code = code2;
            accessToken = null;
            authenticationToken = null;
            request = null;
            map = null;
            z2 = false;
        } else {
            if (i2 == 0) {
                code = LoginClient.Result.Code.CANCEL;
                z2 = true;
                accessToken = null;
                authenticationToken = null;
                request = null;
                map = null;
            }
            code = code2;
            accessToken = null;
            authenticationToken = null;
            request = null;
            map = null;
            z2 = false;
        }
        if (facebookException == null && accessToken == null && !z2) {
            facebookException = new FacebookException("Unexpected call to LoginManager.onActivityResult");
        }
        FacebookException facebookException2 = facebookException;
        LoginClient.Request request2 = request;
        logCompleteLogin(null, code, map, facebookException2, true, request2);
        finishLogin(accessToken, authenticationToken, request2, facebookException2, z2, facebookCallback);
        return true;
    }

    @d0.a
    public final void resolveError(@NotNull Fragment fragment, @NotNull GraphResponse graphResponse) {
        p0.a.s(fragment, "fragment");
        p0.a.s(graphResponse, "response");
        resolveError(new FragmentWrapper(fragment), graphResponse);
    }

    public final void retrieveLoginStatus(@NotNull Context context, long j2, @NotNull LoginStatusCallback loginStatusCallback) {
        p0.a.s(context, "context");
        p0.a.s(loginStatusCallback, "responseCallback");
        retrieveLoginStatusImpl(context, loginStatusCallback, j2);
    }

    @NotNull
    public final FacebookLoginActivityResultContract createLogInActivityResultContract(@Nullable CallbackManager callbackManager, @Nullable String str) {
        return new FacebookLoginActivityResultContract(this, callbackManager, str);
    }

    public final void logIn(@NotNull android.app.Fragment fragment, @Nullable Collection<String> collection) {
        p0.a.s(fragment, "fragment");
        logIn(new FragmentWrapper(fragment), collection);
    }

    public final void reauthorizeDataAccess(@NotNull Fragment fragment) {
        p0.a.s(fragment, "fragment");
        reauthorizeDataAccess(new FragmentWrapper(fragment));
    }

    public final void resolveError(@NotNull Fragment fragment, @NotNull CallbackManager callbackManager, @NotNull GraphResponse graphResponse) {
        p0.a.s(fragment, "fragment");
        p0.a.s(callbackManager, "callbackManager");
        p0.a.s(graphResponse, "response");
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            resolveError(activity, callbackManager, graphResponse);
            return;
        }
        throw new FacebookException(p0.a.z0(fragment, "Cannot obtain activity context on the fragment "));
    }

    private final void reauthorizeDataAccess(FragmentWrapper fragmentWrapper) {
        startLogin(new FragmentStartActivityDelegate(fragmentWrapper), createReauthorizeRequest());
    }

    public final void logIn(@NotNull android.app.Fragment fragment, @Nullable Collection<String> collection, @Nullable String str) {
        p0.a.s(fragment, "fragment");
        logIn(new FragmentWrapper(fragment), collection, str);
    }

    public final void logIn(@NotNull FragmentWrapper fragmentWrapper, @Nullable Collection<String> collection) {
        p0.a.s(fragmentWrapper, "fragment");
        logIn(fragmentWrapper, new LoginConfiguration(collection, null, 2, 0 == true ? 1 : 0));
    }

    public final void logInWithPublishPermissions(@NotNull android.app.Fragment fragment, @NotNull Collection<String> collection) {
        p0.a.s(fragment, "fragment");
        p0.a.s(collection, "permissions");
        logInWithPublishPermissions(new FragmentWrapper(fragment), collection);
    }

    public final void logInWithReadPermissions(@NotNull android.app.Fragment fragment, @NotNull Collection<String> collection) {
        p0.a.s(fragment, "fragment");
        p0.a.s(collection, "permissions");
        logInWithReadPermissions(new FragmentWrapper(fragment), collection);
    }

    private final void logInWithPublishPermissions(FragmentWrapper fragmentWrapper, Collection<String> collection) {
        validatePublishPermissions(collection);
        loginWithConfiguration(fragmentWrapper, new LoginConfiguration(collection, null, 2, 0 == true ? 1 : 0));
    }

    private final void logInWithReadPermissions(FragmentWrapper fragmentWrapper, Collection<String> collection) {
        validateReadPermissions(collection);
        logIn(fragmentWrapper, new LoginConfiguration(collection, null, 2, 0 == true ? 1 : 0));
    }

    public final void resolveError(@NotNull android.app.Fragment fragment, @NotNull GraphResponse graphResponse) {
        p0.a.s(fragment, "fragment");
        p0.a.s(graphResponse, "response");
        resolveError(new FragmentWrapper(fragment), graphResponse);
    }

    private final void resolveError(FragmentWrapper fragmentWrapper, GraphResponse graphResponse) {
        startLogin(new FragmentStartActivityDelegate(fragmentWrapper), createLoginRequestFromResponse(graphResponse));
    }

    public final void logIn(@NotNull FragmentWrapper fragmentWrapper, @Nullable Collection<String> collection, @Nullable String str) {
        p0.a.s(fragmentWrapper, "fragment");
        LoginClient.Request createLoginRequestWithConfig = createLoginRequestWithConfig(new LoginConfiguration(collection, null, 2, 0 == true ? 1 : 0));
        if (str != null) {
            createLoginRequestWithConfig.setAuthId(str);
        }
        startLogin(new FragmentStartActivityDelegate(fragmentWrapper), createLoginRequestWithConfig);
    }

    public final void resolveError(@NotNull ActivityResultRegistryOwner activityResultRegistryOwner, @NotNull CallbackManager callbackManager, @NotNull GraphResponse graphResponse) {
        p0.a.s(activityResultRegistryOwner, "activityResultRegistryOwner");
        p0.a.s(callbackManager, "callbackManager");
        p0.a.s(graphResponse, "response");
        startLogin(new AndroidxActivityResultRegistryOwnerStartActivityDelegate(activityResultRegistryOwner, callbackManager), createLoginRequestFromResponse(graphResponse));
    }

    public final void logInWithPublishPermissions(@NotNull Activity activity, @Nullable Collection<String> collection) {
        p0.a.s(activity, "activity");
        validatePublishPermissions(collection);
        loginWithConfiguration(activity, new LoginConfiguration(collection, null, 2, 0 == true ? 1 : 0));
    }

    public final void logInWithReadPermissions(@NotNull Activity activity, @Nullable Collection<String> collection) {
        p0.a.s(activity, "activity");
        validateReadPermissions(collection);
        logIn(activity, new LoginConfiguration(collection, null, 2, 0 == true ? 1 : 0));
    }

    public final void logIn(@NotNull Activity activity, @Nullable Collection<String> collection) {
        p0.a.s(activity, "activity");
        logIn(activity, new LoginConfiguration(collection, null, 2, 0 == true ? 1 : 0));
    }

    public final void logInWithPublishPermissions(@NotNull ActivityResultRegistryOwner activityResultRegistryOwner, @NotNull CallbackManager callbackManager, @NotNull Collection<String> collection) {
        p0.a.s(activityResultRegistryOwner, "activityResultRegistryOwner");
        p0.a.s(callbackManager, "callbackManager");
        p0.a.s(collection, "permissions");
        validatePublishPermissions(collection);
        logIn(activityResultRegistryOwner, callbackManager, new LoginConfiguration(collection, null, 2, 0 == true ? 1 : 0));
    }

    public final void logInWithReadPermissions(@NotNull ActivityResultRegistryOwner activityResultRegistryOwner, @NotNull CallbackManager callbackManager, @NotNull Collection<String> collection) {
        p0.a.s(activityResultRegistryOwner, "activityResultRegistryOwner");
        p0.a.s(callbackManager, "callbackManager");
        p0.a.s(collection, "permissions");
        validateReadPermissions(collection);
        logIn(activityResultRegistryOwner, callbackManager, new LoginConfiguration(collection, null, 2, 0 == true ? 1 : 0));
    }

    public final void logIn(@NotNull FragmentWrapper fragmentWrapper, @NotNull LoginConfiguration loginConfiguration) {
        p0.a.s(fragmentWrapper, "fragment");
        p0.a.s(loginConfiguration, "loginConfig");
        startLogin(new FragmentStartActivityDelegate(fragmentWrapper), createLoginRequestWithConfig(loginConfiguration));
    }

    public final void logIn(@NotNull Activity activity, @NotNull LoginConfiguration loginConfiguration) {
        p0.a.s(activity, "activity");
        p0.a.s(loginConfiguration, "loginConfig");
        if (activity instanceof ActivityResultRegistryOwner) {
            Log.w(TAG, "You're calling logging in Facebook with an activity supports androidx activity result APIs. Please follow our document to upgrade to new APIs to avoid overriding onActivityResult().");
        }
        startLogin(new ActivityStartActivityDelegate(activity), createLoginRequestWithConfig(loginConfiguration));
    }

    public final void logIn(@NotNull Activity activity, @Nullable Collection<String> collection, @Nullable String str) {
        p0.a.s(activity, "activity");
        LoginClient.Request createLoginRequestWithConfig = createLoginRequestWithConfig(new LoginConfiguration(collection, null, 2, 0 == true ? 1 : 0));
        if (str != null) {
            createLoginRequestWithConfig.setAuthId(str);
        }
        startLogin(new ActivityStartActivityDelegate(activity), createLoginRequestWithConfig);
    }

    private final void logIn(ActivityResultRegistryOwner activityResultRegistryOwner, CallbackManager callbackManager, LoginConfiguration loginConfiguration) {
        startLogin(new AndroidxActivityResultRegistryOwnerStartActivityDelegate(activityResultRegistryOwner, callbackManager), createLoginRequestWithConfig(loginConfiguration));
    }

    public final void logIn(@NotNull ActivityResultRegistryOwner activityResultRegistryOwner, @NotNull CallbackManager callbackManager, @NotNull Collection<String> collection, @Nullable String str) {
        p0.a.s(activityResultRegistryOwner, "activityResultRegistryOwner");
        p0.a.s(callbackManager, "callbackManager");
        p0.a.s(collection, "permissions");
        LoginClient.Request createLoginRequestWithConfig = createLoginRequestWithConfig(new LoginConfiguration(collection, null, 2, 0 == true ? 1 : 0));
        if (str != null) {
            createLoginRequestWithConfig.setAuthId(str);
        }
        startLogin(new AndroidxActivityResultRegistryOwnerStartActivityDelegate(activityResultRegistryOwner, callbackManager), createLoginRequestWithConfig);
    }

    public final void logIn(@NotNull ActivityResultRegistryOwner activityResultRegistryOwner, @NotNull CallbackManager callbackManager, @NotNull Collection<String> collection) {
        p0.a.s(activityResultRegistryOwner, "activityResultRegistryOwner");
        p0.a.s(callbackManager, "callbackManager");
        p0.a.s(collection, "permissions");
        logIn(activityResultRegistryOwner, callbackManager, new LoginConfiguration(collection, null, 2, 0 == true ? 1 : 0));
    }
}
