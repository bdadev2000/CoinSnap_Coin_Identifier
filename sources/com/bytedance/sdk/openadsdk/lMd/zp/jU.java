package com.bytedance.sdk.openadsdk.lMd.zp;

import android.content.Context;
import com.bytedance.sdk.component.HWF.zp.zp;
import com.bytedance.sdk.openadsdk.core.KVG;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class jU {
    public static AtomicInteger zp = new AtomicInteger(0);
    public static final AtomicBoolean lMd = new AtomicBoolean(false);

    public static void KS() {
        try {
            com.bytedance.sdk.component.HWF.zp.lMd.jU();
            com.bytedance.sdk.component.HWF.zp.lMd.COT();
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.tG.zp("AdLogSwitchUtils", th.getMessage());
        }
    }

    public static void lMd() {
        com.bytedance.sdk.component.HWF.zp.lMd.KS();
    }

    public static void zp(Context context, boolean z8) {
        if (lMd.compareAndSet(false, true)) {
            com.bytedance.sdk.component.HWF.zp.lMd.zp(new zp.C0074zp().zp(new dT()).lMd(com.bytedance.sdk.component.HWF.zp.jU.lMd.zp.KS()).KS(com.bytedance.sdk.component.HWF.zp.jU.lMd.zp.COT()).zp(com.bytedance.sdk.component.HWF.zp.jU.lMd.zp.jU()).zp(z8).zp(new Bj()).zp(ku.zp).lMd(KVG.jU().dQp()).zp(KVG.jU().KVG()).zp(KVG.jU().vLi()).zp(), context);
            lMd();
        }
    }

    public static void zp(com.bytedance.sdk.openadsdk.lMd.zp zpVar) {
        com.bytedance.sdk.component.HWF.zp.jU.zp.zp zpVar2 = new com.bytedance.sdk.component.HWF.zp.jU.zp.zp(zpVar.jU(), zpVar);
        zpVar2.lMd(zpVar.COT() ? (byte) 1 : (byte) 2);
        zpVar2.zp((byte) 0);
        if (com.bytedance.sdk.component.HWF.zp.lMd.lMd()) {
            zp(KVG.zp(), com.bytedance.sdk.openadsdk.multipro.lMd.KS());
        }
        com.bytedance.sdk.component.HWF.zp.lMd.zp(zpVar2);
    }

    public static com.bytedance.sdk.openadsdk.dT.KS.zp zp() {
        return vDp.zp;
    }

    public static void zp(final List<String> list, final int i9, final String str) {
        if (list == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.lMd.KS.zp(new com.bytedance.sdk.component.ku.ku("track") { // from class: com.bytedance.sdk.openadsdk.lMd.zp.jU.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.HWF.zp.lMd.lMd()) {
                    jU.zp(KVG.zp(), com.bytedance.sdk.openadsdk.multipro.lMd.KS());
                }
                com.bytedance.sdk.component.HWF.zp.lMd.zp(com.bytedance.sdk.openadsdk.core.Bj.zp(KVG.zp()), list, true, i9, str);
            }
        });
    }

    public static void zp(String str) {
        zp(str, false);
    }

    public static void zp(String str, boolean z8) {
        if (com.bytedance.sdk.component.HWF.zp.lMd.lMd()) {
            zp(KVG.zp(), com.bytedance.sdk.openadsdk.multipro.lMd.KS());
        }
        com.bytedance.sdk.component.HWF.zp.lMd.zp(str, z8);
    }
}
