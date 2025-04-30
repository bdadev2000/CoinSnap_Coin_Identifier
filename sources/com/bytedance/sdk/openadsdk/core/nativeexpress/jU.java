package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.QUv;

/* loaded from: classes.dex */
public class jU extends com.bytedance.sdk.component.adexpress.dynamic.zp.zp {
    private final com.bytedance.sdk.component.ku.ku KS;
    private final Runnable jU;
    private com.bytedance.sdk.component.adexpress.lMd.QR lMd;
    private final com.bytedance.sdk.component.adexpress.lMd.tG zp;

    public jU(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z8, com.bytedance.sdk.component.adexpress.dynamic.jU.ku kuVar, com.bytedance.sdk.component.adexpress.lMd.tG tGVar, com.bytedance.sdk.component.adexpress.dynamic.COT.zp zpVar) {
        super(context, themeStatusBroadcastReceiver, z8, kuVar, tGVar, zpVar);
        this.KS = new com.bytedance.sdk.component.ku.ku("dynamic_render_template") { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.jU.1
            @Override // java.lang.Runnable
            public void run() {
                jU.this.zp.KS();
                com.bytedance.sdk.openadsdk.core.tG.KS().post(jU.this.jU);
            }
        };
        this.jU = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.jU.2
            @Override // java.lang.Runnable
            public void run() {
                if (jU.this.lMd != null) {
                    jU jUVar = jU.this;
                    jU.super.zp(jUVar.lMd);
                }
            }
        };
        this.zp = tGVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.zp.zp
    public void lMd() {
        super.lMd();
        com.bytedance.sdk.openadsdk.core.tG.KS().removeCallbacks(this.jU);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.zp.zp, com.bytedance.sdk.component.adexpress.lMd.jU
    public void zp(com.bytedance.sdk.component.adexpress.lMd.QR qr) {
        this.lMd = qr;
        QUv.lMd(this.KS);
    }
}
