package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.semantics.SemanticsConfiguration;

@Stable
/* loaded from: classes2.dex */
public interface InputTransformation {

    /* loaded from: classes2.dex */
    public static final class Companion implements InputTransformation {
        @Override // androidx.compose.foundation.text.input.InputTransformation
        public final void C(TextFieldBuffer textFieldBuffer) {
        }
    }

    default void B(SemanticsConfiguration semanticsConfiguration) {
    }

    void C(TextFieldBuffer textFieldBuffer);

    default KeyboardOptions D() {
        return null;
    }
}
