package androidx.compose.ui;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;

@Immutable
/* loaded from: classes2.dex */
public final class BiasAbsoluteAlignment implements Alignment {

    /* renamed from: b, reason: collision with root package name */
    public final float f14672b;

    /* renamed from: c, reason: collision with root package name */
    public final float f14673c = -1.0f;

    @Immutable
    /* loaded from: classes2.dex */
    public static final class Horizontal implements Alignment.Horizontal {

        /* renamed from: a, reason: collision with root package name */
        public final float f14674a;

        public Horizontal(float f2) {
            this.f14674a = f2;
        }

        @Override // androidx.compose.ui.Alignment.Horizontal
        public final int a(int i2, int i3, LayoutDirection layoutDirection) {
            return Math.round((1 + this.f14674a) * ((i3 - i2) / 2.0f));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Horizontal) && Float.compare(this.f14674a, ((Horizontal) obj).f14674a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f14674a);
        }

        public final String toString() {
            return d.n(new StringBuilder("Horizontal(bias="), this.f14674a, ')');
        }
    }

    public BiasAbsoluteAlignment(float f2) {
        this.f14672b = f2;
    }

    @Override // androidx.compose.ui.Alignment
    public final long a(long j2, long j3, LayoutDirection layoutDirection) {
        long a2 = IntSizeKt.a(((int) (j3 >> 32)) - ((int) (j2 >> 32)), ((int) (j3 & 4294967295L)) - ((int) (j2 & 4294967295L)));
        float f2 = 1;
        return IntOffsetKt.a(Math.round((this.f14672b + f2) * (((int) (a2 >> 32)) / 2.0f)), Math.round((f2 + this.f14673c) * (((int) (a2 & 4294967295L)) / 2.0f)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiasAbsoluteAlignment)) {
            return false;
        }
        BiasAbsoluteAlignment biasAbsoluteAlignment = (BiasAbsoluteAlignment) obj;
        return Float.compare(this.f14672b, biasAbsoluteAlignment.f14672b) == 0 && Float.compare(this.f14673c, biasAbsoluteAlignment.f14673c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f14673c) + (Float.hashCode(this.f14672b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAbsoluteAlignment(horizontalBias=");
        sb.append(this.f14672b);
        sb.append(", verticalBias=");
        return d.n(sb, this.f14673c, ')');
    }
}
