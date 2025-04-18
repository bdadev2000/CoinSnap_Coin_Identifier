package androidx.compose.foundation.text.input;

import android.support.v4.media.d;
import androidx.compose.foundation.text.input.internal.PartialGapBuffer;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import x0.n;

/* loaded from: classes3.dex */
final class MaxLengthFilter implements InputTransformation {
    @Override // androidx.compose.foundation.text.input.InputTransformation
    public final void B(SemanticsConfiguration semanticsConfiguration) {
        n[] nVarArr = SemanticsPropertiesKt.f16865a;
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.H;
        n nVar = SemanticsPropertiesKt.f16865a[24];
        semanticsPropertyKey.getClass();
        semanticsConfiguration.b(semanticsPropertyKey, 0);
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public final void C(TextFieldBuffer textFieldBuffer) {
        PartialGapBuffer partialGapBuffer = textFieldBuffer.f6295c;
        if (partialGapBuffer.length() > 0) {
            int length = partialGapBuffer.length();
            TextFieldCharSequence textFieldCharSequence = textFieldBuffer.f6293a;
            String obj = textFieldCharSequence.f6297a.toString();
            int length2 = obj.length();
            if (length < 0) {
                throw new IllegalArgumentException(d.i("Expected start=0 <= end=", length).toString());
            }
            if (length2 < 0) {
                throw new IllegalArgumentException(d.i("Expected textStart=0 <= textEnd=", length2).toString());
            }
            textFieldBuffer.b(0, length, length2);
            textFieldBuffer.f6295c.a(0, length, obj, 0, length2);
            long a2 = TextRangeKt.a(0, partialGapBuffer.length());
            long j2 = textFieldCharSequence.f6298b;
            if (TextRange.a(a2, j2)) {
                textFieldBuffer.f6296f = j2;
                textFieldBuffer.a().b();
            } else {
                throw new IllegalArgumentException(("Expected " + ((Object) TextRange.h(j2)) + " to be in " + ((Object) TextRange.h(a2))).toString());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaxLengthFilter)) {
            return false;
        }
        ((MaxLengthFilter) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0);
    }

    public final String toString() {
        return "InputTransformation.maxLength(0)";
    }
}
