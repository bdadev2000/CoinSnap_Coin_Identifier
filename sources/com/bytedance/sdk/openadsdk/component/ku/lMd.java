package com.bytedance.sdk.openadsdk.component.ku;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.lMd.QR;
import com.bytedance.sdk.openadsdk.lMd.jU.lMd.dQp;

/* loaded from: classes.dex */
public class lMd extends com.bytedance.sdk.openadsdk.core.video.KS.zp {
    public lMd(Context context, ViewGroup viewGroup, woN won) {
        super(context, viewGroup, won, null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.KS.zp
    public void vwr() {
        dQp.zp zpVar = new dQp.zp();
        zpVar.zp(COT());
        zpVar.KS(ku());
        zpVar.lMd(HWF());
        zpVar.jU(QR());
        com.bytedance.sdk.openadsdk.lMd.jU.zp.zp.COT(this.HWF, zpVar);
    }

    public void zp(dQp.zp zpVar) {
        com.bytedance.sdk.openadsdk.lMd.jU.zp.zp.zp(this.HWF, zpVar, (QR) null);
    }
}
