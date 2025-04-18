package androidx.compose.ui;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;

@Immutable
/* loaded from: classes3.dex */
public final class BiasAlignment implements Alignment {

    /* renamed from: b, reason: collision with root package name */
    public final float f14675b;

    /* renamed from: c, reason: collision with root package name */
    public final float f14676c;

    @Immutable
    /* loaded from: classes3.dex */
    public static final class Horizontal implements Alignment.Horizontal {

        /* renamed from: a, reason: collision with root package name */
        public final float f14677a;

        public Horizontal(float f2) {
            this.f14677a = f2;
        }

        @Override // androidx.compose.ui.Alignment.Horizontal
        public final int a(int i2, int i3, LayoutDirection layoutDirection) {
            float f2 = (i3 - i2) / 2.0f;
            LayoutDirection layoutDirection2 = LayoutDirection.f17494a;
            float f3 = this.f14677a;
            if (layoutDirection != layoutDirection2) {
                f3 *= -1;
            }
            return Math.round((1 + f3) * f2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Horizontal) && Float.compare(this.f14677a, ((Horizontal) obj).f14677a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f14677a);
        }

        public final String toString() {
            return d.n(new StringBuilder("Horizontal(bias="), this.f14677a, ')');
        }
    }

    @Immutable
    /* loaded from: classes3.dex */
    public static final class Vertical implements Alignment.Vertical {

        /* renamed from: a, reason: collision with root package name */
        public final float f14678a;

        public Vertical(float f2) {
            this.f14678a = f2;
        }

        @Override // androidx.compose.ui.Alignment.Vertical
        public final int a(int i2, int i3) {
            return Math.round((1 + this.f14678a) * ((i3 - i2) / 2.0f));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Vertical) && Float.compare(this.f14678a, ((Vertical) obj).f14678a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f14678a);
        }

        public final String toString() {
            return d.n(new StringBuilder("Vertical(bias="), this.f14678a, ')');
        }
    }

    public BiasAlignment(float f2, float f3) {
        this.f14675b = f2;
        this.f14676c = f3;
    }

    @Override // androidx.compose.ui.Alignment
    public final long a(long j2, long j3, LayoutDirection layoutDirection) {
        float f2 = (((int) (j3 >> 32)) - ((int) (j2 >> 32))) / 2.0f;
        float f3 = (((int) (j3 & 4294967295L)) - ((int) (j2 & 4294967295L))) / 2.0f;
        LayoutDirection layoutDirection2 = LayoutDirection.f17494a;
        float f4 = this.f14675b;
        if (layoutDirection != layoutDirection2) {
            f4 *= -1;
        }
        float f5 = 1;
        return IntOffsetKt.a(Math.round((f4 + f5) * f2), Math.round((f5 + this.f14676c) * f3));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiasAlignment)) {
            return false;
        }
        BiasAlignment biasAlignment = (BiasAlignment) obj;
        return Float.compare(this.f14675b, biasAlignment.f14675b) == 0 && Float.compare(this.f14676c, biasAlignment.f14676c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f14676c) + (Float.hashCode(this.f14675b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.f14675b);
        sb.append(", verticalBias=");
        return d.n(sb, this.f14676c, ')');
    }
}
