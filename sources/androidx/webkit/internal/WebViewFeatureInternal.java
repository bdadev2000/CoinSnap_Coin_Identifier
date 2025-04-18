package androidx.webkit.internal;

import android.content.pm.PackageInfo;
import android.os.Build;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import androidx.webkit.internal.ApiFeature;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.chromium.support_lib_boundary.util.Features;

/* loaded from: classes2.dex */
public class WebViewFeatureInternal {

    /* renamed from: a, reason: collision with root package name */
    public static final ApiFeature.N f21825a;

    /* renamed from: b, reason: collision with root package name */
    public static final ApiFeature.M f21826b;

    /* renamed from: c, reason: collision with root package name */
    public static final ApiFeature.M f21827c;
    public static final ApiFeature.O_MR1 d;
    public static final ApiFeature.NoFramework e;

    /* renamed from: f, reason: collision with root package name */
    public static final ApiFeature.P f21828f;

    /* renamed from: g, reason: collision with root package name */
    public static final ApiFeature.NoFramework f21829g;

    /* renamed from: h, reason: collision with root package name */
    public static final ApiFeature.NoFramework f21830h;

    /* renamed from: i, reason: collision with root package name */
    public static final ApiFeature.NoFramework f21831i;

    /* renamed from: androidx.webkit.internal.WebViewFeatureInternal$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 extends ApiFeature.NoFramework {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean c() {
            if (!super.c() || !WebViewFeature.a("MULTI_PROCESS")) {
                return false;
            }
            int i2 = WebViewCompat.f21802a;
            if (WebViewFeatureInternal.f21829g.c()) {
                return WebViewGlueCommunicator.b().getStatics().isMultiProcessEnabled();
            }
            throw WebViewFeatureInternal.a();
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [androidx.webkit.internal.ApiFeature$N, androidx.webkit.internal.ApiFeature] */
    /* JADX WARN: Type inference failed for: r0v21, types: [androidx.webkit.internal.ApiFeature, androidx.webkit.internal.ApiFeature$M] */
    /* JADX WARN: Type inference failed for: r0v22, types: [androidx.webkit.internal.ApiFeature, androidx.webkit.internal.ApiFeature$M] */
    /* JADX WARN: Type inference failed for: r0v25, types: [androidx.webkit.internal.ApiFeature, androidx.webkit.internal.ApiFeature$O_MR1] */
    /* JADX WARN: Type inference failed for: r0v28, types: [androidx.webkit.internal.ApiFeature, androidx.webkit.internal.ApiFeature$NoFramework] */
    /* JADX WARN: Type inference failed for: r0v37, types: [androidx.webkit.internal.ApiFeature, androidx.webkit.internal.ApiFeature$P] */
    /* JADX WARN: Type inference failed for: r0v43, types: [androidx.webkit.internal.ApiFeature, androidx.webkit.internal.ApiFeature$NoFramework] */
    /* JADX WARN: Type inference failed for: r0v46, types: [androidx.webkit.internal.ApiFeature, androidx.webkit.internal.ApiFeature$NoFramework] */
    /* JADX WARN: Type inference failed for: r0v57, types: [androidx.webkit.internal.ApiFeature, androidx.webkit.internal.ApiFeature$NoFramework] */
    static {
        new ApiFeature(Features.VISUAL_STATE_CALLBACK, Features.VISUAL_STATE_CALLBACK);
        new ApiFeature(Features.OFF_SCREEN_PRERASTER, Features.OFF_SCREEN_PRERASTER);
        new ApiFeature(Features.SAFE_BROWSING_ENABLE, Features.SAFE_BROWSING_ENABLE);
        new ApiFeature(Features.DISABLED_ACTION_MODE_MENU_ITEMS, Features.DISABLED_ACTION_MODE_MENU_ITEMS);
        new ApiFeature(Features.START_SAFE_BROWSING, Features.START_SAFE_BROWSING);
        new ApiFeature(Features.SAFE_BROWSING_WHITELIST, Features.SAFE_BROWSING_WHITELIST);
        new ApiFeature(Features.SAFE_BROWSING_WHITELIST, Features.SAFE_BROWSING_ALLOWLIST);
        new ApiFeature(Features.SAFE_BROWSING_ALLOWLIST, Features.SAFE_BROWSING_WHITELIST);
        new ApiFeature(Features.SAFE_BROWSING_ALLOWLIST, Features.SAFE_BROWSING_ALLOWLIST);
        new ApiFeature(Features.SAFE_BROWSING_PRIVACY_POLICY_URL, Features.SAFE_BROWSING_PRIVACY_POLICY_URL);
        f21825a = new ApiFeature(Features.SERVICE_WORKER_BASIC_USAGE, Features.SERVICE_WORKER_BASIC_USAGE);
        new ApiFeature(Features.SERVICE_WORKER_CACHE_MODE, Features.SERVICE_WORKER_CACHE_MODE);
        new ApiFeature(Features.SERVICE_WORKER_CONTENT_ACCESS, Features.SERVICE_WORKER_CONTENT_ACCESS);
        new ApiFeature(Features.SERVICE_WORKER_FILE_ACCESS, Features.SERVICE_WORKER_FILE_ACCESS);
        new ApiFeature(Features.SERVICE_WORKER_BLOCK_NETWORK_LOADS, Features.SERVICE_WORKER_BLOCK_NETWORK_LOADS);
        new ApiFeature(Features.SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST, Features.SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST);
        new ApiFeature(Features.RECEIVE_WEB_RESOURCE_ERROR, Features.RECEIVE_WEB_RESOURCE_ERROR);
        new ApiFeature(Features.RECEIVE_HTTP_ERROR, Features.RECEIVE_HTTP_ERROR);
        new ApiFeature(Features.SHOULD_OVERRIDE_WITH_REDIRECTS, Features.SHOULD_OVERRIDE_WITH_REDIRECTS);
        new ApiFeature(Features.SAFE_BROWSING_HIT, Features.SAFE_BROWSING_HIT);
        new ApiFeature(Features.WEB_RESOURCE_REQUEST_IS_REDIRECT, Features.WEB_RESOURCE_REQUEST_IS_REDIRECT);
        f21826b = new ApiFeature(Features.WEB_RESOURCE_ERROR_GET_DESCRIPTION, Features.WEB_RESOURCE_ERROR_GET_DESCRIPTION);
        f21827c = new ApiFeature(Features.WEB_RESOURCE_ERROR_GET_CODE, Features.WEB_RESOURCE_ERROR_GET_CODE);
        new ApiFeature(Features.SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY, Features.SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY);
        new ApiFeature(Features.SAFE_BROWSING_RESPONSE_PROCEED, Features.SAFE_BROWSING_RESPONSE_PROCEED);
        d = new ApiFeature(Features.SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL, Features.SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL);
        new ApiFeature(Features.WEB_MESSAGE_PORT_POST_MESSAGE, Features.WEB_MESSAGE_PORT_POST_MESSAGE);
        new ApiFeature(Features.WEB_MESSAGE_PORT_CLOSE, Features.WEB_MESSAGE_PORT_CLOSE);
        e = new ApiFeature(Features.WEB_MESSAGE_ARRAY_BUFFER, Features.WEB_MESSAGE_ARRAY_BUFFER);
        new ApiFeature(Features.WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK, Features.WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK);
        new ApiFeature(Features.CREATE_WEB_MESSAGE_CHANNEL, Features.CREATE_WEB_MESSAGE_CHANNEL);
        new ApiFeature(Features.POST_WEB_MESSAGE, Features.POST_WEB_MESSAGE);
        new ApiFeature(Features.WEB_MESSAGE_CALLBACK_ON_MESSAGE, Features.WEB_MESSAGE_CALLBACK_ON_MESSAGE);
        new ApiFeature(Features.GET_WEB_VIEW_CLIENT, Features.GET_WEB_VIEW_CLIENT);
        new ApiFeature(Features.GET_WEB_CHROME_CLIENT, Features.GET_WEB_CHROME_CLIENT);
        new ApiFeature(Features.GET_WEB_VIEW_RENDERER, Features.GET_WEB_VIEW_RENDERER);
        new ApiFeature(Features.WEB_VIEW_RENDERER_TERMINATE, Features.WEB_VIEW_RENDERER_TERMINATE);
        f21828f = new ApiFeature(Features.TRACING_CONTROLLER_BASIC_USAGE, Features.TRACING_CONTROLLER_BASIC_USAGE);
        new StartupApiFeature();
        new StartupApiFeature();
        new ApiFeature(Features.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE, Features.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE);
        new ApiFeature.T() { // from class: androidx.webkit.internal.WebViewFeatureInternal.1
            public final Pattern d = Pattern.compile("\\A\\d+");

            @Override // androidx.webkit.internal.ApiFeature
            public final boolean c() {
                boolean c2 = super.c();
                if (!c2 || Build.VERSION.SDK_INT >= 29) {
                    return c2;
                }
                int i2 = WebViewCompat.f21802a;
                PackageInfo a2 = ApiHelperForO.a();
                if (a2 == null) {
                    return false;
                }
                Matcher matcher = this.d.matcher(a2.versionName);
                return matcher.find() && Integer.parseInt(a2.versionName.substring(matcher.start(), matcher.end())) >= 105;
            }
        };
        new ApiFeature("PROXY_OVERRIDE", Features.PROXY_OVERRIDE);
        f21829g = new ApiFeature("MULTI_PROCESS", Features.MULTI_PROCESS_QUERY);
        new ApiFeature(Features.FORCE_DARK, Features.FORCE_DARK);
        new ApiFeature("FORCE_DARK_STRATEGY", Features.FORCE_DARK_BEHAVIOR);
        f21830h = new ApiFeature(Features.WEB_MESSAGE_LISTENER, Features.WEB_MESSAGE_LISTENER);
        new ApiFeature("DOCUMENT_START_SCRIPT", Features.DOCUMENT_START_SCRIPT);
        new ApiFeature(Features.PROXY_OVERRIDE_REVERSE_BYPASS, Features.PROXY_OVERRIDE_REVERSE_BYPASS);
        new ApiFeature(Features.GET_VARIATIONS_HEADER, Features.GET_VARIATIONS_HEADER);
        new ApiFeature(Features.ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY, Features.ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY);
        new ApiFeature(Features.GET_COOKIE_INFO, Features.GET_COOKIE_INFO);
        new ApiFeature(Features.REQUESTED_WITH_HEADER_ALLOW_LIST, Features.REQUESTED_WITH_HEADER_ALLOW_LIST);
        new ApiFeature(Features.USER_AGENT_METADATA, Features.USER_AGENT_METADATA);
        new ApiFeature(Features.MULTI_PROFILE, Features.MULTI_PROFILE);
        new ApiFeature("ATTRIBUTION_REGISTRATION_BEHAVIOR", Features.ATTRIBUTION_BEHAVIOR);
        new ApiFeature("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", Features.WEBVIEW_MEDIA_INTEGRITY_API_STATUS);
        f21831i = new ApiFeature(Features.MUTE_AUDIO, Features.MUTE_AUDIO);
    }

    public static UnsupportedOperationException a() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }
}
