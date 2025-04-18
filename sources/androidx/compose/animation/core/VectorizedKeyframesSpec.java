package androidx.compose.animation.core;

import android.support.v4.media.d;
import androidx.collection.IntList;
import androidx.collection.IntObjectMap;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.ArcSpline;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes4.dex */
public final class VectorizedKeyframesSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {

    /* renamed from: a, reason: collision with root package name */
    public final IntList f2380a;

    /* renamed from: b, reason: collision with root package name */
    public final IntObjectMap f2381b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2382c;
    public final Easing e;

    /* renamed from: g, reason: collision with root package name */
    public int[] f2384g;

    /* renamed from: h, reason: collision with root package name */
    public float[] f2385h;

    /* renamed from: i, reason: collision with root package name */
    public AnimationVector f2386i;

    /* renamed from: j, reason: collision with root package name */
    public AnimationVector f2387j;

    /* renamed from: k, reason: collision with root package name */
    public AnimationVector f2388k;

    /* renamed from: l, reason: collision with root package name */
    public AnimationVector f2389l;

    /* renamed from: m, reason: collision with root package name */
    public float[] f2390m;

    /* renamed from: n, reason: collision with root package name */
    public float[] f2391n;

    /* renamed from: o, reason: collision with root package name */
    public ArcSpline f2392o;
    public final int d = 0;

    /* renamed from: f, reason: collision with root package name */
    public final int f2383f = 0;

