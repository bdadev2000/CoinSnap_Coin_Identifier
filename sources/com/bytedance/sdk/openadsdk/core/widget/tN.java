package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.GS;

/* loaded from: classes.dex */
public class tN extends com.bytedance.sdk.openadsdk.core.wN.AlY {
    public tN(Context context) {
        super(context);
        YFl();
    }

    private void YFl() {
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.GA.Pj);
    }

    public void YFl(int i10, com.bytedance.sdk.openadsdk.core.model.Wwa wwa) {
        if (wwa.yn() || (wwa.ZS() && wwa.qsH())) {
            GS.YFl((View) this, 0);
            com.bytedance.sdk.openadsdk.lG.tN.YFl().YFl((int) GS.YFl(getContext(), i10, true), this, wwa);
        }
    }
}
