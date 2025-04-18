package com.bytedance.sdk.openadsdk.AlY;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.model.Ne;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.widget.YFl.vc;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.bytedance.sdk.openadsdk.utils.mn;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class eT {
    private static final int[] Sg = {10, 30, 50, 75, 100};
    private long AlY;
    private volatile long BPI;
    private long Bh;
    private WeakReference<WebView> Cfr;
    private final AtomicBoolean DSW;
    private com.bytedance.sdk.openadsdk.core.widget.YFl.vc EH;
    private String GA;
    private final AtomicInteger GS;
    private final boolean Ga;
    private String Ld;
    private long Ne;
    private final AtomicBoolean NjR;
    private volatile long Sco;
    private volatile int UI;
    private long UZM;
    private long VOe;
    private qsH Wwa;
    public vc.YFl YFl;
    private boolean YI;
    private String YoT;
    private int ZU;
    private String aIu;
    private long bZ;
    private final AtomicBoolean dGX;
    private final AtomicInteger dXO;
    private boolean eT;
    private final AtomicBoolean fIu;
    private boolean hQ;
    private String iY;
    private volatile long ko;
    private com.bytedance.sdk.openadsdk.qO.qsH lG;
    private final AtomicInteger lu;
    private final AtomicBoolean mB;
    private boolean mn;

    /* renamed from: nc, reason: collision with root package name */
    private int f10499nc;
    private final Context pDU;
    private com.bytedance.sdk.openadsdk.AlY.AlY.wN pq;
    private final Wwa qO;
    private final AtomicBoolean qsH;
    private boolean rkt;
    private int tN;

    /* renamed from: vc, reason: collision with root package name */
    private final AtomicBoolean f10500vc;
    private int wN;
    private long wXo;
    private nc zB;
    private volatile long zG;

    /* loaded from: classes.dex */
    public class YFl {
        private YFl() {
        }

        @JavascriptInterface
        public String getUrl() {
            return "";
        }

        @JavascriptInterface
        public void readPercent(String str) {
            int i10 = 0;
            try {
                int intValue = Float.valueOf(str).intValue();
                if (intValue > 100) {
                    i10 = 100;
                } else if (intValue >= 0) {
                    i10 = intValue;
                }
            } catch (Throwable unused) {
            }
            eT.this.dXO.set(i10);
        }
    }

    public eT(Wwa wwa, WebView webView, nc ncVar, int i10) {
        this(wwa, webView);
        this.zB = ncVar;
        this.ZU = i10;
    }

    private boolean NjR() {
        Wwa wwa;
        return this.mn && (wwa = this.qO) != null && wwa.MZ();
    }

    private int nc() {
        WebView webView;
        WeakReference<WebView> weakReference = this.Cfr;
        if (weakReference != null) {
            webView = weakReference.get();
        } else {
            webView = null;
        }
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

    public void AlY() {
        if (NjR()) {
            this.BPI = SystemClock.elapsedRealtime();
            tN.YFl(this.qO, this.iY);
        }
    }

    public void DSW() {
        if (this.UZM == 0) {
            this.UZM = System.currentTimeMillis();
        }
        this.wXo = System.currentTimeMillis();
        if ("landingpage".equals(this.aIu) || "landingpage_endcard".equals(this.aIu) || "landingpage_split_screen".equals(this.aIu) || "landingpage_direct".equals(this.aIu) || "aggregate_page".equals(this.aIu)) {
            if (this.dGX.compareAndSet(false, true)) {
                com.bytedance.sdk.openadsdk.vc.Sg.YFl().YFl("landingStart", this.qO, this.Ld);
            } else {
                com.bytedance.sdk.openadsdk.vc.Sg.YFl().YFl("landingContinue", this.qO, this.Ld);
            }
        }
    }

    public void qsH() {
        boolean z10;
        if (!"landingpage".equals(this.aIu) && !"landingpage_endcard".equals(this.aIu) && !"landingpage_split_screen".equals(this.aIu) && !"landingpage_direct".equals(this.aIu) && !"aggregate_page".equals(this.aIu)) {
            return;
        }
        if (this.wN == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.Ne > 0 || !tN()) {
                long currentTimeMillis = System.currentTimeMillis() - Math.max(this.wXo, this.Ne);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("load_status", this.wN);
                    jSONObject.put("max_scroll_percent", this.dXO.get());
                    jSONObject.put("jump_times", this.GS.getAndSet(0));
                    jSONObject.put("click_times", this.lu.getAndSet(0));
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                } catch (JSONException unused) {
                }
                this.NjR.set(true);
                YFl("stay_page", jSONObject, Math.min(currentTimeMillis, TTAdConstant.AD_MAX_EVENT_TIME));
                com.bytedance.sdk.openadsdk.vc.Sg.YFl().YFl("landingPause", this.qO, this.Ld);
            }
        }
    }

    public boolean tN() {
        return this.mn;
    }

    public void vc() {
        if (NjR() && this.zG > 0 && this.ko > 0 && !this.fIu.getAndSet(true)) {
            tN.Sg(this.ko - this.zG, this.qO, this.iY, (String) null);
        }
    }

    public void wN() {
        if (NjR()) {
            this.zG = SystemClock.elapsedRealtime();
            vc();
        }
    }

    private String tN(String str) {
        return "javascript:".concat(String.valueOf(str));
    }

    public com.bytedance.sdk.openadsdk.AlY.AlY.wN Sg() {
        return this.pq;
    }

    public void Sg(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.iY = str;
    }

    public void tN(boolean z10) {
        WeakReference<WebView> weakReference = this.Cfr;
        WebView webView = weakReference != null ? weakReference.get() : null;
        if (webView != null) {
            try {
                webView.removeJavascriptInterface("JS_LANDING_PAGE_LOG_OBJ");
            } catch (Exception e2) {
                com.bytedance.sdk.component.utils.YoT.YFl("LandingPageLog", "removeJavascriptInterface exception", e2);
            }
        }
        if (this.DSW.compareAndSet(false, true)) {
            YFl(z10, "1");
            if (this.hQ) {
                tN.YFl(this.qO, this.aIu, System.currentTimeMillis() - this.UZM, this.ZU, nc());
            }
        } else if (this.wN == 2 && !this.NjR.get()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("load_status", this.wN);
                jSONObject.put("max_scroll_percent", this.dXO.get());
                jSONObject.put("jump_times", this.GS.getAndSet(0));
                jSONObject.put("click_times", this.lu.getAndSet(0));
                jSONObject.putOpt("render_type", "h5");
                jSONObject.putOpt("render_type_2", 0);
            } catch (JSONException unused) {
            }
            YFl("stay_page", jSONObject, 0L);
        }
        if ("landingpage".equals(this.aIu) || "landingpage_endcard".equals(this.aIu) || "landingpage_split_screen".equals(this.aIu) || "landingpage_direct".equals(this.aIu) || "aggregate_page".equals(this.aIu)) {
            com.bytedance.sdk.openadsdk.vc.Sg.YFl().YFl("landingFinish", this.qO, this.Ld);
        }
    }

    public eT(Wwa wwa, WebView webView) {
        this.tN = 0;
        this.AlY = -1L;
        this.wN = 1;
        this.f10500vc = new AtomicBoolean(false);
        this.DSW = new AtomicBoolean(false);
        this.qsH = new AtomicBoolean(false);
        this.NjR = new AtomicBoolean(false);
        this.f10499nc = -1;
        this.aIu = "landingpage";
        this.wXo = 0L;
        this.Ne = 0L;
        this.VOe = 0L;
        this.bZ = 0L;
        this.UZM = 0L;
        this.YI = false;
        this.Ga = false;
        this.dXO = new AtomicInteger(0);
        this.hQ = false;
        this.mn = false;
        this.Sco = 0L;
        this.GS = new AtomicInteger(0);
        this.lu = new AtomicInteger(0);
        this.mB = new AtomicBoolean(false);
        this.UI = 0;
        this.ZU = -1;
        this.fIu = new AtomicBoolean(false);
        this.dGX = new AtomicBoolean(false);
        Context YFl2 = com.bytedance.sdk.openadsdk.core.lG.YFl();
        this.pDU = YFl2;
        this.qO = wwa;
        if (webView == null) {
            return;
        }
        WeakReference<WebView> weakReference = new WeakReference<>(webView);
        this.Cfr = weakReference;
        WebView webView2 = weakReference.get();
        if (webView2 == null) {
            return;
        }
        if (wwa != null && wwa.fIu()) {
            com.bytedance.sdk.openadsdk.core.widget.YFl.vc vcVar = new com.bytedance.sdk.openadsdk.core.widget.YFl.vc(webView2, wwa, YFl2);
            this.EH = vcVar;
            this.YFl = vcVar.tN();
        }
        if (wwa != null && wwa.iY() && com.bytedance.sdk.openadsdk.core.settings.rkt.JwO().dU()) {
            this.Wwa = new qsH(wwa, webView);
        }
        if (webView instanceof com.bytedance.sdk.component.NjR.tN) {
            this.Bh = ((com.bytedance.sdk.component.NjR.tN) webView2).YFl;
        } else {
            this.Bh = System.currentTimeMillis();
        }
        try {
            webView2.addJavascriptInterface(new YFl(), "JS_LANDING_PAGE_LOG_OBJ");
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.YoT.YFl("LandingPageLog", "addJavascriptInterface exception", e2);
        }
        if (wwa != null && wwa.JB() != null) {
            this.AlY = wwa.JB().optLong("page_id", -1L);
        }
        this.Ld = String.valueOf(SystemClock.elapsedRealtime());
    }

    public Wwa YFl() {
        return this.qO;
    }

    public void Sg(boolean z10) {
        this.mn = z10;
    }

    public void YFl(long j3) {
        this.Ne = j3;
    }

    public void Sg(WebView webView, String str, boolean z10) {
        qsH qsh = this.Wwa;
        if (qsh == null || !z10) {
            return;
        }
        qsh.YFl(webView, str);
    }

    public void YFl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.YFl.vc vcVar = this.EH;
        if (vcVar != null) {
            vcVar.YFl(str);
        }
        qsH qsh = this.Wwa;
        if (qsh != null) {
            qsh.AlY(str);
        }
        this.aIu = str;
    }

    public void Sg(int i10) {
        com.bytedance.sdk.openadsdk.core.widget.YFl.vc vcVar = this.EH;
        if (vcVar == null || !this.rkt) {
            return;
        }
        vcVar.YFl(i10);
    }

    public void YFl(int i10) {
        this.ZU = i10;
    }

    public void YFl(com.bytedance.sdk.openadsdk.AlY.AlY.wN wNVar) {
        this.pq = wNVar;
    }

    public eT YFl(boolean z10) {
        this.hQ = z10;
        return this;
    }

    public void YFl(com.bytedance.sdk.openadsdk.qO.qsH qsh) {
        this.lG = qsh;
    }

    public void YFl(WebView webView, int i10) {
        if (webView == null) {
            return;
        }
        if (this.Sco == 0) {
            this.Sco = SystemClock.elapsedRealtime();
        }
        if (this.VOe == 0 && i10 > 0) {
            this.VOe = System.currentTimeMillis();
        } else if (this.bZ == 0 && i10 == 100) {
            this.bZ = System.currentTimeMillis();
        }
        if (this.tN != Sg.length && ("landingpage".equals(this.aIu) || "landingpage_endcard".equals(this.aIu) || "landingpage_split_screen".equals(this.aIu) || "landingpage_direct".equals(this.aIu) || "aggregate_page".equals(this.aIu))) {
            int i11 = this.tN;
            while (true) {
                int[] iArr = Sg;
                if (i11 >= iArr.length || i10 < iArr[this.tN]) {
                    break;
                }
                int i12 = i11 + 1;
                this.tN = i12;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", webView.getUrl());
                    long j3 = this.AlY;
                    if (j3 != -1) {
                        jSONObject.put("page_id", j3);
                    }
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.put("pct", iArr[i11]);
                } catch (Exception unused) {
                }
                YFl("progress_load_finish", jSONObject);
                i11 = i12;
            }
        }
        if (i10 == 100) {
            YFl(webView.getUrl(), NotificationCompat.CATEGORY_PROGRESS, Math.min(this.bZ - this.VOe, TTAdConstant.AD_MAX_EVENT_TIME));
        }
    }

    private void YFl(String str, String str2, long j3) {
        if (this.qsH.compareAndSet(false, true)) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (str.length() > 200) {
                    int indexOf = str.indexOf(38, 200);
                    int i10 = 300;
                    if (indexOf == -1 || indexOf > 300) {
                        indexOf = str.indexOf(63);
                    }
                    if (indexOf != -1 && indexOf <= 300) {
                        i10 = indexOf;
                    }
                    str = str.substring(0, i10);
                }
                jSONObject.put("url", str);
                jSONObject.put("type", str2);
            } catch (Throwable unused) {
            }
            YFl("load_finish_progress", jSONObject, j3);
        }
    }

    public void YFl(WebView webView, String str, Bitmap bitmap, boolean z10) {
        this.rkt = z10;
        com.bytedance.sdk.openadsdk.core.widget.YFl.vc vcVar = this.EH;
        if (vcVar != null && z10) {
            vcVar.Sg(str);
            this.EH.Sg();
        }
        qsH qsh = this.Wwa;
        if (qsh != null && z10) {
            qsh.YFl(str);
        }
        WeakReference<WebView> weakReference = this.Cfr;
        WebView webView2 = weakReference != null ? weakReference.get() : null;
        if (webView2 != null) {
            try {
                WebBackForwardList copyBackForwardList = webView2.copyBackForwardList();
                if (copyBackForwardList != null && copyBackForwardList.getCurrentIndex() > this.UI) {
                    this.GS.incrementAndGet();
                }
                this.UI = copyBackForwardList.getCurrentIndex();
            } catch (Exception e2) {
                com.bytedance.sdk.component.utils.YoT.YFl("LandingPageLog", "copyBackForwardList exception", e2);
            }
        }
        if (this.Sco == 0) {
            this.Sco = SystemClock.elapsedRealtime();
        }
        com.bytedance.sdk.openadsdk.AlY.AlY.wN wNVar = this.pq;
        if (wNVar != null) {
            wNVar.wN();
        }
        if (this.f10500vc.compareAndSet(false, true)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("render_type", "h5");
                jSONObject.putOpt("render_type_2", 0);
                int i10 = this.ZU;
                if (i10 >= 0) {
                    jSONObject.putOpt("preload_status", Integer.valueOf(i10));
                }
            } catch (Exception unused) {
            }
            YFl("load_start", jSONObject);
        }
    }

    public void YFl(WebView webView, String str, boolean z10) {
        com.bytedance.sdk.openadsdk.core.widget.YFl.vc vcVar = this.EH;
        if (vcVar != null && z10) {
            vcVar.YFl();
        }
        com.bytedance.sdk.openadsdk.AlY.AlY.wN wNVar = this.pq;
        if (wNVar != null) {
            wNVar.vc();
        }
        qsH qsh = this.Wwa;
        if (qsh != null && z10) {
            qsh.Sg(str);
        }
        if (webView != null && !this.YI && this.hQ) {
            this.YI = true;
            com.bytedance.sdk.component.utils.eT.YFl(webView, "javascript:\nfunction sendScroll(){\n   var totalH = document.body.scrollHeight || document.documentElement.scrollHeight;\n   var clientH = window.innerHeight || document.documentElement.clientHeight;\n   var scrollH = document.body.scrollTop || document.documentElement.scrollTop;\n   var validH = scrollH + clientH;\n   var result = (validH/totalH*100).toFixed(2);\n   console.log('LandingPageLogscroll status: (' + scrollH + '+' + clientH + ')/' + totalH + '=' + result);\n   window.JS_LANDING_PAGE_LOG_OBJ.readPercent(result);\n}\nsendScroll();\nwindow.addEventListener('scroll', function(e){\n    sendScroll();\n});");
        }
        if (this.DSW.compareAndSet(false, true)) {
            if (this.wN != 3) {
                this.wN = 2;
            }
            this.wXo = System.currentTimeMillis();
            boolean z11 = this.wN == 2;
            int nc2 = nc();
            if (z11) {
                long j3 = this.bZ - this.VOe;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", this.f10499nc);
                    jSONObject.put("error_msg", this.YoT);
                    jSONObject.put("error_url", this.GA);
                    int i10 = this.ZU;
                    if (i10 >= 0) {
                        jSONObject.put("preload_status", i10);
                    }
                    jSONObject.put("first_page", nc2);
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.put("url", this.qO.Cqy());
                    jSONObject.put("preload_h5_type", this.qO.rnG());
                } catch (Exception unused) {
                }
                YFl(z10, "0");
                long min = Math.min(j3, TTAdConstant.AD_MAX_EVENT_TIME);
                YFl("load_finish", jSONObject, min);
                if (NjR()) {
                    this.ko = SystemClock.elapsedRealtime();
                    vc();
                    tN.YFl(this.qO, this.iY, this.ko - this.BPI);
                }
                YFl(str, "load_finish", min);
                nc ncVar = this.zB;
                if (ncVar != null) {
                    ncVar.YFl(nc2);
                    return;
                }
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("error_code", this.f10499nc);
                jSONObject2.put("error_msg", this.YoT);
                jSONObject2.put("error_url", this.GA);
                jSONObject2.put("first_page", nc2);
                int i11 = this.ZU;
                if (i11 >= 0) {
                    jSONObject2.put("preload_status", i11);
                }
                jSONObject2.putOpt("render_type", "h5");
                jSONObject2.putOpt("render_type_2", 0);
                jSONObject2.put("url", this.qO.Cqy());
                jSONObject2.put("preload_h5_type", this.qO.rnG());
            } catch (Exception unused2) {
            }
            YFl(z10, MBridgeConstans.API_REUQEST_CATEGORY_APP);
            YFl("load_fail", jSONObject2);
            if (NjR()) {
                tN.YFl(this.qO, this.iY, SystemClock.elapsedRealtime() - this.BPI, this.f10499nc, this.YoT, this.GA);
            }
            if (this.eT) {
                jSONObject2.remove("render_type");
                jSONObject2.remove("render_type_2");
                YFl("load_fail_main", jSONObject2);
            }
        }
    }

    public void YFl(WebView webView, int i10, String str, String str2, String str3, boolean z10) {
        com.bytedance.sdk.openadsdk.AlY.AlY.wN wNVar = this.pq;
        if (wNVar != null) {
            wNVar.YFl((JSONObject) null);
        }
        if (!(str3 != null && str3.startsWith("image")) && this.wN != 2) {
            this.wN = 3;
        }
        this.f10499nc = i10;
        this.YoT = str;
        this.GA = str2;
        this.eT = z10;
    }

    public void YFl(com.bytedance.sdk.component.NjR.AlY alY) {
        int Hjb;
        Bitmap YFl2;
        Wwa wwa;
        if ((!"landingpage".equals(this.aIu) && !"landingpage_endcard".equals(this.aIu) && !"landingpage_split_screen".equals(this.aIu) && !"landingpage_direct".equals(this.aIu) && !"aggregate_page".equals(this.aIu)) || (Hjb = com.bytedance.sdk.openadsdk.core.lG.AlY().Hjb()) == 0 || new Random().nextInt(100) + 1 > Hjb || alY == null || alY.getWebView() == null || alY.getVisibility() != 0 || (YFl2 = GS.YFl(alY)) == null || (wwa = this.qO) == null) {
            return;
        }
        GS.YFl(wwa, this.aIu, "landing_page_blank", YFl2, alY.getUrl(), this.AlY);
    }

    private void YFl(String str, JSONObject jSONObject) {
        YFl(str, jSONObject, -1L);
    }

    private void YFl(final String str, final JSONObject jSONObject, final long j3) {
        if (!this.hQ || this.qO == null || TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.qO.qsH qsh = this.lG;
        final int GS = qsh != null ? qsh.GS() : -1;
        tN.YFl(System.currentTimeMillis(), this.qO, this.aIu, str, new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.eT.1
            @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
            public JSONObject YFl() {
                int i10;
                if (jSONObject == null) {
                    return null;
                }
                try {
                    boolean Sg2 = Ne.Sg(eT.this.qO);
                    JSONObject jSONObject2 = jSONObject;
                    int i11 = 1;
                    if (Sg2) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    jSONObject2.put("is_playable", i10);
                    JSONObject jSONObject3 = jSONObject;
                    if (!com.bytedance.sdk.openadsdk.core.GA.tN.YFl.YFl().YFl(eT.this.qO)) {
                        i11 = 0;
                    }
                    jSONObject3.put("usecache", i11);
                    if (Sg2 && ("load_finish".equals(str) || "load_fail".equals(str))) {
                        jSONObject.put("playable_has_show", GS);
                    }
                } catch (JSONException unused) {
                }
                try {
                    JSONObject jSONObject4 = new JSONObject();
                    try {
                        jSONObject4.put("ad_extra_data", jSONObject.toString());
                        long j10 = j3;
                        if (j10 > 0) {
                            jSONObject4.put("duration", j10);
                        }
                    } catch (JSONException unused2) {
                    }
                    return jSONObject4;
                } catch (JSONException unused3) {
                    return null;
                }
            }
        });
    }

    public void YFl(MotionEvent motionEvent) {
        com.bytedance.sdk.openadsdk.core.widget.YFl.vc vcVar = this.EH;
        if (vcVar != null && this.rkt) {
            vcVar.YFl(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.Sco != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.lu.incrementAndGet();
                if (this.mB.getAndSet(true)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", this.qO.Cqy());
                } catch (JSONException unused) {
                }
                YFl("click_time", jSONObject, Math.max(SystemClock.elapsedRealtime() - this.Sco, 0L));
            }
        }
    }

    public void YFl(String str, boolean z10) {
        com.bytedance.sdk.openadsdk.core.widget.YFl.vc vcVar = this.EH;
        if (vcVar != null && z10) {
            vcVar.tN(str);
        }
        qsH qsh = this.Wwa;
        if (qsh == null || !z10) {
            return;
        }
        qsh.tN(str);
    }

    private void YFl(boolean z10, final String str) {
        if (z10) {
            final int nc2 = nc();
            tN.YFl(new com.bytedance.sdk.component.qsH.qsH("sendPrefLog") { // from class: com.bytedance.sdk.openadsdk.AlY.eT.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        com.bytedance.sdk.openadsdk.core.settings.DSW UZM = com.bytedance.sdk.openadsdk.core.lG.AlY().UZM();
                        boolean YFl2 = eT.this.YFl(UZM, str);
                        if (!YFl2) {
                            return;
                        }
                        if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.settings.DSW.Sg)) {
                            eT.this.YFl(nc2, str);
                            return;
                        }
                        if (!TextUtils.isEmpty(UZM.tN) && YFl2) {
                            String str2 = UZM.tN;
                            com.bytedance.sdk.component.DSW.Sg.Sg tN = com.bytedance.sdk.openadsdk.lG.tN.YFl().Sg().tN();
                            tN.Sg(str2);
                            HashMap hashMap = new HashMap();
                            hashMap.put("content-type", "application/json; charset=utf-8");
                            tN.AlY(hashMap);
                            tN.YFl(9);
                            tN.YFl("sendPrefLog");
                            tN.YFl(new com.bytedance.sdk.component.DSW.YFl.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.eT.2.1
                                @Override // com.bytedance.sdk.component.DSW.YFl.YFl
                                public void YFl(com.bytedance.sdk.component.DSW.Sg.tN tNVar, IOException iOException) {
                                }

                                @Override // com.bytedance.sdk.component.DSW.YFl.YFl
                                public void YFl(com.bytedance.sdk.component.DSW.Sg.tN tNVar, com.bytedance.sdk.component.DSW.Sg sg2) {
                                    try {
                                        com.bytedance.sdk.openadsdk.core.settings.DSW.Sg = sg2.AlY();
                                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                        eT.this.YFl(nc2, str);
                                    } catch (Exception e2) {
                                        com.bytedance.sdk.component.utils.YoT.YFl("LandingPageLog", "TTWebViewClient : onPageFinished", e2);
                                    }
                                }
                            });
                        }
                    } catch (Throwable th2) {
                        com.bytedance.sdk.component.utils.YoT.Sg(th2.getMessage());
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(int i10, String str) {
        try {
            if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.settings.DSW.Sg)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            StringBuilder sb2 = new StringBuilder(com.bytedance.sdk.openadsdk.core.settings.DSW.Sg);
            jSONObject.putOpt(BidResponsedEx.KEY_CID, YFl().zz());
            jSONObject.putOpt("ad_id", YFl().zz());
            jSONObject.put("log_extra", YFl().uGS());
            Sco.YFl(sb2, "\"/** adInfo **/\"", jSONObject.toString());
            Sco.YFl(sb2, "\"/** first_page **/\"", String.valueOf(i10));
            Sco.YFl(sb2, "\"/** ix_to_externalurl **/\"", this.AlY != -1 ? "1" : "0");
            Sco.YFl(sb2, "\"/** preload_status **/\"", this.ZU == 2 ? MBridgeConstans.API_REUQEST_CATEGORY_APP : "0");
            Sco.YFl(sb2, "\"/** scene_state **/\"", str);
            Sco.YFl(sb2, "\"/** web_init_time **/\"", String.valueOf(this.Bh));
            Sco.YFl(sb2, "\"/** channel_name **/\"", "\"" + YFl().DjU() + "\"");
            Sco.YFl(sb2, "\"/** session_id **/\"", "\"" + UUID.randomUUID().toString() + "\"");
            Sco.YFl(sb2, "\"/** web_url **/\"", "\"" + YFl().Cqy() + "\"");
            String sb3 = sb2.toString();
            if (TextUtils.isEmpty(sb3)) {
                return;
            }
            final String tN = tN(sb3);
            WeakReference<WebView> weakReference = this.Cfr;
            final WebView webView = weakReference != null ? weakReference.get() : null;
            if (TextUtils.isEmpty(tN) || webView == null) {
                return;
            }
            mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.AlY.eT.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.component.utils.eT.YFl(webView, tN);
                }
            });
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.Sg(th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean YFl(com.bytedance.sdk.openadsdk.core.settings.DSW dsw, String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 48:
                if (str.equals("0")) {
                    c10 = 0;
                    break;
                }
                break;
            case 49:
                if (str.equals("1")) {
                    c10 = 1;
                    break;
                }
                break;
            case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                if (str.equals(MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return dsw.AlY;
            case 1:
                return dsw.wN;
            case 2:
                return dsw.f10741vc;
            default:
                return false;
        }
    }
}
