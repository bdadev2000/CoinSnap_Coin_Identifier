package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.internal.FacebookDialogFragment;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.WebDialog;
import com.facebook.login.LoginClient;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RestrictTo
/* loaded from: classes3.dex */
public class WebViewLoginMethodHandler extends WebLoginMethodHandler {

    @NotNull
    private static final String OAUTH_DIALOG = "oauth";

    @Nullable
    private String e2e;

    @Nullable
    private WebDialog loginDialog;

    @NotNull
    private final String nameForLogging;

    @NotNull
    private final AccessTokenSource tokenSource;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<WebViewLoginMethodHandler> CREATOR = new Parcelable.Creator<WebViewLoginMethodHandler>() { // from class: com.facebook.login.WebViewLoginMethodHandler$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public WebViewLoginMethodHandler createFromParcel(@NotNull Parcel parcel) {
            p0.a.s(parcel, "source");
            return new WebViewLoginMethodHandler(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public WebViewLoginMethodHandler[] newArray(int i2) {
            return new WebViewLoginMethodHandler[i2];
        }
    };

    /* loaded from: classes3.dex */
    public final class AuthDialogBuilder extends WebDialog.Builder {
        public String authType;
        public String e2e;
        private boolean isFamilyLogin;

        @NotNull
        private LoginBehavior loginBehavior;

        @NotNull
        private String redirect_uri;
        private boolean shouldSkipDedupe;

        @NotNull
        private LoginTargetApp targetApp;
        final /* synthetic */ WebViewLoginMethodHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AuthDialogBuilder(@NotNull WebViewLoginMethodHandler webViewLoginMethodHandler, @NotNull Context context, @NotNull String str, Bundle bundle) {
            super(context, str, "oauth", bundle);
            p0.a.s(webViewLoginMethodHandler, "this$0");
            p0.a.s(context, "context");
            p0.a.s(str, "applicationId");
            p0.a.s(bundle, "parameters");
            this.this$0 = webViewLoginMethodHandler;
            this.redirect_uri = ServerProtocol.DIALOG_REDIRECT_URI;
            this.loginBehavior = LoginBehavior.NATIVE_WITH_FALLBACK;
            this.targetApp = LoginTargetApp.FACEBOOK;
        }

        @Override // com.facebook.internal.WebDialog.Builder
        @NotNull
        public WebDialog build() {
            Bundle parameters = getParameters();
            if (parameters == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.os.Bundle");
            }
            parameters.putString(ServerProtocol.DIALOG_PARAM_REDIRECT_URI, this.redirect_uri);
            parameters.putString("client_id", getApplicationId());
            parameters.putString("e2e", getE2e());
            parameters.putString(ServerProtocol.DIALOG_PARAM_RESPONSE_TYPE, this.targetApp == LoginTargetApp.INSTAGRAM ? ServerProtocol.DIALOG_RESPONSE_TYPE_TOKEN_AND_SCOPES : ServerProtocol.DIALOG_RESPONSE_TYPE_TOKEN_AND_SIGNED_REQUEST);
            parameters.putString(ServerProtocol.DIALOG_PARAM_RETURN_SCOPES, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            parameters.putString(ServerProtocol.DIALOG_PARAM_AUTH_TYPE, getAuthType());
            parameters.putString("login_behavior", this.loginBehavior.name());
            if (this.isFamilyLogin) {
                parameters.putString(ServerProtocol.DIALOG_PARAM_FX_APP, this.targetApp.toString());
            }
            if (this.shouldSkipDedupe) {
                parameters.putString(ServerProtocol.DIALOG_PARAM_SKIP_DEDUPE, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            }
            WebDialog.Companion companion = WebDialog.Companion;
            Context context = getContext();
            if (context != null) {
                return companion.newInstance(context, "oauth", parameters, getTheme(), this.targetApp, getListener());
            }
            throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
        }

        @NotNull
        public final String getAuthType() {
            String str = this.authType;
            if (str != null) {
                return str;
            }
            p0.a.B0("authType");
            throw null;
        }

        @NotNull
        public final String getE2e() {
            String str = this.e2e;
            if (str != null) {
                return str;
            }
            p0.a.B0("e2e");
            throw null;
        }

        /* renamed from: setAuthType, reason: collision with other method in class */
        public final void m574setAuthType(@NotNull String str) {
            p0.a.s(str, "<set-?>");
            this.authType = str;
        }

        @NotNull
        public final AuthDialogBuilder setE2E(@NotNull String str) {
            p0.a.s(str, "e2e");
            setE2e(str);
            return this;
        }

        public final void setE2e(@NotNull String str) {
            p0.a.s(str, "<set-?>");
            this.e2e = str;
        }

        @NotNull
        public final AuthDialogBuilder setFamilyLogin(boolean z2) {
            this.isFamilyLogin = z2;
            return this;
        }

        @NotNull
        public final AuthDialogBuilder setIsChromeOS(boolean z2) {
            this.redirect_uri = z2 ? ServerProtocol.DIALOG_REDIRECT_CHROME_OS_URI : ServerProtocol.DIALOG_REDIRECT_URI;
            return this;
        }

        @NotNull
        public final AuthDialogBuilder setIsRerequest(boolean z2) {
            return this;
        }

        @NotNull
        public final AuthDialogBuilder setLoginBehavior(@NotNull LoginBehavior loginBehavior) {
            p0.a.s(loginBehavior, "loginBehavior");
            this.loginBehavior = loginBehavior;
            return this;
        }

        @NotNull
        public final AuthDialogBuilder setLoginTargetApp(@NotNull LoginTargetApp loginTargetApp) {
            p0.a.s(loginTargetApp, "targetApp");
            this.targetApp = loginTargetApp;
            return this;
        }

        @NotNull
        public final AuthDialogBuilder setShouldSkipDedupe(boolean z2) {
            this.shouldSkipDedupe = z2;
            return this;
        }

        @NotNull
        public final AuthDialogBuilder setAuthType(@NotNull String str) {
            p0.a.s(str, "authType");
            m574setAuthType(str);
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewLoginMethodHandler(@NotNull LoginClient loginClient) {
        super(loginClient);
        p0.a.s(loginClient, "loginClient");
        this.nameForLogging = "web_view";
        this.tokenSource = AccessTokenSource.WEB_VIEW;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public void cancel() {
        WebDialog webDialog = this.loginDialog;
        if (webDialog != null) {
            if (webDialog != null) {
                webDialog.cancel();
            }
            this.loginDialog = null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getE2e() {
        return this.e2e;
    }

    @Nullable
    public final WebDialog getLoginDialog() {
        return this.loginDialog;
    }

    @Override // com.facebook.login.LoginMethodHandler
    @NotNull
    public String getNameForLogging() {
        return this.nameForLogging;
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    @NotNull
    public AccessTokenSource getTokenSource() {
        return this.tokenSource;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public boolean needsInternetPermission() {
        return true;
    }

    public final void onWebDialogComplete(@NotNull LoginClient.Request request, @Nullable Bundle bundle, @Nullable FacebookException facebookException) {
        p0.a.s(request, "request");
        super.onComplete(request, bundle, facebookException);
    }

    public final void setE2e(@Nullable String str) {
        this.e2e = str;
    }

    public final void setLoginDialog(@Nullable WebDialog webDialog) {
        this.loginDialog = webDialog;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public int tryAuthorize(@NotNull final LoginClient.Request request) {
        p0.a.s(request, "request");
        Bundle parameters = getParameters(request);
        WebDialog.OnCompleteListener onCompleteListener = new WebDialog.OnCompleteListener() { // from class: com.facebook.login.WebViewLoginMethodHandler$tryAuthorize$listener$1
            @Override // com.facebook.internal.WebDialog.OnCompleteListener
            public void onComplete(@Nullable Bundle bundle, @Nullable FacebookException facebookException) {
                WebViewLoginMethodHandler.this.onWebDialogComplete(request, bundle, facebookException);
            }
        };
        String e2e = LoginClient.Companion.getE2E();
        this.e2e = e2e;
        addLoggingExtra("e2e", e2e);
        FragmentActivity activity = getLoginClient().getActivity();
        if (activity == null) {
            return 0;
        }
        boolean isChromeOS = Utility.isChromeOS(activity);
        AuthDialogBuilder authDialogBuilder = new AuthDialogBuilder(this, activity, request.getApplicationId(), parameters);
        String str = this.e2e;
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        this.loginDialog = authDialogBuilder.setE2E(str).setIsChromeOS(isChromeOS).setAuthType(request.getAuthType()).setLoginBehavior(request.getLoginBehavior()).setLoginTargetApp(request.getLoginTargetApp()).setFamilyLogin(request.isFamilyLogin()).setShouldSkipDedupe(request.shouldSkipAccountDeduplication()).setOnCompleteListener(onCompleteListener).build();
        FacebookDialogFragment facebookDialogFragment = new FacebookDialogFragment();
        facebookDialogFragment.setRetainInstance(true);
        facebookDialogFragment.setInnerDialog(this.loginDialog);
        facebookDialogFragment.show(activity.getSupportFragmentManager(), FacebookDialogFragment.TAG);
        return 1;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i2) {
        p0.a.s(parcel, "dest");
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.e2e);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewLoginMethodHandler(@NotNull Parcel parcel) {
        super(parcel);
        p0.a.s(parcel, "source");
        this.nameForLogging = "web_view";
        this.tokenSource = AccessTokenSource.WEB_VIEW;
        this.e2e = parcel.readString();
    }
}
