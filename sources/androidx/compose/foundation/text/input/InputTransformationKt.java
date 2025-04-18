package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.PasswordInputTransformation;

/* loaded from: classes4.dex */
public final class InputTransformationKt {
    public static final InputTransformation a(InputTransformation inputTransformation, PasswordInputTransformation passwordInputTransformation) {
        return new FilterChain(inputTransformation, passwordInputTransformation);
    }
}
