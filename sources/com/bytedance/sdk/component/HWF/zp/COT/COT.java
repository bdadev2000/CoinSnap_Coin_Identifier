package com.bytedance.sdk.component.HWF.zp.COT;

import java.util.UUID;

/* loaded from: classes.dex */
public abstract class COT implements Comparable<COT>, Runnable {
    private String KS;
    private int zp = 5;
    private String lMd = UUID.randomUUID().toString() + "-" + String.valueOf(System.nanoTime());

    public COT(String str) {
        this.KS = str;
    }

    public void zp(int i9) {
        this.zp = i9;
    }

    public int zp() {
        return this.zp;
    }

    @Override // java.lang.Comparable
    /* renamed from: zp, reason: merged with bridge method [inline-methods] */
    public int compareTo(COT cot) {
        if (zp() < cot.zp()) {
            return 1;
        }
        return zp() >= cot.zp() ? -1 : 0;
    }
}
