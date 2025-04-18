package com.bytedance.sdk.openadsdk.component.reward.YFl;

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
import android.view.MotionEvent;
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
import com.bytedance.sdk.component.NjR.AlY;
import com.bytedance.sdk.component.adexpress.AlY.nc;
import com.bytedance.sdk.openadsdk.AlY.tN;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.Sg.Sg;
import com.bytedance.sdk.openadsdk.core.Sg.tN;
import com.bytedance.sdk.openadsdk.core.hQ;
import com.bytedance.sdk.openadsdk.core.model.Ne;
import com.bytedance.sdk.openadsdk.core.widget.YFl.vc;
import com.bytedance.sdk.openadsdk.core.zB;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import eb.j;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p5.a;
import vd.e;

/* loaded from: classes.dex */
public class Wwa implements com.bytedance.sdk.openadsdk.YoT.DSW {
    protected String AlY;
    private boolean BPI;
    private int Bh;
    private ILoader Cqy;
    private int EH;
    private int GA;
    private final com.bytedance.sdk.openadsdk.component.reward.YFl.YFl GS;
    private float Ga;
    private com.bytedance.sdk.openadsdk.common.tN Hjb;
    private String Ld;
    private boolean Ne;
    private boolean Sco;
    hQ Sg;
    private boolean UI;
    private View UZM;
    private boolean VOe;
    private com.bytedance.sdk.component.NjR.AlY Wwa;
    hQ YFl;
    private float YI;
    private final String YoT;
    private boolean ZU;
    private View bZ;
    private long dXO;

    /* renamed from: dd, reason: collision with root package name */
    private boolean f10584dd;

    @NonNull
    private final com.bytedance.sdk.openadsdk.core.model.Wwa eT;
    private long fIu;

    /* renamed from: ib, reason: collision with root package name */
    private vc.YFl f10585ib;
    private com.bytedance.sdk.component.NjR.AlY lG;
    private String lL;
    private com.bytedance.sdk.openadsdk.core.widget.YFl.wN mB;
    private final boolean pDU;
    protected com.bytedance.sdk.openadsdk.AlY.AlY.wN qsH;
    private int rkt;
    private boolean tQ;
    com.bytedance.sdk.openadsdk.AlY.eT wN;
    private boolean wXo;
    private com.bytedance.sdk.openadsdk.common.YoT zB;
    private boolean zG;
    private boolean zz;
    protected boolean tN = true;
    private boolean qO = false;
    private final AtomicBoolean aIu = new AtomicBoolean(true);

    /* renamed from: vc, reason: collision with root package name */
    int f10587vc = 0;
    String DSW = "";
    boolean NjR = false;
    private SparseArray<tN.YFl> Cfr = new SparseArray<>();
    private boolean hQ = true;
    private float pq = -1.0f;
    private float mn = -1.0f;
    private boolean lu = false;
    private long ko = -1;
    private volatile int iY = 0;
    private int dGX = -1;
    private volatile int VB = 0;
    private volatile int Jc = 0;
    private long RX = 0;

    /* renamed from: nc, reason: collision with root package name */
    public boolean f10586nc = false;
    private int Vmj = -1;

    /* loaded from: classes.dex */
    public interface AlY {
        void YFl(WebView webView, int i10);

        void YFl(WebView webView, String str);

        void YFl(WebView webView, String str, Bitmap bitmap);
    }

    /* loaded from: classes.dex */
    public static class Sg implements com.bytedance.sdk.openadsdk.YoT.YFl {
        private final View YFl;

        public Sg(View view) {
            this.YFl = view;
        }

        @Override // com.bytedance.sdk.openadsdk.YoT.YFl
        public int Sg() {
            int i10;
            View view = this.YFl;
            if (view != null) {
                i10 = view.getMeasuredWidth();
            } else {
                i10 = -1;
            }
            if (i10 <= 0) {
                return GS.tN(com.bytedance.sdk.openadsdk.core.lG.YFl());
            }
            return i10;
        }

        @Override // com.bytedance.sdk.openadsdk.YoT.YFl
        public int YFl() {
            int i10;
            View view = this.YFl;
            if (view != null) {
                i10 = view.getMeasuredHeight();
            } else {
                i10 = -1;
            }
            if (i10 <= 0) {
                return GS.AlY(com.bytedance.sdk.openadsdk.core.lG.YFl());
            }
            return i10;
        }
    }

    /* loaded from: classes.dex */
    public static class tN implements com.bytedance.sdk.openadsdk.YoT.NjR {
        private final com.bytedance.sdk.component.NjR.AlY YFl;

        @Override // com.bytedance.sdk.openadsdk.YoT.NjR
        public void Sg() {
            com.bytedance.sdk.component.NjR.AlY alY = this.YFl;
            if (alY == null) {
                return;
            }
            alY.pDU();
        }

        @Override // com.bytedance.sdk.openadsdk.YoT.NjR
        public void YFl() {
            com.bytedance.sdk.component.NjR.AlY alY = this.YFl;
            if (alY == null) {
                return;
            }
            alY.eT();
        }

        private tN(com.bytedance.sdk.component.NjR.AlY alY) {
            this.YFl = alY;
        }
    }

    public Wwa(com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl) {
        this.GS = yFl;
        this.eT = yFl.Sg;
        this.YoT = yFl.wN;
        this.pDU = yFl.AlY;
    }

