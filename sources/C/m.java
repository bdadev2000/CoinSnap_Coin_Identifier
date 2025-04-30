package C;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public p f370a;
    public ArrayList b;

    public static long a(g gVar, long j7) {
        p pVar = gVar.f360d;
        if (pVar instanceof k) {
            return j7;
        }
        ArrayList arrayList = gVar.f367k;
        int size = arrayList.size();
        long j9 = j7;
        for (int i9 = 0; i9 < size; i9++) {
            e eVar = (e) arrayList.get(i9);
            if (eVar instanceof g) {
                g gVar2 = (g) eVar;
                if (gVar2.f360d != pVar) {
                    j9 = Math.min(j9, a(gVar2, gVar2.f362f + j7));
                }
            }
        }
        if (gVar == pVar.f384i) {
            long j10 = pVar.j();
            long j11 = j7 - j10;
            return Math.min(Math.min(j9, a(pVar.f383h, j11)), j11 - r9.f362f);
        }
        return j9;
    }

    public static long b(g gVar, long j7) {
        p pVar = gVar.f360d;
        if (pVar instanceof k) {
            return j7;
        }
        ArrayList arrayList = gVar.f367k;
        int size = arrayList.size();
        long j9 = j7;
        for (int i9 = 0; i9 < size; i9++) {
            e eVar = (e) arrayList.get(i9);
            if (eVar instanceof g) {
                g gVar2 = (g) eVar;
                if (gVar2.f360d != pVar) {
                    j9 = Math.max(j9, b(gVar2, gVar2.f362f + j7));
                }
            }
        }
        if (gVar == pVar.f383h) {
            long j10 = pVar.j();
            long j11 = j7 + j10;
            return Math.max(Math.max(j9, b(pVar.f384i, j11)), j11 - r9.f362f);
        }
        return j9;
    }
}
