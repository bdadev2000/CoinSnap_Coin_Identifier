package com.meta.analytics.dsp.uinode;

import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class P7 extends WebViewClient {
    public static byte[] A01;
    public static String[] A02 = {"hfMJ0frXuRQdVVGg5HhbkedMp84qvG2m", "353suYezQm1X4xGGmKd", "JSegO1TQToLz4SD5sG2", "wzs2neDsiDlXGMSMfb3", "O6PuLNBrYuNMqKQgURK12L6N", "9iUPqfJGnhoj94eJuJeS1Wm6njk1Rmvr", "BdwoSzPq3MvWa04biSMwYNzp8DFOBLqT", "enVVpEgx3aC4K8YdK2hdvlOQVko"};
    public final /* synthetic */ PB A00;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 124);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{3, 4, Ascii.DC2, 2, 17, 8, Ascii.SI, 19, 8, Ascii.SO, Ascii.CR, -11, -6, -11, -44, 3, -14, 4, -7, Ascii.CR, Ascii.SUB, Ascii.SUB, Ascii.ETB, Ascii.SUB, -21, Ascii.ETB, Ascii.FF, Ascii.CR, 48, 43, 64, 51, 45, 57, 56, -8, 51, 45, 57, 39, 51, 51, 47, Ascii.RS, 36, 49, 49, 46, 49, 71, 73, 64, 70, 73, 64, 75, 80, -4, -7, -13};
    }

    static {
        A01();
    }

    public P7(PB pb) {
        this.A00 = pb;
    }

    private void A02(int i9, String str, String str2, boolean z8) {
        JA ja;
        C1636Yn c1636Yn;
        C1391Oy c1391Oy;
        if (z8) {
            this.A00.A0S();
        }
        ja = this.A00.A0D;
        ja.A04(J9.A0Q, null);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(19, 9, 44), i9);
            jSONObject.put(A00(0, 11, 35), str);
            jSONObject.put(A00(57, 3, 11), str2);
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        c1636Yn = this.A00.A0B;
        c1636Yn.A0E().A5P(jSONObject2);
        c1391Oy = this.A00.A0E;
        c1391Oy.A04(C8A.A16, jSONObject2);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        JA ja;
        C1636Yn c1636Yn;
        long j7;
        P9 p9;
        P9 p92;
        ja = this.A00.A0D;
        ja.A04(J9.A0R, null);
        c1636Yn = this.A00.A0B;
        C0S A0E = c1636Yn.A0E();
        j7 = this.A00.A00;
        A0E.A5Q(C1294Lf.A01(j7));
        this.A00.A0S();
        this.A00.A06 = true;
        this.A00.A0E();
        p9 = this.A00.A03;
        if (p9 == null) {
            return;
        }
        p92 = this.A00.A03;
        p92.ADk();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i9, String str, String str2) {
        super.onReceivedError(webView, i9, str, str2);
        if (Build.VERSION.SDK_INT < 23) {
            A02(i9, str, str2, true);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        int errorCode = webResourceError.getErrorCode();
        StringBuilder sb = new StringBuilder();
        String A00 = A00(0, 0, 48);
        A02(errorCode, sb.append(A00).append((Object) webResourceError.getDescription()).toString(), A00 + webResourceRequest.getUrl(), true);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        int i9;
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceRequest.getUrl().toString().toLowerCase(Locale.US).contains(A00(28, 11, 78))) {
            return;
        }
        if (webResourceResponse != null) {
            i9 = webResourceResponse.getStatusCode();
        } else {
            i9 = -1;
        }
        A02(i9, A00(39, 10, 67), A00(0, 0, 48) + webResourceRequest.getUrl(), false);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        C1636Yn c1636Yn;
        AbstractC1739b5 abstractC1739b5;
        PA pa;
        PA pa2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(11, 8, 21), renderProcessGoneDetail.didCrash());
            jSONObject.put(A00(49, 8, 91), renderProcessGoneDetail.rendererPriorityAtExit());
        } catch (JSONException unused) {
        }
        String message = jSONObject.toString();
        c1636Yn = this.A00.A0B;
        c1636Yn.A0E().A5L(message);
        abstractC1739b5 = this.A00.A09;
        PC.A04(abstractC1739b5.A0S());
        pa = this.A00.A04;
        if (pa == null) {
            return true;
        }
        pa2 = this.A00.A04;
        String[] strArr = A02;
        String message2 = strArr[1];
        if (message2.length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        A02[0] = "kv0KfCNN1XAdbICEJBZwu3dTiw7XNBbg";
        pa2.ACl();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        C1636Yn c1636Yn;
        C09416c c09416c;
        PN pn;
        AbstractC1739b5 abstractC1739b5;
        c1636Yn = this.A00.A0B;
        c09416c = this.A00.A0A;
        pn = this.A00.A0H;
        abstractC1739b5 = this.A00.A09;
        return PP.A00(c1636Yn, c09416c, webResourceRequest, pn, abstractC1739b5.A0f());
    }
}
