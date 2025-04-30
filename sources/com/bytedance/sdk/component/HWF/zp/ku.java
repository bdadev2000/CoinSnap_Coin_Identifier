package com.bytedance.sdk.component.HWF.zp;

import android.content.Context;
import com.vungle.ads.internal.signals.j;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class ku {
    private static volatile com.bytedance.sdk.component.HWF.zp.COT.zp dT;
    private static ku tG;
    private volatile com.bytedance.sdk.component.HWF.zp.lMd.KS Bj;
    private volatile com.bytedance.sdk.component.HWF.zp.jU.lMd.zp COT;
    private volatile com.bytedance.sdk.component.HWF.zp.jU.lMd.zp HWF;
    private volatile com.bytedance.sdk.component.HWF.zp.jU.lMd.zp KS;
    private volatile com.bytedance.sdk.component.HWF.zp.zp.COT QR;
    private volatile COT YW;
    private long dQp;
    private volatile com.bytedance.sdk.component.HWF.zp.jU.lMd.zp jU;
    private volatile boolean ku;
    private volatile com.bytedance.sdk.component.HWF.zp.jU.lMd.zp lMd;
    private final AtomicBoolean rV = new AtomicBoolean(false);
    private volatile Map<Integer, com.bytedance.sdk.component.HWF.zp.lMd.KS> vDp;
    private volatile Context zp;

    private ku() {
    }

    public static com.bytedance.sdk.component.HWF.zp.COT.zp COT() {
        if (dT == null) {
            synchronized (ku.class) {
                try {
                    if (dT == null) {
                        dT = new com.bytedance.sdk.component.HWF.zp.COT.lMd();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return dT;
    }

    public static synchronized ku QR() {
        ku kuVar;
        synchronized (ku.class) {
            try {
                if (tG == null) {
                    tG = new ku();
                }
                kuVar = tG;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kuVar;
    }

    public void Bj() {
        com.bytedance.sdk.component.HWF.zp.lMd.jU.zp.KS();
    }

    public Context HWF() {
        return this.zp;
    }

    public Map<Integer, com.bytedance.sdk.component.HWF.zp.lMd.KS> KS() {
        return this.vDp;
    }

    public COT KVG() {
        return this.YW;
    }

    public void YW() {
        com.bytedance.sdk.component.HWF.zp.lMd.jU.zp.lMd();
    }

    public com.bytedance.sdk.component.HWF.zp.jU.lMd.zp dQp() {
        return this.COT;
    }

    public com.bytedance.sdk.component.HWF.zp.jU.lMd.zp dT() {
        return this.HWF;
    }

    public com.bytedance.sdk.component.HWF.zp.zp.COT jU() {
        return this.QR;
    }

    public com.bytedance.sdk.component.HWF.zp.lMd.KS ku() {
        return this.Bj;
    }

    public boolean lMd() {
        return this.ku;
    }

    public com.bytedance.sdk.component.HWF.zp.jU.lMd.zp rV() {
        return this.jU;
    }

    public com.bytedance.sdk.component.HWF.zp.jU.lMd.zp tG() {
        return this.KS;
    }

    public com.bytedance.sdk.component.HWF.zp.jU.lMd.zp vDp() {
        return this.lMd;
    }

    public long woN() {
        return this.dQp * j.TWENTY_FOUR_HOURS_MILLIS;
    }

    public boolean zp() {
        return this.rV.get();
    }

    public void KS(com.bytedance.sdk.component.HWF.zp.jU.lMd.zp zpVar) {
        this.KS = zpVar;
    }

    public void jU(com.bytedance.sdk.component.HWF.zp.jU.lMd.zp zpVar) {
        this.jU = zpVar;
    }

    public void lMd(boolean z8) {
        this.ku = z8;
    }

    public void zp(boolean z8) {
        this.rV.set(z8);
    }

    public void lMd(com.bytedance.sdk.component.HWF.zp.jU.lMd.zp zpVar) {
        this.lMd = zpVar;
    }

    public void zp(com.bytedance.sdk.component.HWF.zp.zp.COT cot) {
        this.QR = cot;
    }

    public void zp(Context context) {
        this.zp = context;
    }

    public void zp(com.bytedance.sdk.component.HWF.zp.lMd.KS ks) {
        this.Bj = ks;
    }

    public void zp(com.bytedance.sdk.component.HWF.zp.jU.lMd.zp zpVar) {
        this.HWF = zpVar;
    }

    public void COT(com.bytedance.sdk.component.HWF.zp.jU.lMd.zp zpVar) {
        this.COT = zpVar;
    }

    public void zp(com.bytedance.sdk.component.HWF.zp.jU.zp zpVar) {
        if (zpVar == null) {
            return;
        }
        zpVar.zp(System.currentTimeMillis());
        com.bytedance.sdk.component.HWF.zp.lMd.jU.zp.zp(zpVar, zpVar.jU());
    }

    public void zp(String str, boolean z8) {
        com.bytedance.sdk.component.HWF.zp.HWF.zp.zp().zp(str, z8);
    }

    public void zp(String str, List<String> list, boolean z8, Map<String, String> map, int i9, String str2) {
        com.bytedance.sdk.component.HWF.zp.HWF.zp.zp().zp(str, list, z8, map, i9, str2);
    }

    public void zp(COT cot) {
        this.YW = cot;
    }

    public void zp(long j7) {
        this.dQp = j7;
    }
}
