package androidx.compose.foundation.layout;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import q0.p;

@Immutable
/* loaded from: classes.dex */
public final class Arrangement {

    /* renamed from: a, reason: collision with root package name */
    public static final Arrangement$Start$1 f3772a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Arrangement$End$1 f3773b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final Arrangement$Top$1 f3774c = new Object();
    public static final Arrangement$Bottom$1 d = new Object();
    public static final Arrangement$Center$1 e = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$Center$1

        /* renamed from: a, reason: collision with root package name */
        public final float f3780a = 0;

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        public final float a() {
            return this.f3780a;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public final void b(Density density, int i2, int[] iArr, int[] iArr2) {
            Arrangement.a(i2, iArr, iArr2, false);
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public final void c(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.f17494a) {
                Arrangement.a(i2, iArr, iArr2, false);
            } else {
                Arrangement.a(i2, iArr, iArr2, true);
            }
        }

        public final String toString() {
            return "Arrangement#Center";
        }
    };

    /* renamed from: f, reason: collision with root package name */
    public static final Arrangement$SpaceEvenly$1 f3775f = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$SpaceEvenly$1

        /* renamed from: a, reason: collision with root package name */
        public final float f3783a = 0;

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        public final float a() {
            return this.f3783a;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public final void b(Density density, int i2, int[] iArr, int[] iArr2) {
            Arrangement.f(i2, iArr, iArr2, false);
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public final void c(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.f17494a) {
                Arrangement.f(i2, iArr, iArr2, false);
            } else {
                Arrangement.f(i2, iArr, iArr2, true);
            }
        }

        public final String toString() {
            return "Arrangement#SpaceEvenly";
        }
    };

    /* renamed from: g, reason: collision with root package name */
    public static final Arrangement$SpaceBetween$1 f3776g = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$SpaceBetween$1

        /* renamed from: a, reason: collision with root package name */
        public final float f3782a = 0;

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        public final float a() {
            return this.f3782a;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public final void b(Density density, int i2, int[] iArr, int[] iArr2) {
            Arrangement.e(i2, iArr, iArr2, false);
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public final void c(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.f17494a) {
                Arrangement.e(i2, iArr, iArr2, false);
            } else {
                Arrangement.e(i2, iArr, iArr2, true);
            }
        }

        public final String toString() {
            return "Arrangement#SpaceBetween";
        }
    };

    /* renamed from: h, reason: collision with root package name */
    public static final Arrangement$SpaceAround$1 f3777h = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$SpaceAround$1

        /* renamed from: a, reason: collision with root package name */
        public final float f3781a = 0;

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        public final float a() {
            return this.f3781a;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public final void b(Density density, int i2, int[] iArr, int[] iArr2) {
            Arrangement.d(i2, iArr, iArr2, false);
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public final void c(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.f17494a) {
                Arrangement.d(i2, iArr, iArr2, false);
            } else {
                Arrangement.d(i2, iArr, iArr2, true);
            }
        }

        public final String toString() {
            return "Arrangement#SpaceAround";
        }
    };

    @Immutable
    /* loaded from: classes.dex */
    public static final class Absolute {

        /* renamed from: a, reason: collision with root package name */
        public static final Arrangement$Absolute$Left$1 f3778a = new Object();

        /* renamed from: b, reason: collision with root package name */
        public static final Arrangement$Absolute$Right$1 f3779b = new Object();
    }

    @Stable
    /* loaded from: classes.dex */
    public interface Horizontal {

        /* loaded from: classes.dex */
        public static final class DefaultImpls {
        }

        default float a() {
            return 0;
        }

        void c(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2);
    }

    @Stable
    /* loaded from: classes.dex */
    public interface HorizontalOrVertical extends Horizontal, Vertical {

        /* loaded from: classes.dex */
        public static final class DefaultImpls {
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        default float a() {
            return 0;
        }
    }

    @Immutable
    /* loaded from: classes.dex */
    public static final class SpacedAligned implements HorizontalOrVertical {

        /* renamed from: a, reason: collision with root package name */
        public final float f3784a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f3785b;

        /* renamed from: c, reason: collision with root package name */
        public final p f3786c;
        public final float d;

