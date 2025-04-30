package com.bytedance.sdk.component.HWF.zp.zp;

import com.bytedance.sdk.component.HWF.zp.ku;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public class lMd extends zp {
    private final Queue<String> KS;
    private final KS lMd;
    private final jU zp;

    public lMd() {
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        this.KS = concurrentLinkedQueue;
        this.zp = new HWF(concurrentLinkedQueue);
        this.lMd = new KS();
    }

    @Override // com.bytedance.sdk.component.HWF.zp.zp.jU
    public synchronized void zp(com.bytedance.sdk.component.HWF.zp.jU.zp zpVar, int i9) {
        jU jUVar;
        if (i9 != 5) {
            try {
                if (ku.QR().KVG().zp(ku.QR().HWF()) && (jUVar = this.zp) != null && zpVar != null) {
                    jUVar.zp(zpVar, i9);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        KS ks = this.lMd;
        if (ks != null && zpVar != null) {
            ks.zp(zpVar, i9);
        }
    }

    @Override // com.bytedance.sdk.component.HWF.zp.zp.jU
    public synchronized void zp(int i9, List<com.bytedance.sdk.component.HWF.zp.jU.zp> list) {
        try {
            Iterator<com.bytedance.sdk.component.HWF.zp.jU.zp> it = list.iterator();
            while (it.hasNext()) {
                this.KS.remove(it.next().KS());
            }
            jU jUVar = this.zp;
            if (jUVar != null) {
                jUVar.zp(i9, list);
            }
            KS ks = this.lMd;
            if (ks != null) {
                ks.zp(i9, list);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0016, code lost:
    
        if (r7 == 2) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.component.HWF.zp.zp.jU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized java.util.List<com.bytedance.sdk.component.HWF.zp.jU.zp> zp(int r7, int r8, java.util.List<java.lang.String> r9) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.HWF.zp.zp.lMd.zp(int, int, java.util.List):java.util.List");
    }

    @Override // com.bytedance.sdk.component.HWF.zp.zp.jU
    public synchronized boolean zp(int i9, boolean z8) {
        if (this.zp.zp(i9, z8)) {
            com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(com.bytedance.sdk.component.HWF.zp.lMd.jU.jU.YhE(), 1);
            return true;
        }
        if ((i9 != 1 && i9 != 2) || !this.lMd.zp(i9, z8)) {
            return false;
        }
        com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(com.bytedance.sdk.component.HWF.zp.lMd.jU.jU.WNy(), 1);
        return true;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.zp.jU
    public void zp(int i9, long j7) {
        this.lMd.zp(i9, j7);
        this.zp.zp(i9, j7);
    }
}
