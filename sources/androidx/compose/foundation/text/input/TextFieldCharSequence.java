package androidx.compose.foundation.text.input;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import d0.k;
import z0.m;

@StabilityInferred
/* loaded from: classes4.dex */
public final class TextFieldCharSequence implements CharSequence {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f6297a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6298b;

    /* renamed from: c, reason: collision with root package name */
    public final TextRange f6299c;
    public final k d;

    public TextFieldCharSequence(CharSequence charSequence, long j2, TextRange textRange, k kVar) {
        this.f6297a = charSequence instanceof TextFieldCharSequence ? ((TextFieldCharSequence) charSequence).f6297a : charSequence;
        this.f6298b = TextRangeKt.b(charSequence.length(), j2);
        this.f6299c = textRange != null ? new TextRange(TextRangeKt.b(charSequence.length(), textRange.f17058a)) : null;
        this.d = kVar != null ? new k(kVar.f30134a, new TextRange(TextRangeKt.b(charSequence.length(), ((TextRange) kVar.f30135b).f17058a))) : null;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i2) {
        return this.f6297a.charAt(i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextFieldCharSequence.class != obj.getClass()) {
            return false;
        }
        TextFieldCharSequence textFieldCharSequence = (TextFieldCharSequence) obj;
        return TextRange.b(this.f6298b, textFieldCharSequence.f6298b) && p0.a.g(this.f6299c, textFieldCharSequence.f6299c) && p0.a.g(this.d, textFieldCharSequence.d) && m.O0(this.f6297a, textFieldCharSequence.f6297a);
    }

    public final int hashCode() {
        int hashCode = this.f6297a.hashCode() * 31;
        int i2 = TextRange.f17057c;
        int d = d.d(this.f6298b, hashCode, 31);
        TextRange textRange = this.f6299c;
        int hashCode2 = (d + (textRange != null ? Long.hashCode(textRange.f17058a) : 0)) * 31;
        k kVar = this.d;
        return hashCode2 + (kVar != null ? kVar.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f6297a.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i2, int i3) {
        return this.f6297a.subSequence(i2, i3);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f6297a.toString();
    }

    public TextFieldCharSequence(String str, long j2, TextRange textRange, int i2) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? TextRange.f17056b : j2, (i2 & 4) != 0 ? null : textRange, (k) null);
    }
}
