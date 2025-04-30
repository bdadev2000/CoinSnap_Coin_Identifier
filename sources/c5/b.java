package C5;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f560a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    public static void a(D5.b bVar, int i9, int i10) {
        for (int i11 = 0; i11 < i10; i11 += 2) {
            int i12 = i9 - i11;
            int i13 = i12;
            while (true) {
                int i14 = i9 + i11;
                if (i13 <= i14) {
                    bVar.b(i13, i12);
                    bVar.b(i13, i14);
                    bVar.b(i12, i13);
                    bVar.b(i14, i13);
                    i13++;
                }
            }
        }
        int i15 = i9 - i10;
        bVar.b(i15, i15);
        int i16 = i15 + 1;
        bVar.b(i16, i15);
        bVar.b(i15, i16);
        int i17 = i9 + i10;
        bVar.b(i17, i15);
        bVar.b(i17, i16);
        bVar.b(i17, i17 - 1);
    }

    public static D5.a b(D5.a aVar, int i9, int i10) {
        E5.a aVar2;
        int i11;
        int i12 = aVar.f745c / i10;
        if (i10 != 4) {
            if (i10 != 6) {
                if (i10 != 8) {
                    if (i10 != 10) {
                        if (i10 == 12) {
                            aVar2 = E5.a.f1030g;
                        } else {
                            throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i10)));
                        }
                    } else {
                        aVar2 = E5.a.f1031h;
                    }
                } else {
                    aVar2 = E5.a.l;
                }
            } else {
                aVar2 = E5.a.f1032i;
            }
        } else {
            aVar2 = E5.a.f1033j;
        }
        E1.d dVar = new E1.d(aVar2);
        int i13 = i9 / i10;
        int[] iArr = new int[i13];
        int i14 = aVar.f745c / i10;
        for (int i15 = 0; i15 < i14; i15++) {
            int i16 = 0;
            for (int i17 = 0; i17 < i10; i17++) {
                if (aVar.d((i15 * i10) + i17)) {
                    i11 = 1 << ((i10 - i17) - 1);
                } else {
                    i11 = 0;
                }
                i16 |= i11;
            }
            iArr[i15] = i16;
        }
        dVar.f(i13 - i12, iArr);
        D5.a aVar3 = new D5.a();
        aVar3.b(0, i9 % i10);
        for (int i18 = 0; i18 < i13; i18++) {
            aVar3.b(iArr[i18], i10);
        }
        return aVar3;
    }

    public static D5.a c(D5.a aVar, int i9) {
        D5.a aVar2 = new D5.a();
        int i10 = aVar.f745c;
        int i11 = (1 << i9) - 2;
        int i12 = 0;
        while (i12 < i10) {
            int i13 = 0;
            for (int i14 = 0; i14 < i9; i14++) {
                int i15 = i12 + i14;
                if (i15 >= i10 || aVar.d(i15)) {
                    i13 |= 1 << ((i9 - 1) - i14);
                }
            }
            int i16 = i13 & i11;
            if (i16 == i11) {
                aVar2.b(i16, i9);
            } else if (i16 == 0) {
                aVar2.b(i13 | 1, i9);
            } else {
                aVar2.b(i13, i9);
                i12 += i9;
            }
            i12--;
            i12 += i9;
        }
        return aVar2;
    }
}
