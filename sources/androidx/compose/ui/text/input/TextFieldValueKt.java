package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;

/* loaded from: classes2.dex */
public final class TextFieldValueKt {
    public static final AnnotatedString a(TextFieldValue textFieldValue) {
        AnnotatedString annotatedString = textFieldValue.f17361a;
        annotatedString.getClass();
        long j2 = textFieldValue.f17362b;
        return annotatedString.subSequence(TextRange.f(j2), TextRange.e(j2));
    }

    public static final AnnotatedString b(TextFieldValue textFieldValue, int i2) {
        AnnotatedString annotatedString = textFieldValue.f17361a;
        long j2 = textFieldValue.f17362b;
        return annotatedString.subSequence(TextRange.e(j2), Math.min(TextRange.e(j2) + i2, textFieldValue.f17361a.f16880a.length()));
    }

    public static final AnnotatedString c(TextFieldValue textFieldValue, int i2) {
        AnnotatedString annotatedString = textFieldValue.f17361a;
        long j2 = textFieldValue.f17362b;
        return annotatedString.subSequence(Math.max(0, TextRange.f(j2) - i2), TextRange.f(j2));
    }
}
