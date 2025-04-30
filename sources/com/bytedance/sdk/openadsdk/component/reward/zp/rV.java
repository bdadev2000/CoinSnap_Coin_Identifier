package com.bytedance.sdk.openadsdk.component.reward.zp;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.DownloadListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.adexpress.jU.ku;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.RCv;
import com.bytedance.sdk.openadsdk.core.irS;
import com.bytedance.sdk.openadsdk.core.lMd.KS;
import com.bytedance.sdk.openadsdk.core.lMd.lMd;
import com.bytedance.sdk.openadsdk.core.model.cz;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.lMd.KS;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.YhE;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.o;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class rV implements com.bytedance.sdk.openadsdk.YW.QR {
    private boolean BO;
    private final String Bj;
    com.bytedance.sdk.openadsdk.lMd.dT COT;
    private int DY;
    private boolean FP;
    private long Gzh;
    private boolean Iv;
    private SSWebView KVG;
    private float Lij;
    private boolean Pxi;
    private float RCv;
    private long Rg;
    private boolean UPs;
    private String Vjb;
    private com.bytedance.sdk.openadsdk.common.QR WNy;
    private boolean cz;
    private int dQp;

    @NonNull
    private final woN dT;
    private com.bytedance.sdk.openadsdk.core.widget.zp.COT eWG;
    private final com.bytedance.sdk.openadsdk.component.reward.zp.zp fRl;
    private boolean fs;
    private String gH;
    protected String jU;
    protected com.bytedance.sdk.openadsdk.lMd.KS.COT ku;
    RCv lMd;
    private boolean oKZ;
    private boolean ot;
    private View ox;
    private boolean qtv;
    private ILoader rCC;
    private int rV;
    private final boolean tG;
    private int vDp;
    private SSWebView woN;
    private View yRU;
    RCv zp;
    protected boolean KS = true;
    private boolean vwr = false;
    private final AtomicBoolean pvr = new AtomicBoolean(true);
    int HWF = 0;
    String QR = "";
    boolean YW = false;
    private SparseArray<KS.zp> irS = new SparseArray<>();
    private boolean QUv = true;
    private float cW = -1.0f;
    private float YhE = -1.0f;
    private boolean ffE = false;
    private long aax = -1;
    private volatile int si = 0;
    private int Rh = -1;
    private volatile int MBR = 0;
    private volatile int oB = 0;
    private long fgJ = 0;
    private int GP = -1;

    /* loaded from: classes.dex */
    public static class KS implements com.bytedance.sdk.openadsdk.YW.YW {
        private final SSWebView zp;

        @Override // com.bytedance.sdk.openadsdk.YW.YW
        public void lMd() {
            SSWebView sSWebView = this.zp;
            if (sSWebView == null) {
                return;
            }
            sSWebView.rV();
        }

        @Override // com.bytedance.sdk.openadsdk.YW.YW
        public void zp() {
            SSWebView sSWebView = this.zp;
            if (sSWebView == null) {
                return;
            }
            sSWebView.Bj();
        }

        private KS(SSWebView sSWebView) {
            this.zp = sSWebView;
        }
    }

    /* loaded from: classes.dex */
    public interface jU {
        void zp(WebView webView, int i9);

        void zp(WebView webView, String str);

        void zp(WebView webView, String str, Bitmap bitmap);
    }

    /* loaded from: classes.dex */
    public static class lMd implements com.bytedance.sdk.openadsdk.YW.zp {
        private final View zp;

        public lMd(View view) {
            this.zp = view;
        }

        @Override // com.bytedance.sdk.openadsdk.YW.zp
        public int lMd() {
            int i9;
            View view = this.zp;
            if (view != null) {
                i9 = view.getMeasuredWidth();
            } else {
                i9 = -1;
            }
            if (i9 <= 0) {
                return WNy.KS(KVG.zp());
            }
            return i9;
        }

        @Override // com.bytedance.sdk.openadsdk.YW.zp
        public int zp() {
            int i9;
            View view = this.zp;
            if (view != null) {
                i9 = view.getMeasuredHeight();
            } else {
                i9 = -1;
            }
            if (i9 <= 0) {
                return WNy.jU(KVG.zp());
            }
            return i9;
        }
    }

    public rV(com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar) {
        this.fRl = zpVar;
        this.dT = zpVar.zp;
        this.Bj = zpVar.QR;
        this.tG = zpVar.HWF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void BO() {
        this.Pxi = true;
        this.fs = false;
        this.fRl.qtv.removeMessages(600);
        this.fRl.qtv.removeMessages(700);
        this.fRl.Rh.jU(false);
        this.fRl.cW.set(true);
        this.fRl.Vjb.KVG();
        this.dT.IhO();
        if (!this.dT.IhO() && YhE.ku(cz.zp(this.dT))) {
            View dT = this.fRl.rCC.dT();
            View.OnClickListener onClickListener = (View.OnClickListener) dT.getTag(dT.getId());
            if (onClickListener != null) {
                zp zpVar = new zp(this.fRl, dT, onClickListener);
                dT.setOnClickListener(zpVar);
                dT.setOnTouchListener(zpVar);
            }
        }
    }

    private void Iv() {
        this.lMd.zp("showPlayableEndCardOverlay", (JSONObject) null);
        this.fRl.qtv.sendEmptyMessageDelayed(600, 1000L);
        this.fRl.qtv.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.rV.4
            @Override // java.lang.Runnable
            public void run() {
                rV.this.BO();
            }
        }, 1000L);
        com.bytedance.sdk.openadsdk.utils.Bj bj = this.fRl.fs;
        if (bj != null) {
            bj.zp(0L);
        }
    }

    private com.bytedance.sdk.openadsdk.lMd.KS.COT aax() {
        int i9;
        String str;
        if (cz.lMd(this.dT)) {
            i9 = 3;
        } else {
            i9 = 2;
        }
        if (this.tG) {
            str = "rewarded_video";
        } else {
            str = "fullscreen_interstitial_ad";
        }
        return new com.bytedance.sdk.openadsdk.lMd.KVG(i9, str, this.dT);
    }

    public static /* synthetic */ int dQp(rV rVVar) {
        int i9 = rVVar.si;
        rVVar.si = i9 + 1;
        return i9;
    }

    public static /* synthetic */ int rV(rV rVVar) {
        int i9 = rVVar.oB;
        rVVar.oB = i9 + 1;
        return i9;
    }

    public static /* synthetic */ int vDp(rV rVVar) {
        int i9 = rVVar.MBR;
        rVVar.MBR = i9 + 1;
        return i9;
    }

    public void Pxi() {
        com.bytedance.sdk.openadsdk.lMd.dT dTVar = this.COT;
        if (dTVar != null) {
            dTVar.COT();
        }
    }

    public void UPs() {
        com.bytedance.sdk.openadsdk.lMd.KS.lMd(this.dT, this.Bj, "use_second_endcard", (JSONObject) null);
        this.BO = true;
        this.aax = SystemClock.elapsedRealtime();
        try {
            this.zp.zp("click_endcard_close", (JSONObject) null);
        } catch (Exception unused) {
        }
        this.fRl.fs.zp(r0.cz);
    }

    public void WNy() {
        WNy.zp((View) this.woN, 8);
    }

    public void YhE() {
        WNy.zp((View) this.KVG, 0);
        WNy.zp((View) this.woN, 8);
    }

    public boolean cW() {
        RCv rCv = this.zp;
        if (rCv == null) {
            return false;
        }
        return rCv.ku();
    }

    public boolean eWG() {
        SSWebView sSWebView = this.KVG;
        if (sSWebView != null && sSWebView.getWebView() != null) {
            return false;
        }
        return true;
    }

    public boolean fRl() {
        if (this.cz && this.pvr.get()) {
            return true;
        }
        return false;
    }

    public boolean ffE() {
        return this.fs;
    }

    public boolean oKZ() {
        return this.Pxi;
    }

    public RCv Bj() {
        return this.lMd;
    }

    public String FP() {
        return this.QR;
    }

    public boolean Gzh() {
        return this.YW;
    }

    public boolean KVG() {
        return this.pvr.get();
    }

    public void Lij() {
        com.bytedance.sdk.openadsdk.lMd.dT dTVar = this.COT;
        if (dTVar != null) {
            dTVar.zp(System.currentTimeMillis());
        }
    }

    public void QUv() {
        com.bytedance.sdk.openadsdk.lMd.KS.COT cot = this.ku;
        if (cot != null) {
            cot.dT();
        }
    }

    public void RCv() {
        com.bytedance.sdk.openadsdk.lMd.KS.COT cot = this.ku;
        if (cot != null) {
            cot.QR();
        }
    }

    public SSWebView YW() {
        return this.woN;
    }

    public int cz() {
        return this.HWF;
    }

    public boolean dQp() {
        String str = this.jU;
        if (str == null) {
            return false;
        }
        try {
            return Uri.parse(str).getQueryParameterNames().contains("show_landingpage");
        } catch (Exception unused) {
            return false;
        }
    }

    public RCv dT() {
        return this.zp;
    }

    public void irS() {
        com.bytedance.sdk.openadsdk.lMd.KS.COT cot = this.ku;
        if (cot != null) {
            cot.KS();
            this.ku.jU();
        }
    }

    public SSWebView ku() {
        return this.KVG;
    }

    public String ot() {
        return this.jU;
    }

    public void ox() {
        com.bytedance.sdk.openadsdk.lMd.KS.COT cot = this.ku;
        if (cot != null) {
            cot.ku();
        }
    }

    public void pvr() {
        SSWebView sSWebView = this.KVG;
        if (sSWebView != null) {
            sSWebView.YW();
        }
        SSWebView sSWebView2 = this.woN;
        if (sSWebView2 != null) {
            sSWebView2.YW();
        }
        if (this.aax == 0) {
            this.aax = SystemClock.elapsedRealtime();
        }
        RCv rCv = this.zp;
        if (rCv != null) {
            rCv.dT();
            SSWebView sSWebView3 = this.KVG;
            if (sSWebView3 != null) {
                if (sSWebView3.getVisibility() == 0) {
                    this.zp.lMd(true);
                    lMd(this.zp, true);
                    zp(this.zp, false, true);
                } else {
                    this.zp.lMd(false);
                    lMd(this.zp, false);
                    zp(this.zp, true, false);
                }
            }
        }
        if (this.lMd != null && cz.KS(this.dT)) {
            this.lMd.dT();
            SSWebView sSWebView4 = this.woN;
            if (sSWebView4 != null) {
                if (sSWebView4.getVisibility() == 0) {
                    this.lMd.lMd(true);
                    lMd(this.lMd, true);
                    zp(this.lMd, false, true);
                    if (!this.Pxi && this.fRl.zp.IhO()) {
                        Iv();
                    }
                } else {
                    this.lMd.lMd(false);
                    lMd(this.lMd, false);
                    zp(this.lMd, true, false);
                }
            }
        }
        com.bytedance.sdk.openadsdk.lMd.dT dTVar = this.COT;
        if (dTVar != null) {
            dTVar.QR();
        }
    }

    public void rV() {
        SSWebView sSWebView = this.KVG;
        if (sSWebView != null) {
            irS.zp(sSWebView.getWebView());
        }
        SSWebView sSWebView2 = this.woN;
        if (sSWebView2 != null) {
            irS.zp(sSWebView2.getWebView());
        }
        long j7 = this.Rg;
        if (j7 > 0) {
            if (this.aax > 0) {
                this.Rg = (SystemClock.elapsedRealtime() - this.aax) + j7;
            }
            com.bytedance.sdk.openadsdk.lMd.KS.zp(this.fRl.zp, this.Bj, "second_endcard_duration", (JSONObject) null, this.Rg);
        }
        this.KVG = null;
        boolean z8 = true;
        if (this.ku != null && !com.bytedance.sdk.openadsdk.core.model.dQp.KS(this.dT) && !com.bytedance.sdk.openadsdk.core.model.dQp.jU(this.dT) && !woN.KS(this.dT)) {
            this.ku.zp(true);
            this.ku.vDp();
        }
        RCv rCv = this.zp;
        if (rCv != null) {
            rCv.Bj();
        }
        RCv rCv2 = this.lMd;
        if (rCv2 != null) {
            rCv2.Bj();
        }
        com.bytedance.sdk.openadsdk.lMd.dT dTVar = this.COT;
        if (dTVar != null) {
            if (!this.dT.WNy() && !cz.lMd(this.dT)) {
                z8 = false;
            }
            dTVar.KS(z8);
        }
        DeviceUtils.AudioInfoReceiver.lMd(this);
    }

    public void tG() {
        String HWF = cz.HWF(this.dT);
        this.jU = HWF;
        String zp2 = zp(HWF, this.dT, this.vDp, this.dQp, this.rV);
        this.jU = zp2;
        if (TextUtils.isEmpty(zp2)) {
            return;
        }
        this.oKZ = this.jU.contains("use_second_endcard=1");
    }

    public com.bytedance.sdk.openadsdk.lMd.dT vDp() {
        return this.COT;
    }

    public void vwr() {
        SSWebView sSWebView = this.KVG;
        if (sSWebView != null) {
            sSWebView.Bj();
        }
        SSWebView sSWebView2 = this.woN;
        if (sSWebView2 != null) {
            sSWebView2.Bj();
        }
        if (this.aax > 0) {
            this.Rg = (SystemClock.elapsedRealtime() - this.aax) + this.Rg;
            this.aax = 0L;
        }
        RCv rCv = this.zp;
        if (rCv != null) {
            rCv.lMd(false);
            lMd(this.zp, false);
            zp(this.zp, true, false);
        }
        if (this.lMd == null || !cz.KS(this.dT)) {
            return;
        }
        this.lMd.lMd(false);
        lMd(this.lMd, false);
        zp(this.lMd, true, false);
    }

    public void woN() {
        com.bytedance.sdk.openadsdk.lMd.KS.COT cot = this.ku;
        if (cot != null) {
            cot.YW();
        }
        com.bytedance.sdk.openadsdk.lMd.dT dTVar = this.COT;
        if (dTVar != null) {
            dTVar.ku();
        }
    }

    public boolean yRU() {
        return this.oKZ && !this.BO && this.pvr.get() && this.cz;
    }

    public void COT() {
        if (TextUtils.isEmpty(woN.zp(this.fRl.fgJ, this.dT))) {
            woN won = this.dT;
            if (won != null && !won.qW() && this.rCC == null && dQp()) {
                this.gH = this.dT.fVt();
                this.rCC = com.bytedance.sdk.openadsdk.jU.lMd.zp().lMd();
                int zp2 = com.bytedance.sdk.openadsdk.jU.lMd.zp().zp(this.rCC, this.gH);
                this.DY = zp2;
                this.Rh = zp2 > 0 ? 2 : 0;
                if (!TextUtils.isEmpty(this.gH)) {
                    com.bytedance.sdk.openadsdk.lMd.dT dTVar = this.COT;
                    if (dTVar != null) {
                        dTVar.zp(this.Rh);
                    }
                    KS.zp.zp(this.fgJ, this.dT, "landingpage_endcard", this.rCC, this.gH);
                }
            }
            if ((TextUtils.isEmpty(this.jU) || !this.jU.contains("play.google.com/store")) && !com.bytedance.sdk.openadsdk.core.model.dQp.COT(this.dT) && !com.bytedance.sdk.openadsdk.core.model.dQp.jU(this.dT)) {
                if (this.KS) {
                    if (this.KVG != null && !TextUtils.isEmpty(this.jU) && woN.lMd(this.dT)) {
                        if (this.qtv) {
                            return;
                        }
                        String h6 = AbstractC2914a.h(new StringBuilder(), this.jU, "&is_pre_render=1");
                        com.bytedance.sdk.openadsdk.lMd.dT dTVar2 = this.COT;
                        if (dTVar2 != null) {
                            dTVar2.jU();
                        }
                        com.bytedance.sdk.openadsdk.utils.woN.zp(this.KVG, h6);
                        this.fRl.ffE.KS(h6);
                        this.qtv = true;
                        return;
                    }
                    if (woN.KS(this.dT)) {
                        this.fRl.DY.KS();
                        return;
                    }
                    return;
                }
                return;
            }
            this.YW = true;
        }
    }

    public void HWF() {
        com.bykv.vk.openvk.component.video.api.KS.lMd eWG = this.dT.eWG();
        if (eWG == null) {
            return;
        }
        String vDp = eWG.vDp();
        this.Vjb = vDp;
        if (TextUtils.isEmpty(vDp)) {
            return;
        }
        this.Vjb = zp(this.Vjb, this.dT, this.vDp, this.dQp, this.rV);
        this.woN.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.zp.COT(KVG.zp(), this.lMd, this.dT.fgJ(), this.COT, this.dT.WNy() || cz.lMd(this.dT)) { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.rV.2
            @Override // com.bytedance.sdk.openadsdk.core.widget.zp.COT, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                com.bytedance.sdk.openadsdk.lMd.KS.COT cot = rV.this.ku;
                if (cot != null) {
                    cot.HWF();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.zp.COT, android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                com.bytedance.sdk.openadsdk.lMd.KS.COT cot = rV.this.ku;
                if (cot != null) {
                    cot.COT();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.zp.COT, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i9, String str, String str2) {
                if (rV.this.zp(str2)) {
                    return;
                }
                rV.this.FP = false;
                rV rVVar = rV.this;
                rVVar.HWF = i9;
                rVVar.QR = str;
                if (rVVar.ku != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", i9);
                        jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, str);
                        rV.this.ku.zp(jSONObject);
                    } catch (JSONException unused) {
                    }
                }
                super.onReceivedError(webView, i9, str, str2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.zp.COT, android.webkit.WebViewClient
            @TargetApi(21)
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                    rV.this.FP = false;
                    if (webResourceResponse != null) {
                        rV.this.HWF = webResourceResponse.getStatusCode();
                        rV.this.QR = "onReceivedHttpError";
                    }
                }
                if (rV.this.ku != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (webResourceResponse != null) {
                            jSONObject.put("code", webResourceResponse.getStatusCode());
                            jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, webResourceResponse.getReasonPhrase());
                        }
                        rV.this.ku.zp(jSONObject);
                    } catch (JSONException unused) {
                    }
                }
                if (webResourceRequest != null) {
                    super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.zp.COT, android.webkit.WebViewClient
            @TargetApi(23)
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                if (webResourceRequest == null || webResourceRequest.getUrl() == null || !rV.this.zp(webResourceRequest.getUrl().toString())) {
                    rV.this.FP = false;
                    if (rV.this.ku != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (webResourceError != null) {
                                jSONObject.put("code", webResourceError.getErrorCode());
                                jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, webResourceError.getDescription());
                            }
                            rV.this.ku.zp(jSONObject);
                        } catch (JSONException unused) {
                        }
                    }
                    if (webResourceError != null) {
                        rV.this.HWF = webResourceError.getErrorCode();
                        rV.this.QR = String.valueOf(webResourceError.getDescription());
                    }
                    if (webResourceRequest == null) {
                        return;
                    }
                    super.onReceivedError(webView, webResourceRequest, webResourceError);
                }
            }
        });
        this.woN.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.zp.jU(this.lMd, this.COT) { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.rV.3
            @Override // com.bytedance.sdk.openadsdk.core.widget.zp.jU, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i9) {
                super.onProgressChanged(webView, i9);
                if (rV.this.fRl.pvr && rV.this.fRl.Rg != null) {
                    rV.this.fRl.Rg.zp(webView, i9);
                }
            }
        });
        com.bytedance.sdk.openadsdk.utils.woN.zp(this.woN, this.Vjb);
        this.FP = true;
    }

    public void QR() {
        this.pvr.set(this.FP);
        if (this.woN.getVisibility() == 0 && this.FP) {
            Iv();
            return;
        }
        this.fRl.Rh.KS(false);
        this.fRl.ffE.COT();
        zp(this.zp, true, false);
        lMd(this.zp, false);
        zp(this.zp, false);
        this.KVG.vDp();
        if (this.FP) {
            this.woN.setVisibility(0);
            zp(this.lMd, this.fRl.jU, true);
            lMd(this.lMd, true);
            zp(this.lMd, true);
            this.fRl.qtv.removeMessages(600);
            com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar = this.fRl;
            if (!zpVar.gH.lMd(zpVar.Vjb)) {
                this.fRl.Vjb.RCv();
            }
        } else {
            if (this.fRl.ffE.pvr()) {
                this.fRl.ffE.lMd(5);
            }
            this.fRl.gH.jU();
            this.fRl.fs.zp(r0.cz);
        }
        this.fs = true;
    }

    public boolean KS() {
        return this.Iv;
    }

    public boolean jU() {
        return this.BO;
    }

    public void lMd() {
        com.bytedance.sdk.openadsdk.common.QR qr;
        this.yRU = this.fRl.oB.findViewById(R.id.content);
        com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar = this.fRl;
        boolean z8 = zpVar.pvr;
        this.UPs = z8;
        if (z8 && (qr = this.WNy) != null) {
            this.KVG = qr.jU();
        } else {
            SSWebView sSWebView = (SSWebView) zpVar.oB.findViewById(com.bytedance.sdk.openadsdk.utils.vDp.rV);
            this.KVG = sSWebView;
            if (sSWebView != null && woN.lMd(this.dT)) {
                this.KVG.d_();
            } else {
                WNy.zp((View) this.KVG, 8);
            }
        }
        SSWebView sSWebView2 = (SSWebView) this.fRl.oB.findViewById(com.bytedance.sdk.openadsdk.utils.vDp.KVG);
        this.woN = sSWebView2;
        if (sSWebView2 != null && cz.lMd(this.dT)) {
            this.woN.d_();
            this.woN.setDisplayZoomControls(false);
        } else {
            WNy.zp((View) this.woN, 8);
        }
        SSWebView sSWebView3 = this.KVG;
        if (sSWebView3 != null) {
            sSWebView3.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.rV.1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    if (rV.this.KVG != null && rV.this.KVG.getViewTreeObserver() != null) {
                        rV.this.KVG.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        int measuredWidth = rV.this.KVG.getMeasuredWidth();
                        int measuredHeight = rV.this.KVG.getMeasuredHeight();
                        if (rV.this.KVG.getVisibility() == 0) {
                            rV.this.zp(measuredWidth, measuredHeight);
                        }
                    }
                }
            });
        }
        SSWebView sSWebView4 = this.woN;
        if (sSWebView4 != null) {
            sSWebView4.setLandingPage(true);
            this.woN.setTag(cz.lMd(this.dT) ? this.Bj : "landingpage_endcard");
            this.woN.setWebViewClient(new SSWebView.zp());
            this.woN.setMaterialMeta(this.dT.hl());
        }
    }

    public void KS(boolean z8) {
        lMd(this.zp, z8);
    }

    public void jU(boolean z8) {
        if (this.zp == null || this.fRl.oB.isFinishing()) {
            return;
        }
        this.fRl.ffE.COT(z8);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", z8);
            this.zp.zp("volumeChange", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* loaded from: classes.dex */
    public static class zp extends com.bytedance.sdk.openadsdk.core.lMd.zp implements lMd.zp {
        private final View.OnClickListener UPs;
        private final View lMd;
        private final com.bytedance.sdk.openadsdk.component.reward.zp.zp zp;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public zp(com.bytedance.sdk.openadsdk.component.reward.zp.zp r5, android.view.View r6, android.view.View.OnClickListener r7) {
            /*
                r4 = this;
                com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r0 = r5.oB
                com.bytedance.sdk.openadsdk.core.model.woN r1 = r5.zp
                java.lang.String r2 = r5.QR
                boolean r3 = r5.HWF
                if (r3 == 0) goto Lc
                r3 = 7
                goto Ld
            Lc:
                r3 = 5
            Ld:
                r4.<init>(r0, r1, r2, r3)
                r4.zp = r5
                r4.lMd = r6
                r4.UPs = r7
                java.util.HashMap r6 = new java.util.HashMap
                r6.<init>()
                java.lang.Boolean r7 = java.lang.Boolean.TRUE
                java.lang.String r0 = "close_auto_click"
                r6.put(r0, r7)
                r7 = 2
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                java.lang.String r0 = "click_scence"
                r6.put(r0, r7)
                r4.zp(r6)
                com.bytedance.sdk.openadsdk.component.reward.zp.jU r5 = r5.fRl
                com.com.bytedance.overseas.sdk.zp.KS r5 = r5.KS()
                r4.zp(r5)
                r4.zp(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.zp.rV.zp.<init>(com.bytedance.sdk.openadsdk.component.reward.zp.zp, android.view.View, android.view.View$OnClickListener):void");
        }

        @Override // com.bytedance.sdk.openadsdk.core.lMd.zp, com.bytedance.sdk.openadsdk.core.lMd.lMd, com.bytedance.sdk.openadsdk.core.lMd.KS
        public void zp(View view, float f9, float f10, float f11, float f12, SparseArray<KS.zp> sparseArray, boolean z8) {
            if (this.COT.IhO()) {
                this.UPs.onClick(view);
                this.lMd.setOnTouchListener(null);
                this.lMd.setOnClickListener(this.UPs);
            } else {
                super.zp(view, f9, f10, f11, f12, sparseArray, z8);
                this.zp.oB.vwr();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.lMd.lMd.zp
        public void zp(View view, int i9) {
            this.lMd.setOnTouchListener(null);
            this.lMd.setOnClickListener(this.UPs);
        }
    }

    public void zp() {
        if (this.ot) {
            return;
        }
        this.ot = true;
        com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar = this.fRl;
        this.vDp = zpVar.dT;
        this.rV = zpVar.vDp;
        this.dQp = zpVar.tG;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        lMd();
        this.fgJ = SystemClock.elapsedRealtime() - elapsedRealtime;
    }

    public void zp(String str, final com.bytedance.sdk.openadsdk.core.video.KS.lMd lmd) {
        zp(str, new jU() { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.rV.9
            @Override // com.bytedance.sdk.openadsdk.component.reward.zp.rV.jU
            public void zp(WebView webView, String str2) {
                if (rV.this.fRl.oB.isFinishing()) {
                    return;
                }
                rV.this.fRl.ffE.HWF(rV.this.KVG());
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.zp.rV.jU
            public void zp(WebView webView, String str2, Bitmap bitmap) {
                if (rV.this.ffE || !cz.Bj(rV.this.fRl.zp)) {
                    return;
                }
                rV.this.ffE = true;
                rV.this.fRl.ffE.zp(rV.this.fRl.dQp, rV.this.fRl.zp, rV.this.fRl.oB.dQp());
                if (!cz.KS(rV.this.dT)) {
                    rV.this.fRl.qtv.sendEmptyMessageDelayed(600, rV.this.fRl.ffE.Bj() * 1000);
                }
                rV.this.fRl.ffE.QR();
                rV.this.fRl.oB.lMd();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.zp.rV.jU
            public void zp(WebView webView, int i9) {
                try {
                    if (!cz.Bj(rV.this.fRl.zp) || !rV.this.fRl.zp.NJ() || rV.this.fRl.oB.isFinishing()) {
                        if (!rV.this.fRl.pvr || rV.this.fRl.Rg == null) {
                            return;
                        }
                        rV.this.fRl.Rg.zp(webView, i9);
                        return;
                    }
                    rV.this.fRl.ffE.KS(i9);
                } catch (Exception unused) {
                }
            }
        });
        if (cz.Bj(this.fRl.zp)) {
            zp(this.woN);
            this.fRl.ffE.zp(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.rV.10
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str2, String str3, String str4, String str5, long j7) {
                    rV.this.fRl.fRl.lMd();
                    com.bytedance.sdk.openadsdk.core.video.KS.lMd lmd2 = lmd;
                    if (lmd2 != null) {
                        lmd2.pvr();
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar = this.fRl;
        zpVar.ffE.zp(zpVar.woN);
        zp(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.rV.11
            @Override // android.webkit.DownloadListener
            public void onDownloadStart(String str2, String str3, String str4, String str5, long j7) {
                rV.this.fRl.fRl.lMd();
                com.bytedance.sdk.openadsdk.core.video.KS.lMd lmd2 = lmd;
                if (lmd2 != null) {
                    lmd2.pvr();
                }
            }
        });
    }

    public void zp(com.bytedance.sdk.openadsdk.YW.COT cot, String str, final TTBaseVideoActivity tTBaseVideoActivity) {
        if (this.KVG == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        if (cz.lMd(this.dT)) {
            hashMap.put("click_scence", 3);
        } else {
            hashMap.put("click_scence", 2);
        }
        this.ku = aax();
        this.zp = new RCv(this.fRl.oB);
        String dm = this.dT.dm();
        this.zp.lMd(this.KVG).zp(this.dT).KS(this.dT.fgJ()).jU(this.dT.GP()).lMd(tTBaseVideoActivity.dQp() ? 7 : 5).zp(new lMd(this.KVG)).COT(dm).zp(this.KVG).lMd(dQp() ? "landingpage_endcard" : str).zp(hashMap).zp(this.ku).zp(new com.bytedance.sdk.openadsdk.core.widget.lMd() { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.rV.12
            @Override // com.bytedance.sdk.openadsdk.core.widget.lMd
            public void zp() {
                if (rV.this.eWG != null) {
                    rV.this.eWG.lMd();
                }
                TTBaseVideoActivity tTBaseVideoActivity2 = tTBaseVideoActivity;
                if (tTBaseVideoActivity2 != null) {
                    tTBaseVideoActivity2.pvr();
                }
            }
        });
        HashMap hashMap2 = new HashMap();
        if (cz.KS(this.dT)) {
            hashMap2.put("click_scence", 2);
        }
        RCv rCv = new RCv(this.fRl.oB);
        this.lMd = rCv;
        RCv COT = rCv.lMd(this.woN).zp(this.dT).KS(this.dT.fgJ()).jU(this.dT.GP()).lMd(tTBaseVideoActivity.dQp() ? 7 : 5).zp(new lMd(this.woN)).zp(this.woN).COT(dm);
        if (dQp()) {
            str = "landingpage_endcard";
        }
        COT.lMd(str).zp(hashMap2).zp(this.ku).zp(new com.bytedance.sdk.openadsdk.core.widget.lMd() { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.rV.14
            @Override // com.bytedance.sdk.openadsdk.core.widget.lMd
            public void zp() {
                if (rV.this.eWG != null) {
                    rV.this.eWG.lMd();
                }
            }
        }).zp(new RCv.zp() { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.rV.13
            @Override // com.bytedance.sdk.openadsdk.core.RCv.zp
            public void zp() {
                rV.this.BO();
            }
        });
        this.zp.zp(new KS(this.KVG));
        this.lMd.zp(new KS(this.woN));
        this.zp.zp(this.fRl.rCC.dT()).zp(this.fRl.woN).zp(cot).zp(this.fRl.ffE.KVG()).zp(new com.bytedance.sdk.openadsdk.YW.lMd() { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.rV.15
            @Override // com.bytedance.sdk.openadsdk.YW.lMd
            public void zp(boolean z8, int i9, String str2) {
                if (z8) {
                    rV.this.fRl.ffE.KS();
                }
                if (!woN.jU(rV.this.fRl.zp) || cz.lMd(rV.this.fRl.zp)) {
                    return;
                }
                rV.this.zp(z8, i9, str2);
            }

            @Override // com.bytedance.sdk.openadsdk.YW.lMd
            public void zp() {
                rV.this.Iv = true;
                rV.this.fRl.rCC.dT().performClick();
            }
        });
        this.zp.COT(this.oKZ);
        this.lMd.zp(this.fRl.rCC.dT()).zp(new com.bytedance.sdk.openadsdk.YW.lMd() { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.rV.16
            @Override // com.bytedance.sdk.openadsdk.YW.lMd
            public void zp(boolean z8, int i9, String str2) {
            }

            @Override // com.bytedance.sdk.openadsdk.YW.lMd
            public void zp() {
                rV.this.Iv = true;
                rV.this.fRl.rCC.dT().performClick();
            }
        });
    }

    public void lMd(int i9) {
        WNy.zp((View) this.KVG, i9);
        SSWebView sSWebView = this.KVG;
        if (sSWebView != null) {
            WNy.zp((View) sSWebView.getWebView(), i9);
        }
        if (this.KVG != null && (this.dT.WNy() || cz.lMd(this.dT))) {
            this.KVG.setLandingPage(true);
            this.KVG.setTag(cz.lMd(this.dT) ? this.Bj : "landingpage_endcard");
            this.KVG.setMaterialMeta(this.dT.hl());
        }
        if (i9 == 0 && cz.KS(this.dT)) {
            HWF();
        }
    }

    public void lMd(boolean z8) {
        zp(this.zp, z8);
    }

    public void lMd(RCv rCv, boolean z8) {
        try {
            this.fRl.ffE.jU(z8);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("viewStatus", z8 ? 1 : 0);
            rCv.zp("viewableChange", jSONObject);
        } catch (Exception unused) {
        }
    }

    public void zp(int i9, int i10) {
        if (this.zp == null || this.fRl.oB.isFinishing()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", i9);
            jSONObject.put("height", i10);
            this.zp.zp("resize", jSONObject);
        } catch (Exception e4) {
            Log.e("TTAD.RFWVM", "", e4);
        }
    }

    public void zp(boolean z8) {
        this.KS = z8;
    }

    private static String zp(String str, woN won, int i9, int i10, int i11) {
        String concat;
        String concat2;
        float CZ = won.CZ();
        if (!TextUtils.isEmpty(str)) {
            if (i9 == 1) {
                if (str.contains("?")) {
                    concat2 = str.concat("&");
                } else {
                    concat2 = str.concat("?");
                }
                str = o.j(concat2, "orientation=portrait");
            }
            if (str.contains("?")) {
                concat = str.concat("&");
            } else {
                concat = str.concat("?");
            }
            str = concat + "height=" + i10 + "&width=" + i11 + "&aspect_ratio=" + CZ;
        }
        return !cz.lMd(won) ? com.bytedance.sdk.openadsdk.utils.jU.zp(str) : str;
    }

    public void zp(com.bytedance.sdk.openadsdk.common.QR qr) {
        this.WNy = qr;
    }

    public void zp(float f9) {
        WNy.zp(this.KVG, f9);
    }

    public void zp(RCv rCv, boolean z8) {
        if (this.zp == null || this.fRl.oB.isFinishing()) {
            return;
        }
        rCv.lMd(z8);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void zp(String str, final jU jUVar) {
        SSWebView sSWebView;
        SSWebView sSWebView2 = this.KVG;
        if (sSWebView2 != null && sSWebView2.getWebView() != null) {
            com.bytedance.sdk.openadsdk.lMd.dT zp2 = new com.bytedance.sdk.openadsdk.lMd.dT(this.dT, this.KVG.getWebView(), new com.bytedance.sdk.openadsdk.lMd.YW() { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.rV.5
                @Override // com.bytedance.sdk.openadsdk.lMd.YW
                public void zp(int i9) {
                    if (!TextUtils.isEmpty(rV.this.gH)) {
                        KS.zp.zp(rV.this.DY, rV.this.si, rV.this.oB, rV.this.MBR - rV.this.oB, rV.this.dT, "landingpage_endcard", i9);
                    }
                }
            }, this.Rh).zp(true);
            this.COT = zp2;
            if (dQp()) {
                str = "landingpage_endcard";
            }
            zp2.zp(str);
            this.COT.lMd(this.Bj);
            this.COT.lMd(true);
            com.bytedance.sdk.openadsdk.core.widget.zp.COT cot = new com.bytedance.sdk.openadsdk.core.widget.zp.COT(KVG.zp(), this.zp, this.dT.fgJ(), this.COT, this.dT.WNy() || cz.lMd(this.dT)) { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.rV.6
                @Override // com.bytedance.sdk.openadsdk.core.widget.zp.COT, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str2) {
                    super.onPageFinished(webView, str2);
                    rV.this.qtv = false;
                    if (webView == null || webView.getProgress() >= 70) {
                        rV.this.cz = true;
                        DeviceUtils.AudioInfoReceiver.zp(rV.this);
                        rV.this.GP = DeviceUtils.QR();
                        com.bytedance.sdk.openadsdk.lMd.KS.COT cot2 = rV.this.ku;
                        if (cot2 != null) {
                            cot2.HWF();
                        }
                        rV.this.fRl.ffE.lMd(str2);
                        jU jUVar2 = jUVar;
                        if (jUVar2 != null) {
                            jUVar2.zp(webView, str2);
                        }
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.zp.COT, android.webkit.WebViewClient
                public void onPageStarted(WebView webView, String str2, Bitmap bitmap) {
                    super.onPageStarted(webView, str2, bitmap);
                    com.bytedance.sdk.openadsdk.lMd.KS.COT cot2 = rV.this.ku;
                    if (cot2 != null) {
                        cot2.COT();
                    }
                    jU jUVar2 = jUVar;
                    if (jUVar2 != null) {
                        jUVar2.zp(webView, str2, bitmap);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.zp.COT, android.webkit.WebViewClient
                public void onReceivedError(WebView webView, int i9, String str2, String str3) {
                    super.onReceivedError(webView, i9, str2, str3);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.zp.COT, android.webkit.WebViewClient
                @TargetApi(21)
                public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                    rV.this.fRl.ffE.zp(webResourceRequest.isForMainFrame(), webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode());
                    if (webResourceRequest.getUrl() != null) {
                        Log.i("TTAD.RFWVM", "onReceivedHttpError:url =" + webResourceRequest.getUrl().toString());
                    }
                    if (webResourceRequest.isForMainFrame()) {
                        rV.this.pvr.set(false);
                        rV.this.qtv = false;
                        rV.this.HWF = webResourceResponse.getStatusCode();
                        rV.this.QR = "onReceivedHttpError";
                    }
                    if (rV.this.ku != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("code", webResourceResponse.getStatusCode());
                            jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, webResourceResponse.getReasonPhrase());
                            rV.this.ku.zp(jSONObject);
                        } catch (JSONException unused) {
                        }
                    }
                    super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.zp.COT, android.webkit.WebViewClient
                public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.zp.COT, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str2) {
                    if (!cz.lMd(rV.this.dT)) {
                        try {
                            if (TextUtils.isEmpty(rV.this.gH)) {
                                return super.shouldInterceptRequest(webView, str2);
                            }
                            rV.vDp(rV.this);
                            WebResourceResponseModel zp3 = com.bytedance.sdk.openadsdk.jU.lMd.zp().zp(rV.this.rCC, rV.this.gH, str2);
                            if (zp3 != null && zp3.getWebResourceResponse() != null) {
                                rV.rV(rV.this);
                                return zp3.getWebResourceResponse();
                            }
                            if (zp3 != null && zp3.getMsg() == 2) {
                                rV.dQp(rV.this);
                            }
                            return super.shouldInterceptRequest(webView, str2);
                        } catch (Throwable th) {
                            com.bytedance.sdk.component.utils.tG.zp("TTAD.RFWVM", "shouldInterceptRequest url error", th);
                            return super.shouldInterceptRequest(webView, str2);
                        }
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    WebResourceResponse zp4 = com.bytedance.sdk.openadsdk.core.video.lMd.zp.zp().zp(rV.this.dT.eWG().tG(), cz.HWF(rV.this.dT), str2);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (rV.this.ku != null) {
                        ku.zp zp5 = com.bytedance.sdk.component.adexpress.jU.ku.zp(str2);
                        int i9 = zp4 != null ? 1 : 2;
                        if (zp5 == ku.zp.HTML) {
                            rV.this.ku.zp(str2, currentTimeMillis, currentTimeMillis2, i9);
                        } else if (zp5 == ku.zp.JS) {
                            rV.this.ku.lMd(str2, currentTimeMillis, currentTimeMillis2, i9);
                        }
                    }
                    return zp4;
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.zp.COT, android.webkit.WebViewClient
                @TargetApi(23)
                public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                    super.onReceivedError(webView, webResourceRequest, webResourceError);
                    if (webResourceError != null && webResourceRequest != null && webResourceRequest.getUrl() != null) {
                        Log.i("TTAD.RFWVM", "onReceivedError WebResourceError : description=" + ((Object) webResourceError.getDescription()) + "  url =" + webResourceRequest.getUrl().toString());
                    }
                    if (webResourceRequest == null || webResourceRequest.getUrl() == null || !rV.this.zp(webResourceRequest.getUrl().toString())) {
                        if (webResourceError != null && webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                            rV.this.fRl.ffE.zp(webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription()), String.valueOf(webResourceRequest.getUrl()));
                        }
                        if (webResourceRequest == null || webResourceRequest.isForMainFrame()) {
                            rV.this.pvr.set(false);
                            rV.this.qtv = false;
                        }
                        if (rV.this.ku != null) {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                if (webResourceError != null) {
                                    jSONObject.put("code", webResourceError.getErrorCode());
                                    jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, webResourceError.getDescription());
                                }
                                rV.this.ku.zp(jSONObject);
                            } catch (JSONException unused) {
                            }
                        }
                        if (webResourceError != null) {
                            rV.this.HWF = webResourceError.getErrorCode();
                            rV.this.QR = String.valueOf(webResourceError.getDescription());
                        }
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.zp.COT, android.webkit.WebViewClient
                @TargetApi(21)
                public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                    try {
                        return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.tG.zp("TTAD.RFWVM", "shouldInterceptRequest error1", th);
                        return super.shouldInterceptRequest(webView, webResourceRequest);
                    }
                }
            };
            this.eWG = cot;
            this.KVG.setWebViewClient(cot);
            this.eWG.zp(this.dT);
            this.eWG.zp(this.tG ? "rewarded_video" : "fullscreen_interstitial_ad");
            if (this.dT.WNy() && (sSWebView = this.KVG) != null && sSWebView.getWebView() != null) {
                this.KVG.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.rV.7
                    private final int lMd = KVG.lMd();

                    /* JADX WARN: Removed duplicated region for block: B:28:0x00c3 A[Catch: all -> 0x0057, TryCatch #1 {all -> 0x0057, blocks: (B:6:0x0010, B:14:0x0029, B:16:0x0043, B:19:0x005f, B:21:0x00a4, B:23:0x00ae, B:26:0x00bb, B:28:0x00c3, B:30:0x00cf, B:31:0x00d8, B:33:0x00e5, B:35:0x014d, B:37:0x0176, B:39:0x017c, B:41:0x018a, B:43:0x0192, B:47:0x019e, B:49:0x01a6, B:51:0x01e6, B:57:0x01f8, B:61:0x0204, B:63:0x0213, B:64:0x0237, B:66:0x023f, B:67:0x0275, B:69:0x027d, B:70:0x02b5, B:73:0x02e8, B:76:0x02fc, B:78:0x030c, B:79:0x0315, B:81:0x031d, B:83:0x032b, B:86:0x0335, B:87:0x034c, B:90:0x0341, B:95:0x0225, B:103:0x005a, B:105:0x00f0, B:107:0x011a, B:109:0x0128, B:111:0x0132, B:113:0x0140), top: B:5:0x0010 }] */
                    @Override // android.view.View.OnTouchListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public boolean onTouch(android.view.View r19, android.view.MotionEvent r20) {
                        /*
                            Method dump skipped, instructions count: 862
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.zp.rV.AnonymousClass7.onTouch(android.view.View, android.view.MotionEvent):boolean");
                    }
                });
            }
            SSWebView sSWebView3 = this.KVG;
            if (sSWebView3 != null) {
                sSWebView3.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.zp.jU(this.zp, this.COT) { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.rV.8
                    @Override // com.bytedance.sdk.openadsdk.core.widget.zp.jU, android.webkit.WebChromeClient
                    public void onProgressChanged(WebView webView, int i9) {
                        super.onProgressChanged(webView, i9);
                        jU jUVar2 = jUVar;
                        if (jUVar2 != null) {
                            jUVar2.zp(webView, i9);
                        }
                    }
                });
            }
            zp(this.KVG);
            this.KVG.setLayerType(1, null);
            this.KVG.setBackgroundColor(-1);
            this.KVG.setDisplayZoomControls(false);
        }
        COT();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean zp(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return this.dT.WNy() && str.endsWith(".mp4");
    }

    public void zp(DownloadListener downloadListener) {
        SSWebView sSWebView = this.KVG;
        if (sSWebView == null || downloadListener == null) {
            return;
        }
        sSWebView.setDownloadListener(downloadListener);
    }

    public void zp(SSWebView sSWebView) {
        if (sSWebView == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.zp.KS.zp(this.fRl.oB).zp(false).lMd(false).zp(sSWebView.getWebView());
        sSWebView.setUserAgentString(com.bytedance.sdk.openadsdk.utils.dQp.zp(sSWebView.getWebView(), 6003));
        sSWebView.setMixedContentMode(0);
    }

    public void zp(boolean z8, boolean z9) {
        zp(this.zp, z8, z9);
    }

    public void zp(RCv rCv, boolean z8, boolean z9) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", z8);
            jSONObject.put(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD_SHOW, z9);
            rCv.zp("endcard_control_event", jSONObject);
        } catch (Exception unused) {
        }
    }

    public void zp(boolean z8, int i9, String str) {
        com.bytedance.sdk.openadsdk.lMd.KS.COT cot = this.ku;
        if (cot == null) {
            return;
        }
        if (z8) {
            cot.lMd();
        } else {
            cot.zp(i9, str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.YW.QR
    public void zp(int i9) {
        int i10 = this.GP;
        if (i10 <= 0 && i9 > 0) {
            jU(false);
        } else if (i10 > 0 && i9 == 0) {
            jU(true);
        }
        this.GP = i9;
    }
}
