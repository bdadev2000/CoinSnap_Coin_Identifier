package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.DisposableEffectResult;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class CoreTextFieldKt$CoreTextField$3$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionManager f5803a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$3$1(TextFieldSelectionManager textFieldSelectionManager) {
        super(1);
        this.f5803a = textFieldSelectionManager;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        final TextFieldSelectionManager textFieldSelectionManager = this.f5803a;
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                TextFieldSelectionManager.this.m();
            }
        };
    }
}
