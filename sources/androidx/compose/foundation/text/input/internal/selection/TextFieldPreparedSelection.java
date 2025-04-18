package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import q0.l;

@StabilityInferred
/* loaded from: classes3.dex */
public final class TextFieldPreparedSelection {

    /* renamed from: a, reason: collision with root package name */
    public final TransformedTextFieldState f6708a;

    /* renamed from: b, reason: collision with root package name */
    public final TextLayoutResult f6709b;

    /* renamed from: c, reason: collision with root package name */
    public final float f6710c;
    public final TextFieldPreparedSelectionState d;
    public final TextFieldCharSequence e;

    /* renamed from: f, reason: collision with root package name */
    public long f6711f;

    /* renamed from: g, reason: collision with root package name */
    public final String f6712g;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public TextFieldPreparedSelection(TransformedTextFieldState transformedTextFieldState, TextLayoutResult textLayoutResult, boolean z2, float f2, TextFieldPreparedSelectionState textFieldPreparedSelectionState) {
        this.f6708a = transformedTextFieldState;
        this.f6709b = textLayoutResult;
        this.f6710c = f2;
        this.d = textFieldPreparedSelectionState;
        Snapshot a2 = Snapshot.Companion.a();
        l f3 = a2 != null ? a2.f() : null;
        Snapshot c2 = Snapshot.Companion.c(a2);
        try {
            TextFieldCharSequence d = transformedTextFieldState.d();
            Snapshot.Companion.f(a2, c2, f3);
            this.e = d;
            this.f6711f = d.f6298b;
            this.f6712g = d.f6297a.toString();
        } catch (Throwable th) {
            Snapshot.Companion.f(a2, c2, f3);
            throw th;
        }
    }

    public final int a() {
        String str = this.f6712g;
        TextLayoutResult textLayoutResult = this.f6709b;
        if (textLayoutResult == null) {
            return str.length();
        }
        long j2 = this.f6711f;
        int i2 = TextRange.f17057c;
        int i3 = (int) (j2 & 4294967295L);
        while (true) {
            TextFieldCharSequence textFieldCharSequence = this.e;
            if (i3 >= textFieldCharSequence.f6297a.length()) {
                return textFieldCharSequence.f6297a.length();
            }
            int length = str.length() - 1;
            if (i3 <= length) {
                length = i3;
            }
            long l2 = textLayoutResult.l(length);
            int i4 = TextRange.f17057c;
            int i5 = (int) (l2 & 4294967295L);
            if (i5 > i3) {
                return i5;
            }
            i3++;
        }
    }

    public final int b() {
        TextLayoutResult textLayoutResult = this.f6709b;
        if (textLayoutResult == null) {
            return 0;
        }
        long j2 = this.f6711f;
        int i2 = TextRange.f17057c;
        for (int i3 = (int) (j2 & 4294967295L); i3 > 0; i3--) {
            int length = this.f6712g.length() - 1;
            if (i3 <= length) {
                length = i3;
            }
            long l2 = textLayoutResult.l(length);
            int i4 = TextRange.f17057c;
            int i5 = (int) (l2 >> 32);
            if (i5 < i3) {
                return i5;
            }
        }
        return 0;
    }

    public final boolean c() {
        TextLayoutResult textLayoutResult = this.f6709b;
        if (textLayoutResult == null) {
            return true;
        }
        long j2 = this.f6711f;
        int i2 = TextRange.f17057c;
        ResolvedTextDirection j3 = textLayoutResult.j((int) (j2 & 4294967295L));
        return j3 == null || j3 == ResolvedTextDirection.f17460a;
    }

    public final int d(TextLayoutResult textLayoutResult, int i2) {
        long j2 = this.f6711f;
        int i3 = TextRange.f17057c;
        int i4 = (int) (j2 & 4294967295L);
        TextFieldPreparedSelectionState textFieldPreparedSelectionState = this.d;
        if (Float.isNaN(textFieldPreparedSelectionState.f6713a)) {
            textFieldPreparedSelectionState.f6713a = textLayoutResult.c(i4).f14914a;
        }
        int f2 = textLayoutResult.f(i4) + i2;
        if (f2 < 0) {
            return 0;
        }
        MultiParagraph multiParagraph = textLayoutResult.f17047b;
        if (f2 >= multiParagraph.f16914f) {
            return this.f6712g.length();
        }
        float b2 = multiParagraph.b(f2) - 1;
        float f3 = textFieldPreparedSelectionState.f6713a;
        return ((!c() || f3 < textLayoutResult.h(f2)) && (c() || f3 > textLayoutResult.g(f2))) ? multiParagraph.e(OffsetKt.a(f3, b2)) : textLayoutResult.e(f2, true);
    }

