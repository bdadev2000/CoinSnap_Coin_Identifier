package com.bytedance.sdk.component.adexpress.wN;

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
import com.bytedance.sdk.component.adexpress.Sg.DSW;
import com.bytedance.sdk.component.adexpress.Sg.GA;
import com.bytedance.sdk.component.adexpress.Sg.eT;
import com.bytedance.sdk.component.adexpress.Sg.pDU;
import com.bytedance.sdk.component.adexpress.Sg.qsH;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class YFl implements com.bytedance.sdk.component.adexpress.Sg.AlY<com.bytedance.sdk.component.NjR.AlY>, eT, com.bytedance.sdk.component.adexpress.YFl, com.bytedance.sdk.component.adexpress.theme.YFl {
    private String DSW;
    private boolean GA;
    private volatile DSW NjR;
    protected boolean Sg;
    protected JSONObject YFl;
    private GA YoT;
    private qsH eT;

    /* renamed from: nc, reason: collision with root package name */
    private boolean f10430nc;
    private int pDU;
    private String qsH;
    protected com.bytedance.sdk.component.NjR.AlY tN;

    /* renamed from: vc, reason: collision with root package name */
    private Context f10431vc;
    protected int AlY = 8;
    protected AtomicBoolean wN = new AtomicBoolean(false);
    private boolean EH = false;

    public YFl(Context context, GA ga2, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver) {
        this.f10430nc = false;
        this.f10431vc = context;
        this.YoT = ga2;
        this.DSW = ga2.AlY();
        themeStatusBroadcastReceiver.YFl(this);
        if (com.bytedance.sdk.component.adexpress.AlY.Sg()) {
            YoT();
            return;
        }
        com.bytedance.sdk.component.NjR.AlY GA = GA();
        this.tN = GA;
        if (GA == null) {
            Log.d("WebViewRender", "initWebView: create WebView");
            if (com.bytedance.sdk.component.adexpress.AlY.YFl() != null) {
                this.tN = new com.bytedance.sdk.component.NjR.AlY(com.bytedance.sdk.component.adexpress.AlY.YFl());
                return;
            }
            return;
        }
        this.f10430nc = true;
        Log.d("WebViewRender", "initWebView: reuse WebView");
    }

    private com.bytedance.sdk.component.NjR.AlY GA() {
        if (this.YoT.VOe()) {
            return wN.YFl().YFl(this.f10431vc, this.DSW);
        }
        return wN.YFl().Sg(this.f10431vc, this.DSW);
    }

    private void YoT() {
        if (this.f10431vc == null && com.bytedance.sdk.component.adexpress.AlY.YFl() != null) {
            this.f10431vc = com.bytedance.sdk.component.adexpress.AlY.YFl();
        }
        if (this.f10431vc != null) {
            com.bytedance.sdk.component.NjR.AlY GA = GA();
            this.tN = GA;
            if (GA == null) {
                Log.d("WebViewRender", "initWebView: create WebView by act");
                this.tN = new com.bytedance.sdk.component.NjR.AlY(new MutableContextWrapper(this.f10431vc.getApplicationContext()));
            } else {
                this.f10430nc = true;
                Log.d("WebViewRender", "initWebView: reuse WebView");
            }
        }
    }

    private void pDU() {
        if (this.YoT.VOe()) {
            wN.YFl().Sg(this.tN);
        } else {
            wN.YFl().tN(this.tN);
        }
    }

    public void AlY() {
        if (this.wN.get()) {
            return;
        }
        this.wN.set(true);
        DSW();
        if (this.tN.getParent() != null) {
            ((ViewGroup) this.tN.getParent()).removeView(this.tN);
        }
        if (this.Sg) {
            pDU();
        } else {
            wN.YFl().wN(this.tN);
        }
    }

    public abstract void DSW();

    public void NjR() {
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.AlY
    /* renamed from: Sg, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.NjR.AlY wN() {
        return YFl();
    }

    public abstract void YFl(int i10);

    public GA eT() {
        return this.YoT;
    }

    public void nc() {
    }

    public void qsH() {
        NjR();
        Activity YFl = com.bytedance.sdk.component.utils.Sg.YFl(this.tN);
        if (YFl != null) {
            this.pDU = Sg(YFl);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.AlY
    public int tN() {
        return 0;
    }

    public void vc() {
        if (YFl() == null) {
            return;
        }
        try {
            YFl().getWebView().resumeTimers();
        } catch (Exception unused) {
        }
    }

    private int Sg(Activity activity) {
        return activity.hashCode();
    }

    public void YFl(String str) {
        this.qsH = str;
    }

    public void Sg(boolean z10) {
        this.EH = z10;
    }

    public com.bytedance.sdk.component.NjR.AlY YFl() {
        return this.tN;
    }

    public void YFl(qsH qsh) {
        this.eT = qsh;
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.AlY
    public void YFl(DSW dsw) {
        this.NjR = dsw;
        if (YFl() != null && YFl().getWebView() != null) {
            if (TextUtils.isEmpty(this.qsH)) {
                this.NjR.YFl(102, "url is empty");
                return;
            }
            if (!this.YoT.VOe()) {
                if (!this.EH && !com.bytedance.sdk.component.adexpress.YFl.Sg.Sg.YFl(this.YFl)) {
                    DSW dsw2 = this.NjR;
                    StringBuilder sb2 = new StringBuilder("data null is ");
                    sb2.append(this.YFl == null);
                    dsw2.YFl(103, sb2.toString());
                    return;
                }
                if (this.EH && !com.bytedance.sdk.component.adexpress.YFl.Sg.Sg.tN(this.YFl)) {
                    DSW dsw3 = this.NjR;
                    StringBuilder sb3 = new StringBuilder("choice ad data null is ");
                    sb3.append(this.YFl == null);
                    dsw3.YFl(103, sb3.toString());
                    return;
                }
            } else if (tN() == 9 && !com.bytedance.sdk.component.adexpress.YFl.Sg.Sg.Sg(this.YFl)) {
                DSW dsw4 = this.NjR;
                StringBuilder sb4 = new StringBuilder("data null is ");
                sb4.append(this.YFl == null);
                dsw4.YFl(103, sb4.toString());
                return;
            }
            this.YoT.wN().YFl(this.f10430nc);
            if (this.f10430nc) {
                try {
                    this.tN.GA();
                    this.YoT.wN();
                    com.bytedance.sdk.component.utils.eT.YFl(this.tN.getWebView(), "javascript:window.SDK_RESET_RENDER();window.SDK_TRIGGER_RENDER();");
                    return;
                } catch (Exception e2) {
                    wN.YFl().wN(this.tN);
                    this.NjR.YFl(102, "load exception is " + e2.getMessage());
                    return;
                }
            }
            com.bytedance.sdk.component.NjR.AlY YFl = YFl();
            YFl.GA();
            this.YoT.wN();
            YFl.a_(this.qsH);
            return;
        }
        DSW dsw5 = this.NjR;
        StringBuilder sb5 = new StringBuilder("SSWebview null is ");
        sb5.append(YFl() == null);
        sb5.append(" or Webview is null");
        dsw5.YFl(102, sb5.toString());
    }

    public void YFl(boolean z10) {
        this.GA = z10;
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.eT
    public void YFl(final pDU pdu) {
        if (pdu == null) {
            if (this.NjR != null) {
                this.NjR.YFl(105, "renderResult is null");
                return;
            }
            return;
        }
        boolean tN = pdu.tN();
        final float AlY = (float) pdu.AlY();
        final float wN = (float) pdu.wN();
        if (tN() == 0 && (AlY <= 0.0f || wN <= 0.0f)) {
            if (this.NjR != null) {
                this.NjR.YFl(105, "width is " + AlY + "height is " + wN);
                return;
            }
            return;
        }
        this.Sg = tN;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            YFl(pdu, AlY, wN);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.wN.YFl.1
                @Override // java.lang.Runnable
                public void run() {
                    YFl.this.YFl(pdu, AlY, wN);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(pDU pdu, float f10, float f11) {
        pdu.eT();
        boolean z10 = this.Sg;
        if (z10 && !this.GA) {
            YFl(f10, f11);
            YFl(this.AlY);
            if (this.NjR != null) {
                this.NjR.YFl(YFl(), pdu);
                return;
            }
            return;
        }
        if (!z10) {
            wN.YFl().wN(this.tN);
        }
        YFl(pdu.eT(), pdu.nc());
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.eT
    public void YFl(View view, int i10, com.bytedance.sdk.component.adexpress.tN tNVar) {
        qsH qsh = this.eT;
        if (qsh != null) {
            qsh.YFl(view, i10, tNVar);
        }
    }

    @UiThread
    private void YFl(float f10, float f11) {
        this.YoT.wN().wN();
        if (tN() == 9) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) YFl().getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
            }
            layoutParams.width = -1;
            layoutParams.height = -1;
            YFl().setLayoutParams(layoutParams);
            return;
        }
        int YFl = (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.f10431vc, f10);
        int YFl2 = (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.f10431vc, f11);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) YFl().getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(YFl, YFl2);
        }
        layoutParams2.width = YFl;
        layoutParams2.height = YFl2;
        YFl().setLayoutParams(layoutParams2);
    }

    private void YFl(int i10, String str) {
        if (this.NjR != null) {
            this.NjR.YFl(i10, str);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.YFl
    public void YFl(Activity activity) {
        if (this.pDU == 0 || activity == null || activity.hashCode() != this.pDU) {
            return;
        }
        AlY();
        nc();
    }

    public void YFl(JSONObject jSONObject) {
        this.YFl = jSONObject;
    }
}
