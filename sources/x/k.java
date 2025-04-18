package x;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k {
    public final o a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f27278b = new ArrayList();

    public k(o oVar) {
        this.a = null;
        this.a = oVar;
    }

    public static long a(f fVar, long j3) {
        o oVar = fVar.f27267d;
        if (oVar instanceof i) {
            return j3;
        }
        ArrayList arrayList = fVar.f27274k;
        int size = arrayList.size();
        long j10 = j3;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) arrayList.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f27267d != oVar) {
                    j10 = Math.min(j10, a(fVar2, fVar2.f27269f + j3));
                }
            }
        }
        if (fVar == oVar.f27300i) {
            long j11 = oVar.j();
            long j12 = j3 - j11;
            return Math.min(Math.min(j10, a(oVar.f27299h, j12)), j12 - r9.f27269f);
        }
        return j10;
    }

    public static long b(f fVar, long j3) {
        o oVar = fVar.f27267d;
        if (oVar instanceof i) {
            return j3;
        }
        ArrayList arrayList = fVar.f27274k;
        int size = arrayList.size();
        long j10 = j3;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) arrayList.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f27267d != oVar) {
                    j10 = Math.max(j10, b(fVar2, fVar2.f27269f + j3));
                }
            }
        }
        if (fVar == oVar.f27299h) {
            long j11 = oVar.j();
            long j12 = j3 + j11;
            return Math.max(Math.max(j10, b(oVar.f27300i, j12)), j12 - r9.f27269f);
        }
        return j10;
    }
}
