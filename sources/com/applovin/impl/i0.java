package com.applovin.impl;

import com.applovin.impl.be;
import com.applovin.impl.eb;
import com.applovin.impl.h8;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* loaded from: classes2.dex */
public class i0 extends f2 {

    /* renamed from: h, reason: collision with root package name */
    private final y1 f24371h;

    /* renamed from: i, reason: collision with root package name */
    private final long f24372i;

    /* renamed from: j, reason: collision with root package name */
    private final long f24373j;

    /* renamed from: k, reason: collision with root package name */
    private final long f24374k;

    /* renamed from: l, reason: collision with root package name */
    private final float f24375l;

    /* renamed from: m, reason: collision with root package name */
    private final float f24376m;

    /* renamed from: n, reason: collision with root package name */
    private final eb f24377n;

    /* renamed from: o, reason: collision with root package name */
    private final l3 f24378o;

    /* renamed from: p, reason: collision with root package name */
    private float f24379p;

    /* renamed from: q, reason: collision with root package name */
    private int f24380q;

    /* renamed from: r, reason: collision with root package name */
    private int f24381r;

    /* renamed from: s, reason: collision with root package name */
    private long f24382s;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f24383a;

        /* renamed from: b, reason: collision with root package name */
        public final long f24384b;

        public a(long j2, long j3) {
            this.f24383a = j2;
            this.f24384b = j3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f24383a == aVar.f24383a && this.f24384b == aVar.f24384b;
        }

