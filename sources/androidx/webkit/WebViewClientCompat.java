package androidx.webkit;

import android.app.PendingIntent;
import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RestrictTo;
import androidx.webkit.internal.ApiHelperForLollipop;
import androidx.webkit.internal.WebResourceErrorImpl;
import androidx.webkit.internal.WebViewFeatureInternal;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewClientBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;
import org.chromium.support_lib_boundary.util.Features;

/* loaded from: classes4.dex */
public class WebViewClientCompat extends WebViewClient implements WebViewClientBoundaryInterface {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f21801a = {Features.VISUAL_STATE_CALLBACK, Features.RECEIVE_WEB_RESOURCE_ERROR, Features.RECEIVE_HTTP_ERROR, Features.SHOULD_OVERRIDE_WITH_REDIRECTS, Features.SAFE_BROWSING_HIT};

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes4.dex */
    public @interface SafeBrowsingThreat {
    }

    public final void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceErrorImpl webResourceErrorImpl) {
        if (WebViewFeature.a(Features.WEB_RESOURCE_ERROR_GET_CODE) && WebViewFeature.a(Features.WEB_RESOURCE_ERROR_GET_DESCRIPTION) && ApiHelperForLollipop.b(webResourceRequest)) {
            onReceivedError(webView, webResourceErrorImpl.b(), webResourceErrorImpl.a().toString(), ApiHelperForLollipop.a(webResourceRequest).toString());
        }
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return f21801a;
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onPageCommitVisible(WebView webView, String str) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, androidx.webkit.internal.WebResourceErrorImpl] */
    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, InvocationHandler invocationHandler) {
        ?? obj = new Object();
        obj.f21824b = (WebResourceErrorBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebResourceErrorBoundaryInterface.class, invocationHandler);
        a(webView, webResourceRequest, obj);
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.webkit.internal.SafeBrowsingResponseImpl, java.lang.Object] */
    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i2, InvocationHandler invocationHandler) {
        ?? obj = new Object();
        obj.f21815b = (SafeBrowsingResponseBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
        if (WebViewFeature.a(Features.SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL)) {
            obj.a();
            return;
        }
        throw WebViewFeatureInternal.a();
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final boolean onWebAuthnIntent(WebView webView, PendingIntent pendingIntent, InvocationHandler invocationHandler) {
        return false;
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, ApiHelperForLollipop.a(webResourceRequest).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, androidx.webkit.internal.WebResourceErrorImpl] */
    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        ?? obj = new Object();
        obj.f21823a = webResourceError;
        a(webView, webResourceRequest, obj);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.webkit.internal.SafeBrowsingResponseImpl, java.lang.Object] */
    @Override // android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i2, SafeBrowsingResponse safeBrowsingResponse) {
        ?? obj = new Object();
        obj.f21814a = safeBrowsingResponse;
        if (WebViewFeature.a(Features.SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL)) {
            obj.a();
            return;
        }
        throw WebViewFeatureInternal.a();
    }
}
