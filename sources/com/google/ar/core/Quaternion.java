package com.google.ar.core;

import com.google.ar.core.annotations.UsedByNative;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
@UsedByNative("session_jni_wrapper.cc")
/* loaded from: classes2.dex */
public class Quaternion {

    /* renamed from: a, reason: collision with root package name */
    public static final Quaternion f14273a = new Quaternion();

    /* renamed from: w, reason: collision with root package name */
    @UsedByNative("session_jni_wrapper.cc")
    private float f14274w;

    /* renamed from: x, reason: collision with root package name */
    @UsedByNative("session_jni_wrapper.cc")
    private float f14275x;

    /* renamed from: y, reason: collision with root package name */
    @UsedByNative("session_jni_wrapper.cc")
    private float f14276y;

    /* renamed from: z, reason: collision with root package name */
    @UsedByNative("session_jni_wrapper.cc")
    private float f14277z;

    public Quaternion() {
        this.f14275x = 0.0f;
        this.f14276y = 0.0f;
        this.f14277z = 0.0f;
        this.f14274w = 1.0f;
    }

    /* JADX WARN: Type inference failed for: r3v9, types: [com.google.ar.core.Quaternion, java.lang.Object] */
    public static Quaternion h(Quaternion quaternion, Quaternion quaternion2, float f9) {
        Quaternion quaternion3 = new Quaternion();
        float f10 = (quaternion.f14275x * quaternion2.f14275x) + (quaternion.f14276y * quaternion2.f14276y) + (quaternion.f14277z * quaternion2.f14277z) + (quaternion.f14274w * quaternion2.f14274w);
        if (f10 < 0.0f) {
            ?? obj = new Object();
            ((Quaternion) obj).f14275x = 0.0f;
            ((Quaternion) obj).f14276y = 0.0f;
            ((Quaternion) obj).f14277z = 0.0f;
            ((Quaternion) obj).f14274w = 1.0f;
            float f11 = quaternion2.f14275x;
            float f12 = quaternion2.f14276y;
            float f13 = quaternion2.f14277z;
            float f14 = quaternion2.f14274w;
            f10 = -f10;
            ((Quaternion) obj).f14275x = -f11;
            ((Quaternion) obj).f14276y = -f12;
            ((Quaternion) obj).f14277z = -f13;
            ((Quaternion) obj).f14274w = -f14;
            quaternion2 = obj;
        }
        float f15 = 1.0f - f9;
        float acos = (float) Math.acos(f10);
        float sqrt = (float) Math.sqrt(1.0f - (f10 * f10));
        if (Math.abs(sqrt) > 0.001d) {
            float f16 = 1.0f / sqrt;
            float sin = (float) Math.sin(f15 * acos);
            f9 = ((float) Math.sin(f9 * acos)) * f16;
            f15 = sin * f16;
        }
        quaternion3.f14275x = (quaternion2.f14275x * f9) + (quaternion.f14275x * f15);
        quaternion3.f14276y = (quaternion2.f14276y * f9) + (quaternion.f14276y * f15);
        float f17 = (quaternion2.f14277z * f9) + (quaternion.f14277z * f15);
        quaternion3.f14277z = f17;
        float f18 = (f9 * quaternion2.f14274w) + (f15 * quaternion.f14274w);
        quaternion3.f14274w = f18;
        float f19 = f17 * f17;
        float f20 = f18 * f18;
        float sqrt2 = (float) (1.0d / Math.sqrt(f20 + (f19 + ((r4 * r4) + (r3 * r3)))));
        quaternion3.f14275x *= sqrt2;
        quaternion3.f14276y *= sqrt2;
        quaternion3.f14277z *= sqrt2;
        quaternion3.f14274w *= sqrt2;
        return quaternion3;
    }

