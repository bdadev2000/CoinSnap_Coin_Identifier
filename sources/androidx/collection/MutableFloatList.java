package androidx.collection;

import java.util.Arrays;
import p0.a;

/* loaded from: classes2.dex */
public final class MutableFloatList extends FloatList {
    public MutableFloatList(int i2) {
        this.f1410a = i2 == 0 ? FloatSetKt.f1422a : new float[i2];
    }

    public final void b(float f2) {
        int i2 = this.f1411b + 1;
        float[] fArr = this.f1410a;
        if (fArr.length < i2) {
            float[] copyOf = Arrays.copyOf(fArr, Math.max(i2, (fArr.length * 3) / 2));
            a.r(copyOf, "copyOf(this, newSize)");
            this.f1410a = copyOf;
        }
        float[] fArr2 = this.f1410a;
        int i3 = this.f1411b;
        fArr2[i3] = f2;
        this.f1411b = i3 + 1;
    }
}
