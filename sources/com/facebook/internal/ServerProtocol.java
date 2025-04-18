package com.facebook.internal;

import android.os.Bundle;
import b1.f0;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import com.facebook.internal.Logger;
import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class ServerProtocol {

    @NotNull
    private static final String DIALOG_AUTHORITY_FORMAT = "m.%s";

    @NotNull
    public static final String DIALOG_CANCEL_URI = "fbconnect://cancel";

    @NotNull
    public static final String DIALOG_PARAM_ACCESS_TOKEN = "access_token";

    @NotNull
    public static final String DIALOG_PARAM_APP_ID = "app_id";

    @NotNull
    public static final String DIALOG_PARAM_AUTHENTICATION_TOKEN = "id_token";

    @NotNull
    public static final String DIALOG_PARAM_AUTH_TYPE = "auth_type";

    @NotNull
    public static final String DIALOG_PARAM_CBT = "cbt";

    @NotNull
    public static final String DIALOG_PARAM_CCT_OVER_LOGGED_OUT_APP_SWITCH = "cct_over_app_switch";

    @NotNull
    public static final String DIALOG_PARAM_CLIENT_ID = "client_id";

    @NotNull
    public static final String DIALOG_PARAM_CODE_CHALLENGE = "code_challenge";

    @NotNull
    public static final String DIALOG_PARAM_CODE_CHALLENGE_METHOD = "code_challenge_method";

    @NotNull
    public static final String DIALOG_PARAM_CODE_REDIRECT_URI = "code_redirect_uri";

    @NotNull
    public static final String DIALOG_PARAM_CUSTOM_TABS_PREFETCHING = "cct_prefetching";

    @NotNull
    public static final String DIALOG_PARAM_DEFAULT_AUDIENCE = "default_audience";

    @NotNull
    public static final String DIALOG_PARAM_DISPLAY = "display";

    @NotNull
    public static final String DIALOG_PARAM_DISPLAY_TOUCH = "touch";

    @NotNull
    public static final String DIALOG_PARAM_E2E = "e2e";

    @NotNull
    public static final String DIALOG_PARAM_FAIL_ON_LOGGED_OUT = "fail_on_logged_out";

    @NotNull
    public static final String DIALOG_PARAM_FX_APP = "fx_app";

    @NotNull
    public static final String DIALOG_PARAM_IES = "ies";

    @NotNull
    public static final String DIALOG_PARAM_LEGACY_OVERRIDE = "legacy_override";

    @NotNull
    public static final String DIALOG_PARAM_LOGIN_BEHAVIOR = "login_behavior";

    @NotNull
    public static final String DIALOG_PARAM_MESSENGER_PAGE_ID = "messenger_page_id";

    @NotNull
    public static final String DIALOG_PARAM_NONCE = "nonce";

    @NotNull
    public static final String DIALOG_PARAM_REDIRECT_URI = "redirect_uri";

    @NotNull
    public static final String DIALOG_PARAM_RESET_MESSENGER_STATE = "reset_messenger_state";

    @NotNull
    public static final String DIALOG_PARAM_RESPONSE_TYPE = "response_type";

    @NotNull
    public static final String DIALOG_PARAM_RETURN_SCOPES = "return_scopes";

    @NotNull
    public static final String DIALOG_PARAM_SCOPE = "scope";

    @NotNull
    public static final String DIALOG_PARAM_SDK_VERSION = "sdk";

    @NotNull
    public static final String DIALOG_PARAM_SKIP_DEDUPE = "skip_dedupe";

    @NotNull
    public static final String DIALOG_PARAM_SSO_DEVICE = "sso";

    @NotNull
    public static final String DIALOG_PARAM_STATE = "state";

    @NotNull
    public static final String DIALOG_PATH = "dialog/";

    @NotNull
    public static final String DIALOG_REDIRECT_CHROME_OS_URI = "fbconnect://chrome_os_success";

    @NotNull
    public static final String DIALOG_REDIRECT_URI = "fbconnect://success";

    @NotNull
    public static final String DIALOG_REREQUEST_AUTH_TYPE = "rerequest";

    @NotNull
    public static final String DIALOG_RESPONSE_TYPE_CODE = "code,signed_request,graph_domain";

    @NotNull
    public static final String DIALOG_RESPONSE_TYPE_ID_TOKEN_AND_SIGNED_REQUEST = "id_token,token,signed_request,graph_domain";

    @NotNull
    public static final String DIALOG_RESPONSE_TYPE_TOKEN_AND_SCOPES = "token,signed_request,graph_domain,granted_scopes";

    @NotNull
    public static final String DIALOG_RESPONSE_TYPE_TOKEN_AND_SIGNED_REQUEST = "token,signed_request,graph_domain";

    @NotNull
    public static final String DIALOG_RETURN_SCOPES_TRUE = "true";

    @NotNull
    public static final String FALLBACK_DIALOG_DISPLAY_VALUE_TOUCH = "touch";

    @NotNull
    public static final String FALLBACK_DIALOG_PARAM_APP_ID = "app_id";

    @NotNull
    public static final String FALLBACK_DIALOG_PARAM_BRIDGE_ARGS = "bridge_args";

    @NotNull
    public static final String FALLBACK_DIALOG_PARAM_KEY_HASH = "android_key_hash";

    @NotNull
    public static final String FALLBACK_DIALOG_PARAM_METHOD_ARGS = "method_args";

    @NotNull
    public static final String FALLBACK_DIALOG_PARAM_METHOD_RESULTS = "method_results";

    @NotNull
    public static final String FALLBACK_DIALOG_PARAM_VERSION = "version";

    @NotNull
    private static final String GAMING_DIALOG_AUTHORITY_FORMAT = "%s";

    @NotNull
    private static final String GRAPH_URL_FORMAT = "https://graph.%s";

    @NotNull
    private static final String GRAPH_VIDEO_URL_FORMAT = "https://graph-video.%s";

    @NotNull
    public static final String INSTAGRAM_OAUTH_PATH = "oauth/authorize";

    @NotNull
    public static final ServerProtocol INSTANCE = new ServerProtocol();
    private static final String TAG = ServerProtocol.class.getName();

    private ServerProtocol() {
    }

    @NotNull
    public static final String getDefaultAPIVersion() {
        return "v16.0";
    }

    @NotNull
    public static final String getDialogAuthority() {
        return androidx.compose.foundation.text.input.a.o(new Object[]{FacebookSdk.getFacebookDomain()}, 1, DIALOG_AUTHORITY_FORMAT, "java.lang.String.format(format, *args)");
    }

    @NotNull
    public static final String getErrorConnectionFailure() {
        return "CONNECTION_FAILURE";
    }

    @NotNull
    public static final Collection<String> getErrorsProxyAuthDisabled() {
        return f0.v("service_disabled", "AndroidAuthKillSwitchException");
    }

    @NotNull
    public static final Collection<String> getErrorsUserCanceled() {
        return f0.v("access_denied", "OAuthAccessDeniedException");
    }

    @NotNull
    public static final String getFacebookGraphUrlBase() {
        return androidx.compose.foundation.text.input.a.o(new Object[]{FacebookSdk.getFacebookDomain()}, 1, GRAPH_URL_FORMAT, "java.lang.String.format(format, *args)");
    }

    @NotNull
    public static final String getGamingDialogAuthority() {
        return androidx.compose.foundation.text.input.a.o(new Object[]{FacebookSdk.getFacebookGamingDomain()}, 1, GAMING_DIALOG_AUTHORITY_FORMAT, "java.lang.String.format(format, *args)");
    }

    @NotNull
    public static final String getGraphUrlBase() {
        return androidx.compose.foundation.text.input.a.o(new Object[]{FacebookSdk.getGraphDomain()}, 1, GRAPH_URL_FORMAT, "java.lang.String.format(format, *args)");
    }

    @NotNull
    public static final String getGraphUrlBaseForSubdomain(@NotNull String str) {
        p0.a.s(str, "subdomain");
        return androidx.compose.foundation.text.input.a.o(new Object[]{str}, 1, GRAPH_URL_FORMAT, "java.lang.String.format(format, *args)");
    }

    @NotNull
    public static final String getGraphVideoUrlBase() {
        return androidx.compose.foundation.text.input.a.o(new Object[]{FacebookSdk.getGraphDomain()}, 1, GRAPH_VIDEO_URL_FORMAT, "java.lang.String.format(format, *args)");
    }

    @NotNull
    public static final String getInstagramDialogAuthority() {
        return androidx.compose.foundation.text.input.a.o(new Object[]{FacebookSdk.getInstagramDomain()}, 1, DIALOG_AUTHORITY_FORMAT, "java.lang.String.format(format, *args)");
    }

    @Nullable
    public static final Bundle getQueryParamsForPlatformActivityIntentWebFallback(@NotNull String str, int i2, @Nullable Bundle bundle) {
        p0.a.s(str, "callId");
        String applicationSignature = FacebookSdk.getApplicationSignature(FacebookSdk.getApplicationContext());
        if (Utility.isNullOrEmpty(applicationSignature)) {
            return null;
        }
        Bundle c2 = androidx.compose.foundation.text.input.a.c(FALLBACK_DIALOG_PARAM_KEY_HASH, applicationSignature);
        c2.putString("app_id", FacebookSdk.getApplicationId());
        c2.putInt("version", i2);
        c2.putString(DIALOG_PARAM_DISPLAY, "touch");
        Bundle bundle2 = new Bundle();
        bundle2.putString("action_id", str);
        try {
            JSONObject convertToJSON = BundleJSONConverter.convertToJSON(bundle2);
            if (bundle == null) {
                bundle = new Bundle();
            }
            JSONObject convertToJSON2 = BundleJSONConverter.convertToJSON(bundle);
            if (convertToJSON != null && convertToJSON2 != null) {
                c2.putString(FALLBACK_DIALOG_PARAM_BRIDGE_ARGS, convertToJSON.toString());
                c2.putString(FALLBACK_DIALOG_PARAM_METHOD_ARGS, convertToJSON2.toString());
                return c2;
            }
            return null;
        } catch (IllegalArgumentException e) {
            Logger.Companion companion = Logger.Companion;
            LoggingBehavior loggingBehavior = LoggingBehavior.DEVELOPER_ERRORS;
            String str2 = TAG;
            p0.a.r(str2, "TAG");
            companion.log(loggingBehavior, 6, str2, p0.a.z0(e, "Error creating Url -- "));
            return null;
        } catch (JSONException e2) {
            Logger.Companion companion2 = Logger.Companion;
            LoggingBehavior loggingBehavior2 = LoggingBehavior.DEVELOPER_ERRORS;
            String str3 = TAG;
            p0.a.r(str3, "TAG");
            companion2.log(loggingBehavior2, 6, str3, p0.a.z0(e2, "Error creating Url -- "));
            return null;
        }
    }
}
