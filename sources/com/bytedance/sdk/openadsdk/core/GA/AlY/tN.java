package com.bytedance.sdk.openadsdk.core.GA.AlY;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import k5.b;
import k5.c;
import z4.e;

/* loaded from: classes.dex */
public class tN extends e {
    private final YFl AlY;
    private final List<Sg> YFl = Collections.synchronizedList(new ArrayList());
    private int Sg = 1;
    private int tN = 1;

    /* loaded from: classes.dex */
    public interface Sg extends b {
        @Override // k5.b
        /* synthetic */ void AlY(c cVar);

        @Override // k5.b
        /* synthetic */ void Sg(c cVar);

        @Override // k5.b
        /* synthetic */ void Sg(c cVar, int i10);

        void YFl(int i10, int i11);

        @Override // k5.b
        /* synthetic */ void YFl(c cVar);

        @Override // k5.b
        /* synthetic */ void YFl(c cVar, int i10);

        @Override // k5.b
        /* synthetic */ void YFl(c cVar, int i10, int i11);

        @Override // k5.b
        /* synthetic */ void YFl(c cVar, int i10, int i11, int i12);

        @Override // k5.b
        /* synthetic */ void YFl(c cVar, long j3);

        @Override // k5.b
        /* synthetic */ void YFl(c cVar, long j3, long j10);

        @Override // k5.b
        /* synthetic */ void YFl(c cVar, p5.b bVar);

        @Override // k5.b
        /* synthetic */ void YFl(c cVar, boolean z10);

        @Override // k5.b
        /* synthetic */ void tN(c cVar);

        @Override // k5.b
        /* synthetic */ void wN(c cVar);
    }

    public tN() {
        YFl yFl = new YFl();
        this.AlY = yFl;
        super.YFl(yFl);
        YFl(500);
    }

    public static /* synthetic */ int YFl(tN tNVar) {
        int i10 = tNVar.tN;
        tNVar.tN = i10 + 1;
        return i10;
    }

    public int aIu() {
        return this.tN;
    }

    @Override // z4.e
    public long lG() {
        return ((this.tN - 1) * super.rkt()) + super.lG();
    }

    @Override // z4.e
    public long rkt() {
        return super.rkt() * this.Sg;
    }

    /* loaded from: classes.dex */
    public class YFl implements b {
        private YFl() {
        }

        @Override // k5.b
        public void AlY(c cVar) {
            Iterator it = tN.this.YFl.iterator();
            while (it.hasNext()) {
                ((Sg) it.next()).AlY(cVar);
            }
        }

        @Override // k5.b
        public void Sg(c cVar) {
            Iterator it = tN.this.YFl.iterator();
            while (it.hasNext()) {
                ((Sg) it.next()).Sg(cVar);
            }
        }

        @Override // k5.b
        public void YFl(c cVar) {
            tN.YFl(tN.this);
            if (tN.this.tN <= tN.this.Sg) {
                Iterator it = tN.this.YFl.iterator();
                while (it.hasNext()) {
                    ((Sg) it.next()).YFl(tN.this.tN, tN.this.Sg);
                }
                tN.this.NjR();
                return;
            }
            Iterator it2 = tN.this.YFl.iterator();
            while (it2.hasNext()) {
                ((Sg) it2.next()).YFl(cVar);
            }
        }

        @Override // k5.b
        public void tN(c cVar) {
            Iterator it = tN.this.YFl.iterator();
            while (it.hasNext()) {
                ((Sg) it.next()).tN(cVar);
            }
        }

        @Override // k5.b
        public void wN(c cVar) {
            Iterator it = tN.this.YFl.iterator();
            while (it.hasNext()) {
                ((Sg) it.next()).wN(cVar);
            }
        }

        @Override // k5.b
        public void Sg(c cVar, int i10) {
            Iterator it = tN.this.YFl.iterator();
            while (it.hasNext()) {
                ((Sg) it.next()).Sg(cVar, i10);
            }
        }

        @Override // k5.b
        public void YFl(c cVar, long j3) {
            Iterator it = tN.this.YFl.iterator();
            while (it.hasNext()) {
                ((Sg) it.next()).YFl(cVar, j3);
            }
        }

        @Override // k5.b
        public void YFl(c cVar, p5.b bVar) {
            Iterator it = tN.this.YFl.iterator();
            while (it.hasNext()) {
                ((Sg) it.next()).YFl(cVar, bVar);
            }
        }

        @Override // k5.b
        public void YFl(c cVar, boolean z10) {
            Iterator it = tN.this.YFl.iterator();
            while (it.hasNext()) {
                ((Sg) it.next()).YFl(cVar, z10);
            }
        }

        @Override // k5.b
        public void YFl(c cVar, int i10, int i11) {
            Iterator it = tN.this.YFl.iterator();
            while (it.hasNext()) {
                ((Sg) it.next()).YFl(cVar, i10, i11);
            }
        }

        @Override // k5.b
        public void YFl(c cVar, int i10, int i11, int i12) {
            Iterator it = tN.this.YFl.iterator();
            while (it.hasNext()) {
                ((Sg) it.next()).YFl(cVar, i10, i11, i12);
            }
        }

        @Override // k5.b
        public void YFl(c cVar, int i10) {
            Iterator it = tN.this.YFl.iterator();
            while (it.hasNext()) {
                ((Sg) it.next()).YFl(cVar, i10);
            }
        }

        @Override // k5.b
        public void YFl(c cVar, long j3, long j10) {
            Iterator it = tN.this.YFl.iterator();
            while (it.hasNext()) {
                ((Sg) it.next()).YFl(cVar, j3, j10);
            }
        }
    }

    @Override // z4.e
    public void YFl(b bVar) {
        if (bVar instanceof Sg) {
            if (this.YFl.contains(bVar)) {
                return;
            }
            this.YFl.add((Sg) bVar);
            return;
        }
        super.YFl(bVar);
    }

    public void tN(int i10) {
        this.Sg = Math.max(1, i10);
    }
}
