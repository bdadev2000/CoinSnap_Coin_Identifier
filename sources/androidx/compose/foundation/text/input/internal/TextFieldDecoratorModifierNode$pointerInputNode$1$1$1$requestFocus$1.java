package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.focus.FocusRequesterModifierNodeKt;
import d0.b0;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$requestFocus$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6594a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextFieldDecoratorModifierNode f6595b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$requestFocus$1(TextFieldSelectionState textFieldSelectionState, TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        super(0);
        this.f6594a = textFieldSelectionState;
        this.f6595b = textFieldDecoratorModifierNode;
    }

    @Override // q0.a
    public final Object invoke() {
        if (!this.f6594a.f6717f) {
            FocusRequesterModifierNodeKt.a(this.f6595b);
        }
        return b0.f30125a;
    }
}
