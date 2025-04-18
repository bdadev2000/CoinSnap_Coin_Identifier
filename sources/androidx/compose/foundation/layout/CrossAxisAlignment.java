package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;

@Immutable
/* loaded from: classes.dex */
public abstract class CrossAxisAlignment {

    /* loaded from: classes.dex */
    public static final class AlignmentLineCrossAxisAlignment extends CrossAxisAlignment {

        /* renamed from: a, reason: collision with root package name */
        public final AlignmentLineProvider f3876a;

        public AlignmentLineCrossAxisAlignment(AlignmentLineProvider alignmentLineProvider) {
            this.f3876a = alignmentLineProvider;
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public final int a(int i2, LayoutDirection layoutDirection, Placeable placeable, int i3) {
            int a2 = this.f3876a.a(placeable);
            if (a2 == Integer.MIN_VALUE) {
                return 0;
            }
            int i4 = i3 - a2;
            return layoutDirection == LayoutDirection.f17495b ? i2 - i4 : i4;
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public final Integer b(Placeable placeable) {
            return Integer.valueOf(this.f3876a.a(placeable));
        }
    }

    /* loaded from: classes.dex */
    public static final class CenterCrossAxisAlignment extends CrossAxisAlignment {
        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public final int a(int i2, LayoutDirection layoutDirection, Placeable placeable, int i3) {
            return i2 / 2;
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    /* loaded from: classes.dex */
    public static final class EndCrossAxisAlignment extends CrossAxisAlignment {
        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public final int a(int i2, LayoutDirection layoutDirection, Placeable placeable, int i3) {
            if (layoutDirection == LayoutDirection.f17494a) {
                return i2;
            }
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static final class HorizontalCrossAxisAlignment extends CrossAxisAlignment {

        /* renamed from: a, reason: collision with root package name */
        public final Alignment.Horizontal f3877a;

        public HorizontalCrossAxisAlignment(Alignment.Horizontal horizontal) {
            this.f3877a = horizontal;
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public final int a(int i2, LayoutDirection layoutDirection, Placeable placeable, int i3) {
            return this.f3877a.a(0, i2, layoutDirection);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HorizontalCrossAxisAlignment) && p0.a.g(this.f3877a, ((HorizontalCrossAxisAlignment) obj).f3877a);
        }

        public final int hashCode() {
            return this.f3877a.hashCode();
        }

        public final String toString() {
            return "HorizontalCrossAxisAlignment(horizontal=" + this.f3877a + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class StartCrossAxisAlignment extends CrossAxisAlignment {
        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public final int a(int i2, LayoutDirection layoutDirection, Placeable placeable, int i3) {
            if (layoutDirection == LayoutDirection.f17494a) {
                return 0;
            }
            return i2;
        }
    }

    /* loaded from: classes.dex */
    public static final class VerticalCrossAxisAlignment extends CrossAxisAlignment {

        /* renamed from: a, reason: collision with root package name */
        public final Alignment.Vertical f3878a;

        public VerticalCrossAxisAlignment(Alignment.Vertical vertical) {
            this.f3878a = vertical;
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public final int a(int i2, LayoutDirection layoutDirection, Placeable placeable, int i3) {
            return this.f3878a.a(0, i2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VerticalCrossAxisAlignment) && p0.a.g(this.f3878a, ((VerticalCrossAxisAlignment) obj).f3878a);
        }

        public final int hashCode() {
            return this.f3878a.hashCode();
        }

        public final String toString() {
            return "VerticalCrossAxisAlignment(vertical=" + this.f3878a + ')';
        }
    }

    public abstract int a(int i2, LayoutDirection layoutDirection, Placeable placeable, int i3);

    public Integer b(Placeable placeable) {
        return null;
    }
}
