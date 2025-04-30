package com.bytedance.sdk.openadsdk.lMd;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.widget.PangleWebView;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.model.cz;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.utils.QUv;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.YhE;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class dT {
    private static final int[] zp = {10, 30, 50, 75, 100};
    private String BO;
    private String Bj;
    private final AtomicBoolean COT;
    private boolean FP;
    private boolean Gzh;
    private final AtomicBoolean HWF;
    private long Iv;
    private long KS;
    private long KVG;
    private com.bytedance.sdk.openadsdk.lMd.KS.COT Lij;
    private volatile long Pxi;
    private final AtomicBoolean QR;
    private volatile long QUv;
    private boolean RCv;
    private volatile int UPs;
    private final AtomicBoolean WNy;
    private int YW;
    private final AtomicInteger YhE;
    private final AtomicInteger cW;
    private long cz;
    private String dQp;
    private boolean dT;
    private volatile long eWG;
    private int fRl;
    private volatile long ffE;
    private YW irS;
    private int jU;
    private final AtomicBoolean ku;
    private int lMd;
    private final AtomicBoolean oKZ;
    private final boolean ot;
    private WebView ox;
    private long pvr;
    private final woN rV;
    private final Context tG;
    private String vDp;
    private long vwr;
    private long woN;
    private final AtomicInteger yRU;

    /* loaded from: classes.dex */
    public class zp {
        private zp() {
        }

        @JavascriptInterface
        public String getUrl() {
            return "";
        }

        @JavascriptInterface
        public void readPercent(String str) {
            int i9 = 0;
            try {
                int intValue = Float.valueOf(str).intValue();
                if (intValue > 100) {
                    i9 = 100;
                } else if (intValue >= 0) {
                    i9 = intValue;
                }
            } catch (Throwable unused) {
            }
            dT.this.yRU.set(i9);
        }
    }

    public dT(woN won, WebView webView, YW yw, int i9) {
        this(won, webView);
        this.irS = yw;
        this.fRl = i9;
    }

    private boolean YW() {
        woN won;
        if (this.Gzh && (won = this.rV) != null && won.qW()) {
            return true;
        }
        return false;
    }

    private int dT() {
        WebView webView = this.ox;
        if (webView != null) {
            try {
                WebBackForwardList copyBackForwardList = webView.copyBackForwardList();
                if (copyBackForwardList != null) {
                    if (copyBackForwardList.getCurrentIndex() == 0) {
                        return 1;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    public void COT() {
        if (YW()) {
            this.eWG = SystemClock.elapsedRealtime();
            HWF();
        }
    }

    public void HWF() {
        if (YW() && this.eWG > 0 && this.Pxi > 0 && !this.oKZ.getAndSet(true)) {
            KS.zp(this.Pxi - this.eWG, this.rV, this.BO, (String) null);
        }
    }

    public boolean KS() {
        return this.Gzh;
    }

    public void QR() {
        if (this.cz == 0) {
            this.cz = System.currentTimeMillis();
        }
        this.KVG = System.currentTimeMillis();
    }

    public void jU() {
        if (YW()) {
            this.ffE = SystemClock.elapsedRealtime();
            KS.zp(this.rV, this.BO);
        }
    }

    public void ku() {
        if (("landingpage".equals(this.dQp) || "landingpage_endcard".equals(this.dQp) || "landingpage_split_screen".equals(this.dQp) || "landingpage_direct".equals(this.dQp) || "aggregate_page".equals(this.dQp)) && this.jU == 2) {
            if (this.woN > 0 || !KS()) {
                long currentTimeMillis = System.currentTimeMillis() - Math.max(this.KVG, this.woN);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("load_status", this.jU);
                    jSONObject.put("max_scroll_percent", this.yRU.get());
                    jSONObject.put("jump_times", this.cW.getAndSet(0));
                    jSONObject.put("click_times", this.YhE.getAndSet(0));
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                } catch (JSONException unused) {
                }
                this.ku.set(true);
                zp("stay_page", jSONObject, Math.min(currentTimeMillis, TTAdConstant.AD_MAX_EVENT_TIME));
            }
        }
    }

    private String KS(String str) {
        return "javascript:".concat(String.valueOf(str));
    }

    public com.bytedance.sdk.openadsdk.lMd.KS.COT lMd() {
        return this.Lij;
    }

    public void KS(boolean z8) {
        WebView webView = this.ox;
        if (webView != null) {
            try {
                webView.removeJavascriptInterface("JS_LANDING_PAGE_LOG_OBJ");
            } catch (Exception e4) {
                com.bytedance.sdk.component.utils.tG.zp("LandingPageLog", "removeJavascriptInterface exception", e4);
            }
        }
        if (this.HWF.compareAndSet(false, true)) {
            zp(z8, "1");
            if (this.RCv) {
                KS.zp(this.rV, this.dQp, System.currentTimeMillis() - this.cz, this.fRl, dT());
            }
        } else if (this.jU == 2 && !this.ku.get()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("load_status", this.jU);
                jSONObject.put("max_scroll_percent", this.yRU.get());
                jSONObject.put("jump_times", this.cW.getAndSet(0));
                jSONObject.put("click_times", this.YhE.getAndSet(0));
                jSONObject.putOpt("render_type", "h5");
                jSONObject.putOpt("render_type_2", 0);
            } catch (JSONException unused) {
            }
            zp("stay_page", jSONObject, 0L);
        }
        this.ox = null;
    }

    public void lMd(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.BO = str;
    }

    public dT(woN won, WebView webView) {
        this.lMd = 0;
        this.KS = -1L;
        this.jU = 1;
        this.COT = new AtomicBoolean(false);
        this.HWF = new AtomicBoolean(false);
        this.QR = new AtomicBoolean(false);
        this.ku = new AtomicBoolean(false);
        this.YW = -1;
        this.dQp = "landingpage";
        this.KVG = 0L;
        this.woN = 0L;
        this.vwr = 0L;
        this.pvr = 0L;
        this.cz = 0L;
        this.FP = false;
        this.ot = false;
        this.yRU = new AtomicInteger(0);
        this.RCv = false;
        this.Gzh = false;
        this.QUv = 0L;
        this.cW = new AtomicInteger(0);
        this.YhE = new AtomicInteger(0);
        this.WNy = new AtomicBoolean(false);
        this.UPs = 0;
        this.fRl = -1;
        this.oKZ = new AtomicBoolean(false);
        this.tG = com.bytedance.sdk.openadsdk.core.KVG.zp();
        this.rV = won;
        this.ox = webView;
        if (webView == null) {
            return;
        }
        if (webView instanceof PangleWebView) {
            this.Iv = ((PangleWebView) webView).zp;
        } else {
            this.Iv = System.currentTimeMillis();
        }
        try {
            this.ox.addJavascriptInterface(new zp(), "JS_LANDING_PAGE_LOG_OBJ");
        } catch (Exception e4) {
            com.bytedance.sdk.component.utils.tG.zp("LandingPageLog", "addJavascriptInterface exception", e4);
        }
        if (won == null || won.WLq() == null) {
            return;
        }
        this.KS = won.WLq().optLong("page_id", -1L);
    }

    public woN zp() {
        return this.rV;
    }

    public void lMd(boolean z8) {
        this.Gzh = z8;
    }

    public void zp(long j7) {
        this.woN = j7;
    }

    public void lMd(int i9) {
        if (this.QUv != 0) {
            if (i9 == 1 || i9 == 3) {
                this.YhE.incrementAndGet();
                if (this.WNy.getAndSet(true)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", this.rV.aax());
                } catch (JSONException unused) {
                }
                zp("click_time", jSONObject, Math.max(SystemClock.elapsedRealtime() - this.QUv, 0L));
            }
        }
    }

    public void zp(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.dQp = str;
    }

    public void zp(int i9) {
        this.fRl = i9;
    }

    public void zp(com.bytedance.sdk.openadsdk.lMd.KS.COT cot) {
        this.Lij = cot;
    }

    public dT zp(boolean z8) {
        this.RCv = z8;
        return this;
    }

    public void zp(WebView webView, int i9) {
        if (webView == null) {
            return;
        }
        if (this.QUv == 0) {
            this.QUv = SystemClock.elapsedRealtime();
        }
        if (this.vwr == 0 && i9 > 0) {
            this.vwr = System.currentTimeMillis();
        } else if (this.pvr == 0 && i9 == 100) {
            this.pvr = System.currentTimeMillis();
        }
        if (this.lMd != zp.length && ("landingpage".equals(this.dQp) || "landingpage_endcard".equals(this.dQp) || "landingpage_split_screen".equals(this.dQp) || "landingpage_direct".equals(this.dQp) || "aggregate_page".equals(this.dQp))) {
            int i10 = this.lMd;
            while (true) {
                int[] iArr = zp;
                if (i10 >= iArr.length || i9 < iArr[this.lMd]) {
                    break;
                }
                int i11 = i10 + 1;
                this.lMd = i11;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", webView.getUrl());
                    long j7 = this.KS;
                    if (j7 != -1) {
                        jSONObject.put("page_id", j7);
                    }
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.put("pct", iArr[i10]);
                } catch (Exception unused) {
                }
                zp("progress_load_finish", jSONObject);
                i10 = i11;
            }
        }
        if (i9 == 100) {
            zp(webView.getUrl(), NotificationCompat.CATEGORY_PROGRESS, Math.min(this.pvr - this.vwr, TTAdConstant.AD_MAX_EVENT_TIME));
        }
    }

    private void zp(String str, String str2, long j7) {
        if (this.QR.compareAndSet(false, true)) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (str.length() > 200) {
                    int indexOf = str.indexOf(38, 200);
                    int i9 = 300;
                    if (indexOf == -1 || indexOf > 300) {
                        indexOf = str.indexOf(63);
                    }
                    if (indexOf != -1 && indexOf <= 300) {
                        i9 = indexOf;
                    }
                    str = str.substring(0, i9);
                }
                jSONObject.put("url", str);
                jSONObject.put("type", str2);
            } catch (Throwable unused) {
            }
            zp("load_finish_progress", jSONObject, j7);
        }
    }

    public void zp(WebView webView, String str, Bitmap bitmap) {
        WebView webView2 = this.ox;
        if (webView2 != null) {
            try {
                WebBackForwardList copyBackForwardList = webView2.copyBackForwardList();
                if (copyBackForwardList != null && copyBackForwardList.getCurrentIndex() > this.UPs) {
                    this.cW.incrementAndGet();
                }
                this.UPs = copyBackForwardList.getCurrentIndex();
            } catch (Exception e4) {
                com.bytedance.sdk.component.utils.tG.zp("LandingPageLog", "copyBackForwardList exception", e4);
            }
        }
        if (this.QUv == 0) {
            this.QUv = SystemClock.elapsedRealtime();
        }
        com.bytedance.sdk.openadsdk.lMd.KS.COT cot = this.Lij;
        if (cot != null) {
            cot.COT();
        }
        if (this.COT.compareAndSet(false, true)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("render_type", "h5");
                jSONObject.putOpt("render_type_2", 0);
                int i9 = this.fRl;
                if (i9 >= 0) {
                    jSONObject.putOpt("preload_status", Integer.valueOf(i9));
                }
            } catch (Exception unused) {
            }
            zp("load_start", jSONObject);
        }
    }

    public void zp(WebView webView, String str, boolean z8) {
        com.bytedance.sdk.openadsdk.lMd.KS.COT cot = this.Lij;
        if (cot != null) {
            cot.HWF();
        }
        if (webView != null && !this.FP && this.RCv) {
            this.FP = true;
            com.bytedance.sdk.component.utils.vDp.zp(webView, "javascript:\nfunction sendScroll(){\n   var totalH = document.body.scrollHeight || document.documentElement.scrollHeight;\n   var clientH = window.innerHeight || document.documentElement.clientHeight;\n   var scrollH = document.body.scrollTop || document.documentElement.scrollTop;\n   var validH = scrollH + clientH;\n   var result = (validH/totalH*100).toFixed(2);\n   console.log('LandingPageLogscroll status: (' + scrollH + '+' + clientH + ')/' + totalH + '=' + result);\n   window.JS_LANDING_PAGE_LOG_OBJ.readPercent(result);\n}\nsendScroll();\nwindow.addEventListener('scroll', function(e){\n    sendScroll();\n});");
        }
        if (this.HWF.compareAndSet(false, true)) {
            if (this.jU != 3) {
                this.jU = 2;
            }
            this.KVG = System.currentTimeMillis();
            boolean z9 = this.jU == 2;
            int dT = dT();
            if (z9) {
                long j7 = this.pvr - this.vwr;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", this.YW);
                    jSONObject.put("error_msg", this.Bj);
                    jSONObject.put("error_url", this.vDp);
                    int i9 = this.fRl;
                    if (i9 >= 0) {
                        jSONObject.put("preload_status", i9);
                    }
                    jSONObject.put("first_page", dT);
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.put("url", this.rV.aax());
                    jSONObject.put("preload_h5_type", this.rV.ho());
                } catch (Exception unused) {
                }
                zp(z8, "0");
                long min = Math.min(j7, TTAdConstant.AD_MAX_EVENT_TIME);
                zp("load_finish", jSONObject, min);
                if (YW()) {
                    this.Pxi = SystemClock.elapsedRealtime();
                    HWF();
                    KS.zp(this.rV, this.BO, this.Pxi - this.ffE);
                }
                zp(str, "load_finish", min);
                YW yw = this.irS;
                if (yw != null) {
                    yw.zp(dT);
                    return;
                }
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("error_code", this.YW);
                jSONObject2.put("error_msg", this.Bj);
                jSONObject2.put("error_url", this.vDp);
                jSONObject2.put("first_page", dT);
                int i10 = this.fRl;
                if (i10 >= 0) {
                    jSONObject2.put("preload_status", i10);
                }
                jSONObject2.putOpt("render_type", "h5");
                jSONObject2.putOpt("render_type_2", 0);
                jSONObject2.put("url", this.rV.aax());
                jSONObject2.put("preload_h5_type", this.rV.ho());
            } catch (Exception unused2) {
            }
            zp(z8, MBridgeConstans.API_REUQEST_CATEGORY_APP);
            zp("load_fail", jSONObject2);
            if (YW()) {
                KS.zp(this.rV, this.BO, SystemClock.elapsedRealtime() - this.ffE, this.YW, this.Bj, this.vDp);
            }
            if (this.dT) {
                jSONObject2.remove("render_type");
                jSONObject2.remove("render_type_2");
                zp("load_fail_main", jSONObject2);
            }
        }
    }

    public void zp(WebView webView, int i9, String str, String str2, String str3, boolean z8) {
        com.bytedance.sdk.openadsdk.lMd.KS.COT cot = this.Lij;
        if (cot != null) {
            cot.zp((JSONObject) null);
        }
        if ((str3 == null || !str3.startsWith("image")) && this.jU != 2) {
            this.jU = 3;
        }
        this.YW = i9;
        this.Bj = str;
        this.vDp = str2;
        this.dT = z8;
    }

    public void zp(SSWebView sSWebView) {
        int sqt;
        Bitmap zp2;
        woN won;
        if ((!"landingpage".equals(this.dQp) && !"landingpage_endcard".equals(this.dQp) && !"landingpage_split_screen".equals(this.dQp) && !"landingpage_direct".equals(this.dQp) && !"aggregate_page".equals(this.dQp)) || (sqt = com.bytedance.sdk.openadsdk.core.KVG.jU().sqt()) == 0 || new Random().nextInt(100) + 1 > sqt || sSWebView == null || sSWebView.getWebView() == null || sSWebView.getVisibility() != 0 || (zp2 = WNy.zp(sSWebView)) == null || (won = this.rV) == null) {
            return;
        }
        WNy.zp(won, this.dQp, "landing_page_blank", zp2, sSWebView.getUrl(), this.KS);
    }

    private void zp(String str, JSONObject jSONObject) {
        zp(str, jSONObject, -1L);
    }

    private void zp(String str, JSONObject jSONObject, long j7) {
        if (!this.RCv || this.rV == null || TextUtils.isEmpty(str)) {
            return;
        }
        JSONObject jSONObject2 = null;
        if (jSONObject != null) {
            try {
                jSONObject.put("is_playable", cz.lMd(this.rV) ? 1 : 0);
                jSONObject.put("usecache", com.bytedance.sdk.openadsdk.core.video.lMd.zp.zp().zp(this.rV) ? 1 : 0);
            } catch (JSONException unused) {
            }
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("ad_extra_data", jSONObject.toString());
                    if (j7 > 0) {
                        jSONObject3.put("duration", j7);
                    }
                } catch (JSONException unused2) {
                }
                jSONObject2 = jSONObject3;
            } catch (JSONException unused3) {
            }
        }
        KS.KS(this.rV, this.dQp, str, jSONObject2);
    }

    private void zp(boolean z8, final String str) {
        if (z8) {
            final int dT = dT();
            KS.zp(new com.bytedance.sdk.component.ku.ku("sendPrefLog") { // from class: com.bytedance.sdk.openadsdk.lMd.dT.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        com.bytedance.sdk.openadsdk.core.settings.HWF Lij = com.bytedance.sdk.openadsdk.core.KVG.jU().Lij();
                        boolean zp2 = dT.this.zp(Lij, str);
                        if (!zp2) {
                            return;
                        }
                        if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.settings.HWF.lMd)) {
                            dT.this.zp(dT, str);
                            return;
                        }
                        if (!TextUtils.isEmpty(Lij.KS) && zp2) {
                            String str2 = Lij.KS;
                            com.bytedance.sdk.component.QR.lMd.lMd KS = com.bytedance.sdk.openadsdk.Bj.KS.zp().lMd().KS();
                            KS.lMd(str2);
                            HashMap hashMap = new HashMap();
                            hashMap.put("content-type", "application/json; charset=utf-8");
                            KS.jU(hashMap);
                            KS.zp(9);
                            KS.zp("sendPrefLog");
                            KS.zp(new com.bytedance.sdk.component.QR.zp.zp() { // from class: com.bytedance.sdk.openadsdk.lMd.dT.1.1
                                @Override // com.bytedance.sdk.component.QR.zp.zp
                                public void zp(com.bytedance.sdk.component.QR.lMd.KS ks, IOException iOException) {
                                }

                                @Override // com.bytedance.sdk.component.QR.zp.zp
                                public void zp(com.bytedance.sdk.component.QR.lMd.KS ks, com.bytedance.sdk.component.QR.lMd lmd) {
                                    try {
                                        com.bytedance.sdk.openadsdk.core.settings.HWF.lMd = lmd.jU();
                                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                        dT.this.zp(dT, str);
                                    } catch (Exception e4) {
                                        com.bytedance.sdk.component.utils.tG.zp("LandingPageLog", "TTWebViewClient : onPageFinished", e4);
                                    }
                                }
                            });
                        }
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.tG.lMd(th.getMessage());
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(int i9, String str) {
        try {
            if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.settings.HWF.lMd)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            StringBuilder sb = new StringBuilder(com.bytedance.sdk.openadsdk.core.settings.HWF.lMd);
            jSONObject.putOpt(BidResponsedEx.KEY_CID, zp().fgJ());
            jSONObject.putOpt("ad_id", zp().fgJ());
            jSONObject.put("log_extra", zp().GP());
            YhE.zp(sb, "\"/** adInfo **/\"", jSONObject.toString());
            YhE.zp(sb, "\"/** first_page **/\"", String.valueOf(i9));
            YhE.zp(sb, "\"/** ix_to_externalurl **/\"", this.KS != -1 ? "1" : "0");
            YhE.zp(sb, "\"/** preload_status **/\"", this.fRl == 2 ? MBridgeConstans.API_REUQEST_CATEGORY_APP : "0");
            YhE.zp(sb, "\"/** scene_state **/\"", str);
            YhE.zp(sb, "\"/** web_init_time **/\"", String.valueOf(this.Iv));
            YhE.zp(sb, "\"/** channel_name **/\"", "\"" + zp().fVt() + "\"");
            YhE.zp(sb, "\"/** session_id **/\"", "\"" + UUID.randomUUID().toString() + "\"");
            YhE.zp(sb, "\"/** web_url **/\"", "\"" + zp().aax() + "\"");
            String sb2 = sb.toString();
            if (TextUtils.isEmpty(sb2)) {
                return;
            }
            final String KS = KS(sb2);
            if (TextUtils.isEmpty(KS) || this.ox == null) {
                return;
            }
            QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.lMd.dT.2
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.component.utils.vDp.zp(dT.this.ox, KS);
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.tG.lMd(th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean zp(com.bytedance.sdk.openadsdk.core.settings.HWF hwf, String str) {
        str.getClass();
        char c9 = 65535;
        switch (str.hashCode()) {
            case 48:
                if (str.equals("0")) {
                    c9 = 0;
                    break;
                }
                break;
            case 49:
                if (str.equals("1")) {
                    c9 = 1;
                    break;
                }
                break;
            case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                if (str.equals(MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
                    c9 = 2;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
                return hwf.jU;
            case 1:
                return hwf.COT;
            case 2:
                return hwf.HWF;
            default:
                return false;
        }
    }
}
