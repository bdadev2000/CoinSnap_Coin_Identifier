package com.glority.android.core.jsbridge;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.route.WebPageStartRequest;
import com.google.android.exoplayer2.SimpleExoPlayer;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: WebViewClient.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\fJ\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\fH\u0004J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\fH\u0004J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\fH\u0016J&\u0010\u0018\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J \u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0017J(\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\fH\u0016J \u0010$\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020&H\u0017J\u0010\u0010'\u001a\u00020\u00122\b\u0010(\u001a\u0004\u0018\u00010\fJ\u000e\u0010)\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010*\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\nJ\u0018\u0010+\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010+\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\fH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/glority/android/core/jsbridge/WebViewClient;", "Landroid/webkit/WebViewClient;", "webView", "Lcom/glority/android/core/jsbridge/WebView;", "progressBar", "Landroid/view/View;", "llNoNetworkView", "Landroid/widget/LinearLayout;", "(Lcom/glority/android/core/jsbridge/WebView;Landroid/view/View;Landroid/widget/LinearLayout;)V", "isRedirected", "", "mBookingSource", "", "mIsLoadSuccess", "urltest", "isWhiteList", "host", "onCustomPageFinishd", "", "view", "Landroid/webkit/WebView;", "url", "onCustomShouldOverrideUrlLoading", "onPageFinished", "onPageStarted", "favicon", "Landroid/graphics/Bitmap;", "onReceivedError", "request", "Landroid/webkit/WebResourceRequest;", "error", "Landroid/webkit/WebResourceError;", "errorCode", "", "description", "failingUrl", "onReceivedHttpError", "errorResponse", "Landroid/webkit/WebResourceResponse;", "setBookingSource", "bookingSource", "setRedirected", "setmIsLoadSuccess", "shouldOverrideUrlLoading", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public class WebViewClient extends android.webkit.WebViewClient {
    private boolean isRedirected;
    private final LinearLayout llNoNetworkView;
    private String mBookingSource;
    private boolean mIsLoadSuccess;
    private final View progressBar;
    private String urltest;
    private final WebView webView;

    public WebViewClient(WebView webView, View progressBar, LinearLayout llNoNetworkView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(progressBar, "progressBar");
        Intrinsics.checkNotNullParameter(llNoNetworkView, "llNoNetworkView");
        this.webView = webView;
        this.progressBar = progressBar;
        this.llNoNetworkView = llNoNetworkView;
        this.mIsLoadSuccess = true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(android.webkit.WebView view, String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            String decode = URLDecoder.decode(url, "UTF-8");
            Intrinsics.checkNotNullExpressionValue(decode, "decode(url, \"UTF-8\")");
            url = decode;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        if (StringsKt.startsWith$default(url, BridgeUtil.INSTANCE.getRETURN_DATA$fwk_core_release(), false, 2, (Object) null)) {
            this.webView.handlerReturnData$fwk_core_release(url);
            return true;
        }
        if (StringsKt.startsWith$default(url, BridgeUtil.INSTANCE.getSCHEMA$fwk_core_release(), false, 2, (Object) null)) {
            this.webView.flushMessageQueue$fwk_core_release();
            return true;
        }
        if (onCustomShouldOverrideUrlLoading(url)) {
            return true;
        }
        return super.shouldOverrideUrlLoading(view, url);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(android.webkit.WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        String uri = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "request.url.toString()");
        try {
            String decode = URLDecoder.decode(uri, "UTF-8");
            Intrinsics.checkNotNullExpressionValue(decode, "decode(url, \"UTF-8\")");
            uri = decode;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        if (StringsKt.startsWith$default(uri, BridgeUtil.INSTANCE.getRETURN_DATA$fwk_core_release(), false, 2, (Object) null)) {
            this.webView.handlerReturnData$fwk_core_release(uri);
            return true;
        }
        if (StringsKt.startsWith$default(uri, BridgeUtil.INSTANCE.getSCHEMA$fwk_core_release(), false, 2, (Object) null)) {
            this.webView.flushMessageQueue$fwk_core_release();
            return true;
        }
        if (onCustomShouldOverrideUrlLoading(uri)) {
            return true;
        }
        return super.shouldOverrideUrlLoading(view, request);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(android.webkit.WebView view, String url, Bitmap favicon) {
        String str = url;
        if (str != null && str.length() != 0 && Intrinsics.areEqual(url, "cnglorityscanner://order/orderdetailIdentifier")) {
            new WebPageStartRequest(url).post();
            if (view == null) {
                return;
            }
            view.stopLoading();
            return;
        }
        if (view != null) {
            view.setVisibility(0);
        }
        this.progressBar.setVisibility(0);
        this.webView.postDelayed(new Runnable() { // from class: com.glority.android.core.jsbridge.WebViewClient$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                WebViewClient.m7744onPageStarted$lambda0(WebViewClient.this);
            }
        }, SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onPageStarted$lambda-0, reason: not valid java name */
    public static final void m7744onPageStarted$lambda0(WebViewClient this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BridgeUtil.INSTANCE.webViewLoadLocalJs(this$0.webView, WebView.INSTANCE.getToLoadJs());
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(android.webkit.WebView view, String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        super.onPageFinished(view, url);
        if (this.webView.getStartupMessage() != null) {
            List<Message> startupMessage = this.webView.getStartupMessage();
            Intrinsics.checkNotNull(startupMessage);
            Iterator<Message> it = startupMessage.iterator();
            while (it.hasNext()) {
                this.webView.dispatchMessage$fwk_core_release(it.next());
            }
            this.webView.setStartupMessage(null);
        }
        onCustomPageFinishd(view, url);
    }

    protected final boolean onCustomShouldOverrideUrlLoading(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (this.isRedirected) {
            return true;
        }
        if (StringsKt.startsWith$default(url, "https:", false, 2, (Object) null)) {
            this.webView.loadUrl(url);
            return true;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
        List<ResolveInfo> queryIntentActivities = this.webView.getContext().getPackageManager().queryIntentActivities(intent, 0);
        Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "packageManager.queryIntentActivities(intent, 0)");
        if (queryIntentActivities.size() <= 0) {
            return false;
        }
        this.webView.getContext().startActivity(intent);
        return true;
    }

    protected final void onCustomPageFinishd(android.webkit.WebView view, String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        Context context = this.webView.getContext();
        if (context == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
        }
        if (((Activity) context).isFinishing()) {
            return;
        }
        if (this.mIsLoadSuccess) {
            this.llNoNetworkView.setVisibility(8);
        } else {
            this.llNoNetworkView.setVisibility(0);
        }
        this.progressBar.setVisibility(8);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(android.webkit.WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
        super.onReceivedHttpError(view, request, errorResponse);
        if (isWhiteList(request.getUrl().getHost()) && errorResponse.getStatusCode() != 200) {
            this.mIsLoadSuccess = false;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(android.webkit.WebView view, int errorCode, String description, String failingUrl) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
        super.onReceivedError(view, errorCode, description, failingUrl);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(android.webkit.WebView view, WebResourceRequest request, WebResourceError error) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(error, "error");
        super.onReceivedError(view, request, error);
        if (isWhiteList(request.getUrl().getHost())) {
            Context context = this.webView.getContext();
            if (context == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
            }
            if (((Activity) context).isFinishing()) {
                return;
            }
            this.llNoNetworkView.setVisibility(0);
            this.mIsLoadSuccess = false;
        }
    }

    public final boolean isWhiteList(String host) {
        if (host != null) {
            return host.equals("glority.cn") || StringsKt.endsWith$default(host, ".glority.cn", false, 2, (Object) null);
        }
        return false;
    }

    public final void setmIsLoadSuccess(boolean mIsLoadSuccess) {
        this.mIsLoadSuccess = mIsLoadSuccess;
    }

    public final void setRedirected(boolean isRedirected) {
        this.isRedirected = isRedirected;
    }

    /* renamed from: isRedirected, reason: from getter */
    public final boolean getIsRedirected() {
        return this.isRedirected;
    }

    public final void setBookingSource(String bookingSource) {
        this.mBookingSource = bookingSource;
    }
}