    public static void i(Quaternion quaternion, float[] fArr, int i9, float[] fArr2, int i10) {
        float f9 = fArr[i9];
        float f10 = fArr[i9 + 1];
        float f11 = fArr[i9 + 2];
        float f12 = quaternion.f14275x;
        float f13 = quaternion.f14276y;
        float f14 = quaternion.f14277z;
        float f15 = quaternion.f14274w;
        float f16 = f13 * f11;
        float f17 = f14 * f10;
        float f18 = f15 * f10;
        float f19 = f14 * f9;
        float f20 = f12 * f11;
        float f21 = f15 * f11;
        float f22 = f12 * f10;
        float f23 = f13 * f9;
        float f24 = -f12;
        float f25 = f10 * f13;
        float f26 = f11 * f14;
        float f27 = ((f15 * f9) + f16) - f17;
        float f28 = -f14;
        float f29 = -f13;
        float f30 = (f21 + f22) - f23;
        float f31 = (f18 + f19) - f20;
        float f32 = ((f9 * f24) - f25) - f26;
        float f33 = f31 * f28;
        fArr2[i10] = (f33 + ((f32 * f24) + (f27 * f15))) - (f30 * f29);
        fArr2[i10 + 1] = ((f30 * f24) + ((f32 * f29) + (f31 * f15))) - (f27 * f28);
        float f34 = f27 * f29;
        fArr2[i10 + 2] = (f34 + ((f32 * f28) + (f30 * f15))) - (f31 * f24);
    }

    public final float a() {
        return this.f14275x;
    }

    public final float b() {
        return this.f14276y;
    }

    public final float c() {
        return this.f14277z;
    }

    public final float d() {
        return this.f14274w;
    }

    public final void e(float[] fArr, int i9) {
        fArr[i9] = this.f14275x;
        fArr[i9 + 1] = this.f14276y;
        fArr[i9 + 2] = this.f14277z;
        fArr[i9 + 3] = this.f14274w;
    }

    public final Quaternion f() {
        return new Quaternion(-this.f14275x, -this.f14276y, -this.f14277z, this.f14274w);
    }

    public final Quaternion g(Quaternion quaternion) {
        Quaternion quaternion2 = new Quaternion();
        float f9 = this.f14275x;
        float f10 = quaternion.f14274w;
        float f11 = this.f14276y;
        float f12 = quaternion.f14277z;
        float f13 = this.f14277z;
        float f14 = quaternion.f14276y;
        float f15 = this.f14274w;
        quaternion2.f14275x = (((f9 * f10) + (f11 * f12)) - (f13 * f14)) + (quaternion.f14275x * f15);
        float f16 = this.f14275x;
        float f17 = -f16;
        float f18 = quaternion.f14275x;
        quaternion2.f14276y = (f17 * f12) + (f11 * f10) + (f13 * f18) + (f14 * f15);
        float f19 = quaternion.f14276y;
        float f20 = this.f14276y;
        quaternion2.f14277z = ((f16 * f19) - (f20 * f18)) + (f13 * f10) + (f12 * f15);
        quaternion2.f14274w = (((f17 * f18) - (f20 * f19)) - (this.f14277z * quaternion.f14277z)) + (f15 * f10);
        return quaternion2;
    }

    public final void j(float[] fArr, int i9) {
        float f9 = this.f14275x;
        float f10 = this.f14276y;
        float f11 = this.f14277z;
        float f12 = this.f14274w;
        float f13 = (f9 * f9) + (f10 * f10) + (f11 * f11) + (f12 * f12);
        float f14 = 0.0f;
        if (f13 > 0.0f) {
            f14 = 2.0f / f13;
        }
        float f15 = f9 * f14;
        float f16 = f10 * f14;
        float f17 = f14 * f11;
        float f18 = f12 * f15;
        float f19 = f12 * f16;
        float f20 = f12 * f17;
        float f21 = f15 * f9;
        float f22 = f9 * f16;
        float f23 = f9 * f17;
        float f24 = f16 * f10;
        float f25 = f10 * f17;
        float f26 = f11 * f17;
        fArr[i9] = 1.0f - (f24 + f26);
        fArr[i9 + 4] = f22 - f20;
        fArr[i9 + 8] = f23 + f19;
        fArr[i9 + 1] = f22 + f20;
        fArr[i9 + 5] = 1.0f - (f26 + f21);
        fArr[i9 + 9] = f25 - f18;
        fArr[i9 + 2] = f23 - f19;
        fArr[i9 + 6] = f25 + f18;
        fArr[i9 + 10] = 1.0f - (f21 + f24);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "[%.3f, %.3f, %.3f, %.3f]", Float.valueOf(this.f14275x), Float.valueOf(this.f14276y), Float.valueOf(this.f14277z), Float.valueOf(this.f14274w));
    }

    @UsedByNative("session_jni_wrapper.cc")
    public Quaternion(float f9, float f10, float f11, float f12) {
        this.f14275x = f9;
        this.f14276y = f10;
        this.f14277z = f11;
        this.f14274w = f12;
    }
}
