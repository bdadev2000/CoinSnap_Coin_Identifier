package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.text.TextRange;

/* loaded from: classes4.dex */
public final /* synthetic */ class f implements CancellationSignal.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6681a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6682b;

    public /* synthetic */ f(Object obj, int i2) {
        this.f6681a = i2;
        this.f6682b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        int i2 = this.f6681a;
        Object obj = this.f6682b;
        switch (i2) {
            case 0:
                TransformedTextFieldState transformedTextFieldState = (TransformedTextFieldState) obj;
                TextFieldState textFieldState = transformedTextFieldState.f6651a;
                InputTransformation inputTransformation = transformedTextFieldState.f6652b;
                TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.f6873a;
                textFieldState.f6307b.f6400b.b();
                textFieldState.f6307b.e = null;
                TextFieldState.a(textFieldState, inputTransformation, true, textFieldEditUndoBehavior);
                return;
            default:
                TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager) obj;
                if (textFieldSelectionManager != null) {
                    LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.d;
                    if (legacyTextFieldState != null) {
                        legacyTextFieldState.f(TextRange.f17056b);
                    }
                    LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.d;
                    if (legacyTextFieldState2 == null) {
                        return;
                    }
                    legacyTextFieldState2.g(TextRange.f17056b);
                    return;
                }
                return;
        }
    }
}
