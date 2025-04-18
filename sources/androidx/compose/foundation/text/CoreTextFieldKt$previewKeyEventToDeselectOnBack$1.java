package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class CoreTextFieldKt$previewKeyEventToDeselectOnBack$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LegacyTextFieldState f5959a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionManager f5960b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$previewKeyEventToDeselectOnBack$1(LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager) {
        super(1);
        this.f5959a = legacyTextFieldState;
        this.f5960b = textFieldSelectionManager;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        boolean z2;
        KeyEvent keyEvent = ((androidx.compose.ui.input.key.KeyEvent) obj).f15514a;
        if (this.f5959a.a() == HandleState.f5968b && keyEvent.getKeyCode() == 4) {
            z2 = true;
            if (KeyEventType.a(KeyEvent_androidKt.a(keyEvent), 1)) {
                this.f5960b.g(null);
                return Boolean.valueOf(z2);
            }
        }
        z2 = false;
        return Boolean.valueOf(z2);
    }
}
