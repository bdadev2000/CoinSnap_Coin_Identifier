package androidx.compose.material3.internal;

import android.support.v4.media.d;
import androidx.compose.material3.internal.MenuPosition;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;

@Immutable
/* loaded from: classes2.dex */
public final class AnchorAlignmentOffsetPosition {

    @Immutable
    /* loaded from: classes2.dex */
    public static final class Horizontal implements MenuPosition.Horizontal {

        /* renamed from: a, reason: collision with root package name */
        public final Alignment.Horizontal f12782a;

        /* renamed from: b, reason: collision with root package name */
        public final Alignment.Horizontal f12783b;

        /* renamed from: c, reason: collision with root package name */
        public final int f12784c;

        public Horizontal(BiasAlignment.Horizontal horizontal, BiasAlignment.Horizontal horizontal2, int i2) {
            this.f12782a = horizontal;
            this.f12783b = horizontal2;
            this.f12784c = i2;
        }

        @Override // androidx.compose.material3.internal.MenuPosition.Horizontal
        public final int a(IntRect intRect, long j2, int i2, LayoutDirection layoutDirection) {
            int a2 = this.f12783b.a(0, intRect.c(), layoutDirection);
            int i3 = -this.f12782a.a(0, i2, layoutDirection);
            LayoutDirection layoutDirection2 = LayoutDirection.f17494a;
            int i4 = this.f12784c;
            if (layoutDirection != layoutDirection2) {
                i4 = -i4;
            }
            return intRect.f17490a + a2 + i3 + i4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Horizontal)) {
                return false;
            }
            Horizontal horizontal = (Horizontal) obj;
            return p0.a.g(this.f12782a, horizontal.f12782a) && p0.a.g(this.f12783b, horizontal.f12783b) && this.f12784c == horizontal.f12784c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f12784c) + ((this.f12783b.hashCode() + (this.f12782a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Horizontal(menuAlignment=");
            sb.append(this.f12782a);
            sb.append(", anchorAlignment=");
            sb.append(this.f12783b);
            sb.append(", offset=");
            return d.o(sb, this.f12784c, ')');
        }
    }

    @Immutable
    /* loaded from: classes2.dex */
    public static final class Vertical implements MenuPosition.Vertical {

        /* renamed from: a, reason: collision with root package name */
        public final Alignment.Vertical f12785a;

        /* renamed from: b, reason: collision with root package name */
        public final Alignment.Vertical f12786b;

        /* renamed from: c, reason: collision with root package name */
        public final int f12787c;

        public Vertical(BiasAlignment.Vertical vertical, BiasAlignment.Vertical vertical2, int i2) {
            this.f12785a = vertical;
            this.f12786b = vertical2;
            this.f12787c = i2;
        }

        @Override // androidx.compose.material3.internal.MenuPosition.Vertical
        public final int a(IntRect intRect, long j2, int i2) {
            int a2 = this.f12786b.a(0, intRect.b());
            return intRect.f17491b + a2 + (-this.f12785a.a(0, i2)) + this.f12787c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Vertical)) {
                return false;
            }
            Vertical vertical = (Vertical) obj;
            return p0.a.g(this.f12785a, vertical.f12785a) && p0.a.g(this.f12786b, vertical.f12786b) && this.f12787c == vertical.f12787c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f12787c) + ((this.f12786b.hashCode() + (this.f12785a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Vertical(menuAlignment=");
            sb.append(this.f12785a);
            sb.append(", anchorAlignment=");
            sb.append(this.f12786b);
            sb.append(", offset=");
            return d.o(sb, this.f12787c, ')');
        }
    }
}
