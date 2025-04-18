package androidx.core.content.res;

import androidx.annotation.RestrictTo;
import java.util.ArrayList;

@RestrictTo
/* loaded from: classes2.dex */
final class GradientColorInflaterCompat {

    /* loaded from: classes2.dex */
    public static final class ColorStops {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f18501a;

        /* renamed from: b, reason: collision with root package name */
        public final float[] f18502b;

        public ColorStops(ArrayList arrayList, ArrayList arrayList2) {
            int size = arrayList.size();
            this.f18501a = new int[size];
            this.f18502b = new float[size];
            for (int i2 = 0; i2 < size; i2++) {
                this.f18501a[i2] = ((Integer) arrayList.get(i2)).intValue();
                this.f18502b[i2] = ((Float) arrayList2.get(i2)).floatValue();
            }
        }

        public ColorStops(int i2, int i3) {
            this.f18501a = new int[]{i2, i3};
            this.f18502b = new float[]{0.0f, 1.0f};
        }

        public ColorStops(int i2, int i3, int i4) {
            this.f18501a = new int[]{i2, i3, i4};
            this.f18502b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
