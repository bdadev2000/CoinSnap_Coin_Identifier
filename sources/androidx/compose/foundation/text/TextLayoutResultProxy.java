package androidx.compose.foundation.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;

@StabilityInferred
/* loaded from: classes4.dex */
public final class TextLayoutResultProxy {

    /* renamed from: a, reason: collision with root package name */
    public final TextLayoutResult f6210a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutCoordinates f6211b = null;

    /* renamed from: c, reason: collision with root package name */
    public LayoutCoordinates f6212c;

    public TextLayoutResultProxy(TextLayoutResult textLayoutResult, LayoutCoordinates layoutCoordinates) {
        this.f6210a = textLayoutResult;
        this.f6212c = layoutCoordinates;
    }

    public final long a(long j2) {
        Rect rect;
        LayoutCoordinates layoutCoordinates = this.f6211b;
        Rect rect2 = Rect.e;
        if (layoutCoordinates != null) {
            if (layoutCoordinates.B()) {
                LayoutCoordinates layoutCoordinates2 = this.f6212c;
                rect = layoutCoordinates2 != null ? layoutCoordinates2.Q(layoutCoordinates, true) : null;
            } else {
                rect = rect2;
            }
            if (rect != null) {
                rect2 = rect;
            }
        }
        float g2 = Offset.g(j2);
        float f2 = rect2.f14914a;
        if (g2 >= f2) {
            float g3 = Offset.g(j2);
            f2 = rect2.f14916c;
            if (g3 <= f2) {
                f2 = Offset.g(j2);
            }
        }
        float h2 = Offset.h(j2);
        float f3 = rect2.f14915b;
        if (h2 >= f3) {
            float h3 = Offset.h(j2);
            f3 = rect2.d;
            if (h3 <= f3) {
                f3 = Offset.h(j2);
            }
        }
        return OffsetKt.a(f2, f3);
    }

    public final int b(long j2, boolean z2) {
        if (z2) {
            j2 = a(j2);
        }
        return this.f6210a.f17047b.e(d(j2));
    }

    public final boolean c(long j2) {
        long d = d(a(j2));
        float h2 = Offset.h(d);
        TextLayoutResult textLayoutResult = this.f6210a;
        int c2 = textLayoutResult.f17047b.c(h2);
        return Offset.g(d) >= textLayoutResult.g(c2) && Offset.g(d) <= textLayoutResult.h(c2);
    }

    public final long d(long j2) {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2 = this.f6211b;
        if (layoutCoordinates2 == null) {
            return j2;
        }
        if (!layoutCoordinates2.B()) {
            layoutCoordinates2 = null;
        }
        if (layoutCoordinates2 == null || (layoutCoordinates = this.f6212c) == null) {
            return j2;
        }
        LayoutCoordinates layoutCoordinates3 = layoutCoordinates.B() ? layoutCoordinates : null;
        return layoutCoordinates3 == null ? j2 : layoutCoordinates2.v(layoutCoordinates3, j2);
    }

    public final long e(long j2) {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2 = this.f6211b;
        if (layoutCoordinates2 == null) {
            return j2;
        }
        if (!layoutCoordinates2.B()) {
            layoutCoordinates2 = null;
        }
        if (layoutCoordinates2 == null || (layoutCoordinates = this.f6212c) == null) {
            return j2;
        }
        LayoutCoordinates layoutCoordinates3 = layoutCoordinates.B() ? layoutCoordinates : null;
        return layoutCoordinates3 == null ? j2 : layoutCoordinates3.v(layoutCoordinates2, j2);
    }
}
