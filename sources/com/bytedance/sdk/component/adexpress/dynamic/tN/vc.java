package com.bytedance.sdk.component.adexpress.dynamic.tN;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.vc.Ne;
import com.bytedance.sdk.component.adexpress.vc.aIu;
import com.bytedance.sdk.component.adexpress.vc.qO;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class vc extends lG<com.bytedance.sdk.component.adexpress.vc.vc> {
    public vc(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN wNVar, com.bytedance.sdk.component.adexpress.dynamic.AlY.DSW dsw, int i10, int i11, int i12, JSONObject jSONObject) {
        super(context, wNVar, dsw);
        this.Sg = context;
        this.AlY = dsw;
        this.tN = wNVar;
        YFl(i10, i11, i12, jSONObject, dsw);
    }

    private void YFl(int i10, int i11, int i12, JSONObject jSONObject, com.bytedance.sdk.component.adexpress.dynamic.AlY.DSW dsw) {
        int i13;
        this.YFl = new com.bytedance.sdk.component.adexpress.vc.vc(this.Sg, i10, i11, i12, jSONObject);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.Sg, 300.0f));
        layoutParams.gravity = 81;
        Context context = this.Sg;
        if (dsw.iY() > 0) {
            i13 = dsw.iY();
        } else if (com.bytedance.sdk.component.adexpress.AlY.Sg()) {
            i13 = 0;
        } else {
            i13 = 120;
        }
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(context, i13);
        this.YFl.setLayoutParams(layoutParams);
        this.YFl.setClipChildren(false);
        this.YFl.setSlideText(this.AlY.Cqy());
        Ne ne2 = this.YFl;
        if (ne2 instanceof com.bytedance.sdk.component.adexpress.vc.vc) {
            ((com.bytedance.sdk.component.adexpress.vc.vc) ne2).setShakeText(this.AlY.Jc());
            final aIu shakeView = ((com.bytedance.sdk.component.adexpress.vc.vc) this.YFl).getShakeView();
            if (shakeView != null) {
                shakeView.setOnShakeViewListener(new qO.YFl() { // from class: com.bytedance.sdk.component.adexpress.dynamic.tN.vc.1
                });
                shakeView.setOnClickListener((View.OnClickListener) this.tN.getDynamicClickListener());
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.tN.lG
    public void AlY() {
    }
}
