package androidx.compose.foundation.text;

import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class TextFieldFocusModifier_androidKt$interceptDPadAndMoveFocus$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FocusManager f6132a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LegacyTextFieldState f6133b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldFocusModifier_androidKt$interceptDPadAndMoveFocus$1(FocusManager focusManager, LegacyTextFieldState legacyTextFieldState) {
        super(1);
        this.f6132a = focusManager;
        this.f6133b = legacyTextFieldState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        KeyEvent keyEvent = ((androidx.compose.ui.input.key.KeyEvent) obj).f15514a;
        InputDevice device = keyEvent.getDevice();
        boolean z2 = false;
        if (device != null && device.supportsSource(513) && !device.isVirtual() && KeyEventType.a(KeyEvent_androidKt.a(keyEvent), 2) && keyEvent.getSource() != 257) {
            boolean a2 = TextFieldFocusModifier_androidKt.a(19, keyEvent);
            FocusManager focusManager = this.f6132a;
            if (a2) {
                z2 = focusManager.d(5);
            } else if (TextFieldFocusModifier_androidKt.a(20, keyEvent)) {
                z2 = focusManager.d(6);
            } else if (TextFieldFocusModifier_androidKt.a(21, keyEvent)) {
                z2 = focusManager.d(3);
            } else if (TextFieldFocusModifier_androidKt.a(22, keyEvent)) {
                z2 = focusManager.d(4);
            } else if (TextFieldFocusModifier_androidKt.a(23, keyEvent)) {
                SoftwareKeyboardController softwareKeyboardController = this.f6133b.f6023c;
                if (softwareKeyboardController != null) {
                    softwareKeyboardController.show();
                }
                z2 = true;
            }
        }
        return Boolean.valueOf(z2);
    }
}
