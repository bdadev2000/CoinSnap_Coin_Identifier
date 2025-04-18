package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.IntSize;

/* loaded from: classes.dex */
public final class SelectionManagerKt {

    /* renamed from: a, reason: collision with root package name */
    public static final Rect f7257a = new Rect(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7258a;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f7258a = iArr;
        }
    }

    public static final boolean a(long j2, Rect rect) {
        float g2 = Offset.g(j2);
        if (rect.f14914a <= g2 && g2 <= rect.f14916c) {
            float h2 = Offset.h(j2);
            if (rect.f14915b <= h2 && h2 <= rect.d) {
                return true;
            }
        }
        return false;
    }

    public static final long b(SelectionManager selectionManager, long j2, Selection.AnchorInfo anchorInfo) {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates e;
        float z2;
        Selectable selectable = (Selectable) selectionManager.f7215a.f7277c.c(anchorInfo.f7088c);
        if (selectable == null || (layoutCoordinates = selectionManager.f7223k) == null || (e = selectable.e()) == null) {
            return 9205357640488583168L;
        }
        int g2 = selectable.g();
        int i2 = anchorInfo.f7087b;
        if (i2 > g2) {
            return 9205357640488583168L;
        }
        Offset offset = (Offset) selectionManager.f7229q.getValue();
        p0.a.p(offset);
        float g3 = Offset.g(e.v(layoutCoordinates, offset.f14913a));
        long l2 = selectable.l(i2);
        if (TextRange.c(l2)) {
            z2 = selectable.c(i2);
        } else {
            float c2 = selectable.c((int) (l2 >> 32));
            float b2 = selectable.b(((int) (l2 & 4294967295L)) - 1);
            z2 = p0.a.z(g3, Math.min(c2, b2), Math.max(c2, b2));
        }
        if (z2 == -1.0f) {
            return 9205357640488583168L;
        }
        if (!IntSize.b(j2, 0L) && Math.abs(g3 - z2) > ((int) (j2 >> 32)) / 2) {
            return 9205357640488583168L;
        }
        float h2 = selectable.h(i2);
        if (h2 == -1.0f) {
            return 9205357640488583168L;
        }
        return layoutCoordinates.v(e, OffsetKt.a(z2, h2));
    }

    public static final Rect c(LayoutCoordinates layoutCoordinates) {
        Rect b2 = LayoutCoordinatesKt.b(layoutCoordinates);
        long D = layoutCoordinates.D(b2.g());
        long D2 = layoutCoordinates.D(OffsetKt.a(b2.f14916c, b2.d));
        return new Rect(Offset.g(D), Offset.h(D), Offset.g(D2), Offset.h(D2));
    }
}
