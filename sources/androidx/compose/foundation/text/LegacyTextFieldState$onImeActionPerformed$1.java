package androidx.compose.foundation.text;

import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.input.ImeAction;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class LegacyTextFieldState$onImeActionPerformed$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LegacyTextFieldState f6042a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyTextFieldState$onImeActionPerformed$1(LegacyTextFieldState legacyTextFieldState) {
        super(1);
        this.f6042a = legacyTextFieldState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        l lVar;
        b0 b0Var;
        SoftwareKeyboardController softwareKeyboardController;
        int i2 = ((ImeAction) obj).f17330a;
        KeyboardActionRunner keyboardActionRunner = this.f6042a.f6036r;
        keyboardActionRunner.getClass();
        if (ImeAction.a(i2, 7)) {
            lVar = keyboardActionRunner.a().f6010a;
        } else if (ImeAction.a(i2, 2)) {
            lVar = keyboardActionRunner.a().f6011b;
        } else if (ImeAction.a(i2, 6)) {
            lVar = keyboardActionRunner.a().f6012c;
        } else if (ImeAction.a(i2, 5)) {
            lVar = keyboardActionRunner.a().d;
        } else if (ImeAction.a(i2, 3)) {
            lVar = keyboardActionRunner.a().e;
        } else if (ImeAction.a(i2, 4)) {
            lVar = keyboardActionRunner.a().f6013f;
        } else {
            if (!ImeAction.a(i2, 1) && !ImeAction.a(i2, 0)) {
                throw new IllegalStateException("invalid ImeAction".toString());
            }
            lVar = null;
        }
        b0 b0Var2 = b0.f30125a;
        if (lVar != null) {
            lVar.invoke(keyboardActionRunner);
            b0Var = b0Var2;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            if (ImeAction.a(i2, 6)) {
                FocusManager focusManager = keyboardActionRunner.f6008c;
                if (focusManager == null) {
                    p0.a.B0("focusManager");
                    throw null;
                }
                focusManager.d(1);
            } else if (ImeAction.a(i2, 5)) {
                FocusManager focusManager2 = keyboardActionRunner.f6008c;
                if (focusManager2 == null) {
                    p0.a.B0("focusManager");
                    throw null;
                }
                focusManager2.d(2);
            } else if (ImeAction.a(i2, 7) && (softwareKeyboardController = keyboardActionRunner.f6006a) != null) {
                softwareKeyboardController.hide();
            }
        }
        return b0Var2;
    }
}
