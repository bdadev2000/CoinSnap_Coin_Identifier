package com.bytedance.sdk.openadsdk.core.qsH;

import a4.j;
import android.R;
import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.hQ;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.bytedance.sdk.openadsdk.utils.mn;
import com.bytedance.sdk.openadsdk.utils.pq;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class VOe extends com.bytedance.sdk.component.adexpress.wN.YFl {
    private Context DSW;
    private hQ EH;
    private com.bytedance.sdk.openadsdk.AlY.eT GA;
    private com.bytedance.sdk.openadsdk.core.model.Wwa NjR;
    private volatile int Wwa;
    private String YoT;
    private final com.bytedance.sdk.component.qsH.qsH aIu;
    private com.bytedance.sdk.openadsdk.AlY.AlY.wN eT;
    private Wwa.YFl lG;

    /* renamed from: nc, reason: collision with root package name */
    private JSONObject f10722nc;
    private final Map<String, com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.vc> pDU;
    private nc qO;
    private String qsH;
    private com.bytedance.sdk.component.adexpress.Sg.DSW rkt;

    /* renamed from: vc, reason: collision with root package name */
    com.bytedance.sdk.openadsdk.utils.YFl f10723vc;
    private final Runnable wXo;

    public VOe(Context context, com.bytedance.sdk.component.adexpress.Sg.GA ga2, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, com.bytedance.sdk.openadsdk.AlY.AlY.wN wNVar, com.bytedance.sdk.openadsdk.core.model.Wwa wwa) {
        super(context, ga2, themeStatusBroadcastReceiver);
        this.pDU = j.r();
        this.Wwa = 0;
        this.aIu = new com.bytedance.sdk.component.qsH.qsH("webviewrender_template") { // from class: com.bytedance.sdk.openadsdk.core.qsH.VOe.1
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.component.adexpress.wN.YFl) VOe.this).wN.get()) {
                    return;
                }
                if ((VOe.this.NjR instanceof com.bytedance.sdk.openadsdk.core.model.qO) && ((com.bytedance.sdk.openadsdk.core.model.qO) VOe.this.NjR).Wm()) {
                    VOe.this.Sg(true);
                }
                VOe vOe = VOe.this;
                vOe.f10722nc = vOe.eT().tN();
                VOe vOe2 = VOe.this;
                vOe2.YFl(vOe2.f10722nc);
                if (VOe.this.Wwa == 0) {
                    VOe.this.lG();
                }
                com.bytedance.sdk.openadsdk.core.pDU.tN().post(VOe.this.wXo);
            }
        };
        this.wXo = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.qsH.VOe.2
            @Override // java.lang.Runnable
            public void run() {
                if (!((com.bytedance.sdk.component.adexpress.wN.YFl) VOe.this).wN.get() && VOe.this.rkt != null) {
                    VOe.this.YoT();
                    VOe vOe = VOe.this;
                    VOe.super.YFl(vOe.rkt);
                }
            }
        };
        if (this.tN == null) {
            return;
        }
        this.DSW = context;
        this.qsH = ga2.AlY();
        this.NjR = wwa;
        this.eT = wNVar;
        themeStatusBroadcastReceiver.YFl(this);
        lG();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Wwa() {
        com.bytedance.sdk.component.NjR.AlY alY = this.tN;
        if (alY == null || alY.getWebView() == null || this.Wwa == 2) {
            return;
        }
        this.YoT = YFl(this.NjR);
        this.tN.setDisplayZoomControls(false);
        YFl(pq.YFl(this.YoT));
        GA();
        hQ hQVar = new hQ(this.DSW);
        this.EH = hQVar;
        hQVar.AlY(true);
        pDU();
        this.Wwa = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lG() {
        if (this.tN.getWebView() != null && mn.wN()) {
            Wwa();
        } else {
            this.Wwa = 1;
            mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.qsH.VOe.3
                @Override // java.lang.Runnable
                public void run() {
                    VOe.this.Wwa();
                }
            });
        }
    }

    public nc EH() {
        return this.qO;
    }

    public void GA() {
        com.bytedance.sdk.openadsdk.core.model.Wwa wwa = this.NjR;
        if (wwa != null && wwa.lu() != null) {
            this.lG = this.NjR.lu();
        }
    }

    public void YoT() {
        hQ hQVar;
        com.bytedance.sdk.component.NjR.AlY alY = this.tN;
        if (alY != null && alY.getWebView() != null && (hQVar = this.EH) != null) {
            hQVar.Sg(this.tN).YFl(this.NjR).tN(this.NjR.zz()).AlY(this.NjR.uGS()).Sg(Sco.YFl(this.qsH)).wN(this.NjR.cC()).YFl(this).YFl(this.f10722nc).YFl(this.tN).YFl(this.eT);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.theme.YFl
    public void onThemeChanged(int i10) {
        if (this.EH == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, i10);
        } catch (JSONException unused) {
        }
        this.EH.YFl("themeChange", jSONObject);
    }

    public void pDU() {
        com.bytedance.sdk.component.NjR.AlY alY = this.tN;
        if (alY != null && alY.getWebView() != null) {
            this.tN.setBackgroundColor(0);
            this.tN.setBackgroundResource(R.color.transparent);
            YFl(this.tN);
            if (YFl() != null) {
                this.GA = new com.bytedance.sdk.openadsdk.AlY.eT(this.NjR, YFl().getWebView()).YFl(false);
            }
            this.GA.YFl(this.eT);
            nc ncVar = new nc(this.DSW, this.EH, this.NjR, this.GA, eT());
            this.qO = ncVar;
            this.tN.setWebViewClient(ncVar);
            this.tN.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.YFl.AlY(this.EH, this.GA));
            com.bytedance.sdk.component.adexpress.wN.wN.YFl().YFl(this.tN, this.EH);
        }
    }

    public hQ rkt() {
        return this.EH;
    }

    public static boolean Sg(String str) {
        return "banner_call".equals(str) || "banner_ad".equals(str) || "slide_banner_ad".equals(str) || "banner_ad_landingpage".equals(str);
    }

    @Override // com.bytedance.sdk.component.adexpress.wN.YFl
    public void AlY() {
        if (this.wN.get()) {
            return;
        }
        super.AlY();
        hQ hQVar = this.EH;
        if (hQVar != null) {
            hQVar.Sg();
            this.EH.eT();
            this.EH = null;
        }
        com.bytedance.sdk.openadsdk.AlY.eT eTVar = this.GA;
        if (eTVar != null) {
            eTVar.tN(false);
        }
        com.bytedance.sdk.openadsdk.core.pDU.tN().removeCallbacks(this.wXo);
        this.pDU.clear();
    }

    @Override // com.bytedance.sdk.component.adexpress.wN.YFl
    public void DSW() {
        hQ hQVar = this.EH;
        if (hQVar == null) {
            return;
        }
        hQVar.YFl("expressWebviewRecycle", (JSONObject) null);
    }

    @Override // com.bytedance.sdk.component.adexpress.wN.YFl
    public void NjR() {
        super.NjR();
        com.bytedance.sdk.openadsdk.utils.YFl wN = com.bytedance.sdk.openadsdk.core.EH.YFl().wN();
        this.f10723vc = wN;
        wN.YFl(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.wN.YFl
    public void nc() {
        super.nc();
        com.bytedance.sdk.openadsdk.utils.YFl yFl = this.f10723vc;
        if (yFl != null) {
            yFl.Sg(this);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.wN.YFl
    public void qsH() {
        super.qsH();
        if (this.EH == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("expressShow", true);
            this.EH.YFl("expressShow", jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.wN.YFl, com.bytedance.sdk.component.adexpress.Sg.AlY
    public int tN() {
        return this.NjR.UZM();
    }

    @Override // com.bytedance.sdk.component.adexpress.wN.YFl
    public void vc() {
        if (YFl() == null) {
            return;
        }
        try {
            YFl().getWebView().resumeTimers();
        } catch (Exception unused) {
        }
    }

    private void tN(boolean z10) {
        if (this.EH != null && this.tN != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adVisible", z10);
                this.EH.YFl("expressAdShow", jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    public static String YFl(com.bytedance.sdk.openadsdk.core.model.Wwa wwa) {
        return com.bytedance.sdk.component.adexpress.YFl.Sg.Sg.AlY((wwa == null || !wwa.mB()) ? null : "v3");
    }

    @Override // com.bytedance.sdk.component.adexpress.wN.YFl, com.bytedance.sdk.component.adexpress.Sg.AlY
    public void YFl(com.bytedance.sdk.component.adexpress.Sg.DSW dsw) {
        this.rkt = dsw;
        mn.Sg(this.aIu);
    }

    private void YFl(com.bytedance.sdk.component.NjR.AlY alY) {
        if (alY == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.core.widget.YFl.tN.YFl(this.DSW).YFl(false).YFl(alY.getWebView());
            alY.setVerticalScrollBarEnabled(false);
            alY.setHorizontalScrollBarEnabled(false);
            alY.YFl(com.bytedance.sdk.openadsdk.aIu.YFl.YFl("clear_web_cache", true));
            alY.nc();
            alY.setUserAgentString(com.bytedance.sdk.openadsdk.utils.rkt.YFl(alY.getWebView(), BuildConfig.VERSION_CODE));
            alY.setMixedContentMode(0);
            alY.setJavaScriptEnabled(true);
            alY.setJavaScriptCanOpenWindowsAutomatically(true);
            alY.setDomStorageEnabled(true);
            alY.setDatabaseEnabled(true);
            alY.setAppCacheEnabled(true);
            alY.setAllowFileAccess(false);
            alY.setSupportZoom(true);
            alY.setBuiltInZoomControls(true);
            alY.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            alY.setUseWideViewPort(true);
            alY.setCacheMode(-1);
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.YoT.YFl("TTAD.WebViewRender", e2.toString());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.wN.YFl
    public com.bytedance.sdk.component.NjR.AlY YFl() {
        return this.tN;
    }

    @Override // com.bytedance.sdk.component.adexpress.wN.YFl
    public void YFl(int i10) {
        if (i10 == this.AlY) {
            return;
        }
        this.AlY = i10;
        tN(i10 == 0);
    }

    @Override // com.bytedance.sdk.component.adexpress.wN.YFl, com.bytedance.sdk.component.adexpress.Sg.eT
    public void YFl(com.bytedance.sdk.component.adexpress.Sg.pDU pdu) {
        super.YFl(pdu);
        if (this.Sg) {
            com.bytedance.sdk.component.utils.DSW.Sg().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.qsH.VOe.4
                @Override // java.lang.Runnable
                public void run() {
                    WebView webView = ((com.bytedance.sdk.component.adexpress.wN.YFl) VOe.this).tN.getWebView();
                    if (webView != null) {
                        webView.resumeTimers();
                    }
                }
            }, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        }
    }
}
