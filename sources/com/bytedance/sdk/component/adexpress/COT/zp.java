package com.bytedance.sdk.component.adexpress.COT;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.component.sdk.annotation.UiThread;
import com.bytedance.sdk.component.adexpress.lMd.Bj;
import com.bytedance.sdk.component.adexpress.lMd.QR;
import com.bytedance.sdk.component.adexpress.lMd.ku;
import com.bytedance.sdk.component.adexpress.lMd.rV;
import com.bytedance.sdk.component.adexpress.lMd.tG;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.utils.vDp;
import com.bytedance.sdk.component.widget.SSWebView;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class zp implements Bj, com.bytedance.sdk.component.adexpress.lMd.jU<SSWebView>, com.bytedance.sdk.component.adexpress.theme.zp, com.bytedance.sdk.component.adexpress.zp {
    private boolean Bj;
    protected com.bytedance.sdk.component.adexpress.zp.KS.lMd COT;
    protected SSWebView KS;
    private Context QR;
    private String YW;
    private int dQp;
    private volatile QR dT;
    private String ku;
    protected boolean lMd;
    private boolean rV;
    private tG tG;
    private ku vDp;
    protected JSONObject zp;
    protected int jU = 8;
    protected AtomicBoolean HWF = new AtomicBoolean(false);
    private boolean KVG = false;

    public zp(Context context, tG tGVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver) {
        this.Bj = false;
        this.QR = context;
        this.tG = tGVar;
        this.ku = tGVar.jU();
        themeStatusBroadcastReceiver.zp(this);
        if (com.bytedance.sdk.component.adexpress.jU.lMd()) {
            vDp();
            return;
        }
        SSWebView tG = tG();
        this.KS = tG;
        if (tG == null) {
            Log.d("WebViewRender", "initWebView: create WebView");
            if (com.bytedance.sdk.component.adexpress.jU.zp() != null) {
                this.KS = new SSWebView(com.bytedance.sdk.component.adexpress.jU.zp());
                return;
            }
            return;
        }
        this.Bj = true;
        Log.d("WebViewRender", "initWebView: reuse WebView");
    }

    private void rV() {
        if (this.tG.FP()) {
            COT.zp().lMd(this.KS);
        } else {
            COT.zp().KS(this.KS);
        }
    }

    private SSWebView tG() {
        if (this.tG.FP()) {
            return COT.zp().zp(this.QR, this.ku);
        }
        return COT.zp().lMd(this.QR, this.ku);
    }

    private void vDp() {
        if (this.QR == null && com.bytedance.sdk.component.adexpress.jU.zp() != null) {
            this.QR = com.bytedance.sdk.component.adexpress.jU.zp();
        }
        if (this.QR != null) {
            SSWebView tG = tG();
            this.KS = tG;
            if (tG == null) {
                Log.d("WebViewRender", "initWebView: create WebView by act");
                this.KS = new SSWebView(new MutableContextWrapper(this.QR.getApplicationContext()));
            } else {
                this.Bj = true;
                Log.d("WebViewRender", "initWebView: reuse WebView");
            }
        }
    }

    public tG Bj() {
        return this.tG;
    }

    public void HWF() {
        if (zp() == null) {
            return;
        }
        try {
            zp().getWebView().resumeTimers();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.jU
    public int KS() {
        return 0;
    }

    public abstract void QR();

    public void YW() {
    }

    public void dT() {
    }

    public void jU() {
        if (this.HWF.get()) {
            return;
        }
        this.HWF.set(true);
        QR();
        if (this.KS.getParent() != null) {
            ((ViewGroup) this.KS.getParent()).removeView(this.KS);
        }
        if (this.lMd) {
            rV();
        } else {
            COT.zp().COT(this.KS);
        }
    }

    public void ku() {
        YW();
        Activity zp = com.bytedance.sdk.component.utils.lMd.zp(this.KS);
        if (zp != null) {
            this.dQp = lMd(zp);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.jU
    /* renamed from: lMd, reason: merged with bridge method [inline-methods] */
    public SSWebView COT() {
        return zp();
    }

    public abstract void lMd(int i9);

    private int lMd(Activity activity) {
        return activity.hashCode();
    }

    public void zp(String str) {
        this.YW = str;
    }

    public void lMd(boolean z8) {
        this.KVG = z8;
    }

    public SSWebView zp() {
        return this.KS;
    }

    public void zp(ku kuVar) {
        this.vDp = kuVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.jU
    public void zp(QR qr) {
        this.dT = qr;
        if (zp() != null && zp().getWebView() != null) {
            if (TextUtils.isEmpty(this.YW)) {
                this.dT.zp(102, "url is empty");
                return;
            }
            if (!this.KVG && !com.bytedance.sdk.component.adexpress.zp.lMd.lMd.zp(this.zp)) {
                QR qr2 = this.dT;
                StringBuilder sb = new StringBuilder("data null is ");
                sb.append(this.zp == null);
                qr2.zp(103, sb.toString());
                return;
            }
            if (this.KVG && !com.bytedance.sdk.component.adexpress.zp.lMd.lMd.lMd(this.zp)) {
                QR qr3 = this.dT;
                StringBuilder sb2 = new StringBuilder("choice ad data null is ");
                sb2.append(this.zp == null);
                qr3.zp(103, sb2.toString());
                return;
            }
            this.tG.COT().zp(this.Bj);
            if (this.Bj) {
                try {
                    this.KS.tG();
                    this.tG.COT();
                    vDp.zp(this.KS.getWebView(), "javascript:window.SDK_RESET_RENDER();window.SDK_TRIGGER_RENDER();");
                    return;
                } catch (Exception e4) {
                    COT.zp().COT(this.KS);
                    this.dT.zp(102, "load exception is " + e4.getMessage());
                    return;
                }
            }
            SSWebView zp = zp();
            zp.tG();
            this.tG.COT();
            zp.a_(this.YW);
            return;
        }
        QR qr4 = this.dT;
        StringBuilder sb3 = new StringBuilder("SSWebview null is ");
        sb3.append(zp() == null);
        sb3.append(" or Webview is null");
        qr4.zp(102, sb3.toString());
    }

    public void zp(boolean z8) {
        this.rV = z8;
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.Bj
    public void zp(final rV rVVar) {
        if (rVVar == null) {
            if (this.dT != null) {
                this.dT.zp(105, "renderResult is null");
                return;
            }
            return;
        }
        boolean KS = rVVar.KS();
        final float jU = (float) rVVar.jU();
        final float COT = (float) rVVar.COT();
        if (jU > 0.0f && COT > 0.0f) {
            this.lMd = KS;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                zp(rVVar, jU, COT);
                return;
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.COT.zp.1
                    @Override // java.lang.Runnable
                    public void run() {
                        zp.this.zp(rVVar, jU, COT);
                    }
                });
                return;
            }
        }
        if (this.dT != null) {
            this.dT.zp(105, "width is " + jU + "height is " + COT);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(rV rVVar, float f9, float f10) {
        rVVar.Bj();
        boolean z8 = this.lMd;
        if (!z8 || this.rV) {
            if (!z8) {
                COT.zp().COT(this.KS);
                return;
            } else {
                zp(rVVar.Bj(), rVVar.dT());
                return;
            }
        }
        zp(f9, f10);
        lMd(this.jU);
        if (this.dT != null) {
            this.dT.zp(zp(), rVVar);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.Bj
    public void zp(View view, int i9, com.bytedance.sdk.component.adexpress.KS ks) {
        ku kuVar = this.vDp;
        if (kuVar != null) {
            kuVar.zp(view, i9, ks);
        }
    }

    @UiThread
    private void zp(float f9, float f10) {
        this.tG.COT().COT();
        int zp = (int) com.bytedance.sdk.component.adexpress.jU.QR.zp(this.QR, f9);
        int zp2 = (int) com.bytedance.sdk.component.adexpress.jU.QR.zp(this.QR, f10);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) zp().getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(zp, zp2);
        }
        layoutParams.width = zp;
        layoutParams.height = zp2;
        zp().setLayoutParams(layoutParams);
    }

    private void zp(int i9, String str) {
        if (this.dT != null) {
            this.dT.zp(i9, str);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.zp
    public void zp(Activity activity) {
        if (this.dQp == 0 || activity == null || activity.hashCode() != this.dQp) {
            return;
        }
        jU();
        dT();
    }

    public void zp(JSONObject jSONObject) {
        this.zp = jSONObject;
    }
}