        public int hashCode() {
            return (((int) this.f24383a) * 31) + ((int) this.f24384b);
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements h8.b {

        /* renamed from: a, reason: collision with root package name */
        private final int f24385a;

        /* renamed from: b, reason: collision with root package name */
        private final int f24386b;

        /* renamed from: c, reason: collision with root package name */
        private final int f24387c;
        private final float d;
        private final float e;

        /* renamed from: f, reason: collision with root package name */
        private final l3 f24388f;

        public b() {
            this(10000, 25000, 25000, 0.7f, 0.75f, l3.f24977a);
        }

        @Override // com.applovin.impl.h8.b
        public final h8[] a(h8.a[] aVarArr, y1 y1Var, be.a aVar, fo foVar) {
            h8 a2;
            eb b2 = i0.b(aVarArr);
            h8[] h8VarArr = new h8[aVarArr.length];
            for (int i2 = 0; i2 < aVarArr.length; i2++) {
                h8.a aVar2 = aVarArr[i2];
                if (aVar2 != null) {
                    int[] iArr = aVar2.f24242b;
                    if (iArr.length != 0) {
                        if (iArr.length == 1) {
                            a2 = new t8(aVar2.f24241a, iArr[0], aVar2.f24243c);
                        } else {
                            a2 = a(aVar2.f24241a, iArr, aVar2.f24243c, y1Var, (eb) b2.get(i2));
                        }
                        h8VarArr[i2] = a2;
                    }
                }
            }
            return h8VarArr;
        }

        public b(int i2, int i3, int i4, float f2, float f3, l3 l3Var) {
            this.f24385a = i2;
            this.f24386b = i3;
            this.f24387c = i4;
            this.d = f2;
            this.e = f3;
            this.f24388f = l3Var;
        }

        public i0 a(oo ooVar, int[] iArr, int i2, y1 y1Var, eb ebVar) {
            return new i0(ooVar, iArr, i2, y1Var, this.f24385a, this.f24386b, this.f24387c, this.d, this.e, ebVar, this.f24388f);
        }
    }

    public i0(oo ooVar, int[] iArr, int i2, y1 y1Var, long j2, long j3, long j4, float f2, float f3, List list, l3 l3Var) {
        super(ooVar, iArr, i2);
        if (j4 < j2) {
            pc.d("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j4 = j2;
        }
        this.f24371h = y1Var;
        this.f24372i = j2 * 1000;
        this.f24373j = j3 * 1000;
        this.f24374k = j4 * 1000;
        this.f24375l = f2;
        this.f24376m = f3;
        this.f24377n = eb.a((Collection) list);
        this.f24378o = l3Var;
        this.f24379p = 1.0f;
        this.f24381r = 0;
        this.f24382s = -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static eb b(h8.a[] aVarArr) {
        ArrayList arrayList = new ArrayList();
        for (h8.a aVar : aVarArr) {
            if (aVar == null || aVar.f24242b.length <= 1) {
                arrayList.add(null);
            } else {
                eb.a f2 = eb.f();
                f2.b(new a(0L, 0L));
                arrayList.add(f2);
            }
        }
        long[][] c2 = c(aVarArr);
        int[] iArr = new int[c2.length];
        long[] jArr = new long[c2.length];
        for (int i2 = 0; i2 < c2.length; i2++) {
            long[] jArr2 = c2[i2];
            jArr[i2] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        a(arrayList, jArr);
        eb a2 = a(c2);
        for (int i3 = 0; i3 < a2.size(); i3++) {
            int intValue = ((Integer) a2.get(i3)).intValue();
            int i4 = iArr[intValue] + 1;
            iArr[intValue] = i4;
            jArr[intValue] = c2[intValue][i4];
            a(arrayList, jArr);
        }
        for (int i5 = 0; i5 < aVarArr.length; i5++) {
            if (arrayList.get(i5) != null) {
                jArr[i5] = jArr[i5] * 2;
            }
        }
        a(arrayList, jArr);
        eb.a f3 = eb.f();
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            eb.a aVar2 = (eb.a) arrayList.get(i6);
            f3.b(aVar2 == null ? eb.h() : aVar2.a());
        }
        return f3.a();
    }

    private static long[][] c(h8.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length];
        for (int i2 = 0; i2 < aVarArr.length; i2++) {
            h8.a aVar = aVarArr[i2];
            if (aVar == null) {
                jArr[i2] = new long[0];
            } else {
                jArr[i2] = new long[aVar.f24242b.length];
                int i3 = 0;
                while (true) {
                    if (i3 >= aVar.f24242b.length) {
                        break;
                    }
                    jArr[i2][i3] = aVar.f24241a.a(r5[i3]).f23836i;
                    i3++;
                }
                Arrays.sort(jArr[i2]);
            }
        }
        return jArr;
    }

    @Override // com.applovin.impl.f2, com.applovin.impl.h8
    public void a(float f2) {
        this.f24379p = f2;
    }

    @Override // com.applovin.impl.f2, com.applovin.impl.h8
    public void f() {
    }

    @Override // com.applovin.impl.h8
    public int h() {
        return this.f24380q;
    }

    @Override // com.applovin.impl.f2, com.applovin.impl.h8
    public void i() {
        this.f24382s = -9223372036854775807L;
    }

    private static void a(List list, long[] jArr) {
        long j2 = 0;
        for (long j3 : jArr) {
            j2 += j3;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            eb.a aVar = (eb.a) list.get(i2);
            if (aVar != null) {
                aVar.b(new a(j2, jArr[i2]));
            }
        }
    }

    private static eb a(long[][] jArr) {
        fc b2 = wf.a().a().b();
        for (int i2 = 0; i2 < jArr.length; i2++) {
            long[] jArr2 = jArr[i2];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i3 = 0;
                while (true) {
                    long[] jArr3 = jArr[i2];
                    int length2 = jArr3.length;
                    double d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                    if (i3 >= length2) {
                        break;
                    }
                    long j2 = jArr3[i3];
                    if (j2 != -1) {
                        d = Math.log(j2);
                    }
                    dArr[i3] = d;
                    i3++;
                }
                int i4 = length - 1;
                double d2 = dArr[i4] - dArr[0];
                int i5 = 0;
                while (i5 < i4) {
                    double d3 = dArr[i5];
                    i5++;
                    b2.put(Double.valueOf(d2 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? 1.0d : (((d3 + dArr[i5]) * 0.5d) - dArr[0]) / d2), Integer.valueOf(i2));
                }
            }
        }
        return eb.a(b2.values());
    }
}
