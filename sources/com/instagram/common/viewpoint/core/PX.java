package com.instagram.common.viewpoint.core;

import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class PX extends WebViewClient {
    public static byte[] A01;
    public static String[] A02 = {"", "6FWFK2Rjg5lzc4YxuKyAM2pjdKcDgsPX", "X8DXQa0II", "SNpKLA", "Qdf29haAswqAmNE65waVoEZq7xKg2wdQ", "zoYtBkcpJPqvxBhZCETS8Gv12yQPTvJi", "ExNOaNYHlEOFqs215y0dlBgemejMJNEa", "gJ6ZUqdzTjndwEo8cFEFcqem1uRbclUa"};
    public final /* synthetic */ C0772Pb A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            int i6 = copyOfRange[i5] ^ i4;
            if (A02[5].charAt(10) != 'q') {
                throw new RuntimeException();
            }
            A02[5] = "pKC7szj5R0qBwTmNDTYZuLrnbbbgOopj";
            copyOfRange[i5] = (byte) (i6 ^ 33);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{98, 99, 117, 101, 116, 111, 118, 114, 111, 105, 104, 124, 113, 124, 91, 106, 121, 107, 112, 6, 17, 17, 12, 17, 32, 12, 7, 6, 90, 93, 74, 85, 95, 83, 82, 18, 85, 95, 83, 13, 17, 17, 21, 58, 0, 23, 23, 10, 23, 19, 17, 10, 12, 17, 10, 23, 26, 106, 109, 115};
    }

    static {
        A01();
    }

    public PX(C0772Pb c0772Pb) {
        this.A00 = c0772Pb;
    }

    private void A02(int i2, String str, String str2, boolean z2) {
        JF jf;
        C1045Zs c1045Zs;
        PO po;
        if (z2) {
            this.A00.A0S();
        }
        jf = this.A00.A0D;
        jf.A04(JE.A0Q, null);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(19, 9, 66), i2);
            jSONObject.put(A00(0, 11, 39), str);
            jSONObject.put(A00(57, 3, 62), str2);
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        c1045Zs = this.A00.A0B;
        c1045Zs.A0E().A5l(jSONObject2);
        po = this.A00.A0E;
        po.A04(C8E.A16, jSONObject2);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        JF jf;
        C1045Zs c1045Zs;
        long j2;
        PZ pz;
        PZ pz2;
        jf = this.A00.A0D;
        jf.A04(JE.A0R, null);
        c1045Zs = this.A00.A0B;
        C0S A0E = c1045Zs.A0E();
        j2 = this.A00.A00;
        A0E.A5m(C0687Lu.A01(j2));
        this.A00.A0S();
        this.A00.A06 = true;
        this.A00.A0E();
        pz = this.A00.A03;
        if (pz == null) {
            return;
        }
        pz2 = this.A00.A03;
        pz2.AED();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i2, String str, String str2) {
        super.onReceivedError(webView, i2, str, str2);
        if (Build.VERSION.SDK_INT < 23) {
            A02(i2, str, str2, true);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        int errorCode = webResourceError.getErrorCode();
        StringBuilder sb = new StringBuilder();
        String A00 = A00(0, 0, 93);
        A02(errorCode, sb.append(A00).append((Object) webResourceError.getDescription()).toString(), A00 + webResourceRequest.getUrl(), true);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        int i2;
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceRequest.getUrl().toString().toLowerCase(Locale.US).contains(A00(28, 11, 29))) {
            return;
        }
        if (webResourceResponse != null) {
            i2 = webResourceResponse.getStatusCode();
        } else {
            i2 = -1;
        }
        A02(i2, A00(39, 10, 68), A00(0, 0, 93) + webResourceRequest.getUrl(), false);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        C1045Zs c1045Zs;
        AbstractC1187cD abstractC1187cD;
        InterfaceC0771Pa interfaceC0771Pa;
        InterfaceC0771Pa interfaceC0771Pa2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(11, 8, 57), renderProcessGoneDetail.didCrash());
            jSONObject.put(A00(49, 8, 66), renderProcessGoneDetail.rendererPriorityAtExit());
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        c1045Zs = this.A00.A0B;
        String message = A02[5];
        if (message.charAt(10) == 'q') {
            A02[3] = "cKmn9F08G0LbJgt48cswTZGSotGQ5jj";
            c1045Zs.A0E().A5h(jSONObject2);
            abstractC1187cD = this.A00.A09;
            AbstractC0773Pc.A04(abstractC1187cD.A0l());
            interfaceC0771Pa = this.A00.A04;
            if (interfaceC0771Pa != null) {
                interfaceC0771Pa2 = this.A00.A04;
                interfaceC0771Pa2.ADE();
            }
            String message2 = A02[5];
            if (message2.charAt(10) == 'q') {
                A02[3] = "Jr1n";
                return true;
            }
        }
        throw new RuntimeException();
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        C1045Zs c1045Zs;
        C03226f c03226f;
        C0784Pn c0784Pn;
        AbstractC1187cD abstractC1187cD;
        c1045Zs = this.A00.A0B;
        c03226f = this.A00.A0A;
        c0784Pn = this.A00.A0H;
        abstractC1187cD = this.A00.A09;
        return C0786Pp.A00(c1045Zs, c03226f, webResourceRequest, c0784Pn, abstractC1187cD.A10());
    }
}