        public SpacedAligned(float f2, boolean z2, p pVar) {
            this.f3784a = f2;
            this.f3785b = z2;
            this.f3786c = pVar;
            this.d = f2;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        public final float a() {
            return this.d;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public final void b(Density density, int i2, int[] iArr, int[] iArr2) {
            c(density, i2, iArr, LayoutDirection.f17494a, iArr2);
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public final void c(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            int i3;
            int i4;
            if (iArr.length == 0) {
                return;
            }
            int F0 = density.F0(this.f3784a);
            boolean z2 = this.f3785b && layoutDirection == LayoutDirection.f17495b;
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f3772a;
            if (z2) {
                i3 = 0;
                i4 = 0;
                for (int length = iArr.length - 1; -1 < length; length--) {
                    int i5 = iArr[length];
                    int min = Math.min(i3, i2 - i5);
                    iArr2[length] = min;
                    i4 = Math.min(F0, (i2 - min) - i5);
                    i3 = iArr2[length] + i5 + i4;
                }
            } else {
                int length2 = iArr.length;
                int i6 = 0;
                i3 = 0;
                i4 = 0;
                int i7 = 0;
                while (i6 < length2) {
                    int i8 = iArr[i6];
                    int min2 = Math.min(i3, i2 - i8);
                    iArr2[i7] = min2;
                    int min3 = Math.min(F0, (i2 - min2) - i8);
                    int i9 = iArr2[i7] + i8 + min3;
                    i6++;
                    i7++;
                    i4 = min3;
                    i3 = i9;
                }
            }
            int i10 = i3 - i4;
            p pVar = this.f3786c;
            if (pVar == null || i10 >= i2) {
                return;
            }
            int intValue = ((Number) pVar.invoke(Integer.valueOf(i2 - i10), layoutDirection)).intValue();
            int length3 = iArr2.length;
            for (int i11 = 0; i11 < length3; i11++) {
                iArr2[i11] = iArr2[i11] + intValue;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SpacedAligned)) {
                return false;
            }
            SpacedAligned spacedAligned = (SpacedAligned) obj;
            return Dp.a(this.f3784a, spacedAligned.f3784a) && this.f3785b == spacedAligned.f3785b && p0.a.g(this.f3786c, spacedAligned.f3786c);
        }

        public final int hashCode() {
            int g2 = d.g(this.f3785b, Float.hashCode(this.f3784a) * 31, 31);
            p pVar = this.f3786c;
            return g2 + (pVar == null ? 0 : pVar.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f3785b ? "" : "Absolute");
            sb.append("Arrangement#spacedAligned(");
            sb.append((Object) Dp.b(this.f3784a));
            sb.append(", ");
            sb.append(this.f3786c);
            sb.append(')');
            return sb.toString();
        }
    }

    @Stable
    /* loaded from: classes.dex */
    public interface Vertical {

        /* loaded from: classes.dex */
        public static final class DefaultImpls {
        }

        default float a() {
            return 0;
        }

        void b(Density density, int i2, int[] iArr, int[] iArr2);
    }

    public static void a(int i2, int[] iArr, int[] iArr2, boolean z2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float f2 = (i2 - i4) / 2;
        if (!z2) {
            int length = iArr.length;
            int i6 = 0;
            while (i3 < length) {
                int i7 = iArr[i3];
                iArr2[i6] = Math.round(f2);
                f2 += i7;
                i3++;
                i6++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i8 = iArr[length2];
            iArr2[length2] = Math.round(f2);
            f2 += i8;
        }
    }

    public static void b(int[] iArr, int[] iArr2, boolean z2) {
        int i2 = 0;
        if (!z2) {
            int length = iArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i2 < length) {
                int i5 = iArr[i2];
                iArr2[i3] = i4;
                i4 += i5;
                i2++;
                i3++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i6 = iArr[length2];
            iArr2[length2] = i2;
            i2 += i6;
        }
    }

    public static void c(int i2, int[] iArr, int[] iArr2, boolean z2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        int i6 = i2 - i4;
        if (!z2) {
            int length = iArr.length;
            int i7 = 0;
            while (i3 < length) {
                int i8 = iArr[i3];
                iArr2[i7] = i6;
                i6 += i8;
                i3++;
                i7++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i9 = iArr[length2];
            iArr2[length2] = i6;
            i6 += i9;
        }
    }

    public static void d(int i2, int[] iArr, int[] iArr2, boolean z2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float length = (iArr.length == 0) ^ true ? (i2 - i4) / iArr.length : 0.0f;
        float f2 = length / 2;
        if (z2) {
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i6 = iArr[length2];
                iArr2[length2] = Math.round(f2);
                f2 += i6 + length;
            }
            return;
        }
        int length3 = iArr.length;
        int i7 = 0;
        while (i3 < length3) {
            int i8 = iArr[i3];
            iArr2[i7] = Math.round(f2);
            f2 += i8 + length;
            i3++;
            i7++;
        }
    }

    public static void e(int i2, int[] iArr, int[] iArr2, boolean z2) {
        if (iArr.length == 0) {
            return;
        }
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float max = (i2 - i4) / Math.max(iArr.length - 1, 1);
        float f2 = (z2 && iArr.length == 1) ? max : 0.0f;
        if (z2) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i6 = iArr[length];
                iArr2[length] = Math.round(f2);
                f2 += i6 + max;
            }
            return;
        }
        int length2 = iArr.length;
        int i7 = 0;
        while (i3 < length2) {
            int i8 = iArr[i3];
            iArr2[i7] = Math.round(f2);
            f2 += i8 + max;
            i3++;
            i7++;
        }
    }

    public static void f(int i2, int[] iArr, int[] iArr2, boolean z2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float length = (i2 - i4) / (iArr.length + 1);
        if (z2) {
            float f2 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i6 = iArr[length2];
                iArr2[length2] = Math.round(f2);
                f2 += i6 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f3 = length;
        int i7 = 0;
        while (i3 < length3) {
            int i8 = iArr[i3];
            iArr2[i7] = Math.round(f3);
            f3 += i8 + length;
            i3++;
            i7++;
        }
    }

    public static SpacedAligned g(float f2) {
        return new SpacedAligned(f2, true, Arrangement$spacedBy$1.f3787a);
    }

    public static SpacedAligned h(float f2) {
        return new SpacedAligned(f2, true, new Arrangement$spacedBy$2());
    }
}
