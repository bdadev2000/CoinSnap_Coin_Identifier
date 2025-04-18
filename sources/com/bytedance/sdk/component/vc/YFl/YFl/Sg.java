package com.bytedance.sdk.component.vc.YFl.YFl;

import com.bytedance.sdk.component.vc.YFl.qsH;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public class Sg extends YFl {
    private final tN Sg;
    private final AlY YFl;
    private final Queue<String> tN;

    public Sg() {
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        this.tN = concurrentLinkedQueue;
        this.YFl = new vc(concurrentLinkedQueue);
        this.Sg = new tN();
    }

    @Override // com.bytedance.sdk.component.vc.YFl.YFl.AlY
    public synchronized void YFl(com.bytedance.sdk.component.vc.YFl.AlY.YFl yFl, int i10) {
        AlY alY;
        if (i10 != 5) {
            if (qsH.DSW().rkt().YFl(qsH.DSW().vc()) && (alY = this.YFl) != null && yFl != null) {
                alY.YFl(yFl, i10);
            }
        }
        tN tNVar = this.Sg;
        if (tNVar != null && yFl != null) {
            tNVar.YFl(yFl, i10);
        }
    }

    @Override // com.bytedance.sdk.component.vc.YFl.YFl.AlY
    public synchronized void YFl(int i10, List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> list) {
        Iterator<com.bytedance.sdk.component.vc.YFl.AlY.YFl> it = list.iterator();
        while (it.hasNext()) {
            this.tN.remove(it.next().tN());
        }
        AlY alY = this.YFl;
        if (alY != null) {
            alY.YFl(i10, list);
        }
        tN tNVar = this.Sg;
        if (tNVar != null) {
            tNVar.YFl(i10, list);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0016, code lost:
    
        if (r9 == 2) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.component.vc.YFl.YFl.AlY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized java.util.List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> YFl(int r9, int r10, java.util.List<java.lang.String> r11) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.vc.YFl.YFl.Sg.YFl(int, int, java.util.List):java.util.List");
    }

    @Override // com.bytedance.sdk.component.vc.YFl.YFl.AlY
    public synchronized boolean YFl(int i10, boolean z10) {
        if (this.YFl.YFl(i10, z10)) {
            com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(com.bytedance.sdk.component.vc.YFl.Sg.AlY.AlY.pq(), 1);
            return true;
        }
        if ((i10 != 1 && i10 != 2) || !this.Sg.YFl(i10, z10)) {
            return false;
        }
        com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(com.bytedance.sdk.component.vc.YFl.Sg.AlY.AlY.mn(), 1);
        return true;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.YFl.AlY
    public void YFl(int i10, long j3) {
        this.Sg.YFl(i10, j3);
        this.YFl.YFl(i10, j3);
    }
}
