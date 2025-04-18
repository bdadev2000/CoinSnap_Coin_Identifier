package com.bytedance.sdk.openadsdk.common;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.bZ;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.utils.mn;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class tN implements bZ.YFl {
    private final com.bytedance.sdk.component.NjR.AlY AlY;
    private boolean EH;
    private int NjR;
    private final boolean Sg;
    private final Wwa YFl;
    private int aIu;
    private String eT;
    private boolean lG;

    /* renamed from: nc, reason: collision with root package name */
    private long f10567nc;
    private int pDU;
    private float qsH;
    private long rkt;
    private WebView tN;
    private Sg wN;

    /* renamed from: vc, reason: collision with root package name */
    private String f10568vc = "landingpage";
    private final Handler DSW = new bZ(com.bytedance.sdk.openadsdk.core.pDU.Sg().getLooper(), this);
    private final AtomicBoolean YoT = new AtomicBoolean(false);
    private Pattern GA = null;
    private long qO = -1;
    private final List<Integer> Wwa = new ArrayList();

    public tN(Wwa wwa, com.bytedance.sdk.component.NjR.AlY alY, String str, boolean z10) {
        this.YFl = wwa;
        this.AlY = alY;
        this.Sg = z10;
        YFl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    public void AlY() {
        if (mn.wN()) {
            wN();
        } else {
            com.bytedance.sdk.component.utils.DSW.Sg().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.tN.2
                @Override // java.lang.Runnable
                public void run() {
                    tN.this.wN();
                }
            });
        }
    }

    private int DSW() {
        try {
            return this.tN.copyBackForwardList().getCurrentIndex() + 1;
        } catch (Throwable unused) {
            return 0;
        }
    }

    private void qsH() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("loading_show_interval", SystemClock.elapsedRealtime() - this.qO);
            jSONObject.put("loading_show_timestamp", this.rkt);
            WebView webView = this.tN;
            jSONObject.put("arbi_current_url", webView != null ? webView.getUrl() : "");
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.AlY.tN.Sg(this.YFl, this.f10568vc, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean vc() {
        return DSW() > 0 && !this.YoT.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    public void wN() {
        this.EH = false;
        if (this.YoT.getAndSet(true)) {
            return;
        }
        this.f10567nc = SystemClock.elapsedRealtime();
        this.rkt = System.currentTimeMillis();
        qsH();
        WebView webView = this.tN;
        if (webView != null) {
            this.eT = webView.getUrl();
        }
        Sg sg2 = this.wN;
        if (sg2 == null) {
            return;
        }
        sg2.setVisibility(0);
        this.wN.YFl(this.YFl);
        this.wN.YFl();
        this.wN.setAlpha(this.qsH);
        this.wN.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.common.tN.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        tN();
        Sg();
    }

    public void Sg(WebView webView, String str, boolean z10) {
        if (!z10 || this.wN == null) {
            return;
        }
        YFl(1);
    }

    public void tN(WebView webView, String str, boolean z10) {
        this.Wwa.clear();
        this.lG = z10;
        if (z10) {
            this.EH = true;
        }
        this.aIu = DSW();
    }

    public void YFl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f10568vc = str;
    }

    private void Sg() {
        Handler handler = this.DSW;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(1, this.NjR);
        }
    }

    private void YFl() {
        com.bytedance.sdk.component.NjR.AlY alY = this.AlY;
        if (alY != null) {
            this.tN = alY.getWebView();
            View arbitrageLoadingView = this.AlY.getArbitrageLoadingView();
            if (arbitrageLoadingView instanceof Sg) {
                this.wN = (Sg) arbitrageLoadingView;
            }
        }
        this.NjR = com.bytedance.sdk.openadsdk.core.settings.rkt.JwO().ECi();
        this.qsH = com.bytedance.sdk.openadsdk.core.settings.rkt.JwO().VJb();
    }

    private void tN() {
        Handler handler = this.DSW;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void YFl(WebView webView, String str, boolean z10) {
        if (z10 && vc()) {
            AlY();
        }
    }

    public void YFl(WebView webView, String str) {
        Wwa wwa = this.YFl;
        if (wwa == null || !com.bytedance.sdk.component.NjR.Sg.YFl(wwa.nc().tN(), str)) {
            return;
        }
        this.pDU++;
        com.bytedance.sdk.component.utils.DSW.Sg().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.tN.1
            @Override // java.lang.Runnable
            public void run() {
                if (tN.this.vc()) {
                    tN.this.AlY();
                }
            }
        });
    }

    public void YFl(WebView webView, int i10) {
        Sg sg2 = this.wN;
        if (sg2 != null) {
            sg2.YFl(i10);
        }
        if (this.lG) {
            if (YFl(i10, 30)) {
                YFl(30, webView);
            }
            if (YFl(i10, 50)) {
                YFl(50, webView);
            }
            if (YFl(i10, 70)) {
                YFl(70, webView);
            }
        }
        if (this.wN == null || i10 != 100) {
            return;
        }
        YFl(1);
    }

    private void YFl(final int i10) {
        com.bytedance.sdk.component.utils.DSW.Sg().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.tN.4
            @Override // java.lang.Runnable
            public void run() {
                if (tN.this.wN != null) {
                    tN.this.YoT.set(false);
                    tN.this.wN.YFl(tN.this.YFl, tN.this.f10568vc, i10, tN.this.eT, tN.this.f10567nc, tN.this.EH, tN.this.pDU, tN.this.rkt);
                    tN.this.pDU = 0;
                }
            }
        });
        tN();
    }

    @Override // com.bytedance.sdk.component.utils.bZ.YFl
    public void YFl(Message message) {
        if (message.what == 1) {
            YFl(0);
        }
    }

    public void YFl(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.qO = SystemClock.elapsedRealtime();
        }
    }

    private boolean YFl(int i10, int i11) {
        if (i10 < i11 || this.Wwa.contains(Integer.valueOf(i11)) || this.aIu < 2) {
            return false;
        }
        this.Wwa.add(Integer.valueOf(i11));
        return true;
    }

    private void YFl(int i10, WebView webView) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("load_progress", i10);
            jSONObject.put("progress_timestamp", System.currentTimeMillis());
            jSONObject.put("arbi_current_url", webView.getUrl());
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.AlY.tN.tN(this.YFl, this.f10568vc, jSONObject);
    }
}
