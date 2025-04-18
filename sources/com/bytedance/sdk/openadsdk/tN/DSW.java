package com.bytedance.sdk.openadsdk.tN;

import android.content.Context;
import android.graphics.Color;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.GS;

/* loaded from: classes.dex */
public class DSW extends LinearLayout {
    private qsH Sg;
    private final FilterWord YFl;
    private final nc tN;

    public DSW(Context context, FilterWord filterWord, nc ncVar) {
        super(context);
        setOrientation(1);
        this.YFl = filterWord;
        this.tN = ncVar;
        YFl();
    }

    private void Sg() {
        this.Sg = new qsH(getContext(), this.tN);
        new LinearLayout.LayoutParams(-1, -2);
        this.Sg.YFl(this.YFl.getOptions());
        addView(this.Sg);
    }

    private void YFl() {
        tN();
        Sg();
    }

    private void tN() {
        int i10;
        String name = this.YFl.getName();
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh = new com.bytedance.sdk.openadsdk.core.wN.qsH(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = GS.tN(getContext(), 12.0f);
        layoutParams.gravity = 17;
        qsh.setGravity(17);
        qsh.setText(name);
        qsh.setTextColor(Color.argb(85, 22, 24, 35));
        if (this.tN.NjR()) {
            i10 = 14;
        } else {
            i10 = 10;
        }
        qsh.setTextSize(i10);
        addView(qsh, layoutParams);
    }
}
