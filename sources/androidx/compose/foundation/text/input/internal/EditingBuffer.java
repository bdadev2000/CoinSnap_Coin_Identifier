package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import d0.k;

@StabilityInferred
/* loaded from: classes.dex */
public final class EditingBuffer {

    /* renamed from: a, reason: collision with root package name */
    public final PartialGapBuffer f6399a;

    /* renamed from: b, reason: collision with root package name */
    public final ChangeTracker f6400b;

    /* renamed from: c, reason: collision with root package name */
    public int f6401c;
    public int d;
    public k e;

    /* renamed from: f, reason: collision with root package name */
    public int f6402f;

    /* renamed from: g, reason: collision with root package name */
    public int f6403g;

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    public EditingBuffer(String str, long j2) {
        new AnnotatedString(str, null, 6);
        this.f6399a = new PartialGapBuffer(str);
        this.f6400b = new ChangeTracker(null);
        int i2 = TextRange.f17057c;
        int i3 = (int) (j2 >> 32);
        this.f6401c = i3;
        int i4 = (int) (j2 & 4294967295L);
        this.d = i4;
        this.f6402f = -1;
        this.f6403g = -1;
        a(i3, i4);
    }

    public final void a(int i2, int i3) {
        PartialGapBuffer partialGapBuffer = this.f6399a;
        if (i2 < 0 || i2 > partialGapBuffer.length()) {
            StringBuilder t2 = android.support.v4.media.d.t("start (", i2, ") offset is outside of text region ");
            t2.append(partialGapBuffer.length());
            throw new IndexOutOfBoundsException(t2.toString());
        }
        if (i3 < 0 || i3 > partialGapBuffer.length()) {
            StringBuilder t3 = android.support.v4.media.d.t("end (", i3, ") offset is outside of text region ");
            t3.append(partialGapBuffer.length());
            throw new IndexOutOfBoundsException(t3.toString());
        }
    }

    public final void b() {
        this.f6402f = -1;
        this.f6403g = -1;
    }

    public final void c(int i2, int i3) {
        a(i2, i3);
        long a2 = TextRangeKt.a(i2, i3);
        this.f6400b.e(i2, i3, 0);
        this.f6399a.a(TextRange.f(a2), TextRange.e(a2), "", 0, "".length());
        long a3 = EditingBufferKt.a(TextRangeKt.a(this.f6401c, this.d), a2);
        j((int) (a3 >> 32));
        i((int) (a3 & 4294967295L));
        int i4 = this.f6402f;
        if (i4 != -1) {
            long a4 = EditingBufferKt.a(TextRangeKt.a(i4, this.f6403g), a2);
            if (TextRange.c(a4)) {
                b();
            } else {
                this.f6402f = TextRange.f(a4);
                this.f6403g = TextRange.e(a4);
            }
        }
        this.e = null;
    }

    public final TextRange d() {
        int i2 = this.f6402f;
        if (i2 != -1) {
            return new TextRange(TextRangeKt.a(i2, this.f6403g));
        }
        return null;
    }

    public final long e() {
        return TextRangeKt.a(this.f6401c, this.d);
    }

    public final void f(int i2, int i3, CharSequence charSequence) {
        PartialGapBuffer partialGapBuffer;
        a(i2, i3);
        int min = Math.min(i2, i3);
        int max = Math.max(i2, i3);
        int i4 = 0;
        int i5 = min;
        while (true) {
            partialGapBuffer = this.f6399a;
            if (i5 >= max || i4 >= charSequence.length() || charSequence.charAt(i4) != partialGapBuffer.charAt(i5)) {
                break;
            }
            i4++;
            i5++;
        }
        int length = charSequence.length();
        int i6 = max;
        while (i6 > min && length > i4 && charSequence.charAt(length - 1) == partialGapBuffer.charAt(i6 - 1)) {
            length--;
            i6--;
        }
        this.f6400b.e(i5, i6, length - i4);
        this.f6399a.a(min, max, charSequence, 0, charSequence.length());
        j(charSequence.length() + min);
        i(charSequence.length() + min);
        this.f6402f = -1;
        this.f6403g = -1;
        this.e = null;
    }

    public final void g(int i2, int i3) {
        PartialGapBuffer partialGapBuffer = this.f6399a;
        if (i2 < 0 || i2 > partialGapBuffer.length()) {
            StringBuilder t2 = android.support.v4.media.d.t("start (", i2, ") offset is outside of text region ");
            t2.append(partialGapBuffer.length());
            throw new IndexOutOfBoundsException(t2.toString());
        }
        if (i3 < 0 || i3 > partialGapBuffer.length()) {
            StringBuilder t3 = android.support.v4.media.d.t("end (", i3, ") offset is outside of text region ");
            t3.append(partialGapBuffer.length());
            throw new IndexOutOfBoundsException(t3.toString());
        }
        if (i2 >= i3) {
            throw new IllegalArgumentException(android.support.v4.media.d.k("Do not set reversed or empty range: ", i2, " > ", i3));
        }
        this.f6402f = i2;
        this.f6403g = i3;
    }

    public final void h(int i2, int i3) {
        PartialGapBuffer partialGapBuffer = this.f6399a;
        int A = p0.a.A(i2, 0, partialGapBuffer.length());
        int A2 = p0.a.A(i3, 0, partialGapBuffer.length());
        j(A);
        i(A2);
    }

    public final void i(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.d.i("Cannot set selectionEnd to a negative value: ", i2).toString());
        }
        this.d = i2;
        this.e = null;
    }

    public final void j(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.d.i("Cannot set selectionStart to a negative value: ", i2).toString());
        }
        this.f6401c = i2;
        this.e = null;
    }

    public final String toString() {
        return this.f6399a.toString();
    }
}
