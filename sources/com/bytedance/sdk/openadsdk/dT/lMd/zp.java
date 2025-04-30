package com.bytedance.sdk.openadsdk.dT.lMd;

import com.bytedance.sdk.component.ku.KS;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.dT.lMd;

/* loaded from: classes.dex */
public class zp implements KS {
    @Override // com.bytedance.sdk.component.ku.KS
    public void zp(final com.bytedance.sdk.component.ku.lMd.zp zpVar) {
        com.bytedance.sdk.openadsdk.dT.KS.zp();
        com.bytedance.sdk.openadsdk.dT.KS.zp("stats_sdk_thread_num", false, new lMd() { // from class: com.bytedance.sdk.openadsdk.dT.lMd.zp.1
            @Override // com.bytedance.sdk.openadsdk.dT.lMd
            public com.bytedance.sdk.openadsdk.dT.zp.lMd getLogStats() throws Exception {
                com.bytedance.sdk.component.ku.lMd.zp zpVar2;
                if (!KVG.jU().oB() || (zpVar2 = zpVar) == null || zpVar2.zp() == null) {
                    return null;
                }
                return com.bytedance.sdk.openadsdk.dT.zp.KS.lMd().zp("stats_sdk_thread_num").lMd(zpVar.zp().toString());
            }
        });
    }
}
