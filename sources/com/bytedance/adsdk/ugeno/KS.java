package com.bytedance.adsdk.ugeno;

import android.content.Context;
import com.bytedance.adsdk.ugeno.core.COT;
import com.bytedance.adsdk.ugeno.core.jU;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class KS {
    private static volatile KS zp;
    private com.bytedance.adsdk.ugeno.core.KS KS;
    private zp jU;
    private List<com.bytedance.adsdk.ugeno.core.lMd> lMd;

    private KS() {
    }

    private void KS() {
        this.lMd = new ArrayList();
        this.lMd.addAll(new COT().zp());
        com.bytedance.adsdk.ugeno.core.KS ks = this.KS;
        if (ks != null) {
            this.lMd.addAll(ks.zp());
        }
        jU.zp(this.lMd);
    }

    public static KS zp() {
        if (zp == null) {
            synchronized (KS.class) {
                try {
                    if (zp == null) {
                        zp = new KS();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zp;
    }

    public zp lMd() {
        return this.jU;
    }

    public void zp(Context context, com.bytedance.adsdk.ugeno.core.KS ks, zp zpVar) {
        this.KS = ks;
        this.jU = zpVar;
        KS();
    }
}
