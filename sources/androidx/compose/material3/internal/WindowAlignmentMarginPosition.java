package androidx.compose.material3.internal;

import android.support.v4.media.d;
import androidx.compose.material3.internal.MenuPosition;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAbsoluteAlignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;

@Immutable
/* loaded from: classes3.dex */
public final class WindowAlignmentMarginPosition {

    @Immutable
    /* loaded from: classes3.dex */
    public static final class Horizontal implements MenuPosition.Horizontal {

        /* renamed from: a, reason: collision with root package name */
        public final Alignment.Horizontal f13114a;

        /* renamed from: b, reason: collision with root package name */
        public final int f13115b;

        public Horizontal(BiasAbsoluteAlignment.Horizontal horizontal, int i2) {
            this.f13114a = horizontal;
            this.f13115b = i2;
        }

        @Override // androidx.compose.material3.internal.MenuPosition.Horizontal
        public final int a(IntRect intRect, long j2, int i2, LayoutDirection layoutDirection) {
            int i3 = (int) (j2 >> 32);
            int i4 = this.f13115b;
            return i2 >= i3 - (i4 * 2) ? Alignment.Companion.f14670n.a(i2, i3, layoutDirection) : p0.a.A(this.f13114a.a(i2, i3, layoutDirection), i4, (i3 - i4) - i2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Horizontal)) {
                return false;
            }
            Horizontal horizontal = (Horizontal) obj;
            return p0.a.g(this.f13114a, horizontal.f13114a) && this.f13115b == horizontal.f13115b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f13115b) + (this.f13114a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Horizontal(alignment=");
            sb.append(this.f13114a);
            sb.append(", margin=");
            return d.o(sb, this.f13115b, ')');
        }
    }

    @Immutable
    /* loaded from: classes3.dex */
    public static final class Vertical implements MenuPosition.Vertical {

        /* renamed from: a, reason: collision with root package name */
        public final Alignment.Vertical f13116a;

        /* renamed from: b, reason: collision with root package name */
        public final int f13117b;

        public Vertical(BiasAlignment.Vertical vertical, int i2) {
            this.f13116a = vertical;
            this.f13117b = i2;
        }

        @Override // androidx.compose.material3.internal.MenuPosition.Vertical
        public final int a(IntRect intRect, long j2, int i2) {
            int i3 = (int) (j2 & 4294967295L);
            int i4 = this.f13117b;
            return i2 >= i3 - (i4 * 2) ? Alignment.Companion.f14667k.a(i2, i3) : p0.a.A(this.f13116a.a(i2, i3), i4, (i3 - i4) - i2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Vertical)) {
                return false;
            }
            Vertical vertical = (Vertical) obj;
            return p0.a.g(this.f13116a, vertical.f13116a) && this.f13117b == vertical.f13117b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f13117b) + (this.f13116a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Vertical(alignment=");
            sb.append(this.f13116a);
            sb.append(", margin=");
            return d.o(sb, this.f13117b, ')');
        }
    }
}
