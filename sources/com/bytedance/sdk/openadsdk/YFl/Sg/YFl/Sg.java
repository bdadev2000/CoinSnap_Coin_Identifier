package com.bytedance.sdk.openadsdk.YFl.Sg.YFl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.qsH.qO;

/* loaded from: classes.dex */
public class Sg extends tN {
    public Sg(@NonNull Context context, Wwa wwa, AdSlot adSlot) {
        super(context, wwa, adSlot);
    }

    public com.bytedance.sdk.openadsdk.multipro.Sg.YFl Sg() {
        qO qOVar = this.f10525nc;
        if (qOVar != null) {
            return ((com.bytedance.sdk.openadsdk.core.qsH.Wwa) qOVar).getVideoModel();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.YFl.Sg.YFl.tN
    public void YFl() {
        com.bytedance.sdk.openadsdk.core.qsH.Wwa wwa = new com.bytedance.sdk.openadsdk.core.qsH.Wwa(((tN) this).qsH, this.Sg, ((tN) this).NjR, this.eT);
        this.f10525nc = wwa;
        this.YFl.YFl(wwa.getVideoController());
        tN();
    }
}
