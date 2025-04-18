package com.bytedance.sdk.component.vc.YFl.tN;

import com.bytedance.sdk.component.vc.YFl.qsH;
import com.bytedance.sdk.component.vc.YFl.wN;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class Sg {
    public static void YFl(AtomicLong atomicLong, int i10) {
        wN rkt = qsH.DSW().rkt();
        if (rkt != null && rkt.DSW() && atomicLong != null) {
            atomicLong.getAndAdd(i10);
        }
    }
}
