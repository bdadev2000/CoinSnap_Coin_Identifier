package com.applovin.impl;

import android.util.Pair;
import com.applovin.impl.be;

/* loaded from: classes.dex */
public abstract class tc extends vo {

    /* renamed from: c, reason: collision with root package name */
    private a f27049c;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f27050a;

        /* renamed from: b, reason: collision with root package name */
        private final String[] f27051b;

        /* renamed from: c, reason: collision with root package name */
        private final int[] f27052c;
        private final po[] d;
        private final int[] e;

        /* renamed from: f, reason: collision with root package name */
        private final int[][][] f27053f;

        /* renamed from: g, reason: collision with root package name */
        private final po f27054g;

        public a(String[] strArr, int[] iArr, po[] poVarArr, int[] iArr2, int[][][] iArr3, po poVar) {
            this.f27051b = strArr;
            this.f27052c = iArr;
            this.d = poVarArr;
            this.f27053f = iArr3;
            this.e = iArr2;
            this.f27054g = poVar;
            this.f27050a = iArr.length;
        }

        public int a() {
            return this.f27050a;
        }

        public po b(int i2) {
            return this.d[i2];
        }

        public int a(int i2) {
            return this.f27052c[i2];
        }
    }

    private static int a(ri[] riVarArr, oo ooVar, int[] iArr, boolean z2) {
        int length = riVarArr.length;
        int i2 = 0;
        boolean z3 = true;
        for (int i3 = 0; i3 < riVarArr.length; i3++) {
            ri riVar = riVarArr[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < ooVar.f25910a; i5++) {
                i4 = Math.max(i4, ri.d(riVar.a(ooVar.a(i5))));
            }
            boolean z4 = iArr[i3] == 0;
            if (i4 > i2 || (i4 == i2 && z2 && !z3 && z4)) {
                length = i3;
                z3 = z4;
                i2 = i4;
            }
        }
        return length;
    }

    public abstract Pair a(a aVar, int[][][] iArr, int[] iArr2, be.a aVar2, fo foVar);

    private static int[] a(ri riVar, oo ooVar) {
        int[] iArr = new int[ooVar.f25910a];
        for (int i2 = 0; i2 < ooVar.f25910a; i2++) {
            iArr[i2] = riVar.a(ooVar.a(i2));
        }
        return iArr;
    }

    private static int[] a(ri[] riVarArr) {
        int length = riVarArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = riVarArr[i2].m();
        }
        return iArr;
    }

    @Override // com.applovin.impl.vo
    public final void a(Object obj) {
        this.f27049c = (a) obj;
    }

    @Override // com.applovin.impl.vo
    public final wo a(ri[] riVarArr, po poVar, be.a aVar, fo foVar) {
        int[] a2;
        int[] iArr = new int[riVarArr.length + 1];
        int length = riVarArr.length + 1;
        oo[][] ooVarArr = new oo[length];
        int[][][] iArr2 = new int[riVarArr.length + 1][];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = poVar.f26088a;
            ooVarArr[i2] = new oo[i3];
            iArr2[i2] = new int[i3];
        }
        int[] a3 = a(riVarArr);
        for (int i4 = 0; i4 < poVar.f26088a; i4++) {
            oo a4 = poVar.a(i4);
            int a5 = a(riVarArr, a4, iArr, Cif.e(a4.a(0).f23840m) == 5);
            if (a5 == riVarArr.length) {
                a2 = new int[a4.f25910a];
            } else {
                a2 = a(riVarArr[a5], a4);
            }
            int i5 = iArr[a5];
            ooVarArr[a5][i5] = a4;
            iArr2[a5][i5] = a2;
            iArr[a5] = i5 + 1;
        }
        po[] poVarArr = new po[riVarArr.length];
        String[] strArr = new String[riVarArr.length];
        int[] iArr3 = new int[riVarArr.length];
        for (int i6 = 0; i6 < riVarArr.length; i6++) {
            int i7 = iArr[i6];
            poVarArr[i6] = new po((oo[]) xp.a(ooVarArr[i6], i7));
            iArr2[i6] = (int[][]) xp.a(iArr2[i6], i7);
            strArr[i6] = riVarArr[i6].getName();
            iArr3[i6] = riVarArr[i6].e();
        }
        a aVar2 = new a(strArr, iArr3, poVarArr, a3, iArr2, new po((oo[]) xp.a(ooVarArr[riVarArr.length], iArr[riVarArr.length])));
        Pair a6 = a(aVar2, iArr2, a3, aVar, foVar);
        return new wo((si[]) a6.first, (h8[]) a6.second, aVar2);
    }
}
