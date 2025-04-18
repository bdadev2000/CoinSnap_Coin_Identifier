package androidx.compose.foundation.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.platform.SoftwareKeyboardController;

@StabilityInferred
/* loaded from: classes.dex */
public final class KeyboardActionRunner implements KeyboardActionScope {

    /* renamed from: a, reason: collision with root package name */
    public final SoftwareKeyboardController f6006a;

    /* renamed from: b, reason: collision with root package name */
    public KeyboardActions f6007b;

    /* renamed from: c, reason: collision with root package name */
    public FocusManager f6008c;

    public KeyboardActionRunner(SoftwareKeyboardController softwareKeyboardController) {
        this.f6006a = softwareKeyboardController;
    }

    public final KeyboardActions a() {
        KeyboardActions keyboardActions = this.f6007b;
        if (keyboardActions != null) {
            return keyboardActions;
        }
        p0.a.B0("keyboardActions");
        throw null;
    }
}
