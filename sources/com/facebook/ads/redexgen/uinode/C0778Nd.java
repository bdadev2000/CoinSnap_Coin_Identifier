package com.facebook.ads.redexgen.uinode;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.vungle.ads.internal.protos.g;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.io.encoding.Base64;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Nd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0778Nd extends WebViewClient {
    public static byte[] A0B;
    public static String[] A0C = {"dutFbLT0SJ7F8tp2omMpyLiOAYVHs", "eQZAVGISCoayl61p0XGnY6zF77MwgQ", "oGFUl4XXjxY0ysGh9uHTM5Bs0jmGzYfS", "nw1FzUJk4sGWtK2y2h7dLK31U1IoYOTN", "MQohGS04hBsrr", "rz5lEB2hDVgjaI0SM6Y5mQ12Lmz2ba", "Gakm8d7sZsS0Gn2hVSl3GYNL92Z8TRo6", "Ty7sQNcmLenaFb4R0BQbvtPuiVx7Fgst"};
    public Date A00;
    public boolean A01 = false;
    public final C1070Yn A02;
    public final WeakReference<C0949Ts> A03;
    public final WeakReference<InterfaceC0776Nb> A04;
    public final WeakReference<AtomicBoolean> A05;
    public final WeakReference<C0729Lg> A06;
    public final WeakReference<RE> A07;
    public final AtomicInteger A08;
    public final AtomicReference<String> A09;
    public final boolean A0A;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 74);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0B = new byte[]{92, 126, 124, 119, 122, 50, 92, 112, 113, 107, 109, 112, 115, 83, 114, 121, 126, 114, 115, 55, 4, 19, Ascii.RS, 7, 19, 6, Ascii.ESC, Ascii.FS, Ascii.NAK, 82, 39, 32, 59, 82, 34, 19, 6, Ascii.SUB, 82, Ascii.DC4, Ascii.GS, 0, 82, 52, Ascii.ESC, Ascii.RS, Ascii.ETB, 82, 51, 17, 17, Ascii.ETB, 1, 1, 82, 71, 122, 118, 112, 99, 34, 102, 99, 118, 99, 56, 34, 53, 41, 41, 45, 93, 56, Ascii.SI, Ascii.SI, Ascii.DC2, Ascii.SI, 53, Ascii.SO, 19, 1, 6, 5, 64, 50, 5, 17, Ascii.NAK, 5, 19, Ascii.DC4, 64, 6, Ascii.SI, Ascii.DC2, 64, 38, 9, Ascii.FF, 5, 64, 33, 3, 3, 5, 19, 19, 64, 49, 10, Ascii.ETB, 5, 2, 1, 68, 54, 1, Ascii.NAK, 17, 1, Ascii.ETB, Ascii.DLE, 68, 2, Ascii.VT, Ascii.SYN, 68, 34, Ascii.CR, 8, 1, 68, 37, 7, 7, 1, Ascii.ETB, Ascii.ETB, 68, 0, 1, 10, Ascii.CR, 1, 0, 98, 99, 104, 111, 99, 98, 89, 115, 116, 111, 89, 118, 103, 114, 110, 33, 54, 54, 43, 54, Ascii.ESC, 39, 43, 32, 33, Ascii.DLE, 7, 7, Ascii.SUB, 7, 42, 17, Ascii.DLE, 6, Ascii.SYN, 7, Ascii.FS, 5, 1, Ascii.FS, Ascii.SUB, Ascii.ESC, 40, 47, 56, 39, 45, 33, 32, 96, 39, 45, 33, 126, 113, 116, 125, 99, 121, 85, 125, 111, 104, 85, 120, 111, 121, 101, Byte.MAX_VALUE, 120, 105, 111, 85, 111, 120, 120, 101, 120, 102, 101, 107, 110, 99, 100, 109, 85, 126, 99, 103, 111, 85, 99, 100, 85, 103, 99, 102, 102, 99, 121, Ascii.DC2, Ascii.EM, 8, 70, 70, 57, 46, 46, 35, 57, 49, 44, 40, 37, 35, 46, 57, 47, 44, 51, 50, 47, 57, 2, 3, 65, Ascii.US, Ascii.CAN, 3, Ascii.RS, 9, 58, 45, 57, Base64.padSymbol, 45, 59, 60, Ascii.ETB, 33, 44, Ascii.GS, Ascii.FF, 17, Ascii.GS, 70, Ascii.EM, 5, 8, 0, 7, 6, 17, Ascii.FS, Ascii.EM, Ascii.DC4, 47, 0, 17, 4, Ascii.CAN, Ascii.GS, Ascii.SI, 8, 53, Ascii.FS, 3, Ascii.SI, Ascii.GS};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static boolean A0A(String str, List<String> list) {
        String lowerCase = str.toLowerCase(Locale.getDefault());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (lowerCase.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    static {
        A02();
    }

    public C0778Nd(C1070Yn c1070Yn, WeakReference<InterfaceC0776Nb> weakReference, WeakReference<RE> weakReference2, WeakReference<C0729Lg> weakReference3, WeakReference<AtomicBoolean> checkAssetsByJavascriptBridge, WeakReference<C0949Ts> weakReference4, AtomicInteger atomicInteger, AtomicReference<String> requestId, boolean z10) {
        this.A02 = c1070Yn;
        this.A04 = weakReference;
        this.A07 = weakReference2;
        this.A06 = weakReference3;
        this.A05 = checkAssetsByJavascriptBridge;
        this.A03 = weakReference4;
        this.A08 = atomicInteger;
        this.A09 = requestId;
        this.A0A = z10;
    }

    private WebResourceResponse A00() {
        return new WebResourceResponse(A01(286, 10, 35), StandardCharsets.UTF_8.name(), 403, A01(13, 6, 93), Collections.singletonMap(A01(0, 13, 85), A01(268, 8, 38)), new ByteArrayInputStream(A01(13, 6, 93).getBytes()));
    }

    private void A03(int i10, CharSequence charSequence, long j3) {
        JSONObject jSONObject = new JSONObject();
        boolean z10 = charSequence != null;
        try {
            jSONObject.put(A01(160, 10, 14), i10);
            jSONObject.put(A01(170, 17, 63), charSequence);
            jSONObject.put(A01(202, 21, 64), z10);
            jSONObject.put(A01(g.STALE_CACHED_RESPONSE_VALUE, 22, 64), j3);
            jSONObject.put(A01(276, 10, 2), this.A09.get());
        } catch (JSONException unused) {
        }
        this.A02.A07().A9a(A01(306, 8, 32), C8A.A2d, new C8B(AdErrorType.WEB_VIEW_FAILED_TO_LOAD.getDefaultErrorMessage(), A01(55, 12, 72) + jSONObject.toString()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(int i10, String str) {
        if (A01(245, 23, 54).equals(str)) {
            this.A02.A0E().AH5();
            return;
        }
        this.A02.A0E().AH6(i10, str);
        Date finishTime = new Date();
        long time = finishTime.getTime();
        Date finishTime2 = this.A00;
        A03(i10, str, time - finishTime2.getTime());
        if (this.A04.get() != null) {
            this.A04.get().ABW(i10, str);
        }
    }

    private final void A05(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (webResourceRequest.getUrl().toString().toLowerCase(Locale.US).contains(A01(187, 11, 4))) {
            return;
        }
        this.A02.A0E().AHA(webResourceResponse.getStatusCode(), LH.A01(webResourceResponse.getStatusCode(), A01(67, 10, 55), A01(0, 0, 49) + webResourceRequest.getUrl()));
    }

    private void A07(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A01(145, 15, 76), str);
            jSONObject.put(A01(296, 10, 58), str2);
            jSONObject.put(A01(276, 10, 2), this.A09.get());
        } catch (JSONException unused) {
        }
        C1070Yn c1070Yn = this.A02;
        if (c1070Yn != null) {
            c1070Yn.A07().A9a(A01(306, 8, 32), C8A.A2a, new C8B(AdErrorType.WEB_VIEW_CACHE_FILE_WAS_DENIED.getDefaultErrorMessage(), A01(55, 12, 72) + jSONObject.toString()));
        }
    }

    private boolean A08(Uri uri) {
        String str;
        String path = uri.getPath();
        String scheme = uri.getScheme();
        if (path != null && scheme != null) {
            String A01 = A01(198, 4, 82);
            String path2 = A0C[4];
            if (path2.length() != 8) {
                A0C[6] = "e0NZ0IpncKNbspdHVbaE77hYKi1pXgCT";
                if (scheme.equals(A01)) {
                    if (BuildConfigApi.isDebug()) {
                        StringBuilder sb2 = new StringBuilder();
                        String path3 = A01(19, 36, 56);
                        sb2.append(path3).append(path).toString();
                    }
                    List<String> A09 = C03756c.A09(this.A02);
                    boolean A0A = A0A(path, A09);
                    if (!A0A) {
                        if (BuildConfigApi.isDebug()) {
                            StringBuilder sb3 = new StringBuilder();
                            String path4 = A01(77, 31, 42);
                            sb3.append(path4).append(path).toString();
                        }
                        str = C0949Ts.A0H;
                        String path5 = A01(108, 37, 46);
                        Log.w(str, path5);
                        String path6 = A09.toString();
                        A07(path, path6);
                    }
                    return A0A;
                }
            }
            throw new RuntimeException();
        }
        String scheme2 = A0C[7];
        if (scheme2.charAt(29) != 'S') {
            A0C[2] = "yXDUwGubOAV6buqiBYARa4GXiUTiAdtJ";
            return true;
        }
        throw new RuntimeException();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.A02.A0E().AH7(this.A03.get() != null);
        if (this.A03.get() != null && this.A05.get() != null && !this.A05.get().get()) {
            this.A03.get().A0F();
        }
        this.A01 = true;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.A02.A0E().AH8();
        this.A00 = new Date();
        new Handler().postDelayed(new C0950Tt(this), this.A08.get());
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        this.A01 = true;
        A04(i10, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        boolean A0u = C0659Ih.A0u(this.A02);
        String A01 = A01(0, 0, 49);
        if (A0u || webResourceRequest.isForMainFrame()) {
            this.A01 = true;
            A04(webResourceError.getErrorCode(), A01 + ((Object) webResourceError.getDescription()));
        } else {
            this.A02.A0E().AH9(LH.A01(webResourceError.getErrorCode(), A01 + ((Object) webResourceError.getDescription()), A01 + webResourceRequest.getUrl()));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        A05(webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.A02.A0E().AHB();
        sslErrorHandler.cancel();
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        NY.A02(C8A.A2Z);
        InterfaceC0776Nb adWebViewListener = this.A04.get();
        if (adWebViewListener != null) {
            adWebViewListener.ADj();
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest.getUrl();
        if (this.A0A && !A08(url)) {
            WebResourceResponse A00 = A00();
            A05(webResourceRequest, A00);
            return A00;
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (this.A04.get() != null) {
            this.A04.get().AB4(str, new C0783Ni().A03(this.A07.get()).A02(this.A06.get()).A05());
            return true;
        }
        return true;
    }
}
