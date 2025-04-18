package com.applovin.impl;

import com.applovin.impl.ab;
import com.applovin.impl.f8;
import com.applovin.impl.wd;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public class i0 extends e2 {

    /* renamed from: h, reason: collision with root package name */
    private final x1 f5217h;

    /* renamed from: i, reason: collision with root package name */
    private final long f5218i;

    /* renamed from: j, reason: collision with root package name */
    private final long f5219j;

    /* renamed from: k, reason: collision with root package name */
    private final long f5220k;

    /* renamed from: l, reason: collision with root package name */
    private final float f5221l;

    /* renamed from: m, reason: collision with root package name */
    private final float f5222m;

    /* renamed from: n, reason: collision with root package name */
    private final ab f5223n;

    /* renamed from: o, reason: collision with root package name */
    private final j3 f5224o;

    /* renamed from: p, reason: collision with root package name */
    private float f5225p;

    /* renamed from: q, reason: collision with root package name */
    private int f5226q;

    /* renamed from: r, reason: collision with root package name */
    private int f5227r;

    /* renamed from: s, reason: collision with root package name */
    private long f5228s;

    /* loaded from: classes.dex */
    public static final class a {
        public final long a;

        /* renamed from: b, reason: collision with root package name */
        public final long f5229b;

        public a(long j3, long j10) {
            this.a = j3;
            this.f5229b = j10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a == aVar.a && this.f5229b == aVar.f5229b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.a) * 31) + ((int) this.f5229b);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements f8.b {
        private final int a;

        /* renamed from: b, reason: collision with root package name */
        private final int f5230b;

        /* renamed from: c, reason: collision with root package name */
        private final int f5231c;

        /* renamed from: d, reason: collision with root package name */
        private final float f5232d;

        /* renamed from: e, reason: collision with root package name */
        private final float f5233e;

        /* renamed from: f, reason: collision with root package name */
        private final j3 f5234f;

        public b() {
            this(10000, 25000, 25000, 0.7f, 0.75f, j3.a);
        }

        @Override // com.applovin.impl.f8.b
        public final f8[] a(f8.a[] aVarArr, x1 x1Var, wd.a aVar, go goVar) {
            f8 a;
            ab b3 = i0.b(aVarArr);
            f8[] f8VarArr = new f8[aVarArr.length];
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                f8.a aVar2 = aVarArr[i10];
                if (aVar2 != null) {
                    int[] iArr = aVar2.f4622b;
                    if (iArr.length != 0) {
                        if (iArr.length == 1) {
                            a = new r8(aVar2.a, iArr[0], aVar2.f4623c);
                        } else {
                            a = a(aVar2.a, iArr, aVar2.f4623c, x1Var, (ab) b3.get(i10));
                        }
                        f8VarArr[i10] = a;
                    }
                }
            }
            return f8VarArr;
        }

        public b(int i10, int i11, int i12, float f10, float f11, j3 j3Var) {
            this.a = i10;
            this.f5230b = i11;
            this.f5231c = i12;
            this.f5232d = f10;
            this.f5233e = f11;
            this.f5234f = j3Var;
        }

        public i0 a(po poVar, int[] iArr, int i10, x1 x1Var, ab abVar) {
            return new i0(poVar, iArr, i10, x1Var, this.a, this.f5230b, this.f5231c, this.f5232d, this.f5233e, abVar, this.f5234f);
        }
    }

    public i0(po poVar, int[] iArr, int i10, x1 x1Var, long j3, long j10, long j11, float f10, float f11, List list, j3 j3Var) {
        super(poVar, iArr, i10);
        if (j11 < j3) {
            kc.d("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j11 = j3;
        }
        this.f5217h = x1Var;
        this.f5218i = j3 * 1000;
        this.f5219j = j10 * 1000;
        this.f5220k = j11 * 1000;
        this.f5221l = f10;
        this.f5222m = f11;
        this.f5223n = ab.a((Collection) list);
        this.f5224o = j3Var;
        this.f5225p = 1.0f;
        this.f5227r = 0;
        this.f5228s = C.TIME_UNSET;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ab b(f8.a[] aVarArr) {
        ab a10;
        long j3;
        ArrayList arrayList = new ArrayList();
        for (f8.a aVar : aVarArr) {
            if (aVar != null && aVar.f4622b.length > 1) {
                ab.a f10 = ab.f();
                f10.b(new a(0L, 0L));
                arrayList.add(f10);
            } else {
                arrayList.add(null);
            }
        }
        long[][] c10 = c(aVarArr);
        int[] iArr = new int[c10.length];
        long[] jArr = new long[c10.length];
        for (int i10 = 0; i10 < c10.length; i10++) {
            long[] jArr2 = c10[i10];
            if (jArr2.length == 0) {
                j3 = 0;
            } else {
                j3 = jArr2[0];
            }
            jArr[i10] = j3;
        }
        a(arrayList, jArr);
        ab a11 = a(c10);
        for (int i11 = 0; i11 < a11.size(); i11++) {
            int intValue = ((Integer) a11.get(i11)).intValue();
            int i12 = iArr[intValue] + 1;
            iArr[intValue] = i12;
            jArr[intValue] = c10[intValue][i12];
            a(arrayList, jArr);
        }
        for (int i13 = 0; i13 < aVarArr.length; i13++) {
            if (arrayList.get(i13) != null) {
                jArr[i13] = jArr[i13] * 2;
            }
        }
        a(arrayList, jArr);
        ab.a f11 = ab.f();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            ab.a aVar2 = (ab.a) arrayList.get(i14);
            if (aVar2 == null) {
                a10 = ab.h();
            } else {
                a10 = aVar2.a();
            }
            f11.b(a10);
        }
        return f11.a();
    }

    private static long[][] c(f8.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            f8.a aVar = aVarArr[i10];
            if (aVar == null) {
                jArr[i10] = new long[0];
            } else {
                jArr[i10] = new long[aVar.f4622b.length];
                int i11 = 0;
                while (true) {
                    if (i11 >= aVar.f4622b.length) {
                        break;
                    }
                    jArr[i10][i11] = aVar.a.a(r5[i11]).f4224i;
                    i11++;
                }
                Arrays.sort(jArr[i10]);
            }
        }
        return jArr;
    }

    @Override // com.applovin.impl.e2, com.applovin.impl.f8
    public void f() {
    }

    @Override // com.applovin.impl.f8
    public int h() {
        return this.f5226q;
    }

    @Override // com.applovin.impl.e2, com.applovin.impl.f8
    public void i() {
        this.f5228s = C.TIME_UNSET;
    }

    private static void a(List list, long[] jArr) {
        long j3 = 0;
        for (long j10 : jArr) {
            j3 += j10;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            ab.a aVar = (ab.a) list.get(i10);
            if (aVar != null) {
                aVar.b(new a(j3, jArr[i10]));
            }
        }
    }

    @Override // com.applovin.impl.e2, com.applovin.impl.f8
    public void a(float f10) {
        this.f5225p = f10;
    }

    private static ab a(long[][] jArr) {
        ac b3 = rf.a().a().b();
        for (int i10 = 0; i10 < jArr.length; i10++) {
            long[] jArr2 = jArr[i10];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i11 = 0;
                while (true) {
                    long[] jArr3 = jArr[i10];
                    double d10 = 0.0d;
                    if (i11 >= jArr3.length) {
                        break;
                    }
                    long j3 = jArr3[i11];
                    if (j3 != -1) {
                        d10 = Math.log(j3);
                    }
                    dArr[i11] = d10;
                    i11++;
                }
                int i12 = length - 1;
                double d11 = dArr[i12] - dArr[0];
                int i13 = 0;
                while (i13 < i12) {
                    double d12 = dArr[i13];
                    i13++;
                    b3.put(Double.valueOf(d11 == 0.0d ? 1.0d : (((d12 + dArr[i13]) * 0.5d) - dArr[0]) / d11), Integer.valueOf(i10));
                }
            }
        }
        return ab.a(b3.values());
    }
}
