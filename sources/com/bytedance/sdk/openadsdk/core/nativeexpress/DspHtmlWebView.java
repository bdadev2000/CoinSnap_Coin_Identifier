package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.lMd;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class DspHtmlWebView extends SSWebView implements lMd.KS {
    private lMd Bj;
    private KVG COT;
    private KS HWF;
    AtomicBoolean KS;
    private com.bytedance.sdk.openadsdk.core.model.woN QR;
    private int YW;
    private List<String> dT;
    AtomicBoolean jU;
    private String ku;
    protected boolean lMd;
    private long tG;
    private int vDp;
    protected boolean zp;

    /* loaded from: classes.dex */
    public interface lMd {
        void c_();

        View lMd();

        View zp();

        void zp(int i9, int i10);

        void zp(View view, int i9);
    }

    /* loaded from: classes.dex */
    public static class zp extends SSWebView.zp {
        public static final Set<String> zp = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.zp.1
            {
                add(".jpeg");
                add(".png");
                add(".bmp");
                add(".gif");
                add(".jpg");
                add(".webp");
            }
        };
        lMd.KS lMd;

        public zp(lMd.KS ks) {
            this.lMd = ks;
        }

        private void zp(String str) {
            int lastIndexOf;
            lMd.KS ks;
            if (!TextUtils.isEmpty(str) && (lastIndexOf = str.lastIndexOf(".")) > 0) {
                if (!zp.contains(str.substring(lastIndexOf).toLowerCase()) || (ks = this.lMd) == null) {
                    return;
                }
                ks.lMd(str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            lMd.KS ks = this.lMd;
            if (ks != null) {
                ks.zp();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i9, String str, String str2) {
            super.onReceivedError(webView, i9, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (webResourceRequest != null && webResourceResponse != null && webResourceRequest.getUrl() != null) {
                if (webResourceRequest.isForMainFrame()) {
                    zp(webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode(), "");
                }
                zp(webResourceRequest.getUrl().toString());
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            this.lMd.zp(str);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
                return;
            }
            zp(webResourceRequest.getUrl().toString());
        }

        private void zp(String str, int i9, String str2) {
            lMd.KS ks = this.lMd;
            if (ks != null) {
                ks.zp(106, i9);
            }
        }
    }

    public DspHtmlWebView(Context context) {
        super(context);
        this.zp = false;
        this.lMd = false;
        this.KS = new AtomicBoolean(false);
        this.jU = new AtomicBoolean(false);
        this.YW = 0;
    }

    private void woN() {
        if (this.dT == null) {
            com.bytedance.sdk.openadsdk.lMd.KS.lMd(this.QR, this.ku, "dsp_html_success_url", (JSONObject) null);
        } else {
            com.bytedance.sdk.openadsdk.lMd.KS.zp(new com.bytedance.sdk.component.ku.ku("dsp_html_error_url") { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (DspHtmlWebView.this.dT != null && DspHtmlWebView.this.jU.compareAndSet(false, true)) {
                            JSONObject jSONObject = new JSONObject();
                            JSONArray jSONArray = new JSONArray();
                            Iterator it = DspHtmlWebView.this.dT.iterator();
                            while (it.hasNext()) {
                                jSONArray.put((String) it.next());
                            }
                            jSONObject.put("url", jSONArray);
                            com.bytedance.sdk.openadsdk.lMd.KS.lMd(DspHtmlWebView.this.QR, DspHtmlWebView.this.ku, "dsp_html_error_url", jSONObject);
                            DspHtmlWebView.this.dT = null;
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public void KVG() {
        String str;
        this.KS.set(false);
        String HaA = this.QR.HaA();
        if (TextUtils.isEmpty(HaA)) {
            return;
        }
        String zp2 = com.bytedance.sdk.openadsdk.core.QR.COT.zp(HaA);
        if (TextUtils.isEmpty(zp2)) {
            str = HaA;
        } else {
            str = zp2;
        }
        this.YW = 0;
        zp(null, str, "text/html", "UTF-8", null);
        this.tG = SystemClock.elapsedRealtime();
    }

    public void dQp() {
        lMd lmd = this.Bj;
        if (lmd != null) {
            lmd.c_();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("render_duration", SystemClock.elapsedRealtime() - this.tG);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.lMd.KS.lMd(this.QR, this.ku, "render_html_success", jSONObject);
    }

    @Override // com.bytedance.sdk.component.widget.SSWebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.zp) {
            this.HWF.zp(getWebView());
        }
    }

    @Override // com.bytedance.sdk.component.widget.SSWebView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("rate", this.vDp / 100.0f);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.lMd.KS.lMd(this.QR, this.ku, "load_rate", jSONObject);
        this.HWF.zp();
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i9) {
        boolean z8;
        super.onVisibilityChanged(view, i9);
        if (i9 == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.lMd = z8;
        this.HWF.zp(z8);
    }

    @Override // com.bytedance.sdk.component.widget.SSWebView
    public void vDp() {
        super.vDp();
        this.HWF.lMd();
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.lMd.KS
    public void lMd(String str) {
        if (this.dT == null) {
            this.dT = new ArrayList();
        }
        this.dT.add(str);
    }

    public void zp(com.bytedance.sdk.openadsdk.core.model.woN won, lMd lmd, String str) {
        this.Bj = lmd;
        this.QR = won;
        this.ku = str;
        this.HWF = new KS();
        this.COT = new KVG(getContext());
        setWebViewClient(new zp(this));
        setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.1
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i9) {
                DspHtmlWebView.this.vDp = i9;
                super.onProgressChanged(webView, i9);
                if (i9 >= 100) {
                    DspHtmlWebView.this.zp();
                }
            }
        });
        com.bytedance.sdk.component.utils.ku.lMd().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.2
            @Override // java.lang.Runnable
            @SuppressLint({"ClickableViewAccessibility"})
            public void run() {
                WebView webView = DspHtmlWebView.this.getWebView();
                if (webView != null) {
                    webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.2.1
                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            DspHtmlWebView.this.COT.onTouchEvent(motionEvent);
                            return false;
                        }
                    });
                }
            }
        });
    }

    /* loaded from: classes.dex */
    public static class KS {
        protected int zp = 0;
        private com.bytedance.sdk.openadsdk.core.QR.HWF lMd = com.bytedance.sdk.openadsdk.core.QR.HWF.zp();

        public void lMd() {
            zp();
        }

        public void zp(WebView webView) {
            if (webView != null && this.zp == 0) {
                if (this.lMd == null) {
                    this.lMd = com.bytedance.sdk.openadsdk.core.QR.HWF.zp();
                }
                this.lMd.zp(webView);
                this.lMd.lMd();
                this.zp = 1;
            }
        }

        public void zp(boolean z8) {
            com.bytedance.sdk.openadsdk.core.QR.HWF hwf;
            if (this.zp == 1 && z8 && (hwf = this.lMd) != null) {
                hwf.KS();
                this.zp = 3;
            }
        }

        public void zp(@Nullable View view, @Nullable FriendlyObstructionPurpose friendlyObstructionPurpose) {
            com.bytedance.sdk.openadsdk.core.QR.HWF hwf = this.lMd;
            if (hwf != null) {
                hwf.zp(view, friendlyObstructionPurpose);
            }
        }

        public void zp() {
            com.bytedance.sdk.openadsdk.core.QR.HWF hwf;
            int i9 = this.zp;
            if (i9 != 0 && i9 != 4 && (hwf = this.lMd) != null) {
                hwf.jU();
            }
            this.zp = 4;
            this.lMd = null;
        }
    }

    public void zp(@Nullable View view, @Nullable FriendlyObstructionPurpose friendlyObstructionPurpose) {
        this.HWF.zp(view, friendlyObstructionPurpose);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.lMd.KS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void zp(java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.zp(java.lang.String):void");
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.lMd.KS
    public void zp(int i9, int i10) {
        lMd lmd = this.Bj;
        if (lmd != null) {
            lmd.zp(i9, i10);
        }
        this.YW = i10;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("error_code", i10);
            jSONObject.put("render_duration", SystemClock.elapsedRealtime() - this.tG);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.lMd.KS.lMd(this.QR, this.ku, "render_html_fail", jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.lMd.KS
    public void zp() {
        if (this.KS.compareAndSet(false, true)) {
            this.zp = true;
            this.HWF.zp(getWebView());
            this.HWF.zp(this.lMd);
            dQp();
            woN();
        }
    }
}
