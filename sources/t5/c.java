package T5;

import G7.j;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.C1848k;
import com.facebook.internal.N;
import com.facebook.internal.O;
import com.facebook.r;
import com.mbridge.msdk.MBridgeConstans;
import d6.C2193c;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class c extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3024a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i9) {
        this.f3024a = i9;
        this.b = obj;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        ProgressDialog progressDialog;
        switch (this.f3024a) {
            case 1:
                j.e(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
                j.e(str, "url");
                super.onPageFinished(webView, str);
                O o3 = (O) this.b;
                if (!o3.l && (progressDialog = o3.f13598g) != null) {
                    progressDialog.dismiss();
                }
                FrameLayout frameLayout = o3.f13600i;
                if (frameLayout != null) {
                    frameLayout.setBackgroundColor(0);
                }
                N n2 = o3.f13597f;
                if (n2 != null) {
                    n2.setVisibility(0);
                }
                ImageView imageView = o3.f13599h;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                o3.m = true;
                return;
            default:
                super.onPageFinished(webView, str);
                return;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        ProgressDialog progressDialog;
        switch (this.f3024a) {
            case 1:
                j.e(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
                j.e(str, "url");
                j.j(str, "Webview loading URL: ");
                r rVar = r.f13801a;
                super.onPageStarted(webView, str, bitmap);
                O o3 = (O) this.b;
                if (!o3.l && (progressDialog = o3.f13598g) != null) {
                    progressDialog.show();
                    return;
                }
                return;
            default:
                super.onPageStarted(webView, str, bitmap);
                return;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i9, String str, String str2) {
        switch (this.f3024a) {
            case 1:
                j.e(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
                j.e(str, "description");
                j.e(str2, "failingUrl");
                super.onReceivedError(webView, i9, str, str2);
                ((O) this.b).e(new C1848k(str, i9, str2));
                return;
            default:
                super.onReceivedError(webView, i9, str, str2);
                return;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        switch (this.f3024a) {
            case 1:
                j.e(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
                j.e(sslErrorHandler, "handler");
                j.e(sslError, "error");
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                sslErrorHandler.cancel();
                ((O) this.b).e(new C1848k(null, -11, null));
                return;
            default:
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X5.a, java.lang.ref.WeakReference] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X5.a, java.lang.ref.WeakReference] */
    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        switch (this.f3024a) {
            case 0:
                Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + webView);
                e eVar = (e) this.b;
                if (eVar.f() == webView) {
                    Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                    eVar.b = new WeakReference(null);
                }
                webView.destroy();
                return true;
            case 1:
            default:
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
            case 2:
                Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + webView);
                C2193c c2193c = (C2193c) this.b;
                if (c2193c.e() == webView) {
                    Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                    c2193c.b = new WeakReference(null);
                }
                webView.destroy();
                return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bd  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean shouldOverrideUrlLoading(android.webkit.WebView r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T5.c.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
    }

    public c(O o3) {
        this.f3024a = 1;
        j.e(o3, "this$0");
        this.b = o3;
    }
}
