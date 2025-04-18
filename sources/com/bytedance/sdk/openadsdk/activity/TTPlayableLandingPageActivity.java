package com.bytedance.sdk.openadsdk.activity;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.view.ViewCompat;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.adexpress.AlY.nc;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.component.utils.bZ;
import com.bytedance.sdk.component.utils.qO;
import com.bytedance.sdk.openadsdk.AlY.eT;
import com.bytedance.sdk.openadsdk.AlY.tN;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.YoT.DSW;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.NjR;
import com.bytedance.sdk.openadsdk.core.Sg.tN;
import com.bytedance.sdk.openadsdk.core.UZM;
import com.bytedance.sdk.openadsdk.core.hQ;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Ne;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.widget.EH;
import com.bytedance.sdk.openadsdk.core.widget.nc;
import com.bytedance.sdk.openadsdk.core.widget.pDU;
import com.bytedance.sdk.openadsdk.core.zB;
import com.bytedance.sdk.openadsdk.qO.DSW;
import com.bytedance.sdk.openadsdk.qO.qsH;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.bytedance.sdk.openadsdk.utils.rkt;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class TTPlayableLandingPageActivity extends TTBaseActivity implements bZ.YFl, DSW, com.bytedance.sdk.openadsdk.core.Sg.AlY {
    private static final DSW.YFl fIu = new DSW.YFl() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.1
        @Override // com.bytedance.sdk.openadsdk.qO.DSW.YFl
        public void YFl(String str, String str2, Throwable th2) {
            YoT.YFl(str, str2, th2);
        }
    };
    private boolean Bh;
    private boolean Cfr;
    private com.bytedance.sdk.openadsdk.core.wN.vc EH;
    private Context GA;
    private int Ne;
    TTAdDislikeToast Sg;
    private qsH UI;
    private String VOe;
    private String Wwa;
    UZM YFl;
    private Wwa YI;
    private pDU YoT;
    private ILoader ZU;
    private hQ aIu;
    private String bZ;
    private com.bytedance.sdk.openadsdk.qO.YFl.YFl dGX;
    private boolean dXO;
    private EH eT;
    private com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.vc hQ;
    private eT ko;
    private nc lG;
    private int lu;
    private int mB;
    private String mn;

    /* renamed from: nc, reason: collision with root package name */
    private RelativeLayout f10541nc;
    private int pDU;
    private String qO;
    private com.bytedance.sdk.openadsdk.core.widget.eT rkt;
    private com.bytedance.sdk.component.NjR.AlY wN;
    private hQ wXo;
    private com.bytedance.sdk.openadsdk.AlY.AlY.wN zG;

    /* renamed from: vc, reason: collision with root package name */
    private boolean f10542vc = true;
    private boolean qsH = false;
    private boolean NjR = true;
    final AtomicBoolean tN = new AtomicBoolean(false);
    private final String UZM = "embeded_ad";
    private final bZ Ga = new bZ(Looper.getMainLooper(), this);
    private final AtomicBoolean pq = new AtomicBoolean(false);
    private final AtomicInteger zB = new AtomicInteger(0);
    private final AtomicInteger Sco = new AtomicInteger(0);
    private final AtomicInteger GS = new AtomicInteger(0);
    private boolean BPI = false;
    protected com.bytedance.sdk.openadsdk.YoT.AlY AlY = new com.bytedance.sdk.openadsdk.YoT.AlY() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.8
        @Override // com.bytedance.sdk.openadsdk.YoT.AlY
        public void Sg() {
            if (Ne.pDU(TTPlayableLandingPageActivity.this.YI) && Ne.EH(TTPlayableLandingPageActivity.this.YI)) {
                TTPlayableLandingPageActivity.this.Ga.sendMessageDelayed(TTPlayableLandingPageActivity.this.YFl(0, 0), 1000L);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.YoT.AlY
        public void YFl() {
            if (!TTPlayableLandingPageActivity.this.isFinishing() && Ne.pDU(TTPlayableLandingPageActivity.this.YI) && Ne.rkt(TTPlayableLandingPageActivity.this.YI)) {
                TTPlayableLandingPageActivity.this.Ga.removeMessages(2);
                TTPlayableLandingPageActivity.this.Ga.sendMessage(TTPlayableLandingPageActivity.this.YFl(1, 0));
            }
        }

        @Override // com.bytedance.sdk.openadsdk.YoT.AlY
        public void YFl(int i10) {
            if (!Ne.pDU(TTPlayableLandingPageActivity.this.YI) || TTPlayableLandingPageActivity.this.rkt == null) {
                return;
            }
            TTPlayableLandingPageActivity.this.rkt.setProgress(i10);
        }
    };
    private int iY = 1;

    @Override // android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        com.bytedance.sdk.openadsdk.AlY.AlY.wN wNVar = this.zG;
        if (wNVar != null) {
            wNVar.qsH();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    @SuppressLint({"SourceLockedOrientationActivity"})
    public void onCreate(@Nullable Bundle bundle) {
        com.bytedance.sdk.openadsdk.qO.YFl.YFl yFl;
        super.onCreate(bundle);
        if (!com.bytedance.sdk.openadsdk.core.pDU.wN()) {
            finish();
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            requestWindowFeature(1);
            getWindow().addFlags(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
            getWindow().addFlags(16777216);
            lG.Sg(this);
        } catch (Throwable unused) {
        }
        YFl(bundle);
        Wwa wwa = this.YI;
        if (wwa == null) {
            return;
        }
        this.Bh = wwa.jqV();
        int lG = Ne.lG(this.YI);
        int i10 = 0;
        if (lG != 0) {
            if (lG != 1) {
                if (lG == 2) {
                    setRequestedOrientation(0);
                    this.iY = 2;
                }
            } else {
                setRequestedOrientation(1);
            }
        } else {
            setRequestedOrientation(14);
        }
        this.GA = this;
        try {
            setContentView(AlY());
            NjR();
            vc();
            if (this.Bh) {
                pDU();
                this.dGX.YFl(false, (com.bytedance.sdk.openadsdk.YoT.wN) null);
            } else {
                YFl();
                eT();
                if (!TextUtils.isEmpty(this.mn)) {
                    this.ZU = com.bytedance.sdk.openadsdk.DSW.Sg.YFl().Sg();
                    int YFl = com.bytedance.sdk.openadsdk.DSW.Sg.YFl().YFl(this.ZU, this.mn);
                    this.lu = YFl;
                    if (YFl > 0) {
                        i10 = 2;
                    }
                    this.mB = i10;
                }
                qsH();
                com.bytedance.sdk.openadsdk.AlY.AlY.wN wNVar = this.zG;
                if (wNVar != null) {
                    wNVar.DSW();
                }
            }
            DSW();
            tN.YFl.YFl(SystemClock.elapsedRealtime() - elapsedRealtime, this.YI, "embeded_ad", this.ZU, this.mn);
            if (this.Bh && (yFl = this.dGX) != null) {
                yFl.YFl();
            }
        } catch (Throwable unused2) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.bytedance.sdk.openadsdk.qO.YFl.YFl yFl = this.dGX;
        if (yFl != null) {
            yFl.AlY();
        }
        com.bytedance.sdk.openadsdk.AlY.AlY.wN wNVar = this.zG;
        if (wNVar != null) {
            wNVar.YFl(true);
            this.zG.YoT();
        }
        this.Ga.removeCallbacksAndMessages(null);
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
        } catch (Throwable unused) {
        }
        if (!TextUtils.isEmpty(this.mn)) {
            tN.YFl.YFl(this.Sco.get(), this.zB.get(), this.YI);
        }
        com.bytedance.sdk.openadsdk.DSW.Sg.YFl().YFl(this.ZU);
        com.bytedance.sdk.component.NjR.AlY alY = this.wN;
        if (alY != null) {
            zB.YFl(alY.getWebView());
            this.wN.YoT();
        }
        this.wN = null;
        hQ hQVar = this.aIu;
        if (hQVar != null) {
            hQVar.eT();
        }
        hQ hQVar2 = this.wXo;
        if (hQVar2 != null) {
            hQVar2.eT();
        }
        qsH qsh = this.UI;
        if (qsh != null) {
            qsh.Sco();
        }
        eT eTVar = this.ko;
        if (eTVar != null) {
            eTVar.tN(true);
        }
        UZM uzm = this.YFl;
        if (uzm != null) {
            uzm.Sg();
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        hQ hQVar = this.aIu;
        if (hQVar != null) {
            hQVar.Sg(false);
        }
        qsH qsh = this.UI;
        if (qsh != null) {
            qsh.YFl(true);
            this.UI.tN(false);
        }
        DeviceUtils.AudioInfoReceiver.Sg((com.bytedance.sdk.openadsdk.YoT.DSW) this);
        com.bytedance.sdk.openadsdk.qO.YFl.YFl yFl = this.dGX;
        if (yFl != null) {
            yFl.tN();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        boolean z10;
        super.onResume();
        hQ hQVar = this.aIu;
        if (hQVar != null) {
            hQVar.nc();
            com.bytedance.sdk.component.NjR.AlY alY = this.wN;
            if (alY != null) {
                hQ hQVar2 = this.aIu;
                if (alY.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                hQVar2.Sg(z10);
            }
        }
        hQ hQVar3 = this.wXo;
        if (hQVar3 != null) {
            hQVar3.nc();
        }
        qsH qsh = this.UI;
        if (qsh != null) {
            qsh.tN(true);
        }
        eT eTVar = this.ko;
        if (eTVar != null) {
            eTVar.DSW();
        }
        DeviceUtils.AudioInfoReceiver.YFl((com.bytedance.sdk.openadsdk.YoT.DSW) this);
        if (DeviceUtils.DSW() == 0) {
            this.BPI = true;
        }
        tN(this.BPI);
        com.bytedance.sdk.openadsdk.qO.YFl.YFl yFl = this.dGX;
        if (yFl != null) {
            yFl.Sg();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        String str;
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            Wwa wwa = this.YI;
            if (wwa != null) {
                str = wwa.ni().toString();
            } else {
                str = null;
            }
            bundle.putString("material_meta", str);
            bundle.putInt("sdk_version", this.pDU);
            bundle.putString("adid", this.Wwa);
            bundle.putString("log_extra", this.qO);
            bundle.putInt("source", this.Ne);
            bundle.putBoolean("ad_pending_download", this.dXO);
            bundle.putString("url", this.VOe);
            bundle.putString("web_title", this.bZ);
            bundle.putString("event_tag", "embeded_ad");
        } catch (Throwable unused) {
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        com.bytedance.sdk.openadsdk.AlY.AlY.wN wNVar = this.zG;
        if (wNVar != null) {
            wNVar.nc();
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        com.bytedance.sdk.openadsdk.AlY.AlY.wN wNVar = this.zG;
        if (wNVar != null) {
            wNVar.NjR();
        }
        eT eTVar = this.ko;
        if (eTVar != null) {
            eTVar.qsH();
        }
    }

    private void DSW() {
        int i10 = lG.AlY().Ga(String.valueOf(this.YI.kU())).lG;
        if (i10 >= 0) {
            this.Ga.sendEmptyMessageDelayed(1, i10 * 1000);
        } else {
            GS.YFl((View) this.f10541nc, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void GA() {
        TTAdDislikeToast tTAdDislikeToast = this.Sg;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
        }
    }

    private void NjR() {
        RelativeLayout relativeLayout = this.f10541nc;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTPlayableLandingPageActivity.this.zG != null) {
                        TTPlayableLandingPageActivity.this.zG.qsH();
                    }
                    TTPlayableLandingPageActivity.this.Ga.sendMessage(TTPlayableLandingPageActivity.this.YFl(4, 0));
                    TTPlayableLandingPageActivity.this.YFl("playable_close");
                    TTPlayableLandingPageActivity.this.finish();
                }
            });
        }
        EH eh2 = this.eT;
        if (eh2 != null) {
            eh2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTPlayableLandingPageActivity.this.Sg();
                }
            });
        }
        pDU pdu = this.YoT;
        if (pdu != null) {
            pdu.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTPlayableLandingPageActivity.this.BPI = !r2.BPI;
                    TTPlayableLandingPageActivity tTPlayableLandingPageActivity = TTPlayableLandingPageActivity.this;
                    tTPlayableLandingPageActivity.tN(tTPlayableLandingPageActivity.BPI);
                    if (TTPlayableLandingPageActivity.this.UI != null) {
                        TTPlayableLandingPageActivity.this.UI.YFl(TTPlayableLandingPageActivity.this.BPI);
                    }
                }
            });
        }
        if (this.Bh) {
            return;
        }
        this.wN.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        GS.YFl((View) this.wN, 4);
        this.rkt.Sg(this.YI, this.iY);
    }

    private void YoT() {
        TTAdDislikeToast tTAdDislikeToast = this.Sg;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.show(TTAdDislikeToast.getDislikeTip());
        }
    }

    private void eT() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.YI);
        this.zG = new com.bytedance.sdk.openadsdk.AlY.lG(3, "embeded_ad", this.YI);
        this.aIu = new hQ(this);
        this.aIu.Sg(this.wN).YFl(this.YI).YFl(arrayList).tN(this.Wwa).AlY(this.qO).Sg("embeded_ad").Sg(this.Ne).YFl(this).YFl(this.zG).YFl(this.AlY).YFl(this.wN).wN(this.YI.cC());
        wN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nc() {
        if (this.pq.getAndSet(true)) {
            return;
        }
        if (Ne.VOe(this.YI) && (!this.qsH || !this.f10542vc)) {
            if (this.lG == null || this.rkt == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.Sg.YFl yFl = new com.bytedance.sdk.openadsdk.core.Sg.YFl(this, this.YI, "embeded_ad", this.Ne);
            yFl.YFl(this.hQ);
            this.lG.YFl(this.YI, "embeded_ad", yFl);
            GS.YFl((View) this.lG, 0);
            GS.YFl((View) this.rkt, 8);
            GS.YFl((View) this.YoT, 8);
            return;
        }
        com.bytedance.sdk.component.NjR.AlY alY = this.wN;
        if (alY == null || this.rkt == null) {
            return;
        }
        GS.YFl((View) alY, 0);
        GS.YFl((View) this.rkt, 8);
    }

    private void pDU() {
        com.bytedance.sdk.openadsdk.core.Sg.YFl yFl = new com.bytedance.sdk.openadsdk.core.Sg.YFl(this, this.YI, "embeded_ad", this.Ne) { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.7
            @Override // com.bytedance.sdk.openadsdk.core.Sg.YFl, com.bytedance.sdk.openadsdk.core.Sg.Sg, com.bytedance.sdk.openadsdk.core.Sg.tN
            public void YFl(View view, float f10, float f11, float f12, float f13, SparseArray<tN.YFl> sparseArray, boolean z10) {
                Wwa wwa = ((com.bytedance.sdk.openadsdk.core.Sg.Sg) this).f10642vc;
                if (wwa != null && wwa.qO() == 1 && !z10) {
                    return;
                }
                super.YFl(view, f10, f11, f12, f13, sparseArray, z10);
                TTPlayableLandingPageActivity.this.dXO = true;
                TTPlayableLandingPageActivity.this.Cfr = true;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_url", TTPlayableLandingPageActivity.this.VOe);
                } catch (JSONException e2) {
                    YoT.YFl("TTPWPActivity", "onClick JSON ERROR", e2);
                }
                com.bytedance.sdk.openadsdk.AlY.tN.Sg(TTPlayableLandingPageActivity.this.YI, ((com.bytedance.sdk.openadsdk.core.Sg.Sg) this).DSW, "click_playable_download_button_loading", jSONObject);
            }
        };
        yFl.YFl(this.hQ);
        com.bytedance.sdk.openadsdk.qO.YFl.YFl yFl2 = this.dGX;
        if (yFl2 != null) {
            yFl2.YFl(yFl);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void qsH() {
        com.bytedance.sdk.component.NjR.AlY alY = this.wN;
        if (alY == null) {
            return;
        }
        alY.setLandingPage(true);
        this.wN.setTag("landingpage");
        this.wN.setMaterialMeta(this.YI.JT());
        eT YFl = new eT(this.YI, this.wN.getWebView(), new com.bytedance.sdk.openadsdk.AlY.nc() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.12
            @Override // com.bytedance.sdk.openadsdk.AlY.nc
            public void YFl(int i10) {
                tN.YFl.YFl(TTPlayableLandingPageActivity.this.lu, TTPlayableLandingPageActivity.this.GS.get(), TTPlayableLandingPageActivity.this.Sco.get(), TTPlayableLandingPageActivity.this.zB.get() - TTPlayableLandingPageActivity.this.Sco.get(), TTPlayableLandingPageActivity.this.YI, "embeded_ad", i10);
            }
        }, this.mB).YFl(true);
        this.ko = YFl;
        YFl.YFl("embeded_ad");
        this.ko.YFl(this.zG);
        this.ko.YFl(this.UI);
        this.wN.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.YFl.wN(this.GA, this.aIu, this.Wwa, this.ko, true) { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.13
            @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.wN, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                TTPlayableLandingPageActivity.this.qsH = true;
                if (TTPlayableLandingPageActivity.this.isFinishing()) {
                    return;
                }
                if (TTPlayableLandingPageActivity.this.UI != null) {
                    TTPlayableLandingPageActivity.this.UI.NjR(str);
                }
                try {
                    TTPlayableLandingPageActivity.this.AlY.Sg();
                } catch (Throwable unused) {
                }
                try {
                    if (TTPlayableLandingPageActivity.this.EH != null) {
                        TTPlayableLandingPageActivity.this.EH.setVisibility(8);
                    }
                    if (TTPlayableLandingPageActivity.this.f10542vc) {
                        TTPlayableLandingPageActivity.this.nc();
                        TTPlayableLandingPageActivity.this.YFl("py_loading_success");
                        hQ hQVar = this.tN;
                        if (hQVar != null) {
                            hQVar.Sg(true);
                        }
                    }
                } catch (Throwable unused2) {
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.wN, android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.wN, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                TTPlayableLandingPageActivity.this.f10542vc = false;
                if (TTPlayableLandingPageActivity.this.UI == null || webResourceError == null || webResourceRequest == null) {
                    return;
                }
                TTPlayableLandingPageActivity.this.UI.YFl(webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription()), String.valueOf(webResourceRequest.getUrl()));
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.wN, android.webkit.WebViewClient
            @RequiresApi(api = 21)
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                if (TTPlayableLandingPageActivity.this.VOe != null && webResourceRequest != null && webResourceRequest.getUrl() != null && TTPlayableLandingPageActivity.this.VOe.equals(webResourceRequest.getUrl().toString())) {
                    TTPlayableLandingPageActivity.this.f10542vc = false;
                }
                if (TTPlayableLandingPageActivity.this.UI != null && webResourceRequest != null) {
                    try {
                        TTPlayableLandingPageActivity.this.UI.YFl(webResourceRequest.isForMainFrame(), webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode());
                    } catch (Throwable unused) {
                    }
                }
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.wN, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                int i10;
                try {
                    if (TTPlayableLandingPageActivity.this.UI != null) {
                        TTPlayableLandingPageActivity.this.UI.nc(str);
                    }
                    if (!TextUtils.isEmpty(TTPlayableLandingPageActivity.this.mn)) {
                        TTPlayableLandingPageActivity.this.zB.incrementAndGet();
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    WebResourceResponseModel YFl2 = com.bytedance.sdk.openadsdk.DSW.Sg.YFl().YFl(TTPlayableLandingPageActivity.this.ZU, TTPlayableLandingPageActivity.this.mn, str);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (TTPlayableLandingPageActivity.this.zG != null) {
                        nc.YFl YFl3 = com.bytedance.sdk.component.adexpress.AlY.nc.YFl(str);
                        if (YFl2 != null && YFl2.getWebResourceResponse() != null) {
                            i10 = 1;
                        } else {
                            i10 = 2;
                        }
                        if (YFl3 == nc.YFl.HTML) {
                            TTPlayableLandingPageActivity.this.zG.YFl(str, currentTimeMillis, currentTimeMillis2, i10);
                        } else if (YFl3 == nc.YFl.JS) {
                            TTPlayableLandingPageActivity.this.zG.Sg(str, currentTimeMillis, currentTimeMillis2, i10);
                        }
                    }
                    if (YFl2 != null && YFl2.getWebResourceResponse() != null) {
                        TTPlayableLandingPageActivity.this.Sco.incrementAndGet();
                        if (TTPlayableLandingPageActivity.this.UI != null) {
                            TTPlayableLandingPageActivity.this.UI.eT(str);
                        }
                        return YFl2.getWebResourceResponse();
                    }
                    if (YFl2 != null && YFl2.getMsg() == 2) {
                        TTPlayableLandingPageActivity.this.GS.incrementAndGet();
                    }
                    return super.shouldInterceptRequest(webView, str);
                } catch (Exception unused) {
                    return super.shouldInterceptRequest(webView, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.wN, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i10, String str, String str2) {
                super.onReceivedError(webView, i10, str, str2);
            }
        });
        YFl(this.wN);
        com.bytedance.sdk.openadsdk.utils.Wwa.YFl(this.wN, this.VOe);
        qsH qsh = this.UI;
        if (qsh != null) {
            qsh.qsH(this.VOe);
        }
        this.wN.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.YFl.AlY(this.aIu, this.ko) { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.14
            @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.AlY, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i10) {
                super.onProgressChanged(webView, i10);
                if (TTPlayableLandingPageActivity.this.isFinishing()) {
                    return;
                }
                try {
                    TTPlayableLandingPageActivity.this.AlY.YFl(i10);
                } catch (Throwable unused) {
                }
                if (TTPlayableLandingPageActivity.this.EH != null) {
                    if (i10 == 100) {
                        TTPlayableLandingPageActivity.this.qsH = true;
                        TTPlayableLandingPageActivity.this.EH.setVisibility(8);
                        TTPlayableLandingPageActivity.this.nc();
                        return;
                    }
                    TTPlayableLandingPageActivity.this.EH.setProgress(i10);
                }
            }
        });
        this.wN.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.15
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (TTPlayableLandingPageActivity.this.ko != null) {
                    TTPlayableLandingPageActivity.this.ko.YFl(motionEvent);
                    return false;
                }
                return false;
            }
        });
    }

    private void vc() {
        if (this.YI.ko() == 4) {
            this.hQ = com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.DSW.YFl(this.GA, this.YI, "interaction");
        }
    }

    private View AlY() {
        com.bytedance.sdk.openadsdk.core.wN.tN tNVar = new com.bytedance.sdk.openadsdk.core.wN.tN(this);
        tNVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        if (this.Bh) {
            this.dGX = new com.bytedance.sdk.openadsdk.qO.YFl.YFl(this.GA, this.YI, this.iY, this.BPI, tNVar);
        } else {
            this.wN = new com.bytedance.sdk.component.NjR.AlY(this);
            this.wN.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.wN.setVisibility(4);
            this.EH = new com.bytedance.sdk.openadsdk.core.wN.vc(this, null, R.style.Widget.ProgressBar.Horizontal);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, GS.tN(this, 3.0f));
            layoutParams.gravity = 49;
            this.EH.setLayoutParams(layoutParams);
            this.EH.setProgress(1);
            this.EH.setProgressDrawable(com.bytedance.sdk.openadsdk.utils.qsH.YFl(this, "tt_browser_progress_style"));
            this.rkt = new com.bytedance.sdk.openadsdk.core.widget.eT(this);
            this.rkt.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.rkt.setClickable(true);
            this.rkt.setFocusable(true);
            this.lG = new com.bytedance.sdk.openadsdk.core.widget.nc(this);
            this.lG.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        this.YoT = new pDU(this);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(GS.tN(this, 28.0f), GS.tN(this, 28.0f));
        layoutParams2.leftMargin = GS.tN(this, 12.0f);
        layoutParams2.topMargin = GS.tN(this, 20.0f);
        this.YoT.setLayoutParams(layoutParams2);
        this.YoT.setScaleType(ImageView.ScaleType.CENTER);
        this.YoT.setImageDrawable(com.bytedance.sdk.openadsdk.utils.qsH.YFl(this, "tt_unmute_wrapper"));
        this.eT = new EH(this);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, GS.tN(this, 28.0f));
        layoutParams3.gravity = 8388661;
        layoutParams3.leftMargin = GS.tN(this, 16.0f);
        layoutParams3.rightMargin = GS.tN(this, 80.0f);
        layoutParams3.topMargin = GS.tN(this, 20.0f);
        this.eT.setLayoutParams(layoutParams3);
        this.eT.setGravity(17);
        this.eT.setText(qO.YFl(this, "tt_reward_feedback"));
        this.eT.setTextColor(-1);
        this.eT.setTextSize(14.0f);
        this.f10541nc = new com.bytedance.sdk.openadsdk.core.wN.DSW(this);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(GS.tN(this, 28.0f), GS.tN(this, 28.0f));
        layoutParams4.gravity = 8388661;
        layoutParams4.topMargin = GS.tN(this, 20.0f);
        layoutParams4.rightMargin = GS.tN(this, 24.0f);
        this.f10541nc.setLayoutParams(layoutParams4);
        this.f10541nc.setBackground(com.bytedance.sdk.openadsdk.utils.qsH.YFl(this, "tt_mute_btn_bg"));
        this.f10541nc.setGravity(17);
        this.f10541nc.setVisibility(8);
        com.bytedance.sdk.openadsdk.core.wN.AlY alY = new com.bytedance.sdk.openadsdk.core.wN.AlY(this);
        alY.setLayoutParams(new RelativeLayout.LayoutParams(GS.tN(this, 12.0f), GS.tN(this, 12.0f)));
        alY.setImageDrawable(qO.tN(this, "tt_video_close_drawable"));
        alY.setVisibility(0);
        this.f10541nc.addView(alY);
        if (!this.Bh) {
            tNVar.addView(this.wN);
            tNVar.addView(this.EH);
            tNVar.addView(this.lG);
            tNVar.addView(this.rkt);
        }
        tNVar.addView(this.YoT);
        tNVar.addView(this.eT);
        tNVar.addView(this.f10541nc);
        return tNVar;
    }

    private void wN() {
        if (this.UI != null) {
            return;
        }
        if (NjR.Sg().lG()) {
            com.bytedance.sdk.openadsdk.qO.DSW.YFl(fIu);
        }
        com.bytedance.sdk.openadsdk.qO.YFl yFl = new com.bytedance.sdk.openadsdk.qO.YFl() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.9
            @Override // com.bytedance.sdk.openadsdk.qO.YFl
            public void YFl(int i10, String str) {
                super.YFl(i10, str);
                if (Ne.VOe(TTPlayableLandingPageActivity.this.YI)) {
                    TTPlayableLandingPageActivity.this.Ga.sendMessage(TTPlayableLandingPageActivity.this.YFl(3, Ne.YFl(i10)));
                    TTPlayableLandingPageActivity.this.nc();
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
            public void YFl(JSONObject jSONObject) {
                com.bytedance.sdk.openadsdk.AlY.tN.Sg(TTPlayableLandingPageActivity.this.YI, "embeded_ad", "playable_track", jSONObject);
            }
        };
        com.bytedance.sdk.openadsdk.qO.tN tNVar = new com.bytedance.sdk.openadsdk.qO.tN() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.10
            @Override // com.bytedance.sdk.openadsdk.qO.tN
            public void YFl(String str, JSONObject jSONObject) {
                TTPlayableLandingPageActivity.this.aIu.YFl(str, jSONObject);
            }
        };
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(BidResponsedEx.KEY_CID, this.Wwa);
            jSONObject.put("log_extra", this.qO);
            this.UI = qsH.YFl(getApplicationContext(), this.wN.getWebView(), tNVar, yFl).DSW(this.VOe).wN(com.bytedance.sdk.openadsdk.common.YFl.YFl(lG.YFl())).YFl(com.bytedance.sdk.openadsdk.common.YFl.YFl()).tN(jSONObject).Sg(com.bytedance.sdk.openadsdk.common.YFl.wN()).YFl("sdkEdition", com.bytedance.sdk.openadsdk.common.YFl.tN()).AlY(com.bytedance.sdk.openadsdk.common.YFl.AlY()).AlY(false).YFl(this.BPI).YFl(Ne.aIu(this.YI)).Sg(Ne.aIu(this.YI)).wN(true);
        } catch (Throwable unused) {
        }
        if (this.UI == null) {
            YoT.YFl("Pangle", "new PlayablePlugin Object failed, mPlayablePlugin is null");
            return;
        }
        if (!TextUtils.isEmpty(Ne.eT(this.YI))) {
            this.UI.tN(Ne.eT(this.YI));
        }
        Set<String> eT = this.UI.eT();
        final WeakReference weakReference = new WeakReference(this.UI);
        for (String str : eT) {
            if (!"subscribe_app_ad".equals(str) && !"adInfo".equals(str) && !"webview_time_track".equals(str) && !"download_app_ad".equals(str)) {
                this.aIu.YFl().YFl(str, new com.bytedance.sdk.component.YFl.wN<JSONObject, JSONObject>() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.11
                    @Override // com.bytedance.sdk.component.YFl.wN
                    public JSONObject YFl(@NonNull JSONObject jSONObject2, @NonNull com.bytedance.sdk.component.YFl.vc vcVar) {
                        try {
                            qsH qsh = (qsH) weakReference.get();
                            if (qsh == null) {
                                return null;
                            }
                            return qsh.AlY(YFl(), jSONObject2);
                        } catch (Throwable unused2) {
                            return null;
                        }
                    }
                });
            }
        }
    }

    public void Sg() {
        if (this.YI == null || isFinishing()) {
            return;
        }
        if (this.tN.get()) {
            YoT();
            return;
        }
        if (this.YFl == null) {
            tN();
        }
        this.YFl.YFl(new UZM.YFl() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.6
            @Override // com.bytedance.sdk.openadsdk.core.UZM.YFl
            public void YFl() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.UZM.YFl
            public void YFl(int i10, String str) {
                if (TTPlayableLandingPageActivity.this.tN.get() || TextUtils.isEmpty(str)) {
                    return;
                }
                TTPlayableLandingPageActivity.this.tN.set(true);
                TTPlayableLandingPageActivity.this.GA();
            }
        });
        UZM uzm = this.YFl;
        if (uzm != null) {
            uzm.YFl();
        }
    }

    public void tN() {
        Wwa wwa = this.YI;
        if (wwa != null) {
            this.YFl = new com.bytedance.sdk.openadsdk.tN.tN(this, wwa.uGS(), this.YI.UT(), this.YI.ni().toString(), "playable");
        }
        if (this.Sg == null) {
            this.Sg = new TTAdDislikeToast(this);
            ((FrameLayout) findViewById(R.id.content)).addView(this.Sg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Message YFl(int i10, int i11) {
        Message obtain = Message.obtain();
        obtain.what = 2;
        obtain.arg1 = i10;
        if (i10 == 3) {
            obtain.arg2 = i11;
        }
        return obtain;
    }

    private void YFl(Bundle bundle) {
        Intent intent = getIntent();
        if (intent != null) {
            this.pDU = intent.getIntExtra("sdk_version", 1);
            this.Wwa = intent.getStringExtra("adid");
            this.qO = intent.getStringExtra("log_extra");
            this.Ne = intent.getIntExtra("source", -1);
            this.dXO = intent.getBooleanExtra("ad_pending_download", false);
            this.VOe = intent.getStringExtra("url");
            this.mn = intent.getStringExtra("gecko_id");
            this.bZ = intent.getStringExtra("web_title");
            if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
                String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra != null) {
                    try {
                        this.YI = com.bytedance.sdk.openadsdk.core.Sg.YFl(new JSONObject(stringExtra));
                    } catch (Exception e2) {
                        YoT.YFl("TTPWPActivity", "TTPlayableLandingPageActivity - onCreate MultiGlobalInfo : ", e2);
                    }
                }
            } else {
                this.YI = com.bytedance.sdk.openadsdk.core.bZ.YFl().Sg();
                com.bytedance.sdk.openadsdk.core.bZ.YFl().vc();
            }
        }
        if (bundle != null) {
            try {
                this.pDU = bundle.getInt("sdk_version", 1);
                this.Wwa = bundle.getString("adid");
                this.qO = bundle.getString("log_extra");
                this.Ne = bundle.getInt("source", -1);
                this.dXO = bundle.getBoolean("ad_pending_download", false);
                this.VOe = bundle.getString("url");
                this.bZ = bundle.getString("web_title");
                String string = bundle.getString("material_meta", null);
                if (!TextUtils.isEmpty(string)) {
                    this.YI = com.bytedance.sdk.openadsdk.core.Sg.YFl(new JSONObject(string));
                }
            } catch (Throwable unused) {
            }
        }
        if (this.YI == null) {
            YoT.YFl("TTPWPActivity", "material is null, no data to display");
            finish();
        } else {
            try {
                this.BPI = lG.AlY().lG(this.YI.pq().getCodeId());
            } catch (Throwable th2) {
                YoT.YFl("TTPWPActivity", th2.getMessage());
            }
        }
    }

    public void tN(boolean z10) {
        Drawable YFl;
        try {
            this.BPI = z10;
            if (z10) {
                YFl = com.bytedance.sdk.openadsdk.utils.qsH.YFl(this.GA, "tt_mute_wrapper");
            } else {
                YFl = com.bytedance.sdk.openadsdk.utils.qsH.YFl(this.GA, "tt_unmute_wrapper");
            }
            this.YoT.setImageDrawable(YFl);
            qsH qsh = this.UI;
            if (qsh != null) {
                qsh.YFl(z10);
            }
            com.bytedance.sdk.openadsdk.qO.YFl.YFl yFl = this.dGX;
            if (yFl != null) {
                yFl.YFl(z10);
            }
        } catch (Exception e2) {
            YoT.YFl("TTPWPActivity", e2.getMessage());
        }
    }

    public void YFl() {
        if (this.rkt == null) {
            return;
        }
        Wwa wwa = this.YI;
        if (wwa != null && !Ne.pDU(wwa)) {
            this.rkt.tN();
            return;
        }
        this.rkt.Sg(this.YI, this.iY);
        if (this.rkt.getDownloadButton() != null) {
            com.bytedance.sdk.openadsdk.core.Sg.YFl yFl = new com.bytedance.sdk.openadsdk.core.Sg.YFl(this, this.YI, "embeded_ad", this.Ne) { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.5
                @Override // com.bytedance.sdk.openadsdk.core.Sg.YFl, com.bytedance.sdk.openadsdk.core.Sg.Sg, com.bytedance.sdk.openadsdk.core.Sg.tN
                public void YFl(View view, float f10, float f11, float f12, float f13, SparseArray<tN.YFl> sparseArray, boolean z10) {
                    Wwa wwa2 = ((com.bytedance.sdk.openadsdk.core.Sg.Sg) this).f10642vc;
                    if (wwa2 != null && wwa2.qO() == 1 && !z10) {
                        return;
                    }
                    super.YFl(view, f10, f11, f12, f13, sparseArray, z10);
                    TTPlayableLandingPageActivity.this.dXO = true;
                    TTPlayableLandingPageActivity.this.Cfr = true;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("playable_url", TTPlayableLandingPageActivity.this.VOe);
                    } catch (JSONException e2) {
                        YoT.YFl("TTPWPActivity", "onClick JSON ERROR", e2);
                    }
                    com.bytedance.sdk.openadsdk.AlY.tN.Sg(TTPlayableLandingPageActivity.this.YI, ((com.bytedance.sdk.openadsdk.core.Sg.Sg) this).DSW, "click_playable_download_button_loading", jSONObject);
                }
            };
            yFl.YFl(this.hQ);
            this.rkt.getDownloadButton().setOnClickListener(yFl);
        }
        if (Ne.rkt(this.YI)) {
            this.Ga.sendMessageDelayed(YFl(2, Ne.YFl(2)), Ne.wXo(this.YI));
        }
    }

    private void YFl(com.bytedance.sdk.component.NjR.AlY alY) {
        if (alY == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.YFl.tN.YFl(this.GA).YFl(false).Sg(false).YFl(alY.getWebView());
        alY.setUserAgentString(rkt.YFl(alY.getWebView(), this.pDU));
        alY.setMixedContentMode(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(String str) {
        com.bytedance.sdk.openadsdk.AlY.tN.YFl(System.currentTimeMillis(), this.YI, "embeded_ad", str);
    }

    @Override // com.bytedance.sdk.component.utils.bZ.YFl
    public void YFl(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            GS.YFl((View) this.f10541nc, 0);
            return;
        }
        if (i10 != 2) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.eT eTVar = this.rkt;
        if (eTVar == null || !eTVar.AlY()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("remove_loading_page_type", message.arg1);
                int i11 = message.arg2;
                if (i11 != 0) {
                    jSONObject.put("remove_loading_page_reason", i11);
                }
                jSONObject.put("playable_url", this.VOe);
                com.bytedance.sdk.openadsdk.core.widget.eT eTVar2 = this.rkt;
                jSONObject.put("duration", eTVar2 != null ? eTVar2.getDisplayDuration() : 0L);
            } catch (JSONException e2) {
                YoT.YFl("TTPWPActivity", "handleMsg json error", e2);
            }
            com.bytedance.sdk.openadsdk.AlY.tN.Sg(this.YI, "embeded_ad", "remove_loading_page", jSONObject);
            this.Ga.removeMessages(2);
            com.bytedance.sdk.openadsdk.core.widget.eT eTVar3 = this.rkt;
            if (eTVar3 != null) {
                eTVar3.tN();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.Sg.AlY
    public void YFl(boolean z10) {
        com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.vc vcVar;
        this.dXO = true;
        this.Cfr = z10;
        if (!z10) {
            try {
                Toast.makeText(this.GA, "Download later", 0).show();
            } catch (Throwable unused) {
            }
        }
        if (!this.Cfr || (vcVar = this.hQ) == null) {
            return;
        }
        vcVar.AlY();
    }

    @Override // com.bytedance.sdk.openadsdk.YoT.DSW
    public void YFl(int i10) {
        tN(i10 <= 0);
    }
}
