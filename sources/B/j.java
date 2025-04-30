package B;

import z.C2963c;
import z.C2966f;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f252a = new boolean[3];

    /* JADX WARN: Code restructure failed: missing block: B:157:0x0283, code lost:
    
        if (r2.f105d == r7) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0109, code lost:
    
        if (r4.f105d == r13) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0440 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x06af A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x06ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0707 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0591 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x069f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0113 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(B.e r36, z.C2963c r37, java.util.ArrayList r38, int r39) {
        /*
            Method dump skipped, instructions count: 1813
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B.j.a(B.e, z.c, java.util.ArrayList, int):void");
    }

    public static void b(e eVar, C2963c c2963c, d dVar) {
        dVar.f160o = -1;
        dVar.f162p = -1;
        int i9 = eVar.f163p0[0];
        int[] iArr = dVar.f163p0;
        if (i9 != 2 && iArr[0] == 4) {
            c cVar = dVar.f119I;
            int i10 = cVar.f108g;
            int q9 = eVar.q();
            c cVar2 = dVar.f121K;
            int i11 = q9 - cVar2.f108g;
            cVar.f110i = c2963c.k(cVar);
            cVar2.f110i = c2963c.k(cVar2);
            c2963c.d(cVar.f110i, i10);
            c2963c.d(cVar2.f110i, i11);
            dVar.f160o = 2;
            dVar.f134Y = i10;
            int i12 = i11 - i10;
            dVar.f130U = i12;
            int i13 = dVar.f138b0;
            if (i12 < i13) {
                dVar.f130U = i13;
            }
        }
        if (eVar.f163p0[1] != 2 && iArr[1] == 4) {
            c cVar3 = dVar.f120J;
            int i14 = cVar3.f108g;
            int k6 = eVar.k();
            c cVar4 = dVar.f122L;
            int i15 = k6 - cVar4.f108g;
            cVar3.f110i = c2963c.k(cVar3);
            cVar4.f110i = c2963c.k(cVar4);
            c2963c.d(cVar3.f110i, i14);
            c2963c.d(cVar4.f110i, i15);
            if (dVar.f137a0 > 0 || dVar.f147g0 == 8) {
                c cVar5 = dVar.f123M;
                C2966f k7 = c2963c.k(cVar5);
                cVar5.f110i = k7;
                c2963c.d(k7, dVar.f137a0 + i14);
            }
            dVar.f162p = 2;
            dVar.f135Z = i14;
            int i16 = i15 - i14;
            dVar.f131V = i16;
            int i17 = dVar.f140c0;
            if (i16 < i17) {
                dVar.f131V = i17;
            }
        }
    }

    public static final boolean c(int i9, int i10) {
        if ((i9 & i10) == i10) {
            return true;
        }
        return false;
    }
}
