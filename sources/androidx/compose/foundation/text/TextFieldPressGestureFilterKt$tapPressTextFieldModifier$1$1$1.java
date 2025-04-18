package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MutableState f6167a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f6168b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1(MutableState mutableState, MutableInteractionSource mutableInteractionSource) {
        super(1);
        this.f6167a = mutableState;
        this.f6168b = mutableInteractionSource;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        final MutableState mutableState = this.f6167a;
        final MutableInteractionSource mutableInteractionSource = this.f6168b;
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                MutableState mutableState2 = MutableState.this;
                PressInteraction.Press press = (PressInteraction.Press) mutableState2.getValue();
                if (press != null) {
                    PressInteraction.Cancel cancel = new PressInteraction.Cancel(press);
                    MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                    if (mutableInteractionSource2 != null) {
                        mutableInteractionSource2.b(cancel);
                    }
                    mutableState2.setValue(null);
                }
            }
        };
    }
}
