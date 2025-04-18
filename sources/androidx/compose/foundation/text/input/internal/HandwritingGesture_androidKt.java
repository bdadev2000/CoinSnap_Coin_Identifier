package androidx.compose.foundation.text.input.internal;

import android.graphics.PointF;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextInclusionStrategy;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;

/* loaded from: classes4.dex */
public final class HandwritingGesture_androidKt {
    public static final long a(long j2, CharSequence charSequence) {
        int i2 = TextRange.f17057c;
        int i3 = (int) (j2 >> 32);
        int i4 = (int) (4294967295L & j2);
        int codePointBefore = i3 > 0 ? Character.codePointBefore(charSequence, i3) : 10;
        int codePointAt = i4 < charSequence.length() ? Character.codePointAt(charSequence, i4) : 10;
        if (n(codePointBefore) && (m(codePointAt) || l(codePointAt))) {
            do {
                i3 -= Character.charCount(codePointBefore);
                if (i3 == 0) {
                    break;
                }
                codePointBefore = Character.codePointBefore(charSequence, i3);
            } while (n(codePointBefore));
            return TextRangeKt.a(i3, i4);
        }
        if (!n(codePointAt)) {
            return j2;
        }
        if (!m(codePointBefore) && !l(codePointBefore)) {
            return j2;
        }
        do {
            i4 += Character.charCount(codePointAt);
            if (i4 == charSequence.length()) {
                break;
            }
            codePointAt = Character.codePointAt(charSequence, i4);
        } while (n(codePointAt));
        return TextRangeKt.a(i3, i4);
    }

    public static final long b(TextLayoutResult textLayoutResult, long j2, long j3, LayoutCoordinates layoutCoordinates, ViewConfiguration viewConfiguration) {
        if (textLayoutResult == null || layoutCoordinates == null) {
            return TextRange.f17056b;
        }
        long n2 = layoutCoordinates.n(j2);
        long n3 = layoutCoordinates.n(j3);
        MultiParagraph multiParagraph = textLayoutResult.f17047b;
        int h2 = h(multiParagraph, n2, viewConfiguration);
        int h3 = h(multiParagraph, n3, viewConfiguration);
        if (h2 != -1) {
            if (h3 != -1) {
                h2 = Math.min(h2, h3);
            }
            h3 = h2;
        } else if (h3 == -1) {
            return TextRange.f17056b;
        }
        float b2 = (multiParagraph.b(h3) + multiParagraph.d(h3)) / 2;
        return multiParagraph.f(new Rect(Math.min(Offset.g(n2), Offset.g(n3)), b2 - 0.1f, Math.max(Offset.g(n2), Offset.g(n3)), b2 + 0.1f), 0, TextInclusionStrategy.Companion.f17035a);
    }

    public static final long c(LegacyTextFieldState legacyTextFieldState, Rect rect, Rect rect2, int i2) {
        long j2 = j(legacyTextFieldState, rect, i2);
        if (TextRange.c(j2)) {
            return TextRange.f17056b;
        }
        long j3 = j(legacyTextFieldState, rect2, i2);
        if (TextRange.c(j3)) {
            return TextRange.f17056b;
        }
        int i3 = (int) (j2 >> 32);
        int i4 = (int) (j3 & 4294967295L);
        return TextRangeKt.a(Math.min(i3, i3), Math.max(i4, i4));
    }

    public static final long d(TextLayoutState textLayoutState, Rect rect, Rect rect2, int i2) {
        long k2 = k(textLayoutState, rect, i2);
        if (TextRange.c(k2)) {
            return TextRange.f17056b;
        }
        long k3 = k(textLayoutState, rect2, i2);
        if (TextRange.c(k3)) {
            return TextRange.f17056b;
        }
        int i3 = (int) (k2 >> 32);
        int i4 = (int) (k3 & 4294967295L);
        return TextRangeKt.a(Math.min(i3, i3), Math.max(i4, i4));
    }

    public static final boolean e(TextLayoutResult textLayoutResult, int i2) {
        int f2 = textLayoutResult.f(i2);
        if (i2 == textLayoutResult.i(f2) || i2 == textLayoutResult.e(f2, false)) {
            if (textLayoutResult.j(i2) == textLayoutResult.a(i2)) {
                return false;
            }
        } else if (textLayoutResult.a(i2) == textLayoutResult.a(i2 - 1)) {
            return false;
        }
        return true;
    }

    public static final long f(int i2, CharSequence charSequence) {
        int i3 = i2;
        while (i3 > 0) {
            int codePointBefore = Character.codePointBefore(charSequence, i3);
            if (!m(codePointBefore)) {
                break;
            }
            i3 -= Character.charCount(codePointBefore);
        }
        while (i2 < charSequence.length()) {
            int codePointAt = Character.codePointAt(charSequence, i2);
            if (!m(codePointAt)) {
                break;
            }
            i2 += Character.charCount(codePointAt);
        }
        return TextRangeKt.a(i3, i2);
    }

    public static final long g(PointF pointF) {
        return OffsetKt.a(pointF.x, pointF.y);
    }

    public static final int h(MultiParagraph multiParagraph, long j2, ViewConfiguration viewConfiguration) {
        float h2 = viewConfiguration != null ? viewConfiguration.h() : 0.0f;
        int c2 = multiParagraph.c(Offset.h(j2));
        if (Offset.h(j2) < multiParagraph.d(c2) - h2 || Offset.h(j2) > multiParagraph.b(c2) + h2 || Offset.g(j2) < (-h2) || Offset.g(j2) > multiParagraph.d + h2) {
            return -1;
        }
        return c2;
    }

    public static final int i(MultiParagraph multiParagraph, long j2, LayoutCoordinates layoutCoordinates, ViewConfiguration viewConfiguration) {
        long n2;
        int h2;
        if (layoutCoordinates == null || (h2 = h(multiParagraph, (n2 = layoutCoordinates.n(j2)), viewConfiguration)) == -1) {
            return -1;
        }
        return multiParagraph.e(Offset.b(n2, (multiParagraph.b(h2) + multiParagraph.d(h2)) / 2.0f, 1));
    }

    public static final long j(LegacyTextFieldState legacyTextFieldState, Rect rect, int i2) {
        TextLayoutResult textLayoutResult;
        TextLayoutResultProxy d = legacyTextFieldState.d();
        MultiParagraph multiParagraph = (d == null || (textLayoutResult = d.f6210a) == null) ? null : textLayoutResult.f17047b;
        LayoutCoordinates c2 = legacyTextFieldState.c();
        return (multiParagraph == null || c2 == null) ? TextRange.f17056b : multiParagraph.f(rect.m(c2.n(0L)), i2, TextInclusionStrategy.Companion.f17036b);
    }

    public static final long k(TextLayoutState textLayoutState, Rect rect, int i2) {
        TextLayoutResult b2 = textLayoutState.b();
        MultiParagraph multiParagraph = b2 != null ? b2.f17047b : null;
        LayoutCoordinates d = textLayoutState.d();
        return (multiParagraph == null || d == null) ? TextRange.f17056b : multiParagraph.f(rect.m(d.n(0L)), i2, TextInclusionStrategy.Companion.f17036b);
    }

    public static final boolean l(int i2) {
        int type = Character.getType(i2);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean m(int i2) {
        return Character.isWhitespace(i2) || i2 == 160;
    }

    public static final boolean n(int i2) {
        int type;
        return (!m(i2) || (type = Character.getType(i2)) == 14 || type == 13 || i2 == 10) ? false : true;
    }
}
