package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.widget.YFl.vc;

/* loaded from: classes.dex */
public class YoT {
    private com.bytedance.sdk.component.NjR.AlY AlY;
    private lG DSW;
    private RelativeLayout Sg;
    private final Wwa YFl;
    private EH qsH;
    private final Context tN;

    /* renamed from: vc, reason: collision with root package name */
    private final String f10561vc;
    private ImageView wN;

    public YoT(Context context, Wwa wwa, String str) {
        this.tN = context;
        this.YFl = wwa;
        this.f10561vc = str;
        vc();
    }

    private static RelativeLayout YFl(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setBackgroundColor(-1);
        relativeLayout.addView(new qsH(context));
        com.bytedance.sdk.component.NjR.AlY alY = new com.bytedance.sdk.component.NjR.AlY(context);
        alY.setId(com.bytedance.sdk.openadsdk.utils.GA.fIu);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(12);
        layoutParams.addRule(3, com.bytedance.sdk.openadsdk.utils.GA.zz);
        relativeLayout.addView(alY, layoutParams);
        DSW dsw = new DSW(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(dsw.getLayoutParams());
        layoutParams2.addRule(12);
        relativeLayout.addView(dsw, layoutParams2);
        return relativeLayout;
    }

    private void vc() {
        RelativeLayout YFl = YFl(this.tN);
        this.Sg = YFl;
        this.AlY = (com.bytedance.sdk.component.NjR.AlY) YFl.findViewById(com.bytedance.sdk.openadsdk.utils.GA.fIu);
        lG lGVar = new lG(this.tN, (RelativeLayout) this.Sg.findViewById(com.bytedance.sdk.openadsdk.utils.GA.zz), this.YFl);
        this.DSW = lGVar;
        this.wN = lGVar.tN();
        this.qsH = new EH(this.tN, (LinearLayout) this.Sg.findViewById(com.bytedance.sdk.openadsdk.utils.GA.ZLB), this.AlY, this.YFl, this.f10561vc);
    }

    public com.bytedance.sdk.component.NjR.AlY AlY() {
        return this.AlY;
    }

    public void Sg() {
        lG lGVar = this.DSW;
        if (lGVar != null) {
            lGVar.Sg();
        }
        EH eh2 = this.qsH;
        if (eh2 != null) {
            eh2.Sg();
        }
    }

    public ImageView tN() {
        return this.wN;
    }

    public View wN() {
        return this.Sg;
    }

    public void YFl() {
        lG lGVar = this.DSW;
        if (lGVar != null) {
            lGVar.YFl();
        }
        EH eh2 = this.qsH;
        if (eh2 != null) {
            eh2.YFl();
        }
    }

    public void YFl(WebView webView, int i10, vc.YFl yFl) {
        lG lGVar = this.DSW;
        if (lGVar != null) {
            lGVar.YFl(i10);
        }
        EH eh2 = this.qsH;
        if (eh2 != null) {
            eh2.YFl(webView, yFl);
        }
    }
}
