package com.applovin.impl;

import com.applovin.impl.ab;
import com.applovin.impl.f8;
import com.applovin.impl.wd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: com.applovin.impl.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0707i0 extends AbstractC0690e2 {

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC0775x1 f8184h;

    /* renamed from: i, reason: collision with root package name */
    private final long f8185i;

    /* renamed from: j, reason: collision with root package name */
    private final long f8186j;

    /* renamed from: k, reason: collision with root package name */
    private final long f8187k;
    private final float l;
    private final float m;

    /* renamed from: n, reason: collision with root package name */
    private final ab f8188n;

    /* renamed from: o, reason: collision with root package name */
    private final j3 f8189o;

    /* renamed from: p, reason: collision with root package name */
    private float f8190p;

    /* renamed from: q, reason: collision with root package name */
    private int f8191q;

    /* renamed from: r, reason: collision with root package name */
    private int f8192r;

    /* renamed from: s, reason: collision with root package name */
    private long f8193s;

    /* renamed from: com.applovin.impl.i0$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f8194a;
        public final long b;

        public a(long j7, long j9) {
            this.f8194a = j7;
            this.b = j9;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f8194a == aVar.f8194a && this.b == aVar.b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.f8194a) * 31) + ((int) this.b);
        }
    }

    /* renamed from: com.applovin.impl.i0$b */
    /* loaded from: classes.dex */
    public static class b implements f8.b {

        /* renamed from: a, reason: collision with root package name */
        private final int f8195a;
        private final int b;

        /* renamed from: c, reason: collision with root package name */
        private final int f8196c;

        /* renamed from: d, reason: collision with root package name */
        private final float f8197d;

        /* renamed from: e, reason: collision with root package name */
        private final float f8198e;

        /* renamed from: f, reason: collision with root package name */
        private final j3 f8199f;

        public b() {
            this(10000, 25000, 25000, 0.7f, 0.75f, j3.f8390a);
        }

        @Override // com.applovin.impl.f8.b
        public final f8[] a(f8.a[] aVarArr, InterfaceC0775x1 interfaceC0775x1, wd.a aVar, go goVar) {
            f8 a6;
            ab b = C0707i0.b(aVarArr);
            f8[] f8VarArr = new f8[aVarArr.length];
            for (int i9 = 0; i9 < aVarArr.length; i9++) {
                f8.a aVar2 = aVarArr[i9];
                if (aVar2 != null) {
                    int[] iArr = aVar2.b;
                    if (iArr.length != 0) {
                        if (iArr.length == 1) {
                            a6 = new r8(aVar2.f7575a, iArr[0], aVar2.f7576c);
                        } else {
                            a6 = a(aVar2.f7575a, iArr, aVar2.f7576c, interfaceC0775x1, (ab) b.get(i9));
                        }
                        f8VarArr[i9] = a6;
                    }
                }
            }
            return f8VarArr;
        }

        public b(int i9, int i10, int i11, float f9, float f10, j3 j3Var) {
            this.f8195a = i9;
            this.b = i10;
            this.f8196c = i11;
            this.f8197d = f9;
            this.f8198e = f10;
            this.f8199f = j3Var;
        }

        public C0707i0 a(po poVar, int[] iArr, int i9, InterfaceC0775x1 interfaceC0775x1, ab abVar) {
            return new C0707i0(poVar, iArr, i9, interfaceC0775x1, this.f8195a, this.b, this.f8196c, this.f8197d, this.f8198e, abVar, this.f8199f);
        }
    }

    public C0707i0(po poVar, int[] iArr, int i9, InterfaceC0775x1 interfaceC0775x1, long j7, long j9, long j10, float f9, float f10, List list, j3 j3Var) {
        super(poVar, iArr, i9);
        if (j10 < j7) {
            kc.d("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j10 = j7;
        }
        this.f8184h = interfaceC0775x1;
        this.f8185i = j7 * 1000;
        this.f8186j = j9 * 1000;
        this.f8187k = j10 * 1000;
        this.l = f9;
        this.m = f10;
        this.f8188n = ab.a((Collection) list);
        this.f8189o = j3Var;
        this.f8190p = 1.0f;
        this.f8192r = 0;
        this.f8193s = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ab b(f8.a[] aVarArr) {
        ab a6;
        long j7;
        ArrayList arrayList = new ArrayList();
        for (f8.a aVar : aVarArr) {
            if (aVar != null && aVar.b.length > 1) {
                ab.a f9 = ab.f();
                f9.b(new a(0L, 0L));
                arrayList.add(f9);
            } else {
                arrayList.add(null);
            }
        }
        long[][] c9 = c(aVarArr);
        int[] iArr = new int[c9.length];
        long[] jArr = new long[c9.length];
        for (int i9 = 0; i9 < c9.length; i9++) {
            long[] jArr2 = c9[i9];
            if (jArr2.length == 0) {
                j7 = 0;
            } else {
                j7 = jArr2[0];
            }
            jArr[i9] = j7;
        }
        a(arrayList, jArr);
        ab a9 = a(c9);
        for (int i10 = 0; i10 < a9.size(); i10++) {
            int intValue = ((Integer) a9.get(i10)).intValue();
            int i11 = iArr[intValue] + 1;
            iArr[intValue] = i11;
            jArr[intValue] = c9[intValue][i11];
            a(arrayList, jArr);
        }
        for (int i12 = 0; i12 < aVarArr.length; i12++) {
            if (arrayList.get(i12) != null) {
                jArr[i12] = jArr[i12] * 2;
            }
        }
        a(arrayList, jArr);
        ab.a f10 = ab.f();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            ab.a aVar2 = (ab.a) arrayList.get(i13);
            if (aVar2 == null) {
                a6 = ab.h();
            } else {
                a6 = aVar2.a();
            }
            f10.b(a6);
        }
        return f10.a();
    }

    private static long[][] c(f8.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length];
        for (int i9 = 0; i9 < aVarArr.length; i9++) {
            f8.a aVar = aVarArr[i9];
            if (aVar == null) {
                jArr[i9] = new long[0];
            } else {
                jArr[i9] = new long[aVar.b.length];
                int i10 = 0;
                while (true) {
                    if (i10 >= aVar.b.length) {
                        break;
                    }
                    jArr[i9][i10] = aVar.f7575a.a(r5[i10]).f7208i;
                    i10++;
                }
                Arrays.sort(jArr[i9]);
            }
        }
        return jArr;
    }

    @Override // com.applovin.impl.AbstractC0690e2, com.applovin.impl.f8
    public void f() {
    }

    @Override // com.applovin.impl.f8
    public int h() {
        return this.f8191q;
    }

    @Override // com.applovin.impl.AbstractC0690e2, com.applovin.impl.f8
    public void i() {
        this.f8193s = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    private static void a(List list, long[] jArr) {
        long j7 = 0;
        for (long j9 : jArr) {
            j7 += j9;
        }
        for (int i9 = 0; i9 < list.size(); i9++) {
            ab.a aVar = (ab.a) list.get(i9);
            if (aVar != null) {
                aVar.b(new a(j7, jArr[i9]));
            }
        }
    }

    @Override // com.applovin.impl.AbstractC0690e2, com.applovin.impl.f8
    public void a(float f9) {
        this.f8190p = f9;
    }

    private static ab a(long[][] jArr) {
        ac b8 = rf.a().a().b();
        for (int i9 = 0; i9 < jArr.length; i9++) {
            long[] jArr2 = jArr[i9];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i10 = 0;
                while (true) {
                    long[] jArr3 = jArr[i9];
                    double d2 = 0.0d;
                    if (i10 >= jArr3.length) {
                        break;
                    }
                    long j7 = jArr3[i10];
                    if (j7 != -1) {
                        d2 = Math.log(j7);
                    }
                    dArr[i10] = d2;
                    i10++;
                }
                int i11 = length - 1;
                double d9 = dArr[i11] - dArr[0];
                int i12 = 0;
                while (i12 < i11) {
                    double d10 = dArr[i12];
                    i12++;
                    b8.put(Double.valueOf(d9 == 0.0d ? 1.0d : (((d10 + dArr[i12]) * 0.5d) - dArr[0]) / d9), Integer.valueOf(i9));
                }
            }
        }
        return ab.a(b8.values());
    }
}
