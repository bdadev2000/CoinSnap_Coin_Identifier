package com.facebook.login.widget;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.annotation.StringRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.fragment.app.Fragment;
import b1.f0;
import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;
import com.facebook.BuildConfig;
import com.facebook.CallbackManager;
import com.facebook.FacebookButtonBase;
import com.facebook.FacebookCallback;
import com.facebook.FacebookSdk;
import com.facebook.Profile;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.appevents.c;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.login.DefaultAudience;
import com.facebook.login.LoginBehavior;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.LoginTargetApp;
import com.facebook.login.R;
import com.facebook.login.b;
import com.facebook.login.widget.ToolTipPopup;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import d0.h;
import e0.q;
import e0.w;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public class LoginButton extends FacebookButtonBase {
    private static final int MAX_BUTTON_TRANSPARENCY = 255;
    private static final int MIN_BUTTON_TRANSPARENCY = 0;

    @Nullable
    private AccessTokenTracker accessTokenTracker;

    @Nullable
    private ActivityResultLauncher<Collection<String>> androidXLoginCaller;

    @Nullable
    private CallbackManager callbackManager;
    private boolean confirmLogout;

    @Nullable
    private Float customButtonRadius;
    private int customButtonTransparency;

    @NotNull
    private final String loggerID;

    @NotNull
    private h loginManagerLazy;

    @Nullable
    private String loginText;

    @Nullable
    private String logoutText;

    @NotNull
    private final LoginButtonProperties properties;
    private boolean toolTipChecked;
    private long toolTipDisplayTime;

    @NotNull
    private ToolTipMode toolTipMode;

    @Nullable
    private ToolTipPopup toolTipPopup;

    @NotNull
    private ToolTipPopup.Style toolTipStyle;

    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final String TAG = LoginButton.class.getName();

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static class LoginButtonProperties {

        @Nullable
        private String messengerPageId;
        private boolean resetMessengerState;
        private boolean shouldSkipAccountDeduplication;

        @NotNull
        private DefaultAudience defaultAudience = DefaultAudience.FRIENDS;

        @NotNull
        private List<String> permissions = w.f30218a;

        @NotNull
        private LoginBehavior loginBehavior = LoginBehavior.NATIVE_WITH_FALLBACK;

        @NotNull
        private String authType = ServerProtocol.DIALOG_REREQUEST_AUTH_TYPE;

        @NotNull
        private LoginTargetApp loginTargetApp = LoginTargetApp.FACEBOOK;

        public final void clearPermissions() {
            this.permissions = w.f30218a;
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
        public final LoginBehavior getLoginBehavior() {
            return this.loginBehavior;
        }

        @NotNull
        public final LoginTargetApp getLoginTargetApp() {
            return this.loginTargetApp;
        }

        @Nullable
        public final String getMessengerPageId() {
            return this.messengerPageId;
        }

        @NotNull
        public final List<String> getPermissions() {
            return this.permissions;
        }

        public final boolean getResetMessengerState() {
            return this.resetMessengerState;
        }

        public final boolean getShouldSkipAccountDeduplication() {
            return this.shouldSkipAccountDeduplication;
        }

        public final void setAuthType(@NotNull String str) {
            p0.a.s(str, "<set-?>");
            this.authType = str;
        }

        public final void setDefaultAudience(@NotNull DefaultAudience defaultAudience) {
            p0.a.s(defaultAudience, "<set-?>");
            this.defaultAudience = defaultAudience;
        }

        public final void setLoginBehavior(@NotNull LoginBehavior loginBehavior) {
            p0.a.s(loginBehavior, "<set-?>");
            this.loginBehavior = loginBehavior;
        }

        public final void setLoginTargetApp(@NotNull LoginTargetApp loginTargetApp) {
            p0.a.s(loginTargetApp, "<set-?>");
            this.loginTargetApp = loginTargetApp;
        }

        public final void setMessengerPageId(@Nullable String str) {
            this.messengerPageId = str;
        }

        public final void setPermissions(@NotNull List<String> list) {
            p0.a.s(list, "<set-?>");
            this.permissions = list;
        }

        public final void setResetMessengerState(boolean z2) {
            this.resetMessengerState = z2;
        }

        public final void setShouldSkipAccountDeduplication(boolean z2) {
            this.shouldSkipAccountDeduplication = z2;
        }
    }

    /* loaded from: classes.dex */
    public class LoginClickListener implements View.OnClickListener {
        final /* synthetic */ LoginButton this$0;

        public LoginClickListener(LoginButton loginButton) {
            p0.a.s(loginButton, "this$0");
            this.this$0 = loginButton;
        }

        /* renamed from: performLogout$lambda-2 */
        public static final void m578performLogout$lambda2(LoginManager loginManager, DialogInterface dialogInterface, int i2) {
            if (CrashShieldHandler.isObjectCrashing(LoginClickListener.class)) {
                return;
            }
            try {
                p0.a.s(loginManager, "$loginManager");
                loginManager.logOut();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, LoginClickListener.class);
            }
        }

        @NotNull
        public LoginManager getLoginManager() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                LoginManager companion = LoginManager.Companion.getInstance();
                companion.setDefaultAudience(this.this$0.getDefaultAudience());
                companion.setLoginBehavior(this.this$0.getLoginBehavior());
                companion.setLoginTargetApp(getLoginTargetApp());
                companion.setAuthType(this.this$0.getAuthType());
                companion.setFamilyLogin(isFamilyLogin());
                companion.setShouldSkipAccountDeduplication(this.this$0.getShouldSkipAccountDeduplication());
                companion.setMessengerPageId(this.this$0.getMessengerPageId());
                companion.setResetMessengerState(this.this$0.getResetMessengerState());
                return companion;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        }

        @NotNull
        public final LoginTargetApp getLoginTargetApp() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                return LoginTargetApp.FACEBOOK;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        }

        public final boolean isFamilyLogin() {
            CrashShieldHandler.isObjectCrashing(this);
            return false;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@NotNull View view) {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                if (CrashShieldHandler.isObjectCrashing(this)) {
                    return;
                }
                try {
                    p0.a.s(view, "v");
                    this.this$0.callExternalOnClickListener(view);
                    AccessToken.Companion companion = AccessToken.Companion;
                    AccessToken currentAccessToken = companion.getCurrentAccessToken();
                    boolean isCurrentAccessTokenActive = companion.isCurrentAccessTokenActive();
                    if (isCurrentAccessTokenActive) {
                        Context context = this.this$0.getContext();
                        p0.a.r(context, "context");
                        performLogout(context);
                    } else {
                        performLogin();
                    }
                    InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(this.this$0.getContext());
                    Bundle bundle = new Bundle();
                    bundle.putInt("logging_in", currentAccessToken != null ? 0 : 1);
                    bundle.putInt("access_token_expired", isCurrentAccessTokenActive ? 1 : 0);
                    internalAppEventsLogger.logEventImplicitly(AnalyticsEvents.EVENT_LOGIN_VIEW_USAGE, bundle);
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            } catch (Throwable th2) {
                CrashShieldHandler.handleThrowable(th2, this);
            }
        }

        public final void performLogin() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                LoginManager loginManager = getLoginManager();
                ActivityResultLauncher activityResultLauncher = this.this$0.androidXLoginCaller;
                if (activityResultLauncher != null) {
                    LoginManager.FacebookLoginActivityResultContract facebookLoginActivityResultContract = (LoginManager.FacebookLoginActivityResultContract) activityResultLauncher.a();
                    CallbackManager callbackManager = this.this$0.getCallbackManager();
                    if (callbackManager == null) {
                        callbackManager = new CallbackManagerImpl();
                    }
                    facebookLoginActivityResultContract.setCallbackManager(callbackManager);
                    activityResultLauncher.b(this.this$0.getProperties().getPermissions());
                    return;
                }
                if (this.this$0.getFragment() != null) {
                    Fragment fragment = this.this$0.getFragment();
                    if (fragment == null) {
                        return;
                    }
                    LoginButton loginButton = this.this$0;
                    loginManager.logIn(fragment, loginButton.getProperties().getPermissions(), loginButton.getLoggerID());
                    return;
                }
                if (this.this$0.getNativeFragment() == null) {
                    loginManager.logIn(this.this$0.getActivity(), this.this$0.getProperties().getPermissions(), this.this$0.getLoggerID());
                    return;
                }
                android.app.Fragment nativeFragment = this.this$0.getNativeFragment();
                if (nativeFragment == null) {
                    return;
                }
                LoginButton loginButton2 = this.this$0;
                loginManager.logIn(nativeFragment, loginButton2.getProperties().getPermissions(), loginButton2.getLoggerID());
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }

        public final void performLogout(@NotNull Context context) {
            String string;
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                p0.a.s(context, "context");
                LoginManager loginManager = getLoginManager();
                if (!this.this$0.confirmLogout) {
                    loginManager.logOut();
                    return;
                }
                String string2 = this.this$0.getResources().getString(R.string.com_facebook_loginview_log_out_action);
                p0.a.r(string2, "resources.getString(R.string.com_facebook_loginview_log_out_action)");
                String string3 = this.this$0.getResources().getString(R.string.com_facebook_loginview_cancel_action);
                p0.a.r(string3, "resources.getString(R.string.com_facebook_loginview_cancel_action)");
                Profile currentProfile = Profile.Companion.getCurrentProfile();
                if ((currentProfile == null ? null : currentProfile.getName()) != null) {
                    String string4 = this.this$0.getResources().getString(R.string.com_facebook_loginview_logged_in_as);
                    p0.a.r(string4, "resources.getString(R.string.com_facebook_loginview_logged_in_as)");
                    string = String.format(string4, Arrays.copyOf(new Object[]{currentProfile.getName()}, 1));
                    p0.a.r(string, "java.lang.String.format(format, *args)");
                } else {
                    string = this.this$0.getResources().getString(R.string.com_facebook_loginview_logged_in_using_facebook);
                    p0.a.r(string, "{\n          resources.getString(R.string.com_facebook_loginview_logged_in_using_facebook)\n        }");
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setMessage(string).setCancelable(true).setPositiveButton(string2, new b(loginManager, 1)).setNegativeButton(string3, (DialogInterface.OnClickListener) null);
                builder.create().show();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class ToolTipMode extends Enum<ToolTipMode> {
        public static final ToolTipMode AUTOMATIC;

        @NotNull
        private static final ToolTipMode DEFAULT = new ToolTipMode(AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_AUTOMATIC, 0);
        private final int intValue;

        @NotNull
        private final String stringValue;
        public static final ToolTipMode DISPLAY_ALWAYS = new ToolTipMode("display_always", 1);
        public static final ToolTipMode NEVER_DISPLAY = new ToolTipMode("never_display", 2);
        private static final /* synthetic */ ToolTipMode[] $VALUES = $values();

        @NotNull
        public static final Companion Companion = new Companion(null);

        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(k kVar) {
                this();
            }

            @Nullable
            public final ToolTipMode fromInt(int i2) {
                for (ToolTipMode toolTipMode : ToolTipMode.values()) {
                    if (toolTipMode.getIntValue() == i2) {
                        return toolTipMode;
                    }
                }
                return null;
            }

            @NotNull
            public final ToolTipMode getDEFAULT() {
                return ToolTipMode.DEFAULT;
            }
        }

        private static final /* synthetic */ ToolTipMode[] $values() {
            return new ToolTipMode[]{AUTOMATIC, DISPLAY_ALWAYS, NEVER_DISPLAY};
        }

        static {
            ToolTipMode toolTipMode = new ToolTipMode(AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_AUTOMATIC, 0);
            AUTOMATIC = toolTipMode;
            DISPLAY_ALWAYS = new ToolTipMode("display_always", 1);
            NEVER_DISPLAY = new ToolTipMode("never_display", 2);
            $VALUES = $values();
            Companion = new Companion(null);
            DEFAULT = toolTipMode;
        }

        private ToolTipMode(String str, int i2, String str2, int i3) {
            super(str, i2);
            this.stringValue = str2;
            this.intValue = i3;
        }

        public static ToolTipMode valueOf(String str) {
            p0.a.s(str, "value");
            return (ToolTipMode) Enum.valueOf(ToolTipMode.class, str);
        }

        public static ToolTipMode[] values() {
            ToolTipMode[] toolTipModeArr = $VALUES;
            return (ToolTipMode[]) Arrays.copyOf(toolTipModeArr, toolTipModeArr.length);
        }

        public final int getIntValue() {
            return this.intValue;
        }

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            return this.stringValue;
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToolTipMode.values().length];
            iArr[ToolTipMode.AUTOMATIC.ordinal()] = 1;
            iArr[ToolTipMode.DISPLAY_ALWAYS.ordinal()] = 2;
            iArr[ToolTipMode.NEVER_DISPLAY.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginButton(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2, int i3, @NotNull String str, @NotNull String str2) {
        super(context, attributeSet, i2, i3, str, str2);
        p0.a.s(context, "context");
        p0.a.s(str, "analyticsButtonCreatedEventName");
        p0.a.s(str2, "analyticsButtonTappedEventName");
        this.properties = new LoginButtonProperties();
        this.toolTipStyle = ToolTipPopup.Style.BLUE;
        this.toolTipMode = ToolTipMode.Companion.getDEFAULT();
        this.toolTipDisplayTime = ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME;
        this.loginManagerLazy = f0.t(LoginButton$loginManagerLazy$1.INSTANCE);
        this.customButtonTransparency = MAX_BUTTON_TRANSPARENCY;
        String uuid = UUID.randomUUID().toString();
        p0.a.r(uuid, "randomUUID().toString()");
        this.loggerID = uuid;
    }

    private final void checkToolTipSettings() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            int i2 = WhenMappings.$EnumSwitchMapping$0[this.toolTipMode.ordinal()];
            if (i2 == 1) {
                Utility utility = Utility.INSTANCE;
                FacebookSdk.getExecutor().execute(new com.facebook.appevents.b(9, Utility.getMetadataApplicationId(getContext()), this));
            } else {
                if (i2 != 2) {
                    return;
                }
                String string = getResources().getString(R.string.com_facebook_tooltip_default);
                p0.a.r(string, "resources.getString(R.string.com_facebook_tooltip_default)");
                displayToolTip(string);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* renamed from: checkToolTipSettings$lambda-3 */
    public static final void m575checkToolTipSettings$lambda3(String str, LoginButton loginButton) {
        p0.a.s(str, "$appId");
        p0.a.s(loginButton, "this$0");
        loginButton.getActivity().runOnUiThread(new com.facebook.appevents.b(8, loginButton, FetchedAppSettingsManager.queryAppSettings(str, false)));
    }

    /* renamed from: checkToolTipSettings$lambda-3$lambda-2 */
    public static final void m576checkToolTipSettings$lambda3$lambda2(LoginButton loginButton, FetchedAppSettings fetchedAppSettings) {
        p0.a.s(loginButton, "this$0");
        loginButton.showToolTipPerSettings(fetchedAppSettings);
    }

    private final void displayToolTip(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            ToolTipPopup toolTipPopup = new ToolTipPopup(str, this);
            toolTipPopup.setStyle(this.toolTipStyle);
            toolTipPopup.setNuxDisplayTime(this.toolTipDisplayTime);
            toolTipPopup.show();
            this.toolTipPopup = toolTipPopup;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final int measureButtonWidth(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            return getCompoundPaddingLeft() + getCompoundDrawablePadding() + measureTextWidth(str) + getCompoundPaddingRight();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }

    /* renamed from: onAttachedToWindow$lambda-0 */
    public static final void m577onAttachedToWindow$lambda0(CallbackManager.ActivityResultParameters activityResultParameters) {
    }

    private final void showToolTipPerSettings(FetchedAppSettings fetchedAppSettings) {
        if (CrashShieldHandler.isObjectCrashing(this) || fetchedAppSettings == null) {
            return;
        }
        try {
            if (fetchedAppSettings.getNuxEnabled() && getVisibility() == 0) {
                displayToolTip(fetchedAppSettings.getNuxContent());
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void clearPermissions() {
        this.properties.clearPermissions();
    }

    @Override // com.facebook.FacebookButtonBase
    public void configureButton(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2, int i3) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            p0.a.s(context, "context");
            super.configureButton(context, attributeSet, i2, i3);
            setInternalOnClickListener(getNewLoginClickListener());
            parseLoginButtonAttributes(context, attributeSet, i2, i3);
            if (isInEditMode()) {
                setBackgroundColor(getResources().getColor(com.facebook.common.R.color.com_facebook_blue));
                setLoginText("Continue with Facebook");
            } else {
                this.accessTokenTracker = new AccessTokenTracker() { // from class: com.facebook.login.widget.LoginButton$configureButton$1
                    @Override // com.facebook.AccessTokenTracker
                    public void onCurrentAccessTokenChanged(@Nullable AccessToken accessToken, @Nullable AccessToken accessToken2) {
                        LoginButton.this.setButtonText();
                        LoginButton.this.setButtonIcon();
                    }
                };
            }
            setButtonText();
            setButtonRadius();
            setButtonTransparency();
            setButtonIcon();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void dismissToolTip() {
        ToolTipPopup toolTipPopup = this.toolTipPopup;
        if (toolTipPopup != null) {
            toolTipPopup.dismiss();
        }
        this.toolTipPopup = null;
    }

    @Override // com.facebook.FacebookButtonBase, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(BuildConfig.LIBRARY_PACKAGE_NAME, this, me);
        return super.dispatchTouchEvent(me);
    }

    @NotNull
    public final String getAuthType() {
        return this.properties.getAuthType();
    }

    @Nullable
    public final CallbackManager getCallbackManager() {
        return this.callbackManager;
    }

    @NotNull
    public final DefaultAudience getDefaultAudience() {
        return this.properties.getDefaultAudience();
    }

    @Override // com.facebook.FacebookButtonBase
    public int getDefaultRequestCode() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            return CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }

    @Override // com.facebook.FacebookButtonBase
    public int getDefaultStyleResource() {
        return R.style.com_facebook_loginview_default_style;
    }

    @NotNull
    public final String getLoggerID() {
        return this.loggerID;
    }

    @NotNull
    public final LoginBehavior getLoginBehavior() {
        return this.properties.getLoginBehavior();
    }

    @StringRes
    public final int getLoginButtonContinueLabel() {
        return R.string.com_facebook_loginview_log_in_button_continue;
    }

    public final int getLoginButtonWidth(int i2) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            Resources resources = getResources();
            String str = this.loginText;
            if (str == null) {
                str = resources.getString(R.string.com_facebook_loginview_log_in_button_continue);
                int measureButtonWidth = measureButtonWidth(str);
                if (View.resolveSize(measureButtonWidth, i2) < measureButtonWidth) {
                    str = resources.getString(R.string.com_facebook_loginview_log_in_button);
                }
            }
            return measureButtonWidth(str);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }

    @NotNull
    public final h getLoginManagerLazy() {
        return this.loginManagerLazy;
    }

    @NotNull
    public final LoginTargetApp getLoginTargetApp() {
        return this.properties.getLoginTargetApp();
    }

    @Nullable
    public final String getLoginText() {
        return this.loginText;
    }

    @Nullable
    public final String getLogoutText() {
        return this.logoutText;
    }

    @Nullable
    public final String getMessengerPageId() {
        return this.properties.getMessengerPageId();
    }

    @NotNull
    public LoginClickListener getNewLoginClickListener() {
        return new LoginClickListener(this);
    }

    @NotNull
    public final List<String> getPermissions() {
        return this.properties.getPermissions();
    }

    @NotNull
    public final LoginButtonProperties getProperties() {
        return this.properties;
    }

    public final boolean getResetMessengerState() {
        return this.properties.getResetMessengerState();
    }

    public final boolean getShouldSkipAccountDeduplication() {
        return this.properties.getShouldSkipAccountDeduplication();
    }

    public final long getToolTipDisplayTime() {
        return this.toolTipDisplayTime;
    }

    @NotNull
    public final ToolTipMode getToolTipMode() {
        return this.toolTipMode;
    }

    @NotNull
    public final ToolTipPopup.Style getToolTipStyle() {
        return this.toolTipStyle;
    }

    @Override // com.facebook.FacebookButtonBase, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            super.onAttachedToWindow();
            if (getContext() instanceof ActivityResultRegistryOwner) {
                Object context = getContext();
                if (context == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.activity.result.ActivityResultRegistryOwner");
                }
                this.androidXLoginCaller = ((ActivityResultRegistryOwner) context).getActivityResultRegistry().d("facebook-login", ((LoginManager) this.loginManagerLazy.getValue()).createLogInActivityResultContract(this.callbackManager, this.loggerID), new c(11));
            }
            AccessTokenTracker accessTokenTracker = this.accessTokenTracker;
            if (accessTokenTracker != null && accessTokenTracker.isTracking()) {
                accessTokenTracker.startTracking();
                setButtonText();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            super.onDetachedFromWindow();
            ActivityResultLauncher<Collection<String>> activityResultLauncher = this.androidXLoginCaller;
            if (activityResultLauncher != null) {
                activityResultLauncher.c();
            }
            AccessTokenTracker accessTokenTracker = this.accessTokenTracker;
            if (accessTokenTracker != null) {
                accessTokenTracker.stopTracking();
            }
            dismissToolTip();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @Override // com.facebook.FacebookButtonBase, android.widget.TextView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            p0.a.s(canvas, "canvas");
            super.onDraw(canvas);
            if (this.toolTipChecked || isInEditMode()) {
                return;
            }
            this.toolTipChecked = true;
            checkToolTipSettings();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            super.onLayout(z2, i2, i3, i4, i5);
            setButtonText();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @Override // com.facebook.FacebookButtonBase, android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
            int compoundPaddingTop = getCompoundPaddingTop() + ((int) Math.ceil(Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom))) + getCompoundPaddingBottom();
            Resources resources = getResources();
            int loginButtonWidth = getLoginButtonWidth(i2);
            String str = this.logoutText;
            if (str == null) {
                str = resources.getString(R.string.com_facebook_loginview_log_out_button);
                p0.a.r(str, "resources.getString(R.string.com_facebook_loginview_log_out_button)");
            }
            setMeasuredDimension(View.resolveSize(Math.max(loginButtonWidth, measureButtonWidth(str)), i2), compoundPaddingTop);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onVisibilityChanged(@NotNull View view, int i2) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            p0.a.s(view, "changedView");
            super.onVisibilityChanged(view, i2);
            if (i2 != 0) {
                dismissToolTip();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void parseLoginButtonAttributes(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2, int i3) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            p0.a.s(context, "context");
            ToolTipMode.Companion companion = ToolTipMode.Companion;
            this.toolTipMode = companion.getDEFAULT();
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.com_facebook_login_view, i2, i3);
            p0.a.r(obtainStyledAttributes, "context\n            .theme\n            .obtainStyledAttributes(\n                attrs, R.styleable.com_facebook_login_view, defStyleAttr, defStyleRes)");
            try {
                this.confirmLogout = obtainStyledAttributes.getBoolean(R.styleable.com_facebook_login_view_com_facebook_confirm_logout, true);
                setLoginText(obtainStyledAttributes.getString(R.styleable.com_facebook_login_view_com_facebook_login_text));
                setLogoutText(obtainStyledAttributes.getString(R.styleable.com_facebook_login_view_com_facebook_logout_text));
                ToolTipMode fromInt = companion.fromInt(obtainStyledAttributes.getInt(R.styleable.com_facebook_login_view_com_facebook_tooltip_mode, companion.getDEFAULT().getIntValue()));
                if (fromInt == null) {
                    fromInt = companion.getDEFAULT();
                }
                this.toolTipMode = fromInt;
                if (obtainStyledAttributes.hasValue(R.styleable.com_facebook_login_view_com_facebook_login_button_radius)) {
                    this.customButtonRadius = Float.valueOf(obtainStyledAttributes.getDimension(R.styleable.com_facebook_login_view_com_facebook_login_button_radius, 0.0f));
                }
                int integer = obtainStyledAttributes.getInteger(R.styleable.com_facebook_login_view_com_facebook_login_button_transparency, MAX_BUTTON_TRANSPARENCY);
                this.customButtonTransparency = integer;
                int max = Math.max(0, integer);
                this.customButtonTransparency = max;
                this.customButtonTransparency = Math.min(MAX_BUTTON_TRANSPARENCY, max);
                obtainStyledAttributes.recycle();
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } catch (Throwable th2) {
            CrashShieldHandler.handleThrowable(th2, this);
        }
    }

    public final void registerCallback(@NotNull CallbackManager callbackManager, @NotNull FacebookCallback<LoginResult> facebookCallback) {
        p0.a.s(callbackManager, "callbackManager");
        p0.a.s(facebookCallback, "callback");
        ((LoginManager) this.loginManagerLazy.getValue()).registerCallback(callbackManager, facebookCallback);
        CallbackManager callbackManager2 = this.callbackManager;
        if (callbackManager2 == null) {
            this.callbackManager = callbackManager;
        } else if (callbackManager2 != callbackManager) {
            Log.w(TAG, "You're registering a callback on the one Facebook login button with two different callback managers. It's almost wrong and may cause unexpected results. Only the first callback manager will be used for handling activity result with androidx.");
        }
    }

    public final void setAuthType(@NotNull String str) {
        p0.a.s(str, "value");
        this.properties.setAuthType(str);
    }

    public final void setButtonIcon() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            setCompoundDrawablesWithIntrinsicBounds(AppCompatResources.a(getContext(), com.facebook.common.R.drawable.com_facebook_button_icon), (Drawable) null, (Drawable) null, (Drawable) null);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
    
        r2 = ((android.graphics.drawable.StateListDrawable) r1).getStateCount();
     */
    @android.annotation.TargetApi(29)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setButtonRadius() {
        /*
            r6 = this;
            boolean r0 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(r6)
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.Float r0 = r6.customButtonRadius     // Catch: java.lang.Throwable -> L38
            if (r0 != 0) goto Lc
            return
        Lc:
            float r0 = r0.floatValue()     // Catch: java.lang.Throwable -> L38
            android.graphics.drawable.Drawable r1 = r6.getBackground()     // Catch: java.lang.Throwable -> L38
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L38
            r3 = 29
            if (r2 < r3) goto L46
            boolean r2 = r1 instanceof android.graphics.drawable.StateListDrawable     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L46
            r2 = r1
            android.graphics.drawable.StateListDrawable r2 = (android.graphics.drawable.StateListDrawable) r2     // Catch: java.lang.Throwable -> L38
            int r2 = com.applovin.impl.tv.a(r2)     // Catch: java.lang.Throwable -> L38
            if (r2 <= 0) goto L46
            r3 = 0
        L28:
            int r4 = r3 + 1
            r5 = r1
            android.graphics.drawable.StateListDrawable r5 = (android.graphics.drawable.StateListDrawable) r5     // Catch: java.lang.Throwable -> L38
            android.graphics.drawable.Drawable r3 = com.applovin.impl.tv.i(r5, r3)     // Catch: java.lang.Throwable -> L38
            boolean r5 = r3 instanceof android.graphics.drawable.GradientDrawable     // Catch: java.lang.Throwable -> L38
            if (r5 == 0) goto L3a
            android.graphics.drawable.GradientDrawable r3 = (android.graphics.drawable.GradientDrawable) r3     // Catch: java.lang.Throwable -> L38
            goto L3b
        L38:
            r0 = move-exception
            goto L50
        L3a:
            r3 = 0
        L3b:
            if (r3 != 0) goto L3e
            goto L41
        L3e:
            r3.setCornerRadius(r0)     // Catch: java.lang.Throwable -> L38
        L41:
            if (r4 < r2) goto L44
            goto L46
        L44:
            r3 = r4
            goto L28
        L46:
            boolean r2 = r1 instanceof android.graphics.drawable.GradientDrawable     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L4f
            android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1     // Catch: java.lang.Throwable -> L38
            r1.setCornerRadius(r0)     // Catch: java.lang.Throwable -> L38
        L4f:
            return
        L50:
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.widget.LoginButton.setButtonRadius():void");
    }

    public final void setButtonText() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Resources resources = getResources();
            if (!isInEditMode() && AccessToken.Companion.isCurrentAccessTokenActive()) {
                String str = this.logoutText;
                if (str == null) {
                    str = resources.getString(R.string.com_facebook_loginview_log_out_button);
                }
                setText(str);
                return;
            }
            String str2 = this.loginText;
            if (str2 != null) {
                setText(str2);
                return;
            }
            String string = resources.getString(getLoginButtonContinueLabel());
            p0.a.r(string, "resources.getString(loginButtonContinueLabel)");
            int width = getWidth();
            if (width != 0 && measureButtonWidth(string) > width) {
                string = resources.getString(R.string.com_facebook_loginview_log_in_button);
                p0.a.r(string, "resources.getString(R.string.com_facebook_loginview_log_in_button)");
            }
            setText(string);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void setButtonTransparency() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            getBackground().setAlpha(this.customButtonTransparency);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void setDefaultAudience(@NotNull DefaultAudience defaultAudience) {
        p0.a.s(defaultAudience, "value");
        this.properties.setDefaultAudience(defaultAudience);
    }

    public final void setLoginBehavior(@NotNull LoginBehavior loginBehavior) {
        p0.a.s(loginBehavior, "value");
        this.properties.setLoginBehavior(loginBehavior);
    }

    public final void setLoginManagerLazy(@NotNull h hVar) {
        p0.a.s(hVar, "<set-?>");
        this.loginManagerLazy = hVar;
    }

    public final void setLoginTargetApp(@NotNull LoginTargetApp loginTargetApp) {
        p0.a.s(loginTargetApp, "value");
        this.properties.setLoginTargetApp(loginTargetApp);
    }

    public final void setLoginText(@Nullable String str) {
        this.loginText = str;
        setButtonText();
    }

    public final void setLogoutText(@Nullable String str) {
        this.logoutText = str;
        setButtonText();
    }

    public final void setMessengerPageId(@Nullable String str) {
        this.properties.setMessengerPageId(str);
    }

    public final void setPermissions(@NotNull String... strArr) {
        p0.a.s(strArr, "permissions");
        LoginButtonProperties loginButtonProperties = this.properties;
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        p0.a.s(copyOf, "elements");
        loginButtonProperties.setPermissions(q.a0(copyOf));
    }

    @d0.a
    public final void setPublishPermissions(@NotNull List<String> list) {
        p0.a.s(list, "permissions");
        this.properties.setPermissions(list);
    }

    @d0.a
    public final void setReadPermissions(@NotNull List<String> list) {
        p0.a.s(list, "permissions");
        this.properties.setPermissions(list);
    }

    public final void setResetMessengerState(boolean z2) {
        this.properties.setResetMessengerState(z2);
    }

    public final void setToolTipDisplayTime(long j2) {
        this.toolTipDisplayTime = j2;
    }

    public final void setToolTipMode(@NotNull ToolTipMode toolTipMode) {
        p0.a.s(toolTipMode, "<set-?>");
        this.toolTipMode = toolTipMode;
    }

    public final void setToolTipStyle(@NotNull ToolTipPopup.Style style) {
        p0.a.s(style, "<set-?>");
        this.toolTipStyle = style;
    }

    public final void unregisterCallback(@NotNull CallbackManager callbackManager) {
        p0.a.s(callbackManager, "callbackManager");
        ((LoginManager) this.loginManagerLazy.getValue()).unregisterCallback(callbackManager);
    }

    @d0.a
    public final void setPublishPermissions(@NotNull String... strArr) {
        p0.a.s(strArr, "permissions");
        LoginButtonProperties loginButtonProperties = this.properties;
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        p0.a.s(copyOf, "elements");
        loginButtonProperties.setPermissions(q.a0(copyOf));
    }

    @d0.a
    public final void setReadPermissions(@NotNull String... strArr) {
        p0.a.s(strArr, "permissions");
        LoginButtonProperties loginButtonProperties = this.properties;
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        p0.a.s(copyOf, "elements");
        loginButtonProperties.setPermissions(q.a0(copyOf));
    }

    public final void setPermissions(@NotNull List<String> list) {
        p0.a.s(list, "value");
        this.properties.setPermissions(list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginButton(@NotNull Context context) {
        this(context, null, 0, 0, AnalyticsEvents.EVENT_LOGIN_BUTTON_CREATE, AnalyticsEvents.EVENT_LOGIN_BUTTON_DID_TAP);
        p0.a.s(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, AnalyticsEvents.EVENT_LOGIN_BUTTON_CREATE, AnalyticsEvents.EVENT_LOGIN_BUTTON_DID_TAP);
        p0.a.s(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginButton(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0, AnalyticsEvents.EVENT_LOGIN_BUTTON_CREATE, AnalyticsEvents.EVENT_LOGIN_BUTTON_DID_TAP);
        p0.a.s(context, "context");
    }
}
