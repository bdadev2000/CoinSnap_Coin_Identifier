package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.DisposableEffectResult;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
final class BasicTextFieldKt$BasicTextField$3$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f5544a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextFieldKt$BasicTextField$3$1(TextFieldSelectionState textFieldSelectionState) {
        super(1);
        this.f5544a = textFieldSelectionState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        final TextFieldSelectionState textFieldSelectionState = this.f5544a;
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                TextFieldSelectionState textFieldSelectionState2 = TextFieldSelectionState.this;
                textFieldSelectionState2.u();
                textFieldSelectionState2.f6720i = null;
                textFieldSelectionState2.f6721j = null;
                textFieldSelectionState2.f6719h = null;
            }
        };
    }
}
