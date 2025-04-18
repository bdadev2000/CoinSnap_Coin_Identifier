package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.input.PlatformTextInputService;
import b1.a2;
import q0.p;

@StabilityInferred
/* loaded from: classes.dex */
public abstract class LegacyPlatformTextInputServiceAdapter implements PlatformTextInputService {

    /* renamed from: a, reason: collision with root package name */
    public LegacyPlatformTextInputNode f6446a;

    /* loaded from: classes.dex */
    public interface LegacyPlatformTextInputNode {
        LegacyTextFieldState M1();

        LayoutCoordinates S();

        SoftwareKeyboardController getSoftwareKeyboardController();

        ViewConfiguration getViewConfiguration();

        TextFieldSelectionManager l1();

        a2 p0(p pVar);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void c() {
        SoftwareKeyboardController softwareKeyboardController;
        LegacyPlatformTextInputNode legacyPlatformTextInputNode = this.f6446a;
        if (legacyPlatformTextInputNode == null || (softwareKeyboardController = legacyPlatformTextInputNode.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.hide();
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void e() {
        SoftwareKeyboardController softwareKeyboardController;
        LegacyPlatformTextInputNode legacyPlatformTextInputNode = this.f6446a;
        if (legacyPlatformTextInputNode == null || (softwareKeyboardController = legacyPlatformTextInputNode.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.show();
    }

    public abstract void i();

    public final void j(LegacyPlatformTextInputNode legacyPlatformTextInputNode) {
        if (this.f6446a == legacyPlatformTextInputNode) {
            this.f6446a = null;
            return;
        }
        throw new IllegalStateException(("Expected textInputModifierNode to be " + legacyPlatformTextInputNode + " but was " + this.f6446a).toString());
    }
}
