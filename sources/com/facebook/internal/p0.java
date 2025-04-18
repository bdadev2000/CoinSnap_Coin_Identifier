package com.facebook.internal;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.util.Log;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class p0 extends WebViewClient {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11069b;

    public p0(v0 this$0) {
        this.a = 0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this.f11069b = this$0;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView view, String url) {
        ProgressDialog progressDialog;
        switch (this.a) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(url, "url");
                super.onPageFinished(view, url);
                v0 v0Var = (v0) this.f11069b;
                if (!v0Var.f11114l && (progressDialog = v0Var.f11109g) != null) {
                    progressDialog.dismiss();
                }
                FrameLayout frameLayout = v0Var.f11111i;
                if (frameLayout != null) {
                    frameLayout.setBackgroundColor(0);
                }
                u0 u0Var = v0Var.f11108f;
                if (u0Var != null) {
                    u0Var.setVisibility(0);
                }
                ImageView imageView = v0Var.f11110h;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                v0Var.f11115m = true;
                return;
            default:
                super.onPageFinished(view, url);
                return;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView view, String url, Bitmap bitmap) {
        ProgressDialog progressDialog;
        switch (this.a) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.stringPlus("Webview loading URL: ", url);
                com.facebook.x xVar = com.facebook.x.a;
                super.onPageStarted(view, url, bitmap);
                v0 v0Var = (v0) this.f11069b;
                if (!v0Var.f11114l && (progressDialog = v0Var.f11109g) != null) {
                    progressDialog.show();
                    return;
                }
                return;
            default:
                super.onPageStarted(view, url, bitmap);
                return;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, int i10, String description, String failingUrl) {
        switch (this.a) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(description, "description");
                Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
                super.onReceivedError(view, i10, description, failingUrl);
                ((v0) this.f11069b).d(new com.facebook.p(description, i10, failingUrl));
                return;
            default:
                super.onReceivedError(view, i10, description, failingUrl);
                return;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        switch (this.a) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(handler, "handler");
                Intrinsics.checkNotNullParameter(error, "error");
                super.onReceivedSslError(view, handler, error);
                handler.cancel();
                ((v0) this.f11069b).d(new com.facebook.p(null, -11, null));
                return;
            default:
                super.onReceivedSslError(view, handler, error);
                return;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        int i10 = this.a;
        View view = null;
        Object obj = this.f11069b;
        switch (i10) {
            case 1:
                Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + webView);
                pd.c cVar = (pd.c) obj;
                if (cVar.f() == webView) {
                    Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                    cVar.f23594b = new ce.a(view);
                }
                webView.destroy();
                return true;
            case 2:
                Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + webView);
                yd.c cVar2 = (yd.c) obj;
                if (cVar2.e() == webView) {
                    Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                    cVar2.f28167b = new ce.a(view);
                }
                webView.destroy();
                return true;
            default:
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.p0.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
    }

    public /* synthetic */ p0(Object obj, int i10) {
        this.a = i10;
        this.f11069b = obj;
    }
}
