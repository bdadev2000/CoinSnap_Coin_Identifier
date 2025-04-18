package androidx.compose.animation.core;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;

@StabilityInferred
@ExperimentalAnimationSpecApi
/* loaded from: classes.dex */
public final class ArcSpline {

    /* renamed from: a, reason: collision with root package name */
    public final Arc[][] f2048a;

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class Arc {

        /* renamed from: s, reason: collision with root package name */
        public static float[] f2049s;

        /* renamed from: a, reason: collision with root package name */
        public final float f2050a;

        /* renamed from: b, reason: collision with root package name */
        public final float f2051b;

        /* renamed from: c, reason: collision with root package name */
        public final float f2052c;
        public final float d;
        public final float e;

        /* renamed from: f, reason: collision with root package name */
        public final float f2053f;

        /* renamed from: g, reason: collision with root package name */
        public final float f2054g;

        /* renamed from: h, reason: collision with root package name */
        public float f2055h;

        /* renamed from: i, reason: collision with root package name */
        public float f2056i;

        /* renamed from: j, reason: collision with root package name */
        public final float[] f2057j;

        /* renamed from: k, reason: collision with root package name */
        public final float f2058k;

        /* renamed from: l, reason: collision with root package name */
        public final float f2059l;

        /* renamed from: m, reason: collision with root package name */
        public final float f2060m;

        /* renamed from: n, reason: collision with root package name */
        public final float f2061n;

        /* renamed from: o, reason: collision with root package name */
        public final float f2062o;

        /* renamed from: p, reason: collision with root package name */
        public final float f2063p;

        /* renamed from: q, reason: collision with root package name */
        public final boolean f2064q;

        /* renamed from: r, reason: collision with root package name */
        public final boolean f2065r;

        /* loaded from: classes.dex */
        public static final class Companion {
            public static final float[] a() {
                float[] fArr = Arc.f2049s;
                if (fArr != null) {
                    return fArr;
                }
                float[] fArr2 = new float[91];
                Arc.f2049s = fArr2;
                return fArr2;
            }
        }

        public Arc(float f2, float f3, float f4, int i2, float f5, float f6, float f7) {
            float f8 = f4;
            this.f2050a = f2;
            this.f2051b = f3;
            this.f2052c = f8;
            this.d = f5;
            this.e = f6;
            this.f2053f = f7;
            float f9 = f6 - f8;
            float f10 = f7 - f5;
            boolean z2 = true;
            boolean z3 = i2 == 1 || (i2 == 4 ? f10 > 0.0f : !(i2 != 5 || f10 >= 0.0f));
            this.f2064q = z3;
            float f11 = f3 - f2;
            float f12 = 1 / f11;
            this.f2058k = f12;
            boolean z4 = 3 == i2;
            if (z4 || Math.abs(f9) < 0.001f || Math.abs(f10) < 0.001f) {
                float hypot = (float) Math.hypot(f10, f9);
                this.f2054g = hypot;
                this.f2063p = hypot * f12;
                this.f2061n = f9 / f11;
                this.f2062o = f10 / f11;
                this.f2057j = new float[101];
                this.f2059l = Float.NaN;
                this.f2060m = Float.NaN;
            } else {
                this.f2057j = new float[101];
                this.f2059l = (z3 ? -1 : 1) * f9;
                this.f2060m = f10 * (z3 ? 1 : -1);
                this.f2061n = z3 ? f6 : f8;
                this.f2062o = z3 ? f5 : f7;
                float f13 = f5 - f7;
                int length = Companion.a().length;
                float f14 = 0.0f;
                float f15 = 0.0f;
                float f16 = 0.0f;
                int i3 = 0;
                while (i3 < length) {
                    boolean z5 = z4;
                    double radians = (float) Math.toRadians((i3 * 90.0d) / (Companion.a().length - 1));
                    float sin = ((float) Math.sin(radians)) * f9;
                    float cos = ((float) Math.cos(radians)) * f13;
                    if (i3 > 0) {
                        f14 += (float) Math.hypot(sin - f15, cos - f16);
                        Companion.a()[i3] = f14;
                    }
                    i3++;
                    z4 = z5;
                    f16 = cos;
                    f15 = sin;
                }
                boolean z6 = z4;
                this.f2054g = f14;
                int length2 = Companion.a().length;
                for (int i4 = 0; i4 < length2; i4++) {
                    float[] a2 = Companion.a();
                    a2[i4] = a2[i4] / f14;
                }
                float[] fArr = this.f2057j;
                int length3 = fArr.length;
                for (int i5 = 0; i5 < length3; i5++) {
                    float length4 = i5 / (fArr.length - 1);
                    float[] a3 = Companion.a();
                    int binarySearch = Arrays.binarySearch(a3, 0, a3.length, length4);
                    if (binarySearch >= 0) {
                        fArr[i5] = binarySearch / (Companion.a().length - 1);
                    } else if (binarySearch == -1) {
                        fArr[i5] = 0.0f;
                    } else {
                        int i6 = -binarySearch;
                        int i7 = i6 - 2;
                        fArr[i5] = (((length4 - Companion.a()[i7]) / (Companion.a()[i6 - 1] - Companion.a()[i7])) + i7) / (Companion.a().length - 1);
                    }
                }
                this.f2063p = this.f2054g * this.f2058k;
                z2 = z6;
            }
            this.f2065r = z2;
        }

        public final float a() {
            float f2 = this.f2059l * this.f2056i;
            float hypot = this.f2063p / ((float) Math.hypot(f2, (-this.f2060m) * this.f2055h));
            if (this.f2064q) {
                f2 = -f2;
            }
            return f2 * hypot;
        }

        public final float b() {
            float f2 = this.f2059l * this.f2056i;
            float f3 = (-this.f2060m) * this.f2055h;
            float hypot = this.f2063p / ((float) Math.hypot(f2, f3));
            return this.f2064q ? (-f3) * hypot : f3 * hypot;
        }

        public final void c(float f2) {
            float f3 = (this.f2064q ? this.f2051b - f2 : f2 - this.f2050a) * this.f2058k;
            float f4 = 0.0f;
            if (f3 > 0.0f) {
                f4 = 1.0f;
                if (f3 < 1.0f) {
                    float[] fArr = this.f2057j;
                    float length = f3 * (fArr.length - 1);
                    int i2 = (int) length;
                    float f5 = fArr[i2];
                    f4 = d.a(fArr[i2 + 1], f5, length - i2, f5);
                }
            }
            double d = f4 * 1.5707964f;
            this.f2055h = (float) Math.sin(d);
            this.f2056i = (float) Math.cos(d);
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r8 != 5) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0025, code lost:
    
        if (r6 == 1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a A[LOOP:1: B:13:0x0038->B:14:0x003a, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ArcSpline(int[] r23, float[] r24, float[][] r25) {
        /*
            r22 = this;
            r0 = r24
            r22.<init>()
            int r1 = r0.length
            r2 = 1
            int r1 = r1 - r2
            androidx.compose.animation.core.ArcSpline$Arc[][] r3 = new androidx.compose.animation.core.ArcSpline.Arc[r1]
            r4 = 0
            r6 = r2
            r7 = r6
            r5 = r4
        Le:
            if (r5 >= r1) goto L6b
            r8 = r23[r5]
            r9 = 2
            r10 = 3
            if (r8 == 0) goto L23
            if (r8 == r2) goto L2c
            if (r8 == r9) goto L2a
            if (r8 == r10) goto L25
            r10 = 4
            if (r8 == r10) goto L23
            r10 = 5
            if (r8 == r10) goto L23
            goto L2e
        L23:
            r7 = r10
            goto L2e
        L25:
            if (r6 != r2) goto L2c
            goto L2a
        L28:
            r7 = r6
            goto L2e
        L2a:
            r6 = r9
            goto L28
        L2c:
            r6 = r2
            goto L28
        L2e:
            r8 = r25[r5]
            int r10 = r8.length
            int r10 = r10 / r9
            int r8 = r8.length
            int r8 = r8 % r9
            int r8 = r8 + r10
            androidx.compose.animation.core.ArcSpline$Arc[] r9 = new androidx.compose.animation.core.ArcSpline.Arc[r8]
            r15 = r4
        L38:
            if (r15 >= r8) goto L66
            int r10 = r15 * 2
            androidx.compose.animation.core.ArcSpline$Arc r18 = new androidx.compose.animation.core.ArcSpline$Arc
            r11 = r0[r5]
            int r12 = r5 + 1
            r13 = r0[r12]
            r14 = r25[r5]
            r16 = r14[r10]
            int r17 = r10 + 1
            r19 = r14[r17]
            r12 = r25[r12]
            r20 = r12[r10]
            r17 = r12[r17]
            r10 = r18
            r12 = r13
            r13 = r16
            r14 = r7
            r21 = r15
            r15 = r19
            r16 = r20
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r9[r21] = r18
            int r15 = r21 + 1
            goto L38
        L66:
            r3[r5] = r9
            int r5 = r5 + 1
            goto Le
        L6b:
            r5 = r22
            r5.f2048a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.ArcSpline.<init>(int[], float[], float[][]):void");
    }
}
