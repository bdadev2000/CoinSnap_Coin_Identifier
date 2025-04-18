package com.bytedance.sdk.openadsdk.core.qsH;

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
import com.bytedance.sdk.component.NjR.AlY;
import com.bytedance.sdk.openadsdk.core.qsH.tN;
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
public class wN extends com.bytedance.sdk.component.NjR.AlY implements tN.InterfaceC0130tN {
    AtomicBoolean AlY;
    private com.bytedance.sdk.openadsdk.core.model.Wwa DSW;
    private long GA;
    private int NjR;
    protected boolean Sg;
    protected boolean YFl;
    private int YoT;
    private Sg eT;

    /* renamed from: nc, reason: collision with root package name */
    private List<String> f10736nc;
    private String qsH;
    AtomicBoolean tN;

    /* renamed from: vc, reason: collision with root package name */
    private tN f10737vc;
    private Ne wN;

    /* loaded from: classes.dex */
    public interface Sg {
        View Sg();

        View YFl();

        void YFl(int i10, int i11);

        void YFl(View view, int i10);

        void e_();
    }

    /* loaded from: classes.dex */
    public static class YFl extends AlY.YFl {
        public static final Set<String> YFl = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.qsH.wN.YFl.1
            {
                add(".jpeg");
                add(".png");
                add(".bmp");
                add(".gif");
                add(".jpg");
                add(".webp");
            }
        };
        tN.InterfaceC0130tN Sg;

        public YFl(tN.InterfaceC0130tN interfaceC0130tN) {
            this.Sg = interfaceC0130tN;
        }

