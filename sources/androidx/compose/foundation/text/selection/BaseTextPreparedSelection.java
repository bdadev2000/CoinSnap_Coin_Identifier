package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.foundation.text.selection.BaseTextPreparedSelection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.style.ResolvedTextDirection;

@StabilityInferred
/* loaded from: classes2.dex */
public abstract class BaseTextPreparedSelection<T extends BaseTextPreparedSelection<T>> {

    /* renamed from: a, reason: collision with root package name */
    public final AnnotatedString f7045a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7046b;

    /* renamed from: c, reason: collision with root package name */
    public final TextLayoutResult f7047c;
    public final OffsetMapping d;
    public final TextPreparedSelectionState e;

    /* renamed from: f, reason: collision with root package name */
    public long f7048f;

    /* renamed from: g, reason: collision with root package name */
    public final AnnotatedString f7049g;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public BaseTextPreparedSelection(AnnotatedString annotatedString, long j2, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState textPreparedSelectionState) {
        this.f7045a = annotatedString;
        this.f7046b = j2;
        this.f7047c = textLayoutResult;
        this.d = offsetMapping;
        this.e = textPreparedSelectionState;
        this.f7048f = j2;
        this.f7049g = annotatedString;
    }

    public final Integer a() {
        TextLayoutResult textLayoutResult = this.f7047c;
        if (textLayoutResult == null) {
            return null;
        }
        int e = TextRange.e(this.f7048f);
        OffsetMapping offsetMapping = this.d;
        return Integer.valueOf(offsetMapping.a(textLayoutResult.e(textLayoutResult.f(offsetMapping.b(e)), true)));
    }

    public final Integer b() {
        TextLayoutResult textLayoutResult = this.f7047c;
        if (textLayoutResult == null) {
            return null;
        }
        int f2 = TextRange.f(this.f7048f);
        OffsetMapping offsetMapping = this.d;
        return Integer.valueOf(offsetMapping.a(textLayoutResult.i(textLayoutResult.f(offsetMapping.b(f2)))));
    }

    public final Integer c() {
        int length;
        TextLayoutResult textLayoutResult = this.f7047c;
        if (textLayoutResult == null) {
            return null;
        }
        int m2 = m();
        while (true) {
            AnnotatedString annotatedString = this.f7045a;
            if (m2 < annotatedString.f16880a.length()) {
                int length2 = this.f7049g.f16880a.length() - 1;
                if (m2 <= length2) {
                    length2 = m2;
                }
                long l2 = textLayoutResult.l(length2);
                int i2 = TextRange.f17057c;
                int i3 = (int) (l2 & 4294967295L);
                if (i3 > m2) {
                    length = this.d.a(i3);
                    break;
                }
                m2++;
            } else {
                length = annotatedString.f16880a.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer d() {
        int i2;
        TextLayoutResult textLayoutResult = this.f7047c;
        if (textLayoutResult == null) {
            return null;
        }
        int m2 = m();
        while (true) {
            if (m2 <= 0) {
                i2 = 0;
                break;
            }
            int length = this.f7049g.f16880a.length() - 1;
            if (m2 <= length) {
                length = m2;
            }
            long l2 = textLayoutResult.l(length);
            int i3 = TextRange.f17057c;
            int i4 = (int) (l2 >> 32);
            if (i4 < m2) {
                i2 = this.d.a(i4);
                break;
            }
            m2--;
        }
        return Integer.valueOf(i2);
    }

    public final boolean e() {
        TextLayoutResult textLayoutResult = this.f7047c;
        return (textLayoutResult != null ? textLayoutResult.j(m()) : null) != ResolvedTextDirection.f17461b;
    }

    public final int f(TextLayoutResult textLayoutResult, int i2) {
        int m2 = m();
        TextPreparedSelectionState textPreparedSelectionState = this.e;
        if (textPreparedSelectionState.f7357a == null) {
            textPreparedSelectionState.f7357a = Float.valueOf(textLayoutResult.c(m2).f14914a);
        }
        int f2 = textLayoutResult.f(m2) + i2;
        if (f2 < 0) {
            return 0;
        }
        MultiParagraph multiParagraph = textLayoutResult.f17047b;
        if (f2 >= multiParagraph.f16914f) {
            return this.f7049g.f16880a.length();
        }
        float b2 = multiParagraph.b(f2) - 1;
        Float f3 = textPreparedSelectionState.f7357a;
        p0.a.p(f3);
        float floatValue = f3.floatValue();
        if ((e() && floatValue >= textLayoutResult.h(f2)) || (!e() && floatValue <= textLayoutResult.g(f2))) {
            return textLayoutResult.e(f2, true);
        }
        return this.d.a(multiParagraph.e(OffsetKt.a(f3.floatValue(), b2)));
    }

    public final void g() {
        this.e.f7357a = null;
        AnnotatedString annotatedString = this.f7049g;
        if (annotatedString.f16880a.length() > 0) {
            int e = TextRange.e(this.f7048f);
            String str = annotatedString.f16880a;
            int a2 = StringHelpersKt.a(e, str);
            if (a2 == TextRange.e(this.f7048f) && a2 != str.length()) {
                a2 = StringHelpersKt.a(a2 + 1, str);
            }
            l(a2, a2);
        }
    }

    public final void h() {
        this.e.f7357a = null;
        AnnotatedString annotatedString = this.f7049g;
        if (annotatedString.f16880a.length() > 0) {
            int f2 = TextRange.f(this.f7048f);
            String str = annotatedString.f16880a;
            int b2 = StringHelpersKt.b(f2, str);
            if (b2 == TextRange.f(this.f7048f) && b2 != 0) {
                b2 = StringHelpersKt.b(b2 - 1, str);
            }
            l(b2, b2);
        }
    }

    public final void i() {
        Integer a2;
        this.e.f7357a = null;
        if (this.f7049g.f16880a.length() <= 0 || (a2 = a()) == null) {
            return;
        }
        int intValue = a2.intValue();
        l(intValue, intValue);
    }

    public final void j() {
        Integer b2;
        this.e.f7357a = null;
        if (this.f7049g.f16880a.length() <= 0 || (b2 = b()) == null) {
            return;
        }
        int intValue = b2.intValue();
        l(intValue, intValue);
    }

    public final void k() {
        if (this.f7049g.f16880a.length() > 0) {
            int i2 = TextRange.f17057c;
            this.f7048f = TextRangeKt.a((int) (this.f7046b >> 32), (int) (this.f7048f & 4294967295L));
        }
    }

    public final void l(int i2, int i3) {
        this.f7048f = TextRangeKt.a(i2, i3);
    }

    public final int m() {
        long j2 = this.f7048f;
        int i2 = TextRange.f17057c;
        return this.d.b((int) (j2 & 4294967295L));
    }
}
