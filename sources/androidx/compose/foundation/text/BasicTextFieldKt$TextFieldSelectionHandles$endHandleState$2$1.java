package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import kotlin.jvm.internal.r;

/* loaded from: classes3.dex */
final class BasicTextFieldKt$TextFieldSelectionHandles$endHandleState$2$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f5638a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextFieldKt$TextFieldSelectionHandles$endHandleState$2$1(TextFieldSelectionState textFieldSelectionState) {
        super(0);
        this.f5638a = textFieldSelectionState;
    }

    @Override // q0.a
    public final Object invoke() {
        return this.f5638a.r(false, false);
    }
}
