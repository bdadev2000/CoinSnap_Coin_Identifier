package com.meta.analytics.dsp.uinode;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.exoplayer2.common.base.Ascii;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class NV extends WebViewClient {
    public static byte[] A05;
    public NR A00 = new NR() { // from class: com.facebook.ads.redexgen.X.U2
        @Override // com.meta.analytics.dsp.uinode.NR
        public final boolean A9D(String str) {
            return NV.A04(str);
        }
    };
    public WeakReference<NT> A01 = new WeakReference<>(null);
    public final WeakReference<C1636Yn> A02;
    public final WeakReference<NS> A03;
    public final WeakReference<NO> A04;

    static {
        A01();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 97);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{54, 55, 68, 74, 73, Ascii.SI, 55, 65, 54, 67, 64, 39, 52, 37, 39, 41, 58, 47, 60, 47, 58, 63, 51, 64, 54, 68, 65, 59, 54, 0, 59, 64, 70, 55, 64, 70, 0, 51, 53, 70, 59, 65, 64, 0, 40, Ascii.ESC, Ascii.ETB, 41, 9, Ascii.SYN, Ascii.FF, Ascii.SUB, Ascii.ETB, 17, Ascii.FF, -42, 17, Ascii.SYN, Ascii.FS, Ascii.CR, Ascii.SYN, Ascii.FS, -42, Ascii.VT, 9, Ascii.FS, Ascii.CR, Ascii.SI, Ascii.ETB, Ascii.SUB, 33, -42, -22, -6, -9, -1, -5, -23, -22, -12, -19, 7, Ascii.ETB, Ascii.DC4, Ascii.FS, Ascii.CAN, 10, Ascii.ETB, 4, Ascii.VT, 6, 17, 17, 7, 6, 8, Ascii.DLE, 4, Ascii.SUB, Ascii.ETB, 17, -54, -57, -38, -57, 49, 54, 60, 45, 54, 60, -36, -39, -45, -95, -121, -30, -48, -51, -54, -31, -44, -48, -30};
    }

    public NV(WeakReference<C1636Yn> weakReference, WeakReference<NS> weakReference2, WeakReference<NO> weakReference3) {
        this.A02 = weakReference;
        this.A03 = weakReference2;
        this.A04 = weakReference3;
    }

    private void A02(String str, C1636Yn c1636Yn) {
        c1636Yn.A07().A9a(A00(11, 11, 101), C8A.A09, new C8B(A00(111, 5, 6) + str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x015d, code lost:
    
        if (r0.contains(r2) == false) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A03(android.webkit.WebView r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.NV.A03(android.webkit.WebView, java.lang.String):boolean");
    }

    public static /* synthetic */ boolean A04(String str) {
        return true;
    }

    public final void A05(NR nr) {
        this.A00 = nr;
    }

    public final void A06(WeakReference<NT> weakReference) {
        this.A01 = weakReference;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        NO timingLogger = this.A04.get();
        if (timingLogger != null) {
            timingLogger.A03();
        }
        NS ns = this.A03.get();
        if (ns != null) {
            ns.ACT(str);
        }
        NT nt = this.A01.get();
        if (nt != null) {
            nt.AAv(webView.canGoBack());
            nt.ABZ(webView.canGoForward());
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        NS listener = this.A03.get();
        if (listener != null) {
            listener.ACV(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i9, String str, String str2) {
        super.onReceivedError(webView, i9, str, str2);
        C1636Yn c1636Yn = this.A02.get();
        if (c1636Yn != null) {
            StringBuilder sb = new StringBuilder();
            String A00 = A00(0, 0, 27);
            String errorMessage = LH.A01(i9, sb.append(A00).append(str).toString(), A00 + str2);
            c1636Yn.A0E().A8h(errorMessage);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        C1636Yn c1636Yn = this.A02.get();
        if (c1636Yn != null) {
            int errorCode = webResourceError.getErrorCode();
            StringBuilder sb = new StringBuilder();
            String A00 = A00(0, 0, 27);
            String errorMessage = LH.A01(errorCode, sb.append(A00).append((Object) webResourceError.getDescription()).toString(), A00 + webResourceRequest.getUrl());
            c1636Yn.A0E().A8h(errorMessage);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        C1636Yn context = this.A02.get();
        if (context != null) {
            context.A0E().A8i();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        C1636Yn context = this.A02.get();
        if (context != null) {
            context.A0E().A8j();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        NY.A02(C8A.A2c);
        NS listener = this.A03.get();
        if (listener != null) {
            listener.ACs();
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return A03(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return A03(webView, str);
    }
}