    public final int e(int i2) {
        long j2 = this.e.f6298b;
        int i3 = TextRange.f17057c;
        int i4 = (int) (j2 & 4294967295L);
        TextLayoutResult textLayoutResult = this.f6709b;
        if (textLayoutResult != null) {
            float f2 = this.f6710c;
            if (!Float.isNaN(f2)) {
                Rect l2 = textLayoutResult.c(i4).l(0.0f, f2 * i2);
                MultiParagraph multiParagraph = textLayoutResult.f17047b;
                float f3 = l2.f14915b;
                float b2 = multiParagraph.b(multiParagraph.c(f3));
                float abs = Math.abs(f3 - b2);
                float f4 = l2.d;
                return abs > Math.abs(f4 - b2) ? multiParagraph.e(l2.g()) : multiParagraph.e(OffsetKt.a(l2.f14914a, f4));
            }
        }
        return i4;
    }

    public final void f() {
        this.d.f6713a = Float.NaN;
        String str = this.f6712g;
        if (str.length() > 0) {
            long j2 = this.f6711f;
            int i2 = TextRange.f17057c;
            int i3 = (int) (j2 & 4294967295L);
            int a2 = TextPreparedSelectionKt.a(str, i3, true, this.f6708a);
            if (a2 != i3) {
                m(a2);
            }
        }
    }

    public final void g() {
        this.d.f6713a = Float.NaN;
        String str = this.f6712g;
        if (str.length() > 0) {
            int a2 = StringHelpersKt.a(TextRange.e(this.f6711f), str);
            if (a2 == TextRange.e(this.f6711f) && a2 != str.length()) {
                a2 = StringHelpersKt.a(a2 + 1, str);
            }
            m(a2);
        }
    }

    public final void h() {
        this.d.f6713a = Float.NaN;
        String str = this.f6712g;
        if (str.length() > 0) {
            long j2 = this.f6711f;
            int i2 = TextRange.f17057c;
            int i3 = (int) (j2 & 4294967295L);
            int a2 = TextPreparedSelectionKt.a(str, i3, false, this.f6708a);
            if (a2 != i3) {
                m(a2);
            }
        }
    }

    public final void i() {
        this.d.f6713a = Float.NaN;
        String str = this.f6712g;
        if (str.length() > 0) {
            int b2 = StringHelpersKt.b(TextRange.f(this.f6711f), str);
            if (b2 == TextRange.f(this.f6711f) && b2 != 0) {
                b2 = StringHelpersKt.b(b2 - 1, str);
            }
            m(b2);
        }
    }

    public final void j() {
        this.d.f6713a = Float.NaN;
        String str = this.f6712g;
        if (str.length() > 0) {
            TextLayoutResult textLayoutResult = this.f6709b;
            m(textLayoutResult != null ? textLayoutResult.e(textLayoutResult.f(TextRange.e(this.f6711f)), true) : str.length());
        }
    }

    public final void k() {
        this.d.f6713a = Float.NaN;
        if (this.f6712g.length() > 0) {
            TextLayoutResult textLayoutResult = this.f6709b;
            m(textLayoutResult != null ? textLayoutResult.i(textLayoutResult.f(TextRange.f(this.f6711f))) : 0);
        }
    }

    public final void l() {
        if (this.f6712g.length() > 0) {
            long j2 = this.e.f6298b;
            int i2 = TextRange.f17057c;
            this.f6711f = TextRangeKt.a((int) (j2 >> 32), (int) (this.f6711f & 4294967295L));
        }
    }

    public final void m(int i2) {
        this.f6711f = TextRangeKt.a(i2, i2);
    }
}
