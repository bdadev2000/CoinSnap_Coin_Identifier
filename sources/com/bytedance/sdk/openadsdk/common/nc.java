package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.utils.GS;

/* loaded from: classes.dex */
public class nc {
    private com.bytedance.sdk.openadsdk.core.widget.lG AlY;
    protected Context Sg;
    protected View YFl = wN();
    private com.bytedance.sdk.openadsdk.core.widget.NjR tN;
    private com.bytedance.sdk.openadsdk.core.wN.qsH wN;

    public nc(Context context) {
        this.Sg = context;
    }

    private View wN() {
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar = new com.bytedance.sdk.openadsdk.core.wN.wN(this.Sg);
        wNVar.setGravity(1);
        wNVar.setOrientation(1);
        com.bytedance.sdk.openadsdk.core.widget.lG lGVar = new com.bytedance.sdk.openadsdk.core.widget.lG(this.Sg);
        this.AlY = lGVar;
        lGVar.setId(520093745);
        int tN = GS.tN(this.Sg, 64.0f);
        wNVar.addView(this.AlY, new LinearLayout.LayoutParams(tN, tN));
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh = new com.bytedance.sdk.openadsdk.core.wN.qsH(this.Sg);
        this.wN = qsh;
        qsh.setId(520093746);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(GS.tN(this.Sg, 219.0f), -2);
        layoutParams.topMargin = GS.tN(this.Sg, 16.0f);
        this.wN.setLayoutParams(layoutParams);
        this.wN.setEllipsize(TextUtils.TruncateAt.END);
        this.wN.setGravity(17);
        this.wN.setMaxWidth(GS.tN(this.Sg, 150.0f));
        this.wN.setMaxLines(2);
        this.wN.setTextColor(-1);
        this.wN.setTextSize(1, 16.0f);
        wNVar.addView(this.wN);
        this.tN = new com.bytedance.sdk.openadsdk.core.widget.NjR(this.Sg);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(GS.tN(this.Sg, 219.0f), GS.tN(this.Sg, 6.0f));
        layoutParams2.topMargin = GS.tN(this.Sg, 32.0f);
        wNVar.addView(this.tN, layoutParams2);
        return wNVar;
    }

    public void AlY() {
        this.YFl = null;
        this.Sg = null;
    }

    public com.bytedance.sdk.openadsdk.core.widget.lG Sg() {
        return this.AlY;
    }

    public View YFl() {
        return this.YFl;
    }

    public com.bytedance.sdk.openadsdk.core.wN.qsH tN() {
        return this.wN;
    }

    public void YFl(int i10) {
        this.tN.setProgress(i10);
    }
}
