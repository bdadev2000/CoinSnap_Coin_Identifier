package androidx.compose.ui.text.input;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;

@Immutable
/* loaded from: classes2.dex */
public final class TextFieldValue {
    public static final SaverKt$Saver$1 d;

    /* renamed from: a, reason: collision with root package name */
    public final AnnotatedString f17361a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17362b;

    /* renamed from: c, reason: collision with root package name */
    public final TextRange f17363c;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    static {
        TextFieldValue$Companion$Saver$1 textFieldValue$Companion$Saver$1 = TextFieldValue$Companion$Saver$1.f17364a;
        TextFieldValue$Companion$Saver$2 textFieldValue$Companion$Saver$2 = TextFieldValue$Companion$Saver$2.f17365a;
        SaverKt$Saver$1 saverKt$Saver$1 = SaverKt.f14531a;
        d = new SaverKt$Saver$1(textFieldValue$Companion$Saver$2, textFieldValue$Companion$Saver$1);
    }

    public TextFieldValue(String str, long j2, int i2) {
        this(new AnnotatedString((i2 & 1) != 0 ? "" : str, null, 6), (i2 & 2) != 0 ? TextRange.f17056b : j2, (TextRange) null);
    }

    public static TextFieldValue a(TextFieldValue textFieldValue, AnnotatedString annotatedString, long j2, int i2) {
        if ((i2 & 1) != 0) {
            annotatedString = textFieldValue.f17361a;
        }
        if ((i2 & 2) != 0) {
            j2 = textFieldValue.f17362b;
        }
        TextRange textRange = (i2 & 4) != 0 ? textFieldValue.f17363c : null;
        textFieldValue.getClass();
        return new TextFieldValue(annotatedString, j2, textRange);
    }

    public static TextFieldValue b(TextFieldValue textFieldValue, String str) {
        long j2 = textFieldValue.f17362b;
        TextRange textRange = textFieldValue.f17363c;
        textFieldValue.getClass();
        return new TextFieldValue(new AnnotatedString(str, null, 6), j2, textRange);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldValue)) {
            return false;
        }
        TextFieldValue textFieldValue = (TextFieldValue) obj;
        return TextRange.b(this.f17362b, textFieldValue.f17362b) && p0.a.g(this.f17363c, textFieldValue.f17363c) && p0.a.g(this.f17361a, textFieldValue.f17361a);
    }

    public final int hashCode() {
        int hashCode = this.f17361a.hashCode() * 31;
        int i2 = TextRange.f17057c;
        int d2 = d.d(this.f17362b, hashCode, 31);
        TextRange textRange = this.f17363c;
        return d2 + (textRange != null ? Long.hashCode(textRange.f17058a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f17361a) + "', selection=" + ((Object) TextRange.h(this.f17362b)) + ", composition=" + this.f17363c + ')';
    }

    public TextFieldValue(AnnotatedString annotatedString, long j2, TextRange textRange) {
        this.f17361a = annotatedString;
        this.f17362b = TextRangeKt.b(annotatedString.f16880a.length(), j2);
        this.f17363c = textRange != null ? new TextRange(TextRangeKt.b(annotatedString.f16880a.length(), textRange.f17058a)) : null;
    }
}
