package com.bytedance.sdk.openadsdk.component.qsH;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.AlY.DSW;
import com.bytedance.sdk.openadsdk.AlY.wN.Sg.EH;
import com.bytedance.sdk.openadsdk.core.model.Wwa;

/* loaded from: classes.dex */
public class Sg extends com.bytedance.sdk.openadsdk.core.GA.AlY.YFl {
    public Sg(Context context, ViewGroup viewGroup, Wwa wwa) {
        super(context, viewGroup, wwa, null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.YFl
    public void Wwa() {
        EH.YFl yFl = new EH.YFl();
        yFl.YFl(wN());
        yFl.tN(qsH());
        yFl.Sg(vc());
        yFl.AlY(DSW());
        com.bytedance.sdk.openadsdk.AlY.wN.YFl.YFl.wN(this.DSW, yFl);
    }

    public void YFl(EH.YFl yFl) {
        com.bytedance.sdk.openadsdk.AlY.wN.YFl.YFl.YFl(this.DSW, yFl, (DSW) null);
    }
}
