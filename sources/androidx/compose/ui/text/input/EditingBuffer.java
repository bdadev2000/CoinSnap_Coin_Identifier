package androidx.compose.ui.text.input;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;

@StabilityInferred
/* loaded from: classes2.dex */
public final class EditingBuffer {

    /* renamed from: a, reason: collision with root package name */
    public final PartialGapBuffer f17324a;

    /* renamed from: b, reason: collision with root package name */
    public int f17325b;

    /* renamed from: c, reason: collision with root package name */
    public int f17326c;
    public int d;
    public int e;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.text.input.PartialGapBuffer, java.lang.Object] */
    public EditingBuffer(AnnotatedString annotatedString, long j2) {
        String str = annotatedString.f16880a;
        ?? obj = new Object();
        obj.f17346a = str;
        obj.f17348c = -1;
        obj.d = -1;
        this.f17324a = obj;
        this.f17325b = TextRange.f(j2);
        this.f17326c = TextRange.e(j2);
        this.d = -1;
        this.e = -1;
        int f2 = TextRange.f(j2);
        int e = TextRange.e(j2);
        String str2 = annotatedString.f16880a;
        if (f2 < 0 || f2 > str2.length()) {
            StringBuilder t2 = d.t("start (", f2, ") offset is outside of text region ");
            t2.append(str2.length());
            throw new IndexOutOfBoundsException(t2.toString());
        }
        if (e < 0 || e > str2.length()) {
            StringBuilder t3 = d.t("end (", e, ") offset is outside of text region ");
            t3.append(str2.length());
            throw new IndexOutOfBoundsException(t3.toString());
        }
        if (f2 > e) {
            throw new IllegalArgumentException(d.k("Do not set reversed range: ", f2, " > ", e));
        }
    }

    public final void a(int i2, int i3) {
        long a2 = TextRangeKt.a(i2, i3);
        this.f17324a.b(i2, i3, "");
        long a3 = EditingBufferKt.a(TextRangeKt.a(this.f17325b, this.f17326c), a2);
        j(TextRange.f(a3));
        i(TextRange.e(a3));
        if (e()) {
            long a4 = EditingBufferKt.a(TextRangeKt.a(this.d, this.e), a2);
            if (TextRange.c(a4)) {
                this.d = -1;
                this.e = -1;
            } else {
                this.d = TextRange.f(a4);
                this.e = TextRange.e(a4);
            }
        }
    }

    public final char b(int i2) {
        PartialGapBuffer partialGapBuffer = this.f17324a;
        GapBuffer gapBuffer = partialGapBuffer.f17347b;
        if (gapBuffer != null && i2 >= partialGapBuffer.f17348c) {
            int a2 = gapBuffer.f17327a - gapBuffer.a();
            int i3 = partialGapBuffer.f17348c;
            if (i2 >= a2 + i3) {
                return partialGapBuffer.f17346a.charAt(i2 - ((a2 - partialGapBuffer.d) + i3));
            }
            int i4 = i2 - i3;
            int i5 = gapBuffer.f17329c;
            return i4 < i5 ? gapBuffer.f17328b[i4] : gapBuffer.f17328b[(i4 - i5) + gapBuffer.d];
        }
        return partialGapBuffer.f17346a.charAt(i2);
    }

    public final TextRange c() {
        if (e()) {
            return new TextRange(TextRangeKt.a(this.d, this.e));
        }
        return null;
    }

    public final int d() {
        int i2 = this.f17325b;
        int i3 = this.f17326c;
        if (i2 == i3) {
            return i3;
        }
        return -1;
    }

    public final boolean e() {
        return this.d != -1;
    }

    public final void f(int i2, int i3, String str) {
        PartialGapBuffer partialGapBuffer = this.f17324a;
        if (i2 < 0 || i2 > partialGapBuffer.a()) {
            StringBuilder t2 = d.t("start (", i2, ") offset is outside of text region ");
            t2.append(partialGapBuffer.a());
            throw new IndexOutOfBoundsException(t2.toString());
        }
        if (i3 < 0 || i3 > partialGapBuffer.a()) {
            StringBuilder t3 = d.t("end (", i3, ") offset is outside of text region ");
            t3.append(partialGapBuffer.a());
            throw new IndexOutOfBoundsException(t3.toString());
        }
        if (i2 > i3) {
            throw new IllegalArgumentException(d.k("Do not set reversed range: ", i2, " > ", i3));
        }
        partialGapBuffer.b(i2, i3, str);
        j(str.length() + i2);
        i(str.length() + i2);
        this.d = -1;
        this.e = -1;
    }

    public final void g(int i2, int i3) {
        PartialGapBuffer partialGapBuffer = this.f17324a;
        if (i2 < 0 || i2 > partialGapBuffer.a()) {
            StringBuilder t2 = d.t("start (", i2, ") offset is outside of text region ");
            t2.append(partialGapBuffer.a());
            throw new IndexOutOfBoundsException(t2.toString());
        }
        if (i3 < 0 || i3 > partialGapBuffer.a()) {
            StringBuilder t3 = d.t("end (", i3, ") offset is outside of text region ");
            t3.append(partialGapBuffer.a());
            throw new IndexOutOfBoundsException(t3.toString());
        }
        if (i2 >= i3) {
            throw new IllegalArgumentException(d.k("Do not set reversed or empty range: ", i2, " > ", i3));
        }
        this.d = i2;
        this.e = i3;
    }

    public final void h(int i2, int i3) {
        PartialGapBuffer partialGapBuffer = this.f17324a;
        if (i2 < 0 || i2 > partialGapBuffer.a()) {
            StringBuilder t2 = d.t("start (", i2, ") offset is outside of text region ");
            t2.append(partialGapBuffer.a());
            throw new IndexOutOfBoundsException(t2.toString());
        }
        if (i3 < 0 || i3 > partialGapBuffer.a()) {
            StringBuilder t3 = d.t("end (", i3, ") offset is outside of text region ");
            t3.append(partialGapBuffer.a());
            throw new IndexOutOfBoundsException(t3.toString());
        }
        if (i2 > i3) {
            throw new IllegalArgumentException(d.k("Do not set reversed range: ", i2, " > ", i3));
        }
        j(i2);
        i(i3);
    }

    public final void i(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(d.i("Cannot set selectionEnd to a negative value: ", i2).toString());
        }
        this.f17326c = i2;
    }

    public final void j(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(d.i("Cannot set selectionStart to a negative value: ", i2).toString());
        }
        this.f17325b = i2;
    }

    public final String toString() {
        return this.f17324a.toString();
    }
}
