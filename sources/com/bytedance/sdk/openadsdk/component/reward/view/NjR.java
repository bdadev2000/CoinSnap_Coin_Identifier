package com.bytedance.sdk.openadsdk.component.reward.view;

import android.graphics.Color;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.utils.GA;
import com.bytedance.sdk.openadsdk.utils.GS;

/* loaded from: classes.dex */
public class NjR extends nc {
    public NjR(com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl) {
        super(yFl);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.view.nc
    public boolean YFl() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.view.nc
    public void YFl(int i10, int i11) {
        super.YFl(i10, i11);
        if (Wwa.wN(this.AlY) && this.AlY.dXO() == 3 && this.AlY.Cfr() == 0) {
            try {
                FrameLayout frameLayout = (FrameLayout) this.tN.mB.findViewById(GA.f10821nc);
                frameLayout.setBackgroundColor(Color.parseColor("#000000"));
                if (this.AlY.SVa() == 1) {
                    int tN = GS.tN(lG.YFl(), 90.0f);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                    layoutParams.bottomMargin = tN;
                    frameLayout.setLayoutParams(layoutParams);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
