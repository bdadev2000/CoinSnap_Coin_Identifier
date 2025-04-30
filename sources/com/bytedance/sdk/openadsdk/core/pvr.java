package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class pvr {
    public static ConcurrentHashMap<Integer, pvr> zp = new ConcurrentHashMap<>();
    private int COT;
    private String HWF;
    private int jU;
    private String lMd = "";
    private String KS = "";

    private void HWF() {
        this.lMd = "";
        this.KS = "";
        this.jU = 0;
        this.COT = 0;
    }

    public int COT() {
        return this.COT;
    }

    public String KS() {
        return this.KS;
    }

    public int jU() {
        return this.jU;
    }

    public String lMd() {
        return this.lMd;
    }

    public String zp() {
        return this.HWF;
    }

    public static void KS(int i9) {
        pvr pvrVar;
        if (i9 == 0) {
            return;
        }
        if (zp == null) {
            zp = new ConcurrentHashMap<>();
        }
        if (!zp.containsKey(Integer.valueOf(i9)) || (pvrVar = zp.get(Integer.valueOf(i9))) == null) {
            return;
        }
        pvrVar.lMd(1);
    }

    public void lMd(int i9) {
        this.COT = i9;
    }

    public void zp(int i9) {
        this.jU = i9;
    }

    public static void lMd(com.bytedance.sdk.openadsdk.core.model.woN won) {
        if (won == null || TextUtils.isEmpty(won.GP())) {
            return;
        }
        int FGx = won.FGx();
        Integer valueOf = Integer.valueOf(FGx);
        if (FGx == 0) {
            return;
        }
        if (zp == null) {
            zp = new ConcurrentHashMap<>();
        }
        pvr pvrVar = zp.containsKey(valueOf) ? zp.get(valueOf) : null;
        if (pvrVar == null) {
            pvrVar = new pvr();
        }
        String Gor = won.Gor();
        if (TextUtils.isEmpty(Gor) || !Gor.equals(pvrVar.zp())) {
            pvrVar.HWF();
            pvrVar.zp(won);
            zp.put(valueOf, pvrVar);
        }
    }

    public void zp(com.bytedance.sdk.openadsdk.core.model.woN won) {
        if (won != null) {
            String Gor = won.Gor();
            if (!TextUtils.isEmpty(Gor)) {
                this.HWF = Gor;
            }
            String aax = won.aax();
            if (TextUtils.isEmpty(aax) && won.Fm()) {
                aax = won.xg().YW();
            }
            if (!TextUtils.isEmpty(aax)) {
                String[] split = aax.split("/");
                if (split.length >= 3) {
                    this.lMd = split[2];
                }
            }
            if (won.Vjb() == null || TextUtils.isEmpty(won.Vjb().KS())) {
                return;
            }
            this.KS = won.Vjb().KS();
        }
    }

    public static void KS(com.bytedance.sdk.openadsdk.core.model.woN won) {
        pvr pvrVar;
        if (won == null) {
            return;
        }
        int FGx = won.FGx();
        Integer valueOf = Integer.valueOf(FGx);
        if (FGx == 0) {
            return;
        }
        if (zp == null) {
            zp = new ConcurrentHashMap<>();
        }
        if (!zp.containsKey(valueOf) || (pvrVar = zp.get(valueOf)) == null) {
            return;
        }
        pvrVar.zp(1);
    }
}