        private void YFl(String str) {
            int lastIndexOf;
            tN.InterfaceC0130tN interfaceC0130tN;
            if (!TextUtils.isEmpty(str) && (lastIndexOf = str.lastIndexOf(".")) > 0) {
                if (!YFl.contains(str.substring(lastIndexOf).toLowerCase()) || (interfaceC0130tN = this.Sg) == null) {
                    return;
                }
                interfaceC0130tN.Sg(str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            tN.InterfaceC0130tN interfaceC0130tN = this.Sg;
            if (interfaceC0130tN != null) {
                interfaceC0130tN.YFl();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (webResourceRequest != null && webResourceResponse != null && webResourceRequest.getUrl() != null) {
                if (webResourceRequest.isForMainFrame()) {
                    YFl(webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode(), "");
                }
                YFl(webResourceRequest.getUrl().toString());
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            this.Sg.YFl(str);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
                return;
            }
            YFl(webResourceRequest.getUrl().toString());
        }

        private void YFl(String str, int i10, String str2) {
            tN.InterfaceC0130tN interfaceC0130tN = this.Sg;
            if (interfaceC0130tN != null) {
                interfaceC0130tN.YFl(106, i10);
            }
        }
    }

    public wN(Context context) {
        super(context);
        this.YFl = false;
        this.Sg = false;
        this.tN = new AtomicBoolean(false);
        this.AlY = new AtomicBoolean(false);
        this.NjR = 0;
    }

    private void lG() {
        if (this.f10736nc == null) {
            com.bytedance.sdk.openadsdk.AlY.tN.Sg(this.DSW, this.qsH, "dsp_html_success_url", (JSONObject) null);
        } else {
            com.bytedance.sdk.openadsdk.AlY.tN.YFl(new com.bytedance.sdk.component.qsH.qsH("dsp_html_error_url") { // from class: com.bytedance.sdk.openadsdk.core.qsH.wN.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (wN.this.f10736nc != null && wN.this.AlY.compareAndSet(false, true)) {
                            JSONObject jSONObject = new JSONObject();
                            JSONArray jSONArray = new JSONArray();
                            Iterator it = wN.this.f10736nc.iterator();
                            while (it.hasNext()) {
                                jSONArray.put((String) it.next());
                            }
                            jSONObject.put("url", jSONArray);
                            com.bytedance.sdk.openadsdk.AlY.tN.Sg(wN.this.DSW, wN.this.qsH, "dsp_html_error_url", jSONObject);
                            wN.this.f10736nc = null;
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public void EH() {
        Sg sg2 = this.eT;
        if (sg2 != null) {
            sg2.e_();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("render_duration", SystemClock.elapsedRealtime() - this.GA);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.AlY.tN.Sg(this.DSW, this.qsH, "render_html_success", jSONObject);
    }

    @Override // com.bytedance.sdk.component.NjR.AlY
    public void YoT() {
        super.YoT();
        this.f10737vc.Sg();
    }

    @Override // com.bytedance.sdk.component.NjR.AlY, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.YFl) {
            this.f10737vc.YFl(getWebView());
        }
    }

    @Override // com.bytedance.sdk.component.NjR.AlY, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("rate", this.YoT / 100.0f);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.AlY.tN.Sg(this.DSW, this.qsH, "load_rate", jSONObject);
        this.f10737vc.YFl();
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i10) {
        boolean z10;
        super.onVisibilityChanged(view, i10);
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Sg = z10;
        this.f10737vc.YFl(z10);
    }

    public void rkt() {
        String str;
        this.tN.set(false);
        String PT = this.DSW.PT();
        if (TextUtils.isEmpty(PT)) {
            return;
        }
        String YFl2 = com.bytedance.sdk.openadsdk.core.YoT.wN.YFl(PT);
        if (TextUtils.isEmpty(YFl2)) {
            str = PT;
        } else {
            str = YFl2;
        }
        this.NjR = 0;
        YFl(null, str, "text/html", "UTF-8", null);
        this.GA = SystemClock.elapsedRealtime();
    }

    @Override // com.bytedance.sdk.openadsdk.core.qsH.tN.InterfaceC0130tN
    public void Sg(String str) {
        if (this.f10736nc == null) {
            this.f10736nc = new ArrayList();
        }
        this.f10736nc.add(str);
    }

    public void YFl(com.bytedance.sdk.openadsdk.core.model.Wwa wwa, Sg sg2, String str) {
        this.eT = sg2;
        this.DSW = wwa;
        this.qsH = str;
        this.f10737vc = new tN();
        this.wN = new Ne(getContext());
        setWebViewClient(new YFl(this));
        setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.core.qsH.wN.1
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i10) {
                wN.this.YoT = i10;
                super.onProgressChanged(webView, i10);
                if (i10 >= 100) {
                    wN.this.YFl();
                }
            }
        });
        com.bytedance.sdk.component.utils.DSW.Sg().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.qsH.wN.2
            @Override // java.lang.Runnable
            @SuppressLint({"ClickableViewAccessibility"})
            public void run() {
                WebView webView = wN.this.getWebView();
                if (webView != null) {
                    webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.qsH.wN.2.1
                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            wN.this.wN.onTouchEvent(motionEvent);
                            return false;
                        }
                    });
                }
            }
        });
    }

    /* loaded from: classes.dex */
    public static class tN {
        protected int YFl = 0;
        private com.bytedance.sdk.openadsdk.core.YoT.vc Sg = com.bytedance.sdk.openadsdk.core.YoT.vc.YFl();

        public void Sg() {
            YFl();
        }

        public void YFl(WebView webView) {
            if (webView != null && this.YFl == 0) {
                if (this.Sg == null) {
                    this.Sg = com.bytedance.sdk.openadsdk.core.YoT.vc.YFl();
                }
                this.Sg.YFl(webView);
                this.Sg.Sg();
                this.YFl = 1;
            }
        }

        public void YFl(boolean z10) {
            com.bytedance.sdk.openadsdk.core.YoT.vc vcVar;
            if (this.YFl == 1 && z10 && (vcVar = this.Sg) != null) {
                vcVar.tN();
                this.YFl = 3;
            }
        }

        public void YFl(@Nullable View view, @Nullable FriendlyObstructionPurpose friendlyObstructionPurpose) {
            com.bytedance.sdk.openadsdk.core.YoT.vc vcVar = this.Sg;
            if (vcVar != null) {
                vcVar.YFl(view, friendlyObstructionPurpose);
            }
        }

        public void YFl() {
            com.bytedance.sdk.openadsdk.core.YoT.vc vcVar;
            int i10 = this.YFl;
            if (i10 != 0 && i10 != 4 && (vcVar = this.Sg) != null) {
                vcVar.AlY();
            }
            this.YFl = 4;
            this.Sg = null;
        }
    }

    public void YFl(@Nullable View view, @Nullable FriendlyObstructionPurpose friendlyObstructionPurpose) {
        this.f10737vc.YFl(view, friendlyObstructionPurpose);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.sdk.openadsdk.core.qsH.tN.InterfaceC0130tN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void YFl(java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.qsH.wN.YFl(java.lang.String):void");
    }

    @Override // com.bytedance.sdk.openadsdk.core.qsH.tN.InterfaceC0130tN
    public void YFl(int i10, int i11) {
        Sg sg2 = this.eT;
        if (sg2 != null) {
            sg2.YFl(i10, i11);
        }
        this.NjR = i11;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("error_code", i11);
            jSONObject.put("render_duration", SystemClock.elapsedRealtime() - this.GA);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.AlY.tN.Sg(this.DSW, this.qsH, "render_html_fail", jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.qsH.tN.InterfaceC0130tN
    public void YFl() {
        if (this.tN.compareAndSet(false, true)) {
            this.YFl = true;
            this.f10737vc.YFl(getWebView());
            this.f10737vc.YFl(this.Sg);
            EH();
            lG();
        }
    }
}
