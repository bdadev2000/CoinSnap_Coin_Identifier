package androidx.compose.ui.text.input;

import android.view.inputmethod.ExtractedText;
import androidx.compose.ui.text.TextRange;
import z0.m;

/* loaded from: classes3.dex */
public final class InputState_androidKt {
    public static final ExtractedText a(TextFieldValue textFieldValue) {
        ExtractedText extractedText = new ExtractedText();
        String str = textFieldValue.f17361a.f16880a;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j2 = textFieldValue.f17362b;
        extractedText.selectionStart = TextRange.f(j2);
        extractedText.selectionEnd = TextRange.e(j2);
        extractedText.flags = !m.N0(textFieldValue.f17361a.f16880a, '\n') ? 1 : 0;
        return extractedText;
    }
}
