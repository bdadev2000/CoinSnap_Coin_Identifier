package com.bytedance.sdk.openadsdk.qO.YFl;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.ConsoleMessage;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.NjR.AlY;
import com.bytedance.sdk.component.YFl.vc;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.AlY.lG;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.YoT.wN;
import com.bytedance.sdk.openadsdk.core.NjR;
import com.bytedance.sdk.openadsdk.core.hQ;
import com.bytedance.sdk.openadsdk.core.model.Ne;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.widget.eT;
import com.bytedance.sdk.openadsdk.core.widget.nc;
import com.bytedance.sdk.openadsdk.qO.DSW;
import com.bytedance.sdk.openadsdk.qO.qsH;
import com.bytedance.sdk.openadsdk.qO.tN;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.bytedance.sdk.openadsdk.utils.rkt;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class YFl {
    private final FrameLayout AlY;
    private hQ DSW;
    private volatile boolean GA;
    private final String NjR;
    private final Wwa Sg;
    private final Context YFl;

    @Nullable
    private wN eT;
    private com.bytedance.sdk.openadsdk.core.Sg.YFl lG;

    /* renamed from: nc, reason: collision with root package name */
    private qsH f10787nc;
    private volatile boolean pDU;
    private final String qsH;
    private nc rkt;
    private final int tN;

    /* renamed from: vc, reason: collision with root package name */
    private AlY f10788vc;

    @Nullable
    private eT wN;
    private boolean YoT = true;
    private AtomicBoolean EH = new AtomicBoolean(false);

    public YFl(Context context, Wwa wwa, int i10, boolean z10, FrameLayout frameLayout) {
        this.YFl = context;
        this.Sg = wwa;
        this.tN = i10;
        this.qsH = Sco.tN(wwa.pq().getDurationSlotType());
        this.NjR = Ne.GA(wwa);
        this.AlY = frameLayout;
        YFl(frameLayout);
        DSW();
        Sg(z10);
        qsH();
    }

    private void DSW() {
        HashMap hashMap = new HashMap();
        hashMap.put("click_scence", 3);
        this.DSW = new hQ(this.YFl);
        this.DSW.Sg(this.f10788vc).YFl(this.Sg).tN(this.Sg.zz()).AlY(this.Sg.uGS()).Sg(Sco.YFl(this.qsH)).wN(this.Sg.cC()).YFl(this.f10788vc).Sg(this.qsH).YFl(hashMap).YFl(new lG(3, this.qsH, this.Sg));
    }

    private void Sg(boolean z10) {
        com.bytedance.sdk.component.YFl.lG YFl;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(BidResponsedEx.KEY_CID, this.Sg.zz());
            jSONObject.put("log_extra", this.Sg.uGS());
        } catch (Throwable unused) {
        }
        if (NjR.Sg().lG()) {
            DSW.YFl(new DSW.YFl() { // from class: com.bytedance.sdk.openadsdk.qO.YFl.YFl.1
                @Override // com.bytedance.sdk.openadsdk.qO.DSW.YFl
                public void YFl(String str, String str2, Throwable th2) {
                    YoT.YFl(str, str2, th2);
                }
            });
        }
        qsH YFl2 = qsH.YFl(com.bytedance.sdk.openadsdk.core.lG.YFl(), this.f10788vc.getWebView(), new tN() { // from class: com.bytedance.sdk.openadsdk.qO.YFl.YFl.2
            @Override // com.bytedance.sdk.openadsdk.qO.tN
            public void YFl(String str, JSONObject jSONObject2) {
                if (YFl.this.DSW != null) {
                    YFl.this.DSW.YFl(str, jSONObject2);
                }
            }
        }, new com.bytedance.sdk.openadsdk.qO.YFl() { // from class: com.bytedance.sdk.openadsdk.qO.YFl.YFl.3
            @Override // com.bytedance.sdk.openadsdk.qO.YFl
            public void Sg() {
                YFl.this.DSW.tN(true);
                if (YFl.this.eT != null) {
                    YFl.this.eT.YFl();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.qO.YFl
            public com.bytedance.sdk.openadsdk.qO.AlY YFl() {
                String vc2 = com.bytedance.sdk.openadsdk.common.YFl.vc();
                vc2.getClass();
                char c10 = 65535;
                switch (vc2.hashCode()) {
                    case 1653:
                        if (vc2.equals("2g")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case 1684:
                        if (vc2.equals("3g")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 1715:
                        if (vc2.equals("4g")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 1746:
                        if (vc2.equals("5g")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 3649301:
                        if (vc2.equals("wifi")) {
                            c10 = 4;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        return com.bytedance.sdk.openadsdk.qO.AlY.TYPE_2G;
                    case 1:
                        return com.bytedance.sdk.openadsdk.qO.AlY.TYPE_3G;
                    case 2:
                        return com.bytedance.sdk.openadsdk.qO.AlY.TYPE_4G;
                    case 3:
                        return com.bytedance.sdk.openadsdk.qO.AlY.TYPE_5G;
                    case 4:
                        return com.bytedance.sdk.openadsdk.qO.AlY.TYPE_WIFI;
                    default:
                        return com.bytedance.sdk.openadsdk.qO.AlY.TYPE_UNKNOWN;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.qO.YFl
            public void YFl(JSONObject jSONObject2) {
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("is_new_playable", 1);
                    jSONObject2.put("pag_json_data", jSONObject3.toString());
                } catch (JSONException e2) {
                    YoT.YFl("PlayableManager", e2.getMessage());
                }
                com.bytedance.sdk.openadsdk.AlY.tN.Sg(YFl.this.Sg, YFl.this.qsH, "playable_track", jSONObject2);
            }

            @Override // com.bytedance.sdk.openadsdk.qO.YFl
            public void YFl(int i10, String str) {
                YFl.this.YoT = false;
                if (i10 == 2 || i10 == 3 || i10 == 4) {
                    YFl.this.YFl(2, i10);
                } else if (i10 == 5) {
                    YFl.this.YFl(3, i10);
                } else {
                    YFl.this.YFl(1, 0);
                }
            }
        });
        this.f10787nc = YFl2;
        YFl2.DSW(this.NjR).wN(com.bytedance.sdk.openadsdk.common.YFl.YFl(com.bytedance.sdk.openadsdk.core.lG.YFl())).Sg(com.bytedance.sdk.openadsdk.common.YFl.wN()).YFl(com.bytedance.sdk.openadsdk.common.YFl.YFl()).AlY(com.bytedance.sdk.openadsdk.common.YFl.AlY()).tN(jSONObject).tN(Ne.eT(this.Sg)).AlY(true).YFl(z10).tN(false).YFl(Ne.aIu(this.Sg)).Sg(Ne.aIu(this.Sg)).YFl("sdkEdition", com.bytedance.sdk.openadsdk.common.YFl.tN()).wN(Ne.vc(this.Sg)).vc(this.qsH);
        this.f10787nc.YFl(com.bytedance.sdk.openadsdk.qO.wN.Sg(this.YFl));
        qsH qsh = this.f10787nc;
        if (qsh != null) {
            Set<String> eT = qsh.eT();
            final WeakReference weakReference = new WeakReference(this.f10787nc);
            for (String str : eT) {
                if (!"subscribe_app_ad".equals(str) && !"adInfo".equals(str) && !"webview_time_track".equals(str) && !"download_app_ad".equals(str) && (YFl = this.DSW.YFl()) != null) {
                    YFl.YFl(str, new com.bytedance.sdk.component.YFl.wN<JSONObject, JSONObject>() { // from class: com.bytedance.sdk.openadsdk.qO.YFl.YFl.4
                        @Override // com.bytedance.sdk.component.YFl.wN
                        public JSONObject YFl(@NonNull JSONObject jSONObject2, @NonNull vc vcVar) {
                            try {
                                qsH qsh2 = (qsH) weakReference.get();
                                if (qsh2 == null) {
                                    return null;
                                }
                                return qsh2.AlY(YFl(), jSONObject2);
                            } catch (Throwable unused2) {
                                return null;
                            }
                        }
                    });
                }
            }
        }
    }

    private void qsH() {
        this.f10788vc.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.YFl.wN(com.bytedance.sdk.openadsdk.core.lG.YFl(), this.DSW, this.Sg.zz(), null, true) { // from class: com.bytedance.sdk.openadsdk.qO.YFl.YFl.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.wN, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                if (YFl.this.f10787nc != null) {
                    YFl.this.f10787nc.NjR(str);
                }
                if (YFl.this.YoT) {
                    YFl.this.YFl(0, 0);
                    com.bytedance.sdk.openadsdk.AlY.tN.YFl(System.currentTimeMillis(), YFl.this.Sg, YFl.this.qsH, "py_loading_success");
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.wN, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i10, String str, String str2) {
                super.onReceivedError(webView, i10, str, str2);
                YFl.this.YoT = false;
                if (YFl.this.f10787nc != null) {
                    YFl.this.f10787nc.vc(com.bytedance.sdk.openadsdk.core.GA.tN.YFl.YFl().YFl(YFl.this.Sg));
                    YFl.this.f10787nc.YFl(i10, str, str2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.wN, android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                if (webResourceRequest.isForMainFrame()) {
                    YFl.this.YoT = false;
                    if (YFl.this.f10787nc != null) {
                        YFl.this.f10787nc.vc(com.bytedance.sdk.openadsdk.core.GA.tN.YFl.YFl().YFl(YFl.this.Sg));
                        YFl.this.f10787nc.YFl(webResourceRequest.isForMainFrame(), webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode());
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.wN, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                try {
                    if (YFl.this.Sg.BPI() != null && !TextUtils.isEmpty(YFl.this.Sg.BPI().f23464i)) {
                        if (YFl.this.f10787nc != null) {
                            YFl.this.f10787nc.nc(str);
                        }
                        String GA = Ne.GA(YFl.this.Sg);
                        WebResourceResponse YFl = com.bytedance.sdk.openadsdk.core.GA.tN.YFl.YFl().YFl(YFl.this.Sg.BPI().f23464i, GA, str);
                        if (YFl != null) {
                            Log.d("PreloadWebViewModel", "GeckoLog: hit++ ".concat(String.valueOf(str)));
                            if (YFl.this.f10787nc != null) {
                                YFl.this.f10787nc.eT(str);
                            }
                            return YFl;
                        }
                        Log.d("PreloadWebViewModel", "GeckoLog: hit no ".concat(String.valueOf(str)));
                        return super.shouldInterceptRequest(webView, str);
                    }
                    return super.shouldInterceptRequest(webView, str);
                } catch (Throwable unused) {
                    return super.shouldInterceptRequest(webView, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.wN, android.webkit.WebViewClient
            @RequiresApi(api = 23)
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                if (webResourceRequest.isForMainFrame()) {
                    YFl.this.YoT = false;
                    if (YFl.this.f10787nc == null || webResourceError == null) {
                        return;
                    }
                    YFl.this.f10787nc.vc(com.bytedance.sdk.openadsdk.core.GA.tN.YFl.YFl().YFl(YFl.this.Sg));
                    YFl.this.f10787nc.YFl(webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription()), String.valueOf(webResourceRequest.getUrl()));
                }
            }
        });
        this.f10788vc.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.YFl.AlY(this.DSW) { // from class: com.bytedance.sdk.openadsdk.qO.YFl.YFl.6
            @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.AlY, android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                return super.onConsoleMessage(consoleMessage);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.AlY, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i10) {
                super.onProgressChanged(webView, i10);
                if (YFl.this.wN != null && YFl.this.wN.getVisibility() == 0) {
                    YFl.this.wN.setProgress(i10);
                }
            }
        });
        com.bytedance.sdk.openadsdk.core.widget.YFl.tN.YFl(this.YFl).YFl(false).Sg(false).YFl(this.f10788vc.getWebView());
        AlY alY = this.f10788vc;
        alY.setUserAgentString(rkt.YFl(alY.getWebView(), BuildConfig.VERSION_CODE));
        this.f10788vc.setMixedContentMode(0);
    }

    public void AlY() {
        qsH qsh = this.f10787nc;
        if (qsh != null) {
            qsh.Sco();
        }
        AlY alY = this.f10788vc;
        if (alY != null) {
            alY.YoT();
        }
        hQ hQVar = this.DSW;
        if (hQVar != null) {
            hQVar.eT();
        }
        this.f10788vc = null;
    }

    public void tN() {
        qsH qsh;
        if (!this.EH.get() || (qsh = this.f10787nc) == null) {
            return;
        }
        qsh.tN(false);
    }

    public boolean vc() {
        hQ hQVar = this.DSW;
        if (hQVar != null) {
            return hQVar.wN();
        }
        return false;
    }

    public boolean wN() {
        return this.GA;
    }

    private void YFl(FrameLayout frameLayout) {
        AlY alY = new AlY(this.YFl);
        this.f10788vc = alY;
        alY.f_();
        this.f10788vc.setLayerType(2, null);
        this.f10788vc.setVisibility(4);
        this.f10788vc.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.f10788vc.setEnabled(true);
        this.f10788vc.setTag(this.qsH);
        this.f10788vc.setMaterialMeta(this.Sg.JT());
        this.f10788vc.setLandingPage(true);
        frameLayout.addView(this.f10788vc, new FrameLayout.LayoutParams(-1, -1));
        nc ncVar = new nc(this.YFl);
        this.rkt = ncVar;
        ncVar.YFl(this.Sg, this.qsH, this.lG);
        frameLayout.addView(this.rkt, new FrameLayout.LayoutParams(-1, -1));
        if (this.Sg.ww()) {
            eT eTVar = new eT(this.YFl);
            this.wN = eTVar;
            eTVar.Sg();
            frameLayout.addView(this.wN, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public void YFl(boolean z10, wN wNVar) {
        this.eT = wNVar;
        this.f10787nc.Sg(z10);
        com.bytedance.sdk.openadsdk.core.GA.tN.YFl.YFl().Sg(this.Sg);
        this.f10788vc.a_(this.NjR);
        qsH qsh = this.f10787nc;
        if (qsh != null) {
            qsh.vc(com.bytedance.sdk.openadsdk.core.GA.tN.YFl.YFl().YFl(this.Sg));
            this.f10787nc.qsH(this.NjR);
        }
    }

    public void YFl() {
        boolean z10;
        eT eTVar;
        if (this.EH.getAndSet(true)) {
            return;
        }
        this.AlY.setVisibility(0);
        if (!this.pDU && (eTVar = this.wN) != null) {
            eTVar.Sg(this.Sg, this.tN);
            qsH qsh = this.f10787nc;
            if (qsh != null) {
                qsh.Cfr();
            }
            z10 = true;
        } else {
            this.f10787nc.tN(true);
            z10 = false;
        }
        if (this.f10787nc != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("webview_state", this.f10787nc.mB());
                jSONObject2.put("has_loading", z10);
                jSONObject2.put("is_new_playable", 1);
                jSONObject.put("pag_json_data", jSONObject2.toString());
                jSONObject.put("playable_event", "start_show_plb");
            } catch (Throwable unused) {
            }
            com.bytedance.sdk.openadsdk.AlY.tN.Sg(this.Sg, this.qsH, "playable_track", jSONObject);
        }
        qsH qsh2 = this.f10787nc;
        if (qsh2 != null) {
            qsh2.vc(com.bytedance.sdk.openadsdk.core.GA.tN.YFl.YFl().YFl(this.Sg));
        }
        this.f10788vc.setVisibility(0);
    }

    public void Sg() {
        qsH qsh;
        if (!this.EH.get() || (qsh = this.f10787nc) == null) {
            return;
        }
        qsh.tN(true);
    }

    public void YFl(final int i10, final int i11) {
        if (this.pDU) {
            return;
        }
        this.pDU = true;
        if (i10 == 2) {
            this.GA = true;
            this.f10787nc.YFl(3);
        } else if (i10 == 1) {
            this.GA = true;
            this.f10787nc.YFl(2);
        } else if (i10 == 3) {
            this.GA = true;
            this.f10787nc.YFl(4);
        } else if (i10 == 0) {
            this.f10787nc.YFl(1);
        }
        if (this.EH.get()) {
            this.f10787nc.tN(true);
        }
        eT eTVar = this.wN;
        if (eTVar != null) {
            eTVar.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.qO.YFl.YFl.7
                @Override // java.lang.Runnable
                public void run() {
                    if (YFl.this.GA) {
                        YFl.this.rkt.setVisibility(0);
                        YFl.this.YFl(true);
                    }
                    YFl.this.wN.tN();
                    if (YFl.this.EH.get()) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("remove_loading_page_type", i10);
                            jSONObject2.put("remove_loading_page_reason", i11);
                            jSONObject2.put("playable_url", YFl.this.NjR);
                            jSONObject2.put("duration", YFl.this.wN.getDisplayDuration());
                            jSONObject2.put("is_new_playable", 1);
                            jSONObject.put("pag_json_data", jSONObject2.toString());
                            jSONObject.put("playable_event", "remove_loading_page");
                        } catch (Throwable unused) {
                        }
                        com.bytedance.sdk.openadsdk.AlY.tN.Sg(YFl.this.Sg, YFl.this.qsH, "playable_track", jSONObject);
                    }
                }
            });
        }
    }

    public void YFl(boolean z10) {
        qsH qsh = this.f10787nc;
        if (qsh != null) {
            qsh.YFl(z10);
        }
    }

    public void YFl(com.bytedance.sdk.openadsdk.core.Sg.YFl yFl) {
        this.lG = yFl;
        eT eTVar = this.wN;
        if (eTVar != null && eTVar.getDownloadButton() != null) {
            com.bytedance.sdk.openadsdk.core.wN.qsH downloadButton = this.wN.getDownloadButton();
            downloadButton.setOnClickListener(yFl);
            downloadButton.setOnTouchListener(yFl);
        }
        nc ncVar = this.rkt;
        if (ncVar != null) {
            ncVar.setClickListener(yFl);
        }
    }

    public static void YFl(Wwa wwa, JSONObject jSONObject) {
        if (jSONObject == null || wwa == null || !Ne.Sg(wwa) || !wwa.jqV()) {
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("is_new_playable", 1);
            jSONObject.put("pag_json_data", jSONObject2.toString());
        } catch (JSONException unused) {
        }
    }
}
