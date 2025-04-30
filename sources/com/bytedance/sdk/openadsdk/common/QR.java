package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.utils.vDp;

/* loaded from: classes.dex */
public class QR {
    private ImageView COT;
    private final String HWF;
    private final Context KS;
    private dT QR;
    private SSWebView jU;
    private ku ku;
    private RelativeLayout lMd;
    private final woN zp;

    public QR(Context context, woN won, String str) {
        this.KS = context;
        this.zp = won;
        this.HWF = str;
        HWF();
    }

    private void HWF() {
        RelativeLayout zp = zp(this.KS);
        this.lMd = zp;
        this.jU = (SSWebView) zp.findViewById(vDp.si);
        dT dTVar = new dT(this.KS, (RelativeLayout) this.lMd.findViewById(vDp.fVt), this.zp);
        this.QR = dTVar;
        this.COT = dTVar.KS();
        this.ku = new ku(this.KS, (LinearLayout) this.lMd.findViewById(vDp.bX), this.jU, this.zp, this.HWF);
    }

    private static RelativeLayout zp(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setBackgroundColor(-1);
        relativeLayout.addView(new LandingPageBrowserNewTitleBar(context));
        SSWebView sSWebView = new SSWebView(context);
        sSWebView.setId(vDp.si);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(12);
        layoutParams.addRule(3, vDp.fVt);
        relativeLayout.addView(sSWebView, layoutParams);
        LandingPageBrowserNewBottomBar landingPageBrowserNewBottomBar = new LandingPageBrowserNewBottomBar(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(landingPageBrowserNewBottomBar.getLayoutParams());
        layoutParams2.addRule(12);
        relativeLayout.addView(landingPageBrowserNewBottomBar, layoutParams2);
        return relativeLayout;
    }

    public View COT() {
        return this.lMd;
    }

    public ImageView KS() {
        return this.COT;
    }

    public SSWebView jU() {
        return this.jU;
    }

    public void lMd() {
        dT dTVar = this.QR;
        if (dTVar != null) {
            dTVar.lMd();
        }
        ku kuVar = this.ku;
        if (kuVar != null) {
            kuVar.lMd();
        }
    }

    public void zp() {
        dT dTVar = this.QR;
        if (dTVar != null) {
            dTVar.zp();
        }
        ku kuVar = this.ku;
        if (kuVar != null) {
            kuVar.zp();
        }
    }

    public void zp(WebView webView, int i9) {
        dT dTVar = this.QR;
        if (dTVar != null) {
            dTVar.zp(i9);
        }
        ku kuVar = this.ku;
        if (kuVar != null) {
            kuVar.zp(webView);
        }
    }
}
