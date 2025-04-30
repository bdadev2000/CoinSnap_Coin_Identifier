package com.bytedance.sdk.openadsdk.component.reward.view;

import android.graphics.Color;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.vDp;

/* loaded from: classes.dex */
public class jU extends COT {
    public jU(com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar) {
        super(zpVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.view.COT
    public boolean zp() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.view.COT
    public void zp(int i9, int i10) {
        super.zp(i9, i10);
        if (woN.COT(this.KS) && this.KS.Lij() == 3 && this.KS.Gzh() == 0) {
            try {
                FrameLayout frameLayout = (FrameLayout) this.lMd.findViewById(vDp.dT);
                frameLayout.setBackgroundColor(Color.parseColor("#000000"));
                if (this.KS.bX() == 1) {
                    int lMd = WNy.lMd(KVG.zp(), 90.0f);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                    layoutParams.bottomMargin = lMd;
                    frameLayout.setLayoutParams(layoutParams);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
