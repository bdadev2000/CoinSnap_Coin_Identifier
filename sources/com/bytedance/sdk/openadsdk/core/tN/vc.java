package com.bytedance.sdk.openadsdk.core.tN;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.Wwa;

/* loaded from: classes.dex */
public class vc extends AlY {
    public vc(Context context, Wwa wwa, AdSlot adSlot) {
        super(context, wwa, adSlot);
    }

    @Override // com.bytedance.sdk.openadsdk.core.tN.AlY
    public void YFl(Context context, Wwa wwa, AdSlot adSlot) {
        Sg sg2 = new Sg(context, wwa, adSlot);
        this.YFl = sg2;
        sg2.addOnAttachStateChangeListener(this.f10750vc);
    }

    public com.bytedance.sdk.openadsdk.multipro.Sg.YFl tN() {
        tN tNVar = this.YFl;
        if (tNVar != null) {
            return ((Sg) tNVar).getVideoModel();
        }
        return null;
    }
}