    private void fIu() {
        this.Sg.YFl("showPlayableEndCardOverlay", (JSONObject) null);
        this.GS.zG.sendEmptyMessageDelayed(600, 1000L);
        this.GS.zG.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.Wwa.5
            @Override // java.lang.Runnable
            public void run() {
                Wwa.this.ko();
            }
        }, 1000L);
        com.bytedance.sdk.openadsdk.utils.eT eTVar = this.GS.Bn;
        if (eTVar != null) {
            eTVar.YFl(0L);
        }
    }

    private com.bytedance.sdk.openadsdk.AlY.AlY.wN iY() {
        int i10;
        String str;
        if (Ne.DSW(this.eT)) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        if (this.pDU) {
            str = "rewarded_video";
        } else {
            str = "fullscreen_interstitial_ad";
        }
        return new com.bytedance.sdk.openadsdk.AlY.lG(i10, str, this.eT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ko() {
        this.UI = true;
        this.zz = false;
        this.GS.zG.removeMessages(600);
        this.GS.zG.removeMessages(700);
        this.GS.zG.removeMessages(900);
        this.GS.Sco.AlY(false);
        this.GS.qO.set(true);
        this.GS.Vmj.EH();
        this.eT.xSx();
        if (!this.eT.xSx() && Sco.qsH(Ne.YFl(this.eT))) {
            View nc2 = this.GS.lu.nc();
            View.OnClickListener onClickListener = (View.OnClickListener) nc2.getTag(nc2.getId());
            if (onClickListener != null) {
                YFl yFl = new YFl(this.GS, nc2, onClickListener);
                nc2.setOnClickListener(yFl);
                nc2.setOnTouchListener(yFl);
            }
        }
    }

    public static /* synthetic */ int lG(Wwa wwa) {
        int i10 = wwa.iY;
        wwa.iY = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int pDU(Wwa wwa) {
        int i10 = wwa.VB;
        wwa.VB = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int rkt(Wwa wwa) {
        int i10 = wwa.Jc;
        wwa.Jc = i10 + 1;
        return i10;
    }

    public boolean BPI() {
        return this.UI;
    }

    public void GS() {
        GS.YFl((View) this.Wwa, 8);
    }

    public void Sco() {
        GS.YFl((View) this.lG, 0);
        GS.YFl((View) this.Wwa, 8);
    }

    public boolean UI() {
        com.bytedance.sdk.component.NjR.AlY alY = this.lG;
        return alY == null || alY.getWebView() == null;
    }

    public void ZU() {
        com.bytedance.sdk.openadsdk.AlY.eT eTVar = this.wN;
        if (eTVar != null) {
            eTVar.wN();
        }
    }

    public boolean lu() {
        return this.wXo && this.aIu.get();
    }

    public boolean mB() {
        return this.zz;
    }

    public boolean zB() {
        hQ hQVar = this.YFl;
        if (hQVar == null) {
            return false;
        }
        return hQVar.qsH();
    }

    public boolean zG() {
        return this.f10586nc;
    }

    public void Cfr() {
        com.bytedance.sdk.openadsdk.AlY.eT eTVar = this.wN;
        if (eTVar != null) {
            eTVar.YFl(System.currentTimeMillis());
        }
    }

    public void EH() {
        a BPI;
        if (Ne.wN(this.eT)) {
            com.bytedance.sdk.openadsdk.core.model.Wwa wwa = this.eT;
            if (wwa != null && (BPI = wwa.BPI()) != null) {
                this.AlY = BPI.f23463h;
            }
        } else {
            this.AlY = Ne.GA(this.eT);
        }
        String YFl2 = YFl(this.AlY, this.eT, this.GA, this.rkt, this.EH);
        this.AlY = YFl2;
        if (TextUtils.isEmpty(YFl2)) {
            return;
        }
        this.ZU = this.AlY.contains("use_second_endcard=1");
    }

    public hQ GA() {
        return this.Sg;
    }

    public void Ga() {
        com.bytedance.sdk.openadsdk.AlY.AlY.wN wNVar = this.qsH;
        if (wNVar != null) {
            wNVar.qsH();
        }
    }

    public void Ne() {
        com.bytedance.sdk.component.NjR.AlY alY = this.lG;
        if (alY != null) {
            alY.NjR();
        }
        com.bytedance.sdk.component.NjR.AlY alY2 = this.Wwa;
        if (alY2 != null) {
            alY2.NjR();
        }
        if (this.ko == 0) {
            this.ko = SystemClock.elapsedRealtime();
        }
        hQ hQVar = this.YFl;
        if (hQVar != null) {
            hQVar.nc();
            com.bytedance.sdk.component.NjR.AlY alY3 = this.lG;
            if (alY3 != null) {
                if (alY3.getVisibility() == 0) {
                    this.YFl.Sg(true);
                    Sg(this.YFl, true);
                    YFl(this.YFl, false, true);
                    if (Ne.nc(this.eT) && !this.UI && this.GS.Sg.xSx()) {
                        NjR();
                    }
                } else {
                    this.YFl.Sg(false);
                    Sg(this.YFl, false);
                    YFl(this.YFl, true, false);
                }
            }
        }
        if (this.Sg != null && Ne.qsH(this.eT)) {
            this.Sg.nc();
            com.bytedance.sdk.component.NjR.AlY alY4 = this.Wwa;
            if (alY4 != null) {
                if (alY4.getVisibility() == 0) {
                    this.Sg.Sg(true);
                    Sg(this.Sg, true);
                    YFl(this.Sg, false, true);
                    if (!this.UI && this.GS.Sg.xSx()) {
                        fIu();
                    }
                } else {
                    this.Sg.Sg(false);
                    Sg(this.Sg, false);
                    YFl(this.Sg, true, false);
                }
            }
        }
        com.bytedance.sdk.openadsdk.AlY.eT eTVar = this.wN;
        if (eTVar != null) {
            eTVar.DSW();
        }
    }

    public void NjR() {
        this.YFl.YFl("showPlayableEndCardOverlay", (JSONObject) null);
        this.GS.zG.sendEmptyMessageDelayed(600, 1000L);
        this.GS.zG.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.Wwa.6
            @Override // java.lang.Runnable
            public void run() {
                Wwa.this.ko();
            }
        }, 1000L);
        com.bytedance.sdk.openadsdk.utils.eT eTVar = this.GS.Bn;
        if (eTVar != null) {
            eTVar.YFl(0L);
        }
    }

    public String UZM() {
        return this.AlY;
    }

    public int VOe() {
        return this.f10587vc;
    }

    public boolean Wwa() {
        return this.aIu.get();
    }

    public boolean YI() {
        return com.bytedance.sdk.openadsdk.core.model.Wwa.tN(this.eT) ? this.ZU && !this.BPI && this.GS.zB.YoT() : this.ZU && !this.BPI && this.aIu.get() && this.wXo;
    }

    public hQ YoT() {
        return this.YFl;
    }

    public void aIu() {
        com.bytedance.sdk.openadsdk.AlY.AlY.wN wNVar = this.qsH;
        if (wNVar != null) {
            wNVar.NjR();
        }
        com.bytedance.sdk.openadsdk.AlY.eT eTVar = this.wN;
        if (eTVar != null) {
            eTVar.qsH();
        }
    }

    public String bZ() {
        return this.DSW;
    }

    public void dXO() {
        com.bytedance.sdk.openadsdk.AlY.AlY.wN wNVar = this.qsH;
        if (wNVar != null) {
            wNVar.DSW();
        }
    }

    public com.bytedance.sdk.component.NjR.AlY eT() {
        return this.Wwa;
    }

    public boolean hQ() {
        return this.NjR;
    }

    public boolean lG() {
        String str = this.AlY;
        if (str == null) {
            return false;
        }
        try {
            return Uri.parse(str).getQueryParameterNames().contains("show_landingpage");
        } catch (Exception unused) {
            return false;
        }
    }

    public void mn() {
        com.bytedance.sdk.openadsdk.AlY.AlY.wN wNVar = this.qsH;
        if (wNVar != null) {
            wNVar.nc();
        }
    }

    public com.bytedance.sdk.component.NjR.AlY nc() {
        return this.lG;
    }

    public com.bytedance.sdk.openadsdk.AlY.eT pDU() {
        return this.wN;
    }

    public void pq() {
        com.bytedance.sdk.openadsdk.AlY.AlY.wN wNVar = this.qsH;
        if (wNVar != null) {
            wNVar.tN();
            this.qsH.AlY();
        }
    }

    public boolean qO() {
        return this.wXo;
    }

    public void rkt() {
        com.bytedance.sdk.component.NjR.AlY alY = this.lG;
        if (alY != null) {
            zB.YFl(alY.getWebView());
        }
        com.bytedance.sdk.component.NjR.AlY alY2 = this.Wwa;
        if (alY2 != null) {
            zB.YFl(alY2.getWebView());
        }
        long j3 = this.fIu;
        if (j3 > 0) {
            if (this.ko > 0) {
                this.fIu = (SystemClock.elapsedRealtime() - this.ko) + j3;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("endcard_overlay_render_type", com.bytedance.sdk.openadsdk.core.model.Wwa.tN(this.eT) ? 7 : 0);
            } catch (Throwable unused) {
            }
            com.bytedance.sdk.openadsdk.AlY.tN.YFl(this.GS.Sg, this.YoT, "second_endcard_duration", jSONObject, this.fIu);
        }
        this.lG = null;
        if (this.qsH != null && !com.bytedance.sdk.openadsdk.core.model.rkt.tN(this.eT) && !com.bytedance.sdk.openadsdk.core.model.rkt.AlY(this.eT) && !com.bytedance.sdk.openadsdk.core.model.Wwa.tN(this.eT)) {
            this.qsH.YFl(true);
            this.qsH.YoT();
        }
        hQ hQVar = this.YFl;
        if (hQVar != null) {
            hQVar.eT();
        }
        hQ hQVar2 = this.Sg;
        if (hQVar2 != null) {
            hQVar2.eT();
        }
        com.bytedance.sdk.openadsdk.AlY.eT eTVar = this.wN;
        if (eTVar != null) {
            eTVar.tN(this.eT.Sco() || Ne.DSW(this.eT));
        }
        DeviceUtils.AudioInfoReceiver.Sg(this);
    }

    public void wXo() {
        com.bytedance.sdk.component.NjR.AlY alY = this.lG;
        if (alY != null) {
            alY.eT();
        }
        com.bytedance.sdk.component.NjR.AlY alY2 = this.Wwa;
        if (alY2 != null) {
            alY2.eT();
        }
        if (this.ko > 0) {
            this.fIu = (SystemClock.elapsedRealtime() - this.ko) + this.fIu;
            this.ko = 0L;
        }
        hQ hQVar = this.YFl;
        if (hQVar != null) {
            hQVar.Sg(false);
            Sg(this.YFl, false);
            YFl(this.YFl, true, false);
        }
        if (this.Sg == null || !Ne.qsH(this.eT)) {
            return;
        }
        this.Sg.Sg(false);
        Sg(this.Sg, false);
        YFl(this.Sg, true, false);
    }

    public void DSW() {
        a BPI = this.eT.BPI();
        if (BPI == null) {
            return;
        }
        String str = BPI.f23463h;
        this.lL = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.lL = YFl(this.lL, this.eT, this.GA, this.rkt, this.EH);
        this.Wwa.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.YFl.wN(com.bytedance.sdk.openadsdk.core.lG.YFl(), this.Sg, this.eT.zz(), this.wN, this.eT.Sco() || Ne.DSW(this.eT)) { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.Wwa.3
            @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.wN, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str2) {
                super.onPageFinished(webView, str2);
                com.bytedance.sdk.openadsdk.AlY.AlY.wN wNVar = Wwa.this.qsH;
                if (wNVar != null) {
                    wNVar.vc();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.wN, android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str2, Bitmap bitmap) {
                super.onPageStarted(webView, str2, bitmap);
                com.bytedance.sdk.openadsdk.AlY.AlY.wN wNVar = Wwa.this.qsH;
                if (wNVar != null) {
                    wNVar.wN();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.wN, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i10, String str2, String str3) {
                if (Wwa.this.YFl(str3)) {
                    return;
                }
                Wwa.this.Ne = false;
                Wwa wwa = Wwa.this;
                wwa.f10587vc = i10;
                wwa.DSW = str2;
                if (wwa.qsH != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", i10);
                        jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, str2);
                        Wwa.this.qsH.YFl(jSONObject);
                    } catch (JSONException unused) {
                    }
                }
                super.onReceivedError(webView, i10, str2, str3);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.wN, android.webkit.WebViewClient
            @TargetApi(21)
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                    Wwa.this.Ne = false;
                    if (webResourceResponse != null) {
                        Wwa.this.f10587vc = webResourceResponse.getStatusCode();
                        Wwa.this.DSW = "onReceivedHttpError";
                    }
                }
                if (Wwa.this.qsH != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (webResourceResponse != null) {
                            jSONObject.put("code", webResourceResponse.getStatusCode());
                            jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, webResourceResponse.getReasonPhrase());
                        }
                        Wwa.this.qsH.YFl(jSONObject);
                    } catch (JSONException unused) {
                    }
                }
                if (webResourceRequest != null) {
                    super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.wN, android.webkit.WebViewClient
            @TargetApi(23)
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                if (webResourceRequest == null || webResourceRequest.getUrl() == null || !Wwa.this.YFl(webResourceRequest.getUrl().toString())) {
                    Wwa.this.Ne = false;
                    if (Wwa.this.qsH != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (webResourceError != null) {
                                jSONObject.put("code", webResourceError.getErrorCode());
                                jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, webResourceError.getDescription());
                            }
                            Wwa.this.qsH.YFl(jSONObject);
                        } catch (JSONException unused) {
                        }
                    }
                    if (webResourceError != null) {
                        Wwa.this.f10587vc = webResourceError.getErrorCode();
                        Wwa.this.DSW = String.valueOf(webResourceError.getDescription());
                    }
                    if (webResourceRequest == null) {
                        return;
                    }
                    super.onReceivedError(webView, webResourceRequest, webResourceError);
                }
            }
        });
        this.Wwa.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.YFl.AlY(this.Sg, this.wN) { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.Wwa.4
            @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.AlY, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i10) {
                super.onProgressChanged(webView, i10);
                if (Wwa.this.GS.DSW && Wwa.this.GS.lL != null) {
                    Wwa.this.GS.lL.YFl(webView, i10, Wwa.this.f10585ib);
                }
            }
        });
        com.bytedance.sdk.openadsdk.utils.Wwa.YFl(this.Wwa, this.lL);
        this.Ne = true;
    }

    public void qsH() {
        if (this.lG == null) {
            return;
        }
        this.aIu.set(this.Ne);
        if (this.Wwa.getVisibility() == 0 && this.Ne) {
            fIu();
            return;
        }
        this.GS.Sco.tN(false);
        this.GS.UZM.DSW(qsH.tN);
        YFl(this.YFl, true, false);
        Sg(this.YFl, false);
        YFl(this.YFl, false);
        this.lG.YoT();
        if (this.Ne) {
            this.Wwa.setVisibility(0);
            YFl(this.Sg, this.GS.iY, true);
            Sg(this.Sg, true);
            YFl(this.Sg, true);
            this.GS.zG.removeMessages(600);
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.GS;
            if (!yFl.GS.tN(yFl.Vmj)) {
                this.GS.Vmj.bZ();
            }
        } else {
            if (this.GS.UZM.YFl()) {
                this.GS.UZM.YFl(5);
            }
            this.GS.GS.AlY();
            this.GS.Bn.YFl(r0.qsH);
        }
        this.zz = true;
    }

    public void vc() {
        if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.model.Wwa.YFl(this.GS.BPI, this.eT))) {
            com.bytedance.sdk.openadsdk.core.model.Wwa wwa = this.eT;
            if (wwa != null && !wwa.MZ() && this.Cqy == null && lG()) {
                this.Ld = this.eT.DjU();
                this.Cqy = com.bytedance.sdk.openadsdk.DSW.Sg.YFl().Sg();
                int YFl2 = com.bytedance.sdk.openadsdk.DSW.Sg.YFl().YFl(this.Cqy, this.Ld);
                this.Bh = YFl2;
                this.dGX = YFl2 > 0 ? 2 : 0;
                if (!TextUtils.isEmpty(this.Ld)) {
                    com.bytedance.sdk.openadsdk.AlY.eT eTVar = this.wN;
                    if (eTVar != null) {
                        eTVar.YFl(this.dGX);
                    }
                    tN.YFl.YFl(this.RX, this.eT, "landingpage_endcard", this.Cqy, this.Ld);
                }
            }
            if ((TextUtils.isEmpty(this.AlY) || !this.AlY.contains("play.google.com/store")) && !com.bytedance.sdk.openadsdk.core.model.rkt.wN(this.eT) && !com.bytedance.sdk.openadsdk.core.model.rkt.AlY(this.eT)) {
                if (this.tN) {
                    if (this.lG != null && !TextUtils.isEmpty(this.AlY) && com.bytedance.sdk.openadsdk.core.model.Wwa.Sg(this.eT)) {
                        if (this.f10584dd) {
                            return;
                        }
                        String h10 = e.h(new StringBuilder(), this.AlY, "&is_pre_render=1");
                        Objects.toString(this.lG.getWebView());
                        com.bytedance.sdk.openadsdk.AlY.eT eTVar2 = this.wN;
                        if (eTVar2 != null) {
                            eTVar2.AlY();
                        }
                        if (Ne.DSW(this.eT)) {
                            com.bytedance.sdk.openadsdk.core.GA.tN.YFl.YFl().Sg(this.eT);
                        }
                        com.bytedance.sdk.openadsdk.utils.Wwa.YFl(this.lG, h10);
                        this.GS.UZM.YFl(h10);
                        this.f10584dd = true;
                        return;
                    }
                    if (com.bytedance.sdk.openadsdk.core.model.Wwa.tN(this.eT)) {
                        this.GS.zB.tN();
                        return;
                    }
                    return;
                }
                return;
            }
            this.NjR = true;
        }
    }

    public void wN() {
        if (Ne.wN(this.eT)) {
            return;
        }
        vc();
    }

    public boolean AlY() {
        return this.BPI;
    }

    public void Sg() {
        com.bytedance.sdk.openadsdk.common.YoT yoT;
        this.bZ = this.GS.UI.findViewById(R.id.content);
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.GS;
        boolean z10 = yFl.DSW;
        this.Sco = z10;
        if (z10 && (yoT = this.zB) != null) {
            this.lG = yoT.AlY();
        } else {
            com.bytedance.sdk.component.NjR.AlY alY = (com.bytedance.sdk.component.NjR.AlY) yFl.mB.findViewById(com.bytedance.sdk.openadsdk.utils.GA.pDU);
            this.lG = alY;
            if (alY != null && com.bytedance.sdk.openadsdk.core.model.Wwa.Sg(this.eT)) {
                this.lG.f_();
            } else {
                GS.YFl((View) this.lG, 8);
            }
        }
        com.bytedance.sdk.component.NjR.AlY alY2 = (com.bytedance.sdk.component.NjR.AlY) this.GS.mB.findViewById(com.bytedance.sdk.openadsdk.utils.GA.rkt);
        this.Wwa = alY2;
        if (alY2 != null && Ne.DSW(this.eT) && Ne.qsH(this.eT)) {
            this.Wwa.f_();
            this.Wwa.setDisplayZoomControls(false);
        } else {
            GS.YFl((View) this.Wwa, 8);
        }
        com.bytedance.sdk.component.NjR.AlY alY3 = this.lG;
        if (alY3 != null) {
            alY3.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.Wwa.1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    if (Wwa.this.lG != null && Wwa.this.lG.getViewTreeObserver() != null) {
                        Wwa.this.lG.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        int measuredWidth = Wwa.this.lG.getMeasuredWidth();
                        int measuredHeight = Wwa.this.lG.getMeasuredHeight();
                        if (Wwa.this.lG.getVisibility() == 0) {
                            Wwa.this.YFl(measuredWidth, measuredHeight);
                        }
                    }
                }
            });
        }
        com.bytedance.sdk.component.NjR.AlY alY4 = this.Wwa;
        if (alY4 != null) {
            alY4.setLandingPage(true);
            this.Wwa.setTag(Ne.DSW(this.eT) ? this.YoT : "landingpage_endcard");
            this.Wwa.setWebViewClient(new AlY.YFl());
            this.Wwa.setMaterialMeta(this.eT.JT());
        }
    }

    public boolean tN() {
        return this.zG;
    }

    public void AlY(boolean z10) {
        if (this.YFl == null || this.GS.UI.isFinishing()) {
            return;
        }
        this.GS.UZM.wN(z10);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", z10);
            this.YFl.YFl("volumeChange", jSONObject);
        } catch (Exception unused) {
        }
    }

    public void tN(boolean z10) {
        Sg(this.YFl, z10);
    }

    public void wN(boolean z10) {
        this.BPI = true;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("endcard_overlay_render_type", com.bytedance.sdk.openadsdk.core.model.Wwa.tN(this.eT) ? 7 : 0);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.AlY.tN.Sg(this.eT, this.YoT, "use_second_endcard", jSONObject);
        this.ko = SystemClock.elapsedRealtime();
        try {
            if (!com.bytedance.sdk.openadsdk.core.model.Wwa.tN(this.eT)) {
                this.YFl.YFl("click_endcard_close", (JSONObject) null);
            } else if (z10) {
                this.GS.zB.qsH();
                com.bytedance.sdk.openadsdk.AlY.tN.Sg(this.eT, this.YoT, "endcard_close_skip", jSONObject);
            }
        } catch (Exception unused2) {
        }
        this.GS.Bn.YFl(r5.qsH);
    }

    /* loaded from: classes.dex */
    public static class YFl extends com.bytedance.sdk.openadsdk.core.Sg.YFl implements Sg.YFl {
        private final View Sg;
        private final com.bytedance.sdk.openadsdk.component.reward.YFl.YFl YFl;
        private final View.OnClickListener tN;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public YFl(com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r5, android.view.View r6, android.view.View.OnClickListener r7) {
            /*
                r4 = this;
                android.app.Activity r0 = r5.UI
                com.bytedance.sdk.openadsdk.core.model.Wwa r1 = r5.Sg
                java.lang.String r2 = r5.wN
                boolean r3 = r5.AlY
                if (r3 == 0) goto Lc
                r3 = 7
                goto Ld
            Lc:
                r3 = 5
            Ld:
                r4.<init>(r0, r1, r2, r3)
                r4.YFl = r5
                r4.Sg = r6
                r4.tN = r7
                java.util.HashMap r6 = new java.util.HashMap
                r6.<init>()
                java.lang.String r7 = "close_auto_click"
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                r6.put(r7, r0)
                r7 = 2
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                java.lang.String r0 = "click_scence"
                r6.put(r0, r7)
                r4.YFl(r6)
                com.bytedance.sdk.openadsdk.component.reward.YFl.AlY r5 = r5.bZ
                com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.vc r5 = r5.tN()
                r4.YFl(r5)
                r4.YFl(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.YFl.Wwa.YFl.<init>(com.bytedance.sdk.openadsdk.component.reward.YFl.YFl, android.view.View, android.view.View$OnClickListener):void");
        }

        @Override // com.bytedance.sdk.openadsdk.core.Sg.YFl, com.bytedance.sdk.openadsdk.core.Sg.Sg, com.bytedance.sdk.openadsdk.core.Sg.tN
        public void YFl(View view, float f10, float f11, float f12, float f13, SparseArray<tN.YFl> sparseArray, boolean z10) {
            if (((com.bytedance.sdk.openadsdk.core.Sg.Sg) this).f10642vc.xSx()) {
                this.tN.onClick(view);
                this.Sg.setOnTouchListener(null);
                this.Sg.setOnClickListener(this.tN);
            } else {
                super.YFl(view, f10, f11, f12, f13, sparseArray, z10);
                this.YFl.ZU.c_();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.Sg.Sg.YFl
        public void YFl(View view, int i10) {
            this.Sg.setOnTouchListener(null);
            this.Sg.setOnClickListener(this.tN);
        }
    }

    public void YFl() {
        if (this.VOe) {
            return;
        }
        this.VOe = true;
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.GS;
        this.GA = yFl.Cqy;
        this.EH = yFl.Jc;
        this.rkt = yFl.RX;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Sg();
        this.RX = SystemClock.elapsedRealtime() - elapsedRealtime;
    }

    public void YFl(String str, final com.bytedance.sdk.openadsdk.core.GA.AlY.Sg sg2) {
        YFl(str, new AlY() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.Wwa.12
            @Override // com.bytedance.sdk.openadsdk.component.reward.YFl.Wwa.AlY
            public void YFl(WebView webView, String str2) {
                if (Wwa.this.GS.UI.isFinishing()) {
                    return;
                }
                Wwa.this.GS.UZM.Sg(Wwa.this.Wwa());
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.YFl.Wwa.AlY
            public void YFl(WebView webView, String str2, Bitmap bitmap) {
                if (Wwa.this.lu || !Ne.Wwa(Wwa.this.GS.Sg)) {
                    return;
                }
                Wwa.this.lu = true;
                Wwa.this.GS.UZM.YFl(Wwa.this.GS.f10591vc, Wwa.this.GS.Sg, Wwa.this.GS.Sg.TMt());
                if (!Ne.qsH(Wwa.this.eT)) {
                    Wwa.this.GS.zG.sendEmptyMessageDelayed(600, Wwa.this.GS.UZM.NjR() * 1000);
                }
                Wwa.this.GS.UZM.nc();
                Wwa.this.GS.ZU.eT();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.YFl.Wwa.AlY
            public void YFl(WebView webView, int i10) {
                try {
                    if (!Ne.Wwa(Wwa.this.GS.Sg) || !Wwa.this.GS.Sg.ww() || Wwa.this.GS.UI.isFinishing()) {
                        if (!Wwa.this.GS.DSW || Wwa.this.GS.lL == null) {
                            return;
                        }
                        Wwa.this.GS.lL.YFl(webView, i10, Wwa.this.f10585ib);
                        return;
                    }
                    Wwa.this.GS.UZM.tN(i10);
                } catch (Exception unused) {
                }
            }
        });
        if (Ne.Wwa(this.GS.Sg)) {
            YFl(this.Wwa);
            this.GS.UZM.YFl(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.Wwa.13
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str2, String str3, String str4, String str5, long j3) {
                    Wwa.this.GS.bZ.Sg();
                    com.bytedance.sdk.openadsdk.core.GA.AlY.Sg sg3 = sg2;
                    if (sg3 != null) {
                        sg3.AlY();
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.GS;
        yFl.UZM.tN(yFl.Hjb);
        YFl(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.Wwa.14
            @Override // android.webkit.DownloadListener
            public void onDownloadStart(String str2, String str3, String str4, String str5, long j3) {
                Wwa.this.GS.bZ.Sg();
                com.bytedance.sdk.openadsdk.core.GA.AlY.Sg sg3 = sg2;
                if (sg3 != null) {
                    sg3.AlY();
                }
            }
        });
    }

    public void YFl(com.bytedance.sdk.openadsdk.YoT.wN wNVar, String str, final com.bytedance.sdk.openadsdk.core.GA.AlY.Sg sg2) {
        if (this.lG == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        if (Ne.DSW(this.eT)) {
            hashMap.put("click_scence", 3);
        } else {
            hashMap.put("click_scence", 2);
        }
        this.qsH = iY();
        hQ hQVar = new hQ(this.GS.UI);
        this.YFl = hQVar;
        hQVar.YFl(this.GS.ZU);
        String cC = this.eT.cC();
        this.YFl.Sg(this.lG).YFl(this.eT).tN(this.eT.zz()).AlY(this.eT.uGS()).Sg(this.eT.TMt() ? 7 : 5).YFl(new Sg(this.lG)).wN(cC).YFl(this.lG).Sg(lG() ? "landingpage_endcard" : str).YFl(hashMap).YFl(this.qsH).YFl(new com.bytedance.sdk.openadsdk.core.widget.vc() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.Wwa.16
            @Override // com.bytedance.sdk.openadsdk.core.widget.vc
            public void YFl() {
                if (Wwa.this.mB != null) {
                    Wwa.this.mB.Sg();
                }
                com.bytedance.sdk.openadsdk.core.GA.AlY.Sg sg3 = sg2;
                if (sg3 != null) {
                    sg3.AlY();
                }
            }
        }).YFl(new hQ.YFl() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.Wwa.15
            @Override // com.bytedance.sdk.openadsdk.core.hQ.YFl
            public void YFl() {
                Wwa.this.ko();
            }
        });
        HashMap hashMap2 = new HashMap();
        if (Ne.qsH(this.eT)) {
            hashMap2.put("click_scence", 2);
        }
        hQ hQVar2 = new hQ(this.GS.UI);
        this.Sg = hQVar2;
        hQVar2.YFl(this.GS.ZU);
        hQ wN = this.Sg.Sg(this.Wwa).YFl(this.eT).tN(this.eT.zz()).AlY(this.eT.uGS()).Sg(this.eT.TMt() ? 7 : 5).YFl(new Sg(this.Wwa)).YFl(this.Wwa).wN(cC);
        if (lG()) {
            str = "landingpage_endcard";
        }
        wN.Sg(str).YFl(hashMap2).YFl(this.qsH).YFl(new com.bytedance.sdk.openadsdk.core.widget.vc() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.Wwa.18
            @Override // com.bytedance.sdk.openadsdk.core.widget.vc
            public void YFl() {
                if (Wwa.this.mB != null) {
                    Wwa.this.mB.Sg();
                }
            }
        }).YFl(new hQ.YFl() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.Wwa.17
            @Override // com.bytedance.sdk.openadsdk.core.hQ.YFl
            public void YFl() {
                Wwa.this.ko();
            }
        });
        this.YFl.YFl(new tN(this.lG));
        this.Sg.YFl(new tN(this.Wwa));
        this.YFl.YFl(this.GS.lu.nc()).YFl(this.GS.Hjb).YFl(wNVar).YFl(this.GS.UZM.eT()).YFl(new com.bytedance.sdk.openadsdk.YoT.Sg() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.Wwa.19
            @Override // com.bytedance.sdk.openadsdk.YoT.Sg
            public void YFl(boolean z10, int i10, String str2) {
                if (z10) {
                    Wwa wwa = Wwa.this;
                    wwa.f10586nc = true;
                    if (wwa.tQ) {
                        Wwa.this.tQ = false;
                        Wwa wwa2 = Wwa.this;
                        wwa2.YFl(wwa2.GS.iY, true);
                    }
                }
                if (!com.bytedance.sdk.openadsdk.core.model.Wwa.AlY(Wwa.this.GS.Sg) || Ne.DSW(Wwa.this.GS.Sg)) {
                    return;
                }
                Wwa.this.YFl(z10, i10, str2);
            }

            @Override // com.bytedance.sdk.openadsdk.YoT.Sg
            public void YFl() {
                Wwa.this.zG = true;
                Wwa.this.GS.lu.nc().performClick();
            }
        });
        this.YFl.wN(this.ZU);
        this.Sg.YFl(this.GS.lu.nc()).YFl(new com.bytedance.sdk.openadsdk.YoT.Sg() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.Wwa.2
            @Override // com.bytedance.sdk.openadsdk.YoT.Sg
            public void YFl(boolean z10, int i10, String str2) {
            }

            @Override // com.bytedance.sdk.openadsdk.YoT.Sg
            public void YFl() {
                Wwa.this.zG = true;
                Wwa.this.GS.lu.nc().performClick();
            }
        });
    }

    public void Sg(int i10) {
        GS.YFl((View) this.lG, i10);
        com.bytedance.sdk.component.NjR.AlY alY = this.lG;
        if (alY != null) {
            GS.YFl((View) alY.getWebView(), i10);
        }
        if (this.lG != null && (this.eT.Sco() || Ne.DSW(this.eT))) {
            this.lG.setLandingPage(true);
            this.lG.setTag(Ne.DSW(this.eT) ? this.YoT : "landingpage_endcard");
            this.lG.setMaterialMeta(this.eT.JT());
        }
        if (i10 == 0 && Ne.qsH(this.eT)) {
            DSW();
        }
    }

    public void Sg(boolean z10) {
        YFl(this.YFl, z10);
    }

    public void Sg(hQ hQVar, boolean z10) {
        try {
            this.GS.UZM.AlY(z10);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("viewStatus", z10 ? 1 : 0);
            hQVar.YFl("viewableChange", jSONObject);
        } catch (Exception unused) {
        }
    }

    public void vc(boolean z10) {
        this.zz = z10;
    }

    public void YFl(int i10, int i11) {
        if (this.YFl == null || this.GS.UI.isFinishing()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", i10);
            jSONObject.put("height", i11);
            this.YFl.YFl("resize", jSONObject);
        } catch (Exception e2) {
            Log.e("TTAD.RFWVM", "", e2);
        }
    }

    public void YFl(boolean z10) {
        this.tN = z10;
    }

    private static String YFl(String str, com.bytedance.sdk.openadsdk.core.model.Wwa wwa, int i10, int i11, int i12) {
        String concat;
        String concat2;
        float qjy = wwa.qjy();
        if (!TextUtils.isEmpty(str)) {
            if (i10 == 1) {
                if (str.contains("?")) {
                    concat2 = str.concat("&");
                } else {
                    concat2 = str.concat("?");
                }
                str = j.k(concat2, "orientation=portrait");
            }
            if (str.contains("?")) {
                concat = str.concat("&");
            } else {
                concat = str.concat("?");
            }
            str = concat + "height=" + i11 + "&width=" + i12 + "&aspect_ratio=" + qjy;
        }
        return !Ne.DSW(wwa) ? com.bytedance.sdk.openadsdk.utils.AlY.YFl(str) : str;
    }

    public void YFl(com.bytedance.sdk.openadsdk.common.YoT yoT) {
        this.zB = yoT;
    }

    public void YFl(float f10) {
        GS.YFl(this.lG, f10);
    }

    public void YFl(hQ hQVar, boolean z10) {
        if (this.YFl == null || this.GS.UI.isFinishing()) {
            return;
        }
        hQVar.Sg(z10);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void YFl(String str, final AlY alY) {
        com.bytedance.sdk.component.NjR.AlY alY2;
        com.bytedance.sdk.component.NjR.AlY alY3 = this.lG;
        if (alY3 != null && alY3.getWebView() != null) {
            com.bytedance.sdk.openadsdk.AlY.eT YFl2 = new com.bytedance.sdk.openadsdk.AlY.eT(this.eT, this.lG.getWebView(), new com.bytedance.sdk.openadsdk.AlY.nc() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.Wwa.7
                @Override // com.bytedance.sdk.openadsdk.AlY.nc
                public void YFl(int i10) {
                    if (!TextUtils.isEmpty(Wwa.this.Ld)) {
                        tN.YFl.YFl(Wwa.this.Bh, Wwa.this.iY, Wwa.this.Jc, Wwa.this.VB - Wwa.this.Jc, Wwa.this.eT, "landingpage_endcard", i10);
                    }
                }
            }, this.dGX).YFl(true);
            this.wN = YFl2;
            this.f10585ib = YFl2.YFl;
            YFl2.YFl(lG() ? "landingpage_endcard" : str);
            this.wN.Sg(this.YoT);
            this.wN.Sg(true);
            this.lG.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.Wwa.8
                @Override // android.view.View.OnScrollChangeListener
                public void onScrollChange(View view, int i10, int i11, int i12, int i13) {
                    com.bytedance.sdk.openadsdk.AlY.eT eTVar = Wwa.this.wN;
                    if (eTVar != null) {
                        eTVar.Sg(i11);
                    }
                }
            });
            qsH qsh = this.GS.UZM;
            if (qsh != null) {
                this.wN.YFl(qsh.AlY());
            }
            com.bytedance.sdk.openadsdk.common.tN YFl3 = Sco.YFl(this.eT, this.lG, this.GS.UI, this.YoT);
            this.Hjb = YFl3;
            if (YFl3 != null) {
                if (lG()) {
                    str = "landingpage_endcard";
                }
                YFl3.YFl(str);
            }
            if (lG()) {
                Sco.YFl(this.eT, this.lG);
            }
            com.bytedance.sdk.openadsdk.core.widget.YFl.wN wNVar = new com.bytedance.sdk.openadsdk.core.widget.YFl.wN(com.bytedance.sdk.openadsdk.core.lG.YFl(), this.YFl, this.eT.zz(), this.Hjb, this.wN, this.eT.Sco() || Ne.DSW(this.eT)) { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.Wwa.9
                @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.wN, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str2) {
                    super.onPageFinished(webView, str2);
                    Wwa.this.f10584dd = false;
                    Wwa.this.wXo = true;
                    if (Wwa.this.GS.mn.YI()) {
                        View nc2 = Wwa.this.GS.lu.nc();
                        if (nc2 instanceof com.bytedance.sdk.openadsdk.core.wN.AlY) {
                            ((com.bytedance.sdk.openadsdk.core.wN.AlY) nc2).setImageResource(com.bytedance.sdk.component.utils.qO.AlY(Wwa.this.GS.BPI, "tt_skip_btn"));
                        }
                    }
                    DeviceUtils.AudioInfoReceiver.YFl(Wwa.this);
                    Wwa.this.Vmj = DeviceUtils.DSW();
                    com.bytedance.sdk.openadsdk.AlY.AlY.wN wNVar2 = Wwa.this.qsH;
                    if (wNVar2 != null) {
                        wNVar2.vc();
                    }
                    Wwa.this.GS.UZM.Sg(str2);
                    AlY alY4 = alY;
                    if (alY4 != null) {
                        alY4.YFl(webView, str2);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.wN, android.webkit.WebViewClient
                public void onPageStarted(WebView webView, String str2, Bitmap bitmap) {
                    super.onPageStarted(webView, str2, bitmap);
                    com.bytedance.sdk.openadsdk.AlY.AlY.wN wNVar2 = Wwa.this.qsH;
                    if (wNVar2 != null) {
                        wNVar2.wN();
                    }
                    AlY alY4 = alY;
                    if (alY4 != null) {
                        alY4.YFl(webView, str2, bitmap);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.wN, android.webkit.WebViewClient
                public void onReceivedError(WebView webView, int i10, String str2, String str3) {
                    super.onReceivedError(webView, i10, str2, str3);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.wN, android.webkit.WebViewClient
                @TargetApi(21)
                public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                    Wwa.this.GS.UZM.YFl(webResourceRequest.isForMainFrame(), webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode());
                    if (webResourceRequest.getUrl() != null) {
                        Log.i("TTAD.RFWVM", "onReceivedHttpError:url =" + webResourceRequest.getUrl().toString());
                    }
                    if (webResourceRequest.isForMainFrame()) {
                        Wwa.this.aIu.set(false);
                        Wwa.this.f10584dd = false;
                        Wwa.this.f10587vc = webResourceResponse.getStatusCode();
                        Wwa.this.DSW = "onReceivedHttpError";
                    }
                    if (Wwa.this.qsH != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("code", webResourceResponse.getStatusCode());
                            jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, webResourceResponse.getReasonPhrase());
                            Wwa.this.qsH.YFl(jSONObject);
                        } catch (JSONException unused) {
                        }
                    }
                    super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.wN, android.webkit.WebViewClient
                public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.wN, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str2) {
                    if (!Ne.DSW(Wwa.this.eT)) {
                        try {
                            if (TextUtils.isEmpty(Wwa.this.Ld)) {
                                return super.shouldInterceptRequest(webView, str2);
                            }
                            Wwa.pDU(Wwa.this);
                            WebResourceResponseModel YFl4 = com.bytedance.sdk.openadsdk.DSW.Sg.YFl().YFl(Wwa.this.Cqy, Wwa.this.Ld, str2);
                            if (YFl4 != null && YFl4.getWebResourceResponse() != null) {
                                Wwa.rkt(Wwa.this);
                                return YFl4.getWebResourceResponse();
                            }
                            if (YFl4 != null && YFl4.getMsg() == 2) {
                                Wwa.lG(Wwa.this);
                            }
                            return super.shouldInterceptRequest(webView, str2);
                        } catch (Throwable th2) {
                            com.bytedance.sdk.component.utils.YoT.YFl("TTAD.RFWVM", "shouldInterceptRequest url error", th2);
                            return super.shouldInterceptRequest(webView, str2);
                        }
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    WebResourceResponse YFl5 = com.bytedance.sdk.openadsdk.core.GA.tN.YFl.YFl().YFl(Wwa.this.eT.BPI().f23464i, Ne.GA(Wwa.this.eT), str2);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (Wwa.this.qsH != null) {
                        nc.YFl YFl6 = com.bytedance.sdk.component.adexpress.AlY.nc.YFl(str2);
                        int i10 = YFl5 != null ? 1 : 2;
                        if (YFl6 == nc.YFl.HTML) {
                            Wwa.this.qsH.YFl(str2, currentTimeMillis, currentTimeMillis2, i10);
                        } else if (YFl6 == nc.YFl.JS) {
                            Wwa.this.qsH.Sg(str2, currentTimeMillis, currentTimeMillis2, i10);
                        }
                    }
                    return YFl5;
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.wN, android.webkit.WebViewClient
                @TargetApi(23)
                public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                    super.onReceivedError(webView, webResourceRequest, webResourceError);
                    if (webResourceError != null && webResourceRequest != null && webResourceRequest.getUrl() != null) {
                        Log.i("TTAD.RFWVM", "onReceivedError WebResourceError : description=" + ((Object) webResourceError.getDescription()) + "  url =" + webResourceRequest.getUrl().toString());
                    }
                    if (webResourceRequest == null || webResourceRequest.getUrl() == null || !Wwa.this.YFl(webResourceRequest.getUrl().toString())) {
                        if (webResourceError != null && webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                            Wwa.this.GS.UZM.YFl(webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription()), String.valueOf(webResourceRequest.getUrl()));
                        }
                        if (webResourceRequest == null || webResourceRequest.isForMainFrame()) {
                            Wwa.this.aIu.set(false);
                            Wwa.this.f10584dd = false;
                        }
                        if (Wwa.this.qsH != null) {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                if (webResourceError != null) {
                                    jSONObject.put("code", webResourceError.getErrorCode());
                                    jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, webResourceError.getDescription());
                                }
                                Wwa.this.qsH.YFl(jSONObject);
                            } catch (JSONException unused) {
                            }
                        }
                        if (webResourceError != null) {
                            Wwa.this.f10587vc = webResourceError.getErrorCode();
                            Wwa.this.DSW = String.valueOf(webResourceError.getDescription());
                        }
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.wN, android.webkit.WebViewClient
                @TargetApi(21)
                public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                    try {
                        return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
                    } catch (Throwable th2) {
                        com.bytedance.sdk.component.utils.YoT.YFl("TTAD.RFWVM", "shouldInterceptRequest error1", th2);
                        return super.shouldInterceptRequest(webView, webResourceRequest);
                    }
                }
            };
            this.mB = wNVar;
            this.lG.setWebViewClient(wNVar);
            this.mB.YFl(this.eT);
            this.mB.YFl(this.pDU ? "rewarded_video" : "fullscreen_interstitial_ad");
            if (this.eT.Sco() && (alY2 = this.lG) != null && alY2.getWebView() != null) {
                this.lG.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.Wwa.10
                    private final int Sg = com.bytedance.sdk.openadsdk.core.lG.Sg();

                    @Override // android.view.View.OnTouchListener
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        int i10;
                        int i11;
                        int i12;
                        int i13;
                        com.bytedance.sdk.openadsdk.AlY.eT eTVar = Wwa.this.wN;
                        if (eTVar != null) {
                            eTVar.YFl(motionEvent);
                        }
                        if (Wwa.this.Hjb != null) {
                            Wwa.this.Hjb.YFl(motionEvent);
                        }
                        try {
                            int actionMasked = motionEvent.getActionMasked();
                            if (actionMasked == 0) {
                                Wwa.this.hQ = true;
                                Wwa.this.Cfr = new SparseArray();
                                Wwa.this.YI = motionEvent.getRawX();
                                Wwa.this.Ga = motionEvent.getRawY();
                                Wwa.this.dXO = System.currentTimeMillis();
                                try {
                                    long landingPageClickBegin = Wwa.this.lG.getLandingPageClickBegin();
                                    if (landingPageClickBegin > 0 && landingPageClickBegin < Wwa.this.dXO) {
                                        Wwa.this.dXO = landingPageClickBegin;
                                        Wwa.this.lG.setLandingPageClickBegin(-1L);
                                    }
                                } catch (Exception unused) {
                                }
                                Wwa.this.pq = -1.0f;
                                Wwa.this.mn = -1.0f;
                                i10 = 0;
                            } else {
                                int i14 = 3;
                                if (actionMasked != 1) {
                                    if (actionMasked != 2) {
                                        if (actionMasked != 3) {
                                            i14 = -1;
                                        } else {
                                            i14 = 4;
                                        }
                                    } else {
                                        float rawX = motionEvent.getRawX();
                                        float rawY = motionEvent.getRawY();
                                        if (Math.abs(rawX - Wwa.this.YI) >= this.Sg || Math.abs(rawY - Wwa.this.Ga) >= this.Sg) {
                                            Wwa.this.hQ = false;
                                        }
                                        Wwa.this.pq += Math.abs(motionEvent.getX() - Wwa.this.YI);
                                        Wwa.this.mn += Math.abs(motionEvent.getY() - Wwa.this.Ga);
                                        if (System.currentTimeMillis() - Wwa.this.dXO > 200 && (Wwa.this.pq > 8.0f || Wwa.this.mn > 8.0f)) {
                                            i13 = 1;
                                        } else {
                                            i13 = 2;
                                        }
                                        if (Wwa.this.Sco) {
                                            if (rawY - Wwa.this.Ga > 8.0f) {
                                                Wwa.this.zB.YFl();
                                            }
                                            if (rawY - Wwa.this.Ga < -8.0f) {
                                                Wwa.this.zB.Sg();
                                            }
                                        }
                                        i10 = i13;
                                    }
                                }
                                i10 = i14;
                            }
                            Wwa.this.Cfr.put(motionEvent.getActionMasked(), new tN.YFl(i10, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
                            if (motionEvent.getAction() == 1 && view.getVisibility() == 0 && Float.valueOf(view.getAlpha()).intValue() == 1) {
                                if ((!Wwa.this.qO || com.bytedance.sdk.openadsdk.core.model.rkt.DSW(Wwa.this.eT)) && Wwa.this.hQ) {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("down_x", Wwa.this.YI);
                                    jSONObject.put("down_y", Wwa.this.Ga);
                                    jSONObject.put("down_time", Wwa.this.dXO);
                                    jSONObject.put("up_x", motionEvent.getRawX());
                                    jSONObject.put("up_y", motionEvent.getRawY());
                                    long currentTimeMillis = System.currentTimeMillis();
                                    try {
                                        long landingPageClickEnd = Wwa.this.lG.getLandingPageClickEnd();
                                        if (landingPageClickEnd > 0 && landingPageClickEnd < currentTimeMillis) {
                                            try {
                                                Wwa.this.lG.setLandingPageClickEnd(-1L);
                                            } catch (Exception unused2) {
                                            }
                                            currentTimeMillis = landingPageClickEnd;
                                        }
                                    } catch (Exception unused3) {
                                    }
                                    jSONObject.put("up_time", currentTimeMillis);
                                    int[] iArr = new int[2];
                                    if (Wwa.this.Sco) {
                                        Wwa wwa = Wwa.this;
                                        wwa.UZM = wwa.GS.mB.findViewById(com.bytedance.sdk.openadsdk.utils.GA.Bn);
                                    } else {
                                        Wwa wwa2 = Wwa.this;
                                        wwa2.UZM = wwa2.GS.mB.findViewById(520093713);
                                    }
                                    if (Wwa.this.UZM != null) {
                                        Wwa.this.UZM.getLocationOnScreen(iArr);
                                        jSONObject.put("button_x", iArr[0]);
                                        jSONObject.put("button_y", iArr[1]);
                                        jSONObject.put("button_width", Wwa.this.UZM.getWidth());
                                        jSONObject.put("button_height", Wwa.this.UZM.getHeight());
                                    }
                                    if (Wwa.this.bZ != null) {
                                        int[] iArr2 = new int[2];
                                        Wwa.this.bZ.getLocationOnScreen(iArr2);
                                        jSONObject.put("ad_x", iArr2[0]);
                                        jSONObject.put("ad_y", iArr2[1]);
                                        jSONObject.put("width", Wwa.this.bZ.getWidth());
                                        jSONObject.put("height", Wwa.this.bZ.getHeight());
                                    }
                                    jSONObject.put("toolType", motionEvent.getToolType(0));
                                    jSONObject.put("deviceId", motionEvent.getDeviceId());
                                    jSONObject.put("source", motionEvent.getSource());
                                    SparseArray sparseArray = Wwa.this.Cfr;
                                    if (com.bytedance.sdk.openadsdk.core.NjR.Sg().YFl()) {
                                        i11 = 1;
                                    } else {
                                        i11 = 2;
                                    }
                                    jSONObject.put("ft", com.bytedance.sdk.openadsdk.core.model.nc.YFl(sparseArray, i11));
                                    if (Wwa.this.hQ) {
                                        i12 = 1;
                                    } else {
                                        i12 = 2;
                                    }
                                    jSONObject.put("user_behavior_type", i12);
                                    jSONObject.put("click_scence", 2);
                                    if (Wwa.this.mB != null) {
                                        Wwa.this.mB.YFl(jSONObject);
                                    }
                                    if (!Wwa.this.qO && !com.bytedance.sdk.openadsdk.core.model.rkt.vc(Wwa.this.eT)) {
                                        if (Wwa.this.pDU) {
                                            com.bytedance.sdk.openadsdk.AlY.tN.YFl(Wwa.this.eT, "rewarded_video", CampaignEx.JSON_NATIVE_VIDEO_CLICK, jSONObject);
                                        } else {
                                            com.bytedance.sdk.openadsdk.AlY.tN.YFl(Wwa.this.eT, "fullscreen_interstitial_ad", CampaignEx.JSON_NATIVE_VIDEO_CLICK, jSONObject);
                                        }
                                        Wwa.this.qO = true;
                                        return false;
                                    }
                                    return false;
                                }
                                return false;
                            }
                            return false;
                        } catch (Throwable th2) {
                            Log.e("TTAD.RFWVM", "TouchRecordTool onTouch error", th2);
                            return false;
                        }
                    }
                });
            }
            com.bytedance.sdk.component.NjR.AlY alY4 = this.lG;
            if (alY4 != null) {
                alY4.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.YFl.AlY(this.YFl, this.wN, this.Hjb) { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.Wwa.11
                    @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.AlY, android.webkit.WebChromeClient
                    public void onProgressChanged(WebView webView, int i10) {
                        super.onProgressChanged(webView, i10);
                        AlY alY5 = alY;
                        if (alY5 != null) {
                            alY5.YFl(webView, i10);
                        }
                    }
                });
            }
            YFl(this.lG);
            this.lG.setLayerType(1, null);
            this.lG.setBackgroundColor(-1);
            this.lG.setDisplayZoomControls(false);
        }
        wN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean YFl(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return this.eT.Sco() && str.endsWith(".mp4");
    }

    public void YFl(DownloadListener downloadListener) {
        com.bytedance.sdk.component.NjR.AlY alY = this.lG;
        if (alY == null || downloadListener == null) {
            return;
        }
        alY.setDownloadListener(downloadListener);
    }

    public void YFl(com.bytedance.sdk.component.NjR.AlY alY) {
        if (alY == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.YFl.tN.YFl(this.GS.UI).YFl(false).Sg(false).YFl(alY.getWebView());
        alY.setUserAgentString(com.bytedance.sdk.openadsdk.utils.rkt.YFl(alY.getWebView(), BuildConfig.VERSION_CODE));
        alY.setMixedContentMode(0);
    }

    public void YFl(boolean z10, boolean z11) {
        YFl(this.YFl, z10, z11);
    }

    public void YFl(hQ hQVar, boolean z10, boolean z11) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", z10);
            jSONObject.put(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD_SHOW, z11);
            com.bytedance.sdk.openadsdk.activity.vc vcVar = this.GS.UT;
            if (vcVar != null) {
                jSONObject.put("multi_ads_show", vcVar.VOe().vc());
            }
            hQVar.YFl("endcard_control_event", jSONObject);
            if (z11) {
                if (this.wXo) {
                    return;
                }
                this.tQ = true;
                return;
            }
            this.tQ = false;
        } catch (Exception unused) {
        }
    }

    public void YFl(boolean z10, int i10, String str) {
        com.bytedance.sdk.openadsdk.AlY.AlY.wN wNVar = this.qsH;
        if (wNVar == null) {
            return;
        }
        if (z10) {
            wNVar.Sg();
        } else {
            wNVar.YFl(i10, str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.YoT.DSW
    public void YFl(int i10) {
        int i11 = this.Vmj;
        if (i11 <= 0 && i10 > 0) {
            AlY(false);
        } else if (i11 > 0 && i10 == 0) {
            AlY(true);
        }
        this.Vmj = i10;
    }
}
