package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.internal.ChangeTracker;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;

/* loaded from: classes4.dex */
final class AllCapsTransformation implements InputTransformation {
    @Override // androidx.compose.foundation.text.input.InputTransformation
    public final void C(TextFieldBuffer textFieldBuffer) {
        ChangeTracker a2 = textFieldBuffer.a();
        for (int i2 = 0; i2 < a2.f6369a.f14144c; i2++) {
            long d = a2.d(i2);
            a2.c(i2);
            if (!TextRange.c(d)) {
                TextRangeKt.c(d, textFieldBuffer.f6295c);
                throw null;
            }
        }
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public final KeyboardOptions D() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AllCapsTransformation)) {
            return false;
        }
        ((AllCapsTransformation) obj).getClass();
        return p0.a.g(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "InputTransformation.allCaps(locale=null)";
    }
}
