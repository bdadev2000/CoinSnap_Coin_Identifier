package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;

@StabilityInferred
/* loaded from: classes3.dex */
public final class DelegatingSoftwareKeyboardController implements SoftwareKeyboardController {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputService f16473a;

    public DelegatingSoftwareKeyboardController(TextInputService textInputService) {
        this.f16473a = textInputService;
    }

    @Override // androidx.compose.ui.platform.SoftwareKeyboardController
    public final void hide() {
        this.f16473a.f17366a.c();
    }

    @Override // androidx.compose.ui.platform.SoftwareKeyboardController
    public final void show() {
        TextInputService textInputService = this.f16473a;
        if (((TextInputSession) textInputService.f17367b.get()) != null) {
            textInputService.f17366a.e();
        }
    }
}
