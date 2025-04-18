package com.bytedance.sdk.component.adexpress.dynamic.tN;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.vc.wXo;

/* loaded from: classes.dex */
public class rkt implements DSW {
    private com.bytedance.sdk.component.adexpress.dynamic.AlY.DSW AlY;
    private Context Sg;
    private wXo YFl;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN tN;

    public rkt(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN wNVar, com.bytedance.sdk.component.adexpress.dynamic.AlY.DSW dsw) {
        this.Sg = context;
        this.tN = wNVar;
        this.AlY = dsw;
        AlY();
    }

    private void AlY() {
        this.YFl = new wXo(this.Sg);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.Sg, 120.0f));
        layoutParams.gravity = 17;
        this.YFl.setLayoutParams(layoutParams);
        this.YFl.setClipChildren(false);
        this.YFl.setGuideText(this.AlY.Cqy());
        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN wNVar = this.tN;
        if (wNVar != null) {
            this.YFl.setOnClickListener((View.OnClickListener) wNVar.getDynamicClickListener());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.tN.DSW
    public void Sg() {
        wXo wxo = this.YFl;
        if (wxo != null) {
            wxo.Sg();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.tN.DSW
    public void YFl() {
        wXo wxo = this.YFl;
        if (wxo != null) {
            wxo.YFl();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.tN.DSW
    public ViewGroup tN() {
        return this.YFl;
    }
}