    public VectorizedKeyframesSpec(MutableIntList mutableIntList, MutableIntObjectMap mutableIntObjectMap, int i2, a aVar) {
        this.f2380a = mutableIntList;
        this.f2381b = mutableIntObjectMap;
        this.f2382c = i2;
        this.e = aVar;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public final int c() {
        return this.d;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public final int e() {
        return this.f2382c;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector f(long j2, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        long a2 = VectorizedAnimationSpecKt.a(this, j2 / 1000000);
        if (a2 < 0) {
            return animationVector3;
        }
        i(animationVector, animationVector2, animationVector3);
        int i2 = 0;
        if (this.f2392o == null) {
            AnimationVector g2 = g((a2 - 1) * 1000000, animationVector, animationVector2, animationVector3);
            AnimationVector g3 = g(a2 * 1000000, animationVector, animationVector2, animationVector3);
            int b2 = g2.b();
            while (i2 < b2) {
                AnimationVector animationVector4 = this.f2387j;
                if (animationVector4 == null) {
                    p0.a.B0("velocityVector");
                    throw null;
                }
                animationVector4.e((g2.a(i2) - g3.a(i2)) * 1000.0f, i2);
                i2++;
            }
            AnimationVector animationVector5 = this.f2387j;
            if (animationVector5 != null) {
                return animationVector5;
            }
            p0.a.B0("velocityVector");
            throw null;
        }
        int i3 = (int) a2;
        int a3 = IntListExtensionKt.a(this.f2380a, i3);
        if (a3 < -1) {
            a3 = -(a3 + 2);
        }
        float h2 = h(a3, i3, false);
        ArcSpline arcSpline = this.f2392o;
        if (arcSpline == null) {
            p0.a.B0("arcSpline");
            throw null;
        }
        float[] fArr = this.f2391n;
        if (fArr == null) {
            p0.a.B0("slopeArray");
            throw null;
        }
        ArcSpline.Arc[][] arcArr = arcSpline.f2048a;
        float f2 = arcArr[0][0].f2050a;
        if (h2 < f2) {
            h2 = f2;
        } else if (h2 > arcArr[arcArr.length - 1][0].f2051b) {
            h2 = arcArr[arcArr.length - 1][0].f2051b;
        }
        int length = arcArr.length;
        boolean z2 = false;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = 0;
            int i6 = 0;
            while (i5 < fArr.length) {
                ArcSpline.Arc arc = arcArr[i4][i6];
                if (h2 <= arc.f2051b) {
                    if (arc.f2065r) {
                        fArr[i5] = arc.f2061n;
                        fArr[i5 + 1] = arc.f2062o;
                    } else {
                        arc.c(h2);
                        fArr[i5] = arcArr[i4][i6].a();
                        fArr[i5 + 1] = arcArr[i4][i6].b();
                    }
                    z2 = true;
                }
                i5 += 2;
                i6++;
            }
            if (z2) {
                break;
            }
        }
        float[] fArr2 = this.f2391n;
        if (fArr2 == null) {
            p0.a.B0("slopeArray");
            throw null;
        }
        int length2 = fArr2.length;
        while (i2 < length2) {
            AnimationVector animationVector6 = this.f2387j;
            if (animationVector6 == null) {
                p0.a.B0("velocityVector");
                throw null;
            }
            float[] fArr3 = this.f2391n;
            if (fArr3 == null) {
                p0.a.B0("slopeArray");
                throw null;
            }
            animationVector6.e(fArr3[i2], i2);
            i2++;
        }
        AnimationVector animationVector7 = this.f2387j;
        if (animationVector7 != null) {
            return animationVector7;
        }
        p0.a.B0("velocityVector");
        throw null;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector g(long j2, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        int i2;
        AnimationVector animationVector4 = animationVector;
        AnimationVector animationVector5 = animationVector2;
        int a2 = (int) VectorizedAnimationSpecKt.a(this, j2 / 1000000);
        IntObjectMap intObjectMap = this.f2381b;
        if (intObjectMap.a(a2)) {
            Object c2 = intObjectMap.c(a2);
            p0.a.p(c2);
            return ((VectorizedKeyframeSpecElementInfo) c2).f2377a;
        }
        if (a2 >= this.f2382c) {
            return animationVector5;
        }
        if (a2 <= 0) {
            return animationVector4;
        }
        i(animationVector4, animationVector5, animationVector3);
        ArcSpline arcSpline = this.f2392o;
        int i3 = 0;
        IntList intList = this.f2380a;
        if (arcSpline == null) {
            int a3 = IntListExtensionKt.a(intList, a2);
            if (a3 < -1) {
                a3 = -(a3 + 2);
            }
            float h2 = h(a3, a2, true);
            int a4 = intList.a(a3);
            if (intObjectMap.a(a4)) {
                Object c3 = intObjectMap.c(a4);
                p0.a.p(c3);
                animationVector4 = ((VectorizedKeyframeSpecElementInfo) c3).f2377a;
            }
            int a5 = intList.a(a3 + 1);
            if (intObjectMap.a(a5)) {
                Object c4 = intObjectMap.c(a5);
                p0.a.p(c4);
                animationVector5 = ((VectorizedKeyframeSpecElementInfo) c4).f2377a;
            }
            AnimationVector animationVector6 = this.f2386i;
            if (animationVector6 == null) {
                p0.a.B0("valueVector");
                throw null;
            }
            int b2 = animationVector6.b();
            for (int i4 = 0; i4 < b2; i4++) {
                AnimationVector animationVector7 = this.f2386i;
                if (animationVector7 == null) {
                    p0.a.B0("valueVector");
                    throw null;
                }
                float a6 = animationVector4.a(i4);
                float a7 = animationVector5.a(i4);
                TwoWayConverter twoWayConverter = VectorConvertersKt.f2340a;
                animationVector7.e((a7 * h2) + ((1 - h2) * a6), i4);
            }
            AnimationVector animationVector8 = this.f2386i;
            if (animationVector8 != null) {
                return animationVector8;
            }
            p0.a.B0("valueVector");
            throw null;
        }
        int a8 = IntListExtensionKt.a(intList, a2);
        if (a8 < -1) {
            a8 = -(a8 + 2);
        }
        float h3 = h(a8, a2, false);
        ArcSpline arcSpline2 = this.f2392o;
        if (arcSpline2 == null) {
            p0.a.B0("arcSpline");
            throw null;
        }
        float[] fArr = this.f2390m;
        if (fArr == null) {
            p0.a.B0("posArray");
            throw null;
        }
        ArcSpline.Arc[][] arcArr = arcSpline2.f2048a;
        float f2 = arcArr[0][0].f2050a;
        if (h3 < f2 || h3 > arcArr[arcArr.length - 1][0].f2051b) {
            if (h3 > arcArr[arcArr.length - 1][0].f2051b) {
                i2 = arcArr.length - 1;
                f2 = arcArr[arcArr.length - 1][0].f2051b;
            } else {
                i2 = 0;
            }
            float f3 = h3 - f2;
            int i5 = 0;
            int i6 = 0;
            while (i5 < fArr.length) {
                ArcSpline.Arc arc = arcArr[i2][i6];
                if (arc.f2065r) {
                    float f4 = arc.f2050a;
                    float f5 = arc.f2058k;
                    float f6 = arc.e;
                    float f7 = arc.f2052c;
                    fArr[i5] = (arc.f2061n * f3) + d.a(f6, f7, (f2 - f4) * f5, f7);
                    float f8 = (f2 - f4) * f5;
                    float f9 = arc.f2053f;
                    float f10 = arc.d;
                    fArr[i5 + 1] = (arc.f2062o * f3) + d.a(f9, f10, f8, f10);
                } else {
                    arc.c(f2);
                    ArcSpline.Arc arc2 = arcArr[i2][i6];
                    fArr[i5] = (arc2.a() * f3) + (arc2.f2059l * arc2.f2055h) + arc2.f2061n;
                    ArcSpline.Arc arc3 = arcArr[i2][i6];
                    fArr[i5 + 1] = (arc3.b() * f3) + (arc3.f2060m * arc3.f2056i) + arc3.f2062o;
                }
                i5 += 2;
                i6++;
            }
        } else {
            int length = arcArr.length;
            int i7 = 0;
            boolean z2 = false;
            while (i7 < length) {
                int i8 = i3;
                int i9 = i8;
                while (i8 < fArr.length) {
                    ArcSpline.Arc arc4 = arcArr[i7][i9];
                    if (h3 <= arc4.f2051b) {
                        if (arc4.f2065r) {
                            float f11 = arc4.f2050a;
                            float f12 = arc4.f2058k;
                            float f13 = arc4.e;
                            float f14 = arc4.f2052c;
                            fArr[i8] = d.a(f13, f14, (h3 - f11) * f12, f14);
                            float f15 = (h3 - f11) * f12;
                            float f16 = arc4.f2053f;
                            float f17 = arc4.d;
                            fArr[i8 + 1] = d.a(f16, f17, f15, f17);
                        } else {
                            arc4.c(h3);
                            ArcSpline.Arc arc5 = arcArr[i7][i9];
                            fArr[i8] = (arc5.f2059l * arc5.f2055h) + arc5.f2061n;
                            fArr[i8 + 1] = (arc5.f2060m * arc5.f2056i) + arc5.f2062o;
                        }
                        z2 = true;
                    }
                    i8 += 2;
                    i9++;
                }
                if (z2) {
                    break;
                }
                i7++;
                i3 = 0;
            }
        }
        float[] fArr2 = this.f2390m;
        if (fArr2 == null) {
            p0.a.B0("posArray");
            throw null;
        }
        int length2 = fArr2.length;
        for (int i10 = 0; i10 < length2; i10++) {
            AnimationVector animationVector9 = this.f2386i;
            if (animationVector9 == null) {
                p0.a.B0("valueVector");
                throw null;
            }
            float[] fArr3 = this.f2390m;
            if (fArr3 == null) {
                p0.a.B0("posArray");
                throw null;
            }
            animationVector9.e(fArr3[i10], i10);
        }
        AnimationVector animationVector10 = this.f2386i;
        if (animationVector10 != null) {
            return animationVector10;
        }
        p0.a.B0("valueVector");
        throw null;
    }

    public final float h(int i2, int i3, boolean z2) {
        Easing easing;
        float f2;
        IntList intList = this.f2380a;
        if (i2 >= intList.f1434b - 1) {
            f2 = i3;
        } else {
            int a2 = intList.a(i2);
            int a3 = intList.a(i2 + 1);
            if (i3 == a2) {
                f2 = a2;
            } else {
                int i4 = a3 - a2;
                VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo = (VectorizedKeyframeSpecElementInfo) this.f2381b.c(a2);
                if (vectorizedKeyframeSpecElementInfo == null || (easing = vectorizedKeyframeSpecElementInfo.f2378b) == null) {
                    easing = this.e;
                }
                float f3 = i4;
                float b2 = easing.b((i3 - a2) / f3);
                if (z2) {
                    return b2;
                }
                f2 = (f3 * b2) + a2;
            }
        }
        return f2 / ((float) 1000);
    }

    public final void i(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        float[] fArr;
        float[] fArr2;
        boolean z2 = this.f2392o != null;
        AnimationVector animationVector4 = this.f2386i;
        IntObjectMap intObjectMap = this.f2381b;
        IntList intList = this.f2380a;
        if (animationVector4 == null) {
            AnimationVector c2 = animationVector.c();
            p0.a.q(c2, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
            this.f2386i = c2;
            AnimationVector c3 = animationVector3.c();
            p0.a.q(c3, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
            this.f2387j = c3;
            int i2 = intList.f1434b;
            float[] fArr3 = new float[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                fArr3[i3] = intList.a(i3) / ((float) 1000);
            }
            this.f2385h = fArr3;
            int i4 = intList.f1434b;
            int[] iArr = new int[i4];
            for (int i5 = 0; i5 < i4; i5++) {
                VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo = (VectorizedKeyframeSpecElementInfo) intObjectMap.c(intList.a(i5));
                int i6 = vectorizedKeyframeSpecElementInfo != null ? vectorizedKeyframeSpecElementInfo.f2379c : this.f2383f;
                if (i6 != 0) {
                    z2 = true;
                }
                iArr[i5] = i6;
            }
            this.f2384g = iArr;
        }
        if (z2) {
            if (this.f2392o != null) {
                AnimationVector animationVector5 = this.f2388k;
                if (animationVector5 == null) {
                    p0.a.B0("lastInitialValue");
                    throw null;
                }
                if (p0.a.g(animationVector5, animationVector)) {
                    AnimationVector animationVector6 = this.f2389l;
                    if (animationVector6 == null) {
                        p0.a.B0("lastTargetValue");
                        throw null;
                    }
                    if (p0.a.g(animationVector6, animationVector2)) {
                        return;
                    }
                }
            }
            this.f2388k = animationVector;
            this.f2389l = animationVector2;
            int b2 = animationVector.b() + (animationVector.b() % 2);
            this.f2390m = new float[b2];
            this.f2391n = new float[b2];
            int i7 = intList.f1434b;
            float[][] fArr4 = new float[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                int a2 = intList.a(i8);
                if (a2 != 0) {
                    if (a2 != this.f2382c) {
                        fArr = new float[b2];
                        Object c4 = intObjectMap.c(a2);
                        p0.a.p(c4);
                        VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo2 = (VectorizedKeyframeSpecElementInfo) c4;
                        for (int i9 = 0; i9 < b2; i9++) {
                            fArr[i9] = vectorizedKeyframeSpecElementInfo2.f2377a.a(i9);
                        }
                    } else if (intObjectMap.a(a2)) {
                        fArr = new float[b2];
                        Object c5 = intObjectMap.c(a2);
                        p0.a.p(c5);
                        VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo3 = (VectorizedKeyframeSpecElementInfo) c5;
                        for (int i10 = 0; i10 < b2; i10++) {
                            fArr[i10] = vectorizedKeyframeSpecElementInfo3.f2377a.a(i10);
                        }
                    } else {
                        fArr2 = new float[b2];
                        for (int i11 = 0; i11 < b2; i11++) {
                            fArr2[i11] = animationVector2.a(i11);
                        }
                    }
                    fArr2 = fArr;
                } else if (intObjectMap.a(a2)) {
                    fArr = new float[b2];
                    Object c6 = intObjectMap.c(a2);
                    p0.a.p(c6);
                    VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo4 = (VectorizedKeyframeSpecElementInfo) c6;
                    for (int i12 = 0; i12 < b2; i12++) {
                        fArr[i12] = vectorizedKeyframeSpecElementInfo4.f2377a.a(i12);
                    }
                    fArr2 = fArr;
                } else {
                    fArr2 = new float[b2];
                    for (int i13 = 0; i13 < b2; i13++) {
                        fArr2[i13] = animationVector.a(i13);
                    }
                }
                fArr4[i8] = fArr2;
            }
            int[] iArr2 = this.f2384g;
            if (iArr2 == null) {
                p0.a.B0("modes");
                throw null;
            }
            float[] fArr5 = this.f2385h;
            if (fArr5 == null) {
                p0.a.B0("times");
                throw null;
            }
            this.f2392o = new ArcSpline(iArr2, fArr5, fArr4);
        }
    }
}
