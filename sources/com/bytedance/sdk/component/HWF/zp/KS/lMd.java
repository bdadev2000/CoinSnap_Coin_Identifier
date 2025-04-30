package com.bytedance.sdk.component.HWF.zp.KS;

import com.bytedance.sdk.component.HWF.zp.COT;
import com.bytedance.sdk.component.HWF.zp.ku;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class lMd {
    public static void zp(AtomicLong atomicLong, int i9) {
        COT KVG = ku.QR().KVG();
        if (KVG != null && KVG.QR() && atomicLong != null) {
            atomicLong.getAndAdd(i9);
        }
    }
}
