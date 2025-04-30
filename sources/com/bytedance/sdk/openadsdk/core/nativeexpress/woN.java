package com.bytedance.sdk.openadsdk.core.nativeexpress;

import Q7.n0;
import android.R;
import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.RCv;
import com.bytedance.sdk.openadsdk.core.model.vwr;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.utils.QUv;
import com.bytedance.sdk.openadsdk.utils.YhE;
import com.bytedance.sdk.openadsdk.utils.irS;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class woN extends com.bytedance.sdk.component.adexpress.COT.zp {
    private JSONObject Bj;
    private final com.bytedance.sdk.component.ku.ku FP;
    private RCv KVG;
    com.bytedance.sdk.openadsdk.utils.zp QR;
    private String YW;
    private ku cz;
    private final Map<String, com.com.bytedance.overseas.sdk.zp.KS> dQp;
    private com.bytedance.sdk.openadsdk.core.model.woN dT;
    private Context ku;
    private final Runnable ot;
    private volatile int pvr;
    private com.bytedance.sdk.openadsdk.lMd.dT rV;
    private String tG;
    private com.bytedance.sdk.openadsdk.lMd.KS.COT vDp;
    private woN.zp vwr;
    private com.bytedance.sdk.component.adexpress.lMd.QR woN;

    public woN(Context context, com.bytedance.sdk.component.adexpress.lMd.tG tGVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, com.bytedance.sdk.openadsdk.lMd.KS.COT cot, com.bytedance.sdk.openadsdk.core.model.woN won) {
        super(context, tGVar, themeStatusBroadcastReceiver);
        this.dQp = n0.q();
        this.pvr = 0;
        this.FP = new com.bytedance.sdk.component.ku.ku("webviewrender_template") { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.woN.1
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.component.adexpress.COT.zp) woN.this).HWF.get()) {
                    return;
                }
                if ((woN.this.dT instanceof vwr) && ((vwr) woN.this.dT).THm()) {
                    woN.this.lMd(true);
                }
                woN won2 = woN.this;
                won2.Bj = won2.Bj().KS();
                woN won3 = woN.this;
                won3.zp(won3.Bj);
                if (woN.this.dT != null && woN.this.dT.fRl() != null) {
                    woN won4 = woN.this;
                    ((com.bytedance.sdk.component.adexpress.COT.zp) won4).COT = com.bytedance.sdk.component.adexpress.zp.lMd.lMd.KS(won4.dT.fRl().COT());
                }
                if (woN.this.pvr == 0) {
                    woN.this.woN();
                }
                com.bytedance.sdk.openadsdk.core.tG.KS().post(woN.this.ot);
            }
        };
        this.ot = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.woN.2
            @Override // java.lang.Runnable
            public void run() {
                if (!((com.bytedance.sdk.component.adexpress.COT.zp) woN.this).HWF.get() && woN.this.woN != null) {
                    woN.this.vDp();
                    woN won2 = woN.this;
                    woN.super.zp(won2.woN);
                }
            }
        };
        if (this.KS == null) {
            return;
        }
        this.ku = context;
        this.YW = tGVar.jU();
        this.dT = won;
        this.vDp = cot;
        themeStatusBroadcastReceiver.zp(this);
        woN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vwr() {
        SSWebView sSWebView = this.KS;
        if (sSWebView == null || sSWebView.getWebView() == null || this.pvr == 2) {
            return;
        }
        this.tG = zp(this.dT);
        this.KS.setDisplayZoomControls(false);
        zp(irS.zp(this.tG));
        tG();
        RCv rCv = new RCv(this.ku);
        this.KVG = rCv;
        rCv.jU(true);
        rV();
        this.pvr = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void woN() {
        if (this.KS.getWebView() != null && QUv.COT()) {
            vwr();
        } else {
            this.pvr = 1;
            QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.woN.3
                @Override // java.lang.Runnable
                public void run() {
                    woN.this.vwr();
                }
            });
        }
    }

    public RCv KVG() {
        return this.KVG;
    }

    public ku dQp() {
        return this.cz;
    }

    public void rV() {
        SSWebView sSWebView = this.KS;
        if (sSWebView != null && sSWebView.getWebView() != null) {
            this.KS.setBackgroundColor(0);
            this.KS.setBackgroundResource(R.color.transparent);
            zp(this.KS);
            if (zp() != null) {
                this.rV = new com.bytedance.sdk.openadsdk.lMd.dT(this.dT, zp().getWebView()).zp(false);
            }
            this.rV.zp(this.vDp);
            ku kuVar = new ku(this.ku, this.KVG, this.dT, this.rV);
            this.cz = kuVar;
            this.KS.setWebViewClient(kuVar);
            this.KS.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.zp.jU(this.KVG, this.rV));
            com.bytedance.sdk.component.adexpress.COT.COT.zp().zp(this.KS, this.KVG);
        }
    }

    public void tG() {
        com.bytedance.sdk.openadsdk.core.model.woN won = this.dT;
        if (won != null && won.fRl() != null) {
            this.vwr = this.dT.fRl();
        }
    }

    public void vDp() {
        RCv rCv;
        SSWebView sSWebView = this.KS;
        if (sSWebView != null && sSWebView.getWebView() != null && (rCv = this.KVG) != null) {
            rCv.lMd(this.KS).zp(this.dT).KS(this.dT.fgJ()).jU(this.dT.GP()).lMd(YhE.zp(this.YW)).COT(this.dT.dm()).zp(this).zp(this.Bj).zp(this.KS).zp(this.vDp);
        }
    }

    private void KS(boolean z8) {
        if (this.KVG != null && this.KS != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adVisible", z8);
                this.KVG.zp("expressAdShow", jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.COT.zp
    public void HWF() {
        if (zp() == null) {
            return;
        }
        try {
            zp().getWebView().resumeTimers();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.COT.zp
    public void QR() {
        RCv rCv = this.KVG;
        if (rCv == null) {
            return;
        }
        rCv.zp("expressWebviewRecycle", (JSONObject) null);
    }

    @Override // com.bytedance.sdk.component.adexpress.COT.zp
    public void YW() {
        super.YW();
        com.bytedance.sdk.openadsdk.utils.zp COT = com.bytedance.sdk.openadsdk.core.rV.zp().COT();
        this.QR = COT;
        COT.zp(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.COT.zp
    public void dT() {
        super.dT();
        com.bytedance.sdk.openadsdk.utils.zp zpVar = this.QR;
        if (zpVar != null) {
            zpVar.lMd(this);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.COT.zp
    public void jU() {
        if (this.HWF.get()) {
            return;
        }
        RCv rCv = this.KVG;
        if (rCv != null) {
            rCv.lMd();
            this.KVG.Bj();
            this.KVG = null;
        }
        com.bytedance.sdk.openadsdk.lMd.dT dTVar = this.rV;
        if (dTVar != null) {
            dTVar.KS(false);
        }
        super.jU();
        com.bytedance.sdk.openadsdk.core.tG.KS().removeCallbacks(this.ot);
        this.dQp.clear();
    }

    @Override // com.bytedance.sdk.component.adexpress.COT.zp
    public void ku() {
        super.ku();
        if (this.KVG == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("expressShow", true);
            this.KVG.zp("expressShow", jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.COT.zp
    public void lMd(int i9) {
        if (i9 == this.jU) {
            return;
        }
        this.jU = i9;
        KS(i9 == 0);
    }

    public static boolean lMd(String str) {
        return "banner_call".equals(str) || "banner_ad".equals(str) || "slide_banner_ad".equals(str) || "banner_ad_landingpage".equals(str);
    }

    public static String zp(com.bytedance.sdk.openadsdk.core.model.woN won) {
        woN.zp fRl;
        return com.bytedance.sdk.component.adexpress.zp.lMd.lMd.jU((won == null || (fRl = won.fRl()) == null) ? null : fRl.vDp());
    }

    @Override // com.bytedance.sdk.component.adexpress.COT.zp, com.bytedance.sdk.component.adexpress.lMd.jU
    public void zp(com.bytedance.sdk.component.adexpress.lMd.QR qr) {
        this.woN = qr;
        QUv.lMd(this.FP);
    }

    private void zp(SSWebView sSWebView) {
        if (sSWebView == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.core.widget.zp.KS.zp(this.ku).zp(false).zp(sSWebView.getWebView());
            sSWebView.setVerticalScrollBarEnabled(false);
            sSWebView.setHorizontalScrollBarEnabled(false);
            sSWebView.zp(true);
            sSWebView.dT();
            sSWebView.setUserAgentString(com.bytedance.sdk.openadsdk.utils.dQp.zp(sSWebView.getWebView(), 6003));
            sSWebView.setMixedContentMode(0);
            sSWebView.setJavaScriptEnabled(true);
            sSWebView.setJavaScriptCanOpenWindowsAutomatically(true);
            sSWebView.setDomStorageEnabled(true);
            sSWebView.setDatabaseEnabled(true);
            sSWebView.setAppCacheEnabled(true);
            sSWebView.setAllowFileAccess(false);
            sSWebView.setSupportZoom(true);
            sSWebView.setBuiltInZoomControls(true);
            sSWebView.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            sSWebView.setUseWideViewPort(true);
        } catch (Exception e4) {
            com.bytedance.sdk.component.utils.tG.zp("TTAD.WebViewRender", e4.toString());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.COT.zp
    public SSWebView zp() {
        return this.KS;
    }

    @Override // com.bytedance.sdk.component.adexpress.theme.zp
    public void zp(int i9) {
        if (this.KVG == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, i9);
        } catch (JSONException unused) {
        }
        this.KVG.zp("themeChange", jSONObject);
    }

    @Override // com.bytedance.sdk.component.adexpress.COT.zp, com.bytedance.sdk.component.adexpress.lMd.Bj
    public void zp(com.bytedance.sdk.component.adexpress.lMd.rV rVVar) {
        super.zp(rVVar);
        if (this.lMd) {
            com.bytedance.sdk.component.utils.ku.lMd().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.woN.4
                @Override // java.lang.Runnable
                public void run() {
                    WebView webView = ((com.bytedance.sdk.component.adexpress.COT.zp) woN.this).KS.getWebView();
                    if (webView != null) {
                        webView.resumeTimers();
                    }
                }
            }, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        }
    }
}
