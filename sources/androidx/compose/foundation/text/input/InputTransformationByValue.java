package androidx.compose.foundation.text.input;

import androidx.compose.ui.text.TextRange;

/* loaded from: classes4.dex */
final class InputTransformationByValue implements InputTransformation {
    @Override // androidx.compose.foundation.text.input.InputTransformation
    public final void C(TextFieldBuffer textFieldBuffer) {
        new TextFieldCharSequence(textFieldBuffer.f6295c.toString(), textFieldBuffer.f6296f, (TextRange) null, 8);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputTransformationByValue)) {
            return false;
        }
        ((InputTransformationByValue) obj).getClass();
        return p0.a.g(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "InputTransformation.byValue(transformation=null)";
    }
}
