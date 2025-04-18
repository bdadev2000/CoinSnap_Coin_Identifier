package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TextLayoutStateKt;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.IntSize;
import p0.a;

/* loaded from: classes2.dex */
public final class TextFieldMagnifierKt {

    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6690a;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f6690a = iArr;
        }
    }

    public static final long a(TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, TextLayoutState textLayoutState, long j2) {
        long j3;
        long p2 = textFieldSelectionState.p();
        if (!OffsetKt.d(p2) && transformedTextFieldState.d().f6297a.length() != 0) {
            long j4 = transformedTextFieldState.d().f6298b;
            Handle o2 = textFieldSelectionState.o();
            int i2 = o2 == null ? -1 : WhenMappings.f6690a[o2.ordinal()];
            if (i2 != -1) {
                if (i2 == 1 || i2 == 2) {
                    int i3 = TextRange.f17057c;
                    j3 = j4 >> 32;
                } else {
                    if (i2 != 3) {
                        throw new RuntimeException();
                    }
                    int i4 = TextRange.f17057c;
                    j3 = 4294967295L & j4;
                }
                int i5 = (int) j3;
                TextLayoutResult b2 = textLayoutState.b();
                if (b2 == null) {
                    return 9205357640488583168L;
                }
                float g2 = Offset.g(p2);
                int f2 = b2.f(i5);
                float g3 = b2.g(f2);
                float h2 = b2.h(f2);
                float z2 = a.z(g2, Math.min(g3, h2), Math.max(g3, h2));
                if (!IntSize.b(j2, 0L) && Math.abs(g2 - z2) > ((int) (j2 >> 32)) / 2) {
                    return 9205357640488583168L;
                }
                MultiParagraph multiParagraph = b2.f17047b;
                float d = multiParagraph.d(f2);
                long a2 = OffsetKt.a(z2, ((multiParagraph.b(f2) - d) / 2) + d);
                LayoutCoordinates d2 = textLayoutState.d();
                Offset offset = null;
                if (d2 != null) {
                    if (!d2.B()) {
                        d2 = null;
                    }
                    if (d2 != null) {
                        a2 = TextLayoutStateKt.a(a2, SelectionManagerKt.c(d2));
                    }
                }
                LayoutCoordinates d3 = textLayoutState.d();
                if (d3 == null) {
                    return a2;
                }
                if (!d3.B()) {
                    d3 = null;
                }
                if (d3 == null) {
                    return a2;
                }
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) textLayoutState.e.getValue();
                if (layoutCoordinates != null) {
                    if (!layoutCoordinates.B()) {
                        layoutCoordinates = null;
                    }
                    if (layoutCoordinates != null) {
                        offset = new Offset(layoutCoordinates.v(d3, a2));
                    }
                }
                return offset != null ? offset.f14913a : a2;
            }
        }
        return 9205357640488583168L;
    }
}
