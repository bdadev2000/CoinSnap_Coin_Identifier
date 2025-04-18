package com.bytedance.sdk.openadsdk.core.qsH;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.mn;

/* loaded from: classes.dex */
public class vc extends com.bytedance.sdk.component.adexpress.dynamic.YFl.YFl {
    private final Runnable AlY;
    private com.bytedance.sdk.component.adexpress.Sg.DSW Sg;
    private final com.bytedance.sdk.component.adexpress.Sg.GA YFl;
    private final com.bytedance.sdk.component.qsH.qsH tN;

    public vc(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z10, com.bytedance.sdk.component.adexpress.dynamic.wN.qsH qsh, com.bytedance.sdk.component.adexpress.Sg.GA ga2, com.bytedance.sdk.component.adexpress.dynamic.vc.YFl yFl) {
        super(context, themeStatusBroadcastReceiver, z10, qsh, ga2, yFl);
        this.tN = new com.bytedance.sdk.component.qsH.qsH("dynamic_render_template") { // from class: com.bytedance.sdk.openadsdk.core.qsH.vc.1
            @Override // java.lang.Runnable
            public void run() {
                vc.this.YFl.tN();
                com.bytedance.sdk.openadsdk.core.pDU.tN().post(vc.this.AlY);
            }
        };
        this.AlY = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.qsH.vc.2
            @Override // java.lang.Runnable
            public void run() {
                if (vc.this.Sg != null) {
                    vc vcVar = vc.this;
                    vc.super.YFl(vcVar.Sg);
                }
            }
        };
        this.YFl = ga2;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.YFl.YFl
    public void Sg() {
        super.Sg();
        com.bytedance.sdk.openadsdk.core.pDU.tN().removeCallbacks(this.AlY);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.YFl.YFl, com.bytedance.sdk.component.adexpress.Sg.AlY
    public void YFl(com.bytedance.sdk.component.adexpress.Sg.DSW dsw) {
        this.Sg = dsw;
        mn.Sg(this.tN);
    }
}
