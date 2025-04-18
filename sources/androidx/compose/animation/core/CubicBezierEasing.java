package androidx.compose.animation.core;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.BezierKt;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

@Immutable
/* loaded from: classes3.dex */
public final class CubicBezierEasing implements Easing {

    /* renamed from: b, reason: collision with root package name */
    public final float f2068b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2069c;
    public final float d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final float f2070f;

    /* renamed from: g, reason: collision with root package name */
    public final float f2071g;

    public CubicBezierEasing(float f2, float f3, float f4, float f5) {
        int a2;
        this.f2068b = f2;
        this.f2069c = f3;
        this.d = f4;
        this.e = f5;
        if (Float.isNaN(f2) || Float.isNaN(f3) || Float.isNaN(f4) || Float.isNaN(f5)) {
            throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f2 + ", " + f3 + ", " + f4 + ", " + f5 + '.');
        }
        float[] fArr = new float[5];
        float f6 = (f3 - 0.0f) * 3.0f;
        float f7 = (f5 - f3) * 3.0f;
        float f8 = (1.0f - f5) * 3.0f;
        double d = f6;
        double d2 = f7;
        double d3 = f8;
        double d4 = d2 * 2.0d;
        double d5 = (d - d4) + d3;
        if (d5 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            a2 = d2 == d3 ? 0 : BezierKt.a((float) ((d4 - d3) / (d4 - (d3 * 2.0d))), fArr, 0);
        } else {
            double d6 = -Math.sqrt((d2 * d2) - (d3 * d));
            double d7 = (-d) + d2;
            int a3 = BezierKt.a((float) ((-(d6 + d7)) / d5), fArr, 0);
            a2 = BezierKt.a((float) ((d6 - d7) / d5), fArr, a3) + a3;
            if (a2 > 1) {
                float f9 = fArr[0];
                float f10 = fArr[1];
                if (f9 > f10) {
                    fArr[0] = f10;
                    fArr[1] = f9;
                } else if (f9 == f10) {
                    a2--;
                }
            }
        }
        float f11 = (f7 - f6) * 2.0f;
        int a4 = BezierKt.a((-f11) / (((f8 - f7) * 2.0f) - f11), fArr, a2) + a2;
        float min = Math.min(0.0f, 1.0f);
        float max = Math.max(0.0f, 1.0f);
        for (int i2 = 0; i2 < a4; i2++) {
            float f12 = fArr[i2];
            float f13 = (((((((((f3 - f5) * 3.0f) + 1.0f) - 0.0f) * f12) + (((f5 - (f3 * 2.0f)) + 0.0f) * 3.0f)) * f12) + f6) * f12) + 0.0f;
            min = Math.min(min, f13);
            max = Math.max(max, f13);
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(min) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
        this.f2070f = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
        this.f2071g = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x01e7, code lost:
    
        if (r2 >= (-8.34465E-7f)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01f3, code lost:
    
        if (r2 <= 1.0000008f) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0213, code lost:
    
        if (r2 >= (-8.34465E-7f)) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0215, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0220, code lost:
    
        if (r2 <= 1.0000008f) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0071, code lost:
    
        if (r2 >= (-8.34465E-7f)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0073, code lost:
    
        r2 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
    
        if (r2 <= 1.0000008f) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
    
        r2 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c9, code lost:
    
        if (r2 >= (-8.34465E-7f)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d4, code lost:
    
        if (r2 <= 1.0000008f) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x019f, code lost:
    
        if (r2 >= (-8.34465E-7f)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01ab, code lost:
    
        if (r2 <= 1.0000008f) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0188  */
    @Override // androidx.compose.animation.core.Easing
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float b(float r26) {
        /*
            Method dump skipped, instructions count: 641
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.CubicBezierEasing.b(float):float");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CubicBezierEasing) {
            CubicBezierEasing cubicBezierEasing = (CubicBezierEasing) obj;
            if (this.f2068b == cubicBezierEasing.f2068b && this.f2069c == cubicBezierEasing.f2069c && this.d == cubicBezierEasing.d && this.e == cubicBezierEasing.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + d.b(this.d, d.b(this.f2069c, Float.hashCode(this.f2068b) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CubicBezierEasing(a=");
        sb.append(this.f2068b);
        sb.append(", b=");
        sb.append(this.f2069c);
        sb.append(", c=");
        sb.append(this.d);
        sb.append(", d=");
        return d.n(sb, this.e, ')');
    }
}
